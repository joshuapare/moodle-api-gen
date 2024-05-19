# \ModIomadcertificateApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_iomadcertificate_get_iomadcertificates_by_courses**](ModIomadcertificateApi.md#mod_iomadcertificate_get_iomadcertificates_by_courses) | **POST** /mod_iomadcertificate_get_iomadcertificates_by_courses | Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.
[**mod_iomadcertificate_get_issued_iomadcertificates**](ModIomadcertificateApi.md#mod_iomadcertificate_get_issued_iomadcertificates) | **POST** /mod_iomadcertificate_get_issued_iomadcertificates | Get the list of issued iomadcertificates for the current user.
[**mod_iomadcertificate_issue_iomadcertificate**](ModIomadcertificateApi.md#mod_iomadcertificate_issue_iomadcertificate) | **POST** /mod_iomadcertificate_issue_iomadcertificate | Create new iomadcertificate record, or return existing record for the current user.
[**mod_iomadcertificate_view_iomadcertificate**](ModIomadcertificateApi.md#mod_iomadcertificate_view_iomadcertificate) | **POST** /mod_iomadcertificate_view_iomadcertificate | Trigger the course module viewed event and update the module completion status.



## mod_iomadcertificate_get_iomadcertificates_by_courses

> models::ModIomadcertificateGetIomadcertificatesByCourses200Response mod_iomadcertificate_get_iomadcertificates_by_courses(mod_chat_get_chats_by_courses_request)
Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.

Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModIomadcertificateGetIomadcertificatesByCourses200Response**](mod_iomadcertificate_get_iomadcertificates_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_iomadcertificate_get_issued_iomadcertificates

> models::ModIomadcertificateGetIssuedIomadcertificates200Response mod_iomadcertificate_get_issued_iomadcertificates(mod_iomadcertificate_get_issued_iomadcertificates_request)
Get the list of issued iomadcertificates for the current user.

Get the list of issued iomadcertificates for the current user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_iomadcertificate_get_issued_iomadcertificates_request** | [**ModIomadcertificateGetIssuedIomadcertificatesRequest**](ModIomadcertificateGetIssuedIomadcertificatesRequest.md) |  | [required] |

### Return type

[**models::ModIomadcertificateGetIssuedIomadcertificates200Response**](mod_iomadcertificate_get_issued_iomadcertificates_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_iomadcertificate_issue_iomadcertificate

> models::ModIomadcertificateIssueIomadcertificate200Response mod_iomadcertificate_issue_iomadcertificate(mod_iomadcertificate_issue_iomadcertificate_request)
Create new iomadcertificate record, or return existing record for the current user.

Create new iomadcertificate record, or return existing record for the current user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_iomadcertificate_issue_iomadcertificate_request** | [**ModIomadcertificateIssueIomadcertificateRequest**](ModIomadcertificateIssueIomadcertificateRequest.md) |  | [required] |

### Return type

[**models::ModIomadcertificateIssueIomadcertificate200Response**](mod_iomadcertificate_issue_iomadcertificate_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_iomadcertificate_view_iomadcertificate

> models::CoreCalendarDeleteSubscription200Response mod_iomadcertificate_view_iomadcertificate(mod_iomadcertificate_issue_iomadcertificate_request)
Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_iomadcertificate_issue_iomadcertificate_request** | [**ModIomadcertificateIssueIomadcertificateRequest**](ModIomadcertificateIssueIomadcertificateRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

