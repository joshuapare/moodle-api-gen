# openapi_client.ModAssignApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_assign_copy_previous_attempt**](ModAssignApi.md#mod_assign_copy_previous_attempt) | **POST** /mod_assign_copy_previous_attempt | Copy a students previous attempt to a new attempt.
[**mod_assign_get_assignments**](ModAssignApi.md#mod_assign_get_assignments) | **POST** /mod_assign_get_assignments | Returns the courses and assignments for the users capability
[**mod_assign_get_grades**](ModAssignApi.md#mod_assign_get_grades) | **POST** /mod_assign_get_grades | Returns grades from the assignment
[**mod_assign_get_participant**](ModAssignApi.md#mod_assign_get_participant) | **POST** /mod_assign_get_participant | Get a participant for an assignment, with some summary info about their submissions.
[**mod_assign_get_submission_status**](ModAssignApi.md#mod_assign_get_submission_status) | **POST** /mod_assign_get_submission_status | Returns information about an assignment submission status for a given user.
[**mod_assign_get_submissions**](ModAssignApi.md#mod_assign_get_submissions) | **POST** /mod_assign_get_submissions | Returns the submissions for assignments
[**mod_assign_get_user_flags**](ModAssignApi.md#mod_assign_get_user_flags) | **POST** /mod_assign_get_user_flags | Returns the user flags for assignments
[**mod_assign_get_user_mappings**](ModAssignApi.md#mod_assign_get_user_mappings) | **POST** /mod_assign_get_user_mappings | Returns the blind marking mappings for assignments
[**mod_assign_list_participants**](ModAssignApi.md#mod_assign_list_participants) | **POST** /mod_assign_list_participants | List the participants for a single assignment, with some summary info about their submissions.
[**mod_assign_lock_submissions**](ModAssignApi.md#mod_assign_lock_submissions) | **POST** /mod_assign_lock_submissions | Prevent students from making changes to a list of submissions
[**mod_assign_reveal_identities**](ModAssignApi.md#mod_assign_reveal_identities) | **POST** /mod_assign_reveal_identities | Reveal the identities for a blind marking assignment
[**mod_assign_revert_submissions_to_draft**](ModAssignApi.md#mod_assign_revert_submissions_to_draft) | **POST** /mod_assign_revert_submissions_to_draft | Reverts the list of submissions to draft status
[**mod_assign_save_grade**](ModAssignApi.md#mod_assign_save_grade) | **POST** /mod_assign_save_grade | Save a grade update for a single student.
[**mod_assign_save_grades**](ModAssignApi.md#mod_assign_save_grades) | **POST** /mod_assign_save_grades | Save multiple grade updates for an assignment.
[**mod_assign_save_submission**](ModAssignApi.md#mod_assign_save_submission) | **POST** /mod_assign_save_submission | Update the current students submission
[**mod_assign_save_user_extensions**](ModAssignApi.md#mod_assign_save_user_extensions) | **POST** /mod_assign_save_user_extensions | Save a list of assignment extensions
[**mod_assign_set_user_flags**](ModAssignApi.md#mod_assign_set_user_flags) | **POST** /mod_assign_set_user_flags | Creates or updates user flags
[**mod_assign_start_submission**](ModAssignApi.md#mod_assign_start_submission) | **POST** /mod_assign_start_submission | Start a submission for user if assignment has a time limit.
[**mod_assign_submit_for_grading**](ModAssignApi.md#mod_assign_submit_for_grading) | **POST** /mod_assign_submit_for_grading | Submit the current students assignment for grading
[**mod_assign_submit_grading_form**](ModAssignApi.md#mod_assign_submit_grading_form) | **POST** /mod_assign_submit_grading_form | Submit the grading form data via ajax
[**mod_assign_unlock_submissions**](ModAssignApi.md#mod_assign_unlock_submissions) | **POST** /mod_assign_unlock_submissions | Allow students to make changes to a list of submissions
[**mod_assign_view_assign**](ModAssignApi.md#mod_assign_view_assign) | **POST** /mod_assign_view_assign | Update the module completion status.
[**mod_assign_view_grading_table**](ModAssignApi.md#mod_assign_view_grading_table) | **POST** /mod_assign_view_grading_table | Trigger the grading_table_viewed event.
[**mod_assign_view_submission_status**](ModAssignApi.md#mod_assign_view_submission_status) | **POST** /mod_assign_view_submission_status | Trigger the submission status viewed event.


# **mod_assign_copy_previous_attempt**
> object mod_assign_copy_previous_attempt(mod_assign_copy_previous_attempt_request)

Copy a students previous attempt to a new attempt.

Copy a students previous attempt to a new attempt.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_copy_previous_attempt_request import ModAssignCopyPreviousAttemptRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_copy_previous_attempt_request = openapi_client.ModAssignCopyPreviousAttemptRequest() # ModAssignCopyPreviousAttemptRequest | 

    try:
        # Copy a students previous attempt to a new attempt.
        api_response = api_instance.mod_assign_copy_previous_attempt(mod_assign_copy_previous_attempt_request)
        print("The response of ModAssignApi->mod_assign_copy_previous_attempt:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_copy_previous_attempt: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_copy_previous_attempt_request** | [**ModAssignCopyPreviousAttemptRequest**](ModAssignCopyPreviousAttemptRequest.md)|  | 

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
**200** | list of warnings |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_assign_get_assignments**
> ModAssignGetAssignments200Response mod_assign_get_assignments(mod_assign_get_assignments_request)

Returns the courses and assignments for the users capability

Returns the courses and assignments for the users capability

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_get_assignments200_response import ModAssignGetAssignments200Response
from openapi_client.models.mod_assign_get_assignments_request import ModAssignGetAssignmentsRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_get_assignments_request = openapi_client.ModAssignGetAssignmentsRequest() # ModAssignGetAssignmentsRequest | 

    try:
        # Returns the courses and assignments for the users capability
        api_response = api_instance.mod_assign_get_assignments(mod_assign_get_assignments_request)
        print("The response of ModAssignApi->mod_assign_get_assignments:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_get_assignments: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_get_assignments_request** | [**ModAssignGetAssignmentsRequest**](ModAssignGetAssignmentsRequest.md)|  | 

### Return type

[**ModAssignGetAssignments200Response**](ModAssignGetAssignments200Response.md)

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

# **mod_assign_get_grades**
> ModAssignGetGrades200Response mod_assign_get_grades(mod_assign_get_grades_request)

Returns grades from the assignment

Returns grades from the assignment

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_get_grades200_response import ModAssignGetGrades200Response
from openapi_client.models.mod_assign_get_grades_request import ModAssignGetGradesRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_get_grades_request = openapi_client.ModAssignGetGradesRequest() # ModAssignGetGradesRequest | 

    try:
        # Returns grades from the assignment
        api_response = api_instance.mod_assign_get_grades(mod_assign_get_grades_request)
        print("The response of ModAssignApi->mod_assign_get_grades:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_get_grades: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_get_grades_request** | [**ModAssignGetGradesRequest**](ModAssignGetGradesRequest.md)|  | 

### Return type

[**ModAssignGetGrades200Response**](ModAssignGetGrades200Response.md)

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

# **mod_assign_get_participant**
> ModAssignGetParticipant200Response mod_assign_get_participant(mod_assign_get_participant_request)

Get a participant for an assignment, with some summary info about their submissions.

Get a participant for an assignment, with some summary info about their submissions.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_get_participant200_response import ModAssignGetParticipant200Response
from openapi_client.models.mod_assign_get_participant_request import ModAssignGetParticipantRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_get_participant_request = openapi_client.ModAssignGetParticipantRequest() # ModAssignGetParticipantRequest | 

    try:
        # Get a participant for an assignment, with some summary info about their submissions.
        api_response = api_instance.mod_assign_get_participant(mod_assign_get_participant_request)
        print("The response of ModAssignApi->mod_assign_get_participant:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_get_participant: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_get_participant_request** | [**ModAssignGetParticipantRequest**](ModAssignGetParticipantRequest.md)|  | 

### Return type

[**ModAssignGetParticipant200Response**](ModAssignGetParticipant200Response.md)

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

# **mod_assign_get_submission_status**
> ModAssignGetSubmissionStatus200Response mod_assign_get_submission_status(mod_assign_get_submission_status_request)

Returns information about an assignment submission status for a given user.

Returns information about an assignment submission status for a given user.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_get_submission_status200_response import ModAssignGetSubmissionStatus200Response
from openapi_client.models.mod_assign_get_submission_status_request import ModAssignGetSubmissionStatusRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_get_submission_status_request = openapi_client.ModAssignGetSubmissionStatusRequest() # ModAssignGetSubmissionStatusRequest | 

    try:
        # Returns information about an assignment submission status for a given user.
        api_response = api_instance.mod_assign_get_submission_status(mod_assign_get_submission_status_request)
        print("The response of ModAssignApi->mod_assign_get_submission_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_get_submission_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_get_submission_status_request** | [**ModAssignGetSubmissionStatusRequest**](ModAssignGetSubmissionStatusRequest.md)|  | 

### Return type

[**ModAssignGetSubmissionStatus200Response**](ModAssignGetSubmissionStatus200Response.md)

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

# **mod_assign_get_submissions**
> ModAssignGetSubmissions200Response mod_assign_get_submissions(mod_assign_get_submissions_request)

Returns the submissions for assignments

Returns the submissions for assignments

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_get_submissions200_response import ModAssignGetSubmissions200Response
from openapi_client.models.mod_assign_get_submissions_request import ModAssignGetSubmissionsRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_get_submissions_request = openapi_client.ModAssignGetSubmissionsRequest() # ModAssignGetSubmissionsRequest | 

    try:
        # Returns the submissions for assignments
        api_response = api_instance.mod_assign_get_submissions(mod_assign_get_submissions_request)
        print("The response of ModAssignApi->mod_assign_get_submissions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_get_submissions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_get_submissions_request** | [**ModAssignGetSubmissionsRequest**](ModAssignGetSubmissionsRequest.md)|  | 

### Return type

[**ModAssignGetSubmissions200Response**](ModAssignGetSubmissions200Response.md)

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

# **mod_assign_get_user_flags**
> ModAssignGetUserFlags200Response mod_assign_get_user_flags(mod_assign_get_user_flags_request)

Returns the user flags for assignments

Returns the user flags for assignments

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_get_user_flags200_response import ModAssignGetUserFlags200Response
from openapi_client.models.mod_assign_get_user_flags_request import ModAssignGetUserFlagsRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_get_user_flags_request = openapi_client.ModAssignGetUserFlagsRequest() # ModAssignGetUserFlagsRequest | 

    try:
        # Returns the user flags for assignments
        api_response = api_instance.mod_assign_get_user_flags(mod_assign_get_user_flags_request)
        print("The response of ModAssignApi->mod_assign_get_user_flags:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_get_user_flags: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_get_user_flags_request** | [**ModAssignGetUserFlagsRequest**](ModAssignGetUserFlagsRequest.md)|  | 

### Return type

[**ModAssignGetUserFlags200Response**](ModAssignGetUserFlags200Response.md)

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

# **mod_assign_get_user_mappings**
> ModAssignGetUserMappings200Response mod_assign_get_user_mappings(mod_assign_get_user_flags_request)

Returns the blind marking mappings for assignments

Returns the blind marking mappings for assignments

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_get_user_flags_request import ModAssignGetUserFlagsRequest
from openapi_client.models.mod_assign_get_user_mappings200_response import ModAssignGetUserMappings200Response
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_get_user_flags_request = openapi_client.ModAssignGetUserFlagsRequest() # ModAssignGetUserFlagsRequest | 

    try:
        # Returns the blind marking mappings for assignments
        api_response = api_instance.mod_assign_get_user_mappings(mod_assign_get_user_flags_request)
        print("The response of ModAssignApi->mod_assign_get_user_mappings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_get_user_mappings: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_get_user_flags_request** | [**ModAssignGetUserFlagsRequest**](ModAssignGetUserFlagsRequest.md)|  | 

### Return type

[**ModAssignGetUserMappings200Response**](ModAssignGetUserMappings200Response.md)

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

# **mod_assign_list_participants**
> object mod_assign_list_participants(mod_assign_list_participants_request)

List the participants for a single assignment, with some summary info about their submissions.

List the participants for a single assignment, with some summary info about their submissions.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_list_participants_request import ModAssignListParticipantsRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_list_participants_request = openapi_client.ModAssignListParticipantsRequest() # ModAssignListParticipantsRequest | 

    try:
        # List the participants for a single assignment, with some summary info about their submissions.
        api_response = api_instance.mod_assign_list_participants(mod_assign_list_participants_request)
        print("The response of ModAssignApi->mod_assign_list_participants:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_list_participants: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_list_participants_request** | [**ModAssignListParticipantsRequest**](ModAssignListParticipantsRequest.md)|  | 

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

# **mod_assign_lock_submissions**
> object mod_assign_lock_submissions(mod_assign_lock_submissions_request)

Prevent students from making changes to a list of submissions

Prevent students from making changes to a list of submissions

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_lock_submissions_request import ModAssignLockSubmissionsRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_lock_submissions_request = openapi_client.ModAssignLockSubmissionsRequest() # ModAssignLockSubmissionsRequest | 

    try:
        # Prevent students from making changes to a list of submissions
        api_response = api_instance.mod_assign_lock_submissions(mod_assign_lock_submissions_request)
        print("The response of ModAssignApi->mod_assign_lock_submissions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_lock_submissions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_lock_submissions_request** | [**ModAssignLockSubmissionsRequest**](ModAssignLockSubmissionsRequest.md)|  | 

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
**200** | list of warnings |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_assign_reveal_identities**
> object mod_assign_reveal_identities(mod_assign_reveal_identities_request)

Reveal the identities for a blind marking assignment

Reveal the identities for a blind marking assignment

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_reveal_identities_request import ModAssignRevealIdentitiesRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_reveal_identities_request = openapi_client.ModAssignRevealIdentitiesRequest() # ModAssignRevealIdentitiesRequest | 

    try:
        # Reveal the identities for a blind marking assignment
        api_response = api_instance.mod_assign_reveal_identities(mod_assign_reveal_identities_request)
        print("The response of ModAssignApi->mod_assign_reveal_identities:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_reveal_identities: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_reveal_identities_request** | [**ModAssignRevealIdentitiesRequest**](ModAssignRevealIdentitiesRequest.md)|  | 

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
**200** | list of warnings |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_assign_revert_submissions_to_draft**
> object mod_assign_revert_submissions_to_draft(mod_assign_revert_submissions_to_draft_request)

Reverts the list of submissions to draft status

Reverts the list of submissions to draft status

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_revert_submissions_to_draft_request import ModAssignRevertSubmissionsToDraftRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_revert_submissions_to_draft_request = openapi_client.ModAssignRevertSubmissionsToDraftRequest() # ModAssignRevertSubmissionsToDraftRequest | 

    try:
        # Reverts the list of submissions to draft status
        api_response = api_instance.mod_assign_revert_submissions_to_draft(mod_assign_revert_submissions_to_draft_request)
        print("The response of ModAssignApi->mod_assign_revert_submissions_to_draft:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_revert_submissions_to_draft: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_revert_submissions_to_draft_request** | [**ModAssignRevertSubmissionsToDraftRequest**](ModAssignRevertSubmissionsToDraftRequest.md)|  | 

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
**200** | list of warnings |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_assign_save_grade**
> object mod_assign_save_grade(mod_assign_save_grade_request)

Save a grade update for a single student.

Save a grade update for a single student.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_save_grade_request import ModAssignSaveGradeRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_save_grade_request = openapi_client.ModAssignSaveGradeRequest() # ModAssignSaveGradeRequest | 

    try:
        # Save a grade update for a single student.
        api_response = api_instance.mod_assign_save_grade(mod_assign_save_grade_request)
        print("The response of ModAssignApi->mod_assign_save_grade:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_save_grade: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_save_grade_request** | [**ModAssignSaveGradeRequest**](ModAssignSaveGradeRequest.md)|  | 

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

# **mod_assign_save_grades**
> object mod_assign_save_grades(mod_assign_save_grades_request)

Save multiple grade updates for an assignment.

Save multiple grade updates for an assignment.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_save_grades_request import ModAssignSaveGradesRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_save_grades_request = openapi_client.ModAssignSaveGradesRequest() # ModAssignSaveGradesRequest | 

    try:
        # Save multiple grade updates for an assignment.
        api_response = api_instance.mod_assign_save_grades(mod_assign_save_grades_request)
        print("The response of ModAssignApi->mod_assign_save_grades:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_save_grades: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_save_grades_request** | [**ModAssignSaveGradesRequest**](ModAssignSaveGradesRequest.md)|  | 

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

# **mod_assign_save_submission**
> object mod_assign_save_submission(mod_assign_save_submission_request)

Update the current students submission

Update the current students submission

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_save_submission_request import ModAssignSaveSubmissionRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_save_submission_request = openapi_client.ModAssignSaveSubmissionRequest() # ModAssignSaveSubmissionRequest | 

    try:
        # Update the current students submission
        api_response = api_instance.mod_assign_save_submission(mod_assign_save_submission_request)
        print("The response of ModAssignApi->mod_assign_save_submission:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_save_submission: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_save_submission_request** | [**ModAssignSaveSubmissionRequest**](ModAssignSaveSubmissionRequest.md)|  | 

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
**200** | list of warnings |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_assign_save_user_extensions**
> object mod_assign_save_user_extensions(mod_assign_save_user_extensions_request)

Save a list of assignment extensions

Save a list of assignment extensions

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_save_user_extensions_request import ModAssignSaveUserExtensionsRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_save_user_extensions_request = openapi_client.ModAssignSaveUserExtensionsRequest() # ModAssignSaveUserExtensionsRequest | 

    try:
        # Save a list of assignment extensions
        api_response = api_instance.mod_assign_save_user_extensions(mod_assign_save_user_extensions_request)
        print("The response of ModAssignApi->mod_assign_save_user_extensions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_save_user_extensions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_save_user_extensions_request** | [**ModAssignSaveUserExtensionsRequest**](ModAssignSaveUserExtensionsRequest.md)|  | 

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
**200** | list of warnings |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_assign_set_user_flags**
> object mod_assign_set_user_flags(mod_assign_set_user_flags_request)

Creates or updates user flags

Creates or updates user flags

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_set_user_flags_request import ModAssignSetUserFlagsRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_set_user_flags_request = openapi_client.ModAssignSetUserFlagsRequest() # ModAssignSetUserFlagsRequest | 

    try:
        # Creates or updates user flags
        api_response = api_instance.mod_assign_set_user_flags(mod_assign_set_user_flags_request)
        print("The response of ModAssignApi->mod_assign_set_user_flags:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_set_user_flags: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_set_user_flags_request** | [**ModAssignSetUserFlagsRequest**](ModAssignSetUserFlagsRequest.md)|  | 

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

# **mod_assign_start_submission**
> ModAssignStartSubmission200Response mod_assign_start_submission(mod_assign_start_submission_request)

Start a submission for user if assignment has a time limit.

Start a submission for user if assignment has a time limit.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_start_submission200_response import ModAssignStartSubmission200Response
from openapi_client.models.mod_assign_start_submission_request import ModAssignStartSubmissionRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_start_submission_request = openapi_client.ModAssignStartSubmissionRequest() # ModAssignStartSubmissionRequest | 

    try:
        # Start a submission for user if assignment has a time limit.
        api_response = api_instance.mod_assign_start_submission(mod_assign_start_submission_request)
        print("The response of ModAssignApi->mod_assign_start_submission:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_start_submission: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_start_submission_request** | [**ModAssignStartSubmissionRequest**](ModAssignStartSubmissionRequest.md)|  | 

### Return type

[**ModAssignStartSubmission200Response**](ModAssignStartSubmission200Response.md)

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

# **mod_assign_submit_for_grading**
> object mod_assign_submit_for_grading(mod_assign_submit_for_grading_request)

Submit the current students assignment for grading

Submit the current students assignment for grading

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_submit_for_grading_request import ModAssignSubmitForGradingRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_submit_for_grading_request = openapi_client.ModAssignSubmitForGradingRequest() # ModAssignSubmitForGradingRequest | 

    try:
        # Submit the current students assignment for grading
        api_response = api_instance.mod_assign_submit_for_grading(mod_assign_submit_for_grading_request)
        print("The response of ModAssignApi->mod_assign_submit_for_grading:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_submit_for_grading: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_submit_for_grading_request** | [**ModAssignSubmitForGradingRequest**](ModAssignSubmitForGradingRequest.md)|  | 

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
**200** | list of warnings |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_assign_submit_grading_form**
> object mod_assign_submit_grading_form(mod_assign_submit_grading_form_request)

Submit the grading form data via ajax

Submit the grading form data via ajax

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_submit_grading_form_request import ModAssignSubmitGradingFormRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_submit_grading_form_request = openapi_client.ModAssignSubmitGradingFormRequest() # ModAssignSubmitGradingFormRequest | 

    try:
        # Submit the grading form data via ajax
        api_response = api_instance.mod_assign_submit_grading_form(mod_assign_submit_grading_form_request)
        print("The response of ModAssignApi->mod_assign_submit_grading_form:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_submit_grading_form: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_submit_grading_form_request** | [**ModAssignSubmitGradingFormRequest**](ModAssignSubmitGradingFormRequest.md)|  | 

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
**200** | list of warnings |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_assign_unlock_submissions**
> object mod_assign_unlock_submissions(mod_assign_revert_submissions_to_draft_request)

Allow students to make changes to a list of submissions

Allow students to make changes to a list of submissions

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_assign_revert_submissions_to_draft_request import ModAssignRevertSubmissionsToDraftRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_revert_submissions_to_draft_request = openapi_client.ModAssignRevertSubmissionsToDraftRequest() # ModAssignRevertSubmissionsToDraftRequest | 

    try:
        # Allow students to make changes to a list of submissions
        api_response = api_instance.mod_assign_unlock_submissions(mod_assign_revert_submissions_to_draft_request)
        print("The response of ModAssignApi->mod_assign_unlock_submissions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_unlock_submissions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_revert_submissions_to_draft_request** | [**ModAssignRevertSubmissionsToDraftRequest**](ModAssignRevertSubmissionsToDraftRequest.md)|  | 

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
**200** | list of warnings |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_assign_view_assign**
> CoreCalendarDeleteSubscription200Response mod_assign_view_assign(mod_assign_view_assign_request)

Update the module completion status.

Update the module completion status.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_assign_view_assign_request import ModAssignViewAssignRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_view_assign_request = openapi_client.ModAssignViewAssignRequest() # ModAssignViewAssignRequest | 

    try:
        # Update the module completion status.
        api_response = api_instance.mod_assign_view_assign(mod_assign_view_assign_request)
        print("The response of ModAssignApi->mod_assign_view_assign:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_view_assign: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_view_assign_request** | [**ModAssignViewAssignRequest**](ModAssignViewAssignRequest.md)|  | 

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

# **mod_assign_view_grading_table**
> CoreCalendarDeleteSubscription200Response mod_assign_view_grading_table(mod_assign_view_assign_request)

Trigger the grading_table_viewed event.

Trigger the grading_table_viewed event.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_assign_view_assign_request import ModAssignViewAssignRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_view_assign_request = openapi_client.ModAssignViewAssignRequest() # ModAssignViewAssignRequest | 

    try:
        # Trigger the grading_table_viewed event.
        api_response = api_instance.mod_assign_view_grading_table(mod_assign_view_assign_request)
        print("The response of ModAssignApi->mod_assign_view_grading_table:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_view_grading_table: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_view_assign_request** | [**ModAssignViewAssignRequest**](ModAssignViewAssignRequest.md)|  | 

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

# **mod_assign_view_submission_status**
> CoreCalendarDeleteSubscription200Response mod_assign_view_submission_status(mod_assign_view_assign_request)

Trigger the submission status viewed event.

Trigger the submission status viewed event.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_assign_view_assign_request import ModAssignViewAssignRequest
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
    api_instance = openapi_client.ModAssignApi(api_client)
    mod_assign_view_assign_request = openapi_client.ModAssignViewAssignRequest() # ModAssignViewAssignRequest | 

    try:
        # Trigger the submission status viewed event.
        api_response = api_instance.mod_assign_view_submission_status(mod_assign_view_assign_request)
        print("The response of ModAssignApi->mod_assign_view_submission_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModAssignApi->mod_assign_view_submission_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_assign_view_assign_request** | [**ModAssignViewAssignRequest**](ModAssignViewAssignRequest.md)|  | 

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

