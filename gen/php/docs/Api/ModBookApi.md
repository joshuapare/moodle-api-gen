# OpenAPI\Client\ModBookApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modBookGetBooksByCourses()**](ModBookApi.md#modBookGetBooksByCourses) | **POST** /mod_book_get_books_by_courses | Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned. |
| [**modBookViewBook()**](ModBookApi.md#modBookViewBook) | **POST** /mod_book_view_book | Simulate the view.php web interface book: trigger events, completion, etc... |


## `modBookGetBooksByCourses()`

```php
modBookGetBooksByCourses($mod_book_get_books_by_courses_request): \OpenAPI\Client\Model\ModBookGetBooksByCourses200Response
```

Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.

Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModBookApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_book_get_books_by_courses_request = new \OpenAPI\Client\Model\ModBookGetBooksByCoursesRequest(); // \OpenAPI\Client\Model\ModBookGetBooksByCoursesRequest

try {
    $result = $apiInstance->modBookGetBooksByCourses($mod_book_get_books_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModBookApi->modBookGetBooksByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_book_get_books_by_courses_request** | [**\OpenAPI\Client\Model\ModBookGetBooksByCoursesRequest**](../Model/ModBookGetBooksByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModBookGetBooksByCourses200Response**](../Model/ModBookGetBooksByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modBookViewBook()`

```php
modBookViewBook($mod_book_view_book_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Simulate the view.php web interface book: trigger events, completion, etc...

Simulate the view.php web interface book: trigger events, completion, etc...

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModBookApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_book_view_book_request = new \OpenAPI\Client\Model\ModBookViewBookRequest(); // \OpenAPI\Client\Model\ModBookViewBookRequest

try {
    $result = $apiInstance->modBookViewBook($mod_book_view_book_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModBookApi->modBookViewBook: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_book_view_book_request** | [**\OpenAPI\Client\Model\ModBookViewBookRequest**](../Model/ModBookViewBookRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response**](../Model/CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
