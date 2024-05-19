# OpenAPI\Client\BlockAccessreviewApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**blockAccessreviewGetModuleData()**](BlockAccessreviewApi.md#blockAccessreviewGetModuleData) | **POST** /block_accessreview_get_module_data | Gets error data for course modules. |
| [**blockAccessreviewGetSectionData()**](BlockAccessreviewApi.md#blockAccessreviewGetSectionData) | **POST** /block_accessreview_get_section_data | Gets error data for course sections. |


## `blockAccessreviewGetModuleData()`

```php
blockAccessreviewGetModuleData($block_accessreview_get_module_data_request): object
```

Gets error data for course modules.

Gets error data for course modules.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockAccessreviewApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_accessreview_get_module_data_request = new \OpenAPI\Client\Model\BlockAccessreviewGetModuleDataRequest(); // \OpenAPI\Client\Model\BlockAccessreviewGetModuleDataRequest

try {
    $result = $apiInstance->blockAccessreviewGetModuleData($block_accessreview_get_module_data_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockAccessreviewApi->blockAccessreviewGetModuleData: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_accessreview_get_module_data_request** | [**\OpenAPI\Client\Model\BlockAccessreviewGetModuleDataRequest**](../Model/BlockAccessreviewGetModuleDataRequest.md)|  | |

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

## `blockAccessreviewGetSectionData()`

```php
blockAccessreviewGetSectionData($block_accessreview_get_section_data_request): object
```

Gets error data for course sections.

Gets error data for course sections.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockAccessreviewApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_accessreview_get_section_data_request = new \OpenAPI\Client\Model\BlockAccessreviewGetSectionDataRequest(); // \OpenAPI\Client\Model\BlockAccessreviewGetSectionDataRequest

try {
    $result = $apiInstance->blockAccessreviewGetSectionData($block_accessreview_get_section_data_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockAccessreviewApi->blockAccessreviewGetSectionData: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_accessreview_get_section_data_request** | [**\OpenAPI\Client\Model\BlockAccessreviewGetSectionDataRequest**](../Model/BlockAccessreviewGetSectionDataRequest.md)|  | |

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
