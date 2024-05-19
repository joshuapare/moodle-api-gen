# \ModLabelApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_label_get_labels_by_courses**](ModLabelApi.md#mod_label_get_labels_by_courses) | **POST** /mod_label_get_labels_by_courses | Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.



## mod_label_get_labels_by_courses

> models::ModLabelGetLabelsByCourses200Response mod_label_get_labels_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)
Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.

Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModLabelGetLabelsByCourses200Response**](mod_label_get_labels_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

