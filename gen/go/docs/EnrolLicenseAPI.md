# \EnrolLicenseAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EnrolLicenseEnrolUser**](EnrolLicenseAPI.md#EnrolLicenseEnrolUser) | **Post** /enrol_license_enrol_user | License enrol the current user in the given course.
[**EnrolLicenseGetInstanceInfo**](EnrolLicenseAPI.md#EnrolLicenseGetInstanceInfo) | **Post** /enrol_license_get_instance_info | License enrolment instance information.



## EnrolLicenseEnrolUser

> EnrolLicenseEnrolUser200Response EnrolLicenseEnrolUser(ctx).EnrolLicenseEnrolUserRequest(enrolLicenseEnrolUserRequest).Execute()

License enrol the current user in the given course.



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
	enrolLicenseEnrolUserRequest := *openapiclient.NewEnrolLicenseEnrolUserRequest(int32(123)) // EnrolLicenseEnrolUserRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EnrolLicenseAPI.EnrolLicenseEnrolUser(context.Background()).EnrolLicenseEnrolUserRequest(enrolLicenseEnrolUserRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EnrolLicenseAPI.EnrolLicenseEnrolUser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EnrolLicenseEnrolUser`: EnrolLicenseEnrolUser200Response
	fmt.Fprintf(os.Stdout, "Response from `EnrolLicenseAPI.EnrolLicenseEnrolUser`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiEnrolLicenseEnrolUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrolLicenseEnrolUserRequest** | [**EnrolLicenseEnrolUserRequest**](EnrolLicenseEnrolUserRequest.md) |  | 

### Return type

[**EnrolLicenseEnrolUser200Response**](EnrolLicenseEnrolUser200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## EnrolLicenseGetInstanceInfo

> EnrolLicenseGetInstanceInfo200Response EnrolLicenseGetInstanceInfo(ctx).EnrolLicenseGetInstanceInfoRequest(enrolLicenseGetInstanceInfoRequest).Execute()

License enrolment instance information.



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
	enrolLicenseGetInstanceInfoRequest := *openapiclient.NewEnrolLicenseGetInstanceInfoRequest(int32(123)) // EnrolLicenseGetInstanceInfoRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EnrolLicenseAPI.EnrolLicenseGetInstanceInfo(context.Background()).EnrolLicenseGetInstanceInfoRequest(enrolLicenseGetInstanceInfoRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EnrolLicenseAPI.EnrolLicenseGetInstanceInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EnrolLicenseGetInstanceInfo`: EnrolLicenseGetInstanceInfo200Response
	fmt.Fprintf(os.Stdout, "Response from `EnrolLicenseAPI.EnrolLicenseGetInstanceInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiEnrolLicenseGetInstanceInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrolLicenseGetInstanceInfoRequest** | [**EnrolLicenseGetInstanceInfoRequest**](EnrolLicenseGetInstanceInfoRequest.md) |  | 

### Return type

[**EnrolLicenseGetInstanceInfo200Response**](EnrolLicenseGetInstanceInfo200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

