# openapi_client.ModQuizApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_quiz_add_random_questions**](ModQuizApi.md#mod_quiz_add_random_questions) | **POST** /mod_quiz_add_random_questions | Add a number of random questions to a quiz.
[**mod_quiz_get_attempt_access_information**](ModQuizApi.md#mod_quiz_get_attempt_access_information) | **POST** /mod_quiz_get_attempt_access_information | Return access information for a given attempt in a quiz.
[**mod_quiz_get_attempt_data**](ModQuizApi.md#mod_quiz_get_attempt_data) | **POST** /mod_quiz_get_attempt_data | Returns information for the given attempt page for a quiz attempt in progress.
[**mod_quiz_get_attempt_review**](ModQuizApi.md#mod_quiz_get_attempt_review) | **POST** /mod_quiz_get_attempt_review | Returns review information for the given finished attempt, can be used by users or teachers.
[**mod_quiz_get_attempt_summary**](ModQuizApi.md#mod_quiz_get_attempt_summary) | **POST** /mod_quiz_get_attempt_summary | Returns a summary of a quiz attempt before it is submitted.
[**mod_quiz_get_combined_review_options**](ModQuizApi.md#mod_quiz_get_combined_review_options) | **POST** /mod_quiz_get_combined_review_options | Combines the review options from a number of different quiz attempts.
[**mod_quiz_get_quiz_access_information**](ModQuizApi.md#mod_quiz_get_quiz_access_information) | **POST** /mod_quiz_get_quiz_access_information | Return access information for a given quiz.
[**mod_quiz_get_quiz_feedback_for_grade**](ModQuizApi.md#mod_quiz_get_quiz_feedback_for_grade) | **POST** /mod_quiz_get_quiz_feedback_for_grade | Get the feedback text that should be show to a student who got the given grade in the given quiz.
[**mod_quiz_get_quiz_required_qtypes**](ModQuizApi.md#mod_quiz_get_quiz_required_qtypes) | **POST** /mod_quiz_get_quiz_required_qtypes | Return the potential question types that would be required for a given quiz.
[**mod_quiz_get_quizzes_by_courses**](ModQuizApi.md#mod_quiz_get_quizzes_by_courses) | **POST** /mod_quiz_get_quizzes_by_courses | Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.
[**mod_quiz_get_reopen_attempt_confirmation**](ModQuizApi.md#mod_quiz_get_reopen_attempt_confirmation) | **POST** /mod_quiz_get_reopen_attempt_confirmation | Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.
[**mod_quiz_get_user_attempts**](ModQuizApi.md#mod_quiz_get_user_attempts) | **POST** /mod_quiz_get_user_attempts | Return a list of attempts for the given quiz and user.
[**mod_quiz_get_user_best_grade**](ModQuizApi.md#mod_quiz_get_user_best_grade) | **POST** /mod_quiz_get_user_best_grade | Get the best current grade for the given user on a quiz.
[**mod_quiz_process_attempt**](ModQuizApi.md#mod_quiz_process_attempt) | **POST** /mod_quiz_process_attempt | Process responses during an attempt at a quiz and also deals with attempts finishing.
[**mod_quiz_reopen_attempt**](ModQuizApi.md#mod_quiz_reopen_attempt) | **POST** /mod_quiz_reopen_attempt | Re-open an attempt that is currently in the never submitted state.
[**mod_quiz_save_attempt**](ModQuizApi.md#mod_quiz_save_attempt) | **POST** /mod_quiz_save_attempt | Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.
[**mod_quiz_set_question_version**](ModQuizApi.md#mod_quiz_set_question_version) | **POST** /mod_quiz_set_question_version | Set the version of question that would be required for a given quiz.
[**mod_quiz_start_attempt**](ModQuizApi.md#mod_quiz_start_attempt) | **POST** /mod_quiz_start_attempt | Starts a new attempt at a quiz.
[**mod_quiz_update_filter_condition**](ModQuizApi.md#mod_quiz_update_filter_condition) | **POST** /mod_quiz_update_filter_condition | Update filter condition for a random question slot.
[**mod_quiz_view_attempt**](ModQuizApi.md#mod_quiz_view_attempt) | **POST** /mod_quiz_view_attempt | Trigger the attempt viewed event.
[**mod_quiz_view_attempt_review**](ModQuizApi.md#mod_quiz_view_attempt_review) | **POST** /mod_quiz_view_attempt_review | Trigger the attempt reviewed event.
[**mod_quiz_view_attempt_summary**](ModQuizApi.md#mod_quiz_view_attempt_summary) | **POST** /mod_quiz_view_attempt_summary | Trigger the attempt summary viewed event.
[**mod_quiz_view_quiz**](ModQuizApi.md#mod_quiz_view_quiz) | **POST** /mod_quiz_view_quiz | Trigger the course module viewed event and update the module completion status.


# **mod_quiz_add_random_questions**
> ModQuizAddRandomQuestions200Response mod_quiz_add_random_questions(mod_quiz_add_random_questions_request)

Add a number of random questions to a quiz.

Add a number of random questions to a quiz.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_quiz_add_random_questions200_response import ModQuizAddRandomQuestions200Response
from openapi_client.models.mod_quiz_add_random_questions_request import ModQuizAddRandomQuestionsRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_add_random_questions_request = openapi_client.ModQuizAddRandomQuestionsRequest() # ModQuizAddRandomQuestionsRequest | 

    try:
        # Add a number of random questions to a quiz.
        api_response = api_instance.mod_quiz_add_random_questions(mod_quiz_add_random_questions_request)
        print("The response of ModQuizApi->mod_quiz_add_random_questions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_add_random_questions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_add_random_questions_request** | [**ModQuizAddRandomQuestionsRequest**](ModQuizAddRandomQuestionsRequest.md)|  | 

### Return type

[**ModQuizAddRandomQuestions200Response**](ModQuizAddRandomQuestions200Response.md)

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

# **mod_quiz_get_attempt_access_information**
> ModQuizGetAttemptAccessInformation200Response mod_quiz_get_attempt_access_information(mod_quiz_get_attempt_access_information_request)

Return access information for a given attempt in a quiz.

Return access information for a given attempt in a quiz.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_quiz_get_attempt_access_information200_response import ModQuizGetAttemptAccessInformation200Response
from openapi_client.models.mod_quiz_get_attempt_access_information_request import ModQuizGetAttemptAccessInformationRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_get_attempt_access_information_request = openapi_client.ModQuizGetAttemptAccessInformationRequest() # ModQuizGetAttemptAccessInformationRequest | 

    try:
        # Return access information for a given attempt in a quiz.
        api_response = api_instance.mod_quiz_get_attempt_access_information(mod_quiz_get_attempt_access_information_request)
        print("The response of ModQuizApi->mod_quiz_get_attempt_access_information:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_get_attempt_access_information: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_get_attempt_access_information_request** | [**ModQuizGetAttemptAccessInformationRequest**](ModQuizGetAttemptAccessInformationRequest.md)|  | 

### Return type

[**ModQuizGetAttemptAccessInformation200Response**](ModQuizGetAttemptAccessInformation200Response.md)

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

# **mod_quiz_get_attempt_data**
> ModQuizGetAttemptData200Response mod_quiz_get_attempt_data(mod_quiz_get_attempt_data_request)

Returns information for the given attempt page for a quiz attempt in progress.

Returns information for the given attempt page for a quiz attempt in progress.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_quiz_get_attempt_data200_response import ModQuizGetAttemptData200Response
from openapi_client.models.mod_quiz_get_attempt_data_request import ModQuizGetAttemptDataRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_get_attempt_data_request = openapi_client.ModQuizGetAttemptDataRequest() # ModQuizGetAttemptDataRequest | 

    try:
        # Returns information for the given attempt page for a quiz attempt in progress.
        api_response = api_instance.mod_quiz_get_attempt_data(mod_quiz_get_attempt_data_request)
        print("The response of ModQuizApi->mod_quiz_get_attempt_data:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_get_attempt_data: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_get_attempt_data_request** | [**ModQuizGetAttemptDataRequest**](ModQuizGetAttemptDataRequest.md)|  | 

### Return type

[**ModQuizGetAttemptData200Response**](ModQuizGetAttemptData200Response.md)

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

# **mod_quiz_get_attempt_review**
> ModQuizGetAttemptReview200Response mod_quiz_get_attempt_review(mod_quiz_get_attempt_review_request)

Returns review information for the given finished attempt, can be used by users or teachers.

Returns review information for the given finished attempt, can be used by users or teachers.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_quiz_get_attempt_review200_response import ModQuizGetAttemptReview200Response
from openapi_client.models.mod_quiz_get_attempt_review_request import ModQuizGetAttemptReviewRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_get_attempt_review_request = openapi_client.ModQuizGetAttemptReviewRequest() # ModQuizGetAttemptReviewRequest | 

    try:
        # Returns review information for the given finished attempt, can be used by users or teachers.
        api_response = api_instance.mod_quiz_get_attempt_review(mod_quiz_get_attempt_review_request)
        print("The response of ModQuizApi->mod_quiz_get_attempt_review:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_get_attempt_review: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_get_attempt_review_request** | [**ModQuizGetAttemptReviewRequest**](ModQuizGetAttemptReviewRequest.md)|  | 

### Return type

[**ModQuizGetAttemptReview200Response**](ModQuizGetAttemptReview200Response.md)

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

# **mod_quiz_get_attempt_summary**
> ModQuizGetAttemptSummary200Response mod_quiz_get_attempt_summary(mod_quiz_get_attempt_summary_request)

Returns a summary of a quiz attempt before it is submitted.

Returns a summary of a quiz attempt before it is submitted.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_quiz_get_attempt_summary200_response import ModQuizGetAttemptSummary200Response
from openapi_client.models.mod_quiz_get_attempt_summary_request import ModQuizGetAttemptSummaryRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_get_attempt_summary_request = openapi_client.ModQuizGetAttemptSummaryRequest() # ModQuizGetAttemptSummaryRequest | 

    try:
        # Returns a summary of a quiz attempt before it is submitted.
        api_response = api_instance.mod_quiz_get_attempt_summary(mod_quiz_get_attempt_summary_request)
        print("The response of ModQuizApi->mod_quiz_get_attempt_summary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_get_attempt_summary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_get_attempt_summary_request** | [**ModQuizGetAttemptSummaryRequest**](ModQuizGetAttemptSummaryRequest.md)|  | 

### Return type

[**ModQuizGetAttemptSummary200Response**](ModQuizGetAttemptSummary200Response.md)

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

# **mod_quiz_get_combined_review_options**
> ModQuizGetCombinedReviewOptions200Response mod_quiz_get_combined_review_options(mod_quiz_get_combined_review_options_request)

Combines the review options from a number of different quiz attempts.

Combines the review options from a number of different quiz attempts.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_quiz_get_combined_review_options200_response import ModQuizGetCombinedReviewOptions200Response
from openapi_client.models.mod_quiz_get_combined_review_options_request import ModQuizGetCombinedReviewOptionsRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_get_combined_review_options_request = openapi_client.ModQuizGetCombinedReviewOptionsRequest() # ModQuizGetCombinedReviewOptionsRequest | 

    try:
        # Combines the review options from a number of different quiz attempts.
        api_response = api_instance.mod_quiz_get_combined_review_options(mod_quiz_get_combined_review_options_request)
        print("The response of ModQuizApi->mod_quiz_get_combined_review_options:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_get_combined_review_options: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_get_combined_review_options_request** | [**ModQuizGetCombinedReviewOptionsRequest**](ModQuizGetCombinedReviewOptionsRequest.md)|  | 

### Return type

[**ModQuizGetCombinedReviewOptions200Response**](ModQuizGetCombinedReviewOptions200Response.md)

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

# **mod_quiz_get_quiz_access_information**
> ModQuizGetQuizAccessInformation200Response mod_quiz_get_quiz_access_information(mod_quiz_get_quiz_access_information_request)

Return access information for a given quiz.

Return access information for a given quiz.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_quiz_get_quiz_access_information200_response import ModQuizGetQuizAccessInformation200Response
from openapi_client.models.mod_quiz_get_quiz_access_information_request import ModQuizGetQuizAccessInformationRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_get_quiz_access_information_request = openapi_client.ModQuizGetQuizAccessInformationRequest() # ModQuizGetQuizAccessInformationRequest | 

    try:
        # Return access information for a given quiz.
        api_response = api_instance.mod_quiz_get_quiz_access_information(mod_quiz_get_quiz_access_information_request)
        print("The response of ModQuizApi->mod_quiz_get_quiz_access_information:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_get_quiz_access_information: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_get_quiz_access_information_request** | [**ModQuizGetQuizAccessInformationRequest**](ModQuizGetQuizAccessInformationRequest.md)|  | 

### Return type

[**ModQuizGetQuizAccessInformation200Response**](ModQuizGetQuizAccessInformation200Response.md)

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

# **mod_quiz_get_quiz_feedback_for_grade**
> ModQuizGetQuizFeedbackForGrade200Response mod_quiz_get_quiz_feedback_for_grade(mod_quiz_get_quiz_feedback_for_grade_request)

Get the feedback text that should be show to a student who got the given grade in the given quiz.

Get the feedback text that should be show to a student who got the given grade in the given quiz.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_quiz_get_quiz_feedback_for_grade200_response import ModQuizGetQuizFeedbackForGrade200Response
from openapi_client.models.mod_quiz_get_quiz_feedback_for_grade_request import ModQuizGetQuizFeedbackForGradeRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_get_quiz_feedback_for_grade_request = openapi_client.ModQuizGetQuizFeedbackForGradeRequest() # ModQuizGetQuizFeedbackForGradeRequest | 

    try:
        # Get the feedback text that should be show to a student who got the given grade in the given quiz.
        api_response = api_instance.mod_quiz_get_quiz_feedback_for_grade(mod_quiz_get_quiz_feedback_for_grade_request)
        print("The response of ModQuizApi->mod_quiz_get_quiz_feedback_for_grade:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_get_quiz_feedback_for_grade: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_get_quiz_feedback_for_grade_request** | [**ModQuizGetQuizFeedbackForGradeRequest**](ModQuizGetQuizFeedbackForGradeRequest.md)|  | 

### Return type

[**ModQuizGetQuizFeedbackForGrade200Response**](ModQuizGetQuizFeedbackForGrade200Response.md)

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

# **mod_quiz_get_quiz_required_qtypes**
> ModQuizGetQuizRequiredQtypes200Response mod_quiz_get_quiz_required_qtypes(mod_quiz_get_quiz_access_information_request)

Return the potential question types that would be required for a given quiz.

Return the potential question types that would be required for a given quiz.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_quiz_get_quiz_access_information_request import ModQuizGetQuizAccessInformationRequest
from openapi_client.models.mod_quiz_get_quiz_required_qtypes200_response import ModQuizGetQuizRequiredQtypes200Response
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_get_quiz_access_information_request = openapi_client.ModQuizGetQuizAccessInformationRequest() # ModQuizGetQuizAccessInformationRequest | 

    try:
        # Return the potential question types that would be required for a given quiz.
        api_response = api_instance.mod_quiz_get_quiz_required_qtypes(mod_quiz_get_quiz_access_information_request)
        print("The response of ModQuizApi->mod_quiz_get_quiz_required_qtypes:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_get_quiz_required_qtypes: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_get_quiz_access_information_request** | [**ModQuizGetQuizAccessInformationRequest**](ModQuizGetQuizAccessInformationRequest.md)|  | 

### Return type

[**ModQuizGetQuizRequiredQtypes200Response**](ModQuizGetQuizRequiredQtypes200Response.md)

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

# **mod_quiz_get_quizzes_by_courses**
> ModQuizGetQuizzesByCourses200Response mod_quiz_get_quizzes_by_courses(mod_chat_get_chats_by_courses_request)

Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.

Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_chat_get_chats_by_courses_request import ModChatGetChatsByCoursesRequest
from openapi_client.models.mod_quiz_get_quizzes_by_courses200_response import ModQuizGetQuizzesByCourses200Response
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_chat_get_chats_by_courses_request = openapi_client.ModChatGetChatsByCoursesRequest() # ModChatGetChatsByCoursesRequest | 

    try:
        # Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.
        api_response = api_instance.mod_quiz_get_quizzes_by_courses(mod_chat_get_chats_by_courses_request)
        print("The response of ModQuizApi->mod_quiz_get_quizzes_by_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_get_quizzes_by_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md)|  | 

### Return type

[**ModQuizGetQuizzesByCourses200Response**](ModQuizGetQuizzesByCourses200Response.md)

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

# **mod_quiz_get_reopen_attempt_confirmation**
> object mod_quiz_get_reopen_attempt_confirmation(mod_quiz_get_reopen_attempt_confirmation_request)

Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.

Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_quiz_get_reopen_attempt_confirmation_request import ModQuizGetReopenAttemptConfirmationRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_get_reopen_attempt_confirmation_request = openapi_client.ModQuizGetReopenAttemptConfirmationRequest() # ModQuizGetReopenAttemptConfirmationRequest | 

    try:
        # Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.
        api_response = api_instance.mod_quiz_get_reopen_attempt_confirmation(mod_quiz_get_reopen_attempt_confirmation_request)
        print("The response of ModQuizApi->mod_quiz_get_reopen_attempt_confirmation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_get_reopen_attempt_confirmation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_get_reopen_attempt_confirmation_request** | [**ModQuizGetReopenAttemptConfirmationRequest**](ModQuizGetReopenAttemptConfirmationRequest.md)|  | 

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
**200** | Confirmation to show the user before the attempt is reopened. |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_quiz_get_user_attempts**
> ModQuizGetUserAttempts200Response mod_quiz_get_user_attempts(mod_quiz_get_user_attempts_request)

Return a list of attempts for the given quiz and user.

Return a list of attempts for the given quiz and user.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_quiz_get_user_attempts200_response import ModQuizGetUserAttempts200Response
from openapi_client.models.mod_quiz_get_user_attempts_request import ModQuizGetUserAttemptsRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_get_user_attempts_request = openapi_client.ModQuizGetUserAttemptsRequest() # ModQuizGetUserAttemptsRequest | 

    try:
        # Return a list of attempts for the given quiz and user.
        api_response = api_instance.mod_quiz_get_user_attempts(mod_quiz_get_user_attempts_request)
        print("The response of ModQuizApi->mod_quiz_get_user_attempts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_get_user_attempts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_get_user_attempts_request** | [**ModQuizGetUserAttemptsRequest**](ModQuizGetUserAttemptsRequest.md)|  | 

### Return type

[**ModQuizGetUserAttempts200Response**](ModQuizGetUserAttempts200Response.md)

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

# **mod_quiz_get_user_best_grade**
> ModQuizGetUserBestGrade200Response mod_quiz_get_user_best_grade(mod_quiz_get_user_best_grade_request)

Get the best current grade for the given user on a quiz.

Get the best current grade for the given user on a quiz.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_quiz_get_user_best_grade200_response import ModQuizGetUserBestGrade200Response
from openapi_client.models.mod_quiz_get_user_best_grade_request import ModQuizGetUserBestGradeRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_get_user_best_grade_request = openapi_client.ModQuizGetUserBestGradeRequest() # ModQuizGetUserBestGradeRequest | 

    try:
        # Get the best current grade for the given user on a quiz.
        api_response = api_instance.mod_quiz_get_user_best_grade(mod_quiz_get_user_best_grade_request)
        print("The response of ModQuizApi->mod_quiz_get_user_best_grade:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_get_user_best_grade: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_get_user_best_grade_request** | [**ModQuizGetUserBestGradeRequest**](ModQuizGetUserBestGradeRequest.md)|  | 

### Return type

[**ModQuizGetUserBestGrade200Response**](ModQuizGetUserBestGrade200Response.md)

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

# **mod_quiz_process_attempt**
> ModQuizProcessAttempt200Response mod_quiz_process_attempt(mod_quiz_process_attempt_request)

Process responses during an attempt at a quiz and also deals with attempts finishing.

Process responses during an attempt at a quiz and also deals with attempts finishing.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_quiz_process_attempt200_response import ModQuizProcessAttempt200Response
from openapi_client.models.mod_quiz_process_attempt_request import ModQuizProcessAttemptRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_process_attempt_request = openapi_client.ModQuizProcessAttemptRequest() # ModQuizProcessAttemptRequest | 

    try:
        # Process responses during an attempt at a quiz and also deals with attempts finishing.
        api_response = api_instance.mod_quiz_process_attempt(mod_quiz_process_attempt_request)
        print("The response of ModQuizApi->mod_quiz_process_attempt:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_process_attempt: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_process_attempt_request** | [**ModQuizProcessAttemptRequest**](ModQuizProcessAttemptRequest.md)|  | 

### Return type

[**ModQuizProcessAttempt200Response**](ModQuizProcessAttempt200Response.md)

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

# **mod_quiz_reopen_attempt**
> object mod_quiz_reopen_attempt(mod_quiz_reopen_attempt_request)

Re-open an attempt that is currently in the never submitted state.

Re-open an attempt that is currently in the never submitted state.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_quiz_reopen_attempt_request import ModQuizReopenAttemptRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_reopen_attempt_request = openapi_client.ModQuizReopenAttemptRequest() # ModQuizReopenAttemptRequest | 

    try:
        # Re-open an attempt that is currently in the never submitted state.
        api_response = api_instance.mod_quiz_reopen_attempt(mod_quiz_reopen_attempt_request)
        print("The response of ModQuizApi->mod_quiz_reopen_attempt:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_reopen_attempt: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_reopen_attempt_request** | [**ModQuizReopenAttemptRequest**](ModQuizReopenAttemptRequest.md)|  | 

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

# **mod_quiz_save_attempt**
> CoreCalendarDeleteSubscription200Response mod_quiz_save_attempt(mod_quiz_save_attempt_request)

Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.

Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_quiz_save_attempt_request import ModQuizSaveAttemptRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_save_attempt_request = openapi_client.ModQuizSaveAttemptRequest() # ModQuizSaveAttemptRequest | 

    try:
        # Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.
        api_response = api_instance.mod_quiz_save_attempt(mod_quiz_save_attempt_request)
        print("The response of ModQuizApi->mod_quiz_save_attempt:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_save_attempt: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_save_attempt_request** | [**ModQuizSaveAttemptRequest**](ModQuizSaveAttemptRequest.md)|  | 

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

# **mod_quiz_set_question_version**
> ModQuizSetQuestionVersion200Response mod_quiz_set_question_version(mod_quiz_set_question_version_request)

Set the version of question that would be required for a given quiz.

Set the version of question that would be required for a given quiz.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_quiz_set_question_version200_response import ModQuizSetQuestionVersion200Response
from openapi_client.models.mod_quiz_set_question_version_request import ModQuizSetQuestionVersionRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_set_question_version_request = openapi_client.ModQuizSetQuestionVersionRequest() # ModQuizSetQuestionVersionRequest | 

    try:
        # Set the version of question that would be required for a given quiz.
        api_response = api_instance.mod_quiz_set_question_version(mod_quiz_set_question_version_request)
        print("The response of ModQuizApi->mod_quiz_set_question_version:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_set_question_version: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_set_question_version_request** | [**ModQuizSetQuestionVersionRequest**](ModQuizSetQuestionVersionRequest.md)|  | 

### Return type

[**ModQuizSetQuestionVersion200Response**](ModQuizSetQuestionVersion200Response.md)

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

# **mod_quiz_start_attempt**
> ModQuizStartAttempt200Response mod_quiz_start_attempt(mod_quiz_start_attempt_request)

Starts a new attempt at a quiz.

Starts a new attempt at a quiz.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_quiz_start_attempt200_response import ModQuizStartAttempt200Response
from openapi_client.models.mod_quiz_start_attempt_request import ModQuizStartAttemptRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_start_attempt_request = openapi_client.ModQuizStartAttemptRequest() # ModQuizStartAttemptRequest | 

    try:
        # Starts a new attempt at a quiz.
        api_response = api_instance.mod_quiz_start_attempt(mod_quiz_start_attempt_request)
        print("The response of ModQuizApi->mod_quiz_start_attempt:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_start_attempt: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_start_attempt_request** | [**ModQuizStartAttemptRequest**](ModQuizStartAttemptRequest.md)|  | 

### Return type

[**ModQuizStartAttempt200Response**](ModQuizStartAttempt200Response.md)

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

# **mod_quiz_update_filter_condition**
> ModQuizAddRandomQuestions200Response mod_quiz_update_filter_condition(mod_quiz_update_filter_condition_request)

Update filter condition for a random question slot.

Update filter condition for a random question slot.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_quiz_add_random_questions200_response import ModQuizAddRandomQuestions200Response
from openapi_client.models.mod_quiz_update_filter_condition_request import ModQuizUpdateFilterConditionRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_update_filter_condition_request = openapi_client.ModQuizUpdateFilterConditionRequest() # ModQuizUpdateFilterConditionRequest | 

    try:
        # Update filter condition for a random question slot.
        api_response = api_instance.mod_quiz_update_filter_condition(mod_quiz_update_filter_condition_request)
        print("The response of ModQuizApi->mod_quiz_update_filter_condition:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_update_filter_condition: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_update_filter_condition_request** | [**ModQuizUpdateFilterConditionRequest**](ModQuizUpdateFilterConditionRequest.md)|  | 

### Return type

[**ModQuizAddRandomQuestions200Response**](ModQuizAddRandomQuestions200Response.md)

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

# **mod_quiz_view_attempt**
> CoreCalendarDeleteSubscription200Response mod_quiz_view_attempt(mod_quiz_view_attempt_request)

Trigger the attempt viewed event.

Trigger the attempt viewed event.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_quiz_view_attempt_request import ModQuizViewAttemptRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_view_attempt_request = openapi_client.ModQuizViewAttemptRequest() # ModQuizViewAttemptRequest | 

    try:
        # Trigger the attempt viewed event.
        api_response = api_instance.mod_quiz_view_attempt(mod_quiz_view_attempt_request)
        print("The response of ModQuizApi->mod_quiz_view_attempt:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_view_attempt: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_view_attempt_request** | [**ModQuizViewAttemptRequest**](ModQuizViewAttemptRequest.md)|  | 

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

# **mod_quiz_view_attempt_review**
> CoreCalendarDeleteSubscription200Response mod_quiz_view_attempt_review(mod_quiz_view_attempt_review_request)

Trigger the attempt reviewed event.

Trigger the attempt reviewed event.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_quiz_view_attempt_review_request import ModQuizViewAttemptReviewRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_view_attempt_review_request = openapi_client.ModQuizViewAttemptReviewRequest() # ModQuizViewAttemptReviewRequest | 

    try:
        # Trigger the attempt reviewed event.
        api_response = api_instance.mod_quiz_view_attempt_review(mod_quiz_view_attempt_review_request)
        print("The response of ModQuizApi->mod_quiz_view_attempt_review:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_view_attempt_review: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_view_attempt_review_request** | [**ModQuizViewAttemptReviewRequest**](ModQuizViewAttemptReviewRequest.md)|  | 

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

# **mod_quiz_view_attempt_summary**
> CoreCalendarDeleteSubscription200Response mod_quiz_view_attempt_summary(mod_quiz_get_attempt_summary_request)

Trigger the attempt summary viewed event.

Trigger the attempt summary viewed event.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_quiz_get_attempt_summary_request import ModQuizGetAttemptSummaryRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_get_attempt_summary_request = openapi_client.ModQuizGetAttemptSummaryRequest() # ModQuizGetAttemptSummaryRequest | 

    try:
        # Trigger the attempt summary viewed event.
        api_response = api_instance.mod_quiz_view_attempt_summary(mod_quiz_get_attempt_summary_request)
        print("The response of ModQuizApi->mod_quiz_view_attempt_summary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_view_attempt_summary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_get_attempt_summary_request** | [**ModQuizGetAttemptSummaryRequest**](ModQuizGetAttemptSummaryRequest.md)|  | 

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

# **mod_quiz_view_quiz**
> CoreCalendarDeleteSubscription200Response mod_quiz_view_quiz(mod_quiz_get_quiz_access_information_request)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_quiz_get_quiz_access_information_request import ModQuizGetQuizAccessInformationRequest
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
    api_instance = openapi_client.ModQuizApi(api_client)
    mod_quiz_get_quiz_access_information_request = openapi_client.ModQuizGetQuizAccessInformationRequest() # ModQuizGetQuizAccessInformationRequest | 

    try:
        # Trigger the course module viewed event and update the module completion status.
        api_response = api_instance.mod_quiz_view_quiz(mod_quiz_get_quiz_access_information_request)
        print("The response of ModQuizApi->mod_quiz_view_quiz:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModQuizApi->mod_quiz_view_quiz: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_quiz_get_quiz_access_information_request** | [**ModQuizGetQuizAccessInformationRequest**](ModQuizGetQuizAccessInformationRequest.md)|  | 

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

