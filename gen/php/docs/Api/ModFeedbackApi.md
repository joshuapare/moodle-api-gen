# OpenAPI\Client\ModFeedbackApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modFeedbackGetAnalysis()**](ModFeedbackApi.md#modFeedbackGetAnalysis) | **POST** /mod_feedback_get_analysis | Retrieves the feedback analysis. |
| [**modFeedbackGetCurrentCompletedTmp()**](ModFeedbackApi.md#modFeedbackGetCurrentCompletedTmp) | **POST** /mod_feedback_get_current_completed_tmp | Returns the temporary completion record for the current user. |
| [**modFeedbackGetFeedbackAccessInformation()**](ModFeedbackApi.md#modFeedbackGetFeedbackAccessInformation) | **POST** /mod_feedback_get_feedback_access_information | Return access information for a given feedback. |
| [**modFeedbackGetFeedbacksByCourses()**](ModFeedbackApi.md#modFeedbackGetFeedbacksByCourses) | **POST** /mod_feedback_get_feedbacks_by_courses | Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned. |
| [**modFeedbackGetFinishedResponses()**](ModFeedbackApi.md#modFeedbackGetFinishedResponses) | **POST** /mod_feedback_get_finished_responses | Retrieves responses from the last finished attempt. |
| [**modFeedbackGetItems()**](ModFeedbackApi.md#modFeedbackGetItems) | **POST** /mod_feedback_get_items | Returns the items (questions) in the given feedback. |
| [**modFeedbackGetLastCompleted()**](ModFeedbackApi.md#modFeedbackGetLastCompleted) | **POST** /mod_feedback_get_last_completed | Retrieves the last completion record for the current user. |
| [**modFeedbackGetNonRespondents()**](ModFeedbackApi.md#modFeedbackGetNonRespondents) | **POST** /mod_feedback_get_non_respondents | Retrieves a list of students who didn&#39;t submit the feedback. |
| [**modFeedbackGetPageItems()**](ModFeedbackApi.md#modFeedbackGetPageItems) | **POST** /mod_feedback_get_page_items | Get a single feedback page items. |
| [**modFeedbackGetResponsesAnalysis()**](ModFeedbackApi.md#modFeedbackGetResponsesAnalysis) | **POST** /mod_feedback_get_responses_analysis | Return the feedback user responses analysis. |
| [**modFeedbackGetUnfinishedResponses()**](ModFeedbackApi.md#modFeedbackGetUnfinishedResponses) | **POST** /mod_feedback_get_unfinished_responses | Retrieves responses from the current unfinished attempt. |
| [**modFeedbackLaunchFeedback()**](ModFeedbackApi.md#modFeedbackLaunchFeedback) | **POST** /mod_feedback_launch_feedback | Starts or continues a feedback submission. |
| [**modFeedbackProcessPage()**](ModFeedbackApi.md#modFeedbackProcessPage) | **POST** /mod_feedback_process_page | Process a jump between pages. |
| [**modFeedbackViewFeedback()**](ModFeedbackApi.md#modFeedbackViewFeedback) | **POST** /mod_feedback_view_feedback | Trigger the course module viewed event and update the module completion status. |


## `modFeedbackGetAnalysis()`

```php
modFeedbackGetAnalysis($mod_feedback_get_analysis_request): \OpenAPI\Client\Model\ModFeedbackGetAnalysis200Response
```

Retrieves the feedback analysis.

Retrieves the feedback analysis.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModFeedbackApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_feedback_get_analysis_request = new \OpenAPI\Client\Model\ModFeedbackGetAnalysisRequest(); // \OpenAPI\Client\Model\ModFeedbackGetAnalysisRequest

try {
    $result = $apiInstance->modFeedbackGetAnalysis($mod_feedback_get_analysis_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModFeedbackApi->modFeedbackGetAnalysis: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_feedback_get_analysis_request** | [**\OpenAPI\Client\Model\ModFeedbackGetAnalysisRequest**](../Model/ModFeedbackGetAnalysisRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModFeedbackGetAnalysis200Response**](../Model/ModFeedbackGetAnalysis200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modFeedbackGetCurrentCompletedTmp()`

```php
modFeedbackGetCurrentCompletedTmp($mod_feedback_get_current_completed_tmp_request): \OpenAPI\Client\Model\ModFeedbackGetCurrentCompletedTmp200Response
```

Returns the temporary completion record for the current user.

Returns the temporary completion record for the current user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModFeedbackApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_feedback_get_current_completed_tmp_request = new \OpenAPI\Client\Model\ModFeedbackGetCurrentCompletedTmpRequest(); // \OpenAPI\Client\Model\ModFeedbackGetCurrentCompletedTmpRequest

try {
    $result = $apiInstance->modFeedbackGetCurrentCompletedTmp($mod_feedback_get_current_completed_tmp_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModFeedbackApi->modFeedbackGetCurrentCompletedTmp: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_feedback_get_current_completed_tmp_request** | [**\OpenAPI\Client\Model\ModFeedbackGetCurrentCompletedTmpRequest**](../Model/ModFeedbackGetCurrentCompletedTmpRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModFeedbackGetCurrentCompletedTmp200Response**](../Model/ModFeedbackGetCurrentCompletedTmp200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modFeedbackGetFeedbackAccessInformation()`

```php
modFeedbackGetFeedbackAccessInformation($mod_feedback_get_feedback_access_information_request): \OpenAPI\Client\Model\ModFeedbackGetFeedbackAccessInformation200Response
```

Return access information for a given feedback.

Return access information for a given feedback.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModFeedbackApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_feedback_get_feedback_access_information_request = new \OpenAPI\Client\Model\ModFeedbackGetFeedbackAccessInformationRequest(); // \OpenAPI\Client\Model\ModFeedbackGetFeedbackAccessInformationRequest

try {
    $result = $apiInstance->modFeedbackGetFeedbackAccessInformation($mod_feedback_get_feedback_access_information_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModFeedbackApi->modFeedbackGetFeedbackAccessInformation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_feedback_get_feedback_access_information_request** | [**\OpenAPI\Client\Model\ModFeedbackGetFeedbackAccessInformationRequest**](../Model/ModFeedbackGetFeedbackAccessInformationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModFeedbackGetFeedbackAccessInformation200Response**](../Model/ModFeedbackGetFeedbackAccessInformation200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modFeedbackGetFeedbacksByCourses()`

```php
modFeedbackGetFeedbacksByCourses($mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request): \OpenAPI\Client\Model\ModFeedbackGetFeedbacksByCourses200Response
```

Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.

Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModFeedbackApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request = new \OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // \OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest

try {
    $result = $apiInstance->modFeedbackGetFeedbacksByCourses($mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModFeedbackApi->modFeedbackGetFeedbacksByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**\OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](../Model/ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModFeedbackGetFeedbacksByCourses200Response**](../Model/ModFeedbackGetFeedbacksByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modFeedbackGetFinishedResponses()`

```php
modFeedbackGetFinishedResponses($mod_feedback_get_finished_responses_request): \OpenAPI\Client\Model\ModFeedbackGetFinishedResponses200Response
```

Retrieves responses from the last finished attempt.

Retrieves responses from the last finished attempt.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModFeedbackApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_feedback_get_finished_responses_request = new \OpenAPI\Client\Model\ModFeedbackGetFinishedResponsesRequest(); // \OpenAPI\Client\Model\ModFeedbackGetFinishedResponsesRequest

try {
    $result = $apiInstance->modFeedbackGetFinishedResponses($mod_feedback_get_finished_responses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModFeedbackApi->modFeedbackGetFinishedResponses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_feedback_get_finished_responses_request** | [**\OpenAPI\Client\Model\ModFeedbackGetFinishedResponsesRequest**](../Model/ModFeedbackGetFinishedResponsesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModFeedbackGetFinishedResponses200Response**](../Model/ModFeedbackGetFinishedResponses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modFeedbackGetItems()`

```php
modFeedbackGetItems($mod_feedback_get_current_completed_tmp_request): \OpenAPI\Client\Model\ModFeedbackGetItems200Response
```

Returns the items (questions) in the given feedback.

Returns the items (questions) in the given feedback.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModFeedbackApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_feedback_get_current_completed_tmp_request = new \OpenAPI\Client\Model\ModFeedbackGetCurrentCompletedTmpRequest(); // \OpenAPI\Client\Model\ModFeedbackGetCurrentCompletedTmpRequest

try {
    $result = $apiInstance->modFeedbackGetItems($mod_feedback_get_current_completed_tmp_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModFeedbackApi->modFeedbackGetItems: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_feedback_get_current_completed_tmp_request** | [**\OpenAPI\Client\Model\ModFeedbackGetCurrentCompletedTmpRequest**](../Model/ModFeedbackGetCurrentCompletedTmpRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModFeedbackGetItems200Response**](../Model/ModFeedbackGetItems200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modFeedbackGetLastCompleted()`

```php
modFeedbackGetLastCompleted($mod_feedback_get_current_completed_tmp_request): \OpenAPI\Client\Model\ModFeedbackGetLastCompleted200Response
```

Retrieves the last completion record for the current user.

Retrieves the last completion record for the current user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModFeedbackApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_feedback_get_current_completed_tmp_request = new \OpenAPI\Client\Model\ModFeedbackGetCurrentCompletedTmpRequest(); // \OpenAPI\Client\Model\ModFeedbackGetCurrentCompletedTmpRequest

try {
    $result = $apiInstance->modFeedbackGetLastCompleted($mod_feedback_get_current_completed_tmp_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModFeedbackApi->modFeedbackGetLastCompleted: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_feedback_get_current_completed_tmp_request** | [**\OpenAPI\Client\Model\ModFeedbackGetCurrentCompletedTmpRequest**](../Model/ModFeedbackGetCurrentCompletedTmpRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModFeedbackGetLastCompleted200Response**](../Model/ModFeedbackGetLastCompleted200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modFeedbackGetNonRespondents()`

```php
modFeedbackGetNonRespondents($mod_feedback_get_non_respondents_request): \OpenAPI\Client\Model\ModFeedbackGetNonRespondents200Response
```

Retrieves a list of students who didn't submit the feedback.

Retrieves a list of students who didn't submit the feedback.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModFeedbackApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_feedback_get_non_respondents_request = new \OpenAPI\Client\Model\ModFeedbackGetNonRespondentsRequest(); // \OpenAPI\Client\Model\ModFeedbackGetNonRespondentsRequest

try {
    $result = $apiInstance->modFeedbackGetNonRespondents($mod_feedback_get_non_respondents_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModFeedbackApi->modFeedbackGetNonRespondents: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_feedback_get_non_respondents_request** | [**\OpenAPI\Client\Model\ModFeedbackGetNonRespondentsRequest**](../Model/ModFeedbackGetNonRespondentsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModFeedbackGetNonRespondents200Response**](../Model/ModFeedbackGetNonRespondents200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modFeedbackGetPageItems()`

```php
modFeedbackGetPageItems($mod_feedback_get_page_items_request): \OpenAPI\Client\Model\ModFeedbackGetPageItems200Response
```

Get a single feedback page items.

Get a single feedback page items.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModFeedbackApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_feedback_get_page_items_request = new \OpenAPI\Client\Model\ModFeedbackGetPageItemsRequest(); // \OpenAPI\Client\Model\ModFeedbackGetPageItemsRequest

try {
    $result = $apiInstance->modFeedbackGetPageItems($mod_feedback_get_page_items_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModFeedbackApi->modFeedbackGetPageItems: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_feedback_get_page_items_request** | [**\OpenAPI\Client\Model\ModFeedbackGetPageItemsRequest**](../Model/ModFeedbackGetPageItemsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModFeedbackGetPageItems200Response**](../Model/ModFeedbackGetPageItems200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modFeedbackGetResponsesAnalysis()`

```php
modFeedbackGetResponsesAnalysis($mod_feedback_get_responses_analysis_request): \OpenAPI\Client\Model\ModFeedbackGetResponsesAnalysis200Response
```

Return the feedback user responses analysis.

Return the feedback user responses analysis.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModFeedbackApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_feedback_get_responses_analysis_request = new \OpenAPI\Client\Model\ModFeedbackGetResponsesAnalysisRequest(); // \OpenAPI\Client\Model\ModFeedbackGetResponsesAnalysisRequest

try {
    $result = $apiInstance->modFeedbackGetResponsesAnalysis($mod_feedback_get_responses_analysis_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModFeedbackApi->modFeedbackGetResponsesAnalysis: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_feedback_get_responses_analysis_request** | [**\OpenAPI\Client\Model\ModFeedbackGetResponsesAnalysisRequest**](../Model/ModFeedbackGetResponsesAnalysisRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModFeedbackGetResponsesAnalysis200Response**](../Model/ModFeedbackGetResponsesAnalysis200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modFeedbackGetUnfinishedResponses()`

```php
modFeedbackGetUnfinishedResponses($mod_feedback_get_finished_responses_request): \OpenAPI\Client\Model\ModFeedbackGetUnfinishedResponses200Response
```

Retrieves responses from the current unfinished attempt.

Retrieves responses from the current unfinished attempt.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModFeedbackApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_feedback_get_finished_responses_request = new \OpenAPI\Client\Model\ModFeedbackGetFinishedResponsesRequest(); // \OpenAPI\Client\Model\ModFeedbackGetFinishedResponsesRequest

try {
    $result = $apiInstance->modFeedbackGetUnfinishedResponses($mod_feedback_get_finished_responses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModFeedbackApi->modFeedbackGetUnfinishedResponses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_feedback_get_finished_responses_request** | [**\OpenAPI\Client\Model\ModFeedbackGetFinishedResponsesRequest**](../Model/ModFeedbackGetFinishedResponsesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModFeedbackGetUnfinishedResponses200Response**](../Model/ModFeedbackGetUnfinishedResponses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modFeedbackLaunchFeedback()`

```php
modFeedbackLaunchFeedback($mod_feedback_get_current_completed_tmp_request): \OpenAPI\Client\Model\ModFeedbackLaunchFeedback200Response
```

Starts or continues a feedback submission.

Starts or continues a feedback submission.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModFeedbackApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_feedback_get_current_completed_tmp_request = new \OpenAPI\Client\Model\ModFeedbackGetCurrentCompletedTmpRequest(); // \OpenAPI\Client\Model\ModFeedbackGetCurrentCompletedTmpRequest

try {
    $result = $apiInstance->modFeedbackLaunchFeedback($mod_feedback_get_current_completed_tmp_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModFeedbackApi->modFeedbackLaunchFeedback: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_feedback_get_current_completed_tmp_request** | [**\OpenAPI\Client\Model\ModFeedbackGetCurrentCompletedTmpRequest**](../Model/ModFeedbackGetCurrentCompletedTmpRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModFeedbackLaunchFeedback200Response**](../Model/ModFeedbackLaunchFeedback200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modFeedbackProcessPage()`

```php
modFeedbackProcessPage($mod_feedback_process_page_request): \OpenAPI\Client\Model\ModFeedbackProcessPage200Response
```

Process a jump between pages.

Process a jump between pages.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModFeedbackApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_feedback_process_page_request = new \OpenAPI\Client\Model\ModFeedbackProcessPageRequest(); // \OpenAPI\Client\Model\ModFeedbackProcessPageRequest

try {
    $result = $apiInstance->modFeedbackProcessPage($mod_feedback_process_page_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModFeedbackApi->modFeedbackProcessPage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_feedback_process_page_request** | [**\OpenAPI\Client\Model\ModFeedbackProcessPageRequest**](../Model/ModFeedbackProcessPageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModFeedbackProcessPage200Response**](../Model/ModFeedbackProcessPage200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modFeedbackViewFeedback()`

```php
modFeedbackViewFeedback($mod_feedback_view_feedback_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
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


$apiInstance = new OpenAPI\Client\Api\ModFeedbackApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_feedback_view_feedback_request = new \OpenAPI\Client\Model\ModFeedbackViewFeedbackRequest(); // \OpenAPI\Client\Model\ModFeedbackViewFeedbackRequest

try {
    $result = $apiInstance->modFeedbackViewFeedback($mod_feedback_view_feedback_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModFeedbackApi->modFeedbackViewFeedback: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_feedback_view_feedback_request** | [**\OpenAPI\Client\Model\ModFeedbackViewFeedbackRequest**](../Model/ModFeedbackViewFeedbackRequest.md)|  | |

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
