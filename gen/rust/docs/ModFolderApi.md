# \ModFolderApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_folder_get_folders_by_courses**](ModFolderApi.md#mod_folder_get_folders_by_courses) | **POST** /mod_folder_get_folders_by_courses | Returns a list of folders in a provided list of courses, if no list is provided all folders that                             the user can view will be returned. Please note that this WS is not returning the folder contents.
[**mod_folder_view_folder**](ModFolderApi.md#mod_folder_view_folder) | **POST** /mod_folder_view_folder | Simulate the view.php web interface folder: trigger events, completion, etc...



## mod_folder_get_folders_by_courses

> models::ModFolderGetFoldersByCourses200Response mod_folder_get_folders_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)
Returns a list of folders in a provided list of courses, if no list is provided all folders that                             the user can view will be returned. Please note that this WS is not returning the folder contents.

Returns a list of folders in a provided list of courses, if no list is provided all folders that                             the user can view will be returned. Please note that this WS is not returning the folder contents.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModFolderGetFoldersByCourses200Response**](mod_folder_get_folders_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_folder_view_folder

> models::CoreCalendarDeleteSubscription200Response mod_folder_view_folder(mod_folder_view_folder_request)
Simulate the view.php web interface folder: trigger events, completion, etc...

Simulate the view.php web interface folder: trigger events, completion, etc...

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_folder_view_folder_request** | [**ModFolderViewFolderRequest**](ModFolderViewFolderRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

