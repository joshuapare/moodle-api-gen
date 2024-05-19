# OpenAPI\Client\ModLtiApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modLtiCreateToolProxy()**](ModLtiApi.md#modLtiCreateToolProxy) | **POST** /mod_lti_create_tool_proxy | Create a tool proxy |
| [**modLtiCreateToolType()**](ModLtiApi.md#modLtiCreateToolType) | **POST** /mod_lti_create_tool_type | Create a tool type |
| [**modLtiDeleteCourseToolType()**](ModLtiApi.md#modLtiDeleteCourseToolType) | **POST** /mod_lti_delete_course_tool_type | Delete a course tool type |
| [**modLtiDeleteToolProxy()**](ModLtiApi.md#modLtiDeleteToolProxy) | **POST** /mod_lti_delete_tool_proxy | Delete a tool proxy |
| [**modLtiDeleteToolType()**](ModLtiApi.md#modLtiDeleteToolType) | **POST** /mod_lti_delete_tool_type | Delete a tool type |
| [**modLtiGetLtisByCourses()**](ModLtiApi.md#modLtiGetLtisByCourses) | **POST** /mod_lti_get_ltis_by_courses | Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned. |
| [**modLtiGetToolLaunchData()**](ModLtiApi.md#modLtiGetToolLaunchData) | **POST** /mod_lti_get_tool_launch_data | Return the launch data for a given external tool. |
| [**modLtiGetToolProxies()**](ModLtiApi.md#modLtiGetToolProxies) | **POST** /mod_lti_get_tool_proxies | Get a list of the tool proxies |
| [**modLtiGetToolProxyRegistrationRequest()**](ModLtiApi.md#modLtiGetToolProxyRegistrationRequest) | **POST** /mod_lti_get_tool_proxy_registration_request | Get a registration request for a tool proxy |
| [**modLtiGetToolTypes()**](ModLtiApi.md#modLtiGetToolTypes) | **POST** /mod_lti_get_tool_types | Get a list of the tool types |
| [**modLtiGetToolTypesAndProxies()**](ModLtiApi.md#modLtiGetToolTypesAndProxies) | **POST** /mod_lti_get_tool_types_and_proxies | Get a list of the tool types and tool proxies |
| [**modLtiGetToolTypesAndProxiesCount()**](ModLtiApi.md#modLtiGetToolTypesAndProxiesCount) | **POST** /mod_lti_get_tool_types_and_proxies_count | Get total number of the tool types and tool proxies |
| [**modLtiIsCartridge()**](ModLtiApi.md#modLtiIsCartridge) | **POST** /mod_lti_is_cartridge | Determine if the given url is for a cartridge |
| [**modLtiToggleShowinactivitychooser()**](ModLtiApi.md#modLtiToggleShowinactivitychooser) | **POST** /mod_lti_toggle_showinactivitychooser | Toggle showinactivitychooser for a tool type in a course |
| [**modLtiUpdateToolType()**](ModLtiApi.md#modLtiUpdateToolType) | **POST** /mod_lti_update_tool_type | Update a tool type |
| [**modLtiViewLti()**](ModLtiApi.md#modLtiViewLti) | **POST** /mod_lti_view_lti | Trigger the course module viewed event and update the module completion status. |


## `modLtiCreateToolProxy()`

```php
modLtiCreateToolProxy($mod_lti_create_tool_proxy_request): \OpenAPI\Client\Model\ModLtiCreateToolProxy200Response
```

Create a tool proxy

Create a tool proxy

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLtiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lti_create_tool_proxy_request = new \OpenAPI\Client\Model\ModLtiCreateToolProxyRequest(); // \OpenAPI\Client\Model\ModLtiCreateToolProxyRequest

try {
    $result = $apiInstance->modLtiCreateToolProxy($mod_lti_create_tool_proxy_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLtiApi->modLtiCreateToolProxy: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lti_create_tool_proxy_request** | [**\OpenAPI\Client\Model\ModLtiCreateToolProxyRequest**](../Model/ModLtiCreateToolProxyRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLtiCreateToolProxy200Response**](../Model/ModLtiCreateToolProxy200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLtiCreateToolType()`

```php
modLtiCreateToolType($mod_lti_create_tool_type_request): \OpenAPI\Client\Model\ModLtiCreateToolType200Response
```

Create a tool type

Create a tool type

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLtiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lti_create_tool_type_request = new \OpenAPI\Client\Model\ModLtiCreateToolTypeRequest(); // \OpenAPI\Client\Model\ModLtiCreateToolTypeRequest

try {
    $result = $apiInstance->modLtiCreateToolType($mod_lti_create_tool_type_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLtiApi->modLtiCreateToolType: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lti_create_tool_type_request** | [**\OpenAPI\Client\Model\ModLtiCreateToolTypeRequest**](../Model/ModLtiCreateToolTypeRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLtiCreateToolType200Response**](../Model/ModLtiCreateToolType200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLtiDeleteCourseToolType()`

```php
modLtiDeleteCourseToolType($mod_lti_delete_course_tool_type_request): object
```

Delete a course tool type

Delete a course tool type

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLtiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lti_delete_course_tool_type_request = new \OpenAPI\Client\Model\ModLtiDeleteCourseToolTypeRequest(); // \OpenAPI\Client\Model\ModLtiDeleteCourseToolTypeRequest

try {
    $result = $apiInstance->modLtiDeleteCourseToolType($mod_lti_delete_course_tool_type_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLtiApi->modLtiDeleteCourseToolType: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lti_delete_course_tool_type_request** | [**\OpenAPI\Client\Model\ModLtiDeleteCourseToolTypeRequest**](../Model/ModLtiDeleteCourseToolTypeRequest.md)|  | |

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

## `modLtiDeleteToolProxy()`

```php
modLtiDeleteToolProxy($mod_lti_delete_tool_proxy_request): \OpenAPI\Client\Model\ModLtiDeleteToolProxy200Response
```

Delete a tool proxy

Delete a tool proxy

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLtiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lti_delete_tool_proxy_request = new \OpenAPI\Client\Model\ModLtiDeleteToolProxyRequest(); // \OpenAPI\Client\Model\ModLtiDeleteToolProxyRequest

try {
    $result = $apiInstance->modLtiDeleteToolProxy($mod_lti_delete_tool_proxy_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLtiApi->modLtiDeleteToolProxy: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lti_delete_tool_proxy_request** | [**\OpenAPI\Client\Model\ModLtiDeleteToolProxyRequest**](../Model/ModLtiDeleteToolProxyRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLtiDeleteToolProxy200Response**](../Model/ModLtiDeleteToolProxy200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLtiDeleteToolType()`

```php
modLtiDeleteToolType($mod_lti_delete_tool_type_request): \OpenAPI\Client\Model\ModLtiDeleteToolTypeRequest
```

Delete a tool type

Delete a tool type

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLtiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lti_delete_tool_type_request = new \OpenAPI\Client\Model\ModLtiDeleteToolTypeRequest(); // \OpenAPI\Client\Model\ModLtiDeleteToolTypeRequest

try {
    $result = $apiInstance->modLtiDeleteToolType($mod_lti_delete_tool_type_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLtiApi->modLtiDeleteToolType: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lti_delete_tool_type_request** | [**\OpenAPI\Client\Model\ModLtiDeleteToolTypeRequest**](../Model/ModLtiDeleteToolTypeRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLtiDeleteToolTypeRequest**](../Model/ModLtiDeleteToolTypeRequest.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLtiGetLtisByCourses()`

```php
modLtiGetLtisByCourses($mod_chat_get_chats_by_courses_request): \OpenAPI\Client\Model\ModLtiGetLtisByCourses200Response
```

Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.

Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLtiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_chat_get_chats_by_courses_request = new \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest(); // \OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest

try {
    $result = $apiInstance->modLtiGetLtisByCourses($mod_chat_get_chats_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLtiApi->modLtiGetLtisByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_chat_get_chats_by_courses_request** | [**\OpenAPI\Client\Model\ModChatGetChatsByCoursesRequest**](../Model/ModChatGetChatsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLtiGetLtisByCourses200Response**](../Model/ModLtiGetLtisByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLtiGetToolLaunchData()`

```php
modLtiGetToolLaunchData($mod_lti_get_tool_launch_data_request): \OpenAPI\Client\Model\ModLtiGetToolLaunchData200Response
```

Return the launch data for a given external tool.

Return the launch data for a given external tool.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLtiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lti_get_tool_launch_data_request = new \OpenAPI\Client\Model\ModLtiGetToolLaunchDataRequest(); // \OpenAPI\Client\Model\ModLtiGetToolLaunchDataRequest

try {
    $result = $apiInstance->modLtiGetToolLaunchData($mod_lti_get_tool_launch_data_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLtiApi->modLtiGetToolLaunchData: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lti_get_tool_launch_data_request** | [**\OpenAPI\Client\Model\ModLtiGetToolLaunchDataRequest**](../Model/ModLtiGetToolLaunchDataRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLtiGetToolLaunchData200Response**](../Model/ModLtiGetToolLaunchData200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLtiGetToolProxies()`

```php
modLtiGetToolProxies($mod_lti_get_tool_proxies_request): object
```

Get a list of the tool proxies

Get a list of the tool proxies

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLtiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lti_get_tool_proxies_request = new \OpenAPI\Client\Model\ModLtiGetToolProxiesRequest(); // \OpenAPI\Client\Model\ModLtiGetToolProxiesRequest

try {
    $result = $apiInstance->modLtiGetToolProxies($mod_lti_get_tool_proxies_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLtiApi->modLtiGetToolProxies: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lti_get_tool_proxies_request** | [**\OpenAPI\Client\Model\ModLtiGetToolProxiesRequest**](../Model/ModLtiGetToolProxiesRequest.md)|  | |

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

## `modLtiGetToolProxyRegistrationRequest()`

```php
modLtiGetToolProxyRegistrationRequest($mod_lti_delete_tool_proxy_request): \OpenAPI\Client\Model\ModLtiGetToolProxyRegistrationRequest200Response
```

Get a registration request for a tool proxy

Get a registration request for a tool proxy

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLtiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lti_delete_tool_proxy_request = new \OpenAPI\Client\Model\ModLtiDeleteToolProxyRequest(); // \OpenAPI\Client\Model\ModLtiDeleteToolProxyRequest

try {
    $result = $apiInstance->modLtiGetToolProxyRegistrationRequest($mod_lti_delete_tool_proxy_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLtiApi->modLtiGetToolProxyRegistrationRequest: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lti_delete_tool_proxy_request** | [**\OpenAPI\Client\Model\ModLtiDeleteToolProxyRequest**](../Model/ModLtiDeleteToolProxyRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLtiGetToolProxyRegistrationRequest200Response**](../Model/ModLtiGetToolProxyRegistrationRequest200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLtiGetToolTypes()`

```php
modLtiGetToolTypes($mod_lti_get_tool_types_request): object
```

Get a list of the tool types

Get a list of the tool types

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLtiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lti_get_tool_types_request = new \OpenAPI\Client\Model\ModLtiGetToolTypesRequest(); // \OpenAPI\Client\Model\ModLtiGetToolTypesRequest

try {
    $result = $apiInstance->modLtiGetToolTypes($mod_lti_get_tool_types_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLtiApi->modLtiGetToolTypes: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lti_get_tool_types_request** | [**\OpenAPI\Client\Model\ModLtiGetToolTypesRequest**](../Model/ModLtiGetToolTypesRequest.md)|  | |

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

## `modLtiGetToolTypesAndProxies()`

```php
modLtiGetToolTypesAndProxies($mod_lti_get_tool_types_and_proxies_request): \OpenAPI\Client\Model\ModLtiGetToolTypesAndProxies200Response
```

Get a list of the tool types and tool proxies

Get a list of the tool types and tool proxies

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLtiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lti_get_tool_types_and_proxies_request = new \OpenAPI\Client\Model\ModLtiGetToolTypesAndProxiesRequest(); // \OpenAPI\Client\Model\ModLtiGetToolTypesAndProxiesRequest

try {
    $result = $apiInstance->modLtiGetToolTypesAndProxies($mod_lti_get_tool_types_and_proxies_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLtiApi->modLtiGetToolTypesAndProxies: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lti_get_tool_types_and_proxies_request** | [**\OpenAPI\Client\Model\ModLtiGetToolTypesAndProxiesRequest**](../Model/ModLtiGetToolTypesAndProxiesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLtiGetToolTypesAndProxies200Response**](../Model/ModLtiGetToolTypesAndProxies200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLtiGetToolTypesAndProxiesCount()`

```php
modLtiGetToolTypesAndProxiesCount($mod_lti_get_tool_types_and_proxies_count_request): \OpenAPI\Client\Model\ModLtiGetToolTypesAndProxiesCount200Response
```

Get total number of the tool types and tool proxies

Get total number of the tool types and tool proxies

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLtiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lti_get_tool_types_and_proxies_count_request = new \OpenAPI\Client\Model\ModLtiGetToolTypesAndProxiesCountRequest(); // \OpenAPI\Client\Model\ModLtiGetToolTypesAndProxiesCountRequest

try {
    $result = $apiInstance->modLtiGetToolTypesAndProxiesCount($mod_lti_get_tool_types_and_proxies_count_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLtiApi->modLtiGetToolTypesAndProxiesCount: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lti_get_tool_types_and_proxies_count_request** | [**\OpenAPI\Client\Model\ModLtiGetToolTypesAndProxiesCountRequest**](../Model/ModLtiGetToolTypesAndProxiesCountRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLtiGetToolTypesAndProxiesCount200Response**](../Model/ModLtiGetToolTypesAndProxiesCount200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLtiIsCartridge()`

```php
modLtiIsCartridge($mod_lti_is_cartridge_request): \OpenAPI\Client\Model\ModLtiIsCartridge200Response
```

Determine if the given url is for a cartridge

Determine if the given url is for a cartridge

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLtiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lti_is_cartridge_request = new \OpenAPI\Client\Model\ModLtiIsCartridgeRequest(); // \OpenAPI\Client\Model\ModLtiIsCartridgeRequest

try {
    $result = $apiInstance->modLtiIsCartridge($mod_lti_is_cartridge_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLtiApi->modLtiIsCartridge: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lti_is_cartridge_request** | [**\OpenAPI\Client\Model\ModLtiIsCartridgeRequest**](../Model/ModLtiIsCartridgeRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLtiIsCartridge200Response**](../Model/ModLtiIsCartridge200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLtiToggleShowinactivitychooser()`

```php
modLtiToggleShowinactivitychooser($mod_lti_toggle_showinactivitychooser_request): object
```

Toggle showinactivitychooser for a tool type in a course

Toggle showinactivitychooser for a tool type in a course

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLtiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lti_toggle_showinactivitychooser_request = new \OpenAPI\Client\Model\ModLtiToggleShowinactivitychooserRequest(); // \OpenAPI\Client\Model\ModLtiToggleShowinactivitychooserRequest

try {
    $result = $apiInstance->modLtiToggleShowinactivitychooser($mod_lti_toggle_showinactivitychooser_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLtiApi->modLtiToggleShowinactivitychooser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lti_toggle_showinactivitychooser_request** | [**\OpenAPI\Client\Model\ModLtiToggleShowinactivitychooserRequest**](../Model/ModLtiToggleShowinactivitychooserRequest.md)|  | |

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

## `modLtiUpdateToolType()`

```php
modLtiUpdateToolType($mod_lti_update_tool_type_request): \OpenAPI\Client\Model\ModLtiUpdateToolType200Response
```

Update a tool type

Update a tool type

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModLtiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lti_update_tool_type_request = new \OpenAPI\Client\Model\ModLtiUpdateToolTypeRequest(); // \OpenAPI\Client\Model\ModLtiUpdateToolTypeRequest

try {
    $result = $apiInstance->modLtiUpdateToolType($mod_lti_update_tool_type_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLtiApi->modLtiUpdateToolType: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lti_update_tool_type_request** | [**\OpenAPI\Client\Model\ModLtiUpdateToolTypeRequest**](../Model/ModLtiUpdateToolTypeRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModLtiUpdateToolType200Response**](../Model/ModLtiUpdateToolType200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modLtiViewLti()`

```php
modLtiViewLti($mod_lti_view_lti_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
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


$apiInstance = new OpenAPI\Client\Api\ModLtiApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_lti_view_lti_request = new \OpenAPI\Client\Model\ModLtiViewLtiRequest(); // \OpenAPI\Client\Model\ModLtiViewLtiRequest

try {
    $result = $apiInstance->modLtiViewLti($mod_lti_view_lti_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModLtiApi->modLtiViewLti: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_lti_view_lti_request** | [**\OpenAPI\Client\Model\ModLtiViewLtiRequest**](../Model/ModLtiViewLtiRequest.md)|  | |

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
