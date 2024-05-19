# \EnrolManualApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enrol_manual_enrol_users**](EnrolManualApi.md#enrol_manual_enrol_users) | **POST** /enrol_manual_enrol_users | Manual enrol users
[**enrol_manual_unenrol_users**](EnrolManualApi.md#enrol_manual_unenrol_users) | **POST** /enrol_manual_unenrol_users | Manual unenrol users



## enrol_manual_enrol_users

> serde_json::Value enrol_manual_enrol_users(enrol_manual_enrol_users_request)
Manual enrol users

Manual enrol users

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**enrol_manual_enrol_users_request** | [**EnrolManualEnrolUsersRequest**](EnrolManualEnrolUsersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## enrol_manual_unenrol_users

> serde_json::Value enrol_manual_unenrol_users(enrol_manual_unenrol_users_request)
Manual unenrol users

Manual unenrol users

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**enrol_manual_unenrol_users_request** | [**EnrolManualUnenrolUsersRequest**](EnrolManualUnenrolUsersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

