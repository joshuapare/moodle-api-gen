# OpenAPI\Client\ModGlossaryApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modGlossaryAddEntry()**](ModGlossaryApi.md#modGlossaryAddEntry) | **POST** /mod_glossary_add_entry | Add a new entry to a given glossary |
| [**modGlossaryDeleteEntry()**](ModGlossaryApi.md#modGlossaryDeleteEntry) | **POST** /mod_glossary_delete_entry | Delete the given entry from the glossary. |
| [**modGlossaryGetAuthors()**](ModGlossaryApi.md#modGlossaryGetAuthors) | **POST** /mod_glossary_get_authors | Get the authors. |
| [**modGlossaryGetCategories()**](ModGlossaryApi.md#modGlossaryGetCategories) | **POST** /mod_glossary_get_categories | Get the categories. |
| [**modGlossaryGetEntriesByAuthor()**](ModGlossaryApi.md#modGlossaryGetEntriesByAuthor) | **POST** /mod_glossary_get_entries_by_author | Browse entries by author. |
| [**modGlossaryGetEntriesByAuthorId()**](ModGlossaryApi.md#modGlossaryGetEntriesByAuthorId) | **POST** /mod_glossary_get_entries_by_author_id | Browse entries by author ID. |
| [**modGlossaryGetEntriesByCategory()**](ModGlossaryApi.md#modGlossaryGetEntriesByCategory) | **POST** /mod_glossary_get_entries_by_category | Browse entries by category. |
| [**modGlossaryGetEntriesByDate()**](ModGlossaryApi.md#modGlossaryGetEntriesByDate) | **POST** /mod_glossary_get_entries_by_date | Browse entries by date. |
| [**modGlossaryGetEntriesByLetter()**](ModGlossaryApi.md#modGlossaryGetEntriesByLetter) | **POST** /mod_glossary_get_entries_by_letter | Browse entries by letter. |
| [**modGlossaryGetEntriesBySearch()**](ModGlossaryApi.md#modGlossaryGetEntriesBySearch) | **POST** /mod_glossary_get_entries_by_search | Browse entries by search query. |
| [**modGlossaryGetEntriesByTerm()**](ModGlossaryApi.md#modGlossaryGetEntriesByTerm) | **POST** /mod_glossary_get_entries_by_term | Browse entries by term (concept or alias). |
| [**modGlossaryGetEntriesToApprove()**](ModGlossaryApi.md#modGlossaryGetEntriesToApprove) | **POST** /mod_glossary_get_entries_to_approve | Browse entries to be approved. |
| [**modGlossaryGetEntryById()**](ModGlossaryApi.md#modGlossaryGetEntryById) | **POST** /mod_glossary_get_entry_by_id | Get an entry by ID |
| [**modGlossaryGetGlossariesByCourses()**](ModGlossaryApi.md#modGlossaryGetGlossariesByCourses) | **POST** /mod_glossary_get_glossaries_by_courses | Retrieve a list of glossaries from several courses. |
| [**modGlossaryPrepareEntryForEdition()**](ModGlossaryApi.md#modGlossaryPrepareEntryForEdition) | **POST** /mod_glossary_prepare_entry_for_edition | Prepares the given entry for edition returning draft item areas and file areas information. |
| [**modGlossaryUpdateEntry()**](ModGlossaryApi.md#modGlossaryUpdateEntry) | **POST** /mod_glossary_update_entry | Updates the given glossary entry. |
| [**modGlossaryViewEntry()**](ModGlossaryApi.md#modGlossaryViewEntry) | **POST** /mod_glossary_view_entry | Notify a glossary entry as being viewed. |
| [**modGlossaryViewGlossary()**](ModGlossaryApi.md#modGlossaryViewGlossary) | **POST** /mod_glossary_view_glossary | Notify the glossary as being viewed. |


## `modGlossaryAddEntry()`

```php
modGlossaryAddEntry($mod_glossary_add_entry_request): \OpenAPI\Client\Model\ModGlossaryAddEntry200Response
```

Add a new entry to a given glossary

Add a new entry to a given glossary

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModGlossaryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_glossary_add_entry_request = new \OpenAPI\Client\Model\ModGlossaryAddEntryRequest(); // \OpenAPI\Client\Model\ModGlossaryAddEntryRequest

try {
    $result = $apiInstance->modGlossaryAddEntry($mod_glossary_add_entry_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModGlossaryApi->modGlossaryAddEntry: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_glossary_add_entry_request** | [**\OpenAPI\Client\Model\ModGlossaryAddEntryRequest**](../Model/ModGlossaryAddEntryRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModGlossaryAddEntry200Response**](../Model/ModGlossaryAddEntry200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modGlossaryDeleteEntry()`

```php
modGlossaryDeleteEntry($mod_glossary_delete_entry_request): \OpenAPI\Client\Model\CoreContentbankRenameContent200Response
```

Delete the given entry from the glossary.

Delete the given entry from the glossary.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModGlossaryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_glossary_delete_entry_request = new \OpenAPI\Client\Model\ModGlossaryDeleteEntryRequest(); // \OpenAPI\Client\Model\ModGlossaryDeleteEntryRequest

try {
    $result = $apiInstance->modGlossaryDeleteEntry($mod_glossary_delete_entry_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModGlossaryApi->modGlossaryDeleteEntry: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_glossary_delete_entry_request** | [**\OpenAPI\Client\Model\ModGlossaryDeleteEntryRequest**](../Model/ModGlossaryDeleteEntryRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreContentbankRenameContent200Response**](../Model/CoreContentbankRenameContent200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modGlossaryGetAuthors()`

```php
modGlossaryGetAuthors($mod_glossary_get_authors_request): \OpenAPI\Client\Model\ModGlossaryGetAuthors200Response
```

Get the authors.

Get the authors.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModGlossaryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_glossary_get_authors_request = new \OpenAPI\Client\Model\ModGlossaryGetAuthorsRequest(); // \OpenAPI\Client\Model\ModGlossaryGetAuthorsRequest

try {
    $result = $apiInstance->modGlossaryGetAuthors($mod_glossary_get_authors_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModGlossaryApi->modGlossaryGetAuthors: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_glossary_get_authors_request** | [**\OpenAPI\Client\Model\ModGlossaryGetAuthorsRequest**](../Model/ModGlossaryGetAuthorsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModGlossaryGetAuthors200Response**](../Model/ModGlossaryGetAuthors200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modGlossaryGetCategories()`

```php
modGlossaryGetCategories($mod_glossary_get_categories_request): \OpenAPI\Client\Model\ModGlossaryGetCategories200Response
```

Get the categories.

Get the categories.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModGlossaryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_glossary_get_categories_request = new \OpenAPI\Client\Model\ModGlossaryGetCategoriesRequest(); // \OpenAPI\Client\Model\ModGlossaryGetCategoriesRequest

try {
    $result = $apiInstance->modGlossaryGetCategories($mod_glossary_get_categories_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModGlossaryApi->modGlossaryGetCategories: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_glossary_get_categories_request** | [**\OpenAPI\Client\Model\ModGlossaryGetCategoriesRequest**](../Model/ModGlossaryGetCategoriesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModGlossaryGetCategories200Response**](../Model/ModGlossaryGetCategories200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modGlossaryGetEntriesByAuthor()`

```php
modGlossaryGetEntriesByAuthor($mod_glossary_get_entries_by_author_request): \OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthor200Response
```

Browse entries by author.

Browse entries by author.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModGlossaryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_glossary_get_entries_by_author_request = new \OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorRequest(); // \OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorRequest

try {
    $result = $apiInstance->modGlossaryGetEntriesByAuthor($mod_glossary_get_entries_by_author_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModGlossaryApi->modGlossaryGetEntriesByAuthor: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_glossary_get_entries_by_author_request** | [**\OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorRequest**](../Model/ModGlossaryGetEntriesByAuthorRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthor200Response**](../Model/ModGlossaryGetEntriesByAuthor200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modGlossaryGetEntriesByAuthorId()`

```php
modGlossaryGetEntriesByAuthorId($mod_glossary_get_entries_by_author_id_request): \OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorId200Response
```

Browse entries by author ID.

Browse entries by author ID.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModGlossaryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_glossary_get_entries_by_author_id_request = new \OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorIdRequest(); // \OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorIdRequest

try {
    $result = $apiInstance->modGlossaryGetEntriesByAuthorId($mod_glossary_get_entries_by_author_id_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModGlossaryApi->modGlossaryGetEntriesByAuthorId: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_glossary_get_entries_by_author_id_request** | [**\OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorIdRequest**](../Model/ModGlossaryGetEntriesByAuthorIdRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorId200Response**](../Model/ModGlossaryGetEntriesByAuthorId200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modGlossaryGetEntriesByCategory()`

```php
modGlossaryGetEntriesByCategory($mod_glossary_get_entries_by_category_request): \OpenAPI\Client\Model\ModGlossaryGetEntriesByCategory200Response
```

Browse entries by category.

Browse entries by category.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModGlossaryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_glossary_get_entries_by_category_request = new \OpenAPI\Client\Model\ModGlossaryGetEntriesByCategoryRequest(); // \OpenAPI\Client\Model\ModGlossaryGetEntriesByCategoryRequest

try {
    $result = $apiInstance->modGlossaryGetEntriesByCategory($mod_glossary_get_entries_by_category_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModGlossaryApi->modGlossaryGetEntriesByCategory: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_glossary_get_entries_by_category_request** | [**\OpenAPI\Client\Model\ModGlossaryGetEntriesByCategoryRequest**](../Model/ModGlossaryGetEntriesByCategoryRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModGlossaryGetEntriesByCategory200Response**](../Model/ModGlossaryGetEntriesByCategory200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modGlossaryGetEntriesByDate()`

```php
modGlossaryGetEntriesByDate($mod_glossary_get_entries_by_date_request): \OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorId200Response
```

Browse entries by date.

Browse entries by date.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModGlossaryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_glossary_get_entries_by_date_request = new \OpenAPI\Client\Model\ModGlossaryGetEntriesByDateRequest(); // \OpenAPI\Client\Model\ModGlossaryGetEntriesByDateRequest

try {
    $result = $apiInstance->modGlossaryGetEntriesByDate($mod_glossary_get_entries_by_date_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModGlossaryApi->modGlossaryGetEntriesByDate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_glossary_get_entries_by_date_request** | [**\OpenAPI\Client\Model\ModGlossaryGetEntriesByDateRequest**](../Model/ModGlossaryGetEntriesByDateRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorId200Response**](../Model/ModGlossaryGetEntriesByAuthorId200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modGlossaryGetEntriesByLetter()`

```php
modGlossaryGetEntriesByLetter($mod_glossary_get_entries_by_letter_request): \OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorId200Response
```

Browse entries by letter.

Browse entries by letter.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModGlossaryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_glossary_get_entries_by_letter_request = new \OpenAPI\Client\Model\ModGlossaryGetEntriesByLetterRequest(); // \OpenAPI\Client\Model\ModGlossaryGetEntriesByLetterRequest

try {
    $result = $apiInstance->modGlossaryGetEntriesByLetter($mod_glossary_get_entries_by_letter_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModGlossaryApi->modGlossaryGetEntriesByLetter: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_glossary_get_entries_by_letter_request** | [**\OpenAPI\Client\Model\ModGlossaryGetEntriesByLetterRequest**](../Model/ModGlossaryGetEntriesByLetterRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorId200Response**](../Model/ModGlossaryGetEntriesByAuthorId200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modGlossaryGetEntriesBySearch()`

```php
modGlossaryGetEntriesBySearch($mod_glossary_get_entries_by_search_request): \OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorId200Response
```

Browse entries by search query.

Browse entries by search query.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModGlossaryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_glossary_get_entries_by_search_request = new \OpenAPI\Client\Model\ModGlossaryGetEntriesBySearchRequest(); // \OpenAPI\Client\Model\ModGlossaryGetEntriesBySearchRequest

try {
    $result = $apiInstance->modGlossaryGetEntriesBySearch($mod_glossary_get_entries_by_search_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModGlossaryApi->modGlossaryGetEntriesBySearch: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_glossary_get_entries_by_search_request** | [**\OpenAPI\Client\Model\ModGlossaryGetEntriesBySearchRequest**](../Model/ModGlossaryGetEntriesBySearchRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorId200Response**](../Model/ModGlossaryGetEntriesByAuthorId200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modGlossaryGetEntriesByTerm()`

```php
modGlossaryGetEntriesByTerm($mod_glossary_get_entries_by_term_request): \OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorId200Response
```

Browse entries by term (concept or alias).

Browse entries by term (concept or alias).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModGlossaryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_glossary_get_entries_by_term_request = new \OpenAPI\Client\Model\ModGlossaryGetEntriesByTermRequest(); // \OpenAPI\Client\Model\ModGlossaryGetEntriesByTermRequest

try {
    $result = $apiInstance->modGlossaryGetEntriesByTerm($mod_glossary_get_entries_by_term_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModGlossaryApi->modGlossaryGetEntriesByTerm: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_glossary_get_entries_by_term_request** | [**\OpenAPI\Client\Model\ModGlossaryGetEntriesByTermRequest**](../Model/ModGlossaryGetEntriesByTermRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorId200Response**](../Model/ModGlossaryGetEntriesByAuthorId200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modGlossaryGetEntriesToApprove()`

```php
modGlossaryGetEntriesToApprove($mod_glossary_get_entries_to_approve_request): \OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorId200Response
```

Browse entries to be approved.

Browse entries to be approved.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModGlossaryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_glossary_get_entries_to_approve_request = new \OpenAPI\Client\Model\ModGlossaryGetEntriesToApproveRequest(); // \OpenAPI\Client\Model\ModGlossaryGetEntriesToApproveRequest

try {
    $result = $apiInstance->modGlossaryGetEntriesToApprove($mod_glossary_get_entries_to_approve_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModGlossaryApi->modGlossaryGetEntriesToApprove: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_glossary_get_entries_to_approve_request** | [**\OpenAPI\Client\Model\ModGlossaryGetEntriesToApproveRequest**](../Model/ModGlossaryGetEntriesToApproveRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorId200Response**](../Model/ModGlossaryGetEntriesByAuthorId200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modGlossaryGetEntryById()`

```php
modGlossaryGetEntryById($mod_glossary_get_entry_by_id_request): \OpenAPI\Client\Model\ModGlossaryGetEntryById200Response
```

Get an entry by ID

Get an entry by ID

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModGlossaryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_glossary_get_entry_by_id_request = new \OpenAPI\Client\Model\ModGlossaryGetEntryByIdRequest(); // \OpenAPI\Client\Model\ModGlossaryGetEntryByIdRequest

try {
    $result = $apiInstance->modGlossaryGetEntryById($mod_glossary_get_entry_by_id_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModGlossaryApi->modGlossaryGetEntryById: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_glossary_get_entry_by_id_request** | [**\OpenAPI\Client\Model\ModGlossaryGetEntryByIdRequest**](../Model/ModGlossaryGetEntryByIdRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModGlossaryGetEntryById200Response**](../Model/ModGlossaryGetEntryById200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modGlossaryGetGlossariesByCourses()`

```php
modGlossaryGetGlossariesByCourses($mod_chat_get_chats_by_courses_request): \OpenAPI\Client\Model\ModGlossaryGetGlossariesByCourses200Response
```

Retrieve a list of glossaries from several courses.

Retrieve a list of glossaries from several courses.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModGlossaryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_get_chats_by_courses_request = new \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest(); // \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest

try {
    $result = $apiInstance->modGlossaryGetGlossariesByCourses($mod_chat_get_chats_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModGlossaryApi->modGlossaryGetGlossariesByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_get_chats_by_courses_request** | [**\OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest**](../Model/ModChatGetChatsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModGlossaryGetGlossariesByCourses200Response**](../Model/ModGlossaryGetGlossariesByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modGlossaryPrepareEntryForEdition()`

```php
modGlossaryPrepareEntryForEdition($mod_glossary_prepare_entry_for_edition_request): \OpenAPI\Client\Model\ModGlossaryPrepareEntryForEdition200Response
```

Prepares the given entry for edition returning draft item areas and file areas information.

Prepares the given entry for edition returning draft item areas and file areas information.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModGlossaryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_glossary_prepare_entry_for_edition_request = new \OpenAPI\Client\Model\ModGlossaryPrepareEntryForEditionRequest(); // \OpenAPI\Client\Model\ModGlossaryPrepareEntryForEditionRequest

try {
    $result = $apiInstance->modGlossaryPrepareEntryForEdition($mod_glossary_prepare_entry_for_edition_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModGlossaryApi->modGlossaryPrepareEntryForEdition: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_glossary_prepare_entry_for_edition_request** | [**\OpenAPI\Client\Model\ModGlossaryPrepareEntryForEditionRequest**](../Model/ModGlossaryPrepareEntryForEditionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModGlossaryPrepareEntryForEdition200Response**](../Model/ModGlossaryPrepareEntryForEdition200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modGlossaryUpdateEntry()`

```php
modGlossaryUpdateEntry($mod_glossary_update_entry_request): \OpenAPI\Client\Model\ModGlossaryUpdateEntry200Response
```

Updates the given glossary entry.

Updates the given glossary entry.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModGlossaryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_glossary_update_entry_request = new \OpenAPI\Client\Model\ModGlossaryUpdateEntryRequest(); // \OpenAPI\Client\Model\ModGlossaryUpdateEntryRequest

try {
    $result = $apiInstance->modGlossaryUpdateEntry($mod_glossary_update_entry_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModGlossaryApi->modGlossaryUpdateEntry: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_glossary_update_entry_request** | [**\OpenAPI\Client\Model\ModGlossaryUpdateEntryRequest**](../Model/ModGlossaryUpdateEntryRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModGlossaryUpdateEntry200Response**](../Model/ModGlossaryUpdateEntry200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modGlossaryViewEntry()`

```php
modGlossaryViewEntry($mod_glossary_get_entry_by_id_request): \OpenAPI\Client\Model\ModGlossaryViewEntry200Response
```

Notify a glossary entry as being viewed.

Notify a glossary entry as being viewed.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModGlossaryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_glossary_get_entry_by_id_request = new \OpenAPI\Client\Model\ModGlossaryGetEntryByIdRequest(); // \OpenAPI\Client\Model\ModGlossaryGetEntryByIdRequest

try {
    $result = $apiInstance->modGlossaryViewEntry($mod_glossary_get_entry_by_id_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModGlossaryApi->modGlossaryViewEntry: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_glossary_get_entry_by_id_request** | [**\OpenAPI\Client\Model\ModGlossaryGetEntryByIdRequest**](../Model/ModGlossaryGetEntryByIdRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModGlossaryViewEntry200Response**](../Model/ModGlossaryViewEntry200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modGlossaryViewGlossary()`

```php
modGlossaryViewGlossary($mod_glossary_view_glossary_request): \OpenAPI\Client\Model\ModGlossaryViewGlossary200Response
```

Notify the glossary as being viewed.

Notify the glossary as being viewed.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModGlossaryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_glossary_view_glossary_request = new \OpenAPI\Client\Model\ModGlossaryViewGlossaryRequest(); // \OpenAPI\Client\Model\ModGlossaryViewGlossaryRequest

try {
    $result = $apiInstance->modGlossaryViewGlossary($mod_glossary_view_glossary_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModGlossaryApi->modGlossaryViewGlossary: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_glossary_view_glossary_request** | [**\OpenAPI\Client\Model\ModGlossaryViewGlossaryRequest**](../Model/ModGlossaryViewGlossaryRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModGlossaryViewGlossary200Response**](../Model/ModGlossaryViewGlossary200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
