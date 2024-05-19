# OpenAPI\Client\QbankColumnsortorderApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**qbankColumnsortorderSetColumnSize()**](QbankColumnsortorderApi.md#qbankColumnsortorderSetColumnSize) | **POST** /qbank_columnsortorder_set_column_size | Column size |
| [**qbankColumnsortorderSetColumnbankOrder()**](QbankColumnsortorderApi.md#qbankColumnsortorderSetColumnbankOrder) | **POST** /qbank_columnsortorder_set_columnbank_order | Sets question columns order in database |
| [**qbankColumnsortorderSetHiddenColumns()**](QbankColumnsortorderApi.md#qbankColumnsortorderSetHiddenColumns) | **POST** /qbank_columnsortorder_set_hidden_columns | Hidden Columns |


## `qbankColumnsortorderSetColumnSize()`

```php
qbankColumnsortorderSetColumnSize($qbank_columnsortorder_set_column_size_request): object
```

Column size

Column size

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\QbankColumnsortorderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$qbank_columnsortorder_set_column_size_request = new \OpenAPI\Client\Model\QbankColumnsortorderSetColumnSizeRequest(); // \OpenAPI\Client\Model\QbankColumnsortorderSetColumnSizeRequest

try {
    $result = $apiInstance->qbankColumnsortorderSetColumnSize($qbank_columnsortorder_set_column_size_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QbankColumnsortorderApi->qbankColumnsortorderSetColumnSize: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **qbank_columnsortorder_set_column_size_request** | [**\OpenAPI\Client\Model\QbankColumnsortorderSetColumnSizeRequest**](../Model/QbankColumnsortorderSetColumnSizeRequest.md)|  | |

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

## `qbankColumnsortorderSetColumnbankOrder()`

```php
qbankColumnsortorderSetColumnbankOrder($qbank_columnsortorder_set_columnbank_order_request): object
```

Sets question columns order in database

Sets question columns order in database

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\QbankColumnsortorderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$qbank_columnsortorder_set_columnbank_order_request = new \OpenAPI\Client\Model\QbankColumnsortorderSetColumnbankOrderRequest(); // \OpenAPI\Client\Model\QbankColumnsortorderSetColumnbankOrderRequest

try {
    $result = $apiInstance->qbankColumnsortorderSetColumnbankOrder($qbank_columnsortorder_set_columnbank_order_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QbankColumnsortorderApi->qbankColumnsortorderSetColumnbankOrder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **qbank_columnsortorder_set_columnbank_order_request** | [**\OpenAPI\Client\Model\QbankColumnsortorderSetColumnbankOrderRequest**](../Model/QbankColumnsortorderSetColumnbankOrderRequest.md)|  | |

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

## `qbankColumnsortorderSetHiddenColumns()`

```php
qbankColumnsortorderSetHiddenColumns($qbank_columnsortorder_set_hidden_columns_request): object
```

Hidden Columns

Hidden Columns

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\QbankColumnsortorderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$qbank_columnsortorder_set_hidden_columns_request = new \OpenAPI\Client\Model\QbankColumnsortorderSetHiddenColumnsRequest(); // \OpenAPI\Client\Model\QbankColumnsortorderSetHiddenColumnsRequest

try {
    $result = $apiInstance->qbankColumnsortorderSetHiddenColumns($qbank_columnsortorder_set_hidden_columns_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QbankColumnsortorderApi->qbankColumnsortorderSetHiddenColumns: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **qbank_columnsortorder_set_hidden_columns_request** | [**\OpenAPI\Client\Model\QbankColumnsortorderSetHiddenColumnsRequest**](../Model/QbankColumnsortorderSetHiddenColumnsRequest.md)|  | |

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
