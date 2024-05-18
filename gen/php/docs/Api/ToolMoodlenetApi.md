# OpenAPI\Client\ToolMoodlenetApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**toolMoodlenetSearchCourses()**](ToolMoodlenetApi.md#toolMoodlenetSearchCourses) | **POST** /tool_moodlenet_search_courses | For some given input search for a course that matches |
| [**toolMoodlenetVerifyWebfinger()**](ToolMoodlenetApi.md#toolMoodlenetVerifyWebfinger) | **POST** /tool_moodlenet_verify_webfinger | Verify if the passed information resolves into a WebFinger profile URL |


## `toolMoodlenetSearchCourses()`

```php
toolMoodlenetSearchCourses($tool_moodlenet_search_courses_request): \OpenAPI\Client\Model\ToolMoodlenetSearchCourses200Response
```

For some given input search for a course that matches

For some given input search for a course that matches

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolMoodlenetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_moodlenet_search_courses_request = new \OpenAPI\Client\Model\ToolMoodlenetSearchCoursesRequest(); // \OpenAPI\Client\Model\ToolMoodlenetSearchCoursesRequest

try {
    $result = $apiInstance->toolMoodlenetSearchCourses($tool_moodlenet_search_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolMoodlenetApi->toolMoodlenetSearchCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_moodlenet_search_courses_request** | [**\OpenAPI\Client\Model\ToolMoodlenetSearchCoursesRequest**](../Model/ToolMoodlenetSearchCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolMoodlenetSearchCourses200Response**](../Model/ToolMoodlenetSearchCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolMoodlenetVerifyWebfinger()`

```php
toolMoodlenetVerifyWebfinger($tool_moodlenet_verify_webfinger_request): \OpenAPI\Client\Model\ToolMoodlenetVerifyWebfinger200Response
```

Verify if the passed information resolves into a WebFinger profile URL

Verify if the passed information resolves into a WebFinger profile URL

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolMoodlenetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_moodlenet_verify_webfinger_request = new \OpenAPI\Client\Model\ToolMoodlenetVerifyWebfingerRequest(); // \OpenAPI\Client\Model\ToolMoodlenetVerifyWebfingerRequest

try {
    $result = $apiInstance->toolMoodlenetVerifyWebfinger($tool_moodlenet_verify_webfinger_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolMoodlenetApi->toolMoodlenetVerifyWebfinger: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_moodlenet_verify_webfinger_request** | [**\OpenAPI\Client\Model\ToolMoodlenetVerifyWebfingerRequest**](../Model/ToolMoodlenetVerifyWebfingerRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolMoodlenetVerifyWebfinger200Response**](../Model/ToolMoodlenetVerifyWebfinger200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
