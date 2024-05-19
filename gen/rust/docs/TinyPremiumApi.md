# \TinyPremiumApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tiny_premium_get_api_key**](TinyPremiumApi.md#tiny_premium_get_api_key) | **POST** /tiny_premium_get_api_key | Get the Tiny Premium API key from Moodle



## tiny_premium_get_api_key

> models::TinyPremiumGetApiKey200Response tiny_premium_get_api_key(tiny_premium_get_api_key_request)
Get the Tiny Premium API key from Moodle

Get the Tiny Premium API key from Moodle

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tiny_premium_get_api_key_request** | [**TinyPremiumGetApiKeyRequest**](TinyPremiumGetApiKeyRequest.md) |  | [required] |

### Return type

[**models::TinyPremiumGetApiKey200Response**](tiny_premium_get_api_key_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

