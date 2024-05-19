# OpenAPI\Client\TinyPremiumApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**tinyPremiumGetApiKey()**](TinyPremiumApi.md#tinyPremiumGetApiKey) | **POST** /tiny_premium_get_api_key | Get the Tiny Premium API key from Moodle |


## `tinyPremiumGetApiKey()`

```php
tinyPremiumGetApiKey($tiny_premium_get_api_key_request): \OpenAPI\Client\Model\TinyPremiumGetApiKey200Response
```

Get the Tiny Premium API key from Moodle

Get the Tiny Premium API key from Moodle

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\TinyPremiumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tiny_premium_get_api_key_request = new \OpenAPI\Client\Model\TinyPremiumGetApiKeyRequest(); // \OpenAPI\Client\Model\TinyPremiumGetApiKeyRequest

try {
    $result = $apiInstance->tinyPremiumGetApiKey($tiny_premium_get_api_key_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TinyPremiumApi->tinyPremiumGetApiKey: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tiny_premium_get_api_key_request** | [**\OpenAPI\Client\Model\TinyPremiumGetApiKeyRequest**](../Model/TinyPremiumGetApiKeyRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\TinyPremiumGetApiKey200Response**](../Model/TinyPremiumGetApiKey200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
