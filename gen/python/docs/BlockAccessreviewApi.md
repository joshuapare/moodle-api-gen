# openapi_client.BlockAccessreviewApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**block_accessreview_get_module_data**](BlockAccessreviewApi.md#block_accessreview_get_module_data) | **POST** /block_accessreview_get_module_data | Gets error data for course modules.
[**block_accessreview_get_section_data**](BlockAccessreviewApi.md#block_accessreview_get_section_data) | **POST** /block_accessreview_get_section_data | Gets error data for course sections.


# **block_accessreview_get_module_data**
> object block_accessreview_get_module_data(block_accessreview_get_module_data_request)

Gets error data for course modules.

Gets error data for course modules.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_accessreview_get_module_data_request import BlockAccessreviewGetModuleDataRequest
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
    api_instance = openapi_client.BlockAccessreviewApi(api_client)
    block_accessreview_get_module_data_request = openapi_client.BlockAccessreviewGetModuleDataRequest() # BlockAccessreviewGetModuleDataRequest | 

    try:
        # Gets error data for course modules.
        api_response = api_instance.block_accessreview_get_module_data(block_accessreview_get_module_data_request)
        print("The response of BlockAccessreviewApi->block_accessreview_get_module_data:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockAccessreviewApi->block_accessreview_get_module_data: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_accessreview_get_module_data_request** | [**BlockAccessreviewGetModuleDataRequest**](BlockAccessreviewGetModuleDataRequest.md)|  | 

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

# **block_accessreview_get_section_data**
> object block_accessreview_get_section_data(block_accessreview_get_section_data_request)

Gets error data for course sections.

Gets error data for course sections.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_accessreview_get_section_data_request import BlockAccessreviewGetSectionDataRequest
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
    api_instance = openapi_client.BlockAccessreviewApi(api_client)
    block_accessreview_get_section_data_request = openapi_client.BlockAccessreviewGetSectionDataRequest() # BlockAccessreviewGetSectionDataRequest | 

    try:
        # Gets error data for course sections.
        api_response = api_instance.block_accessreview_get_section_data(block_accessreview_get_section_data_request)
        print("The response of BlockAccessreviewApi->block_accessreview_get_section_data:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockAccessreviewApi->block_accessreview_get_section_data: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_accessreview_get_section_data_request** | [**BlockAccessreviewGetSectionDataRequest**](BlockAccessreviewGetSectionDataRequest.md)|  | 

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

