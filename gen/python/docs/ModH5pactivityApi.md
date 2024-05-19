# openapi_client.ModH5pactivityApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_h5pactivity_get_attempts**](ModH5pactivityApi.md#mod_h5pactivity_get_attempts) | **POST** /mod_h5pactivity_get_attempts | Return the information needed to list a user attempts.
[**mod_h5pactivity_get_h5pactivities_by_courses**](ModH5pactivityApi.md#mod_h5pactivity_get_h5pactivities_by_courses) | **POST** /mod_h5pactivity_get_h5pactivities_by_courses | Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.
[**mod_h5pactivity_get_h5pactivity_access_information**](ModH5pactivityApi.md#mod_h5pactivity_get_h5pactivity_access_information) | **POST** /mod_h5pactivity_get_h5pactivity_access_information | Return access information for a given h5p activity.
[**mod_h5pactivity_get_results**](ModH5pactivityApi.md#mod_h5pactivity_get_results) | **POST** /mod_h5pactivity_get_results | Return the information needed to list a user attempt results.
[**mod_h5pactivity_get_user_attempts**](ModH5pactivityApi.md#mod_h5pactivity_get_user_attempts) | **POST** /mod_h5pactivity_get_user_attempts | Return the information needed to list all enrolled user attempts.
[**mod_h5pactivity_log_report_viewed**](ModH5pactivityApi.md#mod_h5pactivity_log_report_viewed) | **POST** /mod_h5pactivity_log_report_viewed | Log that the h5pactivity was viewed.
[**mod_h5pactivity_view_h5pactivity**](ModH5pactivityApi.md#mod_h5pactivity_view_h5pactivity) | **POST** /mod_h5pactivity_view_h5pactivity | Trigger the course module viewed event and update the module completion status.


# **mod_h5pactivity_get_attempts**
> ModH5pactivityGetAttempts200Response mod_h5pactivity_get_attempts(mod_h5pactivity_get_attempts_request)

Return the information needed to list a user attempts.

Return the information needed to list a user attempts.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_h5pactivity_get_attempts200_response import ModH5pactivityGetAttempts200Response
from openapi_client.models.mod_h5pactivity_get_attempts_request import ModH5pactivityGetAttemptsRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.ModH5pactivityApi(api_client)
    mod_h5pactivity_get_attempts_request = openapi_client.ModH5pactivityGetAttemptsRequest() # ModH5pactivityGetAttemptsRequest | 

    try:
        # Return the information needed to list a user attempts.
        api_response = api_instance.mod_h5pactivity_get_attempts(mod_h5pactivity_get_attempts_request)
        print("The response of ModH5pactivityApi->mod_h5pactivity_get_attempts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModH5pactivityApi->mod_h5pactivity_get_attempts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_h5pactivity_get_attempts_request** | [**ModH5pactivityGetAttemptsRequest**](ModH5pactivityGetAttemptsRequest.md)|  | 

### Return type

[**ModH5pactivityGetAttempts200Response**](ModH5pactivityGetAttempts200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Activity attempts data |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_h5pactivity_get_h5pactivities_by_courses**
> ModH5pactivityGetH5pactivitiesByCourses200Response mod_h5pactivity_get_h5pactivities_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)

Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.

Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request import ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest
from openapi_client.models.mod_h5pactivity_get_h5pactivities_by_courses200_response import ModH5pactivityGetH5pactivitiesByCourses200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.ModH5pactivityApi(api_client)
    mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request = openapi_client.ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest() # ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 

    try:
        # Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.
        api_response = api_instance.mod_h5pactivity_get_h5pactivities_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)
        print("The response of ModH5pactivityApi->mod_h5pactivity_get_h5pactivities_by_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModH5pactivityApi->mod_h5pactivity_get_h5pactivities_by_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md)|  | 

### Return type

[**ModH5pactivityGetH5pactivitiesByCourses200Response**](ModH5pactivityGetH5pactivitiesByCourses200Response.md)

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

# **mod_h5pactivity_get_h5pactivity_access_information**
> ModH5pactivityGetH5pactivityAccessInformation200Response mod_h5pactivity_get_h5pactivity_access_information(mod_h5pactivity_get_h5pactivity_access_information_request)

Return access information for a given h5p activity.

Return access information for a given h5p activity.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_h5pactivity_get_h5pactivity_access_information200_response import ModH5pactivityGetH5pactivityAccessInformation200Response
from openapi_client.models.mod_h5pactivity_get_h5pactivity_access_information_request import ModH5pactivityGetH5pactivityAccessInformationRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.ModH5pactivityApi(api_client)
    mod_h5pactivity_get_h5pactivity_access_information_request = openapi_client.ModH5pactivityGetH5pactivityAccessInformationRequest() # ModH5pactivityGetH5pactivityAccessInformationRequest | 

    try:
        # Return access information for a given h5p activity.
        api_response = api_instance.mod_h5pactivity_get_h5pactivity_access_information(mod_h5pactivity_get_h5pactivity_access_information_request)
        print("The response of ModH5pactivityApi->mod_h5pactivity_get_h5pactivity_access_information:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModH5pactivityApi->mod_h5pactivity_get_h5pactivity_access_information: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_h5pactivity_get_h5pactivity_access_information_request** | [**ModH5pactivityGetH5pactivityAccessInformationRequest**](ModH5pactivityGetH5pactivityAccessInformationRequest.md)|  | 

### Return type

[**ModH5pactivityGetH5pactivityAccessInformation200Response**](ModH5pactivityGetH5pactivityAccessInformation200Response.md)

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

# **mod_h5pactivity_get_results**
> ModH5pactivityGetResults200Response mod_h5pactivity_get_results(mod_h5pactivity_get_results_request)

Return the information needed to list a user attempt results.

Return the information needed to list a user attempt results.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_h5pactivity_get_results200_response import ModH5pactivityGetResults200Response
from openapi_client.models.mod_h5pactivity_get_results_request import ModH5pactivityGetResultsRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.ModH5pactivityApi(api_client)
    mod_h5pactivity_get_results_request = openapi_client.ModH5pactivityGetResultsRequest() # ModH5pactivityGetResultsRequest | 

    try:
        # Return the information needed to list a user attempt results.
        api_response = api_instance.mod_h5pactivity_get_results(mod_h5pactivity_get_results_request)
        print("The response of ModH5pactivityApi->mod_h5pactivity_get_results:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModH5pactivityApi->mod_h5pactivity_get_results: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_h5pactivity_get_results_request** | [**ModH5pactivityGetResultsRequest**](ModH5pactivityGetResultsRequest.md)|  | 

### Return type

[**ModH5pactivityGetResults200Response**](ModH5pactivityGetResults200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Activity attempts results data |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_h5pactivity_get_user_attempts**
> ModH5pactivityGetUserAttempts200Response mod_h5pactivity_get_user_attempts(mod_h5pactivity_get_user_attempts_request)

Return the information needed to list all enrolled user attempts.

Return the information needed to list all enrolled user attempts.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_h5pactivity_get_user_attempts200_response import ModH5pactivityGetUserAttempts200Response
from openapi_client.models.mod_h5pactivity_get_user_attempts_request import ModH5pactivityGetUserAttemptsRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.ModH5pactivityApi(api_client)
    mod_h5pactivity_get_user_attempts_request = openapi_client.ModH5pactivityGetUserAttemptsRequest() # ModH5pactivityGetUserAttemptsRequest | 

    try:
        # Return the information needed to list all enrolled user attempts.
        api_response = api_instance.mod_h5pactivity_get_user_attempts(mod_h5pactivity_get_user_attempts_request)
        print("The response of ModH5pactivityApi->mod_h5pactivity_get_user_attempts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModH5pactivityApi->mod_h5pactivity_get_user_attempts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_h5pactivity_get_user_attempts_request** | [**ModH5pactivityGetUserAttemptsRequest**](ModH5pactivityGetUserAttemptsRequest.md)|  | 

### Return type

[**ModH5pactivityGetUserAttempts200Response**](ModH5pactivityGetUserAttempts200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Activity attempts data |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_h5pactivity_log_report_viewed**
> CoreCalendarDeleteSubscription200Response mod_h5pactivity_log_report_viewed(mod_h5pactivity_log_report_viewed_request)

Log that the h5pactivity was viewed.

Log that the h5pactivity was viewed.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_h5pactivity_log_report_viewed_request import ModH5pactivityLogReportViewedRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.ModH5pactivityApi(api_client)
    mod_h5pactivity_log_report_viewed_request = openapi_client.ModH5pactivityLogReportViewedRequest() # ModH5pactivityLogReportViewedRequest | 

    try:
        # Log that the h5pactivity was viewed.
        api_response = api_instance.mod_h5pactivity_log_report_viewed(mod_h5pactivity_log_report_viewed_request)
        print("The response of ModH5pactivityApi->mod_h5pactivity_log_report_viewed:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModH5pactivityApi->mod_h5pactivity_log_report_viewed: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_h5pactivity_log_report_viewed_request** | [**ModH5pactivityLogReportViewedRequest**](ModH5pactivityLogReportViewedRequest.md)|  | 

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

# **mod_h5pactivity_view_h5pactivity**
> CoreCalendarDeleteSubscription200Response mod_h5pactivity_view_h5pactivity(mod_h5pactivity_view_h5pactivity_request)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_h5pactivity_view_h5pactivity_request import ModH5pactivityViewH5pactivityRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.ModH5pactivityApi(api_client)
    mod_h5pactivity_view_h5pactivity_request = openapi_client.ModH5pactivityViewH5pactivityRequest() # ModH5pactivityViewH5pactivityRequest | 

    try:
        # Trigger the course module viewed event and update the module completion status.
        api_response = api_instance.mod_h5pactivity_view_h5pactivity(mod_h5pactivity_view_h5pactivity_request)
        print("The response of ModH5pactivityApi->mod_h5pactivity_view_h5pactivity:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModH5pactivityApi->mod_h5pactivity_view_h5pactivity: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_h5pactivity_view_h5pactivity_request** | [**ModH5pactivityViewH5pactivityRequest**](ModH5pactivityViewH5pactivityRequest.md)|  | 

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

