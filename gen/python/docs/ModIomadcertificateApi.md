# openapi_client.ModIomadcertificateApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_iomadcertificate_get_iomadcertificates_by_courses**](ModIomadcertificateApi.md#mod_iomadcertificate_get_iomadcertificates_by_courses) | **POST** /mod_iomadcertificate_get_iomadcertificates_by_courses | Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.
[**mod_iomadcertificate_get_issued_iomadcertificates**](ModIomadcertificateApi.md#mod_iomadcertificate_get_issued_iomadcertificates) | **POST** /mod_iomadcertificate_get_issued_iomadcertificates | Get the list of issued iomadcertificates for the current user.
[**mod_iomadcertificate_issue_iomadcertificate**](ModIomadcertificateApi.md#mod_iomadcertificate_issue_iomadcertificate) | **POST** /mod_iomadcertificate_issue_iomadcertificate | Create new iomadcertificate record, or return existing record for the current user.
[**mod_iomadcertificate_view_iomadcertificate**](ModIomadcertificateApi.md#mod_iomadcertificate_view_iomadcertificate) | **POST** /mod_iomadcertificate_view_iomadcertificate | Trigger the course module viewed event and update the module completion status.


# **mod_iomadcertificate_get_iomadcertificates_by_courses**
> ModIomadcertificateGetIomadcertificatesByCourses200Response mod_iomadcertificate_get_iomadcertificates_by_courses(mod_chat_get_chats_by_courses_request)

Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.

Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_chat_get_chats_by_courses_request import ModChatGetChatsByCoursesRequest
from openapi_client.models.mod_iomadcertificate_get_iomadcertificates_by_courses200_response import ModIomadcertificateGetIomadcertificatesByCourses200Response
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
    api_instance = openapi_client.ModIomadcertificateApi(api_client)
    mod_chat_get_chats_by_courses_request = openapi_client.ModChatGetChatsByCoursesRequest() # ModChatGetChatsByCoursesRequest | 

    try:
        # Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.
        api_response = api_instance.mod_iomadcertificate_get_iomadcertificates_by_courses(mod_chat_get_chats_by_courses_request)
        print("The response of ModIomadcertificateApi->mod_iomadcertificate_get_iomadcertificates_by_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModIomadcertificateApi->mod_iomadcertificate_get_iomadcertificates_by_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md)|  | 

### Return type

[**ModIomadcertificateGetIomadcertificatesByCourses200Response**](ModIomadcertificateGetIomadcertificatesByCourses200Response.md)

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

# **mod_iomadcertificate_get_issued_iomadcertificates**
> ModIomadcertificateGetIssuedIomadcertificates200Response mod_iomadcertificate_get_issued_iomadcertificates(mod_iomadcertificate_get_issued_iomadcertificates_request)

Get the list of issued iomadcertificates for the current user.

Get the list of issued iomadcertificates for the current user.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_iomadcertificate_get_issued_iomadcertificates200_response import ModIomadcertificateGetIssuedIomadcertificates200Response
from openapi_client.models.mod_iomadcertificate_get_issued_iomadcertificates_request import ModIomadcertificateGetIssuedIomadcertificatesRequest
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
    api_instance = openapi_client.ModIomadcertificateApi(api_client)
    mod_iomadcertificate_get_issued_iomadcertificates_request = openapi_client.ModIomadcertificateGetIssuedIomadcertificatesRequest() # ModIomadcertificateGetIssuedIomadcertificatesRequest | 

    try:
        # Get the list of issued iomadcertificates for the current user.
        api_response = api_instance.mod_iomadcertificate_get_issued_iomadcertificates(mod_iomadcertificate_get_issued_iomadcertificates_request)
        print("The response of ModIomadcertificateApi->mod_iomadcertificate_get_issued_iomadcertificates:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModIomadcertificateApi->mod_iomadcertificate_get_issued_iomadcertificates: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_iomadcertificate_get_issued_iomadcertificates_request** | [**ModIomadcertificateGetIssuedIomadcertificatesRequest**](ModIomadcertificateGetIssuedIomadcertificatesRequest.md)|  | 

### Return type

[**ModIomadcertificateGetIssuedIomadcertificates200Response**](ModIomadcertificateGetIssuedIomadcertificates200Response.md)

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

# **mod_iomadcertificate_issue_iomadcertificate**
> ModIomadcertificateIssueIomadcertificate200Response mod_iomadcertificate_issue_iomadcertificate(mod_iomadcertificate_issue_iomadcertificate_request)

Create new iomadcertificate record, or return existing record for the current user.

Create new iomadcertificate record, or return existing record for the current user.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_iomadcertificate_issue_iomadcertificate200_response import ModIomadcertificateIssueIomadcertificate200Response
from openapi_client.models.mod_iomadcertificate_issue_iomadcertificate_request import ModIomadcertificateIssueIomadcertificateRequest
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
    api_instance = openapi_client.ModIomadcertificateApi(api_client)
    mod_iomadcertificate_issue_iomadcertificate_request = openapi_client.ModIomadcertificateIssueIomadcertificateRequest() # ModIomadcertificateIssueIomadcertificateRequest | 

    try:
        # Create new iomadcertificate record, or return existing record for the current user.
        api_response = api_instance.mod_iomadcertificate_issue_iomadcertificate(mod_iomadcertificate_issue_iomadcertificate_request)
        print("The response of ModIomadcertificateApi->mod_iomadcertificate_issue_iomadcertificate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModIomadcertificateApi->mod_iomadcertificate_issue_iomadcertificate: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_iomadcertificate_issue_iomadcertificate_request** | [**ModIomadcertificateIssueIomadcertificateRequest**](ModIomadcertificateIssueIomadcertificateRequest.md)|  | 

### Return type

[**ModIomadcertificateIssueIomadcertificate200Response**](ModIomadcertificateIssueIomadcertificate200Response.md)

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

# **mod_iomadcertificate_view_iomadcertificate**
> CoreCalendarDeleteSubscription200Response mod_iomadcertificate_view_iomadcertificate(mod_iomadcertificate_issue_iomadcertificate_request)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_iomadcertificate_issue_iomadcertificate_request import ModIomadcertificateIssueIomadcertificateRequest
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
    api_instance = openapi_client.ModIomadcertificateApi(api_client)
    mod_iomadcertificate_issue_iomadcertificate_request = openapi_client.ModIomadcertificateIssueIomadcertificateRequest() # ModIomadcertificateIssueIomadcertificateRequest | 

    try:
        # Trigger the course module viewed event and update the module completion status.
        api_response = api_instance.mod_iomadcertificate_view_iomadcertificate(mod_iomadcertificate_issue_iomadcertificate_request)
        print("The response of ModIomadcertificateApi->mod_iomadcertificate_view_iomadcertificate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModIomadcertificateApi->mod_iomadcertificate_view_iomadcertificate: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_iomadcertificate_issue_iomadcertificate_request** | [**ModIomadcertificateIssueIomadcertificateRequest**](ModIomadcertificateIssueIomadcertificateRequest.md)|  | 

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

