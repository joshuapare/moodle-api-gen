# OpenAPI\Client\ModUrlApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modUrlGetUrlsByCourses()**](ModUrlApi.md#modUrlGetUrlsByCourses) | **POST** /mod_url_get_urls_by_courses | Returns a list of urls in a provided list of courses, if no list is provided all urls that the user                             can view will be returned. |
| [**modUrlViewUrl()**](ModUrlApi.md#modUrlViewUrl) | **POST** /mod_url_view_url | Trigger the course module viewed event and update the module completion status. |


## `modUrlGetUrlsByCourses()`

```php
modUrlGetUrlsByCourses($mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request): \OpenAPI\Client\Model\ModUrlGetUrlsByCourses200Response
```

Returns a list of urls in a provided list of courses, if no list is provided all urls that the user                             can view will be returned.

Returns a list of urls in a provided list of courses, if no list is provided all urls that the user                             can view will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModUrlApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request = new \OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // \OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest

try {
    $result = $apiInstance->modUrlGetUrlsByCourses($mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModUrlApi->modUrlGetUrlsByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**\OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](../Model/ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModUrlGetUrlsByCourses200Response**](../Model/ModUrlGetUrlsByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modUrlViewUrl()`

```php
modUrlViewUrl($mod_url_view_url_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
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


$apiInstance = new OpenAPI\Client\Api\ModUrlApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_url_view_url_request = new \OpenAPI\Client\Model\ModUrlViewUrlRequest(); // \OpenAPI\Client\Model\ModUrlViewUrlRequest

try {
    $result = $apiInstance->modUrlViewUrl($mod_url_view_url_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModUrlApi->modUrlViewUrl: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_url_view_url_request** | [**\OpenAPI\Client\Model\ModUrlViewUrlRequest**](../Model/ModUrlViewUrlRequest.md)|  | |

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
