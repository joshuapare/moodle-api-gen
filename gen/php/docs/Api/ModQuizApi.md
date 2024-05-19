# OpenAPI\Client\ModQuizApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modQuizAddRandomQuestions()**](ModQuizApi.md#modQuizAddRandomQuestions) | **POST** /mod_quiz_add_random_questions | Add a number of random questions to a quiz. |
| [**modQuizGetAttemptAccessInformation()**](ModQuizApi.md#modQuizGetAttemptAccessInformation) | **POST** /mod_quiz_get_attempt_access_information | Return access information for a given attempt in a quiz. |
| [**modQuizGetAttemptData()**](ModQuizApi.md#modQuizGetAttemptData) | **POST** /mod_quiz_get_attempt_data | Returns information for the given attempt page for a quiz attempt in progress. |
| [**modQuizGetAttemptReview()**](ModQuizApi.md#modQuizGetAttemptReview) | **POST** /mod_quiz_get_attempt_review | Returns review information for the given finished attempt, can be used by users or teachers. |
| [**modQuizGetAttemptSummary()**](ModQuizApi.md#modQuizGetAttemptSummary) | **POST** /mod_quiz_get_attempt_summary | Returns a summary of a quiz attempt before it is submitted. |
| [**modQuizGetCombinedReviewOptions()**](ModQuizApi.md#modQuizGetCombinedReviewOptions) | **POST** /mod_quiz_get_combined_review_options | Combines the review options from a number of different quiz attempts. |
| [**modQuizGetQuizAccessInformation()**](ModQuizApi.md#modQuizGetQuizAccessInformation) | **POST** /mod_quiz_get_quiz_access_information | Return access information for a given quiz. |
| [**modQuizGetQuizFeedbackForGrade()**](ModQuizApi.md#modQuizGetQuizFeedbackForGrade) | **POST** /mod_quiz_get_quiz_feedback_for_grade | Get the feedback text that should be show to a student who got the given grade in the given quiz. |
| [**modQuizGetQuizRequiredQtypes()**](ModQuizApi.md#modQuizGetQuizRequiredQtypes) | **POST** /mod_quiz_get_quiz_required_qtypes | Return the potential question types that would be required for a given quiz. |
| [**modQuizGetQuizzesByCourses()**](ModQuizApi.md#modQuizGetQuizzesByCourses) | **POST** /mod_quiz_get_quizzes_by_courses | Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned. |
| [**modQuizGetReopenAttemptConfirmation()**](ModQuizApi.md#modQuizGetReopenAttemptConfirmation) | **POST** /mod_quiz_get_reopen_attempt_confirmation | Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message. |
| [**modQuizGetUserAttempts()**](ModQuizApi.md#modQuizGetUserAttempts) | **POST** /mod_quiz_get_user_attempts | Return a list of attempts for the given quiz and user. |
| [**modQuizGetUserBestGrade()**](ModQuizApi.md#modQuizGetUserBestGrade) | **POST** /mod_quiz_get_user_best_grade | Get the best current grade for the given user on a quiz. |
| [**modQuizProcessAttempt()**](ModQuizApi.md#modQuizProcessAttempt) | **POST** /mod_quiz_process_attempt | Process responses during an attempt at a quiz and also deals with attempts finishing. |
| [**modQuizReopenAttempt()**](ModQuizApi.md#modQuizReopenAttempt) | **POST** /mod_quiz_reopen_attempt | Re-open an attempt that is currently in the never submitted state. |
| [**modQuizSaveAttempt()**](ModQuizApi.md#modQuizSaveAttempt) | **POST** /mod_quiz_save_attempt | Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature. |
| [**modQuizSetQuestionVersion()**](ModQuizApi.md#modQuizSetQuestionVersion) | **POST** /mod_quiz_set_question_version | Set the version of question that would be required for a given quiz. |
| [**modQuizStartAttempt()**](ModQuizApi.md#modQuizStartAttempt) | **POST** /mod_quiz_start_attempt | Starts a new attempt at a quiz. |
| [**modQuizUpdateFilterCondition()**](ModQuizApi.md#modQuizUpdateFilterCondition) | **POST** /mod_quiz_update_filter_condition | Update filter condition for a random question slot. |
| [**modQuizViewAttempt()**](ModQuizApi.md#modQuizViewAttempt) | **POST** /mod_quiz_view_attempt | Trigger the attempt viewed event. |
| [**modQuizViewAttemptReview()**](ModQuizApi.md#modQuizViewAttemptReview) | **POST** /mod_quiz_view_attempt_review | Trigger the attempt reviewed event. |
| [**modQuizViewAttemptSummary()**](ModQuizApi.md#modQuizViewAttemptSummary) | **POST** /mod_quiz_view_attempt_summary | Trigger the attempt summary viewed event. |
| [**modQuizViewQuiz()**](ModQuizApi.md#modQuizViewQuiz) | **POST** /mod_quiz_view_quiz | Trigger the course module viewed event and update the module completion status. |


## `modQuizAddRandomQuestions()`

```php
modQuizAddRandomQuestions($mod_quiz_add_random_questions_request): \OpenAPI\Client\Model\ModQuizAddRandomQuestions200Response
```

Add a number of random questions to a quiz.

Add a number of random questions to a quiz.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_add_random_questions_request = new \OpenAPI\Client\Model\ModQuizAddRandomQuestionsRequest(); // \OpenAPI\Client\Model\ModQuizAddRandomQuestionsRequest

try {
    $result = $apiInstance->modQuizAddRandomQuestions($mod_quiz_add_random_questions_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizAddRandomQuestions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_add_random_questions_request** | [**\OpenAPI\Client\Model\ModQuizAddRandomQuestionsRequest**](../Model/ModQuizAddRandomQuestionsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModQuizAddRandomQuestions200Response**](../Model/ModQuizAddRandomQuestions200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modQuizGetAttemptAccessInformation()`

```php
modQuizGetAttemptAccessInformation($mod_quiz_get_attempt_access_information_request): \OpenAPI\Client\Model\ModQuizGetAttemptAccessInformation200Response
```

Return access information for a given attempt in a quiz.

Return access information for a given attempt in a quiz.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_get_attempt_access_information_request = new \OpenAPI\Client\Model\ModQuizGetAttemptAccessInformationRequest(); // \OpenAPI\Client\Model\ModQuizGetAttemptAccessInformationRequest

try {
    $result = $apiInstance->modQuizGetAttemptAccessInformation($mod_quiz_get_attempt_access_information_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizGetAttemptAccessInformation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_get_attempt_access_information_request** | [**\OpenAPI\Client\Model\ModQuizGetAttemptAccessInformationRequest**](../Model/ModQuizGetAttemptAccessInformationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModQuizGetAttemptAccessInformation200Response**](../Model/ModQuizGetAttemptAccessInformation200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modQuizGetAttemptData()`

```php
modQuizGetAttemptData($mod_quiz_get_attempt_data_request): \OpenAPI\Client\Model\ModQuizGetAttemptData200Response
```

Returns information for the given attempt page for a quiz attempt in progress.

Returns information for the given attempt page for a quiz attempt in progress.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_get_attempt_data_request = new \OpenAPI\Client\Model\ModQuizGetAttemptDataRequest(); // \OpenAPI\Client\Model\ModQuizGetAttemptDataRequest

try {
    $result = $apiInstance->modQuizGetAttemptData($mod_quiz_get_attempt_data_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizGetAttemptData: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_get_attempt_data_request** | [**\OpenAPI\Client\Model\ModQuizGetAttemptDataRequest**](../Model/ModQuizGetAttemptDataRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModQuizGetAttemptData200Response**](../Model/ModQuizGetAttemptData200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modQuizGetAttemptReview()`

```php
modQuizGetAttemptReview($mod_quiz_get_attempt_review_request): \OpenAPI\Client\Model\ModQuizGetAttemptReview200Response
```

Returns review information for the given finished attempt, can be used by users or teachers.

Returns review information for the given finished attempt, can be used by users or teachers.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_get_attempt_review_request = new \OpenAPI\Client\Model\ModQuizGetAttemptReviewRequest(); // \OpenAPI\Client\Model\ModQuizGetAttemptReviewRequest

try {
    $result = $apiInstance->modQuizGetAttemptReview($mod_quiz_get_attempt_review_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizGetAttemptReview: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_get_attempt_review_request** | [**\OpenAPI\Client\Model\ModQuizGetAttemptReviewRequest**](../Model/ModQuizGetAttemptReviewRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModQuizGetAttemptReview200Response**](../Model/ModQuizGetAttemptReview200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modQuizGetAttemptSummary()`

```php
modQuizGetAttemptSummary($mod_quiz_get_attempt_summary_request): \OpenAPI\Client\Model\ModQuizGetAttemptSummary200Response
```

Returns a summary of a quiz attempt before it is submitted.

Returns a summary of a quiz attempt before it is submitted.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_get_attempt_summary_request = new \OpenAPI\Client\Model\ModQuizGetAttemptSummaryRequest(); // \OpenAPI\Client\Model\ModQuizGetAttemptSummaryRequest

try {
    $result = $apiInstance->modQuizGetAttemptSummary($mod_quiz_get_attempt_summary_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizGetAttemptSummary: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_get_attempt_summary_request** | [**\OpenAPI\Client\Model\ModQuizGetAttemptSummaryRequest**](../Model/ModQuizGetAttemptSummaryRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModQuizGetAttemptSummary200Response**](../Model/ModQuizGetAttemptSummary200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modQuizGetCombinedReviewOptions()`

```php
modQuizGetCombinedReviewOptions($mod_quiz_get_combined_review_options_request): \OpenAPI\Client\Model\ModQuizGetCombinedReviewOptions200Response
```

Combines the review options from a number of different quiz attempts.

Combines the review options from a number of different quiz attempts.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_get_combined_review_options_request = new \OpenAPI\Client\Model\ModQuizGetCombinedReviewOptionsRequest(); // \OpenAPI\Client\Model\ModQuizGetCombinedReviewOptionsRequest

try {
    $result = $apiInstance->modQuizGetCombinedReviewOptions($mod_quiz_get_combined_review_options_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizGetCombinedReviewOptions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_get_combined_review_options_request** | [**\OpenAPI\Client\Model\ModQuizGetCombinedReviewOptionsRequest**](../Model/ModQuizGetCombinedReviewOptionsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModQuizGetCombinedReviewOptions200Response**](../Model/ModQuizGetCombinedReviewOptions200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modQuizGetQuizAccessInformation()`

```php
modQuizGetQuizAccessInformation($mod_quiz_get_quiz_access_information_request): \OpenAPI\Client\Model\ModQuizGetQuizAccessInformation200Response
```

Return access information for a given quiz.

Return access information for a given quiz.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_get_quiz_access_information_request = new \OpenAPI\Client\Model\ModQuizGetQuizAccessInformationRequest(); // \OpenAPI\Client\Model\ModQuizGetQuizAccessInformationRequest

try {
    $result = $apiInstance->modQuizGetQuizAccessInformation($mod_quiz_get_quiz_access_information_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizGetQuizAccessInformation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_get_quiz_access_information_request** | [**\OpenAPI\Client\Model\ModQuizGetQuizAccessInformationRequest**](../Model/ModQuizGetQuizAccessInformationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModQuizGetQuizAccessInformation200Response**](../Model/ModQuizGetQuizAccessInformation200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modQuizGetQuizFeedbackForGrade()`

```php
modQuizGetQuizFeedbackForGrade($mod_quiz_get_quiz_feedback_for_grade_request): \OpenAPI\Client\Model\ModQuizGetQuizFeedbackForGrade200Response
```

Get the feedback text that should be show to a student who got the given grade in the given quiz.

Get the feedback text that should be show to a student who got the given grade in the given quiz.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_get_quiz_feedback_for_grade_request = new \OpenAPI\Client\Model\ModQuizGetQuizFeedbackForGradeRequest(); // \OpenAPI\Client\Model\ModQuizGetQuizFeedbackForGradeRequest

try {
    $result = $apiInstance->modQuizGetQuizFeedbackForGrade($mod_quiz_get_quiz_feedback_for_grade_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizGetQuizFeedbackForGrade: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_get_quiz_feedback_for_grade_request** | [**\OpenAPI\Client\Model\ModQuizGetQuizFeedbackForGradeRequest**](../Model/ModQuizGetQuizFeedbackForGradeRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModQuizGetQuizFeedbackForGrade200Response**](../Model/ModQuizGetQuizFeedbackForGrade200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modQuizGetQuizRequiredQtypes()`

```php
modQuizGetQuizRequiredQtypes($mod_quiz_get_quiz_access_information_request): \OpenAPI\Client\Model\ModQuizGetQuizRequiredQtypes200Response
```

Return the potential question types that would be required for a given quiz.

Return the potential question types that would be required for a given quiz.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_get_quiz_access_information_request = new \OpenAPI\Client\Model\ModQuizGetQuizAccessInformationRequest(); // \OpenAPI\Client\Model\ModQuizGetQuizAccessInformationRequest

try {
    $result = $apiInstance->modQuizGetQuizRequiredQtypes($mod_quiz_get_quiz_access_information_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizGetQuizRequiredQtypes: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_get_quiz_access_information_request** | [**\OpenAPI\Client\Model\ModQuizGetQuizAccessInformationRequest**](../Model/ModQuizGetQuizAccessInformationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModQuizGetQuizRequiredQtypes200Response**](../Model/ModQuizGetQuizRequiredQtypes200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modQuizGetQuizzesByCourses()`

```php
modQuizGetQuizzesByCourses($mod_chat_get_chats_by_courses_request): \OpenAPI\Client\Model\ModQuizGetQuizzesByCourses200Response
```

Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.

Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_get_chats_by_courses_request = new \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest(); // \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest

try {
    $result = $apiInstance->modQuizGetQuizzesByCourses($mod_chat_get_chats_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizGetQuizzesByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_get_chats_by_courses_request** | [**\OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest**](../Model/ModChatGetChatsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModQuizGetQuizzesByCourses200Response**](../Model/ModQuizGetQuizzesByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modQuizGetReopenAttemptConfirmation()`

```php
modQuizGetReopenAttemptConfirmation($mod_quiz_get_reopen_attempt_confirmation_request): object
```

Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.

Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_get_reopen_attempt_confirmation_request = new \OpenAPI\Client\Model\ModQuizGetReopenAttemptConfirmationRequest(); // \OpenAPI\Client\Model\ModQuizGetReopenAttemptConfirmationRequest

try {
    $result = $apiInstance->modQuizGetReopenAttemptConfirmation($mod_quiz_get_reopen_attempt_confirmation_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizGetReopenAttemptConfirmation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_get_reopen_attempt_confirmation_request** | [**\OpenAPI\Client\Model\ModQuizGetReopenAttemptConfirmationRequest**](../Model/ModQuizGetReopenAttemptConfirmationRequest.md)|  | |

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

## `modQuizGetUserAttempts()`

```php
modQuizGetUserAttempts($mod_quiz_get_user_attempts_request): \OpenAPI\Client\Model\ModQuizGetUserAttempts200Response
```

Return a list of attempts for the given quiz and user.

Return a list of attempts for the given quiz and user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_get_user_attempts_request = new \OpenAPI\Client\Model\ModQuizGetUserAttemptsRequest(); // \OpenAPI\Client\Model\ModQuizGetUserAttemptsRequest

try {
    $result = $apiInstance->modQuizGetUserAttempts($mod_quiz_get_user_attempts_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizGetUserAttempts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_get_user_attempts_request** | [**\OpenAPI\Client\Model\ModQuizGetUserAttemptsRequest**](../Model/ModQuizGetUserAttemptsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModQuizGetUserAttempts200Response**](../Model/ModQuizGetUserAttempts200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modQuizGetUserBestGrade()`

```php
modQuizGetUserBestGrade($mod_quiz_get_user_best_grade_request): \OpenAPI\Client\Model\ModQuizGetUserBestGrade200Response
```

Get the best current grade for the given user on a quiz.

Get the best current grade for the given user on a quiz.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_get_user_best_grade_request = new \OpenAPI\Client\Model\ModQuizGetUserBestGradeRequest(); // \OpenAPI\Client\Model\ModQuizGetUserBestGradeRequest

try {
    $result = $apiInstance->modQuizGetUserBestGrade($mod_quiz_get_user_best_grade_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizGetUserBestGrade: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_get_user_best_grade_request** | [**\OpenAPI\Client\Model\ModQuizGetUserBestGradeRequest**](../Model/ModQuizGetUserBestGradeRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModQuizGetUserBestGrade200Response**](../Model/ModQuizGetUserBestGrade200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modQuizProcessAttempt()`

```php
modQuizProcessAttempt($mod_quiz_process_attempt_request): \OpenAPI\Client\Model\ModQuizProcessAttempt200Response
```

Process responses during an attempt at a quiz and also deals with attempts finishing.

Process responses during an attempt at a quiz and also deals with attempts finishing.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_process_attempt_request = new \OpenAPI\Client\Model\ModQuizProcessAttemptRequest(); // \OpenAPI\Client\Model\ModQuizProcessAttemptRequest

try {
    $result = $apiInstance->modQuizProcessAttempt($mod_quiz_process_attempt_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizProcessAttempt: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_process_attempt_request** | [**\OpenAPI\Client\Model\ModQuizProcessAttemptRequest**](../Model/ModQuizProcessAttemptRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModQuizProcessAttempt200Response**](../Model/ModQuizProcessAttempt200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modQuizReopenAttempt()`

```php
modQuizReopenAttempt($mod_quiz_reopen_attempt_request): object
```

Re-open an attempt that is currently in the never submitted state.

Re-open an attempt that is currently in the never submitted state.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_reopen_attempt_request = new \OpenAPI\Client\Model\ModQuizReopenAttemptRequest(); // \OpenAPI\Client\Model\ModQuizReopenAttemptRequest

try {
    $result = $apiInstance->modQuizReopenAttempt($mod_quiz_reopen_attempt_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizReopenAttempt: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_reopen_attempt_request** | [**\OpenAPI\Client\Model\ModQuizReopenAttemptRequest**](../Model/ModQuizReopenAttemptRequest.md)|  | |

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

## `modQuizSaveAttempt()`

```php
modQuizSaveAttempt($mod_quiz_save_attempt_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.

Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_save_attempt_request = new \OpenAPI\Client\Model\ModQuizSaveAttemptRequest(); // \OpenAPI\Client\Model\ModQuizSaveAttemptRequest

try {
    $result = $apiInstance->modQuizSaveAttempt($mod_quiz_save_attempt_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizSaveAttempt: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_save_attempt_request** | [**\OpenAPI\Client\Model\ModQuizSaveAttemptRequest**](../Model/ModQuizSaveAttemptRequest.md)|  | |

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

## `modQuizSetQuestionVersion()`

```php
modQuizSetQuestionVersion($mod_quiz_set_question_version_request): \OpenAPI\Client\Model\ModQuizSetQuestionVersion200Response
```

Set the version of question that would be required for a given quiz.

Set the version of question that would be required for a given quiz.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_set_question_version_request = new \OpenAPI\Client\Model\ModQuizSetQuestionVersionRequest(); // \OpenAPI\Client\Model\ModQuizSetQuestionVersionRequest

try {
    $result = $apiInstance->modQuizSetQuestionVersion($mod_quiz_set_question_version_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizSetQuestionVersion: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_set_question_version_request** | [**\OpenAPI\Client\Model\ModQuizSetQuestionVersionRequest**](../Model/ModQuizSetQuestionVersionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModQuizSetQuestionVersion200Response**](../Model/ModQuizSetQuestionVersion200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modQuizStartAttempt()`

```php
modQuizStartAttempt($mod_quiz_start_attempt_request): \OpenAPI\Client\Model\ModQuizStartAttempt200Response
```

Starts a new attempt at a quiz.

Starts a new attempt at a quiz.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_start_attempt_request = new \OpenAPI\Client\Model\ModQuizStartAttemptRequest(); // \OpenAPI\Client\Model\ModQuizStartAttemptRequest

try {
    $result = $apiInstance->modQuizStartAttempt($mod_quiz_start_attempt_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizStartAttempt: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_start_attempt_request** | [**\OpenAPI\Client\Model\ModQuizStartAttemptRequest**](../Model/ModQuizStartAttemptRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModQuizStartAttempt200Response**](../Model/ModQuizStartAttempt200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modQuizUpdateFilterCondition()`

```php
modQuizUpdateFilterCondition($mod_quiz_update_filter_condition_request): \OpenAPI\Client\Model\ModQuizAddRandomQuestions200Response
```

Update filter condition for a random question slot.

Update filter condition for a random question slot.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_update_filter_condition_request = new \OpenAPI\Client\Model\ModQuizUpdateFilterConditionRequest(); // \OpenAPI\Client\Model\ModQuizUpdateFilterConditionRequest

try {
    $result = $apiInstance->modQuizUpdateFilterCondition($mod_quiz_update_filter_condition_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizUpdateFilterCondition: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_update_filter_condition_request** | [**\OpenAPI\Client\Model\ModQuizUpdateFilterConditionRequest**](../Model/ModQuizUpdateFilterConditionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModQuizAddRandomQuestions200Response**](../Model/ModQuizAddRandomQuestions200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modQuizViewAttempt()`

```php
modQuizViewAttempt($mod_quiz_view_attempt_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Trigger the attempt viewed event.

Trigger the attempt viewed event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_view_attempt_request = new \OpenAPI\Client\Model\ModQuizViewAttemptRequest(); // \OpenAPI\Client\Model\ModQuizViewAttemptRequest

try {
    $result = $apiInstance->modQuizViewAttempt($mod_quiz_view_attempt_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizViewAttempt: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_view_attempt_request** | [**\OpenAPI\Client\Model\ModQuizViewAttemptRequest**](../Model/ModQuizViewAttemptRequest.md)|  | |

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

## `modQuizViewAttemptReview()`

```php
modQuizViewAttemptReview($mod_quiz_view_attempt_review_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Trigger the attempt reviewed event.

Trigger the attempt reviewed event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_view_attempt_review_request = new \OpenAPI\Client\Model\ModQuizViewAttemptReviewRequest(); // \OpenAPI\Client\Model\ModQuizViewAttemptReviewRequest

try {
    $result = $apiInstance->modQuizViewAttemptReview($mod_quiz_view_attempt_review_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizViewAttemptReview: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_view_attempt_review_request** | [**\OpenAPI\Client\Model\ModQuizViewAttemptReviewRequest**](../Model/ModQuizViewAttemptReviewRequest.md)|  | |

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

## `modQuizViewAttemptSummary()`

```php
modQuizViewAttemptSummary($mod_quiz_get_attempt_summary_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Trigger the attempt summary viewed event.

Trigger the attempt summary viewed event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_get_attempt_summary_request = new \OpenAPI\Client\Model\ModQuizGetAttemptSummaryRequest(); // \OpenAPI\Client\Model\ModQuizGetAttemptSummaryRequest

try {
    $result = $apiInstance->modQuizViewAttemptSummary($mod_quiz_get_attempt_summary_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizViewAttemptSummary: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_get_attempt_summary_request** | [**\OpenAPI\Client\Model\ModQuizGetAttemptSummaryRequest**](../Model/ModQuizGetAttemptSummaryRequest.md)|  | |

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

## `modQuizViewQuiz()`

```php
modQuizViewQuiz($mod_quiz_get_quiz_access_information_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
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


$apiInstance = new OpenAPI\Client\Api\ModQuizApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_quiz_get_quiz_access_information_request = new \OpenAPI\Client\Model\ModQuizGetQuizAccessInformationRequest(); // \OpenAPI\Client\Model\ModQuizGetQuizAccessInformationRequest

try {
    $result = $apiInstance->modQuizViewQuiz($mod_quiz_get_quiz_access_information_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModQuizApi->modQuizViewQuiz: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_quiz_get_quiz_access_information_request** | [**\OpenAPI\Client\Model\ModQuizGetQuizAccessInformationRequest**](../Model/ModQuizGetQuizAccessInformationRequest.md)|  | |

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
