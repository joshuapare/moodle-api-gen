# OpenAPI\Client\GradereportSingleviewApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**gradereportSingleviewGetGradeItemsForSearchWidget()**](GradereportSingleviewApi.md#gradereportSingleviewGetGradeItemsForSearchWidget) | **POST** /gradereport_singleview_get_grade_items_for_search_widget | Get the gradeitem/(s) for a course |


## `gradereportSingleviewGetGradeItemsForSearchWidget()`

```php
gradereportSingleviewGetGradeItemsForSearchWidget($core_grades_get_groups_for_search_widget_request): \OpenAPI\Client\Model\GradereportSingleviewGetGradeItemsForSearchWidget200Response
```

Get the gradeitem/(s) for a course

Get the gradeitem/(s) for a course

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\GradereportSingleviewApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grades_get_groups_for_search_widget_request = new \OpenAPI\Client\Model\CoreGradesGetGroupsForSearchWidgetRequest(); // \OpenAPI\Client\Model\CoreGradesGetGroupsForSearchWidgetRequest

try {
    $result = $apiInstance->gradereportSingleviewGetGradeItemsForSearchWidget($core_grades_get_groups_for_search_widget_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GradereportSingleviewApi->gradereportSingleviewGetGradeItemsForSearchWidget: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grades_get_groups_for_search_widget_request** | [**\OpenAPI\Client\Model\CoreGradesGetGroupsForSearchWidgetRequest**](../Model/CoreGradesGetGroupsForSearchWidgetRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\GradereportSingleviewGetGradeItemsForSearchWidget200Response**](../Model/GradereportSingleviewGetGradeItemsForSearchWidget200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
