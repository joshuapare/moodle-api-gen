# \ModImscpApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_imscp_get_imscps_by_courses**](ModImscpApi.md#mod_imscp_get_imscps_by_courses) | **POST** /mod_imscp_get_imscps_by_courses | Returns a list of IMSCP instances in a provided set of courses,                             if no courses are provided then all the IMSCP instances the user has access to will be returned.
[**mod_imscp_view_imscp**](ModImscpApi.md#mod_imscp_view_imscp) | **POST** /mod_imscp_view_imscp | Simulate the view.php web interface imscp: trigger events, completion, etc...



## mod_imscp_get_imscps_by_courses

> models::ModImscpGetImscpsByCourses200Response mod_imscp_get_imscps_by_courses(mod_chat_get_chats_by_courses_request)
Returns a list of IMSCP instances in a provided set of courses,                             if no courses are provided then all the IMSCP instances the user has access to will be returned.

Returns a list of IMSCP instances in a provided set of courses,                             if no courses are provided then all the IMSCP instances the user has access to will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModImscpGetImscpsByCourses200Response**](mod_imscp_get_imscps_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_imscp_view_imscp

> models::CoreCalendarDeleteSubscription200Response mod_imscp_view_imscp(mod_imscp_view_imscp_request)
Simulate the view.php web interface imscp: trigger events, completion, etc...

Simulate the view.php web interface imscp: trigger events, completion, etc...

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_imscp_view_imscp_request** | [**ModImscpViewImscpRequest**](ModImscpViewImscpRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

