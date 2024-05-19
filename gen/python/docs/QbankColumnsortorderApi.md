# openapi_client.QbankColumnsortorderApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**qbank_columnsortorder_set_column_size**](QbankColumnsortorderApi.md#qbank_columnsortorder_set_column_size) | **POST** /qbank_columnsortorder_set_column_size | Column size
[**qbank_columnsortorder_set_columnbank_order**](QbankColumnsortorderApi.md#qbank_columnsortorder_set_columnbank_order) | **POST** /qbank_columnsortorder_set_columnbank_order | Sets question columns order in database
[**qbank_columnsortorder_set_hidden_columns**](QbankColumnsortorderApi.md#qbank_columnsortorder_set_hidden_columns) | **POST** /qbank_columnsortorder_set_hidden_columns | Hidden Columns


# **qbank_columnsortorder_set_column_size**
> object qbank_columnsortorder_set_column_size(qbank_columnsortorder_set_column_size_request)

Column size

Column size

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.qbank_columnsortorder_set_column_size_request import QbankColumnsortorderSetColumnSizeRequest
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
    api_instance = openapi_client.QbankColumnsortorderApi(api_client)
    qbank_columnsortorder_set_column_size_request = openapi_client.QbankColumnsortorderSetColumnSizeRequest() # QbankColumnsortorderSetColumnSizeRequest | 

    try:
        # Column size
        api_response = api_instance.qbank_columnsortorder_set_column_size(qbank_columnsortorder_set_column_size_request)
        print("The response of QbankColumnsortorderApi->qbank_columnsortorder_set_column_size:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QbankColumnsortorderApi->qbank_columnsortorder_set_column_size: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qbank_columnsortorder_set_column_size_request** | [**QbankColumnsortorderSetColumnSizeRequest**](QbankColumnsortorderSetColumnSizeRequest.md)|  | 

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

# **qbank_columnsortorder_set_columnbank_order**
> object qbank_columnsortorder_set_columnbank_order(qbank_columnsortorder_set_columnbank_order_request)

Sets question columns order in database

Sets question columns order in database

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.qbank_columnsortorder_set_columnbank_order_request import QbankColumnsortorderSetColumnbankOrderRequest
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
    api_instance = openapi_client.QbankColumnsortorderApi(api_client)
    qbank_columnsortorder_set_columnbank_order_request = openapi_client.QbankColumnsortorderSetColumnbankOrderRequest() # QbankColumnsortorderSetColumnbankOrderRequest | 

    try:
        # Sets question columns order in database
        api_response = api_instance.qbank_columnsortorder_set_columnbank_order(qbank_columnsortorder_set_columnbank_order_request)
        print("The response of QbankColumnsortorderApi->qbank_columnsortorder_set_columnbank_order:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QbankColumnsortorderApi->qbank_columnsortorder_set_columnbank_order: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qbank_columnsortorder_set_columnbank_order_request** | [**QbankColumnsortorderSetColumnbankOrderRequest**](QbankColumnsortorderSetColumnbankOrderRequest.md)|  | 

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

# **qbank_columnsortorder_set_hidden_columns**
> object qbank_columnsortorder_set_hidden_columns(qbank_columnsortorder_set_hidden_columns_request)

Hidden Columns

Hidden Columns

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.qbank_columnsortorder_set_hidden_columns_request import QbankColumnsortorderSetHiddenColumnsRequest
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
    api_instance = openapi_client.QbankColumnsortorderApi(api_client)
    qbank_columnsortorder_set_hidden_columns_request = openapi_client.QbankColumnsortorderSetHiddenColumnsRequest() # QbankColumnsortorderSetHiddenColumnsRequest | 

    try:
        # Hidden Columns
        api_response = api_instance.qbank_columnsortorder_set_hidden_columns(qbank_columnsortorder_set_hidden_columns_request)
        print("The response of QbankColumnsortorderApi->qbank_columnsortorder_set_hidden_columns:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QbankColumnsortorderApi->qbank_columnsortorder_set_hidden_columns: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qbank_columnsortorder_set_hidden_columns_request** | [**QbankColumnsortorderSetHiddenColumnsRequest**](QbankColumnsortorderSetHiddenColumnsRequest.md)|  | 

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

