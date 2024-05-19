# \ModFolderAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModFolderGetFoldersByCourses**](ModFolderAPI.md#ModFolderGetFoldersByCourses) | **Post** /mod_folder_get_folders_by_courses | Returns a list of folders in a provided list of courses, if no list is provided all folders that                             the user can view will be returned. Please note that this WS is not returning the folder contents.
[**ModFolderViewFolder**](ModFolderAPI.md#ModFolderViewFolder) | **Post** /mod_folder_view_folder | Simulate the view.php web interface folder: trigger events, completion, etc...



## ModFolderGetFoldersByCourses

> ModFolderGetFoldersByCourses200Response ModFolderGetFoldersByCourses(ctx).ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest).Execute()

Returns a list of folders in a provided list of courses, if no list is provided all folders that                             the user can view will be returned. Please note that this WS is not returning the folder contents.



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
	resp, r, err := apiClient.ModFolderAPI.ModFolderGetFoldersByCourses(context.Background()).ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModFolderAPI.ModFolderGetFoldersByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModFolderGetFoldersByCourses`: ModFolderGetFoldersByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModFolderAPI.ModFolderGetFoldersByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModFolderGetFoldersByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  | 

### Return type

[**ModFolderGetFoldersByCourses200Response**](ModFolderGetFoldersByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModFolderViewFolder

> CoreCalendarDeleteSubscription200Response ModFolderViewFolder(ctx).ModFolderViewFolderRequest(modFolderViewFolderRequest).Execute()

Simulate the view.php web interface folder: trigger events, completion, etc...



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
	modFolderViewFolderRequest := *openapiclient.NewModFolderViewFolderRequest(int32(123)) // ModFolderViewFolderRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModFolderAPI.ModFolderViewFolder(context.Background()).ModFolderViewFolderRequest(modFolderViewFolderRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModFolderAPI.ModFolderViewFolder``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModFolderViewFolder`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModFolderAPI.ModFolderViewFolder`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModFolderViewFolderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modFolderViewFolderRequest** | [**ModFolderViewFolderRequest**](ModFolderViewFolderRequest.md) |  | 

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

