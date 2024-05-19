# OpenAPI\Client\ModSurveyApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modSurveyGetQuestions()**](ModSurveyApi.md#modSurveyGetQuestions) | **POST** /mod_survey_get_questions | Get the complete list of questions for the survey, including subquestions. |
| [**modSurveyGetSurveysByCourses()**](ModSurveyApi.md#modSurveyGetSurveysByCourses) | **POST** /mod_survey_get_surveys_by_courses | Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned. |
| [**modSurveySubmitAnswers()**](ModSurveyApi.md#modSurveySubmitAnswers) | **POST** /mod_survey_submit_answers | Submit the answers for a given survey. |
| [**modSurveyViewSurvey()**](ModSurveyApi.md#modSurveyViewSurvey) | **POST** /mod_survey_view_survey | Trigger the course module viewed event and update the module completion status. |


## `modSurveyGetQuestions()`

```php
modSurveyGetQuestions($mod_survey_get_questions_request): \OpenAPI\Client\Model\ModSurveyGetQuestions200Response
```

Get the complete list of questions for the survey, including subquestions.

Get the complete list of questions for the survey, including subquestions.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModSurveyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_survey_get_questions_request = new \OpenAPI\Client\Model\ModSurveyGetQuestionsRequest(); // \OpenAPI\Client\Model\ModSurveyGetQuestionsRequest

try {
    $result = $apiInstance->modSurveyGetQuestions($mod_survey_get_questions_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModSurveyApi->modSurveyGetQuestions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_survey_get_questions_request** | [**\OpenAPI\Client\Model\ModSurveyGetQuestionsRequest**](../Model/ModSurveyGetQuestionsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModSurveyGetQuestions200Response**](../Model/ModSurveyGetQuestions200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modSurveyGetSurveysByCourses()`

```php
modSurveyGetSurveysByCourses($mod_chat_get_chats_by_courses_request): \OpenAPI\Client\Model\ModSurveyGetSurveysByCourses200Response
```

Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.

Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModSurveyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_get_chats_by_courses_request = new \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest(); // \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest

try {
    $result = $apiInstance->modSurveyGetSurveysByCourses($mod_chat_get_chats_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModSurveyApi->modSurveyGetSurveysByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_get_chats_by_courses_request** | [**\OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest**](../Model/ModChatGetChatsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModSurveyGetSurveysByCourses200Response**](../Model/ModSurveyGetSurveysByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modSurveySubmitAnswers()`

```php
modSurveySubmitAnswers($mod_survey_submit_answers_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Submit the answers for a given survey.

Submit the answers for a given survey.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModSurveyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_survey_submit_answers_request = new \OpenAPI\Client\Model\ModSurveySubmitAnswersRequest(); // \OpenAPI\Client\Model\ModSurveySubmitAnswersRequest

try {
    $result = $apiInstance->modSurveySubmitAnswers($mod_survey_submit_answers_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModSurveyApi->modSurveySubmitAnswers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_survey_submit_answers_request** | [**\OpenAPI\Client\Model\ModSurveySubmitAnswersRequest**](../Model/ModSurveySubmitAnswersRequest.md)|  | |

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

## `modSurveyViewSurvey()`

```php
modSurveyViewSurvey($mod_survey_view_survey_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
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


$apiInstance = new OpenAPI\Client\Api\ModSurveyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_survey_view_survey_request = new \OpenAPI\Client\Model\ModSurveyViewSurveyRequest(); // \OpenAPI\Client\Model\ModSurveyViewSurveyRequest

try {
    $result = $apiInstance->modSurveyViewSurvey($mod_survey_view_survey_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModSurveyApi->modSurveyViewSurvey: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_survey_view_survey_request** | [**\OpenAPI\Client\Model\ModSurveyViewSurveyRequest**](../Model/ModSurveyViewSurveyRequest.md)|  | |

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
