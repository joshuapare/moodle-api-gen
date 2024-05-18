# OpenAPI\Client\ToolIomadpolicyApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**toolIomadpolicyGetIomadpolicyVersion()**](ToolIomadpolicyApi.md#toolIomadpolicyGetIomadpolicyVersion) | **POST** /tool_iomadpolicy_get_iomadpolicy_version | Fetch the details of a iomadpolicy version |
| [**toolIomadpolicySubmitAcceptOnBehalf()**](ToolIomadpolicyApi.md#toolIomadpolicySubmitAcceptOnBehalf) | **POST** /tool_iomadpolicy_submit_accept_on_behalf | Accept policies on behalf of other users |


## `toolIomadpolicyGetIomadpolicyVersion()`

```php
toolIomadpolicyGetIomadpolicyVersion($tool_iomadpolicy_get_iomadpolicy_version_request): \OpenAPI\Client\Model\ToolIomadpolicyGetIomadpolicyVersion200Response
```

Fetch the details of a iomadpolicy version

Fetch the details of a iomadpolicy version

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolIomadpolicyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_iomadpolicy_get_iomadpolicy_version_request = new \OpenAPI\Client\Model\ToolIomadpolicyGetIomadpolicyVersionRequest(); // \OpenAPI\Client\Model\ToolIomadpolicyGetIomadpolicyVersionRequest

try {
    $result = $apiInstance->toolIomadpolicyGetIomadpolicyVersion($tool_iomadpolicy_get_iomadpolicy_version_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolIomadpolicyApi->toolIomadpolicyGetIomadpolicyVersion: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_iomadpolicy_get_iomadpolicy_version_request** | [**\OpenAPI\Client\Model\ToolIomadpolicyGetIomadpolicyVersionRequest**](../Model/ToolIomadpolicyGetIomadpolicyVersionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolIomadpolicyGetIomadpolicyVersion200Response**](../Model/ToolIomadpolicyGetIomadpolicyVersion200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolIomadpolicySubmitAcceptOnBehalf()`

```php
toolIomadpolicySubmitAcceptOnBehalf($tool_iomadpolicy_submit_accept_on_behalf_request): object
```

Accept policies on behalf of other users

Accept policies on behalf of other users

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolIomadpolicyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_iomadpolicy_submit_accept_on_behalf_request = new \OpenAPI\Client\Model\ToolIomadpolicySubmitAcceptOnBehalfRequest(); // \OpenAPI\Client\Model\ToolIomadpolicySubmitAcceptOnBehalfRequest

try {
    $result = $apiInstance->toolIomadpolicySubmitAcceptOnBehalf($tool_iomadpolicy_submit_accept_on_behalf_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolIomadpolicyApi->toolIomadpolicySubmitAcceptOnBehalf: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_iomadpolicy_submit_accept_on_behalf_request** | [**\OpenAPI\Client\Model\ToolIomadpolicySubmitAcceptOnBehalfRequest**](../Model/ToolIomadpolicySubmitAcceptOnBehalfRequest.md)|  | |

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
