# OpenAPI\Client\BlockStarredcoursesApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**blockStarredcoursesGetStarredCourses()**](BlockStarredcoursesApi.md#blockStarredcoursesGetStarredCourses) | **POST** /block_starredcourses_get_starred_courses | Get users starred courses. |


## `blockStarredcoursesGetStarredCourses()`

```php
blockStarredcoursesGetStarredCourses($block_starredcourses_get_starred_courses_request): object
```

Get users starred courses.

Get users starred courses.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockStarredcoursesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_starredcourses_get_starred_courses_request = new \OpenAPI\Client\Model\BlockStarredcoursesGetStarredCoursesRequest(); // \OpenAPI\Client\Model\BlockStarredcoursesGetStarredCoursesRequest

try {
    $result = $apiInstance->blockStarredcoursesGetStarredCourses($block_starredcourses_get_starred_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockStarredcoursesApi->blockStarredcoursesGetStarredCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_starredcourses_get_starred_courses_request** | [**\OpenAPI\Client\Model\BlockStarredcoursesGetStarredCoursesRequest**](../Model/BlockStarredcoursesGetStarredCoursesRequest.md)|  | |

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
