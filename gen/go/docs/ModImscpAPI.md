# \ModImscpAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModImscpGetImscpsByCourses**](ModImscpAPI.md#ModImscpGetImscpsByCourses) | **Post** /mod_imscp_get_imscps_by_courses | Returns a list of IMSCP instances in a provided set of courses,                             if no courses are provided then all the IMSCP instances the user has access to will be returned.
[**ModImscpViewImscp**](ModImscpAPI.md#ModImscpViewImscp) | **Post** /mod_imscp_view_imscp | Simulate the view.php web interface imscp: trigger events, completion, etc...



## ModImscpGetImscpsByCourses

> ModImscpGetImscpsByCourses200Response ModImscpGetImscpsByCourses(ctx).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()

Returns a list of IMSCP instances in a provided set of courses,                             if no courses are provided then all the IMSCP instances the user has access to will be returned.



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
	resp, r, err := apiClient.ModImscpAPI.ModImscpGetImscpsByCourses(context.Background()).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModImscpAPI.ModImscpGetImscpsByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModImscpGetImscpsByCourses`: ModImscpGetImscpsByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModImscpAPI.ModImscpGetImscpsByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModImscpGetImscpsByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | 

### Return type

[**ModImscpGetImscpsByCourses200Response**](ModImscpGetImscpsByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModImscpViewImscp

> CoreCalendarDeleteSubscription200Response ModImscpViewImscp(ctx).ModImscpViewImscpRequest(modImscpViewImscpRequest).Execute()

Simulate the view.php web interface imscp: trigger events, completion, etc...



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
	modImscpViewImscpRequest := *openapiclient.NewModImscpViewImscpRequest(int32(123)) // ModImscpViewImscpRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModImscpAPI.ModImscpViewImscp(context.Background()).ModImscpViewImscpRequest(modImscpViewImscpRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModImscpAPI.ModImscpViewImscp``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModImscpViewImscp`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModImscpAPI.ModImscpViewImscp`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModImscpViewImscpRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modImscpViewImscpRequest** | [**ModImscpViewImscpRequest**](ModImscpViewImscpRequest.md) |  | 

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

