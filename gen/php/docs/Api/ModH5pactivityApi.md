# OpenAPI\Client\ModH5pactivityApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modH5pactivityGetAttempts()**](ModH5pactivityApi.md#modH5pactivityGetAttempts) | **POST** /mod_h5pactivity_get_attempts | Return the information needed to list a user attempts. |
| [**modH5pactivityGetH5pactivitiesByCourses()**](ModH5pactivityApi.md#modH5pactivityGetH5pactivitiesByCourses) | **POST** /mod_h5pactivity_get_h5pactivities_by_courses | Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned. |
| [**modH5pactivityGetH5pactivityAccessInformation()**](ModH5pactivityApi.md#modH5pactivityGetH5pactivityAccessInformation) | **POST** /mod_h5pactivity_get_h5pactivity_access_information | Return access information for a given h5p activity. |
| [**modH5pactivityGetResults()**](ModH5pactivityApi.md#modH5pactivityGetResults) | **POST** /mod_h5pactivity_get_results | Return the information needed to list a user attempt results. |
| [**modH5pactivityGetUserAttempts()**](ModH5pactivityApi.md#modH5pactivityGetUserAttempts) | **POST** /mod_h5pactivity_get_user_attempts | Return the information needed to list all enrolled user attempts. |
| [**modH5pactivityLogReportViewed()**](ModH5pactivityApi.md#modH5pactivityLogReportViewed) | **POST** /mod_h5pactivity_log_report_viewed | Log that the h5pactivity was viewed. |
| [**modH5pactivityViewH5pactivity()**](ModH5pactivityApi.md#modH5pactivityViewH5pactivity) | **POST** /mod_h5pactivity_view_h5pactivity | Trigger the course module viewed event and update the module completion status. |


## `modH5pactivityGetAttempts()`

```php
modH5pactivityGetAttempts($mod_h5pactivity_get_attempts_request): \OpenAPI\Client\Model\ModH5pactivityGetAttempts200Response
```

Return the information needed to list a user attempts.

Return the information needed to list a user attempts.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModH5pactivityApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_h5pactivity_get_attempts_request = new \OpenAPI\Client\Model\ModH5pactivityGetAttemptsRequest(); // \OpenAPI\Client\Model\ModH5pactivityGetAttemptsRequest

try {
    $result = $apiInstance->modH5pactivityGetAttempts($mod_h5pactivity_get_attempts_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModH5pactivityApi->modH5pactivityGetAttempts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_h5pactivity_get_attempts_request** | [**\OpenAPI\Client\Model\ModH5pactivityGetAttemptsRequest**](../Model/ModH5pactivityGetAttemptsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModH5pactivityGetAttempts200Response**](../Model/ModH5pactivityGetAttempts200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modH5pactivityGetH5pactivitiesByCourses()`

```php
modH5pactivityGetH5pactivitiesByCourses($mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request): \OpenAPI\Client\Model\ModH5pactivityGetH5pactivitiesByCourses200Response
```

Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.

Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModH5pactivityApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request = new \OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // \OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest

try {
    $result = $apiInstance->modH5pactivityGetH5pactivitiesByCourses($mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModH5pactivityApi->modH5pactivityGetH5pactivitiesByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**\OpenAPI\Client\Model\ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](../Model/ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModH5pactivityGetH5pactivitiesByCourses200Response**](../Model/ModH5pactivityGetH5pactivitiesByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modH5pactivityGetH5pactivityAccessInformation()`

```php
modH5pactivityGetH5pactivityAccessInformation($mod_h5pactivity_get_h5pactivity_access_information_request): \OpenAPI\Client\Model\ModH5pactivityGetH5pactivityAccessInformation200Response
```

Return access information for a given h5p activity.

Return access information for a given h5p activity.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModH5pactivityApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_h5pactivity_get_h5pactivity_access_information_request = new \OpenAPI\Client\Model\ModH5pactivityGetH5pactivityAccessInformationRequest(); // \OpenAPI\Client\Model\ModH5pactivityGetH5pactivityAccessInformationRequest

try {
    $result = $apiInstance->modH5pactivityGetH5pactivityAccessInformation($mod_h5pactivity_get_h5pactivity_access_information_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModH5pactivityApi->modH5pactivityGetH5pactivityAccessInformation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_h5pactivity_get_h5pactivity_access_information_request** | [**\OpenAPI\Client\Model\ModH5pactivityGetH5pactivityAccessInformationRequest**](../Model/ModH5pactivityGetH5pactivityAccessInformationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModH5pactivityGetH5pactivityAccessInformation200Response**](../Model/ModH5pactivityGetH5pactivityAccessInformation200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modH5pactivityGetResults()`

```php
modH5pactivityGetResults($mod_h5pactivity_get_results_request): \OpenAPI\Client\Model\ModH5pactivityGetResults200Response
```

Return the information needed to list a user attempt results.

Return the information needed to list a user attempt results.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModH5pactivityApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_h5pactivity_get_results_request = new \OpenAPI\Client\Model\ModH5pactivityGetResultsRequest(); // \OpenAPI\Client\Model\ModH5pactivityGetResultsRequest

try {
    $result = $apiInstance->modH5pactivityGetResults($mod_h5pactivity_get_results_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModH5pactivityApi->modH5pactivityGetResults: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_h5pactivity_get_results_request** | [**\OpenAPI\Client\Model\ModH5pactivityGetResultsRequest**](../Model/ModH5pactivityGetResultsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModH5pactivityGetResults200Response**](../Model/ModH5pactivityGetResults200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modH5pactivityGetUserAttempts()`

```php
modH5pactivityGetUserAttempts($mod_h5pactivity_get_user_attempts_request): \OpenAPI\Client\Model\ModH5pactivityGetUserAttempts200Response
```

Return the information needed to list all enrolled user attempts.

Return the information needed to list all enrolled user attempts.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModH5pactivityApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_h5pactivity_get_user_attempts_request = new \OpenAPI\Client\Model\ModH5pactivityGetUserAttemptsRequest(); // \OpenAPI\Client\Model\ModH5pactivityGetUserAttemptsRequest

try {
    $result = $apiInstance->modH5pactivityGetUserAttempts($mod_h5pactivity_get_user_attempts_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModH5pactivityApi->modH5pactivityGetUserAttempts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_h5pactivity_get_user_attempts_request** | [**\OpenAPI\Client\Model\ModH5pactivityGetUserAttemptsRequest**](../Model/ModH5pactivityGetUserAttemptsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModH5pactivityGetUserAttempts200Response**](../Model/ModH5pactivityGetUserAttempts200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modH5pactivityLogReportViewed()`

```php
modH5pactivityLogReportViewed($mod_h5pactivity_log_report_viewed_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Log that the h5pactivity was viewed.

Log that the h5pactivity was viewed.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModH5pactivityApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_h5pactivity_log_report_viewed_request = new \OpenAPI\Client\Model\ModH5pactivityLogReportViewedRequest(); // \OpenAPI\Client\Model\ModH5pactivityLogReportViewedRequest

try {
    $result = $apiInstance->modH5pactivityLogReportViewed($mod_h5pactivity_log_report_viewed_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModH5pactivityApi->modH5pactivityLogReportViewed: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_h5pactivity_log_report_viewed_request** | [**\OpenAPI\Client\Model\ModH5pactivityLogReportViewedRequest**](../Model/ModH5pactivityLogReportViewedRequest.md)|  | |

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

## `modH5pactivityViewH5pactivity()`

```php
modH5pactivityViewH5pactivity($mod_h5pactivity_view_h5pactivity_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
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


$apiInstance = new OpenAPI\Client\Api\ModH5pactivityApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_h5pactivity_view_h5pactivity_request = new \OpenAPI\Client\Model\ModH5pactivityViewH5pactivityRequest(); // \OpenAPI\Client\Model\ModH5pactivityViewH5pactivityRequest

try {
    $result = $apiInstance->modH5pactivityViewH5pactivity($mod_h5pactivity_view_h5pactivity_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModH5pactivityApi->modH5pactivityViewH5pactivity: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_h5pactivity_view_h5pactivity_request** | [**\OpenAPI\Client\Model\ModH5pactivityViewH5pactivityRequest**](../Model/ModH5pactivityViewH5pactivityRequest.md)|  | |

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
