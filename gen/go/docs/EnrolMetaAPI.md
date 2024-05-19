# \EnrolMetaAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EnrolMetaAddInstances**](EnrolMetaAPI.md#EnrolMetaAddInstances) | **Post** /enrol_meta_add_instances | Add meta enrolment instances
[**EnrolMetaDeleteInstances**](EnrolMetaAPI.md#EnrolMetaDeleteInstances) | **Post** /enrol_meta_delete_instances | Delete meta enrolment instances



## EnrolMetaAddInstances

> map[string]interface{} EnrolMetaAddInstances(ctx).EnrolMetaAddInstancesRequest(enrolMetaAddInstancesRequest).Execute()

Add meta enrolment instances



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
	enrolMetaAddInstancesRequest := *openapiclient.NewEnrolMetaAddInstancesRequest() // EnrolMetaAddInstancesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EnrolMetaAPI.EnrolMetaAddInstances(context.Background()).EnrolMetaAddInstancesRequest(enrolMetaAddInstancesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EnrolMetaAPI.EnrolMetaAddInstances``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EnrolMetaAddInstances`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `EnrolMetaAPI.EnrolMetaAddInstances`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiEnrolMetaAddInstancesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrolMetaAddInstancesRequest** | [**EnrolMetaAddInstancesRequest**](EnrolMetaAddInstancesRequest.md) |  | 

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


## EnrolMetaDeleteInstances

> map[string]interface{} EnrolMetaDeleteInstances(ctx).EnrolMetaDeleteInstancesRequest(enrolMetaDeleteInstancesRequest).Execute()

Delete meta enrolment instances



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
	enrolMetaDeleteInstancesRequest := *openapiclient.NewEnrolMetaDeleteInstancesRequest() // EnrolMetaDeleteInstancesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EnrolMetaAPI.EnrolMetaDeleteInstances(context.Background()).EnrolMetaDeleteInstancesRequest(enrolMetaDeleteInstancesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EnrolMetaAPI.EnrolMetaDeleteInstances``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EnrolMetaDeleteInstances`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `EnrolMetaAPI.EnrolMetaDeleteInstances`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiEnrolMetaDeleteInstancesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrolMetaDeleteInstancesRequest** | [**EnrolMetaDeleteInstancesRequest**](EnrolMetaDeleteInstancesRequest.md) |  | 

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

