# \BlockStarredcoursesAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BlockStarredcoursesGetStarredCourses**](BlockStarredcoursesAPI.md#BlockStarredcoursesGetStarredCourses) | **Post** /block_starredcourses_get_starred_courses | Get users starred courses.



## BlockStarredcoursesGetStarredCourses

> map[string]interface{} BlockStarredcoursesGetStarredCourses(ctx).BlockStarredcoursesGetStarredCoursesRequest(blockStarredcoursesGetStarredCoursesRequest).Execute()

Get users starred courses.



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
	blockStarredcoursesGetStarredCoursesRequest := *openapiclient.NewBlockStarredcoursesGetStarredCoursesRequest() // BlockStarredcoursesGetStarredCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockStarredcoursesAPI.BlockStarredcoursesGetStarredCourses(context.Background()).BlockStarredcoursesGetStarredCoursesRequest(blockStarredcoursesGetStarredCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockStarredcoursesAPI.BlockStarredcoursesGetStarredCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockStarredcoursesGetStarredCourses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockStarredcoursesAPI.BlockStarredcoursesGetStarredCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockStarredcoursesGetStarredCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockStarredcoursesGetStarredCoursesRequest** | [**BlockStarredcoursesGetStarredCoursesRequest**](BlockStarredcoursesGetStarredCoursesRequest.md) |  | 

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

