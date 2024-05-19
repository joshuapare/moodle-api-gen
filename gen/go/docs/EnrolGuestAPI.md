# \EnrolGuestAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EnrolGuestGetInstanceInfo**](EnrolGuestAPI.md#EnrolGuestGetInstanceInfo) | **Post** /enrol_guest_get_instance_info | Return guest enrolment instance information.
[**EnrolGuestValidatePassword**](EnrolGuestAPI.md#EnrolGuestValidatePassword) | **Post** /enrol_guest_validate_password | Perform password validation.



## EnrolGuestGetInstanceInfo

> EnrolGuestGetInstanceInfo200Response EnrolGuestGetInstanceInfo(ctx).EnrolGuestGetInstanceInfoRequest(enrolGuestGetInstanceInfoRequest).Execute()

Return guest enrolment instance information.



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
	enrolGuestGetInstanceInfoRequest := *openapiclient.NewEnrolGuestGetInstanceInfoRequest(int32(123)) // EnrolGuestGetInstanceInfoRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EnrolGuestAPI.EnrolGuestGetInstanceInfo(context.Background()).EnrolGuestGetInstanceInfoRequest(enrolGuestGetInstanceInfoRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EnrolGuestAPI.EnrolGuestGetInstanceInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EnrolGuestGetInstanceInfo`: EnrolGuestGetInstanceInfo200Response
	fmt.Fprintf(os.Stdout, "Response from `EnrolGuestAPI.EnrolGuestGetInstanceInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiEnrolGuestGetInstanceInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrolGuestGetInstanceInfoRequest** | [**EnrolGuestGetInstanceInfoRequest**](EnrolGuestGetInstanceInfoRequest.md) |  | 

### Return type

[**EnrolGuestGetInstanceInfo200Response**](EnrolGuestGetInstanceInfo200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## EnrolGuestValidatePassword

> EnrolGuestValidatePassword200Response EnrolGuestValidatePassword(ctx).EnrolGuestValidatePasswordRequest(enrolGuestValidatePasswordRequest).Execute()

Perform password validation.



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
	enrolGuestValidatePasswordRequest := *openapiclient.NewEnrolGuestValidatePasswordRequest(int32(123), "Password_example") // EnrolGuestValidatePasswordRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EnrolGuestAPI.EnrolGuestValidatePassword(context.Background()).EnrolGuestValidatePasswordRequest(enrolGuestValidatePasswordRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EnrolGuestAPI.EnrolGuestValidatePassword``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EnrolGuestValidatePassword`: EnrolGuestValidatePassword200Response
	fmt.Fprintf(os.Stdout, "Response from `EnrolGuestAPI.EnrolGuestValidatePassword`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiEnrolGuestValidatePasswordRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrolGuestValidatePasswordRequest** | [**EnrolGuestValidatePasswordRequest**](EnrolGuestValidatePasswordRequest.md) |  | 

### Return type

[**EnrolGuestValidatePassword200Response**](EnrolGuestValidatePassword200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

