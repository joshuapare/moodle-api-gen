# OpenAPI\Client\GradereportUserApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**gradereportUserGetAccessInformation()**](GradereportUserApi.md#gradereportUserGetAccessInformation) | **POST** /gradereport_user_get_access_information | Returns user access information for the user grade report. |
| [**gradereportUserGetGradeItems()**](GradereportUserApi.md#gradereportUserGetGradeItems) | **POST** /gradereport_user_get_grade_items | Returns the complete list of grade items for users in a course |
| [**gradereportUserGetGradesTable()**](GradereportUserApi.md#gradereportUserGetGradesTable) | **POST** /gradereport_user_get_grades_table | Get the user/s report grades table for a course |
| [**gradereportUserViewGradeReport()**](GradereportUserApi.md#gradereportUserViewGradeReport) | **POST** /gradereport_user_view_grade_report | Trigger the report view event |


## `gradereportUserGetAccessInformation()`

```php
gradereportUserGetAccessInformation($gradereport_user_get_access_information_request): \OpenAPI\Client\Model\GradereportUserGetAccessInformation200Response
```

Returns user access information for the user grade report.

Returns user access information for the user grade report.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\GradereportUserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$gradereport_user_get_access_information_request = new \OpenAPI\Client\Model\GradereportUserGetAccessInformationRequest(); // \OpenAPI\Client\Model\GradereportUserGetAccessInformationRequest

try {
    $result = $apiInstance->gradereportUserGetAccessInformation($gradereport_user_get_access_information_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GradereportUserApi->gradereportUserGetAccessInformation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **gradereport_user_get_access_information_request** | [**\OpenAPI\Client\Model\GradereportUserGetAccessInformationRequest**](../Model/GradereportUserGetAccessInformationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\GradereportUserGetAccessInformation200Response**](../Model/GradereportUserGetAccessInformation200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `gradereportUserGetGradeItems()`

```php
gradereportUserGetGradeItems($gradereport_user_get_grade_items_request): \OpenAPI\Client\Model\GradereportUserGetGradeItems200Response
```

Returns the complete list of grade items for users in a course

Returns the complete list of grade items for users in a course

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\GradereportUserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$gradereport_user_get_grade_items_request = new \OpenAPI\Client\Model\GradereportUserGetGradeItemsRequest(); // \OpenAPI\Client\Model\GradereportUserGetGradeItemsRequest

try {
    $result = $apiInstance->gradereportUserGetGradeItems($gradereport_user_get_grade_items_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GradereportUserApi->gradereportUserGetGradeItems: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **gradereport_user_get_grade_items_request** | [**\OpenAPI\Client\Model\GradereportUserGetGradeItemsRequest**](../Model/GradereportUserGetGradeItemsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\GradereportUserGetGradeItems200Response**](../Model/GradereportUserGetGradeItems200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `gradereportUserGetGradesTable()`

```php
gradereportUserGetGradesTable($gradereport_user_get_grade_items_request): \OpenAPI\Client\Model\GradereportUserGetGradesTable200Response
```

Get the user/s report grades table for a course

Get the user/s report grades table for a course

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\GradereportUserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$gradereport_user_get_grade_items_request = new \OpenAPI\Client\Model\GradereportUserGetGradeItemsRequest(); // \OpenAPI\Client\Model\GradereportUserGetGradeItemsRequest

try {
    $result = $apiInstance->gradereportUserGetGradesTable($gradereport_user_get_grade_items_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GradereportUserApi->gradereportUserGetGradesTable: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **gradereport_user_get_grade_items_request** | [**\OpenAPI\Client\Model\GradereportUserGetGradeItemsRequest**](../Model/GradereportUserGetGradeItemsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\GradereportUserGetGradesTable200Response**](../Model/GradereportUserGetGradesTable200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `gradereportUserViewGradeReport()`

```php
gradereportUserViewGradeReport($gradereport_overview_view_grade_report_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
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


$apiInstance = new OpenAPI\Client\Api\GradereportUserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$gradereport_overview_view_grade_report_request = new \OpenAPI\Client\Model\GradereportOverviewViewGradeReportRequest(); // \OpenAPI\Client\Model\GradereportOverviewViewGradeReportRequest

try {
    $result = $apiInstance->gradereportUserViewGradeReport($gradereport_overview_view_grade_report_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GradereportUserApi->gradereportUserViewGradeReport: ', $e->getMessage(), PHP_EOL;
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
