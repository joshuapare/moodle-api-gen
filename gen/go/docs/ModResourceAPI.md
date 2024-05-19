# \ModResourceAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModResourceGetResourcesByCourses**](ModResourceAPI.md#ModResourceGetResourcesByCourses) | **Post** /mod_resource_get_resources_by_courses | Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
[**ModResourceViewResource**](ModResourceAPI.md#ModResourceViewResource) | **Post** /mod_resource_view_resource | Simulate the view.php web interface resource: trigger events, completion, etc...



## ModResourceGetResourcesByCourses

> ModResourceGetResourcesByCourses200Response ModResourceGetResourcesByCourses(ctx).ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest).Execute()

Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.



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
	resp, r, err := apiClient.ModResourceAPI.ModResourceGetResourcesByCourses(context.Background()).ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModResourceAPI.ModResourceGetResourcesByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModResourceGetResourcesByCourses`: ModResourceGetResourcesByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModResourceAPI.ModResourceGetResourcesByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModResourceGetResourcesByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  | 

### Return type

[**ModResourceGetResourcesByCourses200Response**](ModResourceGetResourcesByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModResourceViewResource

> CoreCalendarDeleteSubscription200Response ModResourceViewResource(ctx).ModResourceViewResourceRequest(modResourceViewResourceRequest).Execute()

Simulate the view.php web interface resource: trigger events, completion, etc...



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
	modResourceViewResourceRequest := *openapiclient.NewModResourceViewResourceRequest(int32(123)) // ModResourceViewResourceRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModResourceAPI.ModResourceViewResource(context.Background()).ModResourceViewResourceRequest(modResourceViewResourceRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModResourceAPI.ModResourceViewResource``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModResourceViewResource`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModResourceAPI.ModResourceViewResource`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModResourceViewResourceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modResourceViewResourceRequest** | [**ModResourceViewResourceRequest**](ModResourceViewResourceRequest.md) |  | 

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

