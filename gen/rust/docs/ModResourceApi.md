# \ModResourceApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_resource_get_resources_by_courses**](ModResourceApi.md#mod_resource_get_resources_by_courses) | **POST** /mod_resource_get_resources_by_courses | Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
[**mod_resource_view_resource**](ModResourceApi.md#mod_resource_view_resource) | **POST** /mod_resource_view_resource | Simulate the view.php web interface resource: trigger events, completion, etc...



## mod_resource_get_resources_by_courses

> models::ModResourceGetResourcesByCourses200Response mod_resource_get_resources_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)
Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.

Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModResourceGetResourcesByCourses200Response**](mod_resource_get_resources_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_resource_view_resource

> models::CoreCalendarDeleteSubscription200Response mod_resource_view_resource(mod_resource_view_resource_request)
Simulate the view.php web interface resource: trigger events, completion, etc...

Simulate the view.php web interface resource: trigger events, completion, etc...

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_resource_view_resource_request** | [**ModResourceViewResourceRequest**](ModResourceViewResourceRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

