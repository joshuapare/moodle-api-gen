# OpenAPI\Client\ToolLpApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**toolLpDataForCompetenciesManagePage()**](ToolLpApi.md#toolLpDataForCompetenciesManagePage) | **POST** /tool_lp_data_for_competencies_manage_page | Load the data for the competencies manage page template |
| [**toolLpDataForCompetencyFrameworksManagePage()**](ToolLpApi.md#toolLpDataForCompetencyFrameworksManagePage) | **POST** /tool_lp_data_for_competency_frameworks_manage_page | Load the data for the competency frameworks manage page template |
| [**toolLpDataForCompetencySummary()**](ToolLpApi.md#toolLpDataForCompetencySummary) | **POST** /tool_lp_data_for_competency_summary | Load competency data for summary template. |
| [**toolLpDataForCourseCompetenciesPage()**](ToolLpApi.md#toolLpDataForCourseCompetenciesPage) | **POST** /tool_lp_data_for_course_competencies_page | Load the data for the course competencies page template. |
| [**toolLpDataForPlanPage()**](ToolLpApi.md#toolLpDataForPlanPage) | **POST** /tool_lp_data_for_plan_page | Load the data for the plan page template. |
| [**toolLpDataForPlansPage()**](ToolLpApi.md#toolLpDataForPlansPage) | **POST** /tool_lp_data_for_plans_page | Load the data for the plans page template |
| [**toolLpDataForRelatedCompetenciesSection()**](ToolLpApi.md#toolLpDataForRelatedCompetenciesSection) | **POST** /tool_lp_data_for_related_competencies_section | Load the data for the related competencies template. |
| [**toolLpDataForTemplateCompetenciesPage()**](ToolLpApi.md#toolLpDataForTemplateCompetenciesPage) | **POST** /tool_lp_data_for_template_competencies_page | Load the data for the template competencies page template. |
| [**toolLpDataForTemplatesManagePage()**](ToolLpApi.md#toolLpDataForTemplatesManagePage) | **POST** /tool_lp_data_for_templates_manage_page | Load the data for the learning plan templates manage page template |
| [**toolLpDataForUserCompetencySummary()**](ToolLpApi.md#toolLpDataForUserCompetencySummary) | **POST** /tool_lp_data_for_user_competency_summary | Load a summary of a user competency. |
| [**toolLpDataForUserCompetencySummaryInCourse()**](ToolLpApi.md#toolLpDataForUserCompetencySummaryInCourse) | **POST** /tool_lp_data_for_user_competency_summary_in_course | Load a summary of a user competency. |
| [**toolLpDataForUserCompetencySummaryInPlan()**](ToolLpApi.md#toolLpDataForUserCompetencySummaryInPlan) | **POST** /tool_lp_data_for_user_competency_summary_in_plan | Load a summary of a user competency. |
| [**toolLpDataForUserEvidenceListPage()**](ToolLpApi.md#toolLpDataForUserEvidenceListPage) | **POST** /tool_lp_data_for_user_evidence_list_page | Load the data for the user evidence list page template |
| [**toolLpDataForUserEvidencePage()**](ToolLpApi.md#toolLpDataForUserEvidencePage) | **POST** /tool_lp_data_for_user_evidence_page | Load the data for the user evidence page template |
| [**toolLpListCoursesUsingCompetency()**](ToolLpApi.md#toolLpListCoursesUsingCompetency) | **POST** /tool_lp_list_courses_using_competency | List the courses using a competency |
| [**toolLpSearchCohorts()**](ToolLpApi.md#toolLpSearchCohorts) | **POST** /tool_lp_search_cohorts | Search for cohorts. This method is deprecated, please call &#39;core_cohort_search_cohorts&#39; instead |
| [**toolLpSearchUsers()**](ToolLpApi.md#toolLpSearchUsers) | **POST** /tool_lp_search_users | Search for users. |


## `toolLpDataForCompetenciesManagePage()`

```php
toolLpDataForCompetenciesManagePage($tool_lp_data_for_competencies_manage_page_request): \OpenAPI\Client\Model\ToolLpDataForCompetenciesManagePage200Response
```

Load the data for the competencies manage page template

Load the data for the competencies manage page template

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolLpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_lp_data_for_competencies_manage_page_request = new \OpenAPI\Client\Model\ToolLpDataForCompetenciesManagePageRequest(); // \OpenAPI\Client\Model\ToolLpDataForCompetenciesManagePageRequest

try {
    $result = $apiInstance->toolLpDataForCompetenciesManagePage($tool_lp_data_for_competencies_manage_page_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolLpApi->toolLpDataForCompetenciesManagePage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_lp_data_for_competencies_manage_page_request** | [**\OpenAPI\Client\Model\ToolLpDataForCompetenciesManagePageRequest**](../Model/ToolLpDataForCompetenciesManagePageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolLpDataForCompetenciesManagePage200Response**](../Model/ToolLpDataForCompetenciesManagePage200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolLpDataForCompetencyFrameworksManagePage()`

```php
toolLpDataForCompetencyFrameworksManagePage($tool_lp_data_for_competency_frameworks_manage_page_request): \OpenAPI\Client\Model\ToolLpDataForCompetencyFrameworksManagePage200Response
```

Load the data for the competency frameworks manage page template

Load the data for the competency frameworks manage page template

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolLpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_lp_data_for_competency_frameworks_manage_page_request = new \OpenAPI\Client\Model\ToolLpDataForCompetencyFrameworksManagePageRequest(); // \OpenAPI\Client\Model\ToolLpDataForCompetencyFrameworksManagePageRequest

try {
    $result = $apiInstance->toolLpDataForCompetencyFrameworksManagePage($tool_lp_data_for_competency_frameworks_manage_page_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolLpApi->toolLpDataForCompetencyFrameworksManagePage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_lp_data_for_competency_frameworks_manage_page_request** | [**\OpenAPI\Client\Model\ToolLpDataForCompetencyFrameworksManagePageRequest**](../Model/ToolLpDataForCompetencyFrameworksManagePageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolLpDataForCompetencyFrameworksManagePage200Response**](../Model/ToolLpDataForCompetencyFrameworksManagePage200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolLpDataForCompetencySummary()`

```php
toolLpDataForCompetencySummary($tool_lp_data_for_competency_summary_request): \OpenAPI\Client\Model\ToolLpDataForCompetencySummary200Response
```

Load competency data for summary template.

Load competency data for summary template.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolLpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_lp_data_for_competency_summary_request = new \OpenAPI\Client\Model\ToolLpDataForCompetencySummaryRequest(); // \OpenAPI\Client\Model\ToolLpDataForCompetencySummaryRequest

try {
    $result = $apiInstance->toolLpDataForCompetencySummary($tool_lp_data_for_competency_summary_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolLpApi->toolLpDataForCompetencySummary: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_lp_data_for_competency_summary_request** | [**\OpenAPI\Client\Model\ToolLpDataForCompetencySummaryRequest**](../Model/ToolLpDataForCompetencySummaryRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolLpDataForCompetencySummary200Response**](../Model/ToolLpDataForCompetencySummary200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolLpDataForCourseCompetenciesPage()`

```php
toolLpDataForCourseCompetenciesPage($tool_lp_data_for_course_competencies_page_request): \OpenAPI\Client\Model\ToolLpDataForCourseCompetenciesPage200Response
```

Load the data for the course competencies page template.

Load the data for the course competencies page template.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolLpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_lp_data_for_course_competencies_page_request = new \OpenAPI\Client\Model\ToolLpDataForCourseCompetenciesPageRequest(); // \OpenAPI\Client\Model\ToolLpDataForCourseCompetenciesPageRequest

try {
    $result = $apiInstance->toolLpDataForCourseCompetenciesPage($tool_lp_data_for_course_competencies_page_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolLpApi->toolLpDataForCourseCompetenciesPage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_lp_data_for_course_competencies_page_request** | [**\OpenAPI\Client\Model\ToolLpDataForCourseCompetenciesPageRequest**](../Model/ToolLpDataForCourseCompetenciesPageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolLpDataForCourseCompetenciesPage200Response**](../Model/ToolLpDataForCourseCompetenciesPage200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolLpDataForPlanPage()`

```php
toolLpDataForPlanPage($core_competency_complete_plan_request): \OpenAPI\Client\Model\ToolLpDataForPlanPage200Response
```

Load the data for the plan page template.

Load the data for the plan page template.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolLpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_complete_plan_request = new \OpenAPI\Client\Model\CoreCompetencyCompletePlanRequest(); // \OpenAPI\Client\Model\CoreCompetencyCompletePlanRequest

try {
    $result = $apiInstance->toolLpDataForPlanPage($core_competency_complete_plan_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolLpApi->toolLpDataForPlanPage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_complete_plan_request** | [**\OpenAPI\Client\Model\CoreCompetencyCompletePlanRequest**](../Model/CoreCompetencyCompletePlanRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolLpDataForPlanPage200Response**](../Model/ToolLpDataForPlanPage200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolLpDataForPlansPage()`

```php
toolLpDataForPlansPage($tool_lp_data_for_plans_page_request): \OpenAPI\Client\Model\ToolLpDataForPlansPage200Response
```

Load the data for the plans page template

Load the data for the plans page template

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolLpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_lp_data_for_plans_page_request = new \OpenAPI\Client\Model\ToolLpDataForPlansPageRequest(); // \OpenAPI\Client\Model\ToolLpDataForPlansPageRequest

try {
    $result = $apiInstance->toolLpDataForPlansPage($tool_lp_data_for_plans_page_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolLpApi->toolLpDataForPlansPage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_lp_data_for_plans_page_request** | [**\OpenAPI\Client\Model\ToolLpDataForPlansPageRequest**](../Model/ToolLpDataForPlansPageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolLpDataForPlansPage200Response**](../Model/ToolLpDataForPlansPage200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolLpDataForRelatedCompetenciesSection()`

```php
toolLpDataForRelatedCompetenciesSection($tool_lp_data_for_related_competencies_section_request): \OpenAPI\Client\Model\ToolLpDataForRelatedCompetenciesSection200Response
```

Load the data for the related competencies template.

Load the data for the related competencies template.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolLpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_lp_data_for_related_competencies_section_request = new \OpenAPI\Client\Model\ToolLpDataForRelatedCompetenciesSectionRequest(); // \OpenAPI\Client\Model\ToolLpDataForRelatedCompetenciesSectionRequest

try {
    $result = $apiInstance->toolLpDataForRelatedCompetenciesSection($tool_lp_data_for_related_competencies_section_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolLpApi->toolLpDataForRelatedCompetenciesSection: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_lp_data_for_related_competencies_section_request** | [**\OpenAPI\Client\Model\ToolLpDataForRelatedCompetenciesSectionRequest**](../Model/ToolLpDataForRelatedCompetenciesSectionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolLpDataForRelatedCompetenciesSection200Response**](../Model/ToolLpDataForRelatedCompetenciesSection200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolLpDataForTemplateCompetenciesPage()`

```php
toolLpDataForTemplateCompetenciesPage($tool_lp_data_for_template_competencies_page_request): \OpenAPI\Client\Model\ToolLpDataForTemplateCompetenciesPage200Response
```

Load the data for the template competencies page template.

Load the data for the template competencies page template.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolLpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_lp_data_for_template_competencies_page_request = new \OpenAPI\Client\Model\ToolLpDataForTemplateCompetenciesPageRequest(); // \OpenAPI\Client\Model\ToolLpDataForTemplateCompetenciesPageRequest

try {
    $result = $apiInstance->toolLpDataForTemplateCompetenciesPage($tool_lp_data_for_template_competencies_page_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolLpApi->toolLpDataForTemplateCompetenciesPage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_lp_data_for_template_competencies_page_request** | [**\OpenAPI\Client\Model\ToolLpDataForTemplateCompetenciesPageRequest**](../Model/ToolLpDataForTemplateCompetenciesPageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolLpDataForTemplateCompetenciesPage200Response**](../Model/ToolLpDataForTemplateCompetenciesPage200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolLpDataForTemplatesManagePage()`

```php
toolLpDataForTemplatesManagePage($tool_lp_data_for_competency_frameworks_manage_page_request): \OpenAPI\Client\Model\ToolLpDataForTemplatesManagePage200Response
```

Load the data for the learning plan templates manage page template

Load the data for the learning plan templates manage page template

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolLpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_lp_data_for_competency_frameworks_manage_page_request = new \OpenAPI\Client\Model\ToolLpDataForCompetencyFrameworksManagePageRequest(); // \OpenAPI\Client\Model\ToolLpDataForCompetencyFrameworksManagePageRequest

try {
    $result = $apiInstance->toolLpDataForTemplatesManagePage($tool_lp_data_for_competency_frameworks_manage_page_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolLpApi->toolLpDataForTemplatesManagePage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_lp_data_for_competency_frameworks_manage_page_request** | [**\OpenAPI\Client\Model\ToolLpDataForCompetencyFrameworksManagePageRequest**](../Model/ToolLpDataForCompetencyFrameworksManagePageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolLpDataForTemplatesManagePage200Response**](../Model/ToolLpDataForTemplatesManagePage200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolLpDataForUserCompetencySummary()`

```php
toolLpDataForUserCompetencySummary($tool_lp_data_for_user_competency_summary_request): \OpenAPI\Client\Model\ToolLpDataForUserCompetencySummary200Response
```

Load a summary of a user competency.

Load a summary of a user competency.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolLpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_lp_data_for_user_competency_summary_request = new \OpenAPI\Client\Model\ToolLpDataForUserCompetencySummaryRequest(); // \OpenAPI\Client\Model\ToolLpDataForUserCompetencySummaryRequest

try {
    $result = $apiInstance->toolLpDataForUserCompetencySummary($tool_lp_data_for_user_competency_summary_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolLpApi->toolLpDataForUserCompetencySummary: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_lp_data_for_user_competency_summary_request** | [**\OpenAPI\Client\Model\ToolLpDataForUserCompetencySummaryRequest**](../Model/ToolLpDataForUserCompetencySummaryRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolLpDataForUserCompetencySummary200Response**](../Model/ToolLpDataForUserCompetencySummary200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolLpDataForUserCompetencySummaryInCourse()`

```php
toolLpDataForUserCompetencySummaryInCourse($tool_lp_data_for_user_competency_summary_in_course_request): \OpenAPI\Client\Model\ToolLpDataForUserCompetencySummaryInCourse200Response
```

Load a summary of a user competency.

Load a summary of a user competency.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolLpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_lp_data_for_user_competency_summary_in_course_request = new \OpenAPI\Client\Model\ToolLpDataForUserCompetencySummaryInCourseRequest(); // \OpenAPI\Client\Model\ToolLpDataForUserCompetencySummaryInCourseRequest

try {
    $result = $apiInstance->toolLpDataForUserCompetencySummaryInCourse($tool_lp_data_for_user_competency_summary_in_course_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolLpApi->toolLpDataForUserCompetencySummaryInCourse: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_lp_data_for_user_competency_summary_in_course_request** | [**\OpenAPI\Client\Model\ToolLpDataForUserCompetencySummaryInCourseRequest**](../Model/ToolLpDataForUserCompetencySummaryInCourseRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolLpDataForUserCompetencySummaryInCourse200Response**](../Model/ToolLpDataForUserCompetencySummaryInCourse200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolLpDataForUserCompetencySummaryInPlan()`

```php
toolLpDataForUserCompetencySummaryInPlan($tool_lp_data_for_user_competency_summary_in_plan_request): \OpenAPI\Client\Model\ToolLpDataForUserCompetencySummaryInPlan200Response
```

Load a summary of a user competency.

Load a summary of a user competency.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolLpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_lp_data_for_user_competency_summary_in_plan_request = new \OpenAPI\Client\Model\ToolLpDataForUserCompetencySummaryInPlanRequest(); // \OpenAPI\Client\Model\ToolLpDataForUserCompetencySummaryInPlanRequest

try {
    $result = $apiInstance->toolLpDataForUserCompetencySummaryInPlan($tool_lp_data_for_user_competency_summary_in_plan_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolLpApi->toolLpDataForUserCompetencySummaryInPlan: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_lp_data_for_user_competency_summary_in_plan_request** | [**\OpenAPI\Client\Model\ToolLpDataForUserCompetencySummaryInPlanRequest**](../Model/ToolLpDataForUserCompetencySummaryInPlanRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolLpDataForUserCompetencySummaryInPlan200Response**](../Model/ToolLpDataForUserCompetencySummaryInPlan200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolLpDataForUserEvidenceListPage()`

```php
toolLpDataForUserEvidenceListPage($tool_lp_data_for_user_evidence_list_page_request): \OpenAPI\Client\Model\ToolLpDataForUserEvidenceListPage200Response
```

Load the data for the user evidence list page template

Load the data for the user evidence list page template

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolLpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_lp_data_for_user_evidence_list_page_request = new \OpenAPI\Client\Model\ToolLpDataForUserEvidenceListPageRequest(); // \OpenAPI\Client\Model\ToolLpDataForUserEvidenceListPageRequest

try {
    $result = $apiInstance->toolLpDataForUserEvidenceListPage($tool_lp_data_for_user_evidence_list_page_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolLpApi->toolLpDataForUserEvidenceListPage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_lp_data_for_user_evidence_list_page_request** | [**\OpenAPI\Client\Model\ToolLpDataForUserEvidenceListPageRequest**](../Model/ToolLpDataForUserEvidenceListPageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolLpDataForUserEvidenceListPage200Response**](../Model/ToolLpDataForUserEvidenceListPage200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolLpDataForUserEvidencePage()`

```php
toolLpDataForUserEvidencePage($tool_lp_data_for_user_evidence_page_request): \OpenAPI\Client\Model\ToolLpDataForUserEvidencePage200Response
```

Load the data for the user evidence page template

Load the data for the user evidence page template

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolLpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_lp_data_for_user_evidence_page_request = new \OpenAPI\Client\Model\ToolLpDataForUserEvidencePageRequest(); // \OpenAPI\Client\Model\ToolLpDataForUserEvidencePageRequest

try {
    $result = $apiInstance->toolLpDataForUserEvidencePage($tool_lp_data_for_user_evidence_page_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolLpApi->toolLpDataForUserEvidencePage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_lp_data_for_user_evidence_page_request** | [**\OpenAPI\Client\Model\ToolLpDataForUserEvidencePageRequest**](../Model/ToolLpDataForUserEvidencePageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolLpDataForUserEvidencePage200Response**](../Model/ToolLpDataForUserEvidencePage200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolLpListCoursesUsingCompetency()`

```php
toolLpListCoursesUsingCompetency($core_competency_competency_viewed_request): object
```

List the courses using a competency

List the courses using a competency

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolLpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_competency_viewed_request = new \OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest(); // \OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest

try {
    $result = $apiInstance->toolLpListCoursesUsingCompetency($core_competency_competency_viewed_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolLpApi->toolLpListCoursesUsingCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_competency_viewed_request** | [**\OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest**](../Model/CoreCompetencyCompetencyViewedRequest.md)|  | |

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

## `toolLpSearchCohorts()`

```php
toolLpSearchCohorts($tool_lp_search_cohorts_request): \OpenAPI\Client\Model\ToolLpSearchCohorts200Response
```

Search for cohorts. This method is deprecated, please call 'core_cohort_search_cohorts' instead

Search for cohorts. This method is deprecated, please call 'core_cohort_search_cohorts' instead

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolLpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_lp_search_cohorts_request = new \OpenAPI\Client\Model\ToolLpSearchCohortsRequest(); // \OpenAPI\Client\Model\ToolLpSearchCohortsRequest

try {
    $result = $apiInstance->toolLpSearchCohorts($tool_lp_search_cohorts_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolLpApi->toolLpSearchCohorts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_lp_search_cohorts_request** | [**\OpenAPI\Client\Model\ToolLpSearchCohortsRequest**](../Model/ToolLpSearchCohortsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolLpSearchCohorts200Response**](../Model/ToolLpSearchCohorts200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `toolLpSearchUsers()`

```php
toolLpSearchUsers($tool_lp_search_users_request): \OpenAPI\Client\Model\ToolLpSearchUsers200Response
```

Search for users.

Search for users.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ToolLpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tool_lp_search_users_request = new \OpenAPI\Client\Model\ToolLpSearchUsersRequest(); // \OpenAPI\Client\Model\ToolLpSearchUsersRequest

try {
    $result = $apiInstance->toolLpSearchUsers($tool_lp_search_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ToolLpApi->toolLpSearchUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tool_lp_search_users_request** | [**\OpenAPI\Client\Model\ToolLpSearchUsersRequest**](../Model/ToolLpSearchUsersRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ToolLpSearchUsers200Response**](../Model/ToolLpSearchUsers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
