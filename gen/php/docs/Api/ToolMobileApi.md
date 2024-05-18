# OpenAPI\Client\ToolMobileApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**toolMobileCallExternalFunctions()**](ToolMobileApi.md#toolMobileCallExternalFunctions) | **POST** /tool_mobile_call_external_functions | Call multiple external functions and return all responses. |
| [**toolMobileGetAutologinKey()**](ToolMobileApi.md#toolMobileGetAutologinKey) | **POST** /tool_mobile_get_autologin_key | Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app. |
| [**toolMobileGetConfig()**](ToolMobileApi.md#toolMobileGetConfig) | **POST** /tool_mobile_get_config | Returns a list of the site configurations, filtering by section. |
| [**toolMobileGetContent()**](ToolMobileApi.md#toolMobileGetContent) | **POST** /tool_mobile_get_content | Returns a piece of content to be displayed in the Mobile app. |
| [**toolMobileGetPluginsSupportingMobile()**](ToolMobileApi.md#toolMobileGetPluginsSupportingMobile) | **POST** /tool_mobile_get_plugins_supporting_mobile | Returns a list of Moodle plugins supporting the mobile app. |
| [**toolMobileGetPublicConfig()**](ToolMobileApi.md#toolMobileGetPublicConfig) | **POST** /tool_mobile_get_public_config | Returns a list of the site public settings, those not requiring authentication. |
| [**toolMobileGetTokensForQrLogin()**](ToolMobileApi.md#toolMobileGetTokensForQrLogin) | **POST** /tool_mobile_get_tokens_for_qr_login | Returns a WebService token (and private token) for QR login. |
| [**toolMobileValidateSubscriptionKey()**](ToolMobileApi.md#toolMobileValidateSubscriptionKey) | **POST** /tool_mobile_validate_subscription_key | Check if the given site subscription key is valid. |


## `toolMobileCallExternalFunctions()`

```php
toolMobileCallExternalFunctions($tool_mobile_call_external_functions_request): \OpenAPI\Client\Model\ToolMobileCallExternalFunctions200Response
```

Call multiple external functions and return all responses.

Call multiple external functions and return all responses.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolMobileApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_mobile_call_external_functions_request = new \OpenAPI\Client\Model\ToolMobileCallExternalFunctionsRequest(); // \OpenAPI\Client\Model\ToolMobileCallExternalFunctionsRequest

try {
    $result = $apiInstance->toolMobileCallExternalFunctions($tool_mobile_call_external_functions_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolMobileApi->toolMobileCallExternalFunctions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_mobile_call_external_functions_request** | [**\OpenAPI\Client\Model\ToolMobileCallExternalFunctionsRequest**](../Model/ToolMobileCallExternalFunctionsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolMobileCallExternalFunctions200Response**](../Model/ToolMobileCallExternalFunctions200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolMobileGetAutologinKey()`

```php
toolMobileGetAutologinKey($tool_mobile_get_autologin_key_request): \OpenAPI\Client\Model\ToolMobileGetAutologinKey200Response
```

Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.

Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolMobileApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_mobile_get_autologin_key_request = new \OpenAPI\Client\Model\ToolMobileGetAutologinKeyRequest(); // \OpenAPI\Client\Model\ToolMobileGetAutologinKeyRequest

try {
    $result = $apiInstance->toolMobileGetAutologinKey($tool_mobile_get_autologin_key_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolMobileApi->toolMobileGetAutologinKey: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_mobile_get_autologin_key_request** | [**\OpenAPI\Client\Model\ToolMobileGetAutologinKeyRequest**](../Model/ToolMobileGetAutologinKeyRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolMobileGetAutologinKey200Response**](../Model/ToolMobileGetAutologinKey200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolMobileGetConfig()`

```php
toolMobileGetConfig($tool_mobile_get_config_request): \OpenAPI\Client\Model\ToolMobileGetConfig200Response
```

Returns a list of the site configurations, filtering by section.

Returns a list of the site configurations, filtering by section.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolMobileApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_mobile_get_config_request = new \OpenAPI\Client\Model\ToolMobileGetConfigRequest(); // \OpenAPI\Client\Model\ToolMobileGetConfigRequest

try {
    $result = $apiInstance->toolMobileGetConfig($tool_mobile_get_config_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolMobileApi->toolMobileGetConfig: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_mobile_get_config_request** | [**\OpenAPI\Client\Model\ToolMobileGetConfigRequest**](../Model/ToolMobileGetConfigRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolMobileGetConfig200Response**](../Model/ToolMobileGetConfig200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolMobileGetContent()`

```php
toolMobileGetContent($tool_mobile_get_content_request): \OpenAPI\Client\Model\ToolMobileGetContent200Response
```

Returns a piece of content to be displayed in the Mobile app.

Returns a piece of content to be displayed in the Mobile app.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolMobileApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_mobile_get_content_request = new \OpenAPI\Client\Model\ToolMobileGetContentRequest(); // \OpenAPI\Client\Model\ToolMobileGetContentRequest

try {
    $result = $apiInstance->toolMobileGetContent($tool_mobile_get_content_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolMobileApi->toolMobileGetContent: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_mobile_get_content_request** | [**\OpenAPI\Client\Model\ToolMobileGetContentRequest**](../Model/ToolMobileGetContentRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolMobileGetContent200Response**](../Model/ToolMobileGetContent200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolMobileGetPluginsSupportingMobile()`

```php
toolMobileGetPluginsSupportingMobile(): \OpenAPI\Client\Model\ToolMobileGetPluginsSupportingMobile200Response
```

Returns a list of Moodle plugins supporting the mobile app.

Returns a list of Moodle plugins supporting the mobile app.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolMobileApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->toolMobileGetPluginsSupportingMobile();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolMobileApi->toolMobileGetPluginsSupportingMobile: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\ToolMobileGetPluginsSupportingMobile200Response**](../Model/ToolMobileGetPluginsSupportingMobile200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolMobileGetPublicConfig()`

```php
toolMobileGetPublicConfig(): \OpenAPI\Client\Model\ToolMobileGetPublicConfig200Response
```

Returns a list of the site public settings, those not requiring authentication.

Returns a list of the site public settings, those not requiring authentication.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolMobileApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->toolMobileGetPublicConfig();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolMobileApi->toolMobileGetPublicConfig: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\ToolMobileGetPublicConfig200Response**](../Model/ToolMobileGetPublicConfig200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolMobileGetTokensForQrLogin()`

```php
toolMobileGetTokensForQrLogin($tool_mobile_get_tokens_for_qr_login_request): \OpenAPI\Client\Model\ToolMobileGetTokensForQrLogin200Response
```

Returns a WebService token (and private token) for QR login.

Returns a WebService token (and private token) for QR login.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolMobileApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_mobile_get_tokens_for_qr_login_request = new \OpenAPI\Client\Model\ToolMobileGetTokensForQrLoginRequest(); // \OpenAPI\Client\Model\ToolMobileGetTokensForQrLoginRequest

try {
    $result = $apiInstance->toolMobileGetTokensForQrLogin($tool_mobile_get_tokens_for_qr_login_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolMobileApi->toolMobileGetTokensForQrLogin: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_mobile_get_tokens_for_qr_login_request** | [**\OpenAPI\Client\Model\ToolMobileGetTokensForQrLoginRequest**](../Model/ToolMobileGetTokensForQrLoginRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolMobileGetTokensForQrLogin200Response**](../Model/ToolMobileGetTokensForQrLogin200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolMobileValidateSubscriptionKey()`

```php
toolMobileValidateSubscriptionKey($tool_mobile_validate_subscription_key_request): \OpenAPI\Client\Model\ToolMobileValidateSubscriptionKey200Response
```

Check if the given site subscription key is valid.

Check if the given site subscription key is valid.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolMobileApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_mobile_validate_subscription_key_request = new \OpenAPI\Client\Model\ToolMobileValidateSubscriptionKeyRequest(); // \OpenAPI\Client\Model\ToolMobileValidateSubscriptionKeyRequest

try {
    $result = $apiInstance->toolMobileValidateSubscriptionKey($tool_mobile_validate_subscription_key_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolMobileApi->toolMobileValidateSubscriptionKey: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_mobile_validate_subscription_key_request** | [**\OpenAPI\Client\Model\ToolMobileValidateSubscriptionKeyRequest**](../Model/ToolMobileValidateSubscriptionKeyRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolMobileValidateSubscriptionKey200Response**](../Model/ToolMobileValidateSubscriptionKey200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
