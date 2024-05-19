# \ToolBehatAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ToolBehatGetEntityGenerator**](ToolBehatAPI.md#ToolBehatGetEntityGenerator) | **Post** /tool_behat_get_entity_generator | Get the generator details for an entity



## ToolBehatGetEntityGenerator

> ToolBehatGetEntityGenerator200Response ToolBehatGetEntityGenerator(ctx).ToolBehatGetEntityGeneratorRequest(toolBehatGetEntityGeneratorRequest).Execute()

Get the generator details for an entity



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
	toolBehatGetEntityGeneratorRequest := *openapiclient.NewToolBehatGetEntityGeneratorRequest("Entitytype_example") // ToolBehatGetEntityGeneratorRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolBehatAPI.ToolBehatGetEntityGenerator(context.Background()).ToolBehatGetEntityGeneratorRequest(toolBehatGetEntityGeneratorRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolBehatAPI.ToolBehatGetEntityGenerator``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolBehatGetEntityGenerator`: ToolBehatGetEntityGenerator200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolBehatAPI.ToolBehatGetEntityGenerator`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolBehatGetEntityGeneratorRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolBehatGetEntityGeneratorRequest** | [**ToolBehatGetEntityGeneratorRequest**](ToolBehatGetEntityGeneratorRequest.md) |  | 

### Return type

[**ToolBehatGetEntityGenerator200Response**](ToolBehatGetEntityGenerator200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

