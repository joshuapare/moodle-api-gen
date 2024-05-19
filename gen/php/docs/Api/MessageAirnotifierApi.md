# OpenAPI\Client\MessageAirnotifierApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**messageAirnotifierAreNotificationPreferencesConfigured()**](MessageAirnotifierApi.md#messageAirnotifierAreNotificationPreferencesConfigured) | **POST** /message_airnotifier_are_notification_preferences_configured | Check if the users have notification preferences configured yet |
| [**messageAirnotifierEnableDevice()**](MessageAirnotifierApi.md#messageAirnotifierEnableDevice) | **POST** /message_airnotifier_enable_device | Enables or disables a registered user device so it can receive Push notifications |
| [**messageAirnotifierGetUserDevices()**](MessageAirnotifierApi.md#messageAirnotifierGetUserDevices) | **POST** /message_airnotifier_get_user_devices | Return the list of mobile devices that are registered in Moodle for the given user |
| [**messageAirnotifierIsSystemConfigured()**](MessageAirnotifierApi.md#messageAirnotifierIsSystemConfigured) | **POST** /message_airnotifier_is_system_configured | Check whether the airnotifier settings have been configured |


## `messageAirnotifierAreNotificationPreferencesConfigured()`

```php
messageAirnotifierAreNotificationPreferencesConfigured($message_airnotifier_are_notification_preferences_configured_request): \OpenAPI\Client\Model\MessageAirnotifierAreNotificationPreferencesConfigured200Response
```

Check if the users have notification preferences configured yet

Check if the users have notification preferences configured yet

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MessageAirnotifierApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$message_airnotifier_are_notification_preferences_configured_request = new \OpenAPI\Client\Model\MessageAirnotifierAreNotificationPreferencesConfiguredRequest(); // \OpenAPI\Client\Model\MessageAirnotifierAreNotificationPreferencesConfiguredRequest

try {
    $result = $apiInstance->messageAirnotifierAreNotificationPreferencesConfigured($message_airnotifier_are_notification_preferences_configured_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessageAirnotifierApi->messageAirnotifierAreNotificationPreferencesConfigured: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **message_airnotifier_are_notification_preferences_configured_request** | [**\OpenAPI\Client\Model\MessageAirnotifierAreNotificationPreferencesConfiguredRequest**](../Model/MessageAirnotifierAreNotificationPreferencesConfiguredRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\MessageAirnotifierAreNotificationPreferencesConfigured200Response**](../Model/MessageAirnotifierAreNotificationPreferencesConfigured200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `messageAirnotifierEnableDevice()`

```php
messageAirnotifierEnableDevice($message_airnotifier_enable_device_request): \OpenAPI\Client\Model\MessageAirnotifierEnableDevice200Response
```

Enables or disables a registered user device so it can receive Push notifications

Enables or disables a registered user device so it can receive Push notifications

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MessageAirnotifierApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$message_airnotifier_enable_device_request = new \OpenAPI\Client\Model\MessageAirnotifierEnableDeviceRequest(); // \OpenAPI\Client\Model\MessageAirnotifierEnableDeviceRequest

try {
    $result = $apiInstance->messageAirnotifierEnableDevice($message_airnotifier_enable_device_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessageAirnotifierApi->messageAirnotifierEnableDevice: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **message_airnotifier_enable_device_request** | [**\OpenAPI\Client\Model\MessageAirnotifierEnableDeviceRequest**](../Model/MessageAirnotifierEnableDeviceRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\MessageAirnotifierEnableDevice200Response**](../Model/MessageAirnotifierEnableDevice200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `messageAirnotifierGetUserDevices()`

```php
messageAirnotifierGetUserDevices($message_airnotifier_get_user_devices_request): \OpenAPI\Client\Model\MessageAirnotifierGetUserDevices200Response
```

Return the list of mobile devices that are registered in Moodle for the given user

Return the list of mobile devices that are registered in Moodle for the given user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MessageAirnotifierApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$message_airnotifier_get_user_devices_request = new \OpenAPI\Client\Model\MessageAirnotifierGetUserDevicesRequest(); // \OpenAPI\Client\Model\MessageAirnotifierGetUserDevicesRequest

try {
    $result = $apiInstance->messageAirnotifierGetUserDevices($message_airnotifier_get_user_devices_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessageAirnotifierApi->messageAirnotifierGetUserDevices: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **message_airnotifier_get_user_devices_request** | [**\OpenAPI\Client\Model\MessageAirnotifierGetUserDevicesRequest**](../Model/MessageAirnotifierGetUserDevicesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\MessageAirnotifierGetUserDevices200Response**](../Model/MessageAirnotifierGetUserDevices200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `messageAirnotifierIsSystemConfigured()`

```php
messageAirnotifierIsSystemConfigured(): object
```

Check whether the airnotifier settings have been configured

Check whether the airnotifier settings have been configured

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MessageAirnotifierApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->messageAirnotifierIsSystemConfigured();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessageAirnotifierApi->messageAirnotifierIsSystemConfigured: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
