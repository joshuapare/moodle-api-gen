# OpenAPI\Client\GradereportGraderApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**gradereportGraderGetUsersInReport()**](GradereportGraderApi.md#gradereportGraderGetUsersInReport) | **POST** /gradereport_grader_get_users_in_report | Returns the dataset of users within the report |


## `gradereportGraderGetUsersInReport()`

```php
gradereportGraderGetUsersInReport($core_completion_mark_course_self_completed_request): \OpenAPI\Client\Model\CoreGradesGetGradableUsers200Response
```

Returns the dataset of users within the report

Returns the dataset of users within the report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\GradereportGraderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_completion_mark_course_self_completed_request = new \OpenAPI\Client\Model\CoreCompletionMarkCourseSelfCompletedRequest(); // \OpenAPI\Client\Model\CoreCompletionMarkCourseSelfCompletedRequest

try {
    $result = $apiInstance->gradereportGraderGetUsersInReport($core_completion_mark_course_self_completed_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GradereportGraderApi->gradereportGraderGetUsersInReport: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_completion_mark_course_self_completed_request** | [**\OpenAPI\Client\Model\CoreCompletionMarkCourseSelfCompletedRequest**](../Model/CoreCompletionMarkCourseSelfCompletedRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGradesGetGradableUsers200Response**](../Model/CoreGradesGetGradableUsers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
