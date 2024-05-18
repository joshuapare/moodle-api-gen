# openapi_client.QuizaccessSebApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**quizaccess_seb_validate_quiz_keys**](QuizaccessSebApi.md#quizaccess_seb_validate_quiz_keys) | **POST** /quizaccess_seb_validate_quiz_keys | Validate a Safe Exam Browser config key or a browser exam key.


# **quizaccess_seb_validate_quiz_keys**
> QuizaccessSebValidateQuizKeys200Response quizaccess_seb_validate_quiz_keys(quizaccess_seb_validate_quiz_keys_request)

Validate a Safe Exam Browser config key or a browser exam key.

Validate a Safe Exam Browser config key or a browser exam key.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.quizaccess_seb_validate_quiz_keys200_response import QuizaccessSebValidateQuizKeys200Response
from openapi_client.models.quizaccess_seb_validate_quiz_keys_request import QuizaccessSebValidateQuizKeysRequest
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
    api_instance = openapi_client.QuizaccessSebApi(api_client)
    quizaccess_seb_validate_quiz_keys_request = openapi_client.QuizaccessSebValidateQuizKeysRequest() # QuizaccessSebValidateQuizKeysRequest | 

    try:
        # Validate a Safe Exam Browser config key or a browser exam key.
        api_response = api_instance.quizaccess_seb_validate_quiz_keys(quizaccess_seb_validate_quiz_keys_request)
        print("The response of QuizaccessSebApi->quizaccess_seb_validate_quiz_keys:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QuizaccessSebApi->quizaccess_seb_validate_quiz_keys: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quizaccess_seb_validate_quiz_keys_request** | [**QuizaccessSebValidateQuizKeysRequest**](QuizaccessSebValidateQuizKeysRequest.md)|  | 

### Return type

[**QuizaccessSebValidateQuizKeys200Response**](QuizaccessSebValidateQuizKeys200Response.md)

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

