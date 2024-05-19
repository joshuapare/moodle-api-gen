# \ToolMobileApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_mobile_call_external_functions**](ToolMobileApi.md#tool_mobile_call_external_functions) | **POST** /tool_mobile_call_external_functions | Call multiple external functions and return all responses.
[**tool_mobile_get_autologin_key**](ToolMobileApi.md#tool_mobile_get_autologin_key) | **POST** /tool_mobile_get_autologin_key | Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.
[**tool_mobile_get_config**](ToolMobileApi.md#tool_mobile_get_config) | **POST** /tool_mobile_get_config | Returns a list of the site configurations, filtering by section.
[**tool_mobile_get_content**](ToolMobileApi.md#tool_mobile_get_content) | **POST** /tool_mobile_get_content | Returns a piece of content to be displayed in the Mobile app.
[**tool_mobile_get_plugins_supporting_mobile**](ToolMobileApi.md#tool_mobile_get_plugins_supporting_mobile) | **POST** /tool_mobile_get_plugins_supporting_mobile | Returns a list of Moodle plugins supporting the mobile app.
[**tool_mobile_get_public_config**](ToolMobileApi.md#tool_mobile_get_public_config) | **POST** /tool_mobile_get_public_config | Returns a list of the site public settings, those not requiring authentication.
[**tool_mobile_get_tokens_for_qr_login**](ToolMobileApi.md#tool_mobile_get_tokens_for_qr_login) | **POST** /tool_mobile_get_tokens_for_qr_login | Returns a WebService token (and private token) for QR login.
[**tool_mobile_validate_subscription_key**](ToolMobileApi.md#tool_mobile_validate_subscription_key) | **POST** /tool_mobile_validate_subscription_key | Check if the given site subscription key is valid.



## tool_mobile_call_external_functions

> models::ToolMobileCallExternalFunctions200Response tool_mobile_call_external_functions(tool_mobile_call_external_functions_request)
Call multiple external functions and return all responses.

Call multiple external functions and return all responses.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_mobile_call_external_functions_request** | [**ToolMobileCallExternalFunctionsRequest**](ToolMobileCallExternalFunctionsRequest.md) |  | [required] |

### Return type

[**models::ToolMobileCallExternalFunctions200Response**](tool_mobile_call_external_functions_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_mobile_get_autologin_key

> models::ToolMobileGetAutologinKey200Response tool_mobile_get_autologin_key(tool_mobile_get_autologin_key_request)
Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.

Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_mobile_get_autologin_key_request** | [**ToolMobileGetAutologinKeyRequest**](ToolMobileGetAutologinKeyRequest.md) |  | [required] |

### Return type

[**models::ToolMobileGetAutologinKey200Response**](tool_mobile_get_autologin_key_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_mobile_get_config

> models::ToolMobileGetConfig200Response tool_mobile_get_config(tool_mobile_get_config_request)
Returns a list of the site configurations, filtering by section.

Returns a list of the site configurations, filtering by section.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_mobile_get_config_request** | [**ToolMobileGetConfigRequest**](ToolMobileGetConfigRequest.md) |  | [required] |

### Return type

[**models::ToolMobileGetConfig200Response**](tool_mobile_get_config_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_mobile_get_content

> models::ToolMobileGetContent200Response tool_mobile_get_content(tool_mobile_get_content_request)
Returns a piece of content to be displayed in the Mobile app.

Returns a piece of content to be displayed in the Mobile app.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_mobile_get_content_request** | [**ToolMobileGetContentRequest**](ToolMobileGetContentRequest.md) |  | [required] |

### Return type

[**models::ToolMobileGetContent200Response**](tool_mobile_get_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_mobile_get_plugins_supporting_mobile

> models::ToolMobileGetPluginsSupportingMobile200Response tool_mobile_get_plugins_supporting_mobile()
Returns a list of Moodle plugins supporting the mobile app.

Returns a list of Moodle plugins supporting the mobile app.

### Parameters

This endpoint does not need any parameter.

### Return type

[**models::ToolMobileGetPluginsSupportingMobile200Response**](tool_mobile_get_plugins_supporting_mobile_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_mobile_get_public_config

> models::ToolMobileGetPublicConfig200Response tool_mobile_get_public_config()
Returns a list of the site public settings, those not requiring authentication.

Returns a list of the site public settings, those not requiring authentication.

### Parameters

This endpoint does not need any parameter.

### Return type

[**models::ToolMobileGetPublicConfig200Response**](tool_mobile_get_public_config_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_mobile_get_tokens_for_qr_login

> models::ToolMobileGetTokensForQrLogin200Response tool_mobile_get_tokens_for_qr_login(tool_mobile_get_tokens_for_qr_login_request)
Returns a WebService token (and private token) for QR login.

Returns a WebService token (and private token) for QR login.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_mobile_get_tokens_for_qr_login_request** | [**ToolMobileGetTokensForQrLoginRequest**](ToolMobileGetTokensForQrLoginRequest.md) |  | [required] |

### Return type

[**models::ToolMobileGetTokensForQrLogin200Response**](tool_mobile_get_tokens_for_qr_login_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_mobile_validate_subscription_key

> models::ToolMobileValidateSubscriptionKey200Response tool_mobile_validate_subscription_key(tool_mobile_validate_subscription_key_request)
Check if the given site subscription key is valid.

Check if the given site subscription key is valid.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_mobile_validate_subscription_key_request** | [**ToolMobileValidateSubscriptionKeyRequest**](ToolMobileValidateSubscriptionKeyRequest.md) |  | [required] |

### Return type

[**models::ToolMobileValidateSubscriptionKey200Response**](tool_mobile_validate_subscription_key_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

