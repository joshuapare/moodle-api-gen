# openapi_client.ToolIomadpolicyApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_iomadpolicy_get_iomadpolicy_version**](ToolIomadpolicyApi.md#tool_iomadpolicy_get_iomadpolicy_version) | **POST** /tool_iomadpolicy_get_iomadpolicy_version | Fetch the details of a iomadpolicy version
[**tool_iomadpolicy_submit_accept_on_behalf**](ToolIomadpolicyApi.md#tool_iomadpolicy_submit_accept_on_behalf) | **POST** /tool_iomadpolicy_submit_accept_on_behalf | Accept policies on behalf of other users


# **tool_iomadpolicy_get_iomadpolicy_version**
> ToolIomadpolicyGetIomadpolicyVersion200Response tool_iomadpolicy_get_iomadpolicy_version(tool_iomadpolicy_get_iomadpolicy_version_request)

Fetch the details of a iomadpolicy version

Fetch the details of a iomadpolicy version

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_iomadpolicy_get_iomadpolicy_version200_response import ToolIomadpolicyGetIomadpolicyVersion200Response
from openapi_client.models.tool_iomadpolicy_get_iomadpolicy_version_request import ToolIomadpolicyGetIomadpolicyVersionRequest
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
    api_instance = openapi_client.ToolIomadpolicyApi(api_client)
    tool_iomadpolicy_get_iomadpolicy_version_request = openapi_client.ToolIomadpolicyGetIomadpolicyVersionRequest() # ToolIomadpolicyGetIomadpolicyVersionRequest | 

    try:
        # Fetch the details of a iomadpolicy version
        api_response = api_instance.tool_iomadpolicy_get_iomadpolicy_version(tool_iomadpolicy_get_iomadpolicy_version_request)
        print("The response of ToolIomadpolicyApi->tool_iomadpolicy_get_iomadpolicy_version:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolIomadpolicyApi->tool_iomadpolicy_get_iomadpolicy_version: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_iomadpolicy_get_iomadpolicy_version_request** | [**ToolIomadpolicyGetIomadpolicyVersionRequest**](ToolIomadpolicyGetIomadpolicyVersionRequest.md)|  | 

### Return type

[**ToolIomadpolicyGetIomadpolicyVersion200Response**](ToolIomadpolicyGetIomadpolicyVersion200Response.md)

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

# **tool_iomadpolicy_submit_accept_on_behalf**
> object tool_iomadpolicy_submit_accept_on_behalf(tool_iomadpolicy_submit_accept_on_behalf_request)

Accept policies on behalf of other users

Accept policies on behalf of other users

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_iomadpolicy_submit_accept_on_behalf_request import ToolIomadpolicySubmitAcceptOnBehalfRequest
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
    api_instance = openapi_client.ToolIomadpolicyApi(api_client)
    tool_iomadpolicy_submit_accept_on_behalf_request = openapi_client.ToolIomadpolicySubmitAcceptOnBehalfRequest() # ToolIomadpolicySubmitAcceptOnBehalfRequest | 

    try:
        # Accept policies on behalf of other users
        api_response = api_instance.tool_iomadpolicy_submit_accept_on_behalf(tool_iomadpolicy_submit_accept_on_behalf_request)
        print("The response of ToolIomadpolicyApi->tool_iomadpolicy_submit_accept_on_behalf:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolIomadpolicyApi->tool_iomadpolicy_submit_accept_on_behalf: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_iomadpolicy_submit_accept_on_behalf_request** | [**ToolIomadpolicySubmitAcceptOnBehalfRequest**](ToolIomadpolicySubmitAcceptOnBehalfRequest.md)|  | 

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
**200** | success |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

