# OpenAPI\Client\GradingformRubricApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**gradingformRubricGraderGradingpanelFetch()**](GradingformRubricApi.md#gradingformRubricGraderGradingpanelFetch) | **POST** /gradingform_rubric_grader_gradingpanel_fetch | Fetch the data required to display the grader grading panel, creating the grade item if required |
| [**gradingformRubricGraderGradingpanelStore()**](GradingformRubricApi.md#gradingformRubricGraderGradingpanelStore) | **POST** /gradingform_rubric_grader_gradingpanel_store | Store the grading data for a user from the grader grading panel. |


## `gradingformRubricGraderGradingpanelFetch()`

```php
gradingformRubricGraderGradingpanelFetch($core_grades_grader_gradingpanel_scale_fetch_request): \OpenAPI\Client\Model\GradingformRubricGraderGradingpanelFetch200Response
```

Fetch the data required to display the grader grading panel, creating the grade item if required

Fetch the data required to display the grader grading panel, creating the grade item if required

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\GradingformRubricApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grades_grader_gradingpanel_scale_fetch_request = new \OpenAPI\Client\Model\CoreGradesGraderGradingpanelScaleFetchRequest(); // \OpenAPI\Client\Model\CoreGradesGraderGradingpanelScaleFetchRequest

try {
    $result = $apiInstance->gradingformRubricGraderGradingpanelFetch($core_grades_grader_gradingpanel_scale_fetch_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GradingformRubricApi->gradingformRubricGraderGradingpanelFetch: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grades_grader_gradingpanel_scale_fetch_request** | [**\OpenAPI\Client\Model\CoreGradesGraderGradingpanelScaleFetchRequest**](../Model/CoreGradesGraderGradingpanelScaleFetchRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\GradingformRubricGraderGradingpanelFetch200Response**](../Model/GradingformRubricGraderGradingpanelFetch200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `gradingformRubricGraderGradingpanelStore()`

```php
gradingformRubricGraderGradingpanelStore($core_grades_grader_gradingpanel_scale_store_request): \OpenAPI\Client\Model\GradingformRubricGraderGradingpanelStore200Response
```

Store the grading data for a user from the grader grading panel.

Store the grading data for a user from the grader grading panel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\GradingformRubricApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grades_grader_gradingpanel_scale_store_request = new \OpenAPI\Client\Model\CoreGradesGraderGradingpanelScaleStoreRequest(); // \OpenAPI\Client\Model\CoreGradesGraderGradingpanelScaleStoreRequest

try {
    $result = $apiInstance->gradingformRubricGraderGradingpanelStore($core_grades_grader_gradingpanel_scale_store_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GradingformRubricApi->gradingformRubricGraderGradingpanelStore: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grades_grader_gradingpanel_scale_store_request** | [**\OpenAPI\Client\Model\CoreGradesGraderGradingpanelScaleStoreRequest**](../Model/CoreGradesGraderGradingpanelScaleStoreRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\GradingformRubricGraderGradingpanelStore200Response**](../Model/GradingformRubricGraderGradingpanelStore200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
