# \ModIomadcertificateAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModIomadcertificateGetIomadcertificatesByCourses**](ModIomadcertificateAPI.md#ModIomadcertificateGetIomadcertificatesByCourses) | **Post** /mod_iomadcertificate_get_iomadcertificates_by_courses | Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.
[**ModIomadcertificateGetIssuedIomadcertificates**](ModIomadcertificateAPI.md#ModIomadcertificateGetIssuedIomadcertificates) | **Post** /mod_iomadcertificate_get_issued_iomadcertificates | Get the list of issued iomadcertificates for the current user.
[**ModIomadcertificateIssueIomadcertificate**](ModIomadcertificateAPI.md#ModIomadcertificateIssueIomadcertificate) | **Post** /mod_iomadcertificate_issue_iomadcertificate | Create new iomadcertificate record, or return existing record for the current user.
[**ModIomadcertificateViewIomadcertificate**](ModIomadcertificateAPI.md#ModIomadcertificateViewIomadcertificate) | **Post** /mod_iomadcertificate_view_iomadcertificate | Trigger the course module viewed event and update the module completion status.



## ModIomadcertificateGetIomadcertificatesByCourses

> ModIomadcertificateGetIomadcertificatesByCourses200Response ModIomadcertificateGetIomadcertificatesByCourses(ctx).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()

Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.



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
	modChatGetChatsByCoursesRequest := *openapiclient.NewModChatGetChatsByCoursesRequest() // ModChatGetChatsByCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModIomadcertificateAPI.ModIomadcertificateGetIomadcertificatesByCourses(context.Background()).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModIomadcertificateAPI.ModIomadcertificateGetIomadcertificatesByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModIomadcertificateGetIomadcertificatesByCourses`: ModIomadcertificateGetIomadcertificatesByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModIomadcertificateAPI.ModIomadcertificateGetIomadcertificatesByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModIomadcertificateGetIomadcertificatesByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | 

### Return type

[**ModIomadcertificateGetIomadcertificatesByCourses200Response**](ModIomadcertificateGetIomadcertificatesByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModIomadcertificateGetIssuedIomadcertificates

> ModIomadcertificateGetIssuedIomadcertificates200Response ModIomadcertificateGetIssuedIomadcertificates(ctx).ModIomadcertificateGetIssuedIomadcertificatesRequest(modIomadcertificateGetIssuedIomadcertificatesRequest).Execute()

Get the list of issued iomadcertificates for the current user.



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
	modIomadcertificateGetIssuedIomadcertificatesRequest := *openapiclient.NewModIomadcertificateGetIssuedIomadcertificatesRequest(int32(123)) // ModIomadcertificateGetIssuedIomadcertificatesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModIomadcertificateAPI.ModIomadcertificateGetIssuedIomadcertificates(context.Background()).ModIomadcertificateGetIssuedIomadcertificatesRequest(modIomadcertificateGetIssuedIomadcertificatesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModIomadcertificateAPI.ModIomadcertificateGetIssuedIomadcertificates``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModIomadcertificateGetIssuedIomadcertificates`: ModIomadcertificateGetIssuedIomadcertificates200Response
	fmt.Fprintf(os.Stdout, "Response from `ModIomadcertificateAPI.ModIomadcertificateGetIssuedIomadcertificates`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModIomadcertificateGetIssuedIomadcertificatesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modIomadcertificateGetIssuedIomadcertificatesRequest** | [**ModIomadcertificateGetIssuedIomadcertificatesRequest**](ModIomadcertificateGetIssuedIomadcertificatesRequest.md) |  | 

### Return type

[**ModIomadcertificateGetIssuedIomadcertificates200Response**](ModIomadcertificateGetIssuedIomadcertificates200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModIomadcertificateIssueIomadcertificate

> ModIomadcertificateIssueIomadcertificate200Response ModIomadcertificateIssueIomadcertificate(ctx).ModIomadcertificateIssueIomadcertificateRequest(modIomadcertificateIssueIomadcertificateRequest).Execute()

Create new iomadcertificate record, or return existing record for the current user.



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
	modIomadcertificateIssueIomadcertificateRequest := *openapiclient.NewModIomadcertificateIssueIomadcertificateRequest(int32(123)) // ModIomadcertificateIssueIomadcertificateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModIomadcertificateAPI.ModIomadcertificateIssueIomadcertificate(context.Background()).ModIomadcertificateIssueIomadcertificateRequest(modIomadcertificateIssueIomadcertificateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModIomadcertificateAPI.ModIomadcertificateIssueIomadcertificate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModIomadcertificateIssueIomadcertificate`: ModIomadcertificateIssueIomadcertificate200Response
	fmt.Fprintf(os.Stdout, "Response from `ModIomadcertificateAPI.ModIomadcertificateIssueIomadcertificate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModIomadcertificateIssueIomadcertificateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modIomadcertificateIssueIomadcertificateRequest** | [**ModIomadcertificateIssueIomadcertificateRequest**](ModIomadcertificateIssueIomadcertificateRequest.md) |  | 

### Return type

[**ModIomadcertificateIssueIomadcertificate200Response**](ModIomadcertificateIssueIomadcertificate200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModIomadcertificateViewIomadcertificate

> CoreCalendarDeleteSubscription200Response ModIomadcertificateViewIomadcertificate(ctx).ModIomadcertificateIssueIomadcertificateRequest(modIomadcertificateIssueIomadcertificateRequest).Execute()

Trigger the course module viewed event and update the module completion status.



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
	modIomadcertificateIssueIomadcertificateRequest := *openapiclient.NewModIomadcertificateIssueIomadcertificateRequest(int32(123)) // ModIomadcertificateIssueIomadcertificateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModIomadcertificateAPI.ModIomadcertificateViewIomadcertificate(context.Background()).ModIomadcertificateIssueIomadcertificateRequest(modIomadcertificateIssueIomadcertificateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModIomadcertificateAPI.ModIomadcertificateViewIomadcertificate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModIomadcertificateViewIomadcertificate`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModIomadcertificateAPI.ModIomadcertificateViewIomadcertificate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModIomadcertificateViewIomadcertificateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modIomadcertificateIssueIomadcertificateRequest** | [**ModIomadcertificateIssueIomadcertificateRequest**](ModIomadcertificateIssueIomadcertificateRequest.md) |  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

