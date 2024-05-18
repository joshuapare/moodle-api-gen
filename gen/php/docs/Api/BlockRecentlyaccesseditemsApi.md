# OpenAPI\Client\BlockRecentlyaccesseditemsApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**blockRecentlyaccesseditemsGetRecentItems()**](BlockRecentlyaccesseditemsApi.md#blockRecentlyaccesseditemsGetRecentItems) | **POST** /block_recentlyaccesseditems_get_recent_items | List of items a user has accessed most recently. |


## `blockRecentlyaccesseditemsGetRecentItems()`

```php
blockRecentlyaccesseditemsGetRecentItems($block_recentlyaccesseditems_get_recent_items_request): object
```

List of items a user has accessed most recently.

List of items a user has accessed most recently.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockRecentlyaccesseditemsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_recentlyaccesseditems_get_recent_items_request = new \OpenAPI\Client\Model\BlockRecentlyaccesseditemsGetRecentItemsRequest(); // \OpenAPI\Client\Model\BlockRecentlyaccesseditemsGetRecentItemsRequest

try {
    $result = $apiInstance->blockRecentlyaccesseditemsGetRecentItems($block_recentlyaccesseditems_get_recent_items_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockRecentlyaccesseditemsApi->blockRecentlyaccesseditemsGetRecentItems: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_recentlyaccesseditems_get_recent_items_request** | [**\OpenAPI\Client\Model\BlockRecentlyaccesseditemsGetRecentItemsRequest**](../Model/BlockRecentlyaccesseditemsGetRecentItemsRequest.md)|  | |

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
