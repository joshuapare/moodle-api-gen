# OpenAPI\Client\ModChoiceApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modChoiceDeleteChoiceResponses()**](ModChoiceApi.md#modChoiceDeleteChoiceResponses) | **POST** /mod_choice_delete_choice_responses | Delete the given submitted responses in a choice |
| [**modChoiceGetChoiceOptions()**](ModChoiceApi.md#modChoiceGetChoiceOptions) | **POST** /mod_choice_get_choice_options | Retrieve options for a specific choice. |
| [**modChoiceGetChoiceResults()**](ModChoiceApi.md#modChoiceGetChoiceResults) | **POST** /mod_choice_get_choice_results | Retrieve users results for a given choice. |
| [**modChoiceGetChoicesByCourses()**](ModChoiceApi.md#modChoiceGetChoicesByCourses) | **POST** /mod_choice_get_choices_by_courses | Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned. |
| [**modChoiceSubmitChoiceResponse()**](ModChoiceApi.md#modChoiceSubmitChoiceResponse) | **POST** /mod_choice_submit_choice_response | Submit responses to a specific choice item. |
| [**modChoiceViewChoice()**](ModChoiceApi.md#modChoiceViewChoice) | **POST** /mod_choice_view_choice | Trigger the course module viewed event and update the module completion status. |


## `modChoiceDeleteChoiceResponses()`

```php
modChoiceDeleteChoiceResponses($mod_choice_delete_choice_responses_request): \OpenAPI\Client\Model\ModChoiceDeleteChoiceResponses200Response
```

Delete the given submitted responses in a choice

Delete the given submitted responses in a choice

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModChoiceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_choice_delete_choice_responses_request = new \OpenAPI\Client\Model\ModChoiceDeleteChoiceResponsesRequest(); // \OpenAPI\Client\Model\ModChoiceDeleteChoiceResponsesRequest

try {
    $result = $apiInstance->modChoiceDeleteChoiceResponses($mod_choice_delete_choice_responses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModChoiceApi->modChoiceDeleteChoiceResponses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_choice_delete_choice_responses_request** | [**\OpenAPI\Client\Model\ModChoiceDeleteChoiceResponsesRequest**](../Model/ModChoiceDeleteChoiceResponsesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModChoiceDeleteChoiceResponses200Response**](../Model/ModChoiceDeleteChoiceResponses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modChoiceGetChoiceOptions()`

```php
modChoiceGetChoiceOptions($mod_choice_get_choice_options_request): \OpenAPI\Client\Model\ModChoiceGetChoiceOptions200Response
```

Retrieve options for a specific choice.

Retrieve options for a specific choice.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModChoiceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_choice_get_choice_options_request = new \OpenAPI\Client\Model\ModChoiceGetChoiceOptionsRequest(); // \OpenAPI\Client\Model\ModChoiceGetChoiceOptionsRequest

try {
    $result = $apiInstance->modChoiceGetChoiceOptions($mod_choice_get_choice_options_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModChoiceApi->modChoiceGetChoiceOptions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_choice_get_choice_options_request** | [**\OpenAPI\Client\Model\ModChoiceGetChoiceOptionsRequest**](../Model/ModChoiceGetChoiceOptionsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModChoiceGetChoiceOptions200Response**](../Model/ModChoiceGetChoiceOptions200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modChoiceGetChoiceResults()`

```php
modChoiceGetChoiceResults($mod_choice_get_choice_options_request): \OpenAPI\Client\Model\ModChoiceGetChoiceResults200Response
```

Retrieve users results for a given choice.

Retrieve users results for a given choice.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModChoiceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_choice_get_choice_options_request = new \OpenAPI\Client\Model\ModChoiceGetChoiceOptionsRequest(); // \OpenAPI\Client\Model\ModChoiceGetChoiceOptionsRequest

try {
    $result = $apiInstance->modChoiceGetChoiceResults($mod_choice_get_choice_options_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModChoiceApi->modChoiceGetChoiceResults: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_choice_get_choice_options_request** | [**\OpenAPI\Client\Model\ModChoiceGetChoiceOptionsRequest**](../Model/ModChoiceGetChoiceOptionsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModChoiceGetChoiceResults200Response**](../Model/ModChoiceGetChoiceResults200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modChoiceGetChoicesByCourses()`

```php
modChoiceGetChoicesByCourses($mod_chat_get_chats_by_courses_request): \OpenAPI\Client\Model\ModChoiceGetChoicesByCourses200Response
```

Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.

Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModChoiceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_get_chats_by_courses_request = new \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest(); // \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest

try {
    $result = $apiInstance->modChoiceGetChoicesByCourses($mod_chat_get_chats_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModChoiceApi->modChoiceGetChoicesByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_get_chats_by_courses_request** | [**\OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest**](../Model/ModChatGetChatsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModChoiceGetChoicesByCourses200Response**](../Model/ModChoiceGetChoicesByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modChoiceSubmitChoiceResponse()`

```php
modChoiceSubmitChoiceResponse($mod_choice_submit_choice_response_request): \OpenAPI\Client\Model\ModChoiceSubmitChoiceResponse200Response
```

Submit responses to a specific choice item.

Submit responses to a specific choice item.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModChoiceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_choice_submit_choice_response_request = new \OpenAPI\Client\Model\ModChoiceSubmitChoiceResponseRequest(); // \OpenAPI\Client\Model\ModChoiceSubmitChoiceResponseRequest

try {
    $result = $apiInstance->modChoiceSubmitChoiceResponse($mod_choice_submit_choice_response_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModChoiceApi->modChoiceSubmitChoiceResponse: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_choice_submit_choice_response_request** | [**\OpenAPI\Client\Model\ModChoiceSubmitChoiceResponseRequest**](../Model/ModChoiceSubmitChoiceResponseRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModChoiceSubmitChoiceResponse200Response**](../Model/ModChoiceSubmitChoiceResponse200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modChoiceViewChoice()`

```php
modChoiceViewChoice($mod_choice_get_choice_options_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
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


$apiInstance = new OpenAPI\Client\Api\ModChoiceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_choice_get_choice_options_request = new \OpenAPI\Client\Model\ModChoiceGetChoiceOptionsRequest(); // \OpenAPI\Client\Model\ModChoiceGetChoiceOptionsRequest

try {
    $result = $apiInstance->modChoiceViewChoice($mod_choice_get_choice_options_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModChoiceApi->modChoiceViewChoice: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_choice_get_choice_options_request** | [**\OpenAPI\Client\Model\ModChoiceGetChoiceOptionsRequest**](../Model/ModChoiceGetChoiceOptionsRequest.md)|  | |

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
