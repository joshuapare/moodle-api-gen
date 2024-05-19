# OpenAPI\Client\ModFolderApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modFolderGetFoldersByCourses()**](ModFolderApi.md#modFolderGetFoldersByCourses) | **POST** /mod_folder_get_folders_by_courses | Returns a list of folders in a provided list of courses, if no list is provided all folders that                             the user can view will be returned. Please note that this WS is not returning the folder contents. |
| [**modFolderViewFolder()**](ModFolderApi.md#modFolderViewFolder) | **POST** /mod_folder_view_folder | Simulate the view.php web interface folder: trigger events, completion, etc... |


## `modFolderGetFoldersByCourses()`

```php
modFolderGetFoldersByCourses($mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request): \OpenAPI\Client\Model\ModFolderGetFoldersByCourses200Response
```

Returns a list of folders in a provided list of courses, if no list is provided all folders that                             the user can view will be returned. Please note that this WS is not returning the folder contents.

Returns a list of folders in a provided list of courses, if no list is provided all folders that                             the user can view will be returned. Please note that this WS is not returning the folder contents.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModFolderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request = new \OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // \OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest

try {
    $result = $apiInstance->modFolderGetFoldersByCourses($mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModFolderApi->modFolderGetFoldersByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**\OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](../Model/ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModFolderGetFoldersByCourses200Response**](../Model/ModFolderGetFoldersByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modFolderViewFolder()`

```php
modFolderViewFolder($mod_folder_view_folder_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Simulate the view.php web interface folder: trigger events, completion, etc...

Simulate the view.php web interface folder: trigger events, completion, etc...

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModFolderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_folder_view_folder_request = new \OpenAPI\Client\Model\ModFolderViewFolderRequest(); // \OpenAPI\Client\Model\ModFolderViewFolderRequest

try {
    $result = $apiInstance->modFolderViewFolder($mod_folder_view_folder_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModFolderApi->modFolderViewFolder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_folder_view_folder_request** | [**\OpenAPI\Client\Model\ModFolderViewFolderRequest**](../Model/ModFolderViewFolderRequest.md)|  | |

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
