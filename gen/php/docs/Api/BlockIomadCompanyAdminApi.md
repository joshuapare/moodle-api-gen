# OpenAPI\Client\BlockIomadCompanyAdminApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**blockIomadCompanyAdminAllocateLicenses()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminAllocateLicenses) | **POST** /block_iomad_company_admin_allocate_licenses | Allocate course licenses to a user |
| [**blockIomadCompanyAdminAssignCourses()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminAssignCourses) | **POST** /block_iomad_company_admin_assign_courses | Assign a course to a company |
| [**blockIomadCompanyAdminAssignUsers()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminAssignUsers) | **POST** /block_iomad_company_admin_assign_users | Assign users to a company |
| [**blockIomadCompanyAdminCapabilityDeleteTemplate()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminCapabilityDeleteTemplate) | **POST** /block_iomad_company_admin_capability_delete_template | Delete Iomad capabilities template |
| [**blockIomadCompanyAdminCheckToken()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminCheckToken) | **POST** /block_iomad_company_admin_check_token | Check SSO token |
| [**blockIomadCompanyAdminCreateCompanies()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminCreateCompanies) | **POST** /block_iomad_company_admin_create_companies | Create new Iomad companies |
| [**blockIomadCompanyAdminCreateLicenses()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminCreateLicenses) | **POST** /block_iomad_company_admin_create_licenses | Create company licenses |
| [**blockIomadCompanyAdminDeleteLicenses()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminDeleteLicenses) | **POST** /block_iomad_company_admin_delete_licenses | Delete company licenses |
| [**blockIomadCompanyAdminEditCompanies()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminEditCompanies) | **POST** /block_iomad_company_admin_edit_companies | Edit Iomad companies |
| [**blockIomadCompanyAdminEditLicenses()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminEditLicenses) | **POST** /block_iomad_company_admin_edit_licenses | Edit company license settings |
| [**blockIomadCompanyAdminEnrolUsers()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminEnrolUsers) | **POST** /block_iomad_company_admin_enrol_users | Assign users onto courses |
| [**blockIomadCompanyAdminGetCompanies()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetCompanies) | **POST** /block_iomad_company_admin_get_companies | Get all Iomad companies |
| [**blockIomadCompanyAdminGetCompanyCourses()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetCompanyCourses) | **POST** /block_iomad_company_admin_get_company_courses | Get Iomad company course allocations |
| [**blockIomadCompanyAdminGetCourseInfo()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetCourseInfo) | **POST** /block_iomad_company_admin_get_course_info | Get Iomad course settings |
| [**blockIomadCompanyAdminGetDepartmentUsers()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetDepartmentUsers) | **POST** /block_iomad_company_admin_get_department_users | Get users within a department |
| [**blockIomadCompanyAdminGetDepartments()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetDepartments) | **POST** /block_iomad_company_admin_get_departments | Get all company departments |
| [**blockIomadCompanyAdminGetLicenseFromId()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetLicenseFromId) | **POST** /block_iomad_company_admin_get_license_from_id | Get licence data give the ID |
| [**blockIomadCompanyAdminGetLicenseInfo()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetLicenseInfo) | **POST** /block_iomad_company_admin_get_license_info | Get company license information |
| [**blockIomadCompanyAdminMoveUsers()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminMoveUsers) | **POST** /block_iomad_company_admin_move_users | Move users between departments |
| [**blockIomadCompanyAdminRestrictCapability()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminRestrictCapability) | **POST** /block_iomad_company_admin_restrict_capability | set/reset Iomad capability |
| [**blockIomadCompanyAdminSyncUsers()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminSyncUsers) | **POST** /block_iomad_company_admin_sync_users | Call update users to sync to external system |
| [**blockIomadCompanyAdminUnallocateLicenses()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminUnallocateLicenses) | **POST** /block_iomad_company_admin_unallocate_licenses | Remove course licenses from users |
| [**blockIomadCompanyAdminUnassignCourses()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminUnassignCourses) | **POST** /block_iomad_company_admin_unassign_courses | Unassign a course from a company |
| [**blockIomadCompanyAdminUnassignUsers()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminUnassignUsers) | **POST** /block_iomad_company_admin_unassign_users | Unassign users from a company |
| [**blockIomadCompanyAdminUpdateCourses()**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminUpdateCourses) | **POST** /block_iomad_company_admin_update_courses | Update Iomad course settings |


## `blockIomadCompanyAdminAllocateLicenses()`

```php
blockIomadCompanyAdminAllocateLicenses($block_iomad_company_admin_allocate_licenses_request): object
```

Allocate course licenses to a user

Allocate course licenses to a user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_allocate_licenses_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminAllocateLicensesRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminAllocateLicensesRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminAllocateLicenses($block_iomad_company_admin_allocate_licenses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminAllocateLicenses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_allocate_licenses_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminAllocateLicensesRequest**](../Model/BlockIomadCompanyAdminAllocateLicensesRequest.md)|  | |

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

## `blockIomadCompanyAdminAssignCourses()`

```php
blockIomadCompanyAdminAssignCourses($block_iomad_company_admin_assign_courses_request): object
```

Assign a course to a company

Assign a course to a company

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_assign_courses_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminAssignCoursesRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminAssignCoursesRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminAssignCourses($block_iomad_company_admin_assign_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminAssignCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_assign_courses_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminAssignCoursesRequest**](../Model/BlockIomadCompanyAdminAssignCoursesRequest.md)|  | |

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

## `blockIomadCompanyAdminAssignUsers()`

```php
blockIomadCompanyAdminAssignUsers($block_iomad_company_admin_assign_users_request): \OpenAPI\Client\Model\BlockIomadCompanyAdminAssignUsers200Response
```

Assign users to a company

Assign users to a company

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_assign_users_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminAssignUsersRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminAssignUsersRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminAssignUsers($block_iomad_company_admin_assign_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminAssignUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_assign_users_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminAssignUsersRequest**](../Model/BlockIomadCompanyAdminAssignUsersRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\BlockIomadCompanyAdminAssignUsers200Response**](../Model/BlockIomadCompanyAdminAssignUsers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `blockIomadCompanyAdminCapabilityDeleteTemplate()`

```php
blockIomadCompanyAdminCapabilityDeleteTemplate($block_iomad_company_admin_capability_delete_template_request): object
```

Delete Iomad capabilities template

Delete Iomad capabilities template

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_capability_delete_template_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminCapabilityDeleteTemplateRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminCapabilityDeleteTemplateRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminCapabilityDeleteTemplate($block_iomad_company_admin_capability_delete_template_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminCapabilityDeleteTemplate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_capability_delete_template_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminCapabilityDeleteTemplateRequest**](../Model/BlockIomadCompanyAdminCapabilityDeleteTemplateRequest.md)|  | |

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

## `blockIomadCompanyAdminCheckToken()`

```php
blockIomadCompanyAdminCheckToken($block_iomad_company_admin_check_token_request): \OpenAPI\Client\Model\BlockIomadCompanyAdminCheckToken200Response
```

Check SSO token

Check SSO token

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_check_token_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminCheckTokenRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminCheckTokenRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminCheckToken($block_iomad_company_admin_check_token_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminCheckToken: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_check_token_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminCheckTokenRequest**](../Model/BlockIomadCompanyAdminCheckTokenRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\BlockIomadCompanyAdminCheckToken200Response**](../Model/BlockIomadCompanyAdminCheckToken200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `blockIomadCompanyAdminCreateCompanies()`

```php
blockIomadCompanyAdminCreateCompanies($block_iomad_company_admin_create_companies_request): object
```

Create new Iomad companies

Create new Iomad companies

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_create_companies_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminCreateCompaniesRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminCreateCompaniesRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminCreateCompanies($block_iomad_company_admin_create_companies_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminCreateCompanies: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_create_companies_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminCreateCompaniesRequest**](../Model/BlockIomadCompanyAdminCreateCompaniesRequest.md)|  | |

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

## `blockIomadCompanyAdminCreateLicenses()`

```php
blockIomadCompanyAdminCreateLicenses($block_iomad_company_admin_create_licenses_request): object
```

Create company licenses

Create company licenses

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_create_licenses_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminCreateLicensesRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminCreateLicensesRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminCreateLicenses($block_iomad_company_admin_create_licenses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminCreateLicenses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_create_licenses_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminCreateLicensesRequest**](../Model/BlockIomadCompanyAdminCreateLicensesRequest.md)|  | |

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

## `blockIomadCompanyAdminDeleteLicenses()`

```php
blockIomadCompanyAdminDeleteLicenses($block_iomad_company_admin_delete_licenses_request): object
```

Delete company licenses

Delete company licenses

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_delete_licenses_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminDeleteLicensesRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminDeleteLicensesRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminDeleteLicenses($block_iomad_company_admin_delete_licenses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminDeleteLicenses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_delete_licenses_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminDeleteLicensesRequest**](../Model/BlockIomadCompanyAdminDeleteLicensesRequest.md)|  | |

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

## `blockIomadCompanyAdminEditCompanies()`

```php
blockIomadCompanyAdminEditCompanies($block_iomad_company_admin_edit_companies_request): object
```

Edit Iomad companies

Edit Iomad companies

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_edit_companies_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminEditCompaniesRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminEditCompaniesRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminEditCompanies($block_iomad_company_admin_edit_companies_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminEditCompanies: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_edit_companies_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminEditCompaniesRequest**](../Model/BlockIomadCompanyAdminEditCompaniesRequest.md)|  | |

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

## `blockIomadCompanyAdminEditLicenses()`

```php
blockIomadCompanyAdminEditLicenses($block_iomad_company_admin_edit_licenses_request): object
```

Edit company license settings

Edit company license settings

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_edit_licenses_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminEditLicensesRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminEditLicensesRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminEditLicenses($block_iomad_company_admin_edit_licenses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminEditLicenses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_edit_licenses_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminEditLicensesRequest**](../Model/BlockIomadCompanyAdminEditLicensesRequest.md)|  | |

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

## `blockIomadCompanyAdminEnrolUsers()`

```php
blockIomadCompanyAdminEnrolUsers($block_iomad_company_admin_enrol_users_request): object
```

Assign users onto courses

Assign users onto courses

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_enrol_users_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminEnrolUsersRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminEnrolUsersRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminEnrolUsers($block_iomad_company_admin_enrol_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminEnrolUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_enrol_users_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminEnrolUsersRequest**](../Model/BlockIomadCompanyAdminEnrolUsersRequest.md)|  | |

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

## `blockIomadCompanyAdminGetCompanies()`

```php
blockIomadCompanyAdminGetCompanies($block_iomad_company_admin_get_companies_request): \OpenAPI\Client\Model\BlockIomadCompanyAdminGetCompanies200Response
```

Get all Iomad companies

Get all Iomad companies

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_get_companies_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminGetCompaniesRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminGetCompaniesRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminGetCompanies($block_iomad_company_admin_get_companies_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminGetCompanies: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_get_companies_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminGetCompaniesRequest**](../Model/BlockIomadCompanyAdminGetCompaniesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\BlockIomadCompanyAdminGetCompanies200Response**](../Model/BlockIomadCompanyAdminGetCompanies200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `blockIomadCompanyAdminGetCompanyCourses()`

```php
blockIomadCompanyAdminGetCompanyCourses($block_iomad_company_admin_get_company_courses_request): \OpenAPI\Client\Model\BlockIomadCompanyAdminGetCompanyCourses200Response
```

Get Iomad company course allocations

Get Iomad company course allocations

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_get_company_courses_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminGetCompanyCoursesRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminGetCompanyCoursesRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminGetCompanyCourses($block_iomad_company_admin_get_company_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminGetCompanyCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_get_company_courses_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminGetCompanyCoursesRequest**](../Model/BlockIomadCompanyAdminGetCompanyCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\BlockIomadCompanyAdminGetCompanyCourses200Response**](../Model/BlockIomadCompanyAdminGetCompanyCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `blockIomadCompanyAdminGetCourseInfo()`

```php
blockIomadCompanyAdminGetCourseInfo($block_iomad_company_admin_get_course_info_request): object
```

Get Iomad course settings

Get Iomad course settings

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_get_course_info_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminGetCourseInfoRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminGetCourseInfoRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminGetCourseInfo($block_iomad_company_admin_get_course_info_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminGetCourseInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_get_course_info_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminGetCourseInfoRequest**](../Model/BlockIomadCompanyAdminGetCourseInfoRequest.md)|  | |

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

## `blockIomadCompanyAdminGetDepartmentUsers()`

```php
blockIomadCompanyAdminGetDepartmentUsers($block_iomad_company_admin_get_department_users_request): \OpenAPI\Client\Model\BlockIomadCompanyAdminGetDepartmentUsers200Response
```

Get users within a department

Get users within a department

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_get_department_users_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminGetDepartmentUsersRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminGetDepartmentUsersRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminGetDepartmentUsers($block_iomad_company_admin_get_department_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminGetDepartmentUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_get_department_users_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminGetDepartmentUsersRequest**](../Model/BlockIomadCompanyAdminGetDepartmentUsersRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\BlockIomadCompanyAdminGetDepartmentUsers200Response**](../Model/BlockIomadCompanyAdminGetDepartmentUsers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `blockIomadCompanyAdminGetDepartments()`

```php
blockIomadCompanyAdminGetDepartments($block_iomad_company_admin_get_departments_request): \OpenAPI\Client\Model\BlockIomadCompanyAdminGetDepartments200Response
```

Get all company departments

Get all company departments

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_get_departments_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminGetDepartmentsRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminGetDepartmentsRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminGetDepartments($block_iomad_company_admin_get_departments_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminGetDepartments: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_get_departments_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminGetDepartmentsRequest**](../Model/BlockIomadCompanyAdminGetDepartmentsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\BlockIomadCompanyAdminGetDepartments200Response**](../Model/BlockIomadCompanyAdminGetDepartments200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `blockIomadCompanyAdminGetLicenseFromId()`

```php
blockIomadCompanyAdminGetLicenseFromId($block_iomad_company_admin_get_license_from_id_request): \OpenAPI\Client\Model\BlockIomadCompanyAdminGetLicenseFromId200Response
```

Get licence data give the ID

Get licence data give the ID

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_get_license_from_id_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminGetLicenseFromIdRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminGetLicenseFromIdRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminGetLicenseFromId($block_iomad_company_admin_get_license_from_id_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminGetLicenseFromId: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_get_license_from_id_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminGetLicenseFromIdRequest**](../Model/BlockIomadCompanyAdminGetLicenseFromIdRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\BlockIomadCompanyAdminGetLicenseFromId200Response**](../Model/BlockIomadCompanyAdminGetLicenseFromId200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `blockIomadCompanyAdminGetLicenseInfo()`

```php
blockIomadCompanyAdminGetLicenseInfo($block_iomad_company_admin_get_license_info_request): \OpenAPI\Client\Model\BlockIomadCompanyAdminGetLicenseInfo200Response
```

Get company license information

Get company license information

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_get_license_info_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminGetLicenseInfoRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminGetLicenseInfoRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminGetLicenseInfo($block_iomad_company_admin_get_license_info_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminGetLicenseInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_get_license_info_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminGetLicenseInfoRequest**](../Model/BlockIomadCompanyAdminGetLicenseInfoRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\BlockIomadCompanyAdminGetLicenseInfo200Response**](../Model/BlockIomadCompanyAdminGetLicenseInfo200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `blockIomadCompanyAdminMoveUsers()`

```php
blockIomadCompanyAdminMoveUsers($block_iomad_company_admin_move_users_request): object
```

Move users between departments

Move users between departments

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_move_users_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminMoveUsersRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminMoveUsersRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminMoveUsers($block_iomad_company_admin_move_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminMoveUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_move_users_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminMoveUsersRequest**](../Model/BlockIomadCompanyAdminMoveUsersRequest.md)|  | |

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

## `blockIomadCompanyAdminRestrictCapability()`

```php
blockIomadCompanyAdminRestrictCapability($block_iomad_company_admin_restrict_capability_request): object
```

set/reset Iomad capability

set/reset Iomad capability

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_restrict_capability_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminRestrictCapabilityRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminRestrictCapabilityRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminRestrictCapability($block_iomad_company_admin_restrict_capability_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminRestrictCapability: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_restrict_capability_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminRestrictCapabilityRequest**](../Model/BlockIomadCompanyAdminRestrictCapabilityRequest.md)|  | |

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

## `blockIomadCompanyAdminSyncUsers()`

```php
blockIomadCompanyAdminSyncUsers($block_iomad_company_admin_sync_users_request): \OpenAPI\Client\Model\BlockIomadCompanyAdminSyncUsers200Response
```

Call update users to sync to external system

Call update users to sync to external system

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_sync_users_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminSyncUsersRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminSyncUsersRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminSyncUsers($block_iomad_company_admin_sync_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminSyncUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_sync_users_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminSyncUsersRequest**](../Model/BlockIomadCompanyAdminSyncUsersRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\BlockIomadCompanyAdminSyncUsers200Response**](../Model/BlockIomadCompanyAdminSyncUsers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `blockIomadCompanyAdminUnallocateLicenses()`

```php
blockIomadCompanyAdminUnallocateLicenses($block_iomad_company_admin_unallocate_licenses_request): object
```

Remove course licenses from users

Remove course licenses from users

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_unallocate_licenses_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminUnallocateLicensesRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminUnallocateLicensesRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminUnallocateLicenses($block_iomad_company_admin_unallocate_licenses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminUnallocateLicenses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_unallocate_licenses_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminUnallocateLicensesRequest**](../Model/BlockIomadCompanyAdminUnallocateLicensesRequest.md)|  | |

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

## `blockIomadCompanyAdminUnassignCourses()`

```php
blockIomadCompanyAdminUnassignCourses($block_iomad_company_admin_unassign_courses_request): object
```

Unassign a course from a company

Unassign a course from a company

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_unassign_courses_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminUnassignCoursesRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminUnassignCoursesRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminUnassignCourses($block_iomad_company_admin_unassign_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminUnassignCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_unassign_courses_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminUnassignCoursesRequest**](../Model/BlockIomadCompanyAdminUnassignCoursesRequest.md)|  | |

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

## `blockIomadCompanyAdminUnassignUsers()`

```php
blockIomadCompanyAdminUnassignUsers($block_iomad_company_admin_unassign_users_request): object
```

Unassign users from a company

Unassign users from a company

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_unassign_users_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminUnassignUsersRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminUnassignUsersRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminUnassignUsers($block_iomad_company_admin_unassign_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminUnassignUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_unassign_users_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminUnassignUsersRequest**](../Model/BlockIomadCompanyAdminUnassignUsersRequest.md)|  | |

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

## `blockIomadCompanyAdminUpdateCourses()`

```php
blockIomadCompanyAdminUpdateCourses($block_iomad_company_admin_update_courses_request): object
```

Update Iomad course settings

Update Iomad course settings

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BlockIomadCompanyAdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$block_iomad_company_admin_update_courses_request = new \OpenAPI\Client\Model\BlockIomadCompanyAdminUpdateCoursesRequest(); // \OpenAPI\Client\Model\BlockIomadCompanyAdminUpdateCoursesRequest

try {
    $result = $apiInstance->blockIomadCompanyAdminUpdateCourses($block_iomad_company_admin_update_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockIomadCompanyAdminApi->blockIomadCompanyAdminUpdateCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **block_iomad_company_admin_update_courses_request** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminUpdateCoursesRequest**](../Model/BlockIomadCompanyAdminUpdateCoursesRequest.md)|  | |

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
