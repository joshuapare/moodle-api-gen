# OpenAPI\Client\EnrolManualApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**enrolManualEnrolUsers()**](EnrolManualApi.md#enrolManualEnrolUsers) | **POST** /enrol_manual_enrol_users | Manual enrol users |
| [**enrolManualUnenrolUsers()**](EnrolManualApi.md#enrolManualUnenrolUsers) | **POST** /enrol_manual_unenrol_users | Manual unenrol users |


## `enrolManualEnrolUsers()`

```php
enrolManualEnrolUsers($enrol_manual_enrol_users_request): object
```

Manual enrol users

Manual enrol users

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\EnrolManualApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$enrol_manual_enrol_users_request = new \OpenAPI\Client\Model\EnrolManualEnrolUsersRequest(); // \OpenAPI\Client\Model\EnrolManualEnrolUsersRequest

try {
    $result = $apiInstance->enrolManualEnrolUsers($enrol_manual_enrol_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnrolManualApi->enrolManualEnrolUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **enrol_manual_enrol_users_request** | [**\OpenAPI\Client\Model\EnrolManualEnrolUsersRequest**](../Model/EnrolManualEnrolUsersRequest.md)|  | |

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

## `enrolManualUnenrolUsers()`

```php
enrolManualUnenrolUsers($enrol_manual_unenrol_users_request): object
```

Manual unenrol users

Manual unenrol users

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\EnrolManualApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$enrol_manual_unenrol_users_request = new \OpenAPI\Client\Model\EnrolManualUnenrolUsersRequest(); // \OpenAPI\Client\Model\EnrolManualUnenrolUsersRequest

try {
    $result = $apiInstance->enrolManualUnenrolUsers($enrol_manual_unenrol_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnrolManualApi->enrolManualUnenrolUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **enrol_manual_unenrol_users_request** | [**\OpenAPI\Client\Model\EnrolManualUnenrolUsersRequest**](../Model/EnrolManualUnenrolUsersRequest.md)|  | |

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
