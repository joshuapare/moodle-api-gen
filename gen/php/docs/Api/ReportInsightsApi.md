# OpenAPI\Client\ReportInsightsApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**reportInsightsActionExecuted()**](ReportInsightsApi.md#reportInsightsActionExecuted) | **POST** /report_insights_action_executed | Stores an action executed over a group of predictions. |
| [**reportInsightsSetFixedPrediction()**](ReportInsightsApi.md#reportInsightsSetFixedPrediction) | **POST** /report_insights_set_fixed_prediction | Flags a prediction as fixed. |
| [**reportInsightsSetNotusefulPrediction()**](ReportInsightsApi.md#reportInsightsSetNotusefulPrediction) | **POST** /report_insights_set_notuseful_prediction | Flags the prediction as not useful. |


## `reportInsightsActionExecuted()`

```php
reportInsightsActionExecuted($report_insights_action_executed_request): \OpenAPI\Client\Model\CoreCohortAddCohortMembers200Response
```

Stores an action executed over a group of predictions.

Stores an action executed over a group of predictions.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ReportInsightsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$report_insights_action_executed_request = new \OpenAPI\Client\Model\ReportInsightsActionExecutedRequest(); // \OpenAPI\Client\Model\ReportInsightsActionExecutedRequest

try {
    $result = $apiInstance->reportInsightsActionExecuted($report_insights_action_executed_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ReportInsightsApi->reportInsightsActionExecuted: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **report_insights_action_executed_request** | [**\OpenAPI\Client\Model\ReportInsightsActionExecutedRequest**](../Model/ReportInsightsActionExecutedRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCohortAddCohortMembers200Response**](../Model/CoreCohortAddCohortMembers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `reportInsightsSetFixedPrediction()`

```php
reportInsightsSetFixedPrediction($report_insights_set_fixed_prediction_request): \OpenAPI\Client\Model\ReportInsightsSetFixedPrediction200Response
```

Flags a prediction as fixed.

Flags a prediction as fixed.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ReportInsightsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$report_insights_set_fixed_prediction_request = new \OpenAPI\Client\Model\ReportInsightsSetFixedPredictionRequest(); // \OpenAPI\Client\Model\ReportInsightsSetFixedPredictionRequest

try {
    $result = $apiInstance->reportInsightsSetFixedPrediction($report_insights_set_fixed_prediction_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ReportInsightsApi->reportInsightsSetFixedPrediction: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **report_insights_set_fixed_prediction_request** | [**\OpenAPI\Client\Model\ReportInsightsSetFixedPredictionRequest**](../Model/ReportInsightsSetFixedPredictionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ReportInsightsSetFixedPrediction200Response**](../Model/ReportInsightsSetFixedPrediction200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `reportInsightsSetNotusefulPrediction()`

```php
reportInsightsSetNotusefulPrediction($report_insights_set_notuseful_prediction_request): \OpenAPI\Client\Model\ReportInsightsSetNotusefulPrediction200Response
```

Flags the prediction as not useful.

Flags the prediction as not useful.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ReportInsightsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$report_insights_set_notuseful_prediction_request = new \OpenAPI\Client\Model\ReportInsightsSetNotusefulPredictionRequest(); // \OpenAPI\Client\Model\ReportInsightsSetNotusefulPredictionRequest

try {
    $result = $apiInstance->reportInsightsSetNotusefulPrediction($report_insights_set_notuseful_prediction_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ReportInsightsApi->reportInsightsSetNotusefulPrediction: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **report_insights_set_notuseful_prediction_request** | [**\OpenAPI\Client\Model\ReportInsightsSetNotusefulPredictionRequest**](../Model/ReportInsightsSetNotusefulPredictionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ReportInsightsSetNotusefulPrediction200Response**](../Model/ReportInsightsSetNotusefulPrediction200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
