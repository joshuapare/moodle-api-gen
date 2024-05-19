# openapi_client.GradereportOverviewApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gradereport_overview_get_course_grades**](GradereportOverviewApi.md#gradereport_overview_get_course_grades) | **POST** /gradereport_overview_get_course_grades | Get the given user courses final grades
[**gradereport_overview_view_grade_report**](GradereportOverviewApi.md#gradereport_overview_view_grade_report) | **POST** /gradereport_overview_view_grade_report | Trigger the report view event


# **gradereport_overview_get_course_grades**
> GradereportOverviewGetCourseGrades200Response gradereport_overview_get_course_grades(gradereport_overview_get_course_grades_request)

Get the given user courses final grades

Get the given user courses final grades

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.gradereport_overview_get_course_grades200_response import GradereportOverviewGetCourseGrades200Response
from openapi_client.models.gradereport_overview_get_course_grades_request import GradereportOverviewGetCourseGradesRequest
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
    api_instance = openapi_client.GradereportOverviewApi(api_client)
    gradereport_overview_get_course_grades_request = openapi_client.GradereportOverviewGetCourseGradesRequest() # GradereportOverviewGetCourseGradesRequest | 

    try:
        # Get the given user courses final grades
        api_response = api_instance.gradereport_overview_get_course_grades(gradereport_overview_get_course_grades_request)
        print("The response of GradereportOverviewApi->gradereport_overview_get_course_grades:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GradereportOverviewApi->gradereport_overview_get_course_grades: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gradereport_overview_get_course_grades_request** | [**GradereportOverviewGetCourseGradesRequest**](GradereportOverviewGetCourseGradesRequest.md)|  | 

### Return type

[**GradereportOverviewGetCourseGrades200Response**](GradereportOverviewGetCourseGrades200Response.md)

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

# **gradereport_overview_view_grade_report**
> CoreCalendarDeleteSubscription200Response gradereport_overview_view_grade_report(gradereport_overview_view_grade_report_request)

Trigger the report view event

Trigger the report view event

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.gradereport_overview_view_grade_report_request import GradereportOverviewViewGradeReportRequest
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
    api_instance = openapi_client.GradereportOverviewApi(api_client)
    gradereport_overview_view_grade_report_request = openapi_client.GradereportOverviewViewGradeReportRequest() # GradereportOverviewViewGradeReportRequest | 

    try:
        # Trigger the report view event
        api_response = api_instance.gradereport_overview_view_grade_report(gradereport_overview_view_grade_report_request)
        print("The response of GradereportOverviewApi->gradereport_overview_view_grade_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GradereportOverviewApi->gradereport_overview_view_grade_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gradereport_overview_view_grade_report_request** | [**GradereportOverviewViewGradeReportRequest**](GradereportOverviewViewGradeReportRequest.md)|  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

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

