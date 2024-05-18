# OpenAPI\Client\EnrolGuestApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**enrolGuestGetInstanceInfo()**](EnrolGuestApi.md#enrolGuestGetInstanceInfo) | **POST** /enrol_guest_get_instance_info | Return guest enrolment instance information. |
| [**enrolGuestValidatePassword()**](EnrolGuestApi.md#enrolGuestValidatePassword) | **POST** /enrol_guest_validate_password | Perform password validation. |


## `enrolGuestGetInstanceInfo()`

```php
enrolGuestGetInstanceInfo($enrol_guest_get_instance_info_request): \OpenAPI\Client\Model\EnrolGuestGetInstanceInfo200Response
```

Return guest enrolment instance information.

Return guest enrolment instance information.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\EnrolGuestApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$enrol_guest_get_instance_info_request = new \OpenAPI\Client\Model\EnrolGuestGetInstanceInfoRequest(); // \OpenAPI\Client\Model\EnrolGuestGetInstanceInfoRequest

try {
    $result = $apiInstance->enrolGuestGetInstanceInfo($enrol_guest_get_instance_info_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnrolGuestApi->enrolGuestGetInstanceInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **enrol_guest_get_instance_info_request** | [**\OpenAPI\Client\Model\EnrolGuestGetInstanceInfoRequest**](../Model/EnrolGuestGetInstanceInfoRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\EnrolGuestGetInstanceInfo200Response**](../Model/EnrolGuestGetInstanceInfo200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `enrolGuestValidatePassword()`

```php
enrolGuestValidatePassword($enrol_guest_validate_password_request): \OpenAPI\Client\Model\EnrolGuestValidatePassword200Response
```

Perform password validation.

Perform password validation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\EnrolGuestApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$enrol_guest_validate_password_request = new \OpenAPI\Client\Model\EnrolGuestValidatePasswordRequest(); // \OpenAPI\Client\Model\EnrolGuestValidatePasswordRequest

try {
    $result = $apiInstance->enrolGuestValidatePassword($enrol_guest_validate_password_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnrolGuestApi->enrolGuestValidatePassword: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **enrol_guest_validate_password_request** | [**\OpenAPI\Client\Model\EnrolGuestValidatePasswordRequest**](../Model/EnrolGuestValidatePasswordRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\EnrolGuestValidatePassword200Response**](../Model/EnrolGuestValidatePassword200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
