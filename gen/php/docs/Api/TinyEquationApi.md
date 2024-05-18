# OpenAPI\Client\TinyEquationApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**tinyEquationFilter()**](TinyEquationApi.md#tinyEquationFilter) | **POST** /tiny_equation_filter | Filter the equation |


## `tinyEquationFilter()`

```php
tinyEquationFilter($tiny_equation_filter_request): \OpenAPI\Client\Model\TinyEquationFilter200Response
```

Filter the equation

Filter the equation

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\TinyEquationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tiny_equation_filter_request = new \OpenAPI\Client\Model\TinyEquationFilterRequest(); // \OpenAPI\Client\Model\TinyEquationFilterRequest

try {
    $result = $apiInstance->tinyEquationFilter($tiny_equation_filter_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TinyEquationApi->tinyEquationFilter: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tiny_equation_filter_request** | [**\OpenAPI\Client\Model\TinyEquationFilterRequest**](../Model/TinyEquationFilterRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\TinyEquationFilter200Response**](../Model/TinyEquationFilter200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
