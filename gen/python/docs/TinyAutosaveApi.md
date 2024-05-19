# openapi_client.TinyAutosaveApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tiny_autosave_reset_session**](TinyAutosaveApi.md#tiny_autosave_reset_session) | **POST** /tiny_autosave_reset_session | Reset an autosave session
[**tiny_autosave_resume_session**](TinyAutosaveApi.md#tiny_autosave_resume_session) | **POST** /tiny_autosave_resume_session | Resume an autosave session
[**tiny_autosave_update_session**](TinyAutosaveApi.md#tiny_autosave_update_session) | **POST** /tiny_autosave_update_session | Update an autosave session


# **tiny_autosave_reset_session**
> object tiny_autosave_reset_session(tiny_autosave_reset_session_request)

Reset an autosave session

Reset an autosave session

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tiny_autosave_reset_session_request import TinyAutosaveResetSessionRequest
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
    api_instance = openapi_client.TinyAutosaveApi(api_client)
    tiny_autosave_reset_session_request = openapi_client.TinyAutosaveResetSessionRequest() # TinyAutosaveResetSessionRequest | 

    try:
        # Reset an autosave session
        api_response = api_instance.tiny_autosave_reset_session(tiny_autosave_reset_session_request)
        print("The response of TinyAutosaveApi->tiny_autosave_reset_session:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TinyAutosaveApi->tiny_autosave_reset_session: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tiny_autosave_reset_session_request** | [**TinyAutosaveResetSessionRequest**](TinyAutosaveResetSessionRequest.md)|  | 

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

# **tiny_autosave_resume_session**
> TinyAutosaveResumeSession200Response tiny_autosave_resume_session(tiny_autosave_resume_session_request)

Resume an autosave session

Resume an autosave session

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tiny_autosave_resume_session200_response import TinyAutosaveResumeSession200Response
from openapi_client.models.tiny_autosave_resume_session_request import TinyAutosaveResumeSessionRequest
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
    api_instance = openapi_client.TinyAutosaveApi(api_client)
    tiny_autosave_resume_session_request = openapi_client.TinyAutosaveResumeSessionRequest() # TinyAutosaveResumeSessionRequest | 

    try:
        # Resume an autosave session
        api_response = api_instance.tiny_autosave_resume_session(tiny_autosave_resume_session_request)
        print("The response of TinyAutosaveApi->tiny_autosave_resume_session:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TinyAutosaveApi->tiny_autosave_resume_session: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tiny_autosave_resume_session_request** | [**TinyAutosaveResumeSessionRequest**](TinyAutosaveResumeSessionRequest.md)|  | 

### Return type

[**TinyAutosaveResumeSession200Response**](TinyAutosaveResumeSession200Response.md)

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

# **tiny_autosave_update_session**
> object tiny_autosave_update_session(tiny_autosave_update_session_request)

Update an autosave session

Update an autosave session

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tiny_autosave_update_session_request import TinyAutosaveUpdateSessionRequest
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
    api_instance = openapi_client.TinyAutosaveApi(api_client)
    tiny_autosave_update_session_request = openapi_client.TinyAutosaveUpdateSessionRequest() # TinyAutosaveUpdateSessionRequest | 

    try:
        # Update an autosave session
        api_response = api_instance.tiny_autosave_update_session(tiny_autosave_update_session_request)
        print("The response of TinyAutosaveApi->tiny_autosave_update_session:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TinyAutosaveApi->tiny_autosave_update_session: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tiny_autosave_update_session_request** | [**TinyAutosaveUpdateSessionRequest**](TinyAutosaveUpdateSessionRequest.md)|  | 

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

