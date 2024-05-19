# OpenAPI\Client\ModAssignApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modAssignCopyPreviousAttempt()**](ModAssignApi.md#modAssignCopyPreviousAttempt) | **POST** /mod_assign_copy_previous_attempt | Copy a students previous attempt to a new attempt. |
| [**modAssignGetAssignments()**](ModAssignApi.md#modAssignGetAssignments) | **POST** /mod_assign_get_assignments | Returns the courses and assignments for the users capability |
| [**modAssignGetGrades()**](ModAssignApi.md#modAssignGetGrades) | **POST** /mod_assign_get_grades | Returns grades from the assignment |
| [**modAssignGetParticipant()**](ModAssignApi.md#modAssignGetParticipant) | **POST** /mod_assign_get_participant | Get a participant for an assignment, with some summary info about their submissions. |
| [**modAssignGetSubmissionStatus()**](ModAssignApi.md#modAssignGetSubmissionStatus) | **POST** /mod_assign_get_submission_status | Returns information about an assignment submission status for a given user. |
| [**modAssignGetSubmissions()**](ModAssignApi.md#modAssignGetSubmissions) | **POST** /mod_assign_get_submissions | Returns the submissions for assignments |
| [**modAssignGetUserFlags()**](ModAssignApi.md#modAssignGetUserFlags) | **POST** /mod_assign_get_user_flags | Returns the user flags for assignments |
| [**modAssignGetUserMappings()**](ModAssignApi.md#modAssignGetUserMappings) | **POST** /mod_assign_get_user_mappings | Returns the blind marking mappings for assignments |
| [**modAssignListParticipants()**](ModAssignApi.md#modAssignListParticipants) | **POST** /mod_assign_list_participants | List the participants for a single assignment, with some summary info about their submissions. |
| [**modAssignLockSubmissions()**](ModAssignApi.md#modAssignLockSubmissions) | **POST** /mod_assign_lock_submissions | Prevent students from making changes to a list of submissions |
| [**modAssignRevealIdentities()**](ModAssignApi.md#modAssignRevealIdentities) | **POST** /mod_assign_reveal_identities | Reveal the identities for a blind marking assignment |
| [**modAssignRevertSubmissionsToDraft()**](ModAssignApi.md#modAssignRevertSubmissionsToDraft) | **POST** /mod_assign_revert_submissions_to_draft | Reverts the list of submissions to draft status |
| [**modAssignSaveGrade()**](ModAssignApi.md#modAssignSaveGrade) | **POST** /mod_assign_save_grade | Save a grade update for a single student. |
| [**modAssignSaveGrades()**](ModAssignApi.md#modAssignSaveGrades) | **POST** /mod_assign_save_grades | Save multiple grade updates for an assignment. |
| [**modAssignSaveSubmission()**](ModAssignApi.md#modAssignSaveSubmission) | **POST** /mod_assign_save_submission | Update the current students submission |
| [**modAssignSaveUserExtensions()**](ModAssignApi.md#modAssignSaveUserExtensions) | **POST** /mod_assign_save_user_extensions | Save a list of assignment extensions |
| [**modAssignSetUserFlags()**](ModAssignApi.md#modAssignSetUserFlags) | **POST** /mod_assign_set_user_flags | Creates or updates user flags |
| [**modAssignStartSubmission()**](ModAssignApi.md#modAssignStartSubmission) | **POST** /mod_assign_start_submission | Start a submission for user if assignment has a time limit. |
| [**modAssignSubmitForGrading()**](ModAssignApi.md#modAssignSubmitForGrading) | **POST** /mod_assign_submit_for_grading | Submit the current students assignment for grading |
| [**modAssignSubmitGradingForm()**](ModAssignApi.md#modAssignSubmitGradingForm) | **POST** /mod_assign_submit_grading_form | Submit the grading form data via ajax |
| [**modAssignUnlockSubmissions()**](ModAssignApi.md#modAssignUnlockSubmissions) | **POST** /mod_assign_unlock_submissions | Allow students to make changes to a list of submissions |
| [**modAssignViewAssign()**](ModAssignApi.md#modAssignViewAssign) | **POST** /mod_assign_view_assign | Update the module completion status. |
| [**modAssignViewGradingTable()**](ModAssignApi.md#modAssignViewGradingTable) | **POST** /mod_assign_view_grading_table | Trigger the grading_table_viewed event. |
| [**modAssignViewSubmissionStatus()**](ModAssignApi.md#modAssignViewSubmissionStatus) | **POST** /mod_assign_view_submission_status | Trigger the submission status viewed event. |


## `modAssignCopyPreviousAttempt()`

```php
modAssignCopyPreviousAttempt($mod_assign_copy_previous_attempt_request): object
```

Copy a students previous attempt to a new attempt.

Copy a students previous attempt to a new attempt.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_copy_previous_attempt_request = new \OpenAPI\Client\Model\ModAssignCopyPreviousAttemptRequest(); // \OpenAPI\Client\Model\ModAssignCopyPreviousAttemptRequest

try {
    $result = $apiInstance->modAssignCopyPreviousAttempt($mod_assign_copy_previous_attempt_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignCopyPreviousAttempt: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_copy_previous_attempt_request** | [**\OpenAPI\Client\Model\ModAssignCopyPreviousAttemptRequest**](../Model/ModAssignCopyPreviousAttemptRequest.md)|  | |

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

## `modAssignGetAssignments()`

```php
modAssignGetAssignments($mod_assign_get_assignments_request): \OpenAPI\Client\Model\ModAssignGetAssignments200Response
```

Returns the courses and assignments for the users capability

Returns the courses and assignments for the users capability

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_get_assignments_request = new \OpenAPI\Client\Model\ModAssignGetAssignmentsRequest(); // \OpenAPI\Client\Model\ModAssignGetAssignmentsRequest

try {
    $result = $apiInstance->modAssignGetAssignments($mod_assign_get_assignments_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignGetAssignments: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_get_assignments_request** | [**\OpenAPI\Client\Model\ModAssignGetAssignmentsRequest**](../Model/ModAssignGetAssignmentsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModAssignGetAssignments200Response**](../Model/ModAssignGetAssignments200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modAssignGetGrades()`

```php
modAssignGetGrades($mod_assign_get_grades_request): \OpenAPI\Client\Model\ModAssignGetGrades200Response
```

Returns grades from the assignment

Returns grades from the assignment

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_get_grades_request = new \OpenAPI\Client\Model\ModAssignGetGradesRequest(); // \OpenAPI\Client\Model\ModAssignGetGradesRequest

try {
    $result = $apiInstance->modAssignGetGrades($mod_assign_get_grades_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignGetGrades: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_get_grades_request** | [**\OpenAPI\Client\Model\ModAssignGetGradesRequest**](../Model/ModAssignGetGradesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModAssignGetGrades200Response**](../Model/ModAssignGetGrades200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modAssignGetParticipant()`

```php
modAssignGetParticipant($mod_assign_get_participant_request): \OpenAPI\Client\Model\ModAssignGetParticipant200Response
```

Get a participant for an assignment, with some summary info about their submissions.

Get a participant for an assignment, with some summary info about their submissions.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_get_participant_request = new \OpenAPI\Client\Model\ModAssignGetParticipantRequest(); // \OpenAPI\Client\Model\ModAssignGetParticipantRequest

try {
    $result = $apiInstance->modAssignGetParticipant($mod_assign_get_participant_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignGetParticipant: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_get_participant_request** | [**\OpenAPI\Client\Model\ModAssignGetParticipantRequest**](../Model/ModAssignGetParticipantRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModAssignGetParticipant200Response**](../Model/ModAssignGetParticipant200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modAssignGetSubmissionStatus()`

```php
modAssignGetSubmissionStatus($mod_assign_get_submission_status_request): \OpenAPI\Client\Model\ModAssignGetSubmissionStatus200Response
```

Returns information about an assignment submission status for a given user.

Returns information about an assignment submission status for a given user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_get_submission_status_request = new \OpenAPI\Client\Model\ModAssignGetSubmissionStatusRequest(); // \OpenAPI\Client\Model\ModAssignGetSubmissionStatusRequest

try {
    $result = $apiInstance->modAssignGetSubmissionStatus($mod_assign_get_submission_status_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignGetSubmissionStatus: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_get_submission_status_request** | [**\OpenAPI\Client\Model\ModAssignGetSubmissionStatusRequest**](../Model/ModAssignGetSubmissionStatusRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModAssignGetSubmissionStatus200Response**](../Model/ModAssignGetSubmissionStatus200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modAssignGetSubmissions()`

```php
modAssignGetSubmissions($mod_assign_get_submissions_request): \OpenAPI\Client\Model\ModAssignGetSubmissions200Response
```

Returns the submissions for assignments

Returns the submissions for assignments

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_get_submissions_request = new \OpenAPI\Client\Model\ModAssignGetSubmissionsRequest(); // \OpenAPI\Client\Model\ModAssignGetSubmissionsRequest

try {
    $result = $apiInstance->modAssignGetSubmissions($mod_assign_get_submissions_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignGetSubmissions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_get_submissions_request** | [**\OpenAPI\Client\Model\ModAssignGetSubmissionsRequest**](../Model/ModAssignGetSubmissionsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModAssignGetSubmissions200Response**](../Model/ModAssignGetSubmissions200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modAssignGetUserFlags()`

```php
modAssignGetUserFlags($mod_assign_get_user_flags_request): \OpenAPI\Client\Model\ModAssignGetUserFlags200Response
```

Returns the user flags for assignments

Returns the user flags for assignments

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_get_user_flags_request = new \OpenAPI\Client\Model\ModAssignGetUserFlagsRequest(); // \OpenAPI\Client\Model\ModAssignGetUserFlagsRequest

try {
    $result = $apiInstance->modAssignGetUserFlags($mod_assign_get_user_flags_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignGetUserFlags: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_get_user_flags_request** | [**\OpenAPI\Client\Model\ModAssignGetUserFlagsRequest**](../Model/ModAssignGetUserFlagsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModAssignGetUserFlags200Response**](../Model/ModAssignGetUserFlags200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modAssignGetUserMappings()`

```php
modAssignGetUserMappings($mod_assign_get_user_flags_request): \OpenAPI\Client\Model\ModAssignGetUserMappings200Response
```

Returns the blind marking mappings for assignments

Returns the blind marking mappings for assignments

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_get_user_flags_request = new \OpenAPI\Client\Model\ModAssignGetUserFlagsRequest(); // \OpenAPI\Client\Model\ModAssignGetUserFlagsRequest

try {
    $result = $apiInstance->modAssignGetUserMappings($mod_assign_get_user_flags_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignGetUserMappings: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_get_user_flags_request** | [**\OpenAPI\Client\Model\ModAssignGetUserFlagsRequest**](../Model/ModAssignGetUserFlagsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModAssignGetUserMappings200Response**](../Model/ModAssignGetUserMappings200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modAssignListParticipants()`

```php
modAssignListParticipants($mod_assign_list_participants_request): object
```

List the participants for a single assignment, with some summary info about their submissions.

List the participants for a single assignment, with some summary info about their submissions.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_list_participants_request = new \OpenAPI\Client\Model\ModAssignListParticipantsRequest(); // \OpenAPI\Client\Model\ModAssignListParticipantsRequest

try {
    $result = $apiInstance->modAssignListParticipants($mod_assign_list_participants_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignListParticipants: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_list_participants_request** | [**\OpenAPI\Client\Model\ModAssignListParticipantsRequest**](../Model/ModAssignListParticipantsRequest.md)|  | |

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

## `modAssignLockSubmissions()`

```php
modAssignLockSubmissions($mod_assign_lock_submissions_request): object
```

Prevent students from making changes to a list of submissions

Prevent students from making changes to a list of submissions

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_lock_submissions_request = new \OpenAPI\Client\Model\ModAssignLockSubmissionsRequest(); // \OpenAPI\Client\Model\ModAssignLockSubmissionsRequest

try {
    $result = $apiInstance->modAssignLockSubmissions($mod_assign_lock_submissions_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignLockSubmissions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_lock_submissions_request** | [**\OpenAPI\Client\Model\ModAssignLockSubmissionsRequest**](../Model/ModAssignLockSubmissionsRequest.md)|  | |

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

## `modAssignRevealIdentities()`

```php
modAssignRevealIdentities($mod_assign_reveal_identities_request): object
```

Reveal the identities for a blind marking assignment

Reveal the identities for a blind marking assignment

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_reveal_identities_request = new \OpenAPI\Client\Model\ModAssignRevealIdentitiesRequest(); // \OpenAPI\Client\Model\ModAssignRevealIdentitiesRequest

try {
    $result = $apiInstance->modAssignRevealIdentities($mod_assign_reveal_identities_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignRevealIdentities: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_reveal_identities_request** | [**\OpenAPI\Client\Model\ModAssignRevealIdentitiesRequest**](../Model/ModAssignRevealIdentitiesRequest.md)|  | |

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

## `modAssignRevertSubmissionsToDraft()`

```php
modAssignRevertSubmissionsToDraft($mod_assign_revert_submissions_to_draft_request): object
```

Reverts the list of submissions to draft status

Reverts the list of submissions to draft status

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_revert_submissions_to_draft_request = new \OpenAPI\Client\Model\ModAssignRevertSubmissionsToDraftRequest(); // \OpenAPI\Client\Model\ModAssignRevertSubmissionsToDraftRequest

try {
    $result = $apiInstance->modAssignRevertSubmissionsToDraft($mod_assign_revert_submissions_to_draft_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignRevertSubmissionsToDraft: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_revert_submissions_to_draft_request** | [**\OpenAPI\Client\Model\ModAssignRevertSubmissionsToDraftRequest**](../Model/ModAssignRevertSubmissionsToDraftRequest.md)|  | |

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

## `modAssignSaveGrade()`

```php
modAssignSaveGrade($mod_assign_save_grade_request): object
```

Save a grade update for a single student.

Save a grade update for a single student.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_save_grade_request = new \OpenAPI\Client\Model\ModAssignSaveGradeRequest(); // \OpenAPI\Client\Model\ModAssignSaveGradeRequest

try {
    $result = $apiInstance->modAssignSaveGrade($mod_assign_save_grade_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignSaveGrade: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_save_grade_request** | [**\OpenAPI\Client\Model\ModAssignSaveGradeRequest**](../Model/ModAssignSaveGradeRequest.md)|  | |

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

## `modAssignSaveGrades()`

```php
modAssignSaveGrades($mod_assign_save_grades_request): object
```

Save multiple grade updates for an assignment.

Save multiple grade updates for an assignment.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_save_grades_request = new \OpenAPI\Client\Model\ModAssignSaveGradesRequest(); // \OpenAPI\Client\Model\ModAssignSaveGradesRequest

try {
    $result = $apiInstance->modAssignSaveGrades($mod_assign_save_grades_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignSaveGrades: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_save_grades_request** | [**\OpenAPI\Client\Model\ModAssignSaveGradesRequest**](../Model/ModAssignSaveGradesRequest.md)|  | |

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

## `modAssignSaveSubmission()`

```php
modAssignSaveSubmission($mod_assign_save_submission_request): object
```

Update the current students submission

Update the current students submission

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_save_submission_request = new \OpenAPI\Client\Model\ModAssignSaveSubmissionRequest(); // \OpenAPI\Client\Model\ModAssignSaveSubmissionRequest

try {
    $result = $apiInstance->modAssignSaveSubmission($mod_assign_save_submission_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignSaveSubmission: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_save_submission_request** | [**\OpenAPI\Client\Model\ModAssignSaveSubmissionRequest**](../Model/ModAssignSaveSubmissionRequest.md)|  | |

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

## `modAssignSaveUserExtensions()`

```php
modAssignSaveUserExtensions($mod_assign_save_user_extensions_request): object
```

Save a list of assignment extensions

Save a list of assignment extensions

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_save_user_extensions_request = new \OpenAPI\Client\Model\ModAssignSaveUserExtensionsRequest(); // \OpenAPI\Client\Model\ModAssignSaveUserExtensionsRequest

try {
    $result = $apiInstance->modAssignSaveUserExtensions($mod_assign_save_user_extensions_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignSaveUserExtensions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_save_user_extensions_request** | [**\OpenAPI\Client\Model\ModAssignSaveUserExtensionsRequest**](../Model/ModAssignSaveUserExtensionsRequest.md)|  | |

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

## `modAssignSetUserFlags()`

```php
modAssignSetUserFlags($mod_assign_set_user_flags_request): object
```

Creates or updates user flags

Creates or updates user flags

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_set_user_flags_request = new \OpenAPI\Client\Model\ModAssignSetUserFlagsRequest(); // \OpenAPI\Client\Model\ModAssignSetUserFlagsRequest

try {
    $result = $apiInstance->modAssignSetUserFlags($mod_assign_set_user_flags_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignSetUserFlags: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_set_user_flags_request** | [**\OpenAPI\Client\Model\ModAssignSetUserFlagsRequest**](../Model/ModAssignSetUserFlagsRequest.md)|  | |

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

## `modAssignStartSubmission()`

```php
modAssignStartSubmission($mod_assign_start_submission_request): \OpenAPI\Client\Model\ModAssignStartSubmission200Response
```

Start a submission for user if assignment has a time limit.

Start a submission for user if assignment has a time limit.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_start_submission_request = new \OpenAPI\Client\Model\ModAssignStartSubmissionRequest(); // \OpenAPI\Client\Model\ModAssignStartSubmissionRequest

try {
    $result = $apiInstance->modAssignStartSubmission($mod_assign_start_submission_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignStartSubmission: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_start_submission_request** | [**\OpenAPI\Client\Model\ModAssignStartSubmissionRequest**](../Model/ModAssignStartSubmissionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModAssignStartSubmission200Response**](../Model/ModAssignStartSubmission200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modAssignSubmitForGrading()`

```php
modAssignSubmitForGrading($mod_assign_submit_for_grading_request): object
```

Submit the current students assignment for grading

Submit the current students assignment for grading

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_submit_for_grading_request = new \OpenAPI\Client\Model\ModAssignSubmitForGradingRequest(); // \OpenAPI\Client\Model\ModAssignSubmitForGradingRequest

try {
    $result = $apiInstance->modAssignSubmitForGrading($mod_assign_submit_for_grading_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignSubmitForGrading: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_submit_for_grading_request** | [**\OpenAPI\Client\Model\ModAssignSubmitForGradingRequest**](../Model/ModAssignSubmitForGradingRequest.md)|  | |

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

## `modAssignSubmitGradingForm()`

```php
modAssignSubmitGradingForm($mod_assign_submit_grading_form_request): object
```

Submit the grading form data via ajax

Submit the grading form data via ajax

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_submit_grading_form_request = new \OpenAPI\Client\Model\ModAssignSubmitGradingFormRequest(); // \OpenAPI\Client\Model\ModAssignSubmitGradingFormRequest

try {
    $result = $apiInstance->modAssignSubmitGradingForm($mod_assign_submit_grading_form_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignSubmitGradingForm: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_submit_grading_form_request** | [**\OpenAPI\Client\Model\ModAssignSubmitGradingFormRequest**](../Model/ModAssignSubmitGradingFormRequest.md)|  | |

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

## `modAssignUnlockSubmissions()`

```php
modAssignUnlockSubmissions($mod_assign_revert_submissions_to_draft_request): object
```

Allow students to make changes to a list of submissions

Allow students to make changes to a list of submissions

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_revert_submissions_to_draft_request = new \OpenAPI\Client\Model\ModAssignRevertSubmissionsToDraftRequest(); // \OpenAPI\Client\Model\ModAssignRevertSubmissionsToDraftRequest

try {
    $result = $apiInstance->modAssignUnlockSubmissions($mod_assign_revert_submissions_to_draft_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignUnlockSubmissions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_revert_submissions_to_draft_request** | [**\OpenAPI\Client\Model\ModAssignRevertSubmissionsToDraftRequest**](../Model/ModAssignRevertSubmissionsToDraftRequest.md)|  | |

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

## `modAssignViewAssign()`

```php
modAssignViewAssign($mod_assign_view_assign_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Update the module completion status.

Update the module completion status.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_view_assign_request = new \OpenAPI\Client\Model\ModAssignViewAssignRequest(); // \OpenAPI\Client\Model\ModAssignViewAssignRequest

try {
    $result = $apiInstance->modAssignViewAssign($mod_assign_view_assign_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignViewAssign: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_view_assign_request** | [**\OpenAPI\Client\Model\ModAssignViewAssignRequest**](../Model/ModAssignViewAssignRequest.md)|  | |

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

## `modAssignViewGradingTable()`

```php
modAssignViewGradingTable($mod_assign_view_assign_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Trigger the grading_table_viewed event.

Trigger the grading_table_viewed event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_view_assign_request = new \OpenAPI\Client\Model\ModAssignViewAssignRequest(); // \OpenAPI\Client\Model\ModAssignViewAssignRequest

try {
    $result = $apiInstance->modAssignViewGradingTable($mod_assign_view_assign_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignViewGradingTable: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_view_assign_request** | [**\OpenAPI\Client\Model\ModAssignViewAssignRequest**](../Model/ModAssignViewAssignRequest.md)|  | |

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

## `modAssignViewSubmissionStatus()`

```php
modAssignViewSubmissionStatus($mod_assign_view_assign_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Trigger the submission status viewed event.

Trigger the submission status viewed event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModAssignApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_assign_view_assign_request = new \OpenAPI\Client\Model\ModAssignViewAssignRequest(); // \OpenAPI\Client\Model\ModAssignViewAssignRequest

try {
    $result = $apiInstance->modAssignViewSubmissionStatus($mod_assign_view_assign_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModAssignApi->modAssignViewSubmissionStatus: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_assign_view_assign_request** | [**\OpenAPI\Client\Model\ModAssignViewAssignRequest**](../Model/ModAssignViewAssignRequest.md)|  | |

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
