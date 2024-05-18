# openapi_client.ModChoiceApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_choice_delete_choice_responses**](ModChoiceApi.md#mod_choice_delete_choice_responses) | **POST** /mod_choice_delete_choice_responses | Delete the given submitted responses in a choice
[**mod_choice_get_choice_options**](ModChoiceApi.md#mod_choice_get_choice_options) | **POST** /mod_choice_get_choice_options | Retrieve options for a specific choice.
[**mod_choice_get_choice_results**](ModChoiceApi.md#mod_choice_get_choice_results) | **POST** /mod_choice_get_choice_results | Retrieve users results for a given choice.
[**mod_choice_get_choices_by_courses**](ModChoiceApi.md#mod_choice_get_choices_by_courses) | **POST** /mod_choice_get_choices_by_courses | Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.
[**mod_choice_submit_choice_response**](ModChoiceApi.md#mod_choice_submit_choice_response) | **POST** /mod_choice_submit_choice_response | Submit responses to a specific choice item.
[**mod_choice_view_choice**](ModChoiceApi.md#mod_choice_view_choice) | **POST** /mod_choice_view_choice | Trigger the course module viewed event and update the module completion status.


# **mod_choice_delete_choice_responses**
> ModChoiceDeleteChoiceResponses200Response mod_choice_delete_choice_responses(mod_choice_delete_choice_responses_request)

Delete the given submitted responses in a choice

Delete the given submitted responses in a choice

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_choice_delete_choice_responses200_response import ModChoiceDeleteChoiceResponses200Response
from openapi_client.models.mod_choice_delete_choice_responses_request import ModChoiceDeleteChoiceResponsesRequest
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
    api_instance = openapi_client.ModChoiceApi(api_client)
    mod_choice_delete_choice_responses_request = openapi_client.ModChoiceDeleteChoiceResponsesRequest() # ModChoiceDeleteChoiceResponsesRequest | 

    try:
        # Delete the given submitted responses in a choice
        api_response = api_instance.mod_choice_delete_choice_responses(mod_choice_delete_choice_responses_request)
        print("The response of ModChoiceApi->mod_choice_delete_choice_responses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModChoiceApi->mod_choice_delete_choice_responses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_choice_delete_choice_responses_request** | [**ModChoiceDeleteChoiceResponsesRequest**](ModChoiceDeleteChoiceResponsesRequest.md)|  | 

### Return type

[**ModChoiceDeleteChoiceResponses200Response**](ModChoiceDeleteChoiceResponses200Response.md)

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

# **mod_choice_get_choice_options**
> ModChoiceGetChoiceOptions200Response mod_choice_get_choice_options(mod_choice_get_choice_options_request)

Retrieve options for a specific choice.

Retrieve options for a specific choice.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_choice_get_choice_options200_response import ModChoiceGetChoiceOptions200Response
from openapi_client.models.mod_choice_get_choice_options_request import ModChoiceGetChoiceOptionsRequest
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
    api_instance = openapi_client.ModChoiceApi(api_client)
    mod_choice_get_choice_options_request = openapi_client.ModChoiceGetChoiceOptionsRequest() # ModChoiceGetChoiceOptionsRequest | 

    try:
        # Retrieve options for a specific choice.
        api_response = api_instance.mod_choice_get_choice_options(mod_choice_get_choice_options_request)
        print("The response of ModChoiceApi->mod_choice_get_choice_options:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModChoiceApi->mod_choice_get_choice_options: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_choice_get_choice_options_request** | [**ModChoiceGetChoiceOptionsRequest**](ModChoiceGetChoiceOptionsRequest.md)|  | 

### Return type

[**ModChoiceGetChoiceOptions200Response**](ModChoiceGetChoiceOptions200Response.md)

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

# **mod_choice_get_choice_results**
> ModChoiceGetChoiceResults200Response mod_choice_get_choice_results(mod_choice_get_choice_options_request)

Retrieve users results for a given choice.

Retrieve users results for a given choice.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_choice_get_choice_options_request import ModChoiceGetChoiceOptionsRequest
from openapi_client.models.mod_choice_get_choice_results200_response import ModChoiceGetChoiceResults200Response
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
    api_instance = openapi_client.ModChoiceApi(api_client)
    mod_choice_get_choice_options_request = openapi_client.ModChoiceGetChoiceOptionsRequest() # ModChoiceGetChoiceOptionsRequest | 

    try:
        # Retrieve users results for a given choice.
        api_response = api_instance.mod_choice_get_choice_results(mod_choice_get_choice_options_request)
        print("The response of ModChoiceApi->mod_choice_get_choice_results:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModChoiceApi->mod_choice_get_choice_results: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_choice_get_choice_options_request** | [**ModChoiceGetChoiceOptionsRequest**](ModChoiceGetChoiceOptionsRequest.md)|  | 

### Return type

[**ModChoiceGetChoiceResults200Response**](ModChoiceGetChoiceResults200Response.md)

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

# **mod_choice_get_choices_by_courses**
> ModChoiceGetChoicesByCourses200Response mod_choice_get_choices_by_courses(mod_chat_get_chats_by_courses_request)

Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.

Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_chat_get_chats_by_courses_request import ModChatGetChatsByCoursesRequest
from openapi_client.models.mod_choice_get_choices_by_courses200_response import ModChoiceGetChoicesByCourses200Response
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
    api_instance = openapi_client.ModChoiceApi(api_client)
    mod_chat_get_chats_by_courses_request = openapi_client.ModChatGetChatsByCoursesRequest() # ModChatGetChatsByCoursesRequest | 

    try:
        # Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.
        api_response = api_instance.mod_choice_get_choices_by_courses(mod_chat_get_chats_by_courses_request)
        print("The response of ModChoiceApi->mod_choice_get_choices_by_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModChoiceApi->mod_choice_get_choices_by_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md)|  | 

### Return type

[**ModChoiceGetChoicesByCourses200Response**](ModChoiceGetChoicesByCourses200Response.md)

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

# **mod_choice_submit_choice_response**
> ModChoiceSubmitChoiceResponse200Response mod_choice_submit_choice_response(mod_choice_submit_choice_response_request)

Submit responses to a specific choice item.

Submit responses to a specific choice item.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_choice_submit_choice_response200_response import ModChoiceSubmitChoiceResponse200Response
from openapi_client.models.mod_choice_submit_choice_response_request import ModChoiceSubmitChoiceResponseRequest
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
    api_instance = openapi_client.ModChoiceApi(api_client)
    mod_choice_submit_choice_response_request = openapi_client.ModChoiceSubmitChoiceResponseRequest() # ModChoiceSubmitChoiceResponseRequest | 

    try:
        # Submit responses to a specific choice item.
        api_response = api_instance.mod_choice_submit_choice_response(mod_choice_submit_choice_response_request)
        print("The response of ModChoiceApi->mod_choice_submit_choice_response:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModChoiceApi->mod_choice_submit_choice_response: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_choice_submit_choice_response_request** | [**ModChoiceSubmitChoiceResponseRequest**](ModChoiceSubmitChoiceResponseRequest.md)|  | 

### Return type

[**ModChoiceSubmitChoiceResponse200Response**](ModChoiceSubmitChoiceResponse200Response.md)

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

# **mod_choice_view_choice**
> CoreCalendarDeleteSubscription200Response mod_choice_view_choice(mod_choice_get_choice_options_request)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_choice_get_choice_options_request import ModChoiceGetChoiceOptionsRequest
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
    api_instance = openapi_client.ModChoiceApi(api_client)
    mod_choice_get_choice_options_request = openapi_client.ModChoiceGetChoiceOptionsRequest() # ModChoiceGetChoiceOptionsRequest | 

    try:
        # Trigger the course module viewed event and update the module completion status.
        api_response = api_instance.mod_choice_view_choice(mod_choice_get_choice_options_request)
        print("The response of ModChoiceApi->mod_choice_view_choice:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModChoiceApi->mod_choice_view_choice: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_choice_get_choice_options_request** | [**ModChoiceGetChoiceOptionsRequest**](ModChoiceGetChoiceOptionsRequest.md)|  | 

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

