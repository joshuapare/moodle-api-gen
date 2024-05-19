# \TinyAutosaveApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tiny_autosave_reset_session**](TinyAutosaveApi.md#tiny_autosave_reset_session) | **POST** /tiny_autosave_reset_session | Reset an autosave session
[**tiny_autosave_resume_session**](TinyAutosaveApi.md#tiny_autosave_resume_session) | **POST** /tiny_autosave_resume_session | Resume an autosave session
[**tiny_autosave_update_session**](TinyAutosaveApi.md#tiny_autosave_update_session) | **POST** /tiny_autosave_update_session | Update an autosave session



## tiny_autosave_reset_session

> serde_json::Value tiny_autosave_reset_session(tiny_autosave_reset_session_request)
Reset an autosave session

Reset an autosave session

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tiny_autosave_reset_session_request** | [**TinyAutosaveResetSessionRequest**](TinyAutosaveResetSessionRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tiny_autosave_resume_session

> models::TinyAutosaveResumeSession200Response tiny_autosave_resume_session(tiny_autosave_resume_session_request)
Resume an autosave session

Resume an autosave session

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tiny_autosave_resume_session_request** | [**TinyAutosaveResumeSessionRequest**](TinyAutosaveResumeSessionRequest.md) |  | [required] |

### Return type

[**models::TinyAutosaveResumeSession200Response**](tiny_autosave_resume_session_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tiny_autosave_update_session

> serde_json::Value tiny_autosave_update_session(tiny_autosave_update_session_request)
Update an autosave session

Update an autosave session

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tiny_autosave_update_session_request** | [**TinyAutosaveUpdateSessionRequest**](TinyAutosaveUpdateSessionRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

