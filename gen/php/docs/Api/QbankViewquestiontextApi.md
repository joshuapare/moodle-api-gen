# OpenAPI\Client\QbankViewquestiontextApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**qbankViewquestiontextSetQuestionTextFormat()**](QbankViewquestiontextApi.md#qbankViewquestiontextSetQuestionTextFormat) | **POST** /qbank_viewquestiontext_set_question_text_format | Sets the preference for displaying and formatting the question text |


## `qbankViewquestiontextSetQuestionTextFormat()`

```php
qbankViewquestiontextSetQuestionTextFormat($qbank_viewquestiontext_set_question_text_format_request): object
```

Sets the preference for displaying and formatting the question text

Sets the preference for displaying and formatting the question text

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\QbankViewquestiontextApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$qbank_viewquestiontext_set_question_text_format_request = new \OpenAPI\Client\Model\QbankViewquestiontextSetQuestionTextFormatRequest(); // \OpenAPI\Client\Model\QbankViewquestiontextSetQuestionTextFormatRequest

try {
    $result = $apiInstance->qbankViewquestiontextSetQuestionTextFormat($qbank_viewquestiontext_set_question_text_format_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QbankViewquestiontextApi->qbankViewquestiontextSetQuestionTextFormat: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **qbank_viewquestiontext_set_question_text_format_request** | [**\OpenAPI\Client\Model\QbankViewquestiontextSetQuestionTextFormatRequest**](../Model/QbankViewquestiontextSetQuestionTextFormatRequest.md)|  | |

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
