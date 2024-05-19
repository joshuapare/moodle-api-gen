# OpenAPI\Client\ModWikiApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modWikiEditPage()**](ModWikiApi.md#modWikiEditPage) | **POST** /mod_wiki_edit_page | Save the contents of a page. |
| [**modWikiGetPageContents()**](ModWikiApi.md#modWikiGetPageContents) | **POST** /mod_wiki_get_page_contents | Returns the contents of a page. |
| [**modWikiGetPageForEditing()**](ModWikiApi.md#modWikiGetPageForEditing) | **POST** /mod_wiki_get_page_for_editing | Locks and retrieves info of page-section to be edited. |
| [**modWikiGetSubwikiFiles()**](ModWikiApi.md#modWikiGetSubwikiFiles) | **POST** /mod_wiki_get_subwiki_files | Returns the list of files for a specific subwiki. |
| [**modWikiGetSubwikiPages()**](ModWikiApi.md#modWikiGetSubwikiPages) | **POST** /mod_wiki_get_subwiki_pages | Returns the list of pages for a specific subwiki. |
| [**modWikiGetSubwikis()**](ModWikiApi.md#modWikiGetSubwikis) | **POST** /mod_wiki_get_subwikis | Returns the list of subwikis the user can see in a specific wiki. |
| [**modWikiGetWikisByCourses()**](ModWikiApi.md#modWikiGetWikisByCourses) | **POST** /mod_wiki_get_wikis_by_courses | Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned. |
| [**modWikiNewPage()**](ModWikiApi.md#modWikiNewPage) | **POST** /mod_wiki_new_page | Create a new page in a subwiki. |
| [**modWikiViewPage()**](ModWikiApi.md#modWikiViewPage) | **POST** /mod_wiki_view_page | Trigger the page viewed event and update the module completion status. |
| [**modWikiViewWiki()**](ModWikiApi.md#modWikiViewWiki) | **POST** /mod_wiki_view_wiki | Trigger the course module viewed event and update the module completion status. |


## `modWikiEditPage()`

```php
modWikiEditPage($mod_wiki_edit_page_request): \OpenAPI\Client\Model\ModWikiEditPage200Response
```

Save the contents of a page.

Save the contents of a page.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWikiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_wiki_edit_page_request = new \OpenAPI\Client\Model\ModWikiEditPageRequest(); // \OpenAPI\Client\Model\ModWikiEditPageRequest

try {
    $result = $apiInstance->modWikiEditPage($mod_wiki_edit_page_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWikiApi->modWikiEditPage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_wiki_edit_page_request** | [**\OpenAPI\Client\Model\ModWikiEditPageRequest**](../Model/ModWikiEditPageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWikiEditPage200Response**](../Model/ModWikiEditPage200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWikiGetPageContents()`

```php
modWikiGetPageContents($mod_wiki_get_page_contents_request): \OpenAPI\Client\Model\ModWikiGetPageContents200Response
```

Returns the contents of a page.

Returns the contents of a page.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWikiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_wiki_get_page_contents_request = new \OpenAPI\Client\Model\ModWikiGetPageContentsRequest(); // \OpenAPI\Client\Model\ModWikiGetPageContentsRequest

try {
    $result = $apiInstance->modWikiGetPageContents($mod_wiki_get_page_contents_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWikiApi->modWikiGetPageContents: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_wiki_get_page_contents_request** | [**\OpenAPI\Client\Model\ModWikiGetPageContentsRequest**](../Model/ModWikiGetPageContentsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWikiGetPageContents200Response**](../Model/ModWikiGetPageContents200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWikiGetPageForEditing()`

```php
modWikiGetPageForEditing($mod_wiki_get_page_for_editing_request): \OpenAPI\Client\Model\ModWikiGetPageForEditing200Response
```

Locks and retrieves info of page-section to be edited.

Locks and retrieves info of page-section to be edited.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWikiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_wiki_get_page_for_editing_request = new \OpenAPI\Client\Model\ModWikiGetPageForEditingRequest(); // \OpenAPI\Client\Model\ModWikiGetPageForEditingRequest

try {
    $result = $apiInstance->modWikiGetPageForEditing($mod_wiki_get_page_for_editing_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWikiApi->modWikiGetPageForEditing: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_wiki_get_page_for_editing_request** | [**\OpenAPI\Client\Model\ModWikiGetPageForEditingRequest**](../Model/ModWikiGetPageForEditingRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWikiGetPageForEditing200Response**](../Model/ModWikiGetPageForEditing200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWikiGetSubwikiFiles()`

```php
modWikiGetSubwikiFiles($mod_wiki_get_subwiki_files_request): \OpenAPI\Client\Model\CoreH5pGetTrustedH5pFile200Response
```

Returns the list of files for a specific subwiki.

Returns the list of files for a specific subwiki.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWikiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_wiki_get_subwiki_files_request = new \OpenAPI\Client\Model\ModWikiGetSubwikiFilesRequest(); // \OpenAPI\Client\Model\ModWikiGetSubwikiFilesRequest

try {
    $result = $apiInstance->modWikiGetSubwikiFiles($mod_wiki_get_subwiki_files_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWikiApi->modWikiGetSubwikiFiles: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_wiki_get_subwiki_files_request** | [**\OpenAPI\Client\Model\ModWikiGetSubwikiFilesRequest**](../Model/ModWikiGetSubwikiFilesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreH5pGetTrustedH5pFile200Response**](../Model/CoreH5pGetTrustedH5pFile200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWikiGetSubwikiPages()`

```php
modWikiGetSubwikiPages($mod_wiki_get_subwiki_pages_request): \OpenAPI\Client\Model\ModWikiGetSubwikiPages200Response
```

Returns the list of pages for a specific subwiki.

Returns the list of pages for a specific subwiki.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWikiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_wiki_get_subwiki_pages_request = new \OpenAPI\Client\Model\ModWikiGetSubwikiPagesRequest(); // \OpenAPI\Client\Model\ModWikiGetSubwikiPagesRequest

try {
    $result = $apiInstance->modWikiGetSubwikiPages($mod_wiki_get_subwiki_pages_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWikiApi->modWikiGetSubwikiPages: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_wiki_get_subwiki_pages_request** | [**\OpenAPI\Client\Model\ModWikiGetSubwikiPagesRequest**](../Model/ModWikiGetSubwikiPagesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWikiGetSubwikiPages200Response**](../Model/ModWikiGetSubwikiPages200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWikiGetSubwikis()`

```php
modWikiGetSubwikis($mod_wiki_get_subwikis_request): \OpenAPI\Client\Model\ModWikiGetSubwikis200Response
```

Returns the list of subwikis the user can see in a specific wiki.

Returns the list of subwikis the user can see in a specific wiki.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWikiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_wiki_get_subwikis_request = new \OpenAPI\Client\Model\ModWikiGetSubwikisRequest(); // \OpenAPI\Client\Model\ModWikiGetSubwikisRequest

try {
    $result = $apiInstance->modWikiGetSubwikis($mod_wiki_get_subwikis_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWikiApi->modWikiGetSubwikis: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_wiki_get_subwikis_request** | [**\OpenAPI\Client\Model\ModWikiGetSubwikisRequest**](../Model/ModWikiGetSubwikisRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWikiGetSubwikis200Response**](../Model/ModWikiGetSubwikis200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWikiGetWikisByCourses()`

```php
modWikiGetWikisByCourses($mod_wiki_get_wikis_by_courses_request): \OpenAPI\Client\Model\ModWikiGetWikisByCourses200Response
```

Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.

Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWikiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_wiki_get_wikis_by_courses_request = new \OpenAPI\Client\Model\ModWikiGetWikisByCoursesRequest(); // \OpenAPI\Client\Model\ModWikiGetWikisByCoursesRequest

try {
    $result = $apiInstance->modWikiGetWikisByCourses($mod_wiki_get_wikis_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWikiApi->modWikiGetWikisByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_wiki_get_wikis_by_courses_request** | [**\OpenAPI\Client\Model\ModWikiGetWikisByCoursesRequest**](../Model/ModWikiGetWikisByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWikiGetWikisByCourses200Response**](../Model/ModWikiGetWikisByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWikiNewPage()`

```php
modWikiNewPage($mod_wiki_new_page_request): \OpenAPI\Client\Model\ModWikiNewPage200Response
```

Create a new page in a subwiki.

Create a new page in a subwiki.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWikiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_wiki_new_page_request = new \OpenAPI\Client\Model\ModWikiNewPageRequest(); // \OpenAPI\Client\Model\ModWikiNewPageRequest

try {
    $result = $apiInstance->modWikiNewPage($mod_wiki_new_page_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWikiApi->modWikiNewPage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_wiki_new_page_request** | [**\OpenAPI\Client\Model\ModWikiNewPageRequest**](../Model/ModWikiNewPageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWikiNewPage200Response**](../Model/ModWikiNewPage200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWikiViewPage()`

```php
modWikiViewPage($mod_wiki_view_page_request): \OpenAPI\Client\Model\ModWikiViewPage200Response
```

Trigger the page viewed event and update the module completion status.

Trigger the page viewed event and update the module completion status.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWikiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_wiki_view_page_request = new \OpenAPI\Client\Model\ModWikiViewPageRequest(); // \OpenAPI\Client\Model\ModWikiViewPageRequest

try {
    $result = $apiInstance->modWikiViewPage($mod_wiki_view_page_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWikiApi->modWikiViewPage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_wiki_view_page_request** | [**\OpenAPI\Client\Model\ModWikiViewPageRequest**](../Model/ModWikiViewPageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWikiViewPage200Response**](../Model/ModWikiViewPage200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modWikiViewWiki()`

```php
modWikiViewWiki($mod_wiki_get_subwikis_request): \OpenAPI\Client\Model\ModWikiViewWiki200Response
```

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModWikiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_wiki_get_subwikis_request = new \OpenAPI\Client\Model\ModWikiGetSubwikisRequest(); // \OpenAPI\Client\Model\ModWikiGetSubwikisRequest

try {
    $result = $apiInstance->modWikiViewWiki($mod_wiki_get_subwikis_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModWikiApi->modWikiViewWiki: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_wiki_get_subwikis_request** | [**\OpenAPI\Client\Model\ModWikiGetSubwikisRequest**](../Model/ModWikiGetSubwikisRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModWikiViewWiki200Response**](../Model/ModWikiViewWiki200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
