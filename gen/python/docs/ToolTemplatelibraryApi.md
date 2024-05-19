# openapi_client.ToolTemplatelibraryApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_templatelibrary_list_templates**](ToolTemplatelibraryApi.md#tool_templatelibrary_list_templates) | **POST** /tool_templatelibrary_list_templates | List/search templates by component.
[**tool_templatelibrary_load_canonical_template**](ToolTemplatelibraryApi.md#tool_templatelibrary_load_canonical_template) | **POST** /tool_templatelibrary_load_canonical_template | Load a canonical template by name (not the theme overidden one).


# **tool_templatelibrary_list_templates**
> object tool_templatelibrary_list_templates(tool_templatelibrary_list_templates_request)

List/search templates by component.

List/search templates by component.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_templatelibrary_list_templates_request import ToolTemplatelibraryListTemplatesRequest
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
    api_instance = openapi_client.ToolTemplatelibraryApi(api_client)
    tool_templatelibrary_list_templates_request = openapi_client.ToolTemplatelibraryListTemplatesRequest() # ToolTemplatelibraryListTemplatesRequest | 

    try:
        # List/search templates by component.
        api_response = api_instance.tool_templatelibrary_list_templates(tool_templatelibrary_list_templates_request)
        print("The response of ToolTemplatelibraryApi->tool_templatelibrary_list_templates:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolTemplatelibraryApi->tool_templatelibrary_list_templates: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_templatelibrary_list_templates_request** | [**ToolTemplatelibraryListTemplatesRequest**](ToolTemplatelibraryListTemplatesRequest.md)|  | 

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

# **tool_templatelibrary_load_canonical_template**
> object tool_templatelibrary_load_canonical_template(tool_templatelibrary_load_canonical_template_request)

Load a canonical template by name (not the theme overidden one).

Load a canonical template by name (not the theme overidden one).

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_templatelibrary_load_canonical_template_request import ToolTemplatelibraryLoadCanonicalTemplateRequest
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
    api_instance = openapi_client.ToolTemplatelibraryApi(api_client)
    tool_templatelibrary_load_canonical_template_request = openapi_client.ToolTemplatelibraryLoadCanonicalTemplateRequest() # ToolTemplatelibraryLoadCanonicalTemplateRequest | 

    try:
        # Load a canonical template by name (not the theme overidden one).
        api_response = api_instance.tool_templatelibrary_load_canonical_template(tool_templatelibrary_load_canonical_template_request)
        print("The response of ToolTemplatelibraryApi->tool_templatelibrary_load_canonical_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolTemplatelibraryApi->tool_templatelibrary_load_canonical_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_templatelibrary_load_canonical_template_request** | [**ToolTemplatelibraryLoadCanonicalTemplateRequest**](ToolTemplatelibraryLoadCanonicalTemplateRequest.md)|  | 

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
**200** | template |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

