# OpenAPI\Client\ToolBehatApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**toolBehatGetEntityGenerator()**](ToolBehatApi.md#toolBehatGetEntityGenerator) | **POST** /tool_behat_get_entity_generator | Get the generator details for an entity |


## `toolBehatGetEntityGenerator()`

```php
toolBehatGetEntityGenerator($tool_behat_get_entity_generator_request): \OpenAPI\Client\Model\ToolBehatGetEntityGenerator200Response
```

Get the generator details for an entity

Get the generator details for an entity

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolBehatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_behat_get_entity_generator_request = new \OpenAPI\Client\Model\ToolBehatGetEntityGeneratorRequest(); // \OpenAPI\Client\Model\ToolBehatGetEntityGeneratorRequest

try {
    $result = $apiInstance->toolBehatGetEntityGenerator($tool_behat_get_entity_generator_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolBehatApi->toolBehatGetEntityGenerator: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_behat_get_entity_generator_request** | [**\OpenAPI\Client\Model\ToolBehatGetEntityGeneratorRequest**](../Model/ToolBehatGetEntityGeneratorRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolBehatGetEntityGenerator200Response**](../Model/ToolBehatGetEntityGenerator200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
