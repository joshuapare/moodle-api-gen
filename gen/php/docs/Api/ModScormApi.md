# OpenAPI\Client\ModScormApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modScormGetScormAccessInformation()**](ModScormApi.md#modScormGetScormAccessInformation) | **POST** /mod_scorm_get_scorm_access_information | Return capabilities information for a given scorm. |
| [**modScormGetScormAttemptCount()**](ModScormApi.md#modScormGetScormAttemptCount) | **POST** /mod_scorm_get_scorm_attempt_count | Return the number of attempts done by a user in the given SCORM. |
| [**modScormGetScormScoTracks()**](ModScormApi.md#modScormGetScormScoTracks) | **POST** /mod_scorm_get_scorm_sco_tracks | Retrieves SCO tracking data for the given user id and attempt number |
| [**modScormGetScormScoes()**](ModScormApi.md#modScormGetScormScoes) | **POST** /mod_scorm_get_scorm_scoes | Returns a list containing all the scoes data related to the given scorm id |
| [**modScormGetScormUserData()**](ModScormApi.md#modScormGetScormUserData) | **POST** /mod_scorm_get_scorm_user_data | Retrieves user tracking and SCO data and default SCORM values |
| [**modScormGetScormsByCourses()**](ModScormApi.md#modScormGetScormsByCourses) | **POST** /mod_scorm_get_scorms_by_courses | Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned. |
| [**modScormInsertScormTracks()**](ModScormApi.md#modScormInsertScormTracks) | **POST** /mod_scorm_insert_scorm_tracks | Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data. |
| [**modScormLaunchSco()**](ModScormApi.md#modScormLaunchSco) | **POST** /mod_scorm_launch_sco | Trigger the SCO launched event. |
| [**modScormViewScorm()**](ModScormApi.md#modScormViewScorm) | **POST** /mod_scorm_view_scorm | Trigger the course module viewed event. |


## `modScormGetScormAccessInformation()`

```php
modScormGetScormAccessInformation($mod_scorm_get_scorm_access_information_request): \OpenAPI\Client\Model\ModScormGetScormAccessInformation200Response
```

Return capabilities information for a given scorm.

Return capabilities information for a given scorm.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModScormApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_scorm_get_scorm_access_information_request = new \OpenAPI\Client\Model\ModScormGetScormAccessInformationRequest(); // \OpenAPI\Client\Model\ModScormGetScormAccessInformationRequest

try {
    $result = $apiInstance->modScormGetScormAccessInformation($mod_scorm_get_scorm_access_information_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModScormApi->modScormGetScormAccessInformation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_scorm_get_scorm_access_information_request** | [**\OpenAPI\Client\Model\ModScormGetScormAccessInformationRequest**](../Model/ModScormGetScormAccessInformationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModScormGetScormAccessInformation200Response**](../Model/ModScormGetScormAccessInformation200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modScormGetScormAttemptCount()`

```php
modScormGetScormAttemptCount($mod_scorm_get_scorm_attempt_count_request): \OpenAPI\Client\Model\ModScormGetScormAttemptCount200Response
```

Return the number of attempts done by a user in the given SCORM.

Return the number of attempts done by a user in the given SCORM.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModScormApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_scorm_get_scorm_attempt_count_request = new \OpenAPI\Client\Model\ModScormGetScormAttemptCountRequest(); // \OpenAPI\Client\Model\ModScormGetScormAttemptCountRequest

try {
    $result = $apiInstance->modScormGetScormAttemptCount($mod_scorm_get_scorm_attempt_count_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModScormApi->modScormGetScormAttemptCount: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_scorm_get_scorm_attempt_count_request** | [**\OpenAPI\Client\Model\ModScormGetScormAttemptCountRequest**](../Model/ModScormGetScormAttemptCountRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModScormGetScormAttemptCount200Response**](../Model/ModScormGetScormAttemptCount200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modScormGetScormScoTracks()`

```php
modScormGetScormScoTracks($mod_scorm_get_scorm_sco_tracks_request): \OpenAPI\Client\Model\ModScormGetScormScoTracks200Response
```

Retrieves SCO tracking data for the given user id and attempt number

Retrieves SCO tracking data for the given user id and attempt number

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModScormApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_scorm_get_scorm_sco_tracks_request = new \OpenAPI\Client\Model\ModScormGetScormScoTracksRequest(); // \OpenAPI\Client\Model\ModScormGetScormScoTracksRequest

try {
    $result = $apiInstance->modScormGetScormScoTracks($mod_scorm_get_scorm_sco_tracks_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModScormApi->modScormGetScormScoTracks: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_scorm_get_scorm_sco_tracks_request** | [**\OpenAPI\Client\Model\ModScormGetScormScoTracksRequest**](../Model/ModScormGetScormScoTracksRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModScormGetScormScoTracks200Response**](../Model/ModScormGetScormScoTracks200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modScormGetScormScoes()`

```php
modScormGetScormScoes($mod_scorm_get_scorm_scoes_request): \OpenAPI\Client\Model\ModScormGetScormScoes200Response
```

Returns a list containing all the scoes data related to the given scorm id

Returns a list containing all the scoes data related to the given scorm id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModScormApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_scorm_get_scorm_scoes_request = new \OpenAPI\Client\Model\ModScormGetScormScoesRequest(); // \OpenAPI\Client\Model\ModScormGetScormScoesRequest

try {
    $result = $apiInstance->modScormGetScormScoes($mod_scorm_get_scorm_scoes_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModScormApi->modScormGetScormScoes: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_scorm_get_scorm_scoes_request** | [**\OpenAPI\Client\Model\ModScormGetScormScoesRequest**](../Model/ModScormGetScormScoesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModScormGetScormScoes200Response**](../Model/ModScormGetScormScoes200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modScormGetScormUserData()`

```php
modScormGetScormUserData($mod_scorm_get_scorm_user_data_request): \OpenAPI\Client\Model\ModScormGetScormUserData200Response
```

Retrieves user tracking and SCO data and default SCORM values

Retrieves user tracking and SCO data and default SCORM values

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModScormApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_scorm_get_scorm_user_data_request = new \OpenAPI\Client\Model\ModScormGetScormUserDataRequest(); // \OpenAPI\Client\Model\ModScormGetScormUserDataRequest

try {
    $result = $apiInstance->modScormGetScormUserData($mod_scorm_get_scorm_user_data_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModScormApi->modScormGetScormUserData: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_scorm_get_scorm_user_data_request** | [**\OpenAPI\Client\Model\ModScormGetScormUserDataRequest**](../Model/ModScormGetScormUserDataRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModScormGetScormUserData200Response**](../Model/ModScormGetScormUserData200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modScormGetScormsByCourses()`

```php
modScormGetScormsByCourses($mod_chat_get_chats_by_courses_request): \OpenAPI\Client\Model\ModScormGetScormsByCourses200Response
```

Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.

Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModScormApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_get_chats_by_courses_request = new \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest(); // \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest

try {
    $result = $apiInstance->modScormGetScormsByCourses($mod_chat_get_chats_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModScormApi->modScormGetScormsByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_get_chats_by_courses_request** | [**\OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest**](../Model/ModChatGetChatsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModScormGetScormsByCourses200Response**](../Model/ModScormGetScormsByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modScormInsertScormTracks()`

```php
modScormInsertScormTracks($mod_scorm_insert_scorm_tracks_request): \OpenAPI\Client\Model\ModScormInsertScormTracks200Response
```

Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.

Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModScormApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_scorm_insert_scorm_tracks_request = new \OpenAPI\Client\Model\ModScormInsertScormTracksRequest(); // \OpenAPI\Client\Model\ModScormInsertScormTracksRequest

try {
    $result = $apiInstance->modScormInsertScormTracks($mod_scorm_insert_scorm_tracks_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModScormApi->modScormInsertScormTracks: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_scorm_insert_scorm_tracks_request** | [**\OpenAPI\Client\Model\ModScormInsertScormTracksRequest**](../Model/ModScormInsertScormTracksRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModScormInsertScormTracks200Response**](../Model/ModScormInsertScormTracks200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modScormLaunchSco()`

```php
modScormLaunchSco($mod_scorm_launch_sco_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Trigger the SCO launched event.

Trigger the SCO launched event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModScormApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_scorm_launch_sco_request = new \OpenAPI\Client\Model\ModScormLaunchScoRequest(); // \OpenAPI\Client\Model\ModScormLaunchScoRequest

try {
    $result = $apiInstance->modScormLaunchSco($mod_scorm_launch_sco_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModScormApi->modScormLaunchSco: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_scorm_launch_sco_request** | [**\OpenAPI\Client\Model\ModScormLaunchScoRequest**](../Model/ModScormLaunchScoRequest.md)|  | |

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

## `modScormViewScorm()`

```php
modScormViewScorm($mod_scorm_view_scorm_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Trigger the course module viewed event.

Trigger the course module viewed event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModScormApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_scorm_view_scorm_request = new \OpenAPI\Client\Model\ModScormViewScormRequest(); // \OpenAPI\Client\Model\ModScormViewScormRequest

try {
    $result = $apiInstance->modScormViewScorm($mod_scorm_view_scorm_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModScormApi->modScormViewScorm: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_scorm_view_scorm_request** | [**\OpenAPI\Client\Model\ModScormViewScormRequest**](../Model/ModScormViewScormRequest.md)|  | |

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
