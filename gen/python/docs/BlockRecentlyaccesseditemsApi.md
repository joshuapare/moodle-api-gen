# openapi_client.BlockRecentlyaccesseditemsApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**block_recentlyaccesseditems_get_recent_items**](BlockRecentlyaccesseditemsApi.md#block_recentlyaccesseditems_get_recent_items) | **POST** /block_recentlyaccesseditems_get_recent_items | List of items a user has accessed most recently.


# **block_recentlyaccesseditems_get_recent_items**
> object block_recentlyaccesseditems_get_recent_items(block_recentlyaccesseditems_get_recent_items_request)

List of items a user has accessed most recently.

List of items a user has accessed most recently.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_recentlyaccesseditems_get_recent_items_request import BlockRecentlyaccesseditemsGetRecentItemsRequest
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
    api_instance = openapi_client.BlockRecentlyaccesseditemsApi(api_client)
    block_recentlyaccesseditems_get_recent_items_request = openapi_client.BlockRecentlyaccesseditemsGetRecentItemsRequest() # BlockRecentlyaccesseditemsGetRecentItemsRequest | 

    try:
        # List of items a user has accessed most recently.
        api_response = api_instance.block_recentlyaccesseditems_get_recent_items(block_recentlyaccesseditems_get_recent_items_request)
        print("The response of BlockRecentlyaccesseditemsApi->block_recentlyaccesseditems_get_recent_items:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockRecentlyaccesseditemsApi->block_recentlyaccesseditems_get_recent_items: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_recentlyaccesseditems_get_recent_items_request** | [**BlockRecentlyaccesseditemsGetRecentItemsRequest**](BlockRecentlyaccesseditemsGetRecentItemsRequest.md)|  | 

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
**200** | The most recently accessed activities/resources by the logged user |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

