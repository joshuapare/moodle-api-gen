# OpenAPI\Client\ToolDataprivacyApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**toolDataprivacyApproveDataRequest()**](ToolDataprivacyApi.md#toolDataprivacyApproveDataRequest) | **POST** /tool_dataprivacy_approve_data_request | Approve a data request |
| [**toolDataprivacyBulkApproveDataRequests()**](ToolDataprivacyApi.md#toolDataprivacyBulkApproveDataRequests) | **POST** /tool_dataprivacy_bulk_approve_data_requests | Bulk approve data requests |
| [**toolDataprivacyBulkDenyDataRequests()**](ToolDataprivacyApi.md#toolDataprivacyBulkDenyDataRequests) | **POST** /tool_dataprivacy_bulk_deny_data_requests | Bulk deny data requests |
| [**toolDataprivacyCancelDataRequest()**](ToolDataprivacyApi.md#toolDataprivacyCancelDataRequest) | **POST** /tool_dataprivacy_cancel_data_request | Cancel the data request made by the user |
| [**toolDataprivacyConfirmContextsForDeletion()**](ToolDataprivacyApi.md#toolDataprivacyConfirmContextsForDeletion) | **POST** /tool_dataprivacy_confirm_contexts_for_deletion | Mark the selected expired contexts as confirmed for deletion |
| [**toolDataprivacyContactDpo()**](ToolDataprivacyApi.md#toolDataprivacyContactDpo) | **POST** /tool_dataprivacy_contact_dpo | Contact the site Data Protection Officer(s) |
| [**toolDataprivacyCreateCategoryForm()**](ToolDataprivacyApi.md#toolDataprivacyCreateCategoryForm) | **POST** /tool_dataprivacy_create_category_form | Adds a data category |
| [**toolDataprivacyCreatePurposeForm()**](ToolDataprivacyApi.md#toolDataprivacyCreatePurposeForm) | **POST** /tool_dataprivacy_create_purpose_form | Adds a data purpose |
| [**toolDataprivacyDeleteCategory()**](ToolDataprivacyApi.md#toolDataprivacyDeleteCategory) | **POST** /tool_dataprivacy_delete_category | Deletes an existing data category |
| [**toolDataprivacyDeletePurpose()**](ToolDataprivacyApi.md#toolDataprivacyDeletePurpose) | **POST** /tool_dataprivacy_delete_purpose | Deletes an existing data purpose |
| [**toolDataprivacyDenyDataRequest()**](ToolDataprivacyApi.md#toolDataprivacyDenyDataRequest) | **POST** /tool_dataprivacy_deny_data_request | Deny a data request |
| [**toolDataprivacyGetActivityOptions()**](ToolDataprivacyApi.md#toolDataprivacyGetActivityOptions) | **POST** /tool_dataprivacy_get_activity_options | Fetches a list of activity options |
| [**toolDataprivacyGetCategoryOptions()**](ToolDataprivacyApi.md#toolDataprivacyGetCategoryOptions) | **POST** /tool_dataprivacy_get_category_options | Fetches a list of data category options |
| [**toolDataprivacyGetDataRequest()**](ToolDataprivacyApi.md#toolDataprivacyGetDataRequest) | **POST** /tool_dataprivacy_get_data_request | Fetch the details of a user&#39;s data request |
| [**toolDataprivacyGetPurposeOptions()**](ToolDataprivacyApi.md#toolDataprivacyGetPurposeOptions) | **POST** /tool_dataprivacy_get_purpose_options | Fetches a list of data storage purpose options |
| [**toolDataprivacyGetUsers()**](ToolDataprivacyApi.md#toolDataprivacyGetUsers) | **POST** /tool_dataprivacy_get_users | Fetches a list of users |
| [**toolDataprivacyMarkComplete()**](ToolDataprivacyApi.md#toolDataprivacyMarkComplete) | **POST** /tool_dataprivacy_mark_complete | Mark a user&#39;s general enquiry as complete |
| [**toolDataprivacySetContextDefaults()**](ToolDataprivacyApi.md#toolDataprivacySetContextDefaults) | **POST** /tool_dataprivacy_set_context_defaults | Updates the default category and purpose for a given context level (and optionally, a plugin) |
| [**toolDataprivacySetContextForm()**](ToolDataprivacyApi.md#toolDataprivacySetContextForm) | **POST** /tool_dataprivacy_set_context_form | Sets purpose and category for a specific context |
| [**toolDataprivacySetContextlevelForm()**](ToolDataprivacyApi.md#toolDataprivacySetContextlevelForm) | **POST** /tool_dataprivacy_set_contextlevel_form | Sets purpose and category across a context level |
| [**toolDataprivacySubmitSelectedCoursesForm()**](ToolDataprivacyApi.md#toolDataprivacySubmitSelectedCoursesForm) | **POST** /tool_dataprivacy_submit_selected_courses_form | Save list of selected courses for export |
| [**toolDataprivacyTreeExtraBranches()**](ToolDataprivacyApi.md#toolDataprivacyTreeExtraBranches) | **POST** /tool_dataprivacy_tree_extra_branches | Return branches for the context tree |


## `toolDataprivacyApproveDataRequest()`

```php
toolDataprivacyApproveDataRequest($tool_dataprivacy_approve_data_request_request): \OpenAPI\Client\Model\CoreContentbankRenameContent200Response
```

Approve a data request

Approve a data request

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_approve_data_request_request = new \OpenAPI\Client\Model\ToolDataprivacyApproveDataRequestRequest(); // \OpenAPI\Client\Model\ToolDataprivacyApproveDataRequestRequest

try {
    $result = $apiInstance->toolDataprivacyApproveDataRequest($tool_dataprivacy_approve_data_request_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacyApproveDataRequest: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_approve_data_request_request** | [**\OpenAPI\Client\Model\ToolDataprivacyApproveDataRequestRequest**](../Model/ToolDataprivacyApproveDataRequestRequest.md)|  | |

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

## `toolDataprivacyBulkApproveDataRequests()`

```php
toolDataprivacyBulkApproveDataRequests($tool_dataprivacy_bulk_approve_data_requests_request): \OpenAPI\Client\Model\CoreContentbankRenameContent200Response
```

Bulk approve data requests

Bulk approve data requests

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_bulk_approve_data_requests_request = new \OpenAPI\Client\Model\ToolDataprivacyBulkApproveDataRequestsRequest(); // \OpenAPI\Client\Model\ToolDataprivacyBulkApproveDataRequestsRequest

try {
    $result = $apiInstance->toolDataprivacyBulkApproveDataRequests($tool_dataprivacy_bulk_approve_data_requests_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacyBulkApproveDataRequests: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_bulk_approve_data_requests_request** | [**\OpenAPI\Client\Model\ToolDataprivacyBulkApproveDataRequestsRequest**](../Model/ToolDataprivacyBulkApproveDataRequestsRequest.md)|  | |

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

## `toolDataprivacyBulkDenyDataRequests()`

```php
toolDataprivacyBulkDenyDataRequests($tool_dataprivacy_bulk_deny_data_requests_request): \OpenAPI\Client\Model\CoreContentbankRenameContent200Response
```

Bulk deny data requests

Bulk deny data requests

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_bulk_deny_data_requests_request = new \OpenAPI\Client\Model\ToolDataprivacyBulkDenyDataRequestsRequest(); // \OpenAPI\Client\Model\ToolDataprivacyBulkDenyDataRequestsRequest

try {
    $result = $apiInstance->toolDataprivacyBulkDenyDataRequests($tool_dataprivacy_bulk_deny_data_requests_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacyBulkDenyDataRequests: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_bulk_deny_data_requests_request** | [**\OpenAPI\Client\Model\ToolDataprivacyBulkDenyDataRequestsRequest**](../Model/ToolDataprivacyBulkDenyDataRequestsRequest.md)|  | |

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

## `toolDataprivacyCancelDataRequest()`

```php
toolDataprivacyCancelDataRequest($tool_dataprivacy_cancel_data_request_request): \OpenAPI\Client\Model\CoreContentbankRenameContent200Response
```

Cancel the data request made by the user

Cancel the data request made by the user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_cancel_data_request_request = new \OpenAPI\Client\Model\ToolDataprivacyCancelDataRequestRequest(); // \OpenAPI\Client\Model\ToolDataprivacyCancelDataRequestRequest

try {
    $result = $apiInstance->toolDataprivacyCancelDataRequest($tool_dataprivacy_cancel_data_request_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacyCancelDataRequest: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_cancel_data_request_request** | [**\OpenAPI\Client\Model\ToolDataprivacyCancelDataRequestRequest**](../Model/ToolDataprivacyCancelDataRequestRequest.md)|  | |

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

## `toolDataprivacyConfirmContextsForDeletion()`

```php
toolDataprivacyConfirmContextsForDeletion($tool_dataprivacy_confirm_contexts_for_deletion_request): \OpenAPI\Client\Model\ToolDataprivacyConfirmContextsForDeletion200Response
```

Mark the selected expired contexts as confirmed for deletion

Mark the selected expired contexts as confirmed for deletion

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_confirm_contexts_for_deletion_request = new \OpenAPI\Client\Model\ToolDataprivacyConfirmContextsForDeletionRequest(); // \OpenAPI\Client\Model\ToolDataprivacyConfirmContextsForDeletionRequest

try {
    $result = $apiInstance->toolDataprivacyConfirmContextsForDeletion($tool_dataprivacy_confirm_contexts_for_deletion_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacyConfirmContextsForDeletion: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_confirm_contexts_for_deletion_request** | [**\OpenAPI\Client\Model\ToolDataprivacyConfirmContextsForDeletionRequest**](../Model/ToolDataprivacyConfirmContextsForDeletionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolDataprivacyConfirmContextsForDeletion200Response**](../Model/ToolDataprivacyConfirmContextsForDeletion200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolDataprivacyContactDpo()`

```php
toolDataprivacyContactDpo($tool_dataprivacy_contact_dpo_request): \OpenAPI\Client\Model\CoreContentbankRenameContent200Response
```

Contact the site Data Protection Officer(s)

Contact the site Data Protection Officer(s)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_contact_dpo_request = new \OpenAPI\Client\Model\ToolDataprivacyContactDpoRequest(); // \OpenAPI\Client\Model\ToolDataprivacyContactDpoRequest

try {
    $result = $apiInstance->toolDataprivacyContactDpo($tool_dataprivacy_contact_dpo_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacyContactDpo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_contact_dpo_request** | [**\OpenAPI\Client\Model\ToolDataprivacyContactDpoRequest**](../Model/ToolDataprivacyContactDpoRequest.md)|  | |

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

## `toolDataprivacyCreateCategoryForm()`

```php
toolDataprivacyCreateCategoryForm($tool_dataprivacy_create_category_form_request): \OpenAPI\Client\Model\ToolDataprivacyCreateCategoryForm200Response
```

Adds a data category

Adds a data category

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_create_category_form_request = new \OpenAPI\Client\Model\ToolDataprivacyCreateCategoryFormRequest(); // \OpenAPI\Client\Model\ToolDataprivacyCreateCategoryFormRequest

try {
    $result = $apiInstance->toolDataprivacyCreateCategoryForm($tool_dataprivacy_create_category_form_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacyCreateCategoryForm: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_create_category_form_request** | [**\OpenAPI\Client\Model\ToolDataprivacyCreateCategoryFormRequest**](../Model/ToolDataprivacyCreateCategoryFormRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolDataprivacyCreateCategoryForm200Response**](../Model/ToolDataprivacyCreateCategoryForm200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolDataprivacyCreatePurposeForm()`

```php
toolDataprivacyCreatePurposeForm($tool_dataprivacy_create_purpose_form_request): \OpenAPI\Client\Model\ToolDataprivacyCreatePurposeForm200Response
```

Adds a data purpose

Adds a data purpose

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_create_purpose_form_request = new \OpenAPI\Client\Model\ToolDataprivacyCreatePurposeFormRequest(); // \OpenAPI\Client\Model\ToolDataprivacyCreatePurposeFormRequest

try {
    $result = $apiInstance->toolDataprivacyCreatePurposeForm($tool_dataprivacy_create_purpose_form_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacyCreatePurposeForm: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_create_purpose_form_request** | [**\OpenAPI\Client\Model\ToolDataprivacyCreatePurposeFormRequest**](../Model/ToolDataprivacyCreatePurposeFormRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolDataprivacyCreatePurposeForm200Response**](../Model/ToolDataprivacyCreatePurposeForm200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolDataprivacyDeleteCategory()`

```php
toolDataprivacyDeleteCategory($tool_dataprivacy_delete_category_request): \OpenAPI\Client\Model\CoreContentbankRenameContent200Response
```

Deletes an existing data category

Deletes an existing data category

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_delete_category_request = new \OpenAPI\Client\Model\ToolDataprivacyDeleteCategoryRequest(); // \OpenAPI\Client\Model\ToolDataprivacyDeleteCategoryRequest

try {
    $result = $apiInstance->toolDataprivacyDeleteCategory($tool_dataprivacy_delete_category_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacyDeleteCategory: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_delete_category_request** | [**\OpenAPI\Client\Model\ToolDataprivacyDeleteCategoryRequest**](../Model/ToolDataprivacyDeleteCategoryRequest.md)|  | |

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

## `toolDataprivacyDeletePurpose()`

```php
toolDataprivacyDeletePurpose($tool_dataprivacy_delete_purpose_request): \OpenAPI\Client\Model\CoreContentbankRenameContent200Response
```

Deletes an existing data purpose

Deletes an existing data purpose

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_delete_purpose_request = new \OpenAPI\Client\Model\ToolDataprivacyDeletePurposeRequest(); // \OpenAPI\Client\Model\ToolDataprivacyDeletePurposeRequest

try {
    $result = $apiInstance->toolDataprivacyDeletePurpose($tool_dataprivacy_delete_purpose_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacyDeletePurpose: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_delete_purpose_request** | [**\OpenAPI\Client\Model\ToolDataprivacyDeletePurposeRequest**](../Model/ToolDataprivacyDeletePurposeRequest.md)|  | |

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

## `toolDataprivacyDenyDataRequest()`

```php
toolDataprivacyDenyDataRequest($tool_dataprivacy_cancel_data_request_request): \OpenAPI\Client\Model\CoreContentbankRenameContent200Response
```

Deny a data request

Deny a data request

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_cancel_data_request_request = new \OpenAPI\Client\Model\ToolDataprivacyCancelDataRequestRequest(); // \OpenAPI\Client\Model\ToolDataprivacyCancelDataRequestRequest

try {
    $result = $apiInstance->toolDataprivacyDenyDataRequest($tool_dataprivacy_cancel_data_request_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacyDenyDataRequest: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_cancel_data_request_request** | [**\OpenAPI\Client\Model\ToolDataprivacyCancelDataRequestRequest**](../Model/ToolDataprivacyCancelDataRequestRequest.md)|  | |

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

## `toolDataprivacyGetActivityOptions()`

```php
toolDataprivacyGetActivityOptions($tool_dataprivacy_get_activity_options_request): \OpenAPI\Client\Model\ToolDataprivacyGetActivityOptions200Response
```

Fetches a list of activity options

Fetches a list of activity options

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_get_activity_options_request = new \OpenAPI\Client\Model\ToolDataprivacyGetActivityOptionsRequest(); // \OpenAPI\Client\Model\ToolDataprivacyGetActivityOptionsRequest

try {
    $result = $apiInstance->toolDataprivacyGetActivityOptions($tool_dataprivacy_get_activity_options_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacyGetActivityOptions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_get_activity_options_request** | [**\OpenAPI\Client\Model\ToolDataprivacyGetActivityOptionsRequest**](../Model/ToolDataprivacyGetActivityOptionsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolDataprivacyGetActivityOptions200Response**](../Model/ToolDataprivacyGetActivityOptions200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolDataprivacyGetCategoryOptions()`

```php
toolDataprivacyGetCategoryOptions($tool_dataprivacy_get_category_options_request): \OpenAPI\Client\Model\ToolDataprivacyGetCategoryOptions200Response
```

Fetches a list of data category options

Fetches a list of data category options

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_get_category_options_request = new \OpenAPI\Client\Model\ToolDataprivacyGetCategoryOptionsRequest(); // \OpenAPI\Client\Model\ToolDataprivacyGetCategoryOptionsRequest

try {
    $result = $apiInstance->toolDataprivacyGetCategoryOptions($tool_dataprivacy_get_category_options_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacyGetCategoryOptions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_get_category_options_request** | [**\OpenAPI\Client\Model\ToolDataprivacyGetCategoryOptionsRequest**](../Model/ToolDataprivacyGetCategoryOptionsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolDataprivacyGetCategoryOptions200Response**](../Model/ToolDataprivacyGetCategoryOptions200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolDataprivacyGetDataRequest()`

```php
toolDataprivacyGetDataRequest($tool_dataprivacy_cancel_data_request_request): \OpenAPI\Client\Model\ToolDataprivacyGetDataRequest200Response
```

Fetch the details of a user's data request

Fetch the details of a user's data request

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_cancel_data_request_request = new \OpenAPI\Client\Model\ToolDataprivacyCancelDataRequestRequest(); // \OpenAPI\Client\Model\ToolDataprivacyCancelDataRequestRequest

try {
    $result = $apiInstance->toolDataprivacyGetDataRequest($tool_dataprivacy_cancel_data_request_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacyGetDataRequest: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_cancel_data_request_request** | [**\OpenAPI\Client\Model\ToolDataprivacyCancelDataRequestRequest**](../Model/ToolDataprivacyCancelDataRequestRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolDataprivacyGetDataRequest200Response**](../Model/ToolDataprivacyGetDataRequest200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolDataprivacyGetPurposeOptions()`

```php
toolDataprivacyGetPurposeOptions($tool_dataprivacy_get_category_options_request): \OpenAPI\Client\Model\ToolDataprivacyGetPurposeOptions200Response
```

Fetches a list of data storage purpose options

Fetches a list of data storage purpose options

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_get_category_options_request = new \OpenAPI\Client\Model\ToolDataprivacyGetCategoryOptionsRequest(); // \OpenAPI\Client\Model\ToolDataprivacyGetCategoryOptionsRequest

try {
    $result = $apiInstance->toolDataprivacyGetPurposeOptions($tool_dataprivacy_get_category_options_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacyGetPurposeOptions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_get_category_options_request** | [**\OpenAPI\Client\Model\ToolDataprivacyGetCategoryOptionsRequest**](../Model/ToolDataprivacyGetCategoryOptionsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolDataprivacyGetPurposeOptions200Response**](../Model/ToolDataprivacyGetPurposeOptions200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolDataprivacyGetUsers()`

```php
toolDataprivacyGetUsers($tool_dataprivacy_get_users_request): object
```

Fetches a list of users

Fetches a list of users

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_get_users_request = new \OpenAPI\Client\Model\ToolDataprivacyGetUsersRequest(); // \OpenAPI\Client\Model\ToolDataprivacyGetUsersRequest

try {
    $result = $apiInstance->toolDataprivacyGetUsers($tool_dataprivacy_get_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacyGetUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_get_users_request** | [**\OpenAPI\Client\Model\ToolDataprivacyGetUsersRequest**](../Model/ToolDataprivacyGetUsersRequest.md)|  | |

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

## `toolDataprivacyMarkComplete()`

```php
toolDataprivacyMarkComplete($tool_dataprivacy_cancel_data_request_request): \OpenAPI\Client\Model\CoreContentbankRenameContent200Response
```

Mark a user's general enquiry as complete

Mark a user's general enquiry as complete

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_cancel_data_request_request = new \OpenAPI\Client\Model\ToolDataprivacyCancelDataRequestRequest(); // \OpenAPI\Client\Model\ToolDataprivacyCancelDataRequestRequest

try {
    $result = $apiInstance->toolDataprivacyMarkComplete($tool_dataprivacy_cancel_data_request_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacyMarkComplete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_cancel_data_request_request** | [**\OpenAPI\Client\Model\ToolDataprivacyCancelDataRequestRequest**](../Model/ToolDataprivacyCancelDataRequestRequest.md)|  | |

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

## `toolDataprivacySetContextDefaults()`

```php
toolDataprivacySetContextDefaults($tool_dataprivacy_set_context_defaults_request): \OpenAPI\Client\Model\ToolDataprivacySetContextDefaults200Response
```

Updates the default category and purpose for a given context level (and optionally, a plugin)

Updates the default category and purpose for a given context level (and optionally, a plugin)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_set_context_defaults_request = new \OpenAPI\Client\Model\ToolDataprivacySetContextDefaultsRequest(); // \OpenAPI\Client\Model\ToolDataprivacySetContextDefaultsRequest

try {
    $result = $apiInstance->toolDataprivacySetContextDefaults($tool_dataprivacy_set_context_defaults_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacySetContextDefaults: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_set_context_defaults_request** | [**\OpenAPI\Client\Model\ToolDataprivacySetContextDefaultsRequest**](../Model/ToolDataprivacySetContextDefaultsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolDataprivacySetContextDefaults200Response**](../Model/ToolDataprivacySetContextDefaults200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolDataprivacySetContextForm()`

```php
toolDataprivacySetContextForm($tool_dataprivacy_set_context_form_request): \OpenAPI\Client\Model\ToolDataprivacySetContextForm200Response
```

Sets purpose and category for a specific context

Sets purpose and category for a specific context

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_set_context_form_request = new \OpenAPI\Client\Model\ToolDataprivacySetContextFormRequest(); // \OpenAPI\Client\Model\ToolDataprivacySetContextFormRequest

try {
    $result = $apiInstance->toolDataprivacySetContextForm($tool_dataprivacy_set_context_form_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacySetContextForm: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_set_context_form_request** | [**\OpenAPI\Client\Model\ToolDataprivacySetContextFormRequest**](../Model/ToolDataprivacySetContextFormRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolDataprivacySetContextForm200Response**](../Model/ToolDataprivacySetContextForm200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolDataprivacySetContextlevelForm()`

```php
toolDataprivacySetContextlevelForm($tool_dataprivacy_set_contextlevel_form_request): \OpenAPI\Client\Model\ToolDataprivacySetContextlevelForm200Response
```

Sets purpose and category across a context level

Sets purpose and category across a context level

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_set_contextlevel_form_request = new \OpenAPI\Client\Model\ToolDataprivacySetContextlevelFormRequest(); // \OpenAPI\Client\Model\ToolDataprivacySetContextlevelFormRequest

try {
    $result = $apiInstance->toolDataprivacySetContextlevelForm($tool_dataprivacy_set_contextlevel_form_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacySetContextlevelForm: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_set_contextlevel_form_request** | [**\OpenAPI\Client\Model\ToolDataprivacySetContextlevelFormRequest**](../Model/ToolDataprivacySetContextlevelFormRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolDataprivacySetContextlevelForm200Response**](../Model/ToolDataprivacySetContextlevelForm200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolDataprivacySubmitSelectedCoursesForm()`

```php
toolDataprivacySubmitSelectedCoursesForm($tool_dataprivacy_submit_selected_courses_form_request): \OpenAPI\Client\Model\CoreContentbankRenameContent200Response
```

Save list of selected courses for export

Save list of selected courses for export

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_submit_selected_courses_form_request = new \OpenAPI\Client\Model\ToolDataprivacySubmitSelectedCoursesFormRequest(); // \OpenAPI\Client\Model\ToolDataprivacySubmitSelectedCoursesFormRequest

try {
    $result = $apiInstance->toolDataprivacySubmitSelectedCoursesForm($tool_dataprivacy_submit_selected_courses_form_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacySubmitSelectedCoursesForm: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_submit_selected_courses_form_request** | [**\OpenAPI\Client\Model\ToolDataprivacySubmitSelectedCoursesFormRequest**](../Model/ToolDataprivacySubmitSelectedCoursesFormRequest.md)|  | |

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

## `toolDataprivacyTreeExtraBranches()`

```php
toolDataprivacyTreeExtraBranches($tool_dataprivacy_tree_extra_branches_request): \OpenAPI\Client\Model\ToolDataprivacyTreeExtraBranches200Response
```

Return branches for the context tree

Return branches for the context tree

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolDataprivacyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_dataprivacy_tree_extra_branches_request = new \OpenAPI\Client\Model\ToolDataprivacyTreeExtraBranchesRequest(); // \OpenAPI\Client\Model\ToolDataprivacyTreeExtraBranchesRequest

try {
    $result = $apiInstance->toolDataprivacyTreeExtraBranches($tool_dataprivacy_tree_extra_branches_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolDataprivacyApi->toolDataprivacyTreeExtraBranches: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_dataprivacy_tree_extra_branches_request** | [**\OpenAPI\Client\Model\ToolDataprivacyTreeExtraBranchesRequest**](../Model/ToolDataprivacyTreeExtraBranchesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolDataprivacyTreeExtraBranches200Response**](../Model/ToolDataprivacyTreeExtraBranches200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
