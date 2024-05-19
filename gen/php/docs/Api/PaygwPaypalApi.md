# OpenAPI\Client\PaygwPaypalApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**paygwPaypalCreateTransactionComplete()**](PaygwPaypalApi.md#paygwPaypalCreateTransactionComplete) | **POST** /paygw_paypal_create_transaction_complete | Takes care of what needs to be done when a PayPal transaction comes back as complete. |
| [**paygwPaypalGetConfigForJs()**](PaygwPaypalApi.md#paygwPaypalGetConfigForJs) | **POST** /paygw_paypal_get_config_for_js | Returns the configuration settings to be used in js |


## `paygwPaypalCreateTransactionComplete()`

```php
paygwPaypalCreateTransactionComplete($paygw_paypal_create_transaction_complete_request): \OpenAPI\Client\Model\PaygwPaypalCreateTransactionComplete200Response
```

Takes care of what needs to be done when a PayPal transaction comes back as complete.

Takes care of what needs to be done when a PayPal transaction comes back as complete.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\PaygwPaypalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$paygw_paypal_create_transaction_complete_request = new \OpenAPI\Client\Model\PaygwPaypalCreateTransactionCompleteRequest(); // \OpenAPI\Client\Model\PaygwPaypalCreateTransactionCompleteRequest

try {
    $result = $apiInstance->paygwPaypalCreateTransactionComplete($paygw_paypal_create_transaction_complete_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PaygwPaypalApi->paygwPaypalCreateTransactionComplete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paygw_paypal_create_transaction_complete_request** | [**\OpenAPI\Client\Model\PaygwPaypalCreateTransactionCompleteRequest**](../Model/PaygwPaypalCreateTransactionCompleteRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\PaygwPaypalCreateTransactionComplete200Response**](../Model/PaygwPaypalCreateTransactionComplete200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `paygwPaypalGetConfigForJs()`

```php
paygwPaypalGetConfigForJs($paygw_paypal_get_config_for_js_request): \OpenAPI\Client\Model\PaygwPaypalGetConfigForJs200Response
```

Returns the configuration settings to be used in js

Returns the configuration settings to be used in js

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\PaygwPaypalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$paygw_paypal_get_config_for_js_request = new \OpenAPI\Client\Model\PaygwPaypalGetConfigForJsRequest(); // \OpenAPI\Client\Model\PaygwPaypalGetConfigForJsRequest

try {
    $result = $apiInstance->paygwPaypalGetConfigForJs($paygw_paypal_get_config_for_js_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PaygwPaypalApi->paygwPaypalGetConfigForJs: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paygw_paypal_get_config_for_js_request** | [**\OpenAPI\Client\Model\PaygwPaypalGetConfigForJsRequest**](../Model/PaygwPaypalGetConfigForJsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\PaygwPaypalGetConfigForJs200Response**](../Model/PaygwPaypalGetConfigForJs200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
