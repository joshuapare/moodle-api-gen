# OpenAPI\Client\ModChatApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modChatGetChatLatestMessages()**](ModChatApi.md#modChatGetChatLatestMessages) | **POST** /mod_chat_get_chat_latest_messages | Get the latest messages from the given chat session. |
| [**modChatGetChatUsers()**](ModChatApi.md#modChatGetChatUsers) | **POST** /mod_chat_get_chat_users | Get the list of users in the given chat session. |
| [**modChatGetChatsByCourses()**](ModChatApi.md#modChatGetChatsByCourses) | **POST** /mod_chat_get_chats_by_courses | Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned. |
| [**modChatGetSessionMessages()**](ModChatApi.md#modChatGetSessionMessages) | **POST** /mod_chat_get_session_messages | Retrieves messages of the given chat session. |
| [**modChatGetSessions()**](ModChatApi.md#modChatGetSessions) | **POST** /mod_chat_get_sessions | Retrieves chat sessions for a given chat. |
| [**modChatLoginUser()**](ModChatApi.md#modChatLoginUser) | **POST** /mod_chat_login_user | Log a user into a chat room in the given chat. |
| [**modChatSendChatMessage()**](ModChatApi.md#modChatSendChatMessage) | **POST** /mod_chat_send_chat_message | Send a message on the given chat session. |
| [**modChatViewChat()**](ModChatApi.md#modChatViewChat) | **POST** /mod_chat_view_chat | Trigger the course module viewed event and update the module completion status. |
| [**modChatViewSessions()**](ModChatApi.md#modChatViewSessions) | **POST** /mod_chat_view_sessions | Trigger the chat session viewed event. |


## `modChatGetChatLatestMessages()`

```php
modChatGetChatLatestMessages($mod_chat_get_chat_latest_messages_request): \OpenAPI\Client\Model\ModChatGetChatLatestMessages200Response
```

Get the latest messages from the given chat session.

Get the latest messages from the given chat session.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_get_chat_latest_messages_request = new \OpenAPI\Client\Model\ModChatGetChatLatestMessagesRequest(); // \OpenAPI\Client\Model\ModChatGetChatLatestMessagesRequest

try {
    $result = $apiInstance->modChatGetChatLatestMessages($mod_chat_get_chat_latest_messages_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModChatApi->modChatGetChatLatestMessages: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_get_chat_latest_messages_request** | [**\OpenAPI\Client\Model\ModChatGetChatLatestMessagesRequest**](../Model/ModChatGetChatLatestMessagesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModChatGetChatLatestMessages200Response**](../Model/ModChatGetChatLatestMessages200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modChatGetChatUsers()`

```php
modChatGetChatUsers($mod_chat_get_chat_users_request): \OpenAPI\Client\Model\ModChatGetChatUsers200Response
```

Get the list of users in the given chat session.

Get the list of users in the given chat session.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_get_chat_users_request = new \OpenAPI\Client\Model\ModChatGetChatUsersRequest(); // \OpenAPI\Client\Model\ModChatGetChatUsersRequest

try {
    $result = $apiInstance->modChatGetChatUsers($mod_chat_get_chat_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModChatApi->modChatGetChatUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_get_chat_users_request** | [**\OpenAPI\Client\Model\ModChatGetChatUsersRequest**](../Model/ModChatGetChatUsersRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModChatGetChatUsers200Response**](../Model/ModChatGetChatUsers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modChatGetChatsByCourses()`

```php
modChatGetChatsByCourses($mod_chat_get_chats_by_courses_request): \OpenAPI\Client\Model\ModChatGetChatsByCourses200Response
```

Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.

Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_get_chats_by_courses_request = new \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest(); // \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest

try {
    $result = $apiInstance->modChatGetChatsByCourses($mod_chat_get_chats_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModChatApi->modChatGetChatsByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_get_chats_by_courses_request** | [**\OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest**](../Model/ModChatGetChatsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModChatGetChatsByCourses200Response**](../Model/ModChatGetChatsByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modChatGetSessionMessages()`

```php
modChatGetSessionMessages($mod_chat_get_session_messages_request): \OpenAPI\Client\Model\ModChatGetSessionMessages200Response
```

Retrieves messages of the given chat session.

Retrieves messages of the given chat session.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_get_session_messages_request = new \OpenAPI\Client\Model\ModChatGetSessionMessagesRequest(); // \OpenAPI\Client\Model\ModChatGetSessionMessagesRequest

try {
    $result = $apiInstance->modChatGetSessionMessages($mod_chat_get_session_messages_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModChatApi->modChatGetSessionMessages: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_get_session_messages_request** | [**\OpenAPI\Client\Model\ModChatGetSessionMessagesRequest**](../Model/ModChatGetSessionMessagesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModChatGetSessionMessages200Response**](../Model/ModChatGetSessionMessages200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modChatGetSessions()`

```php
modChatGetSessions($mod_chat_get_sessions_request): \OpenAPI\Client\Model\ModChatGetSessions200Response
```

Retrieves chat sessions for a given chat.

Retrieves chat sessions for a given chat.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_get_sessions_request = new \OpenAPI\Client\Model\ModChatGetSessionsRequest(); // \OpenAPI\Client\Model\ModChatGetSessionsRequest

try {
    $result = $apiInstance->modChatGetSessions($mod_chat_get_sessions_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModChatApi->modChatGetSessions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_get_sessions_request** | [**\OpenAPI\Client\Model\ModChatGetSessionsRequest**](../Model/ModChatGetSessionsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModChatGetSessions200Response**](../Model/ModChatGetSessions200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modChatLoginUser()`

```php
modChatLoginUser($mod_chat_login_user_request): \OpenAPI\Client\Model\ModChatLoginUser200Response
```

Log a user into a chat room in the given chat.

Log a user into a chat room in the given chat.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_login_user_request = new \OpenAPI\Client\Model\ModChatLoginUserRequest(); // \OpenAPI\Client\Model\ModChatLoginUserRequest

try {
    $result = $apiInstance->modChatLoginUser($mod_chat_login_user_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModChatApi->modChatLoginUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_login_user_request** | [**\OpenAPI\Client\Model\ModChatLoginUserRequest**](../Model/ModChatLoginUserRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModChatLoginUser200Response**](../Model/ModChatLoginUser200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modChatSendChatMessage()`

```php
modChatSendChatMessage($mod_chat_send_chat_message_request): \OpenAPI\Client\Model\ModChatSendChatMessage200Response
```

Send a message on the given chat session.

Send a message on the given chat session.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_send_chat_message_request = new \OpenAPI\Client\Model\ModChatSendChatMessageRequest(); // \OpenAPI\Client\Model\ModChatSendChatMessageRequest

try {
    $result = $apiInstance->modChatSendChatMessage($mod_chat_send_chat_message_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModChatApi->modChatSendChatMessage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_send_chat_message_request** | [**\OpenAPI\Client\Model\ModChatSendChatMessageRequest**](../Model/ModChatSendChatMessageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModChatSendChatMessage200Response**](../Model/ModChatSendChatMessage200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modChatViewChat()`

```php
modChatViewChat($mod_chat_view_chat_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_view_chat_request = new \OpenAPI\Client\Model\ModChatViewChatRequest(); // \OpenAPI\Client\Model\ModChatViewChatRequest

try {
    $result = $apiInstance->modChatViewChat($mod_chat_view_chat_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModChatApi->modChatViewChat: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_view_chat_request** | [**\OpenAPI\Client\Model\ModChatViewChatRequest**](../Model/ModChatViewChatRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response**](../Model/CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modChatViewSessions()`

```php
modChatViewSessions($mod_chat_view_sessions_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Trigger the chat session viewed event.

Trigger the chat session viewed event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_view_sessions_request = new \OpenAPI\Client\Model\ModChatViewSessionsRequest(); // \OpenAPI\Client\Model\ModChatViewSessionsRequest

try {
    $result = $apiInstance->modChatViewSessions($mod_chat_view_sessions_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModChatApi->modChatViewSessions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_view_sessions_request** | [**\OpenAPI\Client\Model\ModChatViewSessionsRequest**](../Model/ModChatViewSessionsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response**](../Model/CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
