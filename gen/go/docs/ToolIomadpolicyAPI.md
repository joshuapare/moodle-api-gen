# \ToolIomadpolicyAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ToolIomadpolicyGetIomadpolicyVersion**](ToolIomadpolicyAPI.md#ToolIomadpolicyGetIomadpolicyVersion) | **Post** /tool_iomadpolicy_get_iomadpolicy_version | Fetch the details of a iomadpolicy version
[**ToolIomadpolicySubmitAcceptOnBehalf**](ToolIomadpolicyAPI.md#ToolIomadpolicySubmitAcceptOnBehalf) | **Post** /tool_iomadpolicy_submit_accept_on_behalf | Accept policies on behalf of other users



## ToolIomadpolicyGetIomadpolicyVersion

> ToolIomadpolicyGetIomadpolicyVersion200Response ToolIomadpolicyGetIomadpolicyVersion(ctx).ToolIomadpolicyGetIomadpolicyVersionRequest(toolIomadpolicyGetIomadpolicyVersionRequest).Execute()

Fetch the details of a iomadpolicy version



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
	toolIomadpolicyGetIomadpolicyVersionRequest := *openapiclient.NewToolIomadpolicyGetIomadpolicyVersionRequest(int32(123)) // ToolIomadpolicyGetIomadpolicyVersionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolIomadpolicyAPI.ToolIomadpolicyGetIomadpolicyVersion(context.Background()).ToolIomadpolicyGetIomadpolicyVersionRequest(toolIomadpolicyGetIomadpolicyVersionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolIomadpolicyAPI.ToolIomadpolicyGetIomadpolicyVersion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolIomadpolicyGetIomadpolicyVersion`: ToolIomadpolicyGetIomadpolicyVersion200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolIomadpolicyAPI.ToolIomadpolicyGetIomadpolicyVersion`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolIomadpolicyGetIomadpolicyVersionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolIomadpolicyGetIomadpolicyVersionRequest** | [**ToolIomadpolicyGetIomadpolicyVersionRequest**](ToolIomadpolicyGetIomadpolicyVersionRequest.md) |  | 

### Return type

[**ToolIomadpolicyGetIomadpolicyVersion200Response**](ToolIomadpolicyGetIomadpolicyVersion200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolIomadpolicySubmitAcceptOnBehalf

> map[string]interface{} ToolIomadpolicySubmitAcceptOnBehalf(ctx).ToolIomadpolicySubmitAcceptOnBehalfRequest(toolIomadpolicySubmitAcceptOnBehalfRequest).Execute()

Accept policies on behalf of other users



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
	toolIomadpolicySubmitAcceptOnBehalfRequest := *openapiclient.NewToolIomadpolicySubmitAcceptOnBehalfRequest("Jsonformdata_example") // ToolIomadpolicySubmitAcceptOnBehalfRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolIomadpolicyAPI.ToolIomadpolicySubmitAcceptOnBehalf(context.Background()).ToolIomadpolicySubmitAcceptOnBehalfRequest(toolIomadpolicySubmitAcceptOnBehalfRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolIomadpolicyAPI.ToolIomadpolicySubmitAcceptOnBehalf``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolIomadpolicySubmitAcceptOnBehalf`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ToolIomadpolicyAPI.ToolIomadpolicySubmitAcceptOnBehalf`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolIomadpolicySubmitAcceptOnBehalfRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolIomadpolicySubmitAcceptOnBehalfRequest** | [**ToolIomadpolicySubmitAcceptOnBehalfRequest**](ToolIomadpolicySubmitAcceptOnBehalfRequest.md) |  | 

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

