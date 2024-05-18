# OpenAPI\Client\ToolXmldbApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**toolXmldbInvokeMoveAction()**](ToolXmldbApi.md#toolXmldbInvokeMoveAction) | **POST** /tool_xmldb_invoke_move_action | moves element up/down |


## `toolXmldbInvokeMoveAction()`

```php
toolXmldbInvokeMoveAction($tool_xmldb_invoke_move_action_request): object
```

moves element up/down

moves element up/down

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolXmldbApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_xmldb_invoke_move_action_request = new \OpenAPI\Client\Model\ToolXmldbInvokeMoveActionRequest(); // \OpenAPI\Client\Model\ToolXmldbInvokeMoveActionRequest

try {
    $result = $apiInstance->toolXmldbInvokeMoveAction($tool_xmldb_invoke_move_action_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolXmldbApi->toolXmldbInvokeMoveAction: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_xmldb_invoke_move_action_request** | [**\OpenAPI\Client\Model\ToolXmldbInvokeMoveActionRequest**](../Model/ToolXmldbInvokeMoveActionRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
