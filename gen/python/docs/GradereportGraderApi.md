# openapi_client.GradereportGraderApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gradereport_grader_get_users_in_report**](GradereportGraderApi.md#gradereport_grader_get_users_in_report) | **POST** /gradereport_grader_get_users_in_report | Returns the dataset of users within the report


# **gradereport_grader_get_users_in_report**
> CoreGradesGetGradableUsers200Response gradereport_grader_get_users_in_report(core_completion_mark_course_self_completed_request)

Returns the dataset of users within the report

Returns the dataset of users within the report

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_completion_mark_course_self_completed_request import CoreCompletionMarkCourseSelfCompletedRequest
from openapi_client.models.core_grades_get_gradable_users200_response import CoreGradesGetGradableUsers200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/rest/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/rest/server.php"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKey
configuration.api_key['apiKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.GradereportGraderApi(api_client)
    core_completion_mark_course_self_completed_request = openapi_client.CoreCompletionMarkCourseSelfCompletedRequest() # CoreCompletionMarkCourseSelfCompletedRequest | 

    try:
        # Returns the dataset of users within the report
        api_response = api_instance.gradereport_grader_get_users_in_report(core_completion_mark_course_self_completed_request)
        print("The response of GradereportGraderApi->gradereport_grader_get_users_in_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GradereportGraderApi->gradereport_grader_get_users_in_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **core_completion_mark_course_self_completed_request** | [**CoreCompletionMarkCourseSelfCompletedRequest**](CoreCompletionMarkCourseSelfCompletedRequest.md)|  | 

### Return type

[**CoreGradesGetGradableUsers200Response**](CoreGradesGetGradableUsers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

