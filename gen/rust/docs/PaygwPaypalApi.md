# \PaygwPaypalApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paygw_paypal_create_transaction_complete**](PaygwPaypalApi.md#paygw_paypal_create_transaction_complete) | **POST** /paygw_paypal_create_transaction_complete | Takes care of what needs to be done when a PayPal transaction comes back as complete.
[**paygw_paypal_get_config_for_js**](PaygwPaypalApi.md#paygw_paypal_get_config_for_js) | **POST** /paygw_paypal_get_config_for_js | Returns the configuration settings to be used in js



## paygw_paypal_create_transaction_complete

> models::PaygwPaypalCreateTransactionComplete200Response paygw_paypal_create_transaction_complete(paygw_paypal_create_transaction_complete_request)
Takes care of what needs to be done when a PayPal transaction comes back as complete.

Takes care of what needs to be done when a PayPal transaction comes back as complete.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**paygw_paypal_create_transaction_complete_request** | [**PaygwPaypalCreateTransactionCompleteRequest**](PaygwPaypalCreateTransactionCompleteRequest.md) |  | [required] |

### Return type

[**models::PaygwPaypalCreateTransactionComplete200Response**](paygw_paypal_create_transaction_complete_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## paygw_paypal_get_config_for_js

> models::PaygwPaypalGetConfigForJs200Response paygw_paypal_get_config_for_js(paygw_paypal_get_config_for_js_request)
Returns the configuration settings to be used in js

Returns the configuration settings to be used in js

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**paygw_paypal_get_config_for_js_request** | [**PaygwPaypalGetConfigForJsRequest**](PaygwPaypalGetConfigForJsRequest.md) |  | [required] |

### Return type

[**models::PaygwPaypalGetConfigForJs200Response**](paygw_paypal_get_config_for_js_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

