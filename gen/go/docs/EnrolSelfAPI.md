# \EnrolSelfAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EnrolSelfEnrolUser**](EnrolSelfAPI.md#EnrolSelfEnrolUser) | **Post** /enrol_self_enrol_user | Self enrol the current user in the given course.
[**EnrolSelfGetInstanceInfo**](EnrolSelfAPI.md#EnrolSelfGetInstanceInfo) | **Post** /enrol_self_get_instance_info | self enrolment instance information.



## EnrolSelfEnrolUser

> EnrolSelfEnrolUser200Response EnrolSelfEnrolUser(ctx).EnrolSelfEnrolUserRequest(enrolSelfEnrolUserRequest).Execute()

Self enrol the current user in the given course.



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
	enrolSelfEnrolUserRequest := *openapiclient.NewEnrolSelfEnrolUserRequest(int32(123)) // EnrolSelfEnrolUserRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EnrolSelfAPI.EnrolSelfEnrolUser(context.Background()).EnrolSelfEnrolUserRequest(enrolSelfEnrolUserRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EnrolSelfAPI.EnrolSelfEnrolUser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EnrolSelfEnrolUser`: EnrolSelfEnrolUser200Response
	fmt.Fprintf(os.Stdout, "Response from `EnrolSelfAPI.EnrolSelfEnrolUser`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiEnrolSelfEnrolUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrolSelfEnrolUserRequest** | [**EnrolSelfEnrolUserRequest**](EnrolSelfEnrolUserRequest.md) |  | 

### Return type

[**EnrolSelfEnrolUser200Response**](EnrolSelfEnrolUser200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## EnrolSelfGetInstanceInfo

> EnrolSelfGetInstanceInfo200Response EnrolSelfGetInstanceInfo(ctx).EnrolSelfGetInstanceInfoRequest(enrolSelfGetInstanceInfoRequest).Execute()

self enrolment instance information.



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
	enrolSelfGetInstanceInfoRequest := *openapiclient.NewEnrolSelfGetInstanceInfoRequest(int32(123)) // EnrolSelfGetInstanceInfoRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EnrolSelfAPI.EnrolSelfGetInstanceInfo(context.Background()).EnrolSelfGetInstanceInfoRequest(enrolSelfGetInstanceInfoRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EnrolSelfAPI.EnrolSelfGetInstanceInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EnrolSelfGetInstanceInfo`: EnrolSelfGetInstanceInfo200Response
	fmt.Fprintf(os.Stdout, "Response from `EnrolSelfAPI.EnrolSelfGetInstanceInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiEnrolSelfGetInstanceInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrolSelfGetInstanceInfoRequest** | [**EnrolSelfGetInstanceInfoRequest**](EnrolSelfGetInstanceInfoRequest.md) |  | 

### Return type

[**EnrolSelfGetInstanceInfo200Response**](EnrolSelfGetInstanceInfo200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

