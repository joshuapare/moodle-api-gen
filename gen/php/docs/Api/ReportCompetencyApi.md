# OpenAPI\Client\ReportCompetencyApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**reportCompetencyDataForReport()**](ReportCompetencyApi.md#reportCompetencyDataForReport) | **POST** /report_competency_data_for_report | Load the data for the competency report in a course. |


## `reportCompetencyDataForReport()`

```php
reportCompetencyDataForReport($report_competency_data_for_report_request): \OpenAPI\Client\Model\ReportCompetencyDataForReport200Response
```

Load the data for the competency report in a course.

Load the data for the competency report in a course.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ReportCompetencyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$report_competency_data_for_report_request = new \OpenAPI\Client\Model\ReportCompetencyDataForReportRequest(); // \OpenAPI\Client\Model\ReportCompetencyDataForReportRequest

try {
    $result = $apiInstance->reportCompetencyDataForReport($report_competency_data_for_report_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ReportCompetencyApi->reportCompetencyDataForReport: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **report_competency_data_for_report_request** | [**\OpenAPI\Client\Model\ReportCompetencyDataForReportRequest**](../Model/ReportCompetencyDataForReportRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ReportCompetencyDataForReport200Response**](../Model/ReportCompetencyDataForReport200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
