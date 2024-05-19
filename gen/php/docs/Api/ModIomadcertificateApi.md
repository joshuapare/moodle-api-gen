# OpenAPI\Client\ModIomadcertificateApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modIomadcertificateGetIomadcertificatesByCourses()**](ModIomadcertificateApi.md#modIomadcertificateGetIomadcertificatesByCourses) | **POST** /mod_iomadcertificate_get_iomadcertificates_by_courses | Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned. |
| [**modIomadcertificateGetIssuedIomadcertificates()**](ModIomadcertificateApi.md#modIomadcertificateGetIssuedIomadcertificates) | **POST** /mod_iomadcertificate_get_issued_iomadcertificates | Get the list of issued iomadcertificates for the current user. |
| [**modIomadcertificateIssueIomadcertificate()**](ModIomadcertificateApi.md#modIomadcertificateIssueIomadcertificate) | **POST** /mod_iomadcertificate_issue_iomadcertificate | Create new iomadcertificate record, or return existing record for the current user. |
| [**modIomadcertificateViewIomadcertificate()**](ModIomadcertificateApi.md#modIomadcertificateViewIomadcertificate) | **POST** /mod_iomadcertificate_view_iomadcertificate | Trigger the course module viewed event and update the module completion status. |


## `modIomadcertificateGetIomadcertificatesByCourses()`

```php
modIomadcertificateGetIomadcertificatesByCourses($mod_chat_get_chats_by_courses_request): \OpenAPI\Client\Model\ModIomadcertificateGetIomadcertificatesByCourses200Response
```

Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.

Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModIomadcertificateApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_get_chats_by_courses_request = new \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest(); // \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest

try {
    $result = $apiInstance->modIomadcertificateGetIomadcertificatesByCourses($mod_chat_get_chats_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModIomadcertificateApi->modIomadcertificateGetIomadcertificatesByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_get_chats_by_courses_request** | [**\OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest**](../Model/ModChatGetChatsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModIomadcertificateGetIomadcertificatesByCourses200Response**](../Model/ModIomadcertificateGetIomadcertificatesByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modIomadcertificateGetIssuedIomadcertificates()`

```php
modIomadcertificateGetIssuedIomadcertificates($mod_iomadcertificate_get_issued_iomadcertificates_request): \OpenAPI\Client\Model\ModIomadcertificateGetIssuedIomadcertificates200Response
```

Get the list of issued iomadcertificates for the current user.

Get the list of issued iomadcertificates for the current user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModIomadcertificateApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_iomadcertificate_get_issued_iomadcertificates_request = new \OpenAPI\Client\Model\ModIomadcertificateGetIssuedIomadcertificatesRequest(); // \OpenAPI\Client\Model\ModIomadcertificateGetIssuedIomadcertificatesRequest

try {
    $result = $apiInstance->modIomadcertificateGetIssuedIomadcertificates($mod_iomadcertificate_get_issued_iomadcertificates_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModIomadcertificateApi->modIomadcertificateGetIssuedIomadcertificates: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_iomadcertificate_get_issued_iomadcertificates_request** | [**\OpenAPI\Client\Model\ModIomadcertificateGetIssuedIomadcertificatesRequest**](../Model/ModIomadcertificateGetIssuedIomadcertificatesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModIomadcertificateGetIssuedIomadcertificates200Response**](../Model/ModIomadcertificateGetIssuedIomadcertificates200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modIomadcertificateIssueIomadcertificate()`

```php
modIomadcertificateIssueIomadcertificate($mod_iomadcertificate_issue_iomadcertificate_request): \OpenAPI\Client\Model\ModIomadcertificateIssueIomadcertificate200Response
```

Create new iomadcertificate record, or return existing record for the current user.

Create new iomadcertificate record, or return existing record for the current user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModIomadcertificateApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_iomadcertificate_issue_iomadcertificate_request = new \OpenAPI\Client\Model\ModIomadcertificateIssueIomadcertificateRequest(); // \OpenAPI\Client\Model\ModIomadcertificateIssueIomadcertificateRequest

try {
    $result = $apiInstance->modIomadcertificateIssueIomadcertificate($mod_iomadcertificate_issue_iomadcertificate_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModIomadcertificateApi->modIomadcertificateIssueIomadcertificate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_iomadcertificate_issue_iomadcertificate_request** | [**\OpenAPI\Client\Model\ModIomadcertificateIssueIomadcertificateRequest**](../Model/ModIomadcertificateIssueIomadcertificateRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModIomadcertificateIssueIomadcertificate200Response**](../Model/ModIomadcertificateIssueIomadcertificate200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modIomadcertificateViewIomadcertificate()`

```php
modIomadcertificateViewIomadcertificate($mod_iomadcertificate_issue_iomadcertificate_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
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


$apiInstance = new OpenAPI\Client\Api\ModIomadcertificateApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_iomadcertificate_issue_iomadcertificate_request = new \OpenAPI\Client\Model\ModIomadcertificateIssueIomadcertificateRequest(); // \OpenAPI\Client\Model\ModIomadcertificateIssueIomadcertificateRequest

try {
    $result = $apiInstance->modIomadcertificateViewIomadcertificate($mod_iomadcertificate_issue_iomadcertificate_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModIomadcertificateApi->modIomadcertificateViewIomadcertificate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_iomadcertificate_issue_iomadcertificate_request** | [**\OpenAPI\Client\Model\ModIomadcertificateIssueIomadcertificateRequest**](../Model/ModIomadcertificateIssueIomadcertificateRequest.md)|  | |

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
