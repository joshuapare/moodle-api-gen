# OpenAPI\Client\AuthEmailApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**authEmailGetSignupSettings()**](AuthEmailApi.md#authEmailGetSignupSettings) | **POST** /auth_email_get_signup_settings | Get the signup required settings and profile fields. |
| [**authEmailSignupUser()**](AuthEmailApi.md#authEmailSignupUser) | **POST** /auth_email_signup_user | Adds a new user (pendingto be confirmed) in the site. |


## `authEmailGetSignupSettings()`

```php
authEmailGetSignupSettings(): \OpenAPI\Client\Model\AuthEmailGetSignupSettings200Response
```

Get the signup required settings and profile fields.

Get the signup required settings and profile fields.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\AuthEmailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->authEmailGetSignupSettings();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthEmailApi->authEmailGetSignupSettings: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\AuthEmailGetSignupSettings200Response**](../Model/AuthEmailGetSignupSettings200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `authEmailSignupUser()`

```php
authEmailSignupUser($auth_email_signup_user_request): \OpenAPI\Client\Model\AuthEmailSignupUser200Response
```

Adds a new user (pendingto be confirmed) in the site.

Adds a new user (pendingto be confirmed) in the site.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\AuthEmailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$auth_email_signup_user_request = new \OpenAPI\Client\Model\AuthEmailSignupUserRequest(); // \OpenAPI\Client\Model\AuthEmailSignupUserRequest

try {
    $result = $apiInstance->authEmailSignupUser($auth_email_signup_user_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthEmailApi->authEmailSignupUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **auth_email_signup_user_request** | [**\OpenAPI\Client\Model\AuthEmailSignupUserRequest**](../Model/AuthEmailSignupUserRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\AuthEmailSignupUser200Response**](../Model/AuthEmailSignupUser200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
