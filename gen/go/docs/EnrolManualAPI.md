# \EnrolManualAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EnrolManualEnrolUsers**](EnrolManualAPI.md#EnrolManualEnrolUsers) | **Post** /enrol_manual_enrol_users | Manual enrol users
[**EnrolManualUnenrolUsers**](EnrolManualAPI.md#EnrolManualUnenrolUsers) | **Post** /enrol_manual_unenrol_users | Manual unenrol users



## EnrolManualEnrolUsers

> map[string]interface{} EnrolManualEnrolUsers(ctx).EnrolManualEnrolUsersRequest(enrolManualEnrolUsersRequest).Execute()

Manual enrol users



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
	enrolManualEnrolUsersRequest := *openapiclient.NewEnrolManualEnrolUsersRequest([]openapiclient.EnrolManualEnrolUsersRequestEnrolmentsInner{*openapiclient.NewEnrolManualEnrolUsersRequestEnrolmentsInner()}) // EnrolManualEnrolUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EnrolManualAPI.EnrolManualEnrolUsers(context.Background()).EnrolManualEnrolUsersRequest(enrolManualEnrolUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EnrolManualAPI.EnrolManualEnrolUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EnrolManualEnrolUsers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `EnrolManualAPI.EnrolManualEnrolUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiEnrolManualEnrolUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrolManualEnrolUsersRequest** | [**EnrolManualEnrolUsersRequest**](EnrolManualEnrolUsersRequest.md) |  | 

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


## EnrolManualUnenrolUsers

> map[string]interface{} EnrolManualUnenrolUsers(ctx).EnrolManualUnenrolUsersRequest(enrolManualUnenrolUsersRequest).Execute()

Manual unenrol users



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
	enrolManualUnenrolUsersRequest := *openapiclient.NewEnrolManualUnenrolUsersRequest([]openapiclient.EnrolManualUnenrolUsersRequestEnrolmentsInner{*openapiclient.NewEnrolManualUnenrolUsersRequestEnrolmentsInner()}) // EnrolManualUnenrolUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EnrolManualAPI.EnrolManualUnenrolUsers(context.Background()).EnrolManualUnenrolUsersRequest(enrolManualUnenrolUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EnrolManualAPI.EnrolManualUnenrolUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EnrolManualUnenrolUsers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `EnrolManualAPI.EnrolManualUnenrolUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiEnrolManualUnenrolUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrolManualUnenrolUsersRequest** | [**EnrolManualUnenrolUsersRequest**](EnrolManualUnenrolUsersRequest.md) |  | 

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

