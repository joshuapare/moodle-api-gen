# openapi_client.ModLtiApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_lti_create_tool_proxy**](ModLtiApi.md#mod_lti_create_tool_proxy) | **POST** /mod_lti_create_tool_proxy | Create a tool proxy
[**mod_lti_create_tool_type**](ModLtiApi.md#mod_lti_create_tool_type) | **POST** /mod_lti_create_tool_type | Create a tool type
[**mod_lti_delete_course_tool_type**](ModLtiApi.md#mod_lti_delete_course_tool_type) | **POST** /mod_lti_delete_course_tool_type | Delete a course tool type
[**mod_lti_delete_tool_proxy**](ModLtiApi.md#mod_lti_delete_tool_proxy) | **POST** /mod_lti_delete_tool_proxy | Delete a tool proxy
[**mod_lti_delete_tool_type**](ModLtiApi.md#mod_lti_delete_tool_type) | **POST** /mod_lti_delete_tool_type | Delete a tool type
[**mod_lti_get_ltis_by_courses**](ModLtiApi.md#mod_lti_get_ltis_by_courses) | **POST** /mod_lti_get_ltis_by_courses | Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.
[**mod_lti_get_tool_launch_data**](ModLtiApi.md#mod_lti_get_tool_launch_data) | **POST** /mod_lti_get_tool_launch_data | Return the launch data for a given external tool.
[**mod_lti_get_tool_proxies**](ModLtiApi.md#mod_lti_get_tool_proxies) | **POST** /mod_lti_get_tool_proxies | Get a list of the tool proxies
[**mod_lti_get_tool_proxy_registration_request**](ModLtiApi.md#mod_lti_get_tool_proxy_registration_request) | **POST** /mod_lti_get_tool_proxy_registration_request | Get a registration request for a tool proxy
[**mod_lti_get_tool_types**](ModLtiApi.md#mod_lti_get_tool_types) | **POST** /mod_lti_get_tool_types | Get a list of the tool types
[**mod_lti_get_tool_types_and_proxies**](ModLtiApi.md#mod_lti_get_tool_types_and_proxies) | **POST** /mod_lti_get_tool_types_and_proxies | Get a list of the tool types and tool proxies
[**mod_lti_get_tool_types_and_proxies_count**](ModLtiApi.md#mod_lti_get_tool_types_and_proxies_count) | **POST** /mod_lti_get_tool_types_and_proxies_count | Get total number of the tool types and tool proxies
[**mod_lti_is_cartridge**](ModLtiApi.md#mod_lti_is_cartridge) | **POST** /mod_lti_is_cartridge | Determine if the given url is for a cartridge
[**mod_lti_toggle_showinactivitychooser**](ModLtiApi.md#mod_lti_toggle_showinactivitychooser) | **POST** /mod_lti_toggle_showinactivitychooser | Toggle showinactivitychooser for a tool type in a course
[**mod_lti_update_tool_type**](ModLtiApi.md#mod_lti_update_tool_type) | **POST** /mod_lti_update_tool_type | Update a tool type
[**mod_lti_view_lti**](ModLtiApi.md#mod_lti_view_lti) | **POST** /mod_lti_view_lti | Trigger the course module viewed event and update the module completion status.


# **mod_lti_create_tool_proxy**
> ModLtiCreateToolProxy200Response mod_lti_create_tool_proxy(mod_lti_create_tool_proxy_request)

Create a tool proxy

Create a tool proxy

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lti_create_tool_proxy200_response import ModLtiCreateToolProxy200Response
from openapi_client.models.mod_lti_create_tool_proxy_request import ModLtiCreateToolProxyRequest
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
    api_instance = openapi_client.ModLtiApi(api_client)
    mod_lti_create_tool_proxy_request = openapi_client.ModLtiCreateToolProxyRequest() # ModLtiCreateToolProxyRequest | 

    try:
        # Create a tool proxy
        api_response = api_instance.mod_lti_create_tool_proxy(mod_lti_create_tool_proxy_request)
        print("The response of ModLtiApi->mod_lti_create_tool_proxy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLtiApi->mod_lti_create_tool_proxy: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lti_create_tool_proxy_request** | [**ModLtiCreateToolProxyRequest**](ModLtiCreateToolProxyRequest.md)|  | 

### Return type

[**ModLtiCreateToolProxy200Response**](ModLtiCreateToolProxy200Response.md)

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

# **mod_lti_create_tool_type**
> ModLtiCreateToolType200Response mod_lti_create_tool_type(mod_lti_create_tool_type_request)

Create a tool type

Create a tool type

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lti_create_tool_type200_response import ModLtiCreateToolType200Response
from openapi_client.models.mod_lti_create_tool_type_request import ModLtiCreateToolTypeRequest
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
    api_instance = openapi_client.ModLtiApi(api_client)
    mod_lti_create_tool_type_request = openapi_client.ModLtiCreateToolTypeRequest() # ModLtiCreateToolTypeRequest | 

    try:
        # Create a tool type
        api_response = api_instance.mod_lti_create_tool_type(mod_lti_create_tool_type_request)
        print("The response of ModLtiApi->mod_lti_create_tool_type:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLtiApi->mod_lti_create_tool_type: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lti_create_tool_type_request** | [**ModLtiCreateToolTypeRequest**](ModLtiCreateToolTypeRequest.md)|  | 

### Return type

[**ModLtiCreateToolType200Response**](ModLtiCreateToolType200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Tool |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_lti_delete_course_tool_type**
> object mod_lti_delete_course_tool_type(mod_lti_delete_course_tool_type_request)

Delete a course tool type

Delete a course tool type

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lti_delete_course_tool_type_request import ModLtiDeleteCourseToolTypeRequest
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
    api_instance = openapi_client.ModLtiApi(api_client)
    mod_lti_delete_course_tool_type_request = openapi_client.ModLtiDeleteCourseToolTypeRequest() # ModLtiDeleteCourseToolTypeRequest | 

    try:
        # Delete a course tool type
        api_response = api_instance.mod_lti_delete_course_tool_type(mod_lti_delete_course_tool_type_request)
        print("The response of ModLtiApi->mod_lti_delete_course_tool_type:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLtiApi->mod_lti_delete_course_tool_type: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lti_delete_course_tool_type_request** | [**ModLtiDeleteCourseToolTypeRequest**](ModLtiDeleteCourseToolTypeRequest.md)|  | 

### Return type

**object**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_lti_delete_tool_proxy**
> ModLtiDeleteToolProxy200Response mod_lti_delete_tool_proxy(mod_lti_delete_tool_proxy_request)

Delete a tool proxy

Delete a tool proxy

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lti_delete_tool_proxy200_response import ModLtiDeleteToolProxy200Response
from openapi_client.models.mod_lti_delete_tool_proxy_request import ModLtiDeleteToolProxyRequest
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
    api_instance = openapi_client.ModLtiApi(api_client)
    mod_lti_delete_tool_proxy_request = openapi_client.ModLtiDeleteToolProxyRequest() # ModLtiDeleteToolProxyRequest | 

    try:
        # Delete a tool proxy
        api_response = api_instance.mod_lti_delete_tool_proxy(mod_lti_delete_tool_proxy_request)
        print("The response of ModLtiApi->mod_lti_delete_tool_proxy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLtiApi->mod_lti_delete_tool_proxy: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lti_delete_tool_proxy_request** | [**ModLtiDeleteToolProxyRequest**](ModLtiDeleteToolProxyRequest.md)|  | 

### Return type

[**ModLtiDeleteToolProxy200Response**](ModLtiDeleteToolProxy200Response.md)

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

# **mod_lti_delete_tool_type**
> ModLtiDeleteToolTypeRequest mod_lti_delete_tool_type(mod_lti_delete_tool_type_request)

Delete a tool type

Delete a tool type

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lti_delete_tool_type_request import ModLtiDeleteToolTypeRequest
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
    api_instance = openapi_client.ModLtiApi(api_client)
    mod_lti_delete_tool_type_request = openapi_client.ModLtiDeleteToolTypeRequest() # ModLtiDeleteToolTypeRequest | 

    try:
        # Delete a tool type
        api_response = api_instance.mod_lti_delete_tool_type(mod_lti_delete_tool_type_request)
        print("The response of ModLtiApi->mod_lti_delete_tool_type:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLtiApi->mod_lti_delete_tool_type: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lti_delete_tool_type_request** | [**ModLtiDeleteToolTypeRequest**](ModLtiDeleteToolTypeRequest.md)|  | 

### Return type

[**ModLtiDeleteToolTypeRequest**](ModLtiDeleteToolTypeRequest.md)

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

# **mod_lti_get_ltis_by_courses**
> ModLtiGetLtisByCourses200Response mod_lti_get_ltis_by_courses(mod_chat_get_chats_by_courses_request)

Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.

Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_chat_get_chats_by_courses_request import ModChatGetChatsByCoursesRequest
from openapi_client.models.mod_lti_get_ltis_by_courses200_response import ModLtiGetLtisByCourses200Response
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
    api_instance = openapi_client.ModLtiApi(api_client)
    mod_chat_get_chats_by_courses_request = openapi_client.ModChatGetChatsByCoursesRequest() # ModChatGetChatsByCoursesRequest | 

    try:
        # Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.
        api_response = api_instance.mod_lti_get_ltis_by_courses(mod_chat_get_chats_by_courses_request)
        print("The response of ModLtiApi->mod_lti_get_ltis_by_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLtiApi->mod_lti_get_ltis_by_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md)|  | 

### Return type

[**ModLtiGetLtisByCourses200Response**](ModLtiGetLtisByCourses200Response.md)

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

# **mod_lti_get_tool_launch_data**
> ModLtiGetToolLaunchData200Response mod_lti_get_tool_launch_data(mod_lti_get_tool_launch_data_request)

Return the launch data for a given external tool.

Return the launch data for a given external tool.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lti_get_tool_launch_data200_response import ModLtiGetToolLaunchData200Response
from openapi_client.models.mod_lti_get_tool_launch_data_request import ModLtiGetToolLaunchDataRequest
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
    api_instance = openapi_client.ModLtiApi(api_client)
    mod_lti_get_tool_launch_data_request = openapi_client.ModLtiGetToolLaunchDataRequest() # ModLtiGetToolLaunchDataRequest | 

    try:
        # Return the launch data for a given external tool.
        api_response = api_instance.mod_lti_get_tool_launch_data(mod_lti_get_tool_launch_data_request)
        print("The response of ModLtiApi->mod_lti_get_tool_launch_data:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLtiApi->mod_lti_get_tool_launch_data: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lti_get_tool_launch_data_request** | [**ModLtiGetToolLaunchDataRequest**](ModLtiGetToolLaunchDataRequest.md)|  | 

### Return type

[**ModLtiGetToolLaunchData200Response**](ModLtiGetToolLaunchData200Response.md)

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

# **mod_lti_get_tool_proxies**
> object mod_lti_get_tool_proxies(mod_lti_get_tool_proxies_request)

Get a list of the tool proxies

Get a list of the tool proxies

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lti_get_tool_proxies_request import ModLtiGetToolProxiesRequest
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
    api_instance = openapi_client.ModLtiApi(api_client)
    mod_lti_get_tool_proxies_request = openapi_client.ModLtiGetToolProxiesRequest() # ModLtiGetToolProxiesRequest | 

    try:
        # Get a list of the tool proxies
        api_response = api_instance.mod_lti_get_tool_proxies(mod_lti_get_tool_proxies_request)
        print("The response of ModLtiApi->mod_lti_get_tool_proxies:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLtiApi->mod_lti_get_tool_proxies: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lti_get_tool_proxies_request** | [**ModLtiGetToolProxiesRequest**](ModLtiGetToolProxiesRequest.md)|  | 

### Return type

**object**

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

# **mod_lti_get_tool_proxy_registration_request**
> ModLtiGetToolProxyRegistrationRequest200Response mod_lti_get_tool_proxy_registration_request(mod_lti_delete_tool_proxy_request)

Get a registration request for a tool proxy

Get a registration request for a tool proxy

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lti_delete_tool_proxy_request import ModLtiDeleteToolProxyRequest
from openapi_client.models.mod_lti_get_tool_proxy_registration_request200_response import ModLtiGetToolProxyRegistrationRequest200Response
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
    api_instance = openapi_client.ModLtiApi(api_client)
    mod_lti_delete_tool_proxy_request = openapi_client.ModLtiDeleteToolProxyRequest() # ModLtiDeleteToolProxyRequest | 

    try:
        # Get a registration request for a tool proxy
        api_response = api_instance.mod_lti_get_tool_proxy_registration_request(mod_lti_delete_tool_proxy_request)
        print("The response of ModLtiApi->mod_lti_get_tool_proxy_registration_request:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLtiApi->mod_lti_get_tool_proxy_registration_request: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lti_delete_tool_proxy_request** | [**ModLtiDeleteToolProxyRequest**](ModLtiDeleteToolProxyRequest.md)|  | 

### Return type

[**ModLtiGetToolProxyRegistrationRequest200Response**](ModLtiGetToolProxyRegistrationRequest200Response.md)

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

# **mod_lti_get_tool_types**
> object mod_lti_get_tool_types(mod_lti_get_tool_types_request)

Get a list of the tool types

Get a list of the tool types

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lti_get_tool_types_request import ModLtiGetToolTypesRequest
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
    api_instance = openapi_client.ModLtiApi(api_client)
    mod_lti_get_tool_types_request = openapi_client.ModLtiGetToolTypesRequest() # ModLtiGetToolTypesRequest | 

    try:
        # Get a list of the tool types
        api_response = api_instance.mod_lti_get_tool_types(mod_lti_get_tool_types_request)
        print("The response of ModLtiApi->mod_lti_get_tool_types:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLtiApi->mod_lti_get_tool_types: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lti_get_tool_types_request** | [**ModLtiGetToolTypesRequest**](ModLtiGetToolTypesRequest.md)|  | 

### Return type

**object**

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

# **mod_lti_get_tool_types_and_proxies**
> ModLtiGetToolTypesAndProxies200Response mod_lti_get_tool_types_and_proxies(mod_lti_get_tool_types_and_proxies_request)

Get a list of the tool types and tool proxies

Get a list of the tool types and tool proxies

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lti_get_tool_types_and_proxies200_response import ModLtiGetToolTypesAndProxies200Response
from openapi_client.models.mod_lti_get_tool_types_and_proxies_request import ModLtiGetToolTypesAndProxiesRequest
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
    api_instance = openapi_client.ModLtiApi(api_client)
    mod_lti_get_tool_types_and_proxies_request = openapi_client.ModLtiGetToolTypesAndProxiesRequest() # ModLtiGetToolTypesAndProxiesRequest | 

    try:
        # Get a list of the tool types and tool proxies
        api_response = api_instance.mod_lti_get_tool_types_and_proxies(mod_lti_get_tool_types_and_proxies_request)
        print("The response of ModLtiApi->mod_lti_get_tool_types_and_proxies:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLtiApi->mod_lti_get_tool_types_and_proxies: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lti_get_tool_types_and_proxies_request** | [**ModLtiGetToolTypesAndProxiesRequest**](ModLtiGetToolTypesAndProxiesRequest.md)|  | 

### Return type

[**ModLtiGetToolTypesAndProxies200Response**](ModLtiGetToolTypesAndProxies200Response.md)

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

# **mod_lti_get_tool_types_and_proxies_count**
> ModLtiGetToolTypesAndProxiesCount200Response mod_lti_get_tool_types_and_proxies_count(mod_lti_get_tool_types_and_proxies_count_request)

Get total number of the tool types and tool proxies

Get total number of the tool types and tool proxies

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lti_get_tool_types_and_proxies_count200_response import ModLtiGetToolTypesAndProxiesCount200Response
from openapi_client.models.mod_lti_get_tool_types_and_proxies_count_request import ModLtiGetToolTypesAndProxiesCountRequest
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
    api_instance = openapi_client.ModLtiApi(api_client)
    mod_lti_get_tool_types_and_proxies_count_request = openapi_client.ModLtiGetToolTypesAndProxiesCountRequest() # ModLtiGetToolTypesAndProxiesCountRequest | 

    try:
        # Get total number of the tool types and tool proxies
        api_response = api_instance.mod_lti_get_tool_types_and_proxies_count(mod_lti_get_tool_types_and_proxies_count_request)
        print("The response of ModLtiApi->mod_lti_get_tool_types_and_proxies_count:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLtiApi->mod_lti_get_tool_types_and_proxies_count: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lti_get_tool_types_and_proxies_count_request** | [**ModLtiGetToolTypesAndProxiesCountRequest**](ModLtiGetToolTypesAndProxiesCountRequest.md)|  | 

### Return type

[**ModLtiGetToolTypesAndProxiesCount200Response**](ModLtiGetToolTypesAndProxiesCount200Response.md)

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

# **mod_lti_is_cartridge**
> ModLtiIsCartridge200Response mod_lti_is_cartridge(mod_lti_is_cartridge_request)

Determine if the given url is for a cartridge

Determine if the given url is for a cartridge

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lti_is_cartridge200_response import ModLtiIsCartridge200Response
from openapi_client.models.mod_lti_is_cartridge_request import ModLtiIsCartridgeRequest
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
    api_instance = openapi_client.ModLtiApi(api_client)
    mod_lti_is_cartridge_request = openapi_client.ModLtiIsCartridgeRequest() # ModLtiIsCartridgeRequest | 

    try:
        # Determine if the given url is for a cartridge
        api_response = api_instance.mod_lti_is_cartridge(mod_lti_is_cartridge_request)
        print("The response of ModLtiApi->mod_lti_is_cartridge:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLtiApi->mod_lti_is_cartridge: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lti_is_cartridge_request** | [**ModLtiIsCartridgeRequest**](ModLtiIsCartridgeRequest.md)|  | 

### Return type

[**ModLtiIsCartridge200Response**](ModLtiIsCartridge200Response.md)

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

# **mod_lti_toggle_showinactivitychooser**
> object mod_lti_toggle_showinactivitychooser(mod_lti_toggle_showinactivitychooser_request)

Toggle showinactivitychooser for a tool type in a course

Toggle showinactivitychooser for a tool type in a course

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lti_toggle_showinactivitychooser_request import ModLtiToggleShowinactivitychooserRequest
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
    api_instance = openapi_client.ModLtiApi(api_client)
    mod_lti_toggle_showinactivitychooser_request = openapi_client.ModLtiToggleShowinactivitychooserRequest() # ModLtiToggleShowinactivitychooserRequest | 

    try:
        # Toggle showinactivitychooser for a tool type in a course
        api_response = api_instance.mod_lti_toggle_showinactivitychooser(mod_lti_toggle_showinactivitychooser_request)
        print("The response of ModLtiApi->mod_lti_toggle_showinactivitychooser:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLtiApi->mod_lti_toggle_showinactivitychooser: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lti_toggle_showinactivitychooser_request** | [**ModLtiToggleShowinactivitychooserRequest**](ModLtiToggleShowinactivitychooserRequest.md)|  | 

### Return type

**object**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_lti_update_tool_type**
> ModLtiUpdateToolType200Response mod_lti_update_tool_type(mod_lti_update_tool_type_request)

Update a tool type

Update a tool type

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lti_update_tool_type200_response import ModLtiUpdateToolType200Response
from openapi_client.models.mod_lti_update_tool_type_request import ModLtiUpdateToolTypeRequest
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
    api_instance = openapi_client.ModLtiApi(api_client)
    mod_lti_update_tool_type_request = openapi_client.ModLtiUpdateToolTypeRequest() # ModLtiUpdateToolTypeRequest | 

    try:
        # Update a tool type
        api_response = api_instance.mod_lti_update_tool_type(mod_lti_update_tool_type_request)
        print("The response of ModLtiApi->mod_lti_update_tool_type:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLtiApi->mod_lti_update_tool_type: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lti_update_tool_type_request** | [**ModLtiUpdateToolTypeRequest**](ModLtiUpdateToolTypeRequest.md)|  | 

### Return type

[**ModLtiUpdateToolType200Response**](ModLtiUpdateToolType200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Tool |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_lti_view_lti**
> CoreCalendarDeleteSubscription200Response mod_lti_view_lti(mod_lti_view_lti_request)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_lti_view_lti_request import ModLtiViewLtiRequest
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
    api_instance = openapi_client.ModLtiApi(api_client)
    mod_lti_view_lti_request = openapi_client.ModLtiViewLtiRequest() # ModLtiViewLtiRequest | 

    try:
        # Trigger the course module viewed event and update the module completion status.
        api_response = api_instance.mod_lti_view_lti(mod_lti_view_lti_request)
        print("The response of ModLtiApi->mod_lti_view_lti:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLtiApi->mod_lti_view_lti: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lti_view_lti_request** | [**ModLtiViewLtiRequest**](ModLtiViewLtiRequest.md)|  | 

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

