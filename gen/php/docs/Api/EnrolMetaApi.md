# OpenAPI\Client\EnrolMetaApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**enrolMetaAddInstances()**](EnrolMetaApi.md#enrolMetaAddInstances) | **POST** /enrol_meta_add_instances | Add meta enrolment instances |
| [**enrolMetaDeleteInstances()**](EnrolMetaApi.md#enrolMetaDeleteInstances) | **POST** /enrol_meta_delete_instances | Delete meta enrolment instances |


## `enrolMetaAddInstances()`

```php
enrolMetaAddInstances($enrol_meta_add_instances_request): object
```

Add meta enrolment instances

Add meta enrolment instances

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\EnrolMetaApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$enrol_meta_add_instances_request = new \OpenAPI\Client\Model\EnrolMetaAddInstancesRequest(); // \OpenAPI\Client\Model\EnrolMetaAddInstancesRequest

try {
    $result = $apiInstance->enrolMetaAddInstances($enrol_meta_add_instances_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnrolMetaApi->enrolMetaAddInstances: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **enrol_meta_add_instances_request** | [**\OpenAPI\Client\Model\EnrolMetaAddInstancesRequest**](../Model/EnrolMetaAddInstancesRequest.md)|  | |

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

## `enrolMetaDeleteInstances()`

```php
enrolMetaDeleteInstances($enrol_meta_delete_instances_request): object
```

Delete meta enrolment instances

Delete meta enrolment instances

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\EnrolMetaApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$enrol_meta_delete_instances_request = new \OpenAPI\Client\Model\EnrolMetaDeleteInstancesRequest(); // \OpenAPI\Client\Model\EnrolMetaDeleteInstancesRequest

try {
    $result = $apiInstance->enrolMetaDeleteInstances($enrol_meta_delete_instances_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnrolMetaApi->enrolMetaDeleteInstances: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **enrol_meta_delete_instances_request** | [**\OpenAPI\Client\Model\EnrolMetaDeleteInstancesRequest**](../Model/EnrolMetaDeleteInstancesRequest.md)|  | |

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
