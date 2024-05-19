# openapi_client.ModFeedbackApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_feedback_get_analysis**](ModFeedbackApi.md#mod_feedback_get_analysis) | **POST** /mod_feedback_get_analysis | Retrieves the feedback analysis.
[**mod_feedback_get_current_completed_tmp**](ModFeedbackApi.md#mod_feedback_get_current_completed_tmp) | **POST** /mod_feedback_get_current_completed_tmp | Returns the temporary completion record for the current user.
[**mod_feedback_get_feedback_access_information**](ModFeedbackApi.md#mod_feedback_get_feedback_access_information) | **POST** /mod_feedback_get_feedback_access_information | Return access information for a given feedback.
[**mod_feedback_get_feedbacks_by_courses**](ModFeedbackApi.md#mod_feedback_get_feedbacks_by_courses) | **POST** /mod_feedback_get_feedbacks_by_courses | Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.
[**mod_feedback_get_finished_responses**](ModFeedbackApi.md#mod_feedback_get_finished_responses) | **POST** /mod_feedback_get_finished_responses | Retrieves responses from the last finished attempt.
[**mod_feedback_get_items**](ModFeedbackApi.md#mod_feedback_get_items) | **POST** /mod_feedback_get_items | Returns the items (questions) in the given feedback.
[**mod_feedback_get_last_completed**](ModFeedbackApi.md#mod_feedback_get_last_completed) | **POST** /mod_feedback_get_last_completed | Retrieves the last completion record for the current user.
[**mod_feedback_get_non_respondents**](ModFeedbackApi.md#mod_feedback_get_non_respondents) | **POST** /mod_feedback_get_non_respondents | Retrieves a list of students who didn&#39;t submit the feedback.
[**mod_feedback_get_page_items**](ModFeedbackApi.md#mod_feedback_get_page_items) | **POST** /mod_feedback_get_page_items | Get a single feedback page items.
[**mod_feedback_get_responses_analysis**](ModFeedbackApi.md#mod_feedback_get_responses_analysis) | **POST** /mod_feedback_get_responses_analysis | Return the feedback user responses analysis.
[**mod_feedback_get_unfinished_responses**](ModFeedbackApi.md#mod_feedback_get_unfinished_responses) | **POST** /mod_feedback_get_unfinished_responses | Retrieves responses from the current unfinished attempt.
[**mod_feedback_launch_feedback**](ModFeedbackApi.md#mod_feedback_launch_feedback) | **POST** /mod_feedback_launch_feedback | Starts or continues a feedback submission.
[**mod_feedback_process_page**](ModFeedbackApi.md#mod_feedback_process_page) | **POST** /mod_feedback_process_page | Process a jump between pages.
[**mod_feedback_view_feedback**](ModFeedbackApi.md#mod_feedback_view_feedback) | **POST** /mod_feedback_view_feedback | Trigger the course module viewed event and update the module completion status.


# **mod_feedback_get_analysis**
> ModFeedbackGetAnalysis200Response mod_feedback_get_analysis(mod_feedback_get_analysis_request)

Retrieves the feedback analysis.

Retrieves the feedback analysis.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_feedback_get_analysis200_response import ModFeedbackGetAnalysis200Response
from openapi_client.models.mod_feedback_get_analysis_request import ModFeedbackGetAnalysisRequest
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
    api_instance = openapi_client.ModFeedbackApi(api_client)
    mod_feedback_get_analysis_request = openapi_client.ModFeedbackGetAnalysisRequest() # ModFeedbackGetAnalysisRequest | 

    try:
        # Retrieves the feedback analysis.
        api_response = api_instance.mod_feedback_get_analysis(mod_feedback_get_analysis_request)
        print("The response of ModFeedbackApi->mod_feedback_get_analysis:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModFeedbackApi->mod_feedback_get_analysis: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_feedback_get_analysis_request** | [**ModFeedbackGetAnalysisRequest**](ModFeedbackGetAnalysisRequest.md)|  | 

### Return type

[**ModFeedbackGetAnalysis200Response**](ModFeedbackGetAnalysis200Response.md)

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

# **mod_feedback_get_current_completed_tmp**
> ModFeedbackGetCurrentCompletedTmp200Response mod_feedback_get_current_completed_tmp(mod_feedback_get_current_completed_tmp_request)

Returns the temporary completion record for the current user.

Returns the temporary completion record for the current user.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_feedback_get_current_completed_tmp200_response import ModFeedbackGetCurrentCompletedTmp200Response
from openapi_client.models.mod_feedback_get_current_completed_tmp_request import ModFeedbackGetCurrentCompletedTmpRequest
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
    api_instance = openapi_client.ModFeedbackApi(api_client)
    mod_feedback_get_current_completed_tmp_request = openapi_client.ModFeedbackGetCurrentCompletedTmpRequest() # ModFeedbackGetCurrentCompletedTmpRequest | 

    try:
        # Returns the temporary completion record for the current user.
        api_response = api_instance.mod_feedback_get_current_completed_tmp(mod_feedback_get_current_completed_tmp_request)
        print("The response of ModFeedbackApi->mod_feedback_get_current_completed_tmp:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModFeedbackApi->mod_feedback_get_current_completed_tmp: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_feedback_get_current_completed_tmp_request** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md)|  | 

### Return type

[**ModFeedbackGetCurrentCompletedTmp200Response**](ModFeedbackGetCurrentCompletedTmp200Response.md)

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

# **mod_feedback_get_feedback_access_information**
> ModFeedbackGetFeedbackAccessInformation200Response mod_feedback_get_feedback_access_information(mod_feedback_get_feedback_access_information_request)

Return access information for a given feedback.

Return access information for a given feedback.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_feedback_get_feedback_access_information200_response import ModFeedbackGetFeedbackAccessInformation200Response
from openapi_client.models.mod_feedback_get_feedback_access_information_request import ModFeedbackGetFeedbackAccessInformationRequest
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
    api_instance = openapi_client.ModFeedbackApi(api_client)
    mod_feedback_get_feedback_access_information_request = openapi_client.ModFeedbackGetFeedbackAccessInformationRequest() # ModFeedbackGetFeedbackAccessInformationRequest | 

    try:
        # Return access information for a given feedback.
        api_response = api_instance.mod_feedback_get_feedback_access_information(mod_feedback_get_feedback_access_information_request)
        print("The response of ModFeedbackApi->mod_feedback_get_feedback_access_information:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModFeedbackApi->mod_feedback_get_feedback_access_information: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_feedback_get_feedback_access_information_request** | [**ModFeedbackGetFeedbackAccessInformationRequest**](ModFeedbackGetFeedbackAccessInformationRequest.md)|  | 

### Return type

[**ModFeedbackGetFeedbackAccessInformation200Response**](ModFeedbackGetFeedbackAccessInformation200Response.md)

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

# **mod_feedback_get_feedbacks_by_courses**
> ModFeedbackGetFeedbacksByCourses200Response mod_feedback_get_feedbacks_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)

Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.

Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request import ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest
from openapi_client.models.mod_feedback_get_feedbacks_by_courses200_response import ModFeedbackGetFeedbacksByCourses200Response
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
    api_instance = openapi_client.ModFeedbackApi(api_client)
    mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request = openapi_client.ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest() # ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 

    try:
        # Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.
        api_response = api_instance.mod_feedback_get_feedbacks_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)
        print("The response of ModFeedbackApi->mod_feedback_get_feedbacks_by_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModFeedbackApi->mod_feedback_get_feedbacks_by_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md)|  | 

### Return type

[**ModFeedbackGetFeedbacksByCourses200Response**](ModFeedbackGetFeedbacksByCourses200Response.md)

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

# **mod_feedback_get_finished_responses**
> ModFeedbackGetFinishedResponses200Response mod_feedback_get_finished_responses(mod_feedback_get_finished_responses_request)

Retrieves responses from the last finished attempt.

Retrieves responses from the last finished attempt.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_feedback_get_finished_responses200_response import ModFeedbackGetFinishedResponses200Response
from openapi_client.models.mod_feedback_get_finished_responses_request import ModFeedbackGetFinishedResponsesRequest
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
    api_instance = openapi_client.ModFeedbackApi(api_client)
    mod_feedback_get_finished_responses_request = openapi_client.ModFeedbackGetFinishedResponsesRequest() # ModFeedbackGetFinishedResponsesRequest | 

    try:
        # Retrieves responses from the last finished attempt.
        api_response = api_instance.mod_feedback_get_finished_responses(mod_feedback_get_finished_responses_request)
        print("The response of ModFeedbackApi->mod_feedback_get_finished_responses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModFeedbackApi->mod_feedback_get_finished_responses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_feedback_get_finished_responses_request** | [**ModFeedbackGetFinishedResponsesRequest**](ModFeedbackGetFinishedResponsesRequest.md)|  | 

### Return type

[**ModFeedbackGetFinishedResponses200Response**](ModFeedbackGetFinishedResponses200Response.md)

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

# **mod_feedback_get_items**
> ModFeedbackGetItems200Response mod_feedback_get_items(mod_feedback_get_current_completed_tmp_request)

Returns the items (questions) in the given feedback.

Returns the items (questions) in the given feedback.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_feedback_get_current_completed_tmp_request import ModFeedbackGetCurrentCompletedTmpRequest
from openapi_client.models.mod_feedback_get_items200_response import ModFeedbackGetItems200Response
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
    api_instance = openapi_client.ModFeedbackApi(api_client)
    mod_feedback_get_current_completed_tmp_request = openapi_client.ModFeedbackGetCurrentCompletedTmpRequest() # ModFeedbackGetCurrentCompletedTmpRequest | 

    try:
        # Returns the items (questions) in the given feedback.
        api_response = api_instance.mod_feedback_get_items(mod_feedback_get_current_completed_tmp_request)
        print("The response of ModFeedbackApi->mod_feedback_get_items:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModFeedbackApi->mod_feedback_get_items: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_feedback_get_current_completed_tmp_request** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md)|  | 

### Return type

[**ModFeedbackGetItems200Response**](ModFeedbackGetItems200Response.md)

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

# **mod_feedback_get_last_completed**
> ModFeedbackGetLastCompleted200Response mod_feedback_get_last_completed(mod_feedback_get_current_completed_tmp_request)

Retrieves the last completion record for the current user.

Retrieves the last completion record for the current user.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_feedback_get_current_completed_tmp_request import ModFeedbackGetCurrentCompletedTmpRequest
from openapi_client.models.mod_feedback_get_last_completed200_response import ModFeedbackGetLastCompleted200Response
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
    api_instance = openapi_client.ModFeedbackApi(api_client)
    mod_feedback_get_current_completed_tmp_request = openapi_client.ModFeedbackGetCurrentCompletedTmpRequest() # ModFeedbackGetCurrentCompletedTmpRequest | 

    try:
        # Retrieves the last completion record for the current user.
        api_response = api_instance.mod_feedback_get_last_completed(mod_feedback_get_current_completed_tmp_request)
        print("The response of ModFeedbackApi->mod_feedback_get_last_completed:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModFeedbackApi->mod_feedback_get_last_completed: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_feedback_get_current_completed_tmp_request** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md)|  | 

### Return type

[**ModFeedbackGetLastCompleted200Response**](ModFeedbackGetLastCompleted200Response.md)

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

# **mod_feedback_get_non_respondents**
> ModFeedbackGetNonRespondents200Response mod_feedback_get_non_respondents(mod_feedback_get_non_respondents_request)

Retrieves a list of students who didn't submit the feedback.

Retrieves a list of students who didn't submit the feedback.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_feedback_get_non_respondents200_response import ModFeedbackGetNonRespondents200Response
from openapi_client.models.mod_feedback_get_non_respondents_request import ModFeedbackGetNonRespondentsRequest
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
    api_instance = openapi_client.ModFeedbackApi(api_client)
    mod_feedback_get_non_respondents_request = openapi_client.ModFeedbackGetNonRespondentsRequest() # ModFeedbackGetNonRespondentsRequest | 

    try:
        # Retrieves a list of students who didn't submit the feedback.
        api_response = api_instance.mod_feedback_get_non_respondents(mod_feedback_get_non_respondents_request)
        print("The response of ModFeedbackApi->mod_feedback_get_non_respondents:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModFeedbackApi->mod_feedback_get_non_respondents: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_feedback_get_non_respondents_request** | [**ModFeedbackGetNonRespondentsRequest**](ModFeedbackGetNonRespondentsRequest.md)|  | 

### Return type

[**ModFeedbackGetNonRespondents200Response**](ModFeedbackGetNonRespondents200Response.md)

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

# **mod_feedback_get_page_items**
> ModFeedbackGetPageItems200Response mod_feedback_get_page_items(mod_feedback_get_page_items_request)

Get a single feedback page items.

Get a single feedback page items.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_feedback_get_page_items200_response import ModFeedbackGetPageItems200Response
from openapi_client.models.mod_feedback_get_page_items_request import ModFeedbackGetPageItemsRequest
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
    api_instance = openapi_client.ModFeedbackApi(api_client)
    mod_feedback_get_page_items_request = openapi_client.ModFeedbackGetPageItemsRequest() # ModFeedbackGetPageItemsRequest | 

    try:
        # Get a single feedback page items.
        api_response = api_instance.mod_feedback_get_page_items(mod_feedback_get_page_items_request)
        print("The response of ModFeedbackApi->mod_feedback_get_page_items:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModFeedbackApi->mod_feedback_get_page_items: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_feedback_get_page_items_request** | [**ModFeedbackGetPageItemsRequest**](ModFeedbackGetPageItemsRequest.md)|  | 

### Return type

[**ModFeedbackGetPageItems200Response**](ModFeedbackGetPageItems200Response.md)

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

# **mod_feedback_get_responses_analysis**
> ModFeedbackGetResponsesAnalysis200Response mod_feedback_get_responses_analysis(mod_feedback_get_responses_analysis_request)

Return the feedback user responses analysis.

Return the feedback user responses analysis.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_feedback_get_responses_analysis200_response import ModFeedbackGetResponsesAnalysis200Response
from openapi_client.models.mod_feedback_get_responses_analysis_request import ModFeedbackGetResponsesAnalysisRequest
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
    api_instance = openapi_client.ModFeedbackApi(api_client)
    mod_feedback_get_responses_analysis_request = openapi_client.ModFeedbackGetResponsesAnalysisRequest() # ModFeedbackGetResponsesAnalysisRequest | 

    try:
        # Return the feedback user responses analysis.
        api_response = api_instance.mod_feedback_get_responses_analysis(mod_feedback_get_responses_analysis_request)
        print("The response of ModFeedbackApi->mod_feedback_get_responses_analysis:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModFeedbackApi->mod_feedback_get_responses_analysis: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_feedback_get_responses_analysis_request** | [**ModFeedbackGetResponsesAnalysisRequest**](ModFeedbackGetResponsesAnalysisRequest.md)|  | 

### Return type

[**ModFeedbackGetResponsesAnalysis200Response**](ModFeedbackGetResponsesAnalysis200Response.md)

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

# **mod_feedback_get_unfinished_responses**
> ModFeedbackGetUnfinishedResponses200Response mod_feedback_get_unfinished_responses(mod_feedback_get_finished_responses_request)

Retrieves responses from the current unfinished attempt.

Retrieves responses from the current unfinished attempt.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_feedback_get_finished_responses_request import ModFeedbackGetFinishedResponsesRequest
from openapi_client.models.mod_feedback_get_unfinished_responses200_response import ModFeedbackGetUnfinishedResponses200Response
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
    api_instance = openapi_client.ModFeedbackApi(api_client)
    mod_feedback_get_finished_responses_request = openapi_client.ModFeedbackGetFinishedResponsesRequest() # ModFeedbackGetFinishedResponsesRequest | 

    try:
        # Retrieves responses from the current unfinished attempt.
        api_response = api_instance.mod_feedback_get_unfinished_responses(mod_feedback_get_finished_responses_request)
        print("The response of ModFeedbackApi->mod_feedback_get_unfinished_responses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModFeedbackApi->mod_feedback_get_unfinished_responses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_feedback_get_finished_responses_request** | [**ModFeedbackGetFinishedResponsesRequest**](ModFeedbackGetFinishedResponsesRequest.md)|  | 

### Return type

[**ModFeedbackGetUnfinishedResponses200Response**](ModFeedbackGetUnfinishedResponses200Response.md)

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

# **mod_feedback_launch_feedback**
> ModFeedbackLaunchFeedback200Response mod_feedback_launch_feedback(mod_feedback_get_current_completed_tmp_request)

Starts or continues a feedback submission.

Starts or continues a feedback submission.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_feedback_get_current_completed_tmp_request import ModFeedbackGetCurrentCompletedTmpRequest
from openapi_client.models.mod_feedback_launch_feedback200_response import ModFeedbackLaunchFeedback200Response
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
    api_instance = openapi_client.ModFeedbackApi(api_client)
    mod_feedback_get_current_completed_tmp_request = openapi_client.ModFeedbackGetCurrentCompletedTmpRequest() # ModFeedbackGetCurrentCompletedTmpRequest | 

    try:
        # Starts or continues a feedback submission.
        api_response = api_instance.mod_feedback_launch_feedback(mod_feedback_get_current_completed_tmp_request)
        print("The response of ModFeedbackApi->mod_feedback_launch_feedback:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModFeedbackApi->mod_feedback_launch_feedback: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_feedback_get_current_completed_tmp_request** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md)|  | 

### Return type

[**ModFeedbackLaunchFeedback200Response**](ModFeedbackLaunchFeedback200Response.md)

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

# **mod_feedback_process_page**
> ModFeedbackProcessPage200Response mod_feedback_process_page(mod_feedback_process_page_request)

Process a jump between pages.

Process a jump between pages.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_feedback_process_page200_response import ModFeedbackProcessPage200Response
from openapi_client.models.mod_feedback_process_page_request import ModFeedbackProcessPageRequest
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
    api_instance = openapi_client.ModFeedbackApi(api_client)
    mod_feedback_process_page_request = openapi_client.ModFeedbackProcessPageRequest() # ModFeedbackProcessPageRequest | 

    try:
        # Process a jump between pages.
        api_response = api_instance.mod_feedback_process_page(mod_feedback_process_page_request)
        print("The response of ModFeedbackApi->mod_feedback_process_page:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModFeedbackApi->mod_feedback_process_page: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_feedback_process_page_request** | [**ModFeedbackProcessPageRequest**](ModFeedbackProcessPageRequest.md)|  | 

### Return type

[**ModFeedbackProcessPage200Response**](ModFeedbackProcessPage200Response.md)

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

# **mod_feedback_view_feedback**
> CoreCalendarDeleteSubscription200Response mod_feedback_view_feedback(mod_feedback_view_feedback_request)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_feedback_view_feedback_request import ModFeedbackViewFeedbackRequest
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
    api_instance = openapi_client.ModFeedbackApi(api_client)
    mod_feedback_view_feedback_request = openapi_client.ModFeedbackViewFeedbackRequest() # ModFeedbackViewFeedbackRequest | 

    try:
        # Trigger the course module viewed event and update the module completion status.
        api_response = api_instance.mod_feedback_view_feedback(mod_feedback_view_feedback_request)
        print("The response of ModFeedbackApi->mod_feedback_view_feedback:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModFeedbackApi->mod_feedback_view_feedback: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_feedback_view_feedback_request** | [**ModFeedbackViewFeedbackRequest**](ModFeedbackViewFeedbackRequest.md)|  | 

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

