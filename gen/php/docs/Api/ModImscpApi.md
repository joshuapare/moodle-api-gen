# OpenAPI\Client\ModImscpApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modImscpGetImscpsByCourses()**](ModImscpApi.md#modImscpGetImscpsByCourses) | **POST** /mod_imscp_get_imscps_by_courses | Returns a list of IMSCP instances in a provided set of courses,                             if no courses are provided then all the IMSCP instances the user has access to will be returned. |
| [**modImscpViewImscp()**](ModImscpApi.md#modImscpViewImscp) | **POST** /mod_imscp_view_imscp | Simulate the view.php web interface imscp: trigger events, completion, etc... |


## `modImscpGetImscpsByCourses()`

```php
modImscpGetImscpsByCourses($mod_chat_get_chats_by_courses_request): \OpenAPI\Client\Model\ModImscpGetImscpsByCourses200Response
```

Returns a list of IMSCP instances in a provided set of courses,                             if no courses are provided then all the IMSCP instances the user has access to will be returned.

Returns a list of IMSCP instances in a provided set of courses,                             if no courses are provided then all the IMSCP instances the user has access to will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModImscpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_get_chats_by_courses_request = new \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest(); // \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest

try {
    $result = $apiInstance->modImscpGetImscpsByCourses($mod_chat_get_chats_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModImscpApi->modImscpGetImscpsByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_get_chats_by_courses_request** | [**\OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest**](../Model/ModChatGetChatsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModImscpGetImscpsByCourses200Response**](../Model/ModImscpGetImscpsByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modImscpViewImscp()`

```php
modImscpViewImscp($mod_imscp_view_imscp_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Simulate the view.php web interface imscp: trigger events, completion, etc...

Simulate the view.php web interface imscp: trigger events, completion, etc...

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModImscpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_imscp_view_imscp_request = new \OpenAPI\Client\Model\ModImscpViewImscpRequest(); // \OpenAPI\Client\Model\ModImscpViewImscpRequest

try {
    $result = $apiInstance->modImscpViewImscp($mod_imscp_view_imscp_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModImscpApi->modImscpViewImscp: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_imscp_view_imscp_request** | [**\OpenAPI\Client\Model\ModImscpViewImscpRequest**](../Model/ModImscpViewImscpRequest.md)|  | |

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
