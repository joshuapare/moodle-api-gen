# \ToolMoodlenetApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_moodlenet_search_courses**](ToolMoodlenetApi.md#tool_moodlenet_search_courses) | **POST** /tool_moodlenet_search_courses | For some given input search for a course that matches
[**tool_moodlenet_verify_webfinger**](ToolMoodlenetApi.md#tool_moodlenet_verify_webfinger) | **POST** /tool_moodlenet_verify_webfinger | Verify if the passed information resolves into a WebFinger profile URL



## tool_moodlenet_search_courses

> models::ToolMoodlenetSearchCourses200Response tool_moodlenet_search_courses(tool_moodlenet_search_courses_request)
For some given input search for a course that matches

For some given input search for a course that matches

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_moodlenet_search_courses_request** | [**ToolMoodlenetSearchCoursesRequest**](ToolMoodlenetSearchCoursesRequest.md) |  | [required] |

### Return type

[**models::ToolMoodlenetSearchCourses200Response**](tool_moodlenet_search_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_moodlenet_verify_webfinger

> models::ToolMoodlenetVerifyWebfinger200Response tool_moodlenet_verify_webfinger(tool_moodlenet_verify_webfinger_request)
Verify if the passed information resolves into a WebFinger profile URL

Verify if the passed information resolves into a WebFinger profile URL

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_moodlenet_verify_webfinger_request** | [**ToolMoodlenetVerifyWebfingerRequest**](ToolMoodlenetVerifyWebfingerRequest.md) |  | [required] |

### Return type

[**models::ToolMoodlenetVerifyWebfinger200Response**](tool_moodlenet_verify_webfinger_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

