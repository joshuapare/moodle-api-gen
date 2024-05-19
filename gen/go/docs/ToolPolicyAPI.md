# \ToolPolicyAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ToolPolicyGetPolicyVersion**](ToolPolicyAPI.md#ToolPolicyGetPolicyVersion) | **Post** /tool_policy_get_policy_version | Fetch the details of a policy version
[**ToolPolicySubmitAcceptOnBehalf**](ToolPolicyAPI.md#ToolPolicySubmitAcceptOnBehalf) | **Post** /tool_policy_submit_accept_on_behalf | Accept policies on behalf of other users



## ToolPolicyGetPolicyVersion

> ToolPolicyGetPolicyVersion200Response ToolPolicyGetPolicyVersion(ctx).ToolPolicyGetPolicyVersionRequest(toolPolicyGetPolicyVersionRequest).Execute()

Fetch the details of a policy version



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
	toolPolicyGetPolicyVersionRequest := *openapiclient.NewToolPolicyGetPolicyVersionRequest(int32(123)) // ToolPolicyGetPolicyVersionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolPolicyAPI.ToolPolicyGetPolicyVersion(context.Background()).ToolPolicyGetPolicyVersionRequest(toolPolicyGetPolicyVersionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolPolicyAPI.ToolPolicyGetPolicyVersion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolPolicyGetPolicyVersion`: ToolPolicyGetPolicyVersion200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolPolicyAPI.ToolPolicyGetPolicyVersion`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolPolicyGetPolicyVersionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolPolicyGetPolicyVersionRequest** | [**ToolPolicyGetPolicyVersionRequest**](ToolPolicyGetPolicyVersionRequest.md) |  | 

### Return type

[**ToolPolicyGetPolicyVersion200Response**](ToolPolicyGetPolicyVersion200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolPolicySubmitAcceptOnBehalf

> map[string]interface{} ToolPolicySubmitAcceptOnBehalf(ctx).ToolPolicySubmitAcceptOnBehalfRequest(toolPolicySubmitAcceptOnBehalfRequest).Execute()

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
	toolPolicySubmitAcceptOnBehalfRequest := *openapiclient.NewToolPolicySubmitAcceptOnBehalfRequest("Jsonformdata_example") // ToolPolicySubmitAcceptOnBehalfRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolPolicyAPI.ToolPolicySubmitAcceptOnBehalf(context.Background()).ToolPolicySubmitAcceptOnBehalfRequest(toolPolicySubmitAcceptOnBehalfRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolPolicyAPI.ToolPolicySubmitAcceptOnBehalf``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolPolicySubmitAcceptOnBehalf`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ToolPolicyAPI.ToolPolicySubmitAcceptOnBehalf`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolPolicySubmitAcceptOnBehalfRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolPolicySubmitAcceptOnBehalfRequest** | [**ToolPolicySubmitAcceptOnBehalfRequest**](ToolPolicySubmitAcceptOnBehalfRequest.md) |  | 

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

