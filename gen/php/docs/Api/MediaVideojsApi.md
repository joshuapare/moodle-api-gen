# OpenAPI\Client\MediaVideojsApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**mediaVideojsGetLanguage()**](MediaVideojsApi.md#mediaVideojsGetLanguage) | **POST** /media_videojs_get_language | get language. |


## `mediaVideojsGetLanguage()`

```php
mediaVideojsGetLanguage($media_videojs_get_language_request): object
```

get language.

get language.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MediaVideojsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$media_videojs_get_language_request = new \OpenAPI\Client\Model\MediaVideojsGetLanguageRequest(); // \OpenAPI\Client\Model\MediaVideojsGetLanguageRequest

try {
    $result = $apiInstance->mediaVideojsGetLanguage($media_videojs_get_language_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MediaVideojsApi->mediaVideojsGetLanguage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **media_videojs_get_language_request** | [**\OpenAPI\Client\Model\MediaVideojsGetLanguageRequest**](../Model/MediaVideojsGetLanguageRequest.md)|  | |

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
