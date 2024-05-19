# OpenAPI\Client\ModResourceApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modResourceGetResourcesByCourses()**](ModResourceApi.md#modResourceGetResourcesByCourses) | **POST** /mod_resource_get_resources_by_courses | Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned. |
| [**modResourceViewResource()**](ModResourceApi.md#modResourceViewResource) | **POST** /mod_resource_view_resource | Simulate the view.php web interface resource: trigger events, completion, etc... |


## `modResourceGetResourcesByCourses()`

```php
modResourceGetResourcesByCourses($mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request): \OpenAPI\Client\Model\ModResourceGetResourcesByCourses200Response
```

Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.

Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModResourceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request = new \OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // \OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest

try {
    $result = $apiInstance->modResourceGetResourcesByCourses($mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModResourceApi->modResourceGetResourcesByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**\OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](../Model/ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModResourceGetResourcesByCourses200Response**](../Model/ModResourceGetResourcesByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modResourceViewResource()`

```php
modResourceViewResource($mod_resource_view_resource_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Simulate the view.php web interface resource: trigger events, completion, etc...

Simulate the view.php web interface resource: trigger events, completion, etc...

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModResourceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_resource_view_resource_request = new \OpenAPI\Client\Model\ModResourceViewResourceRequest(); // \OpenAPI\Client\Model\ModResourceViewResourceRequest

try {
    $result = $apiInstance->modResourceViewResource($mod_resource_view_resource_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModResourceApi->modResourceViewResource: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_resource_view_resource_request** | [**\OpenAPI\Client\Model\ModResourceViewResourceRequest**](../Model/ModResourceViewResourceRequest.md)|  | |

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
