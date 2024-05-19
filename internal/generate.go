package internal

import (
	"fmt"
	"log"
	"net/http"
	"os"
	"sort"
	"time"

	"github.com/k0kubun/go-ansi"
	"github.com/schollz/progressbar/v3"
	"github.com/swaggest/openapi-go/openapi3"
)

type OpenApiGeneratorOptions struct {
	MoodleInstallation *MoodleInstallation
	WebservicesPath    string
	OutputPath         string
}

var moduleStats = map[string]int{}

func incrementModuleStat(module string) {
	if _, ok := moduleStats[module]; !ok {
		moduleStats[module] = 0
	}
	moduleStats[module]++
}

func printModuleStatsTable() {
	// Collect module names
	modules := make([]string, 0, len(moduleStats))
	for module := range moduleStats {
		modules = append(modules, module)
	}

	// Sort module names
	sort.Strings(modules)

	// Print sorted module statistics
	for _, module := range modules {
		fmt.Printf("%s: %d\n", module, moduleStats[module])
	}
}

// Run generates an OpenAPI spec from the given options.
func RunGenerate(opts OpenApiGeneratorOptions) error {
	start := time.Now()

	var methods Methods
	var err error

	PrettyPrintMoodleInstallation(opts.MoodleInstallation)

	if opts.WebservicesPath != "" {
		methods, err = LoadMethods(opts.WebservicesPath)
	} else {
		if scriptErr := InstallCliScript(opts.MoodleInstallation.Path); scriptErr != nil {
			return scriptErr
		}

		// run the script to generate the methods
		methods, err = LoadMethodsFromExec(opts.MoodleInstallation.Path)
	}

	if err != nil {
		return fmt.Errorf("error loading methods: %v", err)
	}

	openapiSpec, err := buildOpenAPISpec(methods, opts.MoodleInstallation)
	if err != nil {
		return fmt.Errorf("error building OpenAPI spec: %v", err)
	}

	err = saveOpenAPISpec(openapiSpec, opts.OutputPath)
	if err != nil {
		return fmt.Errorf("error saving OpenAPI spec: %v", err)
	}

	end := time.Now()
	elapsed := end.Sub(start)

	fmt.Printf("\n\nSuccessfully generated OpenAPI spec in %v\n", elapsed)
	fmt.Printf("Generated %d services for the following components:\n", len(methods))
	printModuleStatsTable()
	fmt.Println("\nTo generate clients, use the OpenAPI generator of your choice.")

	return nil
}

// buildOpenAPISpec builds an OpenAPI3 spec from the parsed methods
func buildOpenAPISpec(methods Methods, moodle *MoodleInstallation) (*openapi3.Spec, error) {
	errorSchemaType := openapi3.SchemaTypeObject
	errorPropSchemaType := openapi3.SchemaTypeString

	errorSchema := openapi3.Schema{
		Type: &errorSchemaType,
		Properties: map[string]openapi3.SchemaOrRef{
			"exception": {
				Schema: &openapi3.Schema{
					Type:        &errorPropSchemaType,
					Description: OptionalString("Type of the exception"),
				},
			},
			"errorcode": {
				Schema: &openapi3.Schema{
					Type:        &errorPropSchemaType,
					Description: OptionalString("Error code"),
				},
			},
			"message": {
				Schema: &openapi3.Schema{
					Type:        &errorPropSchemaType,
					Description: OptionalString("Error message"),
				},
			},
			"debuginfo": {
				Schema: &openapi3.Schema{
					Type:        &errorPropSchemaType,
					Description: OptionalString("Debug information"),
				},
			},
		},
	}

	reflector := openapi3.Reflector{}
	reflector.Spec = &openapi3.Spec{
		Openapi: "3.1.0",
		Servers: []openapi3.Server{
			{
				URL:         "{scheme}://{host}/webservice/rest/server.php",
				Description: OptionalString("Custom Moodle server URL"),
				Variables: map[string]openapi3.ServerVariable{
					"scheme": {
						Enum:    []string{"http", "https"},
						Default: "https",
					},
					"host": {
						Default:     "localhost",
						Description: OptionalString("The hostname of the Moodle server"),
					},
				},
			},
		},
		Components: &openapi3.Components{
			Schemas: &openapi3.ComponentsSchemas{
				MapOfSchemaOrRefValues: map[string]openapi3.SchemaOrRef{
					"ErrorResponse": {
						Schema: &errorSchema,
					},
				},
			},
			SecuritySchemes: &openapi3.ComponentsSecuritySchemes{
				MapOfSecuritySchemeOrRefValues: map[string]openapi3.SecuritySchemeOrRef{
					"apiKey": {
						SecurityScheme: &openapi3.SecurityScheme{
							APIKeySecurityScheme: &openapi3.APIKeySecurityScheme{
								Name: "Authorization",
								In:   "header",
								Description: OptionalString(
									"Webservice token retrieved from site administration",
								),
							},
						},
					},
				},
			},
		},
		Security: []map[string][]string{
			{
				"apiKey": []string{},
			},
		},
	}

	reflector.Spec.Info.
		WithTitle("Moodle Webservice API").
		WithVersion(moodle.Release).
		WithDescription("Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.").
		WithContact(openapi3.Contact{
			Name: OptionalString("Joshua Pare"),
			URL:  OptionalString("https://www.joshuapare.com"),
		})

	bar := progressbar.NewOptions(len(methods),
		progressbar.OptionSetWriter(ansi.NewAnsiStdout()),
		progressbar.OptionEnableColorCodes(true),
		progressbar.OptionSetDescription("Generating services..."),
		progressbar.OptionShowDescriptionAtLineEnd(),
		progressbar.OptionShowCount(),
		progressbar.OptionSetTheme(progressbar.Theme{
			Saucer:        "[green]=[reset]",
			SaucerHead:    "[green]>[reset]",
			SaucerPadding: " ",
			BarStart:      "[",
			BarEnd:        "]",
		}),
	)

	for name, method := range methods {
		path := "/" + name

		if err := bar.Add(1); err != nil {
			return nil, err
		}

		respDesc := method.ReturnsDesc.Desc
		if respDesc == "" {
			respDesc = "Successful response"
		}

		incrementModuleStat(method.Component)

		op := openapi3.Operation{
			ID:          &name,
			Tags:        []string{method.Component},
			Summary:     &method.Description,
			Description: &method.Description,
			Security: []map[string][]string{
				{
					"apiKey": []string{},
				},
			},
			Responses: openapi3.Responses{
				MapOfResponseOrRefValues: map[string]openapi3.ResponseOrRef{
					"200": {
						Response: &openapi3.Response{
							Description: respDesc,
							Content: map[string]openapi3.MediaType{
								"application/json": {
									Schema: &openapi3.SchemaOrRef{
										Schema: parseDynamicContentToSchema(method.ReturnsDesc),
									},
								},
							},
						},
					},
					"400": {
						Response: &openapi3.Response{
							Description: "Invalid parameter value detected",
							Content: map[string]openapi3.MediaType{
								"application/json": {
									Schema: &openapi3.SchemaOrRef{
										SchemaReference: &openapi3.SchemaReference{
											Ref: "#/components/schemas/ErrorResponse",
										},
									},
								},
							},
						},
					},
				},
			},
		}

		if len(method.ParametersDesc.Keys) > 0 {
			op.RequestBody = &openapi3.RequestBodyOrRef{
				RequestBody: &openapi3.RequestBody{
					Description: OptionalString(method.ParametersDesc.Desc),
					Required:    OptionalBool(method.ParametersDesc.Required == 1),
					Content: map[string]openapi3.MediaType{
						"application/json": {
							Schema: &openapi3.SchemaOrRef{
								Schema: parseDynamicContentToSchema(method.ParametersDesc),
							},
						},
					},
				},
			}
		}

		// Add operation to the spec
		handleError(reflector.Spec.AddOperation(http.MethodPost, path, op))
	}

	return reflector.Spec, nil
}

// handleError handles errors by logging them
func handleError(err error) {
	if err != nil {
		log.Fatal(err)
	}
}

// saveOpenAPISpec saves the OpenAPI spec to a file
func saveOpenAPISpec(spec *openapi3.Spec, filePath string) error {
	data, err := spec.MarshalYAML()
	if err != nil {
		return err
	}

	err = os.WriteFile(filePath, data, 0644)
	if err != nil {
		return err
	}

	return nil
}

func parseSchemaType(vartype string) openapi3.SchemaType {
	switch vartype {
	case "object":
		return openapi3.SchemaTypeObject
	case "":
		return openapi3.SchemaTypeObject
	case "array":
		return openapi3.SchemaTypeArray
	case "string":
		return openapi3.SchemaTypeString
	case "int":
		return openapi3.SchemaTypeInteger
	case "integer":
		return openapi3.SchemaTypeInteger
	case "bool":
		return openapi3.SchemaTypeBoolean
	case "boolean":
		return openapi3.SchemaTypeBoolean
	case "raw":
		return openapi3.SchemaTypeString
	case "alphanum":
		return openapi3.SchemaTypeString
	case "float":
		return openapi3.SchemaTypeNumber
	case "number":
		return openapi3.SchemaTypeNumber
	case "alphanumext":
		return openapi3.SchemaTypeString
	case "notags":
		return openapi3.SchemaTypeString
	default:
		return openapi3.SchemaTypeString
	}
}

// parseDynamicContentToSchema parses the dynamic content into an OpenAPI schema
func parseDynamicContentToSchema(desc DynamicContent) *openapi3.Schema {
	schematype := openapi3.SchemaTypeObject
	required := make([]string, 0)

	schema := &openapi3.Schema{
		Type:       &schematype,
		Properties: make(map[string]openapi3.SchemaOrRef),
	}

	for key, value := range desc.Keys {
		if value.Required == 1 {
			required = append(required, key)
		}

		if value.Content != nil {
			// it's an array
			itemSchema := parseDynamicContentToSchema(*value.Content)
			arrayType := openapi3.SchemaTypeArray
			itemType := parseSchemaType(value.Type)
			schema.Properties[key] = openapi3.SchemaOrRef{
				Schema: &openapi3.Schema{
					Type: &arrayType,
					Items: &openapi3.SchemaOrRef{
						Schema: &openapi3.Schema{
							Type:        &itemType,
							Properties:  itemSchema.Properties,
							Description: OptionalString(value.Content.Desc),
							Default:     &value.Content.Default,
							Nullable:    &value.Content.AllowNull,
						},
					},
				},
			}
		} else if value.Keys != nil {
			// it's an object
			schema.Properties[key] = openapi3.SchemaOrRef{
				Schema: parseDynamicContentToSchema(DynamicContent{Keys: value.Keys}),
			}
		} else {
			stype := parseSchemaType(value.Type)

			propSchema := &openapi3.Schema{
				Description: OptionalString(value.Desc),
				Type:        &stype,
				Default:     &value.Default,
				Nullable:    &value.AllowNull,
			}
			schema.Properties[key] = openapi3.SchemaOrRef{
				Schema: propSchema,
			}
		}
	}

	schema.Required = required
	return schema
}
