# \ModPageAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModPageGetPagesByCourses**](ModPageAPI.md#ModPageGetPagesByCourses) | **Post** /mod_page_get_pages_by_courses | Returns a list of pages in a provided list of courses, if no list is provided all pages that the user                             can view will be returned.
[**ModPageViewPage**](ModPageAPI.md#ModPageViewPage) | **Post** /mod_page_view_page | Simulate the view.php web interface page: trigger events, completion, etc...



## ModPageGetPagesByCourses

> ModPageGetPagesByCourses200Response ModPageGetPagesByCourses(ctx).ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest).Execute()

Returns a list of pages in a provided list of courses, if no list is provided all pages that the user                             can view will be returned.



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
	modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest := *openapiclient.NewModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest() // ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModPageAPI.ModPageGetPagesByCourses(context.Background()).ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModPageAPI.ModPageGetPagesByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModPageGetPagesByCourses`: ModPageGetPagesByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModPageAPI.ModPageGetPagesByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModPageGetPagesByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  | 

### Return type

[**ModPageGetPagesByCourses200Response**](ModPageGetPagesByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModPageViewPage

> CoreCalendarDeleteSubscription200Response ModPageViewPage(ctx).ModPageViewPageRequest(modPageViewPageRequest).Execute()

Simulate the view.php web interface page: trigger events, completion, etc...



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
	modPageViewPageRequest := *openapiclient.NewModPageViewPageRequest(int32(123)) // ModPageViewPageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModPageAPI.ModPageViewPage(context.Background()).ModPageViewPageRequest(modPageViewPageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModPageAPI.ModPageViewPage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModPageViewPage`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModPageAPI.ModPageViewPage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModPageViewPageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modPageViewPageRequest** | [**ModPageViewPageRequest**](ModPageViewPageRequest.md) |  | 

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

