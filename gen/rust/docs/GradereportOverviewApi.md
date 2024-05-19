# \GradereportOverviewApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gradereport_overview_get_course_grades**](GradereportOverviewApi.md#gradereport_overview_get_course_grades) | **POST** /gradereport_overview_get_course_grades | Get the given user courses final grades
[**gradereport_overview_view_grade_report**](GradereportOverviewApi.md#gradereport_overview_view_grade_report) | **POST** /gradereport_overview_view_grade_report | Trigger the report view event



## gradereport_overview_get_course_grades

> models::GradereportOverviewGetCourseGrades200Response gradereport_overview_get_course_grades(gradereport_overview_get_course_grades_request)
Get the given user courses final grades

Get the given user courses final grades

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**gradereport_overview_get_course_grades_request** | [**GradereportOverviewGetCourseGradesRequest**](GradereportOverviewGetCourseGradesRequest.md) |  | [required] |

### Return type

[**models::GradereportOverviewGetCourseGrades200Response**](gradereport_overview_get_course_grades_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## gradereport_overview_view_grade_report

> models::CoreCalendarDeleteSubscription200Response gradereport_overview_view_grade_report(gradereport_overview_view_grade_report_request)
Trigger the report view event

Trigger the report view event

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**gradereport_overview_view_grade_report_request** | [**GradereportOverviewViewGradeReportRequest**](GradereportOverviewViewGradeReportRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

