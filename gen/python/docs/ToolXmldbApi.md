# openapi_client.ToolXmldbApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_xmldb_invoke_move_action**](ToolXmldbApi.md#tool_xmldb_invoke_move_action) | **POST** /tool_xmldb_invoke_move_action | moves element up/down


# **tool_xmldb_invoke_move_action**
> object tool_xmldb_invoke_move_action(tool_xmldb_invoke_move_action_request)

moves element up/down

moves element up/down

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_xmldb_invoke_move_action_request import ToolXmldbInvokeMoveActionRequest
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
    api_instance = openapi_client.ToolXmldbApi(api_client)
    tool_xmldb_invoke_move_action_request = openapi_client.ToolXmldbInvokeMoveActionRequest() # ToolXmldbInvokeMoveActionRequest | 

    try:
        # moves element up/down
        api_response = api_instance.tool_xmldb_invoke_move_action(tool_xmldb_invoke_move_action_request)
        print("The response of ToolXmldbApi->tool_xmldb_invoke_move_action:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolXmldbApi->tool_xmldb_invoke_move_action: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_xmldb_invoke_move_action_request** | [**ToolXmldbInvokeMoveActionRequest**](ToolXmldbInvokeMoveActionRequest.md)|  | 

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

