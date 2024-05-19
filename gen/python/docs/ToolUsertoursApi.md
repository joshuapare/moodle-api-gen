# openapi_client.ToolUsertoursApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_usertours_complete_tour**](ToolUsertoursApi.md#tool_usertours_complete_tour) | **POST** /tool_usertours_complete_tour | Mark the specified tour as completed for the current user
[**tool_usertours_fetch_and_start_tour**](ToolUsertoursApi.md#tool_usertours_fetch_and_start_tour) | **POST** /tool_usertours_fetch_and_start_tour | Fetch the specified tour
[**tool_usertours_reset_tour**](ToolUsertoursApi.md#tool_usertours_reset_tour) | **POST** /tool_usertours_reset_tour | Remove the specified tour
[**tool_usertours_step_shown**](ToolUsertoursApi.md#tool_usertours_step_shown) | **POST** /tool_usertours_step_shown | Mark the specified step as completed for the current user


# **tool_usertours_complete_tour**
> object tool_usertours_complete_tour(tool_usertours_complete_tour_request)

Mark the specified tour as completed for the current user

Mark the specified tour as completed for the current user

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_usertours_complete_tour_request import ToolUsertoursCompleteTourRequest
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
    api_instance = openapi_client.ToolUsertoursApi(api_client)
    tool_usertours_complete_tour_request = openapi_client.ToolUsertoursCompleteTourRequest() # ToolUsertoursCompleteTourRequest | 

    try:
        # Mark the specified tour as completed for the current user
        api_response = api_instance.tool_usertours_complete_tour(tool_usertours_complete_tour_request)
        print("The response of ToolUsertoursApi->tool_usertours_complete_tour:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolUsertoursApi->tool_usertours_complete_tour: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_usertours_complete_tour_request** | [**ToolUsertoursCompleteTourRequest**](ToolUsertoursCompleteTourRequest.md)|  | 

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

# **tool_usertours_fetch_and_start_tour**
> ToolUsertoursFetchAndStartTour200Response tool_usertours_fetch_and_start_tour(tool_usertours_fetch_and_start_tour_request)

Fetch the specified tour

Fetch the specified tour

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_usertours_fetch_and_start_tour200_response import ToolUsertoursFetchAndStartTour200Response
from openapi_client.models.tool_usertours_fetch_and_start_tour_request import ToolUsertoursFetchAndStartTourRequest
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
    api_instance = openapi_client.ToolUsertoursApi(api_client)
    tool_usertours_fetch_and_start_tour_request = openapi_client.ToolUsertoursFetchAndStartTourRequest() # ToolUsertoursFetchAndStartTourRequest | 

    try:
        # Fetch the specified tour
        api_response = api_instance.tool_usertours_fetch_and_start_tour(tool_usertours_fetch_and_start_tour_request)
        print("The response of ToolUsertoursApi->tool_usertours_fetch_and_start_tour:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolUsertoursApi->tool_usertours_fetch_and_start_tour: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_usertours_fetch_and_start_tour_request** | [**ToolUsertoursFetchAndStartTourRequest**](ToolUsertoursFetchAndStartTourRequest.md)|  | 

### Return type

[**ToolUsertoursFetchAndStartTour200Response**](ToolUsertoursFetchAndStartTour200Response.md)

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

# **tool_usertours_reset_tour**
> ToolUsertoursResetTour200Response tool_usertours_reset_tour(tool_usertours_reset_tour_request)

Remove the specified tour

Remove the specified tour

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_usertours_reset_tour200_response import ToolUsertoursResetTour200Response
from openapi_client.models.tool_usertours_reset_tour_request import ToolUsertoursResetTourRequest
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
    api_instance = openapi_client.ToolUsertoursApi(api_client)
    tool_usertours_reset_tour_request = openapi_client.ToolUsertoursResetTourRequest() # ToolUsertoursResetTourRequest | 

    try:
        # Remove the specified tour
        api_response = api_instance.tool_usertours_reset_tour(tool_usertours_reset_tour_request)
        print("The response of ToolUsertoursApi->tool_usertours_reset_tour:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolUsertoursApi->tool_usertours_reset_tour: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_usertours_reset_tour_request** | [**ToolUsertoursResetTourRequest**](ToolUsertoursResetTourRequest.md)|  | 

### Return type

[**ToolUsertoursResetTour200Response**](ToolUsertoursResetTour200Response.md)

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

# **tool_usertours_step_shown**
> object tool_usertours_step_shown(tool_usertours_step_shown_request)

Mark the specified step as completed for the current user

Mark the specified step as completed for the current user

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_usertours_step_shown_request import ToolUsertoursStepShownRequest
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
    api_instance = openapi_client.ToolUsertoursApi(api_client)
    tool_usertours_step_shown_request = openapi_client.ToolUsertoursStepShownRequest() # ToolUsertoursStepShownRequest | 

    try:
        # Mark the specified step as completed for the current user
        api_response = api_instance.tool_usertours_step_shown(tool_usertours_step_shown_request)
        print("The response of ToolUsertoursApi->tool_usertours_step_shown:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolUsertoursApi->tool_usertours_step_shown: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_usertours_step_shown_request** | [**ToolUsertoursStepShownRequest**](ToolUsertoursStepShownRequest.md)|  | 

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

