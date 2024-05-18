# OpenAPI\Client\MessagePopupApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**messagePopupGetPopupNotifications()**](MessagePopupApi.md#messagePopupGetPopupNotifications) | **POST** /message_popup_get_popup_notifications | Retrieve a list of popup notifications for a user |
| [**messagePopupGetUnreadPopupNotificationCount()**](MessagePopupApi.md#messagePopupGetUnreadPopupNotificationCount) | **POST** /message_popup_get_unread_popup_notification_count | Retrieve the count of unread popup notifications for a given user |


## `messagePopupGetPopupNotifications()`

```php
messagePopupGetPopupNotifications($message_popup_get_popup_notifications_request): \OpenAPI\Client\Model\MessagePopupGetPopupNotifications200Response
```

Retrieve a list of popup notifications for a user

Retrieve a list of popup notifications for a user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MessagePopupApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$message_popup_get_popup_notifications_request = new \OpenAPI\Client\Model\MessagePopupGetPopupNotificationsRequest(); // \OpenAPI\Client\Model\MessagePopupGetPopupNotificationsRequest

try {
    $result = $apiInstance->messagePopupGetPopupNotifications($message_popup_get_popup_notifications_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessagePopupApi->messagePopupGetPopupNotifications: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **message_popup_get_popup_notifications_request** | [**\OpenAPI\Client\Model\MessagePopupGetPopupNotificationsRequest**](../Model/MessagePopupGetPopupNotificationsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\MessagePopupGetPopupNotifications200Response**](../Model/MessagePopupGetPopupNotifications200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `messagePopupGetUnreadPopupNotificationCount()`

```php
messagePopupGetUnreadPopupNotificationCount($core_message_get_unread_conversations_count_request): object
```

Retrieve the count of unread popup notifications for a given user

Retrieve the count of unread popup notifications for a given user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MessagePopupApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_unread_conversations_count_request = new \OpenAPI\Client\Model\CoreMessageGetUnreadConversationsCountRequest(); // \OpenAPI\Client\Model\CoreMessageGetUnreadConversationsCountRequest

try {
    $result = $apiInstance->messagePopupGetUnreadPopupNotificationCount($core_message_get_unread_conversations_count_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessagePopupApi->messagePopupGetUnreadPopupNotificationCount: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_unread_conversations_count_request** | [**\OpenAPI\Client\Model\CoreMessageGetUnreadConversationsCountRequest**](../Model/CoreMessageGetUnreadConversationsCountRequest.md)|  | |

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
