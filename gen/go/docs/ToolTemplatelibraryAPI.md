# \ToolTemplatelibraryAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ToolTemplatelibraryListTemplates**](ToolTemplatelibraryAPI.md#ToolTemplatelibraryListTemplates) | **Post** /tool_templatelibrary_list_templates | List/search templates by component.
[**ToolTemplatelibraryLoadCanonicalTemplate**](ToolTemplatelibraryAPI.md#ToolTemplatelibraryLoadCanonicalTemplate) | **Post** /tool_templatelibrary_load_canonical_template | Load a canonical template by name (not the theme overidden one).



## ToolTemplatelibraryListTemplates

> map[string]interface{} ToolTemplatelibraryListTemplates(ctx).ToolTemplatelibraryListTemplatesRequest(toolTemplatelibraryListTemplatesRequest).Execute()

List/search templates by component.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	toolTemplatelibraryListTemplatesRequest := *openapiclient.NewToolTemplatelibraryListTemplatesRequest() // ToolTemplatelibraryListTemplatesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolTemplatelibraryAPI.ToolTemplatelibraryListTemplates(context.Background()).ToolTemplatelibraryListTemplatesRequest(toolTemplatelibraryListTemplatesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolTemplatelibraryAPI.ToolTemplatelibraryListTemplates``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolTemplatelibraryListTemplates`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ToolTemplatelibraryAPI.ToolTemplatelibraryListTemplates`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolTemplatelibraryListTemplatesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolTemplatelibraryListTemplatesRequest** | [**ToolTemplatelibraryListTemplatesRequest**](ToolTemplatelibraryListTemplatesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolTemplatelibraryLoadCanonicalTemplate

> map[string]interface{} ToolTemplatelibraryLoadCanonicalTemplate(ctx).ToolTemplatelibraryLoadCanonicalTemplateRequest(toolTemplatelibraryLoadCanonicalTemplateRequest).Execute()

Load a canonical template by name (not the theme overidden one).



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	toolTemplatelibraryLoadCanonicalTemplateRequest := *openapiclient.NewToolTemplatelibraryLoadCanonicalTemplateRequest("Component_example", "Template_example") // ToolTemplatelibraryLoadCanonicalTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolTemplatelibraryAPI.ToolTemplatelibraryLoadCanonicalTemplate(context.Background()).ToolTemplatelibraryLoadCanonicalTemplateRequest(toolTemplatelibraryLoadCanonicalTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolTemplatelibraryAPI.ToolTemplatelibraryLoadCanonicalTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolTemplatelibraryLoadCanonicalTemplate`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ToolTemplatelibraryAPI.ToolTemplatelibraryLoadCanonicalTemplate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolTemplatelibraryLoadCanonicalTemplateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolTemplatelibraryLoadCanonicalTemplateRequest** | [**ToolTemplatelibraryLoadCanonicalTemplateRequest**](ToolTemplatelibraryLoadCanonicalTemplateRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

