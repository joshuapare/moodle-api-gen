# openapi_client.QbankEditquestionApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**qbank_editquestion_set_status**](QbankEditquestionApi.md#qbank_editquestion_set_status) | **POST** /qbank_editquestion_set_status | Update the question status.


# **qbank_editquestion_set_status**
> QbankEditquestionSetStatus200Response qbank_editquestion_set_status(qbank_editquestion_set_status_request)

Update the question status.

Update the question status.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.qbank_editquestion_set_status200_response import QbankEditquestionSetStatus200Response
from openapi_client.models.qbank_editquestion_set_status_request import QbankEditquestionSetStatusRequest
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
    api_instance = openapi_client.QbankEditquestionApi(api_client)
    qbank_editquestion_set_status_request = openapi_client.QbankEditquestionSetStatusRequest() # QbankEditquestionSetStatusRequest | 

    try:
        # Update the question status.
        api_response = api_instance.qbank_editquestion_set_status(qbank_editquestion_set_status_request)
        print("The response of QbankEditquestionApi->qbank_editquestion_set_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QbankEditquestionApi->qbank_editquestion_set_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qbank_editquestion_set_status_request** | [**QbankEditquestionSetStatusRequest**](QbankEditquestionSetStatusRequest.md)|  | 

### Return type

[**QbankEditquestionSetStatus200Response**](QbankEditquestionSetStatus200Response.md)

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

