# openapi_client.ToolBehatApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_behat_get_entity_generator**](ToolBehatApi.md#tool_behat_get_entity_generator) | **POST** /tool_behat_get_entity_generator | Get the generator details for an entity


# **tool_behat_get_entity_generator**
> ToolBehatGetEntityGenerator200Response tool_behat_get_entity_generator(tool_behat_get_entity_generator_request)

Get the generator details for an entity

Get the generator details for an entity

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_behat_get_entity_generator200_response import ToolBehatGetEntityGenerator200Response
from openapi_client.models.tool_behat_get_entity_generator_request import ToolBehatGetEntityGeneratorRequest
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
    api_instance = openapi_client.ToolBehatApi(api_client)
    tool_behat_get_entity_generator_request = openapi_client.ToolBehatGetEntityGeneratorRequest() # ToolBehatGetEntityGeneratorRequest | 

    try:
        # Get the generator details for an entity
        api_response = api_instance.tool_behat_get_entity_generator(tool_behat_get_entity_generator_request)
        print("The response of ToolBehatApi->tool_behat_get_entity_generator:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolBehatApi->tool_behat_get_entity_generator: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_behat_get_entity_generator_request** | [**ToolBehatGetEntityGeneratorRequest**](ToolBehatGetEntityGeneratorRequest.md)|  | 

### Return type

[**ToolBehatGetEntityGenerator200Response**](ToolBehatGetEntityGenerator200Response.md)

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

