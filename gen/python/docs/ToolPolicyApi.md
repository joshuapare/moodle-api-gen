# openapi_client.ToolPolicyApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_policy_get_policy_version**](ToolPolicyApi.md#tool_policy_get_policy_version) | **POST** /tool_policy_get_policy_version | Fetch the details of a policy version
[**tool_policy_submit_accept_on_behalf**](ToolPolicyApi.md#tool_policy_submit_accept_on_behalf) | **POST** /tool_policy_submit_accept_on_behalf | Accept policies on behalf of other users


# **tool_policy_get_policy_version**
> ToolPolicyGetPolicyVersion200Response tool_policy_get_policy_version(tool_policy_get_policy_version_request)

Fetch the details of a policy version

Fetch the details of a policy version

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_policy_get_policy_version200_response import ToolPolicyGetPolicyVersion200Response
from openapi_client.models.tool_policy_get_policy_version_request import ToolPolicyGetPolicyVersionRequest
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
    api_instance = openapi_client.ToolPolicyApi(api_client)
    tool_policy_get_policy_version_request = openapi_client.ToolPolicyGetPolicyVersionRequest() # ToolPolicyGetPolicyVersionRequest | 

    try:
        # Fetch the details of a policy version
        api_response = api_instance.tool_policy_get_policy_version(tool_policy_get_policy_version_request)
        print("The response of ToolPolicyApi->tool_policy_get_policy_version:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolPolicyApi->tool_policy_get_policy_version: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_policy_get_policy_version_request** | [**ToolPolicyGetPolicyVersionRequest**](ToolPolicyGetPolicyVersionRequest.md)|  | 

### Return type

[**ToolPolicyGetPolicyVersion200Response**](ToolPolicyGetPolicyVersion200Response.md)

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

# **tool_policy_submit_accept_on_behalf**
> object tool_policy_submit_accept_on_behalf(tool_policy_submit_accept_on_behalf_request)

Accept policies on behalf of other users

Accept policies on behalf of other users

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_policy_submit_accept_on_behalf_request import ToolPolicySubmitAcceptOnBehalfRequest
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
    api_instance = openapi_client.ToolPolicyApi(api_client)
    tool_policy_submit_accept_on_behalf_request = openapi_client.ToolPolicySubmitAcceptOnBehalfRequest() # ToolPolicySubmitAcceptOnBehalfRequest | 

    try:
        # Accept policies on behalf of other users
        api_response = api_instance.tool_policy_submit_accept_on_behalf(tool_policy_submit_accept_on_behalf_request)
        print("The response of ToolPolicyApi->tool_policy_submit_accept_on_behalf:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolPolicyApi->tool_policy_submit_accept_on_behalf: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_policy_submit_accept_on_behalf_request** | [**ToolPolicySubmitAcceptOnBehalfRequest**](ToolPolicySubmitAcceptOnBehalfRequest.md)|  | 

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

