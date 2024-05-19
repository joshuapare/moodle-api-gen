# OpenAPI\Client\TinyAutosaveApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**tinyAutosaveResetSession()**](TinyAutosaveApi.md#tinyAutosaveResetSession) | **POST** /tiny_autosave_reset_session | Reset an autosave session |
| [**tinyAutosaveResumeSession()**](TinyAutosaveApi.md#tinyAutosaveResumeSession) | **POST** /tiny_autosave_resume_session | Resume an autosave session |
| [**tinyAutosaveUpdateSession()**](TinyAutosaveApi.md#tinyAutosaveUpdateSession) | **POST** /tiny_autosave_update_session | Update an autosave session |


## `tinyAutosaveResetSession()`

```php
tinyAutosaveResetSession($tiny_autosave_reset_session_request): object
```

Reset an autosave session

Reset an autosave session

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\TinyAutosaveApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tiny_autosave_reset_session_request = new \OpenAPI\Client\Model\TinyAutosaveResetSessionRequest(); // \OpenAPI\Client\Model\TinyAutosaveResetSessionRequest

try {
    $result = $apiInstance->tinyAutosaveResetSession($tiny_autosave_reset_session_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TinyAutosaveApi->tinyAutosaveResetSession: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tiny_autosave_reset_session_request** | [**\OpenAPI\Client\Model\TinyAutosaveResetSessionRequest**](../Model/TinyAutosaveResetSessionRequest.md)|  | |

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

## `tinyAutosaveResumeSession()`

```php
tinyAutosaveResumeSession($tiny_autosave_resume_session_request): \OpenAPI\Client\Model\TinyAutosaveResumeSession200Response
```

Resume an autosave session

Resume an autosave session

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\TinyAutosaveApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tiny_autosave_resume_session_request = new \OpenAPI\Client\Model\TinyAutosaveResumeSessionRequest(); // \OpenAPI\Client\Model\TinyAutosaveResumeSessionRequest

try {
    $result = $apiInstance->tinyAutosaveResumeSession($tiny_autosave_resume_session_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TinyAutosaveApi->tinyAutosaveResumeSession: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tiny_autosave_resume_session_request** | [**\OpenAPI\Client\Model\TinyAutosaveResumeSessionRequest**](../Model/TinyAutosaveResumeSessionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\TinyAutosaveResumeSession200Response**](../Model/TinyAutosaveResumeSession200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `tinyAutosaveUpdateSession()`

```php
tinyAutosaveUpdateSession($tiny_autosave_update_session_request): object
```

Update an autosave session

Update an autosave session

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\TinyAutosaveApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tiny_autosave_update_session_request = new \OpenAPI\Client\Model\TinyAutosaveUpdateSessionRequest(); // \OpenAPI\Client\Model\TinyAutosaveUpdateSessionRequest

try {
    $result = $apiInstance->tinyAutosaveUpdateSession($tiny_autosave_update_session_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TinyAutosaveApi->tinyAutosaveUpdateSession: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tiny_autosave_update_session_request** | [**\OpenAPI\Client\Model\TinyAutosaveUpdateSessionRequest**](../Model/TinyAutosaveUpdateSessionRequest.md)|  | |

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
