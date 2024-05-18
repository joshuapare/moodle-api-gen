# openapi_client.ModSurveyApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_survey_get_questions**](ModSurveyApi.md#mod_survey_get_questions) | **POST** /mod_survey_get_questions | Get the complete list of questions for the survey, including subquestions.
[**mod_survey_get_surveys_by_courses**](ModSurveyApi.md#mod_survey_get_surveys_by_courses) | **POST** /mod_survey_get_surveys_by_courses | Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.
[**mod_survey_submit_answers**](ModSurveyApi.md#mod_survey_submit_answers) | **POST** /mod_survey_submit_answers | Submit the answers for a given survey.
[**mod_survey_view_survey**](ModSurveyApi.md#mod_survey_view_survey) | **POST** /mod_survey_view_survey | Trigger the course module viewed event and update the module completion status.


# **mod_survey_get_questions**
> ModSurveyGetQuestions200Response mod_survey_get_questions(mod_survey_get_questions_request)

Get the complete list of questions for the survey, including subquestions.

Get the complete list of questions for the survey, including subquestions.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_survey_get_questions200_response import ModSurveyGetQuestions200Response
from openapi_client.models.mod_survey_get_questions_request import ModSurveyGetQuestionsRequest
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
    api_instance = openapi_client.ModSurveyApi(api_client)
    mod_survey_get_questions_request = openapi_client.ModSurveyGetQuestionsRequest() # ModSurveyGetQuestionsRequest | 

    try:
        # Get the complete list of questions for the survey, including subquestions.
        api_response = api_instance.mod_survey_get_questions(mod_survey_get_questions_request)
        print("The response of ModSurveyApi->mod_survey_get_questions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModSurveyApi->mod_survey_get_questions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_survey_get_questions_request** | [**ModSurveyGetQuestionsRequest**](ModSurveyGetQuestionsRequest.md)|  | 

### Return type

[**ModSurveyGetQuestions200Response**](ModSurveyGetQuestions200Response.md)

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

# **mod_survey_get_surveys_by_courses**
> ModSurveyGetSurveysByCourses200Response mod_survey_get_surveys_by_courses(mod_chat_get_chats_by_courses_request)

Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.

Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_chat_get_chats_by_courses_request import ModChatGetChatsByCoursesRequest
from openapi_client.models.mod_survey_get_surveys_by_courses200_response import ModSurveyGetSurveysByCourses200Response
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
    api_instance = openapi_client.ModSurveyApi(api_client)
    mod_chat_get_chats_by_courses_request = openapi_client.ModChatGetChatsByCoursesRequest() # ModChatGetChatsByCoursesRequest | 

    try:
        # Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.
        api_response = api_instance.mod_survey_get_surveys_by_courses(mod_chat_get_chats_by_courses_request)
        print("The response of ModSurveyApi->mod_survey_get_surveys_by_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModSurveyApi->mod_survey_get_surveys_by_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md)|  | 

### Return type

[**ModSurveyGetSurveysByCourses200Response**](ModSurveyGetSurveysByCourses200Response.md)

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

# **mod_survey_submit_answers**
> CoreCalendarDeleteSubscription200Response mod_survey_submit_answers(mod_survey_submit_answers_request)

Submit the answers for a given survey.

Submit the answers for a given survey.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_survey_submit_answers_request import ModSurveySubmitAnswersRequest
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
    api_instance = openapi_client.ModSurveyApi(api_client)
    mod_survey_submit_answers_request = openapi_client.ModSurveySubmitAnswersRequest() # ModSurveySubmitAnswersRequest | 

    try:
        # Submit the answers for a given survey.
        api_response = api_instance.mod_survey_submit_answers(mod_survey_submit_answers_request)
        print("The response of ModSurveyApi->mod_survey_submit_answers:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModSurveyApi->mod_survey_submit_answers: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_survey_submit_answers_request** | [**ModSurveySubmitAnswersRequest**](ModSurveySubmitAnswersRequest.md)|  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

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

# **mod_survey_view_survey**
> CoreCalendarDeleteSubscription200Response mod_survey_view_survey(mod_survey_view_survey_request)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_survey_view_survey_request import ModSurveyViewSurveyRequest
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
    api_instance = openapi_client.ModSurveyApi(api_client)
    mod_survey_view_survey_request = openapi_client.ModSurveyViewSurveyRequest() # ModSurveyViewSurveyRequest | 

    try:
        # Trigger the course module viewed event and update the module completion status.
        api_response = api_instance.mod_survey_view_survey(mod_survey_view_survey_request)
        print("The response of ModSurveyApi->mod_survey_view_survey:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModSurveyApi->mod_survey_view_survey: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_survey_view_survey_request** | [**ModSurveyViewSurveyRequest**](ModSurveyViewSurveyRequest.md)|  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

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

