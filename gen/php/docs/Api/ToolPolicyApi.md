# OpenAPI\Client\ToolPolicyApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**toolPolicyGetPolicyVersion()**](ToolPolicyApi.md#toolPolicyGetPolicyVersion) | **POST** /tool_policy_get_policy_version | Fetch the details of a policy version |
| [**toolPolicySubmitAcceptOnBehalf()**](ToolPolicyApi.md#toolPolicySubmitAcceptOnBehalf) | **POST** /tool_policy_submit_accept_on_behalf | Accept policies on behalf of other users |


## `toolPolicyGetPolicyVersion()`

```php
toolPolicyGetPolicyVersion($tool_policy_get_policy_version_request): \OpenAPI\Client\Model\ToolPolicyGetPolicyVersion200Response
```

Fetch the details of a policy version

Fetch the details of a policy version

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolPolicyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_policy_get_policy_version_request = new \OpenAPI\Client\Model\ToolPolicyGetPolicyVersionRequest(); // \OpenAPI\Client\Model\ToolPolicyGetPolicyVersionRequest

try {
    $result = $apiInstance->toolPolicyGetPolicyVersion($tool_policy_get_policy_version_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolPolicyApi->toolPolicyGetPolicyVersion: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_policy_get_policy_version_request** | [**\OpenAPI\Client\Model\ToolPolicyGetPolicyVersionRequest**](../Model/ToolPolicyGetPolicyVersionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolPolicyGetPolicyVersion200Response**](../Model/ToolPolicyGetPolicyVersion200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolPolicySubmitAcceptOnBehalf()`

```php
toolPolicySubmitAcceptOnBehalf($tool_policy_submit_accept_on_behalf_request): object
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


$apiInstance = new OpenAPI\Client\Api\ToolPolicyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_policy_submit_accept_on_behalf_request = new \OpenAPI\Client\Model\ToolPolicySubmitAcceptOnBehalfRequest(); // \OpenAPI\Client\Model\ToolPolicySubmitAcceptOnBehalfRequest

try {
    $result = $apiInstance->toolPolicySubmitAcceptOnBehalf($tool_policy_submit_accept_on_behalf_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolPolicyApi->toolPolicySubmitAcceptOnBehalf: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_policy_submit_accept_on_behalf_request** | [**\OpenAPI\Client\Model\ToolPolicySubmitAcceptOnBehalfRequest**](../Model/ToolPolicySubmitAcceptOnBehalfRequest.md)|  | |

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
