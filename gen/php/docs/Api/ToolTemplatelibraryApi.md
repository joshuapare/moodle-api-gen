# OpenAPI\Client\ToolTemplatelibraryApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**toolTemplatelibraryListTemplates()**](ToolTemplatelibraryApi.md#toolTemplatelibraryListTemplates) | **POST** /tool_templatelibrary_list_templates | List/search templates by component. |
| [**toolTemplatelibraryLoadCanonicalTemplate()**](ToolTemplatelibraryApi.md#toolTemplatelibraryLoadCanonicalTemplate) | **POST** /tool_templatelibrary_load_canonical_template | Load a canonical template by name (not the theme overidden one). |


## `toolTemplatelibraryListTemplates()`

```php
toolTemplatelibraryListTemplates($tool_templatelibrary_list_templates_request): object
```

List/search templates by component.

List/search templates by component.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolTemplatelibraryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_templatelibrary_list_templates_request = new \OpenAPI\Client\Model\ToolTemplatelibraryListTemplatesRequest(); // \OpenAPI\Client\Model\ToolTemplatelibraryListTemplatesRequest

try {
    $result = $apiInstance->toolTemplatelibraryListTemplates($tool_templatelibrary_list_templates_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolTemplatelibraryApi->toolTemplatelibraryListTemplates: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_templatelibrary_list_templates_request** | [**\OpenAPI\Client\Model\ToolTemplatelibraryListTemplatesRequest**](../Model/ToolTemplatelibraryListTemplatesRequest.md)|  | |

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

## `toolTemplatelibraryLoadCanonicalTemplate()`

```php
toolTemplatelibraryLoadCanonicalTemplate($tool_templatelibrary_load_canonical_template_request): object
```

Load a canonical template by name (not the theme overidden one).

Load a canonical template by name (not the theme overidden one).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolTemplatelibraryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_templatelibrary_load_canonical_template_request = new \OpenAPI\Client\Model\ToolTemplatelibraryLoadCanonicalTemplateRequest(); // \OpenAPI\Client\Model\ToolTemplatelibraryLoadCanonicalTemplateRequest

try {
    $result = $apiInstance->toolTemplatelibraryLoadCanonicalTemplate($tool_templatelibrary_load_canonical_template_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolTemplatelibraryApi->toolTemplatelibraryLoadCanonicalTemplate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_templatelibrary_load_canonical_template_request** | [**\OpenAPI\Client\Model\ToolTemplatelibraryLoadCanonicalTemplateRequest**](../Model/ToolTemplatelibraryLoadCanonicalTemplateRequest.md)|  | |

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
