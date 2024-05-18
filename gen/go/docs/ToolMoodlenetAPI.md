# \ToolMoodlenetAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ToolMoodlenetSearchCourses**](ToolMoodlenetAPI.md#ToolMoodlenetSearchCourses) | **Post** /tool_moodlenet_search_courses | For some given input search for a course that matches
[**ToolMoodlenetVerifyWebfinger**](ToolMoodlenetAPI.md#ToolMoodlenetVerifyWebfinger) | **Post** /tool_moodlenet_verify_webfinger | Verify if the passed information resolves into a WebFinger profile URL



## ToolMoodlenetSearchCourses

> ToolMoodlenetSearchCourses200Response ToolMoodlenetSearchCourses(ctx).ToolMoodlenetSearchCoursesRequest(toolMoodlenetSearchCoursesRequest).Execute()

For some given input search for a course that matches



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
	toolMoodlenetSearchCoursesRequest := *openapiclient.NewToolMoodlenetSearchCoursesRequest("Searchvalue_example") // ToolMoodlenetSearchCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolMoodlenetAPI.ToolMoodlenetSearchCourses(context.Background()).ToolMoodlenetSearchCoursesRequest(toolMoodlenetSearchCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolMoodlenetAPI.ToolMoodlenetSearchCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolMoodlenetSearchCourses`: ToolMoodlenetSearchCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolMoodlenetAPI.ToolMoodlenetSearchCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolMoodlenetSearchCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolMoodlenetSearchCoursesRequest** | [**ToolMoodlenetSearchCoursesRequest**](ToolMoodlenetSearchCoursesRequest.md) |  | 

### Return type

[**ToolMoodlenetSearchCourses200Response**](ToolMoodlenetSearchCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolMoodlenetVerifyWebfinger

> ToolMoodlenetVerifyWebfinger200Response ToolMoodlenetVerifyWebfinger(ctx).ToolMoodlenetVerifyWebfingerRequest(toolMoodlenetVerifyWebfingerRequest).Execute()

Verify if the passed information resolves into a WebFinger profile URL



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
	toolMoodlenetVerifyWebfingerRequest := *openapiclient.NewToolMoodlenetVerifyWebfingerRequest(int32(123), "Profileurl_example", int32(123)) // ToolMoodlenetVerifyWebfingerRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolMoodlenetAPI.ToolMoodlenetVerifyWebfinger(context.Background()).ToolMoodlenetVerifyWebfingerRequest(toolMoodlenetVerifyWebfingerRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolMoodlenetAPI.ToolMoodlenetVerifyWebfinger``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolMoodlenetVerifyWebfinger`: ToolMoodlenetVerifyWebfinger200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolMoodlenetAPI.ToolMoodlenetVerifyWebfinger`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolMoodlenetVerifyWebfingerRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolMoodlenetVerifyWebfingerRequest** | [**ToolMoodlenetVerifyWebfingerRequest**](ToolMoodlenetVerifyWebfingerRequest.md) |  | 

### Return type

[**ToolMoodlenetVerifyWebfinger200Response**](ToolMoodlenetVerifyWebfinger200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

