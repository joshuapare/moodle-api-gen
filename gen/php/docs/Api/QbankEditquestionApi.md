# OpenAPI\Client\QbankEditquestionApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**qbankEditquestionSetStatus()**](QbankEditquestionApi.md#qbankEditquestionSetStatus) | **POST** /qbank_editquestion_set_status | Update the question status. |


## `qbankEditquestionSetStatus()`

```php
qbankEditquestionSetStatus($qbank_editquestion_set_status_request): \OpenAPI\Client\Model\QbankEditquestionSetStatus200Response
```

Update the question status.

Update the question status.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\QbankEditquestionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$qbank_editquestion_set_status_request = new \OpenAPI\Client\Model\QbankEditquestionSetStatusRequest(); // \OpenAPI\Client\Model\QbankEditquestionSetStatusRequest

try {
    $result = $apiInstance->qbankEditquestionSetStatus($qbank_editquestion_set_status_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QbankEditquestionApi->qbankEditquestionSetStatus: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **qbank_editquestion_set_status_request** | [**\OpenAPI\Client\Model\QbankEditquestionSetStatusRequest**](../Model/QbankEditquestionSetStatusRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\QbankEditquestionSetStatus200Response**](../Model/QbankEditquestionSetStatus200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
