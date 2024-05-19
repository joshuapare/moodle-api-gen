# OpenAPI\Client\ModDataApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modDataAddEntry()**](ModDataApi.md#modDataAddEntry) | **POST** /mod_data_add_entry | Adds a new entry. |
| [**modDataApproveEntry()**](ModDataApi.md#modDataApproveEntry) | **POST** /mod_data_approve_entry | Approves or unapproves an entry. |
| [**modDataDeleteEntry()**](ModDataApi.md#modDataDeleteEntry) | **POST** /mod_data_delete_entry | Deletes an entry. |
| [**modDataDeleteSavedPreset()**](ModDataApi.md#modDataDeleteSavedPreset) | **POST** /mod_data_delete_saved_preset | Delete site user preset. |
| [**modDataGetDataAccessInformation()**](ModDataApi.md#modDataGetDataAccessInformation) | **POST** /mod_data_get_data_access_information | Return access information for a given database. |
| [**modDataGetDatabasesByCourses()**](ModDataApi.md#modDataGetDatabasesByCourses) | **POST** /mod_data_get_databases_by_courses | Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned. |
| [**modDataGetEntries()**](ModDataApi.md#modDataGetEntries) | **POST** /mod_data_get_entries | Return the complete list of entries of the given database. |
| [**modDataGetEntry()**](ModDataApi.md#modDataGetEntry) | **POST** /mod_data_get_entry | Return one entry record from the database, including contents optionally. |
| [**modDataGetFields()**](ModDataApi.md#modDataGetFields) | **POST** /mod_data_get_fields | Return the list of configured fields for the given database. |
| [**modDataGetMappingInformation()**](ModDataApi.md#modDataGetMappingInformation) | **POST** /mod_data_get_mapping_information | Get importing information |
| [**modDataSearchEntries()**](ModDataApi.md#modDataSearchEntries) | **POST** /mod_data_search_entries | Search for entries in the given database. |
| [**modDataUpdateEntry()**](ModDataApi.md#modDataUpdateEntry) | **POST** /mod_data_update_entry | Updates an existing entry. |
| [**modDataViewDatabase()**](ModDataApi.md#modDataViewDatabase) | **POST** /mod_data_view_database | Simulate the view.php web interface data: trigger events, completion, etc... |


## `modDataAddEntry()`

```php
modDataAddEntry($mod_data_add_entry_request): \OpenAPI\Client\Model\ModDataAddEntry200Response
```

Adds a new entry.

Adds a new entry.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModDataApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_data_add_entry_request = new \OpenAPI\Client\Model\ModDataAddEntryRequest(); // \OpenAPI\Client\Model\ModDataAddEntryRequest

try {
    $result = $apiInstance->modDataAddEntry($mod_data_add_entry_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModDataApi->modDataAddEntry: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_data_add_entry_request** | [**\OpenAPI\Client\Model\ModDataAddEntryRequest**](../Model/ModDataAddEntryRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModDataAddEntry200Response**](../Model/ModDataAddEntry200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modDataApproveEntry()`

```php
modDataApproveEntry($mod_data_approve_entry_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Approves or unapproves an entry.

Approves or unapproves an entry.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModDataApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_data_approve_entry_request = new \OpenAPI\Client\Model\ModDataApproveEntryRequest(); // \OpenAPI\Client\Model\ModDataApproveEntryRequest

try {
    $result = $apiInstance->modDataApproveEntry($mod_data_approve_entry_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModDataApi->modDataApproveEntry: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_data_approve_entry_request** | [**\OpenAPI\Client\Model\ModDataApproveEntryRequest**](../Model/ModDataApproveEntryRequest.md)|  | |

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

## `modDataDeleteEntry()`

```php
modDataDeleteEntry($mod_data_delete_entry_request): \OpenAPI\Client\Model\ModDataDeleteEntry200Response
```

Deletes an entry.

Deletes an entry.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModDataApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_data_delete_entry_request = new \OpenAPI\Client\Model\ModDataDeleteEntryRequest(); // \OpenAPI\Client\Model\ModDataDeleteEntryRequest

try {
    $result = $apiInstance->modDataDeleteEntry($mod_data_delete_entry_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModDataApi->modDataDeleteEntry: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_data_delete_entry_request** | [**\OpenAPI\Client\Model\ModDataDeleteEntryRequest**](../Model/ModDataDeleteEntryRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModDataDeleteEntry200Response**](../Model/ModDataDeleteEntry200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modDataDeleteSavedPreset()`

```php
modDataDeleteSavedPreset($mod_data_delete_saved_preset_request): \OpenAPI\Client\Model\CoreContentbankRenameContent200Response
```

Delete site user preset.

Delete site user preset.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModDataApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_data_delete_saved_preset_request = new \OpenAPI\Client\Model\ModDataDeleteSavedPresetRequest(); // \OpenAPI\Client\Model\ModDataDeleteSavedPresetRequest

try {
    $result = $apiInstance->modDataDeleteSavedPreset($mod_data_delete_saved_preset_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModDataApi->modDataDeleteSavedPreset: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_data_delete_saved_preset_request** | [**\OpenAPI\Client\Model\ModDataDeleteSavedPresetRequest**](../Model/ModDataDeleteSavedPresetRequest.md)|  | |

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

## `modDataGetDataAccessInformation()`

```php
modDataGetDataAccessInformation($mod_data_get_data_access_information_request): \OpenAPI\Client\Model\ModDataGetDataAccessInformation200Response
```

Return access information for a given database.

Return access information for a given database.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModDataApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_data_get_data_access_information_request = new \OpenAPI\Client\Model\ModDataGetDataAccessInformationRequest(); // \OpenAPI\Client\Model\ModDataGetDataAccessInformationRequest

try {
    $result = $apiInstance->modDataGetDataAccessInformation($mod_data_get_data_access_information_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModDataApi->modDataGetDataAccessInformation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_data_get_data_access_information_request** | [**\OpenAPI\Client\Model\ModDataGetDataAccessInformationRequest**](../Model/ModDataGetDataAccessInformationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModDataGetDataAccessInformation200Response**](../Model/ModDataGetDataAccessInformation200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modDataGetDatabasesByCourses()`

```php
modDataGetDatabasesByCourses($mod_chat_get_chats_by_courses_request): \OpenAPI\Client\Model\ModDataGetDatabasesByCourses200Response
```

Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.

Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModDataApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_get_chats_by_courses_request = new \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest(); // \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest

try {
    $result = $apiInstance->modDataGetDatabasesByCourses($mod_chat_get_chats_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModDataApi->modDataGetDatabasesByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_get_chats_by_courses_request** | [**\OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest**](../Model/ModChatGetChatsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModDataGetDatabasesByCourses200Response**](../Model/ModDataGetDatabasesByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modDataGetEntries()`

```php
modDataGetEntries($mod_data_get_entries_request): \OpenAPI\Client\Model\ModDataGetEntries200Response
```

Return the complete list of entries of the given database.

Return the complete list of entries of the given database.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModDataApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_data_get_entries_request = new \OpenAPI\Client\Model\ModDataGetEntriesRequest(); // \OpenAPI\Client\Model\ModDataGetEntriesRequest

try {
    $result = $apiInstance->modDataGetEntries($mod_data_get_entries_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModDataApi->modDataGetEntries: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_data_get_entries_request** | [**\OpenAPI\Client\Model\ModDataGetEntriesRequest**](../Model/ModDataGetEntriesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModDataGetEntries200Response**](../Model/ModDataGetEntries200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modDataGetEntry()`

```php
modDataGetEntry($mod_data_get_entry_request): \OpenAPI\Client\Model\ModDataGetEntry200Response
```

Return one entry record from the database, including contents optionally.

Return one entry record from the database, including contents optionally.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModDataApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_data_get_entry_request = new \OpenAPI\Client\Model\ModDataGetEntryRequest(); // \OpenAPI\Client\Model\ModDataGetEntryRequest

try {
    $result = $apiInstance->modDataGetEntry($mod_data_get_entry_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModDataApi->modDataGetEntry: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_data_get_entry_request** | [**\OpenAPI\Client\Model\ModDataGetEntryRequest**](../Model/ModDataGetEntryRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModDataGetEntry200Response**](../Model/ModDataGetEntry200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modDataGetFields()`

```php
modDataGetFields($mod_data_get_fields_request): \OpenAPI\Client\Model\ModDataGetFields200Response
```

Return the list of configured fields for the given database.

Return the list of configured fields for the given database.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModDataApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_data_get_fields_request = new \OpenAPI\Client\Model\ModDataGetFieldsRequest(); // \OpenAPI\Client\Model\ModDataGetFieldsRequest

try {
    $result = $apiInstance->modDataGetFields($mod_data_get_fields_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModDataApi->modDataGetFields: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_data_get_fields_request** | [**\OpenAPI\Client\Model\ModDataGetFieldsRequest**](../Model/ModDataGetFieldsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModDataGetFields200Response**](../Model/ModDataGetFields200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modDataGetMappingInformation()`

```php
modDataGetMappingInformation($mod_data_get_mapping_information_request): \OpenAPI\Client\Model\ModDataGetMappingInformation200Response
```

Get importing information

Get importing information

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModDataApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_data_get_mapping_information_request = new \OpenAPI\Client\Model\ModDataGetMappingInformationRequest(); // \OpenAPI\Client\Model\ModDataGetMappingInformationRequest

try {
    $result = $apiInstance->modDataGetMappingInformation($mod_data_get_mapping_information_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModDataApi->modDataGetMappingInformation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_data_get_mapping_information_request** | [**\OpenAPI\Client\Model\ModDataGetMappingInformationRequest**](../Model/ModDataGetMappingInformationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModDataGetMappingInformation200Response**](../Model/ModDataGetMappingInformation200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modDataSearchEntries()`

```php
modDataSearchEntries($mod_data_search_entries_request): \OpenAPI\Client\Model\ModDataSearchEntries200Response
```

Search for entries in the given database.

Search for entries in the given database.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModDataApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_data_search_entries_request = new \OpenAPI\Client\Model\ModDataSearchEntriesRequest(); // \OpenAPI\Client\Model\ModDataSearchEntriesRequest

try {
    $result = $apiInstance->modDataSearchEntries($mod_data_search_entries_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModDataApi->modDataSearchEntries: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_data_search_entries_request** | [**\OpenAPI\Client\Model\ModDataSearchEntriesRequest**](../Model/ModDataSearchEntriesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModDataSearchEntries200Response**](../Model/ModDataSearchEntries200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modDataUpdateEntry()`

```php
modDataUpdateEntry($mod_data_update_entry_request): \OpenAPI\Client\Model\ModDataUpdateEntry200Response
```

Updates an existing entry.

Updates an existing entry.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModDataApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_data_update_entry_request = new \OpenAPI\Client\Model\ModDataUpdateEntryRequest(); // \OpenAPI\Client\Model\ModDataUpdateEntryRequest

try {
    $result = $apiInstance->modDataUpdateEntry($mod_data_update_entry_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModDataApi->modDataUpdateEntry: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_data_update_entry_request** | [**\OpenAPI\Client\Model\ModDataUpdateEntryRequest**](../Model/ModDataUpdateEntryRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModDataUpdateEntry200Response**](../Model/ModDataUpdateEntry200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modDataViewDatabase()`

```php
modDataViewDatabase($mod_data_view_database_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Simulate the view.php web interface data: trigger events, completion, etc...

Simulate the view.php web interface data: trigger events, completion, etc...

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModDataApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_data_view_database_request = new \OpenAPI\Client\Model\ModDataViewDatabaseRequest(); // \OpenAPI\Client\Model\ModDataViewDatabaseRequest

try {
    $result = $apiInstance->modDataViewDatabase($mod_data_view_database_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModDataApi->modDataViewDatabase: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_data_view_database_request** | [**\OpenAPI\Client\Model\ModDataViewDatabaseRequest**](../Model/ModDataViewDatabaseRequest.md)|  | |

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
