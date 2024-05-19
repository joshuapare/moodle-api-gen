# OpenAPI\Client\ModLessonApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modLessonFinishAttempt()**](ModLessonApi.md#modLessonFinishAttempt) | **POST** /mod_lesson_finish_attempt | Finishes the current attempt. |
| [**modLessonGetAttemptsOverview()**](ModLessonApi.md#modLessonGetAttemptsOverview) | **POST** /mod_lesson_get_attempts_overview | Get a list of all the attempts made by users in a lesson. |
| [**modLessonGetContentPagesViewed()**](ModLessonApi.md#modLessonGetContentPagesViewed) | **POST** /mod_lesson_get_content_pages_viewed | Return the list of content pages viewed by a user during a lesson attempt. |
| [**modLessonGetLesson()**](ModLessonApi.md#modLessonGetLesson) | **POST** /mod_lesson_get_lesson | Return information of a given lesson. |
| [**modLessonGetLessonAccessInformation()**](ModLessonApi.md#modLessonGetLessonAccessInformation) | **POST** /mod_lesson_get_lesson_access_information | Return access information for a given lesson. |
| [**modLessonGetLessonsByCourses()**](ModLessonApi.md#modLessonGetLessonsByCourses) | **POST** /mod_lesson_get_lessons_by_courses | Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned. |
| [**modLessonGetPageData()**](ModLessonApi.md#modLessonGetPageData) | **POST** /mod_lesson_get_page_data | Return information of a given page, including its contents. |
| [**modLessonGetPages()**](ModLessonApi.md#modLessonGetPages) | **POST** /mod_lesson_get_pages | Return the list of pages in a lesson (based on the user permissions). |
| [**modLessonGetPagesPossibleJumps()**](ModLessonApi.md#modLessonGetPagesPossibleJumps) | **POST** /mod_lesson_get_pages_possible_jumps | Return all the possible jumps for the pages in a given lesson. |
| [**modLessonGetQuestionsAttempts()**](ModLessonApi.md#modLessonGetQuestionsAttempts) | **POST** /mod_lesson_get_questions_attempts | Return the list of questions attempts in a given lesson. |
| [**modLessonGetUserAttempt()**](ModLessonApi.md#modLessonGetUserAttempt) | **POST** /mod_lesson_get_user_attempt | Return information about the given user attempt (including answers). |
| [**modLessonGetUserAttemptGrade()**](ModLessonApi.md#modLessonGetUserAttemptGrade) | **POST** /mod_lesson_get_user_attempt_grade | Return grade information in the attempt for a given user. |
| [**modLessonGetUserGrade()**](ModLessonApi.md#modLessonGetUserGrade) | **POST** /mod_lesson_get_user_grade | Return the final grade in the lesson for the given user. |
| [**modLessonGetUserTimers()**](ModLessonApi.md#modLessonGetUserTimers) | **POST** /mod_lesson_get_user_timers | Return the timers in the current lesson for the given user. |
| [**modLessonLaunchAttempt()**](ModLessonApi.md#modLessonLaunchAttempt) | **POST** /mod_lesson_launch_attempt | Starts a new attempt or continues an existing one. |
| [**modLessonProcessPage()**](ModLessonApi.md#modLessonProcessPage) | **POST** /mod_lesson_process_page | Processes page responses. |
| [**modLessonViewLesson()**](ModLessonApi.md#modLessonViewLesson) | **POST** /mod_lesson_view_lesson | Trigger the course module viewed event and update the module completion status. |


## `modLessonFinishAttempt()`

```php
modLessonFinishAttempt($mod_lesson_finish_attempt_request): \OpenAPI\Client\Model\ModLessonFinishAttempt200Response
```

Finishes the current attempt.

Finishes the current attempt.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLessonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lesson_finish_attempt_request = new \OpenAPI\Client\Model\ModLessonFinishAttemptRequest(); // \OpenAPI\Client\Model\ModLessonFinishAttemptRequest

try {
    $result = $apiInstance->modLessonFinishAttempt($mod_lesson_finish_attempt_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLessonApi->modLessonFinishAttempt: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lesson_finish_attempt_request** | [**\OpenAPI\Client\Model\ModLessonFinishAttemptRequest**](../Model/ModLessonFinishAttemptRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLessonFinishAttempt200Response**](../Model/ModLessonFinishAttempt200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLessonGetAttemptsOverview()`

```php
modLessonGetAttemptsOverview($mod_lesson_get_attempts_overview_request): \OpenAPI\Client\Model\ModLessonGetAttemptsOverview200Response
```

Get a list of all the attempts made by users in a lesson.

Get a list of all the attempts made by users in a lesson.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLessonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lesson_get_attempts_overview_request = new \OpenAPI\Client\Model\ModLessonGetAttemptsOverviewRequest(); // \OpenAPI\Client\Model\ModLessonGetAttemptsOverviewRequest

try {
    $result = $apiInstance->modLessonGetAttemptsOverview($mod_lesson_get_attempts_overview_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLessonApi->modLessonGetAttemptsOverview: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lesson_get_attempts_overview_request** | [**\OpenAPI\Client\Model\ModLessonGetAttemptsOverviewRequest**](../Model/ModLessonGetAttemptsOverviewRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLessonGetAttemptsOverview200Response**](../Model/ModLessonGetAttemptsOverview200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLessonGetContentPagesViewed()`

```php
modLessonGetContentPagesViewed($mod_lesson_get_content_pages_viewed_request): \OpenAPI\Client\Model\ModLessonGetContentPagesViewed200Response
```

Return the list of content pages viewed by a user during a lesson attempt.

Return the list of content pages viewed by a user during a lesson attempt.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLessonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lesson_get_content_pages_viewed_request = new \OpenAPI\Client\Model\ModLessonGetContentPagesViewedRequest(); // \OpenAPI\Client\Model\ModLessonGetContentPagesViewedRequest

try {
    $result = $apiInstance->modLessonGetContentPagesViewed($mod_lesson_get_content_pages_viewed_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLessonApi->modLessonGetContentPagesViewed: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lesson_get_content_pages_viewed_request** | [**\OpenAPI\Client\Model\ModLessonGetContentPagesViewedRequest**](../Model/ModLessonGetContentPagesViewedRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLessonGetContentPagesViewed200Response**](../Model/ModLessonGetContentPagesViewed200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLessonGetLesson()`

```php
modLessonGetLesson($mod_lesson_get_lesson_request): \OpenAPI\Client\Model\ModLessonGetLesson200Response
```

Return information of a given lesson.

Return information of a given lesson.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLessonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lesson_get_lesson_request = new \OpenAPI\Client\Model\ModLessonGetLessonRequest(); // \OpenAPI\Client\Model\ModLessonGetLessonRequest

try {
    $result = $apiInstance->modLessonGetLesson($mod_lesson_get_lesson_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLessonApi->modLessonGetLesson: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lesson_get_lesson_request** | [**\OpenAPI\Client\Model\ModLessonGetLessonRequest**](../Model/ModLessonGetLessonRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLessonGetLesson200Response**](../Model/ModLessonGetLesson200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLessonGetLessonAccessInformation()`

```php
modLessonGetLessonAccessInformation($mod_lesson_get_lesson_access_information_request): \OpenAPI\Client\Model\ModLessonGetLessonAccessInformation200Response
```

Return access information for a given lesson.

Return access information for a given lesson.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLessonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lesson_get_lesson_access_information_request = new \OpenAPI\Client\Model\ModLessonGetLessonAccessInformationRequest(); // \OpenAPI\Client\Model\ModLessonGetLessonAccessInformationRequest

try {
    $result = $apiInstance->modLessonGetLessonAccessInformation($mod_lesson_get_lesson_access_information_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLessonApi->modLessonGetLessonAccessInformation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lesson_get_lesson_access_information_request** | [**\OpenAPI\Client\Model\ModLessonGetLessonAccessInformationRequest**](../Model/ModLessonGetLessonAccessInformationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLessonGetLessonAccessInformation200Response**](../Model/ModLessonGetLessonAccessInformation200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLessonGetLessonsByCourses()`

```php
modLessonGetLessonsByCourses($mod_chat_get_chats_by_courses_request): \OpenAPI\Client\Model\ModLessonGetLessonsByCourses200Response
```

Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.

Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLessonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_get_chats_by_courses_request = new \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest(); // \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest

try {
    $result = $apiInstance->modLessonGetLessonsByCourses($mod_chat_get_chats_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLessonApi->modLessonGetLessonsByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_get_chats_by_courses_request** | [**\OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest**](../Model/ModChatGetChatsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLessonGetLessonsByCourses200Response**](../Model/ModLessonGetLessonsByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLessonGetPageData()`

```php
modLessonGetPageData($mod_lesson_get_page_data_request): \OpenAPI\Client\Model\ModLessonGetPageData200Response
```

Return information of a given page, including its contents.

Return information of a given page, including its contents.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLessonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lesson_get_page_data_request = new \OpenAPI\Client\Model\ModLessonGetPageDataRequest(); // \OpenAPI\Client\Model\ModLessonGetPageDataRequest

try {
    $result = $apiInstance->modLessonGetPageData($mod_lesson_get_page_data_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLessonApi->modLessonGetPageData: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lesson_get_page_data_request** | [**\OpenAPI\Client\Model\ModLessonGetPageDataRequest**](../Model/ModLessonGetPageDataRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLessonGetPageData200Response**](../Model/ModLessonGetPageData200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLessonGetPages()`

```php
modLessonGetPages($mod_lesson_get_pages_request): \OpenAPI\Client\Model\ModLessonGetPages200Response
```

Return the list of pages in a lesson (based on the user permissions).

Return the list of pages in a lesson (based on the user permissions).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLessonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lesson_get_pages_request = new \OpenAPI\Client\Model\ModLessonGetPagesRequest(); // \OpenAPI\Client\Model\ModLessonGetPagesRequest

try {
    $result = $apiInstance->modLessonGetPages($mod_lesson_get_pages_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLessonApi->modLessonGetPages: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lesson_get_pages_request** | [**\OpenAPI\Client\Model\ModLessonGetPagesRequest**](../Model/ModLessonGetPagesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLessonGetPages200Response**](../Model/ModLessonGetPages200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLessonGetPagesPossibleJumps()`

```php
modLessonGetPagesPossibleJumps($mod_lesson_get_lesson_access_information_request): \OpenAPI\Client\Model\ModLessonGetPagesPossibleJumps200Response
```

Return all the possible jumps for the pages in a given lesson.

Return all the possible jumps for the pages in a given lesson.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLessonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lesson_get_lesson_access_information_request = new \OpenAPI\Client\Model\ModLessonGetLessonAccessInformationRequest(); // \OpenAPI\Client\Model\ModLessonGetLessonAccessInformationRequest

try {
    $result = $apiInstance->modLessonGetPagesPossibleJumps($mod_lesson_get_lesson_access_information_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLessonApi->modLessonGetPagesPossibleJumps: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lesson_get_lesson_access_information_request** | [**\OpenAPI\Client\Model\ModLessonGetLessonAccessInformationRequest**](../Model/ModLessonGetLessonAccessInformationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLessonGetPagesPossibleJumps200Response**](../Model/ModLessonGetPagesPossibleJumps200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLessonGetQuestionsAttempts()`

```php
modLessonGetQuestionsAttempts($mod_lesson_get_questions_attempts_request): \OpenAPI\Client\Model\ModLessonGetQuestionsAttempts200Response
```

Return the list of questions attempts in a given lesson.

Return the list of questions attempts in a given lesson.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLessonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lesson_get_questions_attempts_request = new \OpenAPI\Client\Model\ModLessonGetQuestionsAttemptsRequest(); // \OpenAPI\Client\Model\ModLessonGetQuestionsAttemptsRequest

try {
    $result = $apiInstance->modLessonGetQuestionsAttempts($mod_lesson_get_questions_attempts_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLessonApi->modLessonGetQuestionsAttempts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lesson_get_questions_attempts_request** | [**\OpenAPI\Client\Model\ModLessonGetQuestionsAttemptsRequest**](../Model/ModLessonGetQuestionsAttemptsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLessonGetQuestionsAttempts200Response**](../Model/ModLessonGetQuestionsAttempts200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLessonGetUserAttempt()`

```php
modLessonGetUserAttempt($mod_lesson_get_user_attempt_request): \OpenAPI\Client\Model\ModLessonGetUserAttempt200Response
```

Return information about the given user attempt (including answers).

Return information about the given user attempt (including answers).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLessonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lesson_get_user_attempt_request = new \OpenAPI\Client\Model\ModLessonGetUserAttemptRequest(); // \OpenAPI\Client\Model\ModLessonGetUserAttemptRequest

try {
    $result = $apiInstance->modLessonGetUserAttempt($mod_lesson_get_user_attempt_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLessonApi->modLessonGetUserAttempt: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lesson_get_user_attempt_request** | [**\OpenAPI\Client\Model\ModLessonGetUserAttemptRequest**](../Model/ModLessonGetUserAttemptRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLessonGetUserAttempt200Response**](../Model/ModLessonGetUserAttempt200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLessonGetUserAttemptGrade()`

```php
modLessonGetUserAttemptGrade($mod_lesson_get_user_attempt_grade_request): \OpenAPI\Client\Model\ModLessonGetUserAttemptGrade200Response
```

Return grade information in the attempt for a given user.

Return grade information in the attempt for a given user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLessonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lesson_get_user_attempt_grade_request = new \OpenAPI\Client\Model\ModLessonGetUserAttemptGradeRequest(); // \OpenAPI\Client\Model\ModLessonGetUserAttemptGradeRequest

try {
    $result = $apiInstance->modLessonGetUserAttemptGrade($mod_lesson_get_user_attempt_grade_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLessonApi->modLessonGetUserAttemptGrade: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lesson_get_user_attempt_grade_request** | [**\OpenAPI\Client\Model\ModLessonGetUserAttemptGradeRequest**](../Model/ModLessonGetUserAttemptGradeRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLessonGetUserAttemptGrade200Response**](../Model/ModLessonGetUserAttemptGrade200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLessonGetUserGrade()`

```php
modLessonGetUserGrade($mod_lesson_get_user_grade_request): \OpenAPI\Client\Model\ModLessonGetUserGrade200Response
```

Return the final grade in the lesson for the given user.

Return the final grade in the lesson for the given user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLessonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lesson_get_user_grade_request = new \OpenAPI\Client\Model\ModLessonGetUserGradeRequest(); // \OpenAPI\Client\Model\ModLessonGetUserGradeRequest

try {
    $result = $apiInstance->modLessonGetUserGrade($mod_lesson_get_user_grade_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLessonApi->modLessonGetUserGrade: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lesson_get_user_grade_request** | [**\OpenAPI\Client\Model\ModLessonGetUserGradeRequest**](../Model/ModLessonGetUserGradeRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLessonGetUserGrade200Response**](../Model/ModLessonGetUserGrade200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLessonGetUserTimers()`

```php
modLessonGetUserTimers($mod_lesson_get_user_grade_request): \OpenAPI\Client\Model\ModLessonGetUserTimers200Response
```

Return the timers in the current lesson for the given user.

Return the timers in the current lesson for the given user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLessonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lesson_get_user_grade_request = new \OpenAPI\Client\Model\ModLessonGetUserGradeRequest(); // \OpenAPI\Client\Model\ModLessonGetUserGradeRequest

try {
    $result = $apiInstance->modLessonGetUserTimers($mod_lesson_get_user_grade_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLessonApi->modLessonGetUserTimers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lesson_get_user_grade_request** | [**\OpenAPI\Client\Model\ModLessonGetUserGradeRequest**](../Model/ModLessonGetUserGradeRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLessonGetUserTimers200Response**](../Model/ModLessonGetUserTimers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLessonLaunchAttempt()`

```php
modLessonLaunchAttempt($mod_lesson_launch_attempt_request): \OpenAPI\Client\Model\ModLessonLaunchAttempt200Response
```

Starts a new attempt or continues an existing one.

Starts a new attempt or continues an existing one.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLessonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lesson_launch_attempt_request = new \OpenAPI\Client\Model\ModLessonLaunchAttemptRequest(); // \OpenAPI\Client\Model\ModLessonLaunchAttemptRequest

try {
    $result = $apiInstance->modLessonLaunchAttempt($mod_lesson_launch_attempt_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLessonApi->modLessonLaunchAttempt: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lesson_launch_attempt_request** | [**\OpenAPI\Client\Model\ModLessonLaunchAttemptRequest**](../Model/ModLessonLaunchAttemptRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLessonLaunchAttempt200Response**](../Model/ModLessonLaunchAttempt200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLessonProcessPage()`

```php
modLessonProcessPage($mod_lesson_process_page_request): \OpenAPI\Client\Model\ModLessonProcessPage200Response
```

Processes page responses.

Processes page responses.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLessonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lesson_process_page_request = new \OpenAPI\Client\Model\ModLessonProcessPageRequest(); // \OpenAPI\Client\Model\ModLessonProcessPageRequest

try {
    $result = $apiInstance->modLessonProcessPage($mod_lesson_process_page_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLessonApi->modLessonProcessPage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lesson_process_page_request** | [**\OpenAPI\Client\Model\ModLessonProcessPageRequest**](../Model/ModLessonProcessPageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLessonProcessPage200Response**](../Model/ModLessonProcessPage200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLessonViewLesson()`

```php
modLessonViewLesson($mod_lesson_get_lesson_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
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


$apiInstance = new OpenAPI\Client\Api\ModLessonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lesson_get_lesson_request = new \OpenAPI\Client\Model\ModLessonGetLessonRequest(); // \OpenAPI\Client\Model\ModLessonGetLessonRequest

try {
    $result = $apiInstance->modLessonViewLesson($mod_lesson_get_lesson_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLessonApi->modLessonViewLesson: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lesson_get_lesson_request** | [**\OpenAPI\Client\Model\ModLessonGetLessonRequest**](../Model/ModLessonGetLessonRequest.md)|  | |

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
