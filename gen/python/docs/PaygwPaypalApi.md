# openapi_client.PaygwPaypalApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paygw_paypal_create_transaction_complete**](PaygwPaypalApi.md#paygw_paypal_create_transaction_complete) | **POST** /paygw_paypal_create_transaction_complete | Takes care of what needs to be done when a PayPal transaction comes back as complete.
[**paygw_paypal_get_config_for_js**](PaygwPaypalApi.md#paygw_paypal_get_config_for_js) | **POST** /paygw_paypal_get_config_for_js | Returns the configuration settings to be used in js


# **paygw_paypal_create_transaction_complete**
> PaygwPaypalCreateTransactionComplete200Response paygw_paypal_create_transaction_complete(paygw_paypal_create_transaction_complete_request)

Takes care of what needs to be done when a PayPal transaction comes back as complete.

Takes care of what needs to be done when a PayPal transaction comes back as complete.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.paygw_paypal_create_transaction_complete200_response import PaygwPaypalCreateTransactionComplete200Response
from openapi_client.models.paygw_paypal_create_transaction_complete_request import PaygwPaypalCreateTransactionCompleteRequest
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
    api_instance = openapi_client.PaygwPaypalApi(api_client)
    paygw_paypal_create_transaction_complete_request = openapi_client.PaygwPaypalCreateTransactionCompleteRequest() # PaygwPaypalCreateTransactionCompleteRequest | 

    try:
        # Takes care of what needs to be done when a PayPal transaction comes back as complete.
        api_response = api_instance.paygw_paypal_create_transaction_complete(paygw_paypal_create_transaction_complete_request)
        print("The response of PaygwPaypalApi->paygw_paypal_create_transaction_complete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PaygwPaypalApi->paygw_paypal_create_transaction_complete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paygw_paypal_create_transaction_complete_request** | [**PaygwPaypalCreateTransactionCompleteRequest**](PaygwPaypalCreateTransactionCompleteRequest.md)|  | 

### Return type

[**PaygwPaypalCreateTransactionComplete200Response**](PaygwPaypalCreateTransactionComplete200Response.md)

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

# **paygw_paypal_get_config_for_js**
> PaygwPaypalGetConfigForJs200Response paygw_paypal_get_config_for_js(paygw_paypal_get_config_for_js_request)

Returns the configuration settings to be used in js

Returns the configuration settings to be used in js

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.paygw_paypal_get_config_for_js200_response import PaygwPaypalGetConfigForJs200Response
from openapi_client.models.paygw_paypal_get_config_for_js_request import PaygwPaypalGetConfigForJsRequest
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
    api_instance = openapi_client.PaygwPaypalApi(api_client)
    paygw_paypal_get_config_for_js_request = openapi_client.PaygwPaypalGetConfigForJsRequest() # PaygwPaypalGetConfigForJsRequest | 

    try:
        # Returns the configuration settings to be used in js
        api_response = api_instance.paygw_paypal_get_config_for_js(paygw_paypal_get_config_for_js_request)
        print("The response of PaygwPaypalApi->paygw_paypal_get_config_for_js:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PaygwPaypalApi->paygw_paypal_get_config_for_js: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paygw_paypal_get_config_for_js_request** | [**PaygwPaypalGetConfigForJsRequest**](PaygwPaypalGetConfigForJsRequest.md)|  | 

### Return type

[**PaygwPaypalGetConfigForJs200Response**](PaygwPaypalGetConfigForJs200Response.md)

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

