# openapi_client.ModLessonApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_lesson_finish_attempt**](ModLessonApi.md#mod_lesson_finish_attempt) | **POST** /mod_lesson_finish_attempt | Finishes the current attempt.
[**mod_lesson_get_attempts_overview**](ModLessonApi.md#mod_lesson_get_attempts_overview) | **POST** /mod_lesson_get_attempts_overview | Get a list of all the attempts made by users in a lesson.
[**mod_lesson_get_content_pages_viewed**](ModLessonApi.md#mod_lesson_get_content_pages_viewed) | **POST** /mod_lesson_get_content_pages_viewed | Return the list of content pages viewed by a user during a lesson attempt.
[**mod_lesson_get_lesson**](ModLessonApi.md#mod_lesson_get_lesson) | **POST** /mod_lesson_get_lesson | Return information of a given lesson.
[**mod_lesson_get_lesson_access_information**](ModLessonApi.md#mod_lesson_get_lesson_access_information) | **POST** /mod_lesson_get_lesson_access_information | Return access information for a given lesson.
[**mod_lesson_get_lessons_by_courses**](ModLessonApi.md#mod_lesson_get_lessons_by_courses) | **POST** /mod_lesson_get_lessons_by_courses | Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.
[**mod_lesson_get_page_data**](ModLessonApi.md#mod_lesson_get_page_data) | **POST** /mod_lesson_get_page_data | Return information of a given page, including its contents.
[**mod_lesson_get_pages**](ModLessonApi.md#mod_lesson_get_pages) | **POST** /mod_lesson_get_pages | Return the list of pages in a lesson (based on the user permissions).
[**mod_lesson_get_pages_possible_jumps**](ModLessonApi.md#mod_lesson_get_pages_possible_jumps) | **POST** /mod_lesson_get_pages_possible_jumps | Return all the possible jumps for the pages in a given lesson.
[**mod_lesson_get_questions_attempts**](ModLessonApi.md#mod_lesson_get_questions_attempts) | **POST** /mod_lesson_get_questions_attempts | Return the list of questions attempts in a given lesson.
[**mod_lesson_get_user_attempt**](ModLessonApi.md#mod_lesson_get_user_attempt) | **POST** /mod_lesson_get_user_attempt | Return information about the given user attempt (including answers).
[**mod_lesson_get_user_attempt_grade**](ModLessonApi.md#mod_lesson_get_user_attempt_grade) | **POST** /mod_lesson_get_user_attempt_grade | Return grade information in the attempt for a given user.
[**mod_lesson_get_user_grade**](ModLessonApi.md#mod_lesson_get_user_grade) | **POST** /mod_lesson_get_user_grade | Return the final grade in the lesson for the given user.
[**mod_lesson_get_user_timers**](ModLessonApi.md#mod_lesson_get_user_timers) | **POST** /mod_lesson_get_user_timers | Return the timers in the current lesson for the given user.
[**mod_lesson_launch_attempt**](ModLessonApi.md#mod_lesson_launch_attempt) | **POST** /mod_lesson_launch_attempt | Starts a new attempt or continues an existing one.
[**mod_lesson_process_page**](ModLessonApi.md#mod_lesson_process_page) | **POST** /mod_lesson_process_page | Processes page responses.
[**mod_lesson_view_lesson**](ModLessonApi.md#mod_lesson_view_lesson) | **POST** /mod_lesson_view_lesson | Trigger the course module viewed event and update the module completion status.


# **mod_lesson_finish_attempt**
> ModLessonFinishAttempt200Response mod_lesson_finish_attempt(mod_lesson_finish_attempt_request)

Finishes the current attempt.

Finishes the current attempt.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lesson_finish_attempt200_response import ModLessonFinishAttempt200Response
from openapi_client.models.mod_lesson_finish_attempt_request import ModLessonFinishAttemptRequest
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
    api_instance = openapi_client.ModLessonApi(api_client)
    mod_lesson_finish_attempt_request = openapi_client.ModLessonFinishAttemptRequest() # ModLessonFinishAttemptRequest | 

    try:
        # Finishes the current attempt.
        api_response = api_instance.mod_lesson_finish_attempt(mod_lesson_finish_attempt_request)
        print("The response of ModLessonApi->mod_lesson_finish_attempt:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLessonApi->mod_lesson_finish_attempt: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lesson_finish_attempt_request** | [**ModLessonFinishAttemptRequest**](ModLessonFinishAttemptRequest.md)|  | 

### Return type

[**ModLessonFinishAttempt200Response**](ModLessonFinishAttempt200Response.md)

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

# **mod_lesson_get_attempts_overview**
> ModLessonGetAttemptsOverview200Response mod_lesson_get_attempts_overview(mod_lesson_get_attempts_overview_request)

Get a list of all the attempts made by users in a lesson.

Get a list of all the attempts made by users in a lesson.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lesson_get_attempts_overview200_response import ModLessonGetAttemptsOverview200Response
from openapi_client.models.mod_lesson_get_attempts_overview_request import ModLessonGetAttemptsOverviewRequest
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
    api_instance = openapi_client.ModLessonApi(api_client)
    mod_lesson_get_attempts_overview_request = openapi_client.ModLessonGetAttemptsOverviewRequest() # ModLessonGetAttemptsOverviewRequest | 

    try:
        # Get a list of all the attempts made by users in a lesson.
        api_response = api_instance.mod_lesson_get_attempts_overview(mod_lesson_get_attempts_overview_request)
        print("The response of ModLessonApi->mod_lesson_get_attempts_overview:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLessonApi->mod_lesson_get_attempts_overview: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lesson_get_attempts_overview_request** | [**ModLessonGetAttemptsOverviewRequest**](ModLessonGetAttemptsOverviewRequest.md)|  | 

### Return type

[**ModLessonGetAttemptsOverview200Response**](ModLessonGetAttemptsOverview200Response.md)

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

# **mod_lesson_get_content_pages_viewed**
> ModLessonGetContentPagesViewed200Response mod_lesson_get_content_pages_viewed(mod_lesson_get_content_pages_viewed_request)

Return the list of content pages viewed by a user during a lesson attempt.

Return the list of content pages viewed by a user during a lesson attempt.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lesson_get_content_pages_viewed200_response import ModLessonGetContentPagesViewed200Response
from openapi_client.models.mod_lesson_get_content_pages_viewed_request import ModLessonGetContentPagesViewedRequest
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
    api_instance = openapi_client.ModLessonApi(api_client)
    mod_lesson_get_content_pages_viewed_request = openapi_client.ModLessonGetContentPagesViewedRequest() # ModLessonGetContentPagesViewedRequest | 

    try:
        # Return the list of content pages viewed by a user during a lesson attempt.
        api_response = api_instance.mod_lesson_get_content_pages_viewed(mod_lesson_get_content_pages_viewed_request)
        print("The response of ModLessonApi->mod_lesson_get_content_pages_viewed:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLessonApi->mod_lesson_get_content_pages_viewed: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lesson_get_content_pages_viewed_request** | [**ModLessonGetContentPagesViewedRequest**](ModLessonGetContentPagesViewedRequest.md)|  | 

### Return type

[**ModLessonGetContentPagesViewed200Response**](ModLessonGetContentPagesViewed200Response.md)

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

# **mod_lesson_get_lesson**
> ModLessonGetLesson200Response mod_lesson_get_lesson(mod_lesson_get_lesson_request)

Return information of a given lesson.

Return information of a given lesson.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lesson_get_lesson200_response import ModLessonGetLesson200Response
from openapi_client.models.mod_lesson_get_lesson_request import ModLessonGetLessonRequest
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
    api_instance = openapi_client.ModLessonApi(api_client)
    mod_lesson_get_lesson_request = openapi_client.ModLessonGetLessonRequest() # ModLessonGetLessonRequest | 

    try:
        # Return information of a given lesson.
        api_response = api_instance.mod_lesson_get_lesson(mod_lesson_get_lesson_request)
        print("The response of ModLessonApi->mod_lesson_get_lesson:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLessonApi->mod_lesson_get_lesson: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lesson_get_lesson_request** | [**ModLessonGetLessonRequest**](ModLessonGetLessonRequest.md)|  | 

### Return type

[**ModLessonGetLesson200Response**](ModLessonGetLesson200Response.md)

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

# **mod_lesson_get_lesson_access_information**
> ModLessonGetLessonAccessInformation200Response mod_lesson_get_lesson_access_information(mod_lesson_get_lesson_access_information_request)

Return access information for a given lesson.

Return access information for a given lesson.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lesson_get_lesson_access_information200_response import ModLessonGetLessonAccessInformation200Response
from openapi_client.models.mod_lesson_get_lesson_access_information_request import ModLessonGetLessonAccessInformationRequest
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
    api_instance = openapi_client.ModLessonApi(api_client)
    mod_lesson_get_lesson_access_information_request = openapi_client.ModLessonGetLessonAccessInformationRequest() # ModLessonGetLessonAccessInformationRequest | 

    try:
        # Return access information for a given lesson.
        api_response = api_instance.mod_lesson_get_lesson_access_information(mod_lesson_get_lesson_access_information_request)
        print("The response of ModLessonApi->mod_lesson_get_lesson_access_information:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLessonApi->mod_lesson_get_lesson_access_information: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lesson_get_lesson_access_information_request** | [**ModLessonGetLessonAccessInformationRequest**](ModLessonGetLessonAccessInformationRequest.md)|  | 

### Return type

[**ModLessonGetLessonAccessInformation200Response**](ModLessonGetLessonAccessInformation200Response.md)

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

# **mod_lesson_get_lessons_by_courses**
> ModLessonGetLessonsByCourses200Response mod_lesson_get_lessons_by_courses(mod_chat_get_chats_by_courses_request)

Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.

Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_chat_get_chats_by_courses_request import ModChatGetChatsByCoursesRequest
from openapi_client.models.mod_lesson_get_lessons_by_courses200_response import ModLessonGetLessonsByCourses200Response
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
    api_instance = openapi_client.ModLessonApi(api_client)
    mod_chat_get_chats_by_courses_request = openapi_client.ModChatGetChatsByCoursesRequest() # ModChatGetChatsByCoursesRequest | 

    try:
        # Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.
        api_response = api_instance.mod_lesson_get_lessons_by_courses(mod_chat_get_chats_by_courses_request)
        print("The response of ModLessonApi->mod_lesson_get_lessons_by_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLessonApi->mod_lesson_get_lessons_by_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md)|  | 

### Return type

[**ModLessonGetLessonsByCourses200Response**](ModLessonGetLessonsByCourses200Response.md)

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

# **mod_lesson_get_page_data**
> ModLessonGetPageData200Response mod_lesson_get_page_data(mod_lesson_get_page_data_request)

Return information of a given page, including its contents.

Return information of a given page, including its contents.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lesson_get_page_data200_response import ModLessonGetPageData200Response
from openapi_client.models.mod_lesson_get_page_data_request import ModLessonGetPageDataRequest
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
    api_instance = openapi_client.ModLessonApi(api_client)
    mod_lesson_get_page_data_request = openapi_client.ModLessonGetPageDataRequest() # ModLessonGetPageDataRequest | 

    try:
        # Return information of a given page, including its contents.
        api_response = api_instance.mod_lesson_get_page_data(mod_lesson_get_page_data_request)
        print("The response of ModLessonApi->mod_lesson_get_page_data:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLessonApi->mod_lesson_get_page_data: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lesson_get_page_data_request** | [**ModLessonGetPageDataRequest**](ModLessonGetPageDataRequest.md)|  | 

### Return type

[**ModLessonGetPageData200Response**](ModLessonGetPageData200Response.md)

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

# **mod_lesson_get_pages**
> ModLessonGetPages200Response mod_lesson_get_pages(mod_lesson_get_pages_request)

Return the list of pages in a lesson (based on the user permissions).

Return the list of pages in a lesson (based on the user permissions).

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lesson_get_pages200_response import ModLessonGetPages200Response
from openapi_client.models.mod_lesson_get_pages_request import ModLessonGetPagesRequest
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
    api_instance = openapi_client.ModLessonApi(api_client)
    mod_lesson_get_pages_request = openapi_client.ModLessonGetPagesRequest() # ModLessonGetPagesRequest | 

    try:
        # Return the list of pages in a lesson (based on the user permissions).
        api_response = api_instance.mod_lesson_get_pages(mod_lesson_get_pages_request)
        print("The response of ModLessonApi->mod_lesson_get_pages:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLessonApi->mod_lesson_get_pages: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lesson_get_pages_request** | [**ModLessonGetPagesRequest**](ModLessonGetPagesRequest.md)|  | 

### Return type

[**ModLessonGetPages200Response**](ModLessonGetPages200Response.md)

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

# **mod_lesson_get_pages_possible_jumps**
> ModLessonGetPagesPossibleJumps200Response mod_lesson_get_pages_possible_jumps(mod_lesson_get_lesson_access_information_request)

Return all the possible jumps for the pages in a given lesson.

Return all the possible jumps for the pages in a given lesson.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lesson_get_lesson_access_information_request import ModLessonGetLessonAccessInformationRequest
from openapi_client.models.mod_lesson_get_pages_possible_jumps200_response import ModLessonGetPagesPossibleJumps200Response
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
    api_instance = openapi_client.ModLessonApi(api_client)
    mod_lesson_get_lesson_access_information_request = openapi_client.ModLessonGetLessonAccessInformationRequest() # ModLessonGetLessonAccessInformationRequest | 

    try:
        # Return all the possible jumps for the pages in a given lesson.
        api_response = api_instance.mod_lesson_get_pages_possible_jumps(mod_lesson_get_lesson_access_information_request)
        print("The response of ModLessonApi->mod_lesson_get_pages_possible_jumps:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLessonApi->mod_lesson_get_pages_possible_jumps: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lesson_get_lesson_access_information_request** | [**ModLessonGetLessonAccessInformationRequest**](ModLessonGetLessonAccessInformationRequest.md)|  | 

### Return type

[**ModLessonGetPagesPossibleJumps200Response**](ModLessonGetPagesPossibleJumps200Response.md)

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

# **mod_lesson_get_questions_attempts**
> ModLessonGetQuestionsAttempts200Response mod_lesson_get_questions_attempts(mod_lesson_get_questions_attempts_request)

Return the list of questions attempts in a given lesson.

Return the list of questions attempts in a given lesson.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lesson_get_questions_attempts200_response import ModLessonGetQuestionsAttempts200Response
from openapi_client.models.mod_lesson_get_questions_attempts_request import ModLessonGetQuestionsAttemptsRequest
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
    api_instance = openapi_client.ModLessonApi(api_client)
    mod_lesson_get_questions_attempts_request = openapi_client.ModLessonGetQuestionsAttemptsRequest() # ModLessonGetQuestionsAttemptsRequest | 

    try:
        # Return the list of questions attempts in a given lesson.
        api_response = api_instance.mod_lesson_get_questions_attempts(mod_lesson_get_questions_attempts_request)
        print("The response of ModLessonApi->mod_lesson_get_questions_attempts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLessonApi->mod_lesson_get_questions_attempts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lesson_get_questions_attempts_request** | [**ModLessonGetQuestionsAttemptsRequest**](ModLessonGetQuestionsAttemptsRequest.md)|  | 

### Return type

[**ModLessonGetQuestionsAttempts200Response**](ModLessonGetQuestionsAttempts200Response.md)

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

# **mod_lesson_get_user_attempt**
> ModLessonGetUserAttempt200Response mod_lesson_get_user_attempt(mod_lesson_get_user_attempt_request)

Return information about the given user attempt (including answers).

Return information about the given user attempt (including answers).

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lesson_get_user_attempt200_response import ModLessonGetUserAttempt200Response
from openapi_client.models.mod_lesson_get_user_attempt_request import ModLessonGetUserAttemptRequest
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
    api_instance = openapi_client.ModLessonApi(api_client)
    mod_lesson_get_user_attempt_request = openapi_client.ModLessonGetUserAttemptRequest() # ModLessonGetUserAttemptRequest | 

    try:
        # Return information about the given user attempt (including answers).
        api_response = api_instance.mod_lesson_get_user_attempt(mod_lesson_get_user_attempt_request)
        print("The response of ModLessonApi->mod_lesson_get_user_attempt:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLessonApi->mod_lesson_get_user_attempt: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lesson_get_user_attempt_request** | [**ModLessonGetUserAttemptRequest**](ModLessonGetUserAttemptRequest.md)|  | 

### Return type

[**ModLessonGetUserAttempt200Response**](ModLessonGetUserAttempt200Response.md)

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

# **mod_lesson_get_user_attempt_grade**
> ModLessonGetUserAttemptGrade200Response mod_lesson_get_user_attempt_grade(mod_lesson_get_user_attempt_grade_request)

Return grade information in the attempt for a given user.

Return grade information in the attempt for a given user.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lesson_get_user_attempt_grade200_response import ModLessonGetUserAttemptGrade200Response
from openapi_client.models.mod_lesson_get_user_attempt_grade_request import ModLessonGetUserAttemptGradeRequest
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
    api_instance = openapi_client.ModLessonApi(api_client)
    mod_lesson_get_user_attempt_grade_request = openapi_client.ModLessonGetUserAttemptGradeRequest() # ModLessonGetUserAttemptGradeRequest | 

    try:
        # Return grade information in the attempt for a given user.
        api_response = api_instance.mod_lesson_get_user_attempt_grade(mod_lesson_get_user_attempt_grade_request)
        print("The response of ModLessonApi->mod_lesson_get_user_attempt_grade:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLessonApi->mod_lesson_get_user_attempt_grade: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lesson_get_user_attempt_grade_request** | [**ModLessonGetUserAttemptGradeRequest**](ModLessonGetUserAttemptGradeRequest.md)|  | 

### Return type

[**ModLessonGetUserAttemptGrade200Response**](ModLessonGetUserAttemptGrade200Response.md)

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

# **mod_lesson_get_user_grade**
> ModLessonGetUserGrade200Response mod_lesson_get_user_grade(mod_lesson_get_user_grade_request)

Return the final grade in the lesson for the given user.

Return the final grade in the lesson for the given user.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lesson_get_user_grade200_response import ModLessonGetUserGrade200Response
from openapi_client.models.mod_lesson_get_user_grade_request import ModLessonGetUserGradeRequest
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
    api_instance = openapi_client.ModLessonApi(api_client)
    mod_lesson_get_user_grade_request = openapi_client.ModLessonGetUserGradeRequest() # ModLessonGetUserGradeRequest | 

    try:
        # Return the final grade in the lesson for the given user.
        api_response = api_instance.mod_lesson_get_user_grade(mod_lesson_get_user_grade_request)
        print("The response of ModLessonApi->mod_lesson_get_user_grade:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLessonApi->mod_lesson_get_user_grade: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lesson_get_user_grade_request** | [**ModLessonGetUserGradeRequest**](ModLessonGetUserGradeRequest.md)|  | 

### Return type

[**ModLessonGetUserGrade200Response**](ModLessonGetUserGrade200Response.md)

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

# **mod_lesson_get_user_timers**
> ModLessonGetUserTimers200Response mod_lesson_get_user_timers(mod_lesson_get_user_grade_request)

Return the timers in the current lesson for the given user.

Return the timers in the current lesson for the given user.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lesson_get_user_grade_request import ModLessonGetUserGradeRequest
from openapi_client.models.mod_lesson_get_user_timers200_response import ModLessonGetUserTimers200Response
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
    api_instance = openapi_client.ModLessonApi(api_client)
    mod_lesson_get_user_grade_request = openapi_client.ModLessonGetUserGradeRequest() # ModLessonGetUserGradeRequest | 

    try:
        # Return the timers in the current lesson for the given user.
        api_response = api_instance.mod_lesson_get_user_timers(mod_lesson_get_user_grade_request)
        print("The response of ModLessonApi->mod_lesson_get_user_timers:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLessonApi->mod_lesson_get_user_timers: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lesson_get_user_grade_request** | [**ModLessonGetUserGradeRequest**](ModLessonGetUserGradeRequest.md)|  | 

### Return type

[**ModLessonGetUserTimers200Response**](ModLessonGetUserTimers200Response.md)

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

# **mod_lesson_launch_attempt**
> ModLessonLaunchAttempt200Response mod_lesson_launch_attempt(mod_lesson_launch_attempt_request)

Starts a new attempt or continues an existing one.

Starts a new attempt or continues an existing one.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lesson_launch_attempt200_response import ModLessonLaunchAttempt200Response
from openapi_client.models.mod_lesson_launch_attempt_request import ModLessonLaunchAttemptRequest
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
    api_instance = openapi_client.ModLessonApi(api_client)
    mod_lesson_launch_attempt_request = openapi_client.ModLessonLaunchAttemptRequest() # ModLessonLaunchAttemptRequest | 

    try:
        # Starts a new attempt or continues an existing one.
        api_response = api_instance.mod_lesson_launch_attempt(mod_lesson_launch_attempt_request)
        print("The response of ModLessonApi->mod_lesson_launch_attempt:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLessonApi->mod_lesson_launch_attempt: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lesson_launch_attempt_request** | [**ModLessonLaunchAttemptRequest**](ModLessonLaunchAttemptRequest.md)|  | 

### Return type

[**ModLessonLaunchAttempt200Response**](ModLessonLaunchAttempt200Response.md)

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

# **mod_lesson_process_page**
> ModLessonProcessPage200Response mod_lesson_process_page(mod_lesson_process_page_request)

Processes page responses.

Processes page responses.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_lesson_process_page200_response import ModLessonProcessPage200Response
from openapi_client.models.mod_lesson_process_page_request import ModLessonProcessPageRequest
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
    api_instance = openapi_client.ModLessonApi(api_client)
    mod_lesson_process_page_request = openapi_client.ModLessonProcessPageRequest() # ModLessonProcessPageRequest | 

    try:
        # Processes page responses.
        api_response = api_instance.mod_lesson_process_page(mod_lesson_process_page_request)
        print("The response of ModLessonApi->mod_lesson_process_page:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLessonApi->mod_lesson_process_page: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lesson_process_page_request** | [**ModLessonProcessPageRequest**](ModLessonProcessPageRequest.md)|  | 

### Return type

[**ModLessonProcessPage200Response**](ModLessonProcessPage200Response.md)

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

# **mod_lesson_view_lesson**
> CoreCalendarDeleteSubscription200Response mod_lesson_view_lesson(mod_lesson_get_lesson_request)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_lesson_get_lesson_request import ModLessonGetLessonRequest
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
    api_instance = openapi_client.ModLessonApi(api_client)
    mod_lesson_get_lesson_request = openapi_client.ModLessonGetLessonRequest() # ModLessonGetLessonRequest | 

    try:
        # Trigger the course module viewed event and update the module completion status.
        api_response = api_instance.mod_lesson_view_lesson(mod_lesson_get_lesson_request)
        print("The response of ModLessonApi->mod_lesson_view_lesson:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLessonApi->mod_lesson_view_lesson: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_lesson_get_lesson_request** | [**ModLessonGetLessonRequest**](ModLessonGetLessonRequest.md)|  | 

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

