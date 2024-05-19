# openapi_client.TinyPremiumApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tiny_premium_get_api_key**](TinyPremiumApi.md#tiny_premium_get_api_key) | **POST** /tiny_premium_get_api_key | Get the Tiny Premium API key from Moodle


# **tiny_premium_get_api_key**
> TinyPremiumGetApiKey200Response tiny_premium_get_api_key(tiny_premium_get_api_key_request)

Get the Tiny Premium API key from Moodle

Get the Tiny Premium API key from Moodle

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tiny_premium_get_api_key200_response import TinyPremiumGetApiKey200Response
from openapi_client.models.tiny_premium_get_api_key_request import TinyPremiumGetApiKeyRequest
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
    api_instance = openapi_client.TinyPremiumApi(api_client)
    tiny_premium_get_api_key_request = openapi_client.TinyPremiumGetApiKeyRequest() # TinyPremiumGetApiKeyRequest | 

    try:
        # Get the Tiny Premium API key from Moodle
        api_response = api_instance.tiny_premium_get_api_key(tiny_premium_get_api_key_request)
        print("The response of TinyPremiumApi->tiny_premium_get_api_key:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TinyPremiumApi->tiny_premium_get_api_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tiny_premium_get_api_key_request** | [**TinyPremiumGetApiKeyRequest**](TinyPremiumGetApiKeyRequest.md)|  | 

### Return type

[**TinyPremiumGetApiKey200Response**](TinyPremiumGetApiKey200Response.md)

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

