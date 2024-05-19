# OpenAPI\Client\ToolUsertoursApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**toolUsertoursCompleteTour()**](ToolUsertoursApi.md#toolUsertoursCompleteTour) | **POST** /tool_usertours_complete_tour | Mark the specified tour as completed for the current user |
| [**toolUsertoursFetchAndStartTour()**](ToolUsertoursApi.md#toolUsertoursFetchAndStartTour) | **POST** /tool_usertours_fetch_and_start_tour | Fetch the specified tour |
| [**toolUsertoursResetTour()**](ToolUsertoursApi.md#toolUsertoursResetTour) | **POST** /tool_usertours_reset_tour | Remove the specified tour |
| [**toolUsertoursStepShown()**](ToolUsertoursApi.md#toolUsertoursStepShown) | **POST** /tool_usertours_step_shown | Mark the specified step as completed for the current user |


## `toolUsertoursCompleteTour()`

```php
toolUsertoursCompleteTour($tool_usertours_complete_tour_request): object
```

Mark the specified tour as completed for the current user

Mark the specified tour as completed for the current user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolUsertoursApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_usertours_complete_tour_request = new \OpenAPI\Client\Model\ToolUsertoursCompleteTourRequest(); // \OpenAPI\Client\Model\ToolUsertoursCompleteTourRequest

try {
    $result = $apiInstance->toolUsertoursCompleteTour($tool_usertours_complete_tour_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolUsertoursApi->toolUsertoursCompleteTour: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_usertours_complete_tour_request** | [**\OpenAPI\Client\Model\ToolUsertoursCompleteTourRequest**](../Model/ToolUsertoursCompleteTourRequest.md)|  | |

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

## `toolUsertoursFetchAndStartTour()`

```php
toolUsertoursFetchAndStartTour($tool_usertours_fetch_and_start_tour_request): \OpenAPI\Client\Model\ToolUsertoursFetchAndStartTour200Response
```

Fetch the specified tour

Fetch the specified tour

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolUsertoursApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_usertours_fetch_and_start_tour_request = new \OpenAPI\Client\Model\ToolUsertoursFetchAndStartTourRequest(); // \OpenAPI\Client\Model\ToolUsertoursFetchAndStartTourRequest

try {
    $result = $apiInstance->toolUsertoursFetchAndStartTour($tool_usertours_fetch_and_start_tour_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolUsertoursApi->toolUsertoursFetchAndStartTour: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_usertours_fetch_and_start_tour_request** | [**\OpenAPI\Client\Model\ToolUsertoursFetchAndStartTourRequest**](../Model/ToolUsertoursFetchAndStartTourRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolUsertoursFetchAndStartTour200Response**](../Model/ToolUsertoursFetchAndStartTour200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolUsertoursResetTour()`

```php
toolUsertoursResetTour($tool_usertours_reset_tour_request): \OpenAPI\Client\Model\ToolUsertoursResetTour200Response
```

Remove the specified tour

Remove the specified tour

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolUsertoursApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_usertours_reset_tour_request = new \OpenAPI\Client\Model\ToolUsertoursResetTourRequest(); // \OpenAPI\Client\Model\ToolUsertoursResetTourRequest

try {
    $result = $apiInstance->toolUsertoursResetTour($tool_usertours_reset_tour_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolUsertoursApi->toolUsertoursResetTour: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_usertours_reset_tour_request** | [**\OpenAPI\Client\Model\ToolUsertoursResetTourRequest**](../Model/ToolUsertoursResetTourRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolUsertoursResetTour200Response**](../Model/ToolUsertoursResetTour200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolUsertoursStepShown()`

```php
toolUsertoursStepShown($tool_usertours_step_shown_request): object
```

Mark the specified step as completed for the current user

Mark the specified step as completed for the current user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolUsertoursApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_usertours_step_shown_request = new \OpenAPI\Client\Model\ToolUsertoursStepShownRequest(); // \OpenAPI\Client\Model\ToolUsertoursStepShownRequest

try {
    $result = $apiInstance->toolUsertoursStepShown($tool_usertours_step_shown_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolUsertoursApi->toolUsertoursStepShown: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_usertours_step_shown_request** | [**\OpenAPI\Client\Model\ToolUsertoursStepShownRequest**](../Model/ToolUsertoursStepShownRequest.md)|  | |

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
