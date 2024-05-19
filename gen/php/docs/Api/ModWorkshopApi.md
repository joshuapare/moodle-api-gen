# OpenAPI\Client\ModWorkshopApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modWorkshopAddSubmission()**](ModWorkshopApi.md#modWorkshopAddSubmission) | **POST** /mod_workshop_add_submission | Add a new submission to a given workshop. |
| [**modWorkshopDeleteSubmission()**](ModWorkshopApi.md#modWorkshopDeleteSubmission) | **POST** /mod_workshop_delete_submission | Deletes the given submission. |
| [**modWorkshopEvaluateAssessment()**](ModWorkshopApi.md#modWorkshopEvaluateAssessment) | **POST** /mod_workshop_evaluate_assessment | Evaluates an assessment (used by teachers for provide feedback to the reviewer). |
| [**modWorkshopEvaluateSubmission()**](ModWorkshopApi.md#modWorkshopEvaluateSubmission) | **POST** /mod_workshop_evaluate_submission | Evaluates a submission (used by teachers for provide feedback or override the submission grade). |
| [**modWorkshopGetAssessment()**](ModWorkshopApi.md#modWorkshopGetAssessment) | **POST** /mod_workshop_get_assessment | Retrieves the given assessment. |
| [**modWorkshopGetAssessmentFormDefinition()**](ModWorkshopApi.md#modWorkshopGetAssessmentFormDefinition) | **POST** /mod_workshop_get_assessment_form_definition | Retrieves the assessment form definition. |
| [**modWorkshopGetGrades()**](ModWorkshopApi.md#modWorkshopGetGrades) | **POST** /mod_workshop_get_grades | Returns the assessment and submission grade for the given user. |
| [**modWorkshopGetGradesReport()**](ModWorkshopApi.md#modWorkshopGetGradesReport) | **POST** /mod_workshop_get_grades_report | Retrieves the assessment grades report. |
| [**modWorkshopGetReviewerAssessments()**](ModWorkshopApi.md#modWorkshopGetReviewerAssessments) | **POST** /mod_workshop_get_reviewer_assessments | Retrieves all the assessments reviewed by the given user. |
| [**modWorkshopGetSubmission()**](ModWorkshopApi.md#modWorkshopGetSubmission) | **POST** /mod_workshop_get_submission | Retrieves the given submission. |
| [**modWorkshopGetSubmissionAssessments()**](ModWorkshopApi.md#modWorkshopGetSubmissionAssessments) | **POST** /mod_workshop_get_submission_assessments | Retrieves all the assessments of the given submission. |
| [**modWorkshopGetSubmissions()**](ModWorkshopApi.md#modWorkshopGetSubmissions) | **POST** /mod_workshop_get_submissions | Retrieves all the workshop submissions or the one done by the given user (except example submissions). |
| [**modWorkshopGetUserPlan()**](ModWorkshopApi.md#modWorkshopGetUserPlan) | **POST** /mod_workshop_get_user_plan | Return the planner information for the given user. |
| [**modWorkshopGetWorkshopAccessInformation()**](ModWorkshopApi.md#modWorkshopGetWorkshopAccessInformation) | **POST** /mod_workshop_get_workshop_access_information | Return access information for a given workshop. |
| [**modWorkshopGetWorkshopsByCourses()**](ModWorkshopApi.md#modWorkshopGetWorkshopsByCourses) | **POST** /mod_workshop_get_workshops_by_courses | Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned. |
| [**modWorkshopUpdateAssessment()**](ModWorkshopApi.md#modWorkshopUpdateAssessment) | **POST** /mod_workshop_update_assessment | Add information to an allocated assessment. |
| [**modWorkshopUpdateSubmission()**](ModWorkshopApi.md#modWorkshopUpdateSubmission) | **POST** /mod_workshop_update_submission | Update the given submission. |
| [**modWorkshopViewSubmission()**](ModWorkshopApi.md#modWorkshopViewSubmission) | **POST** /mod_workshop_view_submission | Trigger the submission viewed event. |
| [**modWorkshopViewWorkshop()**](ModWorkshopApi.md#modWorkshopViewWorkshop) | **POST** /mod_workshop_view_workshop | Trigger the course module viewed event and update the module completion status. |


## `modWorkshopAddSubmission()`

```php
modWorkshopAddSubmission($mod_workshop_add_submission_request): \OpenAPI\Client\Model\ModWorkshopAddSubmission200Response
```

Add a new submission to a given workshop.

Add a new submission to a given workshop.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_workshop_add_submission_request = new \OpenAPI\Client\Model\ModWorkshopAddSubmissionRequest(); // \OpenAPI\Client\Model\ModWorkshopAddSubmissionRequest

try {
    $result = $apiInstance->modWorkshopAddSubmission($mod_workshop_add_submission_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopAddSubmission: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_workshop_add_submission_request** | [**\OpenAPI\Client\Model\ModWorkshopAddSubmissionRequest**](../Model/ModWorkshopAddSubmissionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWorkshopAddSubmission200Response**](../Model/ModWorkshopAddSubmission200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWorkshopDeleteSubmission()`

```php
modWorkshopDeleteSubmission($mod_workshop_delete_submission_request): \OpenAPI\Client\Model\ModWorkshopDeleteSubmission200Response
```

Deletes the given submission.

Deletes the given submission.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_workshop_delete_submission_request = new \OpenAPI\Client\Model\ModWorkshopDeleteSubmissionRequest(); // \OpenAPI\Client\Model\ModWorkshopDeleteSubmissionRequest

try {
    $result = $apiInstance->modWorkshopDeleteSubmission($mod_workshop_delete_submission_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopDeleteSubmission: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_workshop_delete_submission_request** | [**\OpenAPI\Client\Model\ModWorkshopDeleteSubmissionRequest**](../Model/ModWorkshopDeleteSubmissionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWorkshopDeleteSubmission200Response**](../Model/ModWorkshopDeleteSubmission200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWorkshopEvaluateAssessment()`

```php
modWorkshopEvaluateAssessment($mod_workshop_evaluate_assessment_request): \OpenAPI\Client\Model\ModWorkshopEvaluateAssessment200Response
```

Evaluates an assessment (used by teachers for provide feedback to the reviewer).

Evaluates an assessment (used by teachers for provide feedback to the reviewer).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_workshop_evaluate_assessment_request = new \OpenAPI\Client\Model\ModWorkshopEvaluateAssessmentRequest(); // \OpenAPI\Client\Model\ModWorkshopEvaluateAssessmentRequest

try {
    $result = $apiInstance->modWorkshopEvaluateAssessment($mod_workshop_evaluate_assessment_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopEvaluateAssessment: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_workshop_evaluate_assessment_request** | [**\OpenAPI\Client\Model\ModWorkshopEvaluateAssessmentRequest**](../Model/ModWorkshopEvaluateAssessmentRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWorkshopEvaluateAssessment200Response**](../Model/ModWorkshopEvaluateAssessment200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWorkshopEvaluateSubmission()`

```php
modWorkshopEvaluateSubmission($mod_workshop_evaluate_submission_request): \OpenAPI\Client\Model\ModWorkshopEvaluateSubmission200Response
```

Evaluates a submission (used by teachers for provide feedback or override the submission grade).

Evaluates a submission (used by teachers for provide feedback or override the submission grade).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_workshop_evaluate_submission_request = new \OpenAPI\Client\Model\ModWorkshopEvaluateSubmissionRequest(); // \OpenAPI\Client\Model\ModWorkshopEvaluateSubmissionRequest

try {
    $result = $apiInstance->modWorkshopEvaluateSubmission($mod_workshop_evaluate_submission_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopEvaluateSubmission: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_workshop_evaluate_submission_request** | [**\OpenAPI\Client\Model\ModWorkshopEvaluateSubmissionRequest**](../Model/ModWorkshopEvaluateSubmissionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWorkshopEvaluateSubmission200Response**](../Model/ModWorkshopEvaluateSubmission200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWorkshopGetAssessment()`

```php
modWorkshopGetAssessment($mod_workshop_get_assessment_request): \OpenAPI\Client\Model\ModWorkshopGetAssessment200Response
```

Retrieves the given assessment.

Retrieves the given assessment.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_workshop_get_assessment_request = new \OpenAPI\Client\Model\ModWorkshopGetAssessmentRequest(); // \OpenAPI\Client\Model\ModWorkshopGetAssessmentRequest

try {
    $result = $apiInstance->modWorkshopGetAssessment($mod_workshop_get_assessment_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopGetAssessment: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_workshop_get_assessment_request** | [**\OpenAPI\Client\Model\ModWorkshopGetAssessmentRequest**](../Model/ModWorkshopGetAssessmentRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWorkshopGetAssessment200Response**](../Model/ModWorkshopGetAssessment200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWorkshopGetAssessmentFormDefinition()`

```php
modWorkshopGetAssessmentFormDefinition($mod_workshop_get_assessment_form_definition_request): \OpenAPI\Client\Model\ModWorkshopGetAssessmentFormDefinition200Response
```

Retrieves the assessment form definition.

Retrieves the assessment form definition.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_workshop_get_assessment_form_definition_request = new \OpenAPI\Client\Model\ModWorkshopGetAssessmentFormDefinitionRequest(); // \OpenAPI\Client\Model\ModWorkshopGetAssessmentFormDefinitionRequest

try {
    $result = $apiInstance->modWorkshopGetAssessmentFormDefinition($mod_workshop_get_assessment_form_definition_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopGetAssessmentFormDefinition: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_workshop_get_assessment_form_definition_request** | [**\OpenAPI\Client\Model\ModWorkshopGetAssessmentFormDefinitionRequest**](../Model/ModWorkshopGetAssessmentFormDefinitionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWorkshopGetAssessmentFormDefinition200Response**](../Model/ModWorkshopGetAssessmentFormDefinition200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWorkshopGetGrades()`

```php
modWorkshopGetGrades($mod_workshop_get_grades_request): \OpenAPI\Client\Model\ModWorkshopGetGrades200Response
```

Returns the assessment and submission grade for the given user.

Returns the assessment and submission grade for the given user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_workshop_get_grades_request = new \OpenAPI\Client\Model\ModWorkshopGetGradesRequest(); // \OpenAPI\Client\Model\ModWorkshopGetGradesRequest

try {
    $result = $apiInstance->modWorkshopGetGrades($mod_workshop_get_grades_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopGetGrades: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_workshop_get_grades_request** | [**\OpenAPI\Client\Model\ModWorkshopGetGradesRequest**](../Model/ModWorkshopGetGradesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWorkshopGetGrades200Response**](../Model/ModWorkshopGetGrades200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWorkshopGetGradesReport()`

```php
modWorkshopGetGradesReport($mod_workshop_get_grades_report_request): \OpenAPI\Client\Model\ModWorkshopGetGradesReport200Response
```

Retrieves the assessment grades report.

Retrieves the assessment grades report.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_workshop_get_grades_report_request = new \OpenAPI\Client\Model\ModWorkshopGetGradesReportRequest(); // \OpenAPI\Client\Model\ModWorkshopGetGradesReportRequest

try {
    $result = $apiInstance->modWorkshopGetGradesReport($mod_workshop_get_grades_report_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopGetGradesReport: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_workshop_get_grades_report_request** | [**\OpenAPI\Client\Model\ModWorkshopGetGradesReportRequest**](../Model/ModWorkshopGetGradesReportRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWorkshopGetGradesReport200Response**](../Model/ModWorkshopGetGradesReport200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWorkshopGetReviewerAssessments()`

```php
modWorkshopGetReviewerAssessments($mod_workshop_get_reviewer_assessments_request): \OpenAPI\Client\Model\ModWorkshopGetReviewerAssessments200Response
```

Retrieves all the assessments reviewed by the given user.

Retrieves all the assessments reviewed by the given user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_workshop_get_reviewer_assessments_request = new \OpenAPI\Client\Model\ModWorkshopGetReviewerAssessmentsRequest(); // \OpenAPI\Client\Model\ModWorkshopGetReviewerAssessmentsRequest

try {
    $result = $apiInstance->modWorkshopGetReviewerAssessments($mod_workshop_get_reviewer_assessments_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopGetReviewerAssessments: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_workshop_get_reviewer_assessments_request** | [**\OpenAPI\Client\Model\ModWorkshopGetReviewerAssessmentsRequest**](../Model/ModWorkshopGetReviewerAssessmentsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWorkshopGetReviewerAssessments200Response**](../Model/ModWorkshopGetReviewerAssessments200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWorkshopGetSubmission()`

```php
modWorkshopGetSubmission($mod_workshop_get_submission_request): \OpenAPI\Client\Model\ModWorkshopGetSubmission200Response
```

Retrieves the given submission.

Retrieves the given submission.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_workshop_get_submission_request = new \OpenAPI\Client\Model\ModWorkshopGetSubmissionRequest(); // \OpenAPI\Client\Model\ModWorkshopGetSubmissionRequest

try {
    $result = $apiInstance->modWorkshopGetSubmission($mod_workshop_get_submission_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopGetSubmission: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_workshop_get_submission_request** | [**\OpenAPI\Client\Model\ModWorkshopGetSubmissionRequest**](../Model/ModWorkshopGetSubmissionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWorkshopGetSubmission200Response**](../Model/ModWorkshopGetSubmission200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWorkshopGetSubmissionAssessments()`

```php
modWorkshopGetSubmissionAssessments($mod_workshop_get_submission_request): \OpenAPI\Client\Model\ModWorkshopGetReviewerAssessments200Response
```

Retrieves all the assessments of the given submission.

Retrieves all the assessments of the given submission.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_workshop_get_submission_request = new \OpenAPI\Client\Model\ModWorkshopGetSubmissionRequest(); // \OpenAPI\Client\Model\ModWorkshopGetSubmissionRequest

try {
    $result = $apiInstance->modWorkshopGetSubmissionAssessments($mod_workshop_get_submission_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopGetSubmissionAssessments: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_workshop_get_submission_request** | [**\OpenAPI\Client\Model\ModWorkshopGetSubmissionRequest**](../Model/ModWorkshopGetSubmissionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWorkshopGetReviewerAssessments200Response**](../Model/ModWorkshopGetReviewerAssessments200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWorkshopGetSubmissions()`

```php
modWorkshopGetSubmissions($mod_workshop_get_submissions_request): \OpenAPI\Client\Model\ModWorkshopGetSubmissions200Response
```

Retrieves all the workshop submissions or the one done by the given user (except example submissions).

Retrieves all the workshop submissions or the one done by the given user (except example submissions).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_workshop_get_submissions_request = new \OpenAPI\Client\Model\ModWorkshopGetSubmissionsRequest(); // \OpenAPI\Client\Model\ModWorkshopGetSubmissionsRequest

try {
    $result = $apiInstance->modWorkshopGetSubmissions($mod_workshop_get_submissions_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopGetSubmissions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_workshop_get_submissions_request** | [**\OpenAPI\Client\Model\ModWorkshopGetSubmissionsRequest**](../Model/ModWorkshopGetSubmissionsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWorkshopGetSubmissions200Response**](../Model/ModWorkshopGetSubmissions200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWorkshopGetUserPlan()`

```php
modWorkshopGetUserPlan($mod_workshop_get_user_plan_request): \OpenAPI\Client\Model\ModWorkshopGetUserPlan200Response
```

Return the planner information for the given user.

Return the planner information for the given user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_workshop_get_user_plan_request = new \OpenAPI\Client\Model\ModWorkshopGetUserPlanRequest(); // \OpenAPI\Client\Model\ModWorkshopGetUserPlanRequest

try {
    $result = $apiInstance->modWorkshopGetUserPlan($mod_workshop_get_user_plan_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopGetUserPlan: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_workshop_get_user_plan_request** | [**\OpenAPI\Client\Model\ModWorkshopGetUserPlanRequest**](../Model/ModWorkshopGetUserPlanRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWorkshopGetUserPlan200Response**](../Model/ModWorkshopGetUserPlan200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWorkshopGetWorkshopAccessInformation()`

```php
modWorkshopGetWorkshopAccessInformation($mod_workshop_get_workshop_access_information_request): \OpenAPI\Client\Model\ModWorkshopGetWorkshopAccessInformation200Response
```

Return access information for a given workshop.

Return access information for a given workshop.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_workshop_get_workshop_access_information_request = new \OpenAPI\Client\Model\ModWorkshopGetWorkshopAccessInformationRequest(); // \OpenAPI\Client\Model\ModWorkshopGetWorkshopAccessInformationRequest

try {
    $result = $apiInstance->modWorkshopGetWorkshopAccessInformation($mod_workshop_get_workshop_access_information_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopGetWorkshopAccessInformation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_workshop_get_workshop_access_information_request** | [**\OpenAPI\Client\Model\ModWorkshopGetWorkshopAccessInformationRequest**](../Model/ModWorkshopGetWorkshopAccessInformationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWorkshopGetWorkshopAccessInformation200Response**](../Model/ModWorkshopGetWorkshopAccessInformation200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWorkshopGetWorkshopsByCourses()`

```php
modWorkshopGetWorkshopsByCourses($mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request): \OpenAPI\Client\Model\ModWorkshopGetWorkshopsByCourses200Response
```

Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.

Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request = new \OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // \OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest

try {
    $result = $apiInstance->modWorkshopGetWorkshopsByCourses($mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopGetWorkshopsByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**\OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](../Model/ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWorkshopGetWorkshopsByCourses200Response**](../Model/ModWorkshopGetWorkshopsByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWorkshopUpdateAssessment()`

```php
modWorkshopUpdateAssessment($mod_workshop_update_assessment_request): \OpenAPI\Client\Model\ModWorkshopUpdateAssessment200Response
```

Add information to an allocated assessment.

Add information to an allocated assessment.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_workshop_update_assessment_request = new \OpenAPI\Client\Model\ModWorkshopUpdateAssessmentRequest(); // \OpenAPI\Client\Model\ModWorkshopUpdateAssessmentRequest

try {
    $result = $apiInstance->modWorkshopUpdateAssessment($mod_workshop_update_assessment_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopUpdateAssessment: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_workshop_update_assessment_request** | [**\OpenAPI\Client\Model\ModWorkshopUpdateAssessmentRequest**](../Model/ModWorkshopUpdateAssessmentRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWorkshopUpdateAssessment200Response**](../Model/ModWorkshopUpdateAssessment200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWorkshopUpdateSubmission()`

```php
modWorkshopUpdateSubmission($mod_workshop_update_submission_request): \OpenAPI\Client\Model\ModWorkshopUpdateSubmission200Response
```

Update the given submission.

Update the given submission.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_workshop_update_submission_request = new \OpenAPI\Client\Model\ModWorkshopUpdateSubmissionRequest(); // \OpenAPI\Client\Model\ModWorkshopUpdateSubmissionRequest

try {
    $result = $apiInstance->modWorkshopUpdateSubmission($mod_workshop_update_submission_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopUpdateSubmission: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_workshop_update_submission_request** | [**\OpenAPI\Client\Model\ModWorkshopUpdateSubmissionRequest**](../Model/ModWorkshopUpdateSubmissionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWorkshopUpdateSubmission200Response**](../Model/ModWorkshopUpdateSubmission200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWorkshopViewSubmission()`

```php
modWorkshopViewSubmission($mod_workshop_get_submission_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Trigger the submission viewed event.

Trigger the submission viewed event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_workshop_get_submission_request = new \OpenAPI\Client\Model\ModWorkshopGetSubmissionRequest(); // \OpenAPI\Client\Model\ModWorkshopGetSubmissionRequest

try {
    $result = $apiInstance->modWorkshopViewSubmission($mod_workshop_get_submission_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopViewSubmission: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_workshop_get_submission_request** | [**\OpenAPI\Client\Model\ModWorkshopGetSubmissionRequest**](../Model/ModWorkshopGetSubmissionRequest.md)|  | |

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

## `modWorkshopViewWorkshop()`

```php
modWorkshopViewWorkshop($mod_workshop_view_workshop_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
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


$apiInstance = new OpenAPI\Client\Api\ModWorkshopApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_workshop_view_workshop_request = new \OpenAPI\Client\Model\ModWorkshopViewWorkshopRequest(); // \OpenAPI\Client\Model\ModWorkshopViewWorkshopRequest

try {
    $result = $apiInstance->modWorkshopViewWorkshop($mod_workshop_view_workshop_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWorkshopApi->modWorkshopViewWorkshop: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_workshop_view_workshop_request** | [**\OpenAPI\Client\Model\ModWorkshopViewWorkshopRequest**](../Model/ModWorkshopViewWorkshopRequest.md)|  | |

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
