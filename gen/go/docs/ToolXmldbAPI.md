# \ToolXmldbAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ToolXmldbInvokeMoveAction**](ToolXmldbAPI.md#ToolXmldbInvokeMoveAction) | **Post** /tool_xmldb_invoke_move_action | moves element up/down



## ToolXmldbInvokeMoveAction

> map[string]interface{} ToolXmldbInvokeMoveAction(ctx).ToolXmldbInvokeMoveActionRequest(toolXmldbInvokeMoveActionRequest).Execute()

moves element up/down



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
	toolXmldbInvokeMoveActionRequest := *openapiclient.NewToolXmldbInvokeMoveActionRequest("Action_example", "Dir_example", int32(123), "Table_example") // ToolXmldbInvokeMoveActionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolXmldbAPI.ToolXmldbInvokeMoveAction(context.Background()).ToolXmldbInvokeMoveActionRequest(toolXmldbInvokeMoveActionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolXmldbAPI.ToolXmldbInvokeMoveAction``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolXmldbInvokeMoveAction`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ToolXmldbAPI.ToolXmldbInvokeMoveAction`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolXmldbInvokeMoveActionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolXmldbInvokeMoveActionRequest** | [**ToolXmldbInvokeMoveActionRequest**](ToolXmldbInvokeMoveActionRequest.md) |  | 

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

