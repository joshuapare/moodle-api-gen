# OpenAPI\Client\EnrolLicenseApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**enrolLicenseEnrolUser()**](EnrolLicenseApi.md#enrolLicenseEnrolUser) | **POST** /enrol_license_enrol_user | License enrol the current user in the given course. |
| [**enrolLicenseGetInstanceInfo()**](EnrolLicenseApi.md#enrolLicenseGetInstanceInfo) | **POST** /enrol_license_get_instance_info | License enrolment instance information. |


## `enrolLicenseEnrolUser()`

```php
enrolLicenseEnrolUser($enrol_license_enrol_user_request): \OpenAPI\Client\Model\EnrolLicenseEnrolUser200Response
```

License enrol the current user in the given course.

License enrol the current user in the given course.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\EnrolLicenseApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$enrol_license_enrol_user_request = new \OpenAPI\Client\Model\EnrolLicenseEnrolUserRequest(); // \OpenAPI\Client\Model\EnrolLicenseEnrolUserRequest

try {
    $result = $apiInstance->enrolLicenseEnrolUser($enrol_license_enrol_user_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnrolLicenseApi->enrolLicenseEnrolUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **enrol_license_enrol_user_request** | [**\OpenAPI\Client\Model\EnrolLicenseEnrolUserRequest**](../Model/EnrolLicenseEnrolUserRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\EnrolLicenseEnrolUser200Response**](../Model/EnrolLicenseEnrolUser200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `enrolLicenseGetInstanceInfo()`

```php
enrolLicenseGetInstanceInfo($enrol_license_get_instance_info_request): \OpenAPI\Client\Model\EnrolLicenseGetInstanceInfo200Response
```

License enrolment instance information.

License enrolment instance information.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\EnrolLicenseApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$enrol_license_get_instance_info_request = new \OpenAPI\Client\Model\EnrolLicenseGetInstanceInfoRequest(); // \OpenAPI\Client\Model\EnrolLicenseGetInstanceInfoRequest

try {
    $result = $apiInstance->enrolLicenseGetInstanceInfo($enrol_license_get_instance_info_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnrolLicenseApi->enrolLicenseGetInstanceInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **enrol_license_get_instance_info_request** | [**\OpenAPI\Client\Model\EnrolLicenseGetInstanceInfoRequest**](../Model/EnrolLicenseGetInstanceInfoRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\EnrolLicenseGetInstanceInfo200Response**](../Model/EnrolLicenseGetInstanceInfo200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
