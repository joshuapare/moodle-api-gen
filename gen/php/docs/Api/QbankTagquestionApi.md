# OpenAPI\Client\QbankTagquestionApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**qbankTagquestionSubmitTagsForm()**](QbankTagquestionApi.md#qbankTagquestionSubmitTagsForm) | **POST** /qbank_tagquestion_submit_tags_form | Update the question tags. |


## `qbankTagquestionSubmitTagsForm()`

```php
qbankTagquestionSubmitTagsForm($qbank_tagquestion_submit_tags_form_request): \OpenAPI\Client\Model\CoreQuestionSubmitTagsForm200Response
```

Update the question tags.

Update the question tags.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\QbankTagquestionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$qbank_tagquestion_submit_tags_form_request = new \OpenAPI\Client\Model\QbankTagquestionSubmitTagsFormRequest(); // \OpenAPI\Client\Model\QbankTagquestionSubmitTagsFormRequest

try {
    $result = $apiInstance->qbankTagquestionSubmitTagsForm($qbank_tagquestion_submit_tags_form_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QbankTagquestionApi->qbankTagquestionSubmitTagsForm: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **qbank_tagquestion_submit_tags_form_request** | [**\OpenAPI\Client\Model\QbankTagquestionSubmitTagsFormRequest**](../Model/QbankTagquestionSubmitTagsFormRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreQuestionSubmitTagsForm200Response**](../Model/CoreQuestionSubmitTagsForm200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
