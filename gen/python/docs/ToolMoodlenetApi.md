# openapi_client.ToolMoodlenetApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_moodlenet_search_courses**](ToolMoodlenetApi.md#tool_moodlenet_search_courses) | **POST** /tool_moodlenet_search_courses | For some given input search for a course that matches
[**tool_moodlenet_verify_webfinger**](ToolMoodlenetApi.md#tool_moodlenet_verify_webfinger) | **POST** /tool_moodlenet_verify_webfinger | Verify if the passed information resolves into a WebFinger profile URL


# **tool_moodlenet_search_courses**
> ToolMoodlenetSearchCourses200Response tool_moodlenet_search_courses(tool_moodlenet_search_courses_request)

For some given input search for a course that matches

For some given input search for a course that matches

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_moodlenet_search_courses200_response import ToolMoodlenetSearchCourses200Response
from openapi_client.models.tool_moodlenet_search_courses_request import ToolMoodlenetSearchCoursesRequest
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
    api_instance = openapi_client.ToolMoodlenetApi(api_client)
    tool_moodlenet_search_courses_request = openapi_client.ToolMoodlenetSearchCoursesRequest() # ToolMoodlenetSearchCoursesRequest | 

    try:
        # For some given input search for a course that matches
        api_response = api_instance.tool_moodlenet_search_courses(tool_moodlenet_search_courses_request)
        print("The response of ToolMoodlenetApi->tool_moodlenet_search_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolMoodlenetApi->tool_moodlenet_search_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_moodlenet_search_courses_request** | [**ToolMoodlenetSearchCoursesRequest**](ToolMoodlenetSearchCoursesRequest.md)|  | 

### Return type

[**ToolMoodlenetSearchCourses200Response**](ToolMoodlenetSearchCourses200Response.md)

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

# **tool_moodlenet_verify_webfinger**
> ToolMoodlenetVerifyWebfinger200Response tool_moodlenet_verify_webfinger(tool_moodlenet_verify_webfinger_request)

Verify if the passed information resolves into a WebFinger profile URL

Verify if the passed information resolves into a WebFinger profile URL

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_moodlenet_verify_webfinger200_response import ToolMoodlenetVerifyWebfinger200Response
from openapi_client.models.tool_moodlenet_verify_webfinger_request import ToolMoodlenetVerifyWebfingerRequest
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
    api_instance = openapi_client.ToolMoodlenetApi(api_client)
    tool_moodlenet_verify_webfinger_request = openapi_client.ToolMoodlenetVerifyWebfingerRequest() # ToolMoodlenetVerifyWebfingerRequest | 

    try:
        # Verify if the passed information resolves into a WebFinger profile URL
        api_response = api_instance.tool_moodlenet_verify_webfinger(tool_moodlenet_verify_webfinger_request)
        print("The response of ToolMoodlenetApi->tool_moodlenet_verify_webfinger:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolMoodlenetApi->tool_moodlenet_verify_webfinger: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_moodlenet_verify_webfinger_request** | [**ToolMoodlenetVerifyWebfingerRequest**](ToolMoodlenetVerifyWebfingerRequest.md)|  | 

### Return type

[**ToolMoodlenetVerifyWebfinger200Response**](ToolMoodlenetVerifyWebfinger200Response.md)

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

