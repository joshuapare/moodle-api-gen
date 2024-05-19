# \ModUrlApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_url_get_urls_by_courses**](ModUrlApi.md#mod_url_get_urls_by_courses) | **POST** /mod_url_get_urls_by_courses | Returns a list of urls in a provided list of courses, if no list is provided all urls that the user                             can view will be returned.
[**mod_url_view_url**](ModUrlApi.md#mod_url_view_url) | **POST** /mod_url_view_url | Trigger the course module viewed event and update the module completion status.



## mod_url_get_urls_by_courses

> models::ModUrlGetUrlsByCourses200Response mod_url_get_urls_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)
Returns a list of urls in a provided list of courses, if no list is provided all urls that the user                             can view will be returned.

Returns a list of urls in a provided list of courses, if no list is provided all urls that the user                             can view will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModUrlGetUrlsByCourses200Response**](mod_url_get_urls_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_url_view_url

> models::CoreCalendarDeleteSubscription200Response mod_url_view_url(mod_url_view_url_request)
Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_url_view_url_request** | [**ModUrlViewUrlRequest**](ModUrlViewUrlRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

