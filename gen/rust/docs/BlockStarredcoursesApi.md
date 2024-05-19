# \BlockStarredcoursesApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**block_starredcourses_get_starred_courses**](BlockStarredcoursesApi.md#block_starredcourses_get_starred_courses) | **POST** /block_starredcourses_get_starred_courses | Get users starred courses.



## block_starredcourses_get_starred_courses

> serde_json::Value block_starredcourses_get_starred_courses(block_starredcourses_get_starred_courses_request)
Get users starred courses.

Get users starred courses.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_starredcourses_get_starred_courses_request** | [**BlockStarredcoursesGetStarredCoursesRequest**](BlockStarredcoursesGetStarredCoursesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

