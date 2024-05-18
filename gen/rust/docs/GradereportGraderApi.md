# \GradereportGraderApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gradereport_grader_get_users_in_report**](GradereportGraderApi.md#gradereport_grader_get_users_in_report) | **POST** /gradereport_grader_get_users_in_report | Returns the dataset of users within the report



## gradereport_grader_get_users_in_report

> models::CoreGradesGetGradableUsers200Response gradereport_grader_get_users_in_report(core_completion_mark_course_self_completed_request)
Returns the dataset of users within the report

Returns the dataset of users within the report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_completion_mark_course_self_completed_request** | [**CoreCompletionMarkCourseSelfCompletedRequest**](CoreCompletionMarkCourseSelfCompletedRequest.md) |  | [required] |

### Return type

[**models::CoreGradesGetGradableUsers200Response**](core_grades_get_gradable_users_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

