# OpenAPI\Client\EnrolSelfApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**enrolSelfEnrolUser()**](EnrolSelfApi.md#enrolSelfEnrolUser) | **POST** /enrol_self_enrol_user | Self enrol the current user in the given course. |
| [**enrolSelfGetInstanceInfo()**](EnrolSelfApi.md#enrolSelfGetInstanceInfo) | **POST** /enrol_self_get_instance_info | self enrolment instance information. |


## `enrolSelfEnrolUser()`

```php
enrolSelfEnrolUser($enrol_self_enrol_user_request): \OpenAPI\Client\Model\EnrolSelfEnrolUser200Response
```

Self enrol the current user in the given course.

Self enrol the current user in the given course.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\EnrolSelfApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$enrol_self_enrol_user_request = new \OpenAPI\Client\Model\EnrolSelfEnrolUserRequest(); // \OpenAPI\Client\Model\EnrolSelfEnrolUserRequest

try {
    $result = $apiInstance->enrolSelfEnrolUser($enrol_self_enrol_user_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnrolSelfApi->enrolSelfEnrolUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **enrol_self_enrol_user_request** | [**\OpenAPI\Client\Model\EnrolSelfEnrolUserRequest**](../Model/EnrolSelfEnrolUserRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\EnrolSelfEnrolUser200Response**](../Model/EnrolSelfEnrolUser200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `enrolSelfGetInstanceInfo()`

```php
enrolSelfGetInstanceInfo($enrol_self_get_instance_info_request): \OpenAPI\Client\Model\EnrolSelfGetInstanceInfo200Response
```

self enrolment instance information.

self enrolment instance information.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\EnrolSelfApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$enrol_self_get_instance_info_request = new \OpenAPI\Client\Model\EnrolSelfGetInstanceInfoRequest(); // \OpenAPI\Client\Model\EnrolSelfGetInstanceInfoRequest

try {
    $result = $apiInstance->enrolSelfGetInstanceInfo($enrol_self_get_instance_info_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnrolSelfApi->enrolSelfGetInstanceInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **enrol_self_get_instance_info_request** | [**\OpenAPI\Client\Model\EnrolSelfGetInstanceInfoRequest**](../Model/EnrolSelfGetInstanceInfoRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\EnrolSelfGetInstanceInfo200Response**](../Model/EnrolSelfGetInstanceInfo200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
