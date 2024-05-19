# \ToolAnalyticsAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ToolAnalyticsPotentialContexts**](ToolAnalyticsAPI.md#ToolAnalyticsPotentialContexts) | **Post** /tool_analytics_potential_contexts | Retrieve the list of potential contexts for a model.



## ToolAnalyticsPotentialContexts

> map[string]interface{} ToolAnalyticsPotentialContexts(ctx).ToolAnalyticsPotentialContextsRequest(toolAnalyticsPotentialContextsRequest).Execute()

Retrieve the list of potential contexts for a model.



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
	toolAnalyticsPotentialContextsRequest := *openapiclient.NewToolAnalyticsPotentialContextsRequest() // ToolAnalyticsPotentialContextsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolAnalyticsAPI.ToolAnalyticsPotentialContexts(context.Background()).ToolAnalyticsPotentialContextsRequest(toolAnalyticsPotentialContextsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolAnalyticsAPI.ToolAnalyticsPotentialContexts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolAnalyticsPotentialContexts`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ToolAnalyticsAPI.ToolAnalyticsPotentialContexts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolAnalyticsPotentialContextsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolAnalyticsPotentialContextsRequest** | [**ToolAnalyticsPotentialContextsRequest**](ToolAnalyticsPotentialContextsRequest.md) |  | 

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

