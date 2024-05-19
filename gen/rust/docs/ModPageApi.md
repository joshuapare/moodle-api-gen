# \ModPageApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_page_get_pages_by_courses**](ModPageApi.md#mod_page_get_pages_by_courses) | **POST** /mod_page_get_pages_by_courses | Returns a list of pages in a provided list of courses, if no list is provided all pages that the user                             can view will be returned.
[**mod_page_view_page**](ModPageApi.md#mod_page_view_page) | **POST** /mod_page_view_page | Simulate the view.php web interface page: trigger events, completion, etc...



## mod_page_get_pages_by_courses

> models::ModPageGetPagesByCourses200Response mod_page_get_pages_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)
Returns a list of pages in a provided list of courses, if no list is provided all pages that the user                             can view will be returned.

Returns a list of pages in a provided list of courses, if no list is provided all pages that the user                             can view will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModPageGetPagesByCourses200Response**](mod_page_get_pages_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_page_view_page

> models::CoreCalendarDeleteSubscription200Response mod_page_view_page(mod_page_view_page_request)
Simulate the view.php web interface page: trigger events, completion, etc...

Simulate the view.php web interface page: trigger events, completion, etc...

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_page_view_page_request** | [**ModPageViewPageRequest**](ModPageViewPageRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

