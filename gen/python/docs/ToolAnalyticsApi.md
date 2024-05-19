# openapi_client.ToolAnalyticsApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_analytics_potential_contexts**](ToolAnalyticsApi.md#tool_analytics_potential_contexts) | **POST** /tool_analytics_potential_contexts | Retrieve the list of potential contexts for a model.


# **tool_analytics_potential_contexts**
> object tool_analytics_potential_contexts(tool_analytics_potential_contexts_request)

Retrieve the list of potential contexts for a model.

Retrieve the list of potential contexts for a model.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_analytics_potential_contexts_request import ToolAnalyticsPotentialContextsRequest
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
    api_instance = openapi_client.ToolAnalyticsApi(api_client)
    tool_analytics_potential_contexts_request = openapi_client.ToolAnalyticsPotentialContextsRequest() # ToolAnalyticsPotentialContextsRequest | 

    try:
        # Retrieve the list of potential contexts for a model.
        api_response = api_instance.tool_analytics_potential_contexts(tool_analytics_potential_contexts_request)
        print("The response of ToolAnalyticsApi->tool_analytics_potential_contexts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolAnalyticsApi->tool_analytics_potential_contexts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_analytics_potential_contexts_request** | [**ToolAnalyticsPotentialContextsRequest**](ToolAnalyticsPotentialContextsRequest.md)|  | 

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

