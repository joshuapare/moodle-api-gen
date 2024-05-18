# \GradereportUserApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gradereport_user_get_access_information**](GradereportUserApi.md#gradereport_user_get_access_information) | **POST** /gradereport_user_get_access_information | Returns user access information for the user grade report.
[**gradereport_user_get_grade_items**](GradereportUserApi.md#gradereport_user_get_grade_items) | **POST** /gradereport_user_get_grade_items | Returns the complete list of grade items for users in a course
[**gradereport_user_get_grades_table**](GradereportUserApi.md#gradereport_user_get_grades_table) | **POST** /gradereport_user_get_grades_table | Get the user/s report grades table for a course
[**gradereport_user_view_grade_report**](GradereportUserApi.md#gradereport_user_view_grade_report) | **POST** /gradereport_user_view_grade_report | Trigger the report view event



## gradereport_user_get_access_information

> models::GradereportUserGetAccessInformation200Response gradereport_user_get_access_information(gradereport_user_get_access_information_request)
Returns user access information for the user grade report.

Returns user access information for the user grade report.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**gradereport_user_get_access_information_request** | [**GradereportUserGetAccessInformationRequest**](GradereportUserGetAccessInformationRequest.md) |  | [required] |

### Return type

[**models::GradereportUserGetAccessInformation200Response**](gradereport_user_get_access_information_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## gradereport_user_get_grade_items

> models::GradereportUserGetGradeItems200Response gradereport_user_get_grade_items(gradereport_user_get_grade_items_request)
Returns the complete list of grade items for users in a course

Returns the complete list of grade items for users in a course

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**gradereport_user_get_grade_items_request** | [**GradereportUserGetGradeItemsRequest**](GradereportUserGetGradeItemsRequest.md) |  | [required] |

### Return type

[**models::GradereportUserGetGradeItems200Response**](gradereport_user_get_grade_items_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## gradereport_user_get_grades_table

> models::GradereportUserGetGradesTable200Response gradereport_user_get_grades_table(gradereport_user_get_grade_items_request)
Get the user/s report grades table for a course

Get the user/s report grades table for a course

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**gradereport_user_get_grade_items_request** | [**GradereportUserGetGradeItemsRequest**](GradereportUserGetGradeItemsRequest.md) |  | [required] |

### Return type

[**models::GradereportUserGetGradesTable200Response**](gradereport_user_get_grades_table_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## gradereport_user_view_grade_report

> models::CoreCalendarDeleteSubscription200Response gradereport_user_view_grade_report(gradereport_overview_view_grade_report_request)
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

