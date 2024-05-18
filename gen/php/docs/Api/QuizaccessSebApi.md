# OpenAPI\Client\QuizaccessSebApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**quizaccessSebValidateQuizKeys()**](QuizaccessSebApi.md#quizaccessSebValidateQuizKeys) | **POST** /quizaccess_seb_validate_quiz_keys | Validate a Safe Exam Browser config key or a browser exam key. |


## `quizaccessSebValidateQuizKeys()`

```php
quizaccessSebValidateQuizKeys($quizaccess_seb_validate_quiz_keys_request): \OpenAPI\Client\Model\QuizaccessSebValidateQuizKeys200Response
```

Validate a Safe Exam Browser config key or a browser exam key.

Validate a Safe Exam Browser config key or a browser exam key.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\QuizaccessSebApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$quizaccess_seb_validate_quiz_keys_request = new \OpenAPI\Client\Model\QuizaccessSebValidateQuizKeysRequest(); // \OpenAPI\Client\Model\QuizaccessSebValidateQuizKeysRequest

try {
    $result = $apiInstance->quizaccessSebValidateQuizKeys($quizaccess_seb_validate_quiz_keys_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QuizaccessSebApi->quizaccessSebValidateQuizKeys: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **quizaccess_seb_validate_quiz_keys_request** | [**\OpenAPI\Client\Model\QuizaccessSebValidateQuizKeysRequest**](../Model/QuizaccessSebValidateQuizKeysRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\QuizaccessSebValidateQuizKeys200Response**](../Model/QuizaccessSebValidateQuizKeys200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
