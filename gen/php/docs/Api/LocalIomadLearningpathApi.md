# OpenAPI\Client\LocalIomadLearningpathApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**localIomadLearningpathActivate()**](LocalIomadLearningpathApi.md#localIomadLearningpathActivate) | **POST** /local_iomad_learningpath_activate | Activates / deactivates learning path |
| [**localIomadLearningpathAddcourses()**](LocalIomadLearningpathApi.md#localIomadLearningpathAddcourses) | **POST** /local_iomad_learningpath_addcourses | Add courses to learning path |
| [**localIomadLearningpathAddusers()**](LocalIomadLearningpathApi.md#localIomadLearningpathAddusers) | **POST** /local_iomad_learningpath_addusers | Add users to learning path |
| [**localIomadLearningpathCopypath()**](LocalIomadLearningpathApi.md#localIomadLearningpathCopypath) | **POST** /local_iomad_learningpath_copypath | Copy a learning path |
| [**localIomadLearningpathDeletepath()**](LocalIomadLearningpathApi.md#localIomadLearningpathDeletepath) | **POST** /local_iomad_learningpath_deletepath | Completely delete a learning path |
| [**localIomadLearningpathGetcourses()**](LocalIomadLearningpathApi.md#localIomadLearningpathGetcourses) | **POST** /local_iomad_learningpath_getcourses | Read list of courses for given learning |
| [**localIomadLearningpathGetprospectivecourses()**](LocalIomadLearningpathApi.md#localIomadLearningpathGetprospectivecourses) | **POST** /local_iomad_learningpath_getprospectivecourses | Read set of filtered courses for given company |
| [**localIomadLearningpathGetprospectiveusers()**](LocalIomadLearningpathApi.md#localIomadLearningpathGetprospectiveusers) | **POST** /local_iomad_learningpath_getprospectiveusers | Get set of filtered users for given company |
| [**localIomadLearningpathGetusers()**](LocalIomadLearningpathApi.md#localIomadLearningpathGetusers) | **POST** /local_iomad_learningpath_getusers | Get users assigned to path |
| [**localIomadLearningpathOrdercourses()**](LocalIomadLearningpathApi.md#localIomadLearningpathOrdercourses) | **POST** /local_iomad_learningpath_ordercourses | Set sequence of courses in learning path |
| [**localIomadLearningpathRemovecourses()**](LocalIomadLearningpathApi.md#localIomadLearningpathRemovecourses) | **POST** /local_iomad_learningpath_removecourses | Remove courses from learning path |
| [**localIomadLearningpathRemoveusers()**](LocalIomadLearningpathApi.md#localIomadLearningpathRemoveusers) | **POST** /local_iomad_learningpath_removeusers | Remove users from learning path |


## `localIomadLearningpathActivate()`

```php
localIomadLearningpathActivate($local_iomad_learningpath_activate_request): object
```

Activates / deactivates learning path

Activates / deactivates learning path

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\LocalIomadLearningpathApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$local_iomad_learningpath_activate_request = new \OpenAPI\Client\Model\LocalIomadLearningpathActivateRequest(); // \OpenAPI\Client\Model\LocalIomadLearningpathActivateRequest

try {
    $result = $apiInstance->localIomadLearningpathActivate($local_iomad_learningpath_activate_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LocalIomadLearningpathApi->localIomadLearningpathActivate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **local_iomad_learningpath_activate_request** | [**\OpenAPI\Client\Model\LocalIomadLearningpathActivateRequest**](../Model/LocalIomadLearningpathActivateRequest.md)|  | |

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

## `localIomadLearningpathAddcourses()`

```php
localIomadLearningpathAddcourses($local_iomad_learningpath_addcourses_request): object
```

Add courses to learning path

Add courses to learning path

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\LocalIomadLearningpathApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$local_iomad_learningpath_addcourses_request = new \OpenAPI\Client\Model\LocalIomadLearningpathAddcoursesRequest(); // \OpenAPI\Client\Model\LocalIomadLearningpathAddcoursesRequest

try {
    $result = $apiInstance->localIomadLearningpathAddcourses($local_iomad_learningpath_addcourses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LocalIomadLearningpathApi->localIomadLearningpathAddcourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **local_iomad_learningpath_addcourses_request** | [**\OpenAPI\Client\Model\LocalIomadLearningpathAddcoursesRequest**](../Model/LocalIomadLearningpathAddcoursesRequest.md)|  | |

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

## `localIomadLearningpathAddusers()`

```php
localIomadLearningpathAddusers($local_iomad_learningpath_addusers_request): object
```

Add users to learning path

Add users to learning path

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\LocalIomadLearningpathApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$local_iomad_learningpath_addusers_request = new \OpenAPI\Client\Model\LocalIomadLearningpathAddusersRequest(); // \OpenAPI\Client\Model\LocalIomadLearningpathAddusersRequest

try {
    $result = $apiInstance->localIomadLearningpathAddusers($local_iomad_learningpath_addusers_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LocalIomadLearningpathApi->localIomadLearningpathAddusers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **local_iomad_learningpath_addusers_request** | [**\OpenAPI\Client\Model\LocalIomadLearningpathAddusersRequest**](../Model/LocalIomadLearningpathAddusersRequest.md)|  | |

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

## `localIomadLearningpathCopypath()`

```php
localIomadLearningpathCopypath($local_iomad_learningpath_copypath_request): object
```

Copy a learning path

Copy a learning path

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\LocalIomadLearningpathApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$local_iomad_learningpath_copypath_request = new \OpenAPI\Client\Model\LocalIomadLearningpathCopypathRequest(); // \OpenAPI\Client\Model\LocalIomadLearningpathCopypathRequest

try {
    $result = $apiInstance->localIomadLearningpathCopypath($local_iomad_learningpath_copypath_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LocalIomadLearningpathApi->localIomadLearningpathCopypath: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **local_iomad_learningpath_copypath_request** | [**\OpenAPI\Client\Model\LocalIomadLearningpathCopypathRequest**](../Model/LocalIomadLearningpathCopypathRequest.md)|  | |

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

## `localIomadLearningpathDeletepath()`

```php
localIomadLearningpathDeletepath($local_iomad_learningpath_copypath_request): object
```

Completely delete a learning path

Completely delete a learning path

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\LocalIomadLearningpathApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$local_iomad_learningpath_copypath_request = new \OpenAPI\Client\Model\LocalIomadLearningpathCopypathRequest(); // \OpenAPI\Client\Model\LocalIomadLearningpathCopypathRequest

try {
    $result = $apiInstance->localIomadLearningpathDeletepath($local_iomad_learningpath_copypath_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LocalIomadLearningpathApi->localIomadLearningpathDeletepath: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **local_iomad_learningpath_copypath_request** | [**\OpenAPI\Client\Model\LocalIomadLearningpathCopypathRequest**](../Model/LocalIomadLearningpathCopypathRequest.md)|  | |

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

## `localIomadLearningpathGetcourses()`

```php
localIomadLearningpathGetcourses($local_iomad_learningpath_getcourses_request): object
```

Read list of courses for given learning

Read list of courses for given learning

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\LocalIomadLearningpathApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$local_iomad_learningpath_getcourses_request = new \OpenAPI\Client\Model\LocalIomadLearningpathGetcoursesRequest(); // \OpenAPI\Client\Model\LocalIomadLearningpathGetcoursesRequest

try {
    $result = $apiInstance->localIomadLearningpathGetcourses($local_iomad_learningpath_getcourses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LocalIomadLearningpathApi->localIomadLearningpathGetcourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **local_iomad_learningpath_getcourses_request** | [**\OpenAPI\Client\Model\LocalIomadLearningpathGetcoursesRequest**](../Model/LocalIomadLearningpathGetcoursesRequest.md)|  | |

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

## `localIomadLearningpathGetprospectivecourses()`

```php
localIomadLearningpathGetprospectivecourses($local_iomad_learningpath_getprospectivecourses_request): object
```

Read set of filtered courses for given company

Read set of filtered courses for given company

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\LocalIomadLearningpathApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$local_iomad_learningpath_getprospectivecourses_request = new \OpenAPI\Client\Model\LocalIomadLearningpathGetprospectivecoursesRequest(); // \OpenAPI\Client\Model\LocalIomadLearningpathGetprospectivecoursesRequest

try {
    $result = $apiInstance->localIomadLearningpathGetprospectivecourses($local_iomad_learningpath_getprospectivecourses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LocalIomadLearningpathApi->localIomadLearningpathGetprospectivecourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **local_iomad_learningpath_getprospectivecourses_request** | [**\OpenAPI\Client\Model\LocalIomadLearningpathGetprospectivecoursesRequest**](../Model/LocalIomadLearningpathGetprospectivecoursesRequest.md)|  | |

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

## `localIomadLearningpathGetprospectiveusers()`

```php
localIomadLearningpathGetprospectiveusers($local_iomad_learningpath_getprospectiveusers_request): object
```

Get set of filtered users for given company

Get set of filtered users for given company

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\LocalIomadLearningpathApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$local_iomad_learningpath_getprospectiveusers_request = new \OpenAPI\Client\Model\LocalIomadLearningpathGetprospectiveusersRequest(); // \OpenAPI\Client\Model\LocalIomadLearningpathGetprospectiveusersRequest

try {
    $result = $apiInstance->localIomadLearningpathGetprospectiveusers($local_iomad_learningpath_getprospectiveusers_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LocalIomadLearningpathApi->localIomadLearningpathGetprospectiveusers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **local_iomad_learningpath_getprospectiveusers_request** | [**\OpenAPI\Client\Model\LocalIomadLearningpathGetprospectiveusersRequest**](../Model/LocalIomadLearningpathGetprospectiveusersRequest.md)|  | |

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

## `localIomadLearningpathGetusers()`

```php
localIomadLearningpathGetusers($local_iomad_learningpath_getusers_request): object
```

Get users assigned to path

Get users assigned to path

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\LocalIomadLearningpathApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$local_iomad_learningpath_getusers_request = new \OpenAPI\Client\Model\LocalIomadLearningpathGetusersRequest(); // \OpenAPI\Client\Model\LocalIomadLearningpathGetusersRequest

try {
    $result = $apiInstance->localIomadLearningpathGetusers($local_iomad_learningpath_getusers_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LocalIomadLearningpathApi->localIomadLearningpathGetusers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **local_iomad_learningpath_getusers_request** | [**\OpenAPI\Client\Model\LocalIomadLearningpathGetusersRequest**](../Model/LocalIomadLearningpathGetusersRequest.md)|  | |

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

## `localIomadLearningpathOrdercourses()`

```php
localIomadLearningpathOrdercourses($local_iomad_learningpath_ordercourses_request): object
```

Set sequence of courses in learning path

Set sequence of courses in learning path

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\LocalIomadLearningpathApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$local_iomad_learningpath_ordercourses_request = new \OpenAPI\Client\Model\LocalIomadLearningpathOrdercoursesRequest(); // \OpenAPI\Client\Model\LocalIomadLearningpathOrdercoursesRequest

try {
    $result = $apiInstance->localIomadLearningpathOrdercourses($local_iomad_learningpath_ordercourses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LocalIomadLearningpathApi->localIomadLearningpathOrdercourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **local_iomad_learningpath_ordercourses_request** | [**\OpenAPI\Client\Model\LocalIomadLearningpathOrdercoursesRequest**](../Model/LocalIomadLearningpathOrdercoursesRequest.md)|  | |

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

## `localIomadLearningpathRemovecourses()`

```php
localIomadLearningpathRemovecourses($local_iomad_learningpath_removecourses_request): object
```

Remove courses from learning path

Remove courses from learning path

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\LocalIomadLearningpathApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$local_iomad_learningpath_removecourses_request = new \OpenAPI\Client\Model\LocalIomadLearningpathRemovecoursesRequest(); // \OpenAPI\Client\Model\LocalIomadLearningpathRemovecoursesRequest

try {
    $result = $apiInstance->localIomadLearningpathRemovecourses($local_iomad_learningpath_removecourses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LocalIomadLearningpathApi->localIomadLearningpathRemovecourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **local_iomad_learningpath_removecourses_request** | [**\OpenAPI\Client\Model\LocalIomadLearningpathRemovecoursesRequest**](../Model/LocalIomadLearningpathRemovecoursesRequest.md)|  | |

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

## `localIomadLearningpathRemoveusers()`

```php
localIomadLearningpathRemoveusers($local_iomad_learningpath_removeusers_request): object
```

Remove users from learning path

Remove users from learning path

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\LocalIomadLearningpathApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$local_iomad_learningpath_removeusers_request = new \OpenAPI\Client\Model\LocalIomadLearningpathRemoveusersRequest(); // \OpenAPI\Client\Model\LocalIomadLearningpathRemoveusersRequest

try {
    $result = $apiInstance->localIomadLearningpathRemoveusers($local_iomad_learningpath_removeusers_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LocalIomadLearningpathApi->localIomadLearningpathRemoveusers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **local_iomad_learningpath_removeusers_request** | [**\OpenAPI\Client\Model\LocalIomadLearningpathRemoveusersRequest**](../Model/LocalIomadLearningpathRemoveusersRequest.md)|  | |

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
