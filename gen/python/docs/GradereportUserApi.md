# openapi_client.GradereportUserApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gradereport_user_get_access_information**](GradereportUserApi.md#gradereport_user_get_access_information) | **POST** /gradereport_user_get_access_information | Returns user access information for the user grade report.
[**gradereport_user_get_grade_items**](GradereportUserApi.md#gradereport_user_get_grade_items) | **POST** /gradereport_user_get_grade_items | Returns the complete list of grade items for users in a course
[**gradereport_user_get_grades_table**](GradereportUserApi.md#gradereport_user_get_grades_table) | **POST** /gradereport_user_get_grades_table | Get the user/s report grades table for a course
[**gradereport_user_view_grade_report**](GradereportUserApi.md#gradereport_user_view_grade_report) | **POST** /gradereport_user_view_grade_report | Trigger the report view event


# **gradereport_user_get_access_information**
> GradereportUserGetAccessInformation200Response gradereport_user_get_access_information(gradereport_user_get_access_information_request)

Returns user access information for the user grade report.

Returns user access information for the user grade report.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.gradereport_user_get_access_information200_response import GradereportUserGetAccessInformation200Response
from openapi_client.models.gradereport_user_get_access_information_request import GradereportUserGetAccessInformationRequest
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
    api_instance = openapi_client.GradereportUserApi(api_client)
    gradereport_user_get_access_information_request = openapi_client.GradereportUserGetAccessInformationRequest() # GradereportUserGetAccessInformationRequest | 

    try:
        # Returns user access information for the user grade report.
        api_response = api_instance.gradereport_user_get_access_information(gradereport_user_get_access_information_request)
        print("The response of GradereportUserApi->gradereport_user_get_access_information:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GradereportUserApi->gradereport_user_get_access_information: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gradereport_user_get_access_information_request** | [**GradereportUserGetAccessInformationRequest**](GradereportUserGetAccessInformationRequest.md)|  | 

### Return type

[**GradereportUserGetAccessInformation200Response**](GradereportUserGetAccessInformation200Response.md)

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

# **gradereport_user_get_grade_items**
> GradereportUserGetGradeItems200Response gradereport_user_get_grade_items(gradereport_user_get_grade_items_request)

Returns the complete list of grade items for users in a course

Returns the complete list of grade items for users in a course

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.gradereport_user_get_grade_items200_response import GradereportUserGetGradeItems200Response
from openapi_client.models.gradereport_user_get_grade_items_request import GradereportUserGetGradeItemsRequest
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
    api_instance = openapi_client.GradereportUserApi(api_client)
    gradereport_user_get_grade_items_request = openapi_client.GradereportUserGetGradeItemsRequest() # GradereportUserGetGradeItemsRequest | 

    try:
        # Returns the complete list of grade items for users in a course
        api_response = api_instance.gradereport_user_get_grade_items(gradereport_user_get_grade_items_request)
        print("The response of GradereportUserApi->gradereport_user_get_grade_items:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GradereportUserApi->gradereport_user_get_grade_items: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gradereport_user_get_grade_items_request** | [**GradereportUserGetGradeItemsRequest**](GradereportUserGetGradeItemsRequest.md)|  | 

### Return type

[**GradereportUserGetGradeItems200Response**](GradereportUserGetGradeItems200Response.md)

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

# **gradereport_user_get_grades_table**
> GradereportUserGetGradesTable200Response gradereport_user_get_grades_table(gradereport_user_get_grade_items_request)

Get the user/s report grades table for a course

Get the user/s report grades table for a course

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.gradereport_user_get_grade_items_request import GradereportUserGetGradeItemsRequest
from openapi_client.models.gradereport_user_get_grades_table200_response import GradereportUserGetGradesTable200Response
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
    api_instance = openapi_client.GradereportUserApi(api_client)
    gradereport_user_get_grade_items_request = openapi_client.GradereportUserGetGradeItemsRequest() # GradereportUserGetGradeItemsRequest | 

    try:
        # Get the user/s report grades table for a course
        api_response = api_instance.gradereport_user_get_grades_table(gradereport_user_get_grade_items_request)
        print("The response of GradereportUserApi->gradereport_user_get_grades_table:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GradereportUserApi->gradereport_user_get_grades_table: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gradereport_user_get_grade_items_request** | [**GradereportUserGetGradeItemsRequest**](GradereportUserGetGradeItemsRequest.md)|  | 

### Return type

[**GradereportUserGetGradesTable200Response**](GradereportUserGetGradesTable200Response.md)

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

# **gradereport_user_view_grade_report**
> CoreCalendarDeleteSubscription200Response gradereport_user_view_grade_report(gradereport_overview_view_grade_report_request)

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
    api_instance = openapi_client.GradereportUserApi(api_client)
    gradereport_overview_view_grade_report_request = openapi_client.GradereportOverviewViewGradeReportRequest() # GradereportOverviewViewGradeReportRequest | 

    try:
        # Trigger the report view event
        api_response = api_instance.gradereport_user_view_grade_report(gradereport_overview_view_grade_report_request)
        print("The response of GradereportUserApi->gradereport_user_view_grade_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GradereportUserApi->gradereport_user_view_grade_report: %s\n" % e)
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

