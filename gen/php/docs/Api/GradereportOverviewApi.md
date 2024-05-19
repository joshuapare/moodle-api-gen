# OpenAPI\Client\GradereportOverviewApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**gradereportOverviewGetCourseGrades()**](GradereportOverviewApi.md#gradereportOverviewGetCourseGrades) | **POST** /gradereport_overview_get_course_grades | Get the given user courses final grades |
| [**gradereportOverviewViewGradeReport()**](GradereportOverviewApi.md#gradereportOverviewViewGradeReport) | **POST** /gradereport_overview_view_grade_report | Trigger the report view event |


## `gradereportOverviewGetCourseGrades()`

```php
gradereportOverviewGetCourseGrades($gradereport_overview_get_course_grades_request): \OpenAPI\Client\Model\GradereportOverviewGetCourseGrades200Response
```

Get the given user courses final grades

Get the given user courses final grades

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\GradereportOverviewApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$gradereport_overview_get_course_grades_request = new \OpenAPI\Client\Model\GradereportOverviewGetCourseGradesRequest(); // \OpenAPI\Client\Model\GradereportOverviewGetCourseGradesRequest

try {
    $result = $apiInstance->gradereportOverviewGetCourseGrades($gradereport_overview_get_course_grades_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GradereportOverviewApi->gradereportOverviewGetCourseGrades: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **gradereport_overview_get_course_grades_request** | [**\OpenAPI\Client\Model\GradereportOverviewGetCourseGradesRequest**](../Model/GradereportOverviewGetCourseGradesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\GradereportOverviewGetCourseGrades200Response**](../Model/GradereportOverviewGetCourseGrades200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `gradereportOverviewViewGradeReport()`

```php
gradereportOverviewViewGradeReport($gradereport_overview_view_grade_report_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Trigger the report view event

Trigger the report view event

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\GradereportOverviewApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$gradereport_overview_view_grade_report_request = new \OpenAPI\Client\Model\GradereportOverviewViewGradeReportRequest(); // \OpenAPI\Client\Model\GradereportOverviewViewGradeReportRequest

try {
    $result = $apiInstance->gradereportOverviewViewGradeReport($gradereport_overview_view_grade_report_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GradereportOverviewApi->gradereportOverviewViewGradeReport: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **gradereport_overview_view_grade_report_request** | [**\OpenAPI\Client\Model\GradereportOverviewViewGradeReportRequest**](../Model/GradereportOverviewViewGradeReportRequest.md)|  | |

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
