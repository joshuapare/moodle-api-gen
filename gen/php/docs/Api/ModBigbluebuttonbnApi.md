# OpenAPI\Client\ModBigbluebuttonbnApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modBigbluebuttonbnCanJoin()**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnCanJoin) | **POST** /mod_bigbluebuttonbn_can_join | Returns information if the current user can join or not. |
| [**modBigbluebuttonbnCompletionValidate()**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnCompletionValidate) | **POST** /mod_bigbluebuttonbn_completion_validate | Validate completion |
| [**modBigbluebuttonbnEndMeeting()**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnEndMeeting) | **POST** /mod_bigbluebuttonbn_end_meeting | End a meeting |
| [**modBigbluebuttonbnGetBigbluebuttonbnsByCourses()**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnGetBigbluebuttonbnsByCourses) | **POST** /mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses | Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned. |
| [**modBigbluebuttonbnGetJoinUrl()**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnGetJoinUrl) | **POST** /mod_bigbluebuttonbn_get_join_url | Get the join URL for the meeting and create if it does not exist. |
| [**modBigbluebuttonbnGetRecordings()**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnGetRecordings) | **POST** /mod_bigbluebuttonbn_get_recordings | Returns a list of recordings ready to be processed by a datatable. |
| [**modBigbluebuttonbnGetRecordingsToImport()**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnGetRecordingsToImport) | **POST** /mod_bigbluebuttonbn_get_recordings_to_import | Returns a list of recordings ready to import to be processed by a datatable. |
| [**modBigbluebuttonbnMeetingInfo()**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnMeetingInfo) | **POST** /mod_bigbluebuttonbn_meeting_info | Get displayable information on the meeting |
| [**modBigbluebuttonbnUpdateRecording()**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnUpdateRecording) | **POST** /mod_bigbluebuttonbn_update_recording | Update a single recording |
| [**modBigbluebuttonbnViewBigbluebuttonbn()**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnViewBigbluebuttonbn) | **POST** /mod_bigbluebuttonbn_view_bigbluebuttonbn | Trigger the course module viewed event and update the module completion status. |


## `modBigbluebuttonbnCanJoin()`

```php
modBigbluebuttonbnCanJoin($mod_bigbluebuttonbn_can_join_request): \OpenAPI\Client\Model\ModBigbluebuttonbnCanJoin200Response
```

Returns information if the current user can join or not.

Returns information if the current user can join or not.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModBigbluebuttonbnApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_bigbluebuttonbn_can_join_request = new \OpenAPI\Client\Model\ModBigbluebuttonbnCanJoinRequest(); // \OpenAPI\Client\Model\ModBigbluebuttonbnCanJoinRequest

try {
    $result = $apiInstance->modBigbluebuttonbnCanJoin($mod_bigbluebuttonbn_can_join_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModBigbluebuttonbnApi->modBigbluebuttonbnCanJoin: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_bigbluebuttonbn_can_join_request** | [**\OpenAPI\Client\Model\ModBigbluebuttonbnCanJoinRequest**](../Model/ModBigbluebuttonbnCanJoinRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModBigbluebuttonbnCanJoin200Response**](../Model/ModBigbluebuttonbnCanJoin200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modBigbluebuttonbnCompletionValidate()`

```php
modBigbluebuttonbnCompletionValidate($mod_bigbluebuttonbn_completion_validate_request): \OpenAPI\Client\Model\CoreCohortAddCohortMembers200Response
```

Validate completion

Validate completion

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModBigbluebuttonbnApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_bigbluebuttonbn_completion_validate_request = new \OpenAPI\Client\Model\ModBigbluebuttonbnCompletionValidateRequest(); // \OpenAPI\Client\Model\ModBigbluebuttonbnCompletionValidateRequest

try {
    $result = $apiInstance->modBigbluebuttonbnCompletionValidate($mod_bigbluebuttonbn_completion_validate_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModBigbluebuttonbnApi->modBigbluebuttonbnCompletionValidate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_bigbluebuttonbn_completion_validate_request** | [**\OpenAPI\Client\Model\ModBigbluebuttonbnCompletionValidateRequest**](../Model/ModBigbluebuttonbnCompletionValidateRequest.md)|  | |

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

## `modBigbluebuttonbnEndMeeting()`

```php
modBigbluebuttonbnEndMeeting($mod_bigbluebuttonbn_end_meeting_request): \OpenAPI\Client\Model\CoreCohortAddCohortMembers200Response
```

End a meeting

End a meeting

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModBigbluebuttonbnApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_bigbluebuttonbn_end_meeting_request = new \OpenAPI\Client\Model\ModBigbluebuttonbnEndMeetingRequest(); // \OpenAPI\Client\Model\ModBigbluebuttonbnEndMeetingRequest

try {
    $result = $apiInstance->modBigbluebuttonbnEndMeeting($mod_bigbluebuttonbn_end_meeting_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModBigbluebuttonbnApi->modBigbluebuttonbnEndMeeting: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_bigbluebuttonbn_end_meeting_request** | [**\OpenAPI\Client\Model\ModBigbluebuttonbnEndMeetingRequest**](../Model/ModBigbluebuttonbnEndMeetingRequest.md)|  | |

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

## `modBigbluebuttonbnGetBigbluebuttonbnsByCourses()`

```php
modBigbluebuttonbnGetBigbluebuttonbnsByCourses($mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request): \OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response
```

Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.

Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModBigbluebuttonbnApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request = new \OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // \OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest

try {
    $result = $apiInstance->modBigbluebuttonbnGetBigbluebuttonbnsByCourses($mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModBigbluebuttonbnApi->modBigbluebuttonbnGetBigbluebuttonbnsByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**\OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](../Model/ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response**](../Model/ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modBigbluebuttonbnGetJoinUrl()`

```php
modBigbluebuttonbnGetJoinUrl($mod_bigbluebuttonbn_can_join_request): \OpenAPI\Client\Model\ModBigbluebuttonbnGetJoinUrl200Response
```

Get the join URL for the meeting and create if it does not exist.

Get the join URL for the meeting and create if it does not exist.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModBigbluebuttonbnApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_bigbluebuttonbn_can_join_request = new \OpenAPI\Client\Model\ModBigbluebuttonbnCanJoinRequest(); // \OpenAPI\Client\Model\ModBigbluebuttonbnCanJoinRequest

try {
    $result = $apiInstance->modBigbluebuttonbnGetJoinUrl($mod_bigbluebuttonbn_can_join_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModBigbluebuttonbnApi->modBigbluebuttonbnGetJoinUrl: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_bigbluebuttonbn_can_join_request** | [**\OpenAPI\Client\Model\ModBigbluebuttonbnCanJoinRequest**](../Model/ModBigbluebuttonbnCanJoinRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModBigbluebuttonbnGetJoinUrl200Response**](../Model/ModBigbluebuttonbnGetJoinUrl200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modBigbluebuttonbnGetRecordings()`

```php
modBigbluebuttonbnGetRecordings($mod_bigbluebuttonbn_get_recordings_request): \OpenAPI\Client\Model\ModBigbluebuttonbnGetRecordings200Response
```

Returns a list of recordings ready to be processed by a datatable.

Returns a list of recordings ready to be processed by a datatable.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModBigbluebuttonbnApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_bigbluebuttonbn_get_recordings_request = new \OpenAPI\Client\Model\ModBigbluebuttonbnGetRecordingsRequest(); // \OpenAPI\Client\Model\ModBigbluebuttonbnGetRecordingsRequest

try {
    $result = $apiInstance->modBigbluebuttonbnGetRecordings($mod_bigbluebuttonbn_get_recordings_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModBigbluebuttonbnApi->modBigbluebuttonbnGetRecordings: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_bigbluebuttonbn_get_recordings_request** | [**\OpenAPI\Client\Model\ModBigbluebuttonbnGetRecordingsRequest**](../Model/ModBigbluebuttonbnGetRecordingsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModBigbluebuttonbnGetRecordings200Response**](../Model/ModBigbluebuttonbnGetRecordings200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modBigbluebuttonbnGetRecordingsToImport()`

```php
modBigbluebuttonbnGetRecordingsToImport($mod_bigbluebuttonbn_get_recordings_to_import_request): \OpenAPI\Client\Model\ModBigbluebuttonbnGetRecordingsToImport200Response
```

Returns a list of recordings ready to import to be processed by a datatable.

Returns a list of recordings ready to import to be processed by a datatable.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModBigbluebuttonbnApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_bigbluebuttonbn_get_recordings_to_import_request = new \OpenAPI\Client\Model\ModBigbluebuttonbnGetRecordingsToImportRequest(); // \OpenAPI\Client\Model\ModBigbluebuttonbnGetRecordingsToImportRequest

try {
    $result = $apiInstance->modBigbluebuttonbnGetRecordingsToImport($mod_bigbluebuttonbn_get_recordings_to_import_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModBigbluebuttonbnApi->modBigbluebuttonbnGetRecordingsToImport: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_bigbluebuttonbn_get_recordings_to_import_request** | [**\OpenAPI\Client\Model\ModBigbluebuttonbnGetRecordingsToImportRequest**](../Model/ModBigbluebuttonbnGetRecordingsToImportRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModBigbluebuttonbnGetRecordingsToImport200Response**](../Model/ModBigbluebuttonbnGetRecordingsToImport200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modBigbluebuttonbnMeetingInfo()`

```php
modBigbluebuttonbnMeetingInfo($mod_bigbluebuttonbn_meeting_info_request): \OpenAPI\Client\Model\ModBigbluebuttonbnMeetingInfo200Response
```

Get displayable information on the meeting

Get displayable information on the meeting

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModBigbluebuttonbnApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_bigbluebuttonbn_meeting_info_request = new \OpenAPI\Client\Model\ModBigbluebuttonbnMeetingInfoRequest(); // \OpenAPI\Client\Model\ModBigbluebuttonbnMeetingInfoRequest

try {
    $result = $apiInstance->modBigbluebuttonbnMeetingInfo($mod_bigbluebuttonbn_meeting_info_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModBigbluebuttonbnApi->modBigbluebuttonbnMeetingInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_bigbluebuttonbn_meeting_info_request** | [**\OpenAPI\Client\Model\ModBigbluebuttonbnMeetingInfoRequest**](../Model/ModBigbluebuttonbnMeetingInfoRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModBigbluebuttonbnMeetingInfo200Response**](../Model/ModBigbluebuttonbnMeetingInfo200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modBigbluebuttonbnUpdateRecording()`

```php
modBigbluebuttonbnUpdateRecording($mod_bigbluebuttonbn_update_recording_request): object
```

Update a single recording

Update a single recording

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModBigbluebuttonbnApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_bigbluebuttonbn_update_recording_request = new \OpenAPI\Client\Model\ModBigbluebuttonbnUpdateRecordingRequest(); // \OpenAPI\Client\Model\ModBigbluebuttonbnUpdateRecordingRequest

try {
    $result = $apiInstance->modBigbluebuttonbnUpdateRecording($mod_bigbluebuttonbn_update_recording_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModBigbluebuttonbnApi->modBigbluebuttonbnUpdateRecording: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_bigbluebuttonbn_update_recording_request** | [**\OpenAPI\Client\Model\ModBigbluebuttonbnUpdateRecordingRequest**](../Model/ModBigbluebuttonbnUpdateRecordingRequest.md)|  | |

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

## `modBigbluebuttonbnViewBigbluebuttonbn()`

```php
modBigbluebuttonbnViewBigbluebuttonbn($mod_bigbluebuttonbn_view_bigbluebuttonbn_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
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


$apiInstance = new OpenAPI\Client\Api\ModBigbluebuttonbnApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_bigbluebuttonbn_view_bigbluebuttonbn_request = new \OpenAPI\Client\Model\ModBigbluebuttonbnViewBigbluebuttonbnRequest(); // \OpenAPI\Client\Model\ModBigbluebuttonbnViewBigbluebuttonbnRequest

try {
    $result = $apiInstance->modBigbluebuttonbnViewBigbluebuttonbn($mod_bigbluebuttonbn_view_bigbluebuttonbn_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModBigbluebuttonbnApi->modBigbluebuttonbnViewBigbluebuttonbn: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_bigbluebuttonbn_view_bigbluebuttonbn_request** | [**\OpenAPI\Client\Model\ModBigbluebuttonbnViewBigbluebuttonbnRequest**](../Model/ModBigbluebuttonbnViewBigbluebuttonbnRequest.md)|  | |

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
