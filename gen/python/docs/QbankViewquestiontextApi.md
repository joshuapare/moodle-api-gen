# openapi_client.QbankViewquestiontextApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**qbank_viewquestiontext_set_question_text_format**](QbankViewquestiontextApi.md#qbank_viewquestiontext_set_question_text_format) | **POST** /qbank_viewquestiontext_set_question_text_format | Sets the preference for displaying and formatting the question text


# **qbank_viewquestiontext_set_question_text_format**
> object qbank_viewquestiontext_set_question_text_format(qbank_viewquestiontext_set_question_text_format_request)

Sets the preference for displaying and formatting the question text

Sets the preference for displaying and formatting the question text

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.qbank_viewquestiontext_set_question_text_format_request import QbankViewquestiontextSetQuestionTextFormatRequest
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
    api_instance = openapi_client.QbankViewquestiontextApi(api_client)
    qbank_viewquestiontext_set_question_text_format_request = openapi_client.QbankViewquestiontextSetQuestionTextFormatRequest() # QbankViewquestiontextSetQuestionTextFormatRequest | 

    try:
        # Sets the preference for displaying and formatting the question text
        api_response = api_instance.qbank_viewquestiontext_set_question_text_format(qbank_viewquestiontext_set_question_text_format_request)
        print("The response of QbankViewquestiontextApi->qbank_viewquestiontext_set_question_text_format:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QbankViewquestiontextApi->qbank_viewquestiontext_set_question_text_format: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qbank_viewquestiontext_set_question_text_format_request** | [**QbankViewquestiontextSetQuestionTextFormatRequest**](QbankViewquestiontextSetQuestionTextFormatRequest.md)|  | 

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

