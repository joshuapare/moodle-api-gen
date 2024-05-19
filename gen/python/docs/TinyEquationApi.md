# openapi_client.TinyEquationApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tiny_equation_filter**](TinyEquationApi.md#tiny_equation_filter) | **POST** /tiny_equation_filter | Filter the equation


# **tiny_equation_filter**
> TinyEquationFilter200Response tiny_equation_filter(tiny_equation_filter_request)

Filter the equation

Filter the equation

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tiny_equation_filter200_response import TinyEquationFilter200Response
from openapi_client.models.tiny_equation_filter_request import TinyEquationFilterRequest
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
    api_instance = openapi_client.TinyEquationApi(api_client)
    tiny_equation_filter_request = openapi_client.TinyEquationFilterRequest() # TinyEquationFilterRequest | 

    try:
        # Filter the equation
        api_response = api_instance.tiny_equation_filter(tiny_equation_filter_request)
        print("The response of TinyEquationApi->tiny_equation_filter:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TinyEquationApi->tiny_equation_filter: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tiny_equation_filter_request** | [**TinyEquationFilterRequest**](TinyEquationFilterRequest.md)|  | 

### Return type

[**TinyEquationFilter200Response**](TinyEquationFilter200Response.md)

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

