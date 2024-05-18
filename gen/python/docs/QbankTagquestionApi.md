# openapi_client.QbankTagquestionApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**qbank_tagquestion_submit_tags_form**](QbankTagquestionApi.md#qbank_tagquestion_submit_tags_form) | **POST** /qbank_tagquestion_submit_tags_form | Update the question tags.


# **qbank_tagquestion_submit_tags_form**
> CoreQuestionSubmitTagsForm200Response qbank_tagquestion_submit_tags_form(qbank_tagquestion_submit_tags_form_request)

Update the question tags.

Update the question tags.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_question_submit_tags_form200_response import CoreQuestionSubmitTagsForm200Response
from openapi_client.models.qbank_tagquestion_submit_tags_form_request import QbankTagquestionSubmitTagsFormRequest
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
    api_instance = openapi_client.QbankTagquestionApi(api_client)
    qbank_tagquestion_submit_tags_form_request = openapi_client.QbankTagquestionSubmitTagsFormRequest() # QbankTagquestionSubmitTagsFormRequest | 

    try:
        # Update the question tags.
        api_response = api_instance.qbank_tagquestion_submit_tags_form(qbank_tagquestion_submit_tags_form_request)
        print("The response of QbankTagquestionApi->qbank_tagquestion_submit_tags_form:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QbankTagquestionApi->qbank_tagquestion_submit_tags_form: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qbank_tagquestion_submit_tags_form_request** | [**QbankTagquestionSubmitTagsFormRequest**](QbankTagquestionSubmitTagsFormRequest.md)|  | 

### Return type

[**CoreQuestionSubmitTagsForm200Response**](CoreQuestionSubmitTagsForm200Response.md)

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

