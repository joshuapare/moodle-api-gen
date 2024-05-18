# openapi_client.ModBigbluebuttonbnApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_bigbluebuttonbn_can_join**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_can_join) | **POST** /mod_bigbluebuttonbn_can_join | Returns information if the current user can join or not.
[**mod_bigbluebuttonbn_completion_validate**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_completion_validate) | **POST** /mod_bigbluebuttonbn_completion_validate | Validate completion
[**mod_bigbluebuttonbn_end_meeting**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_end_meeting) | **POST** /mod_bigbluebuttonbn_end_meeting | End a meeting
[**mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses) | **POST** /mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses | Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.
[**mod_bigbluebuttonbn_get_join_url**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_get_join_url) | **POST** /mod_bigbluebuttonbn_get_join_url | Get the join URL for the meeting and create if it does not exist.
[**mod_bigbluebuttonbn_get_recordings**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_get_recordings) | **POST** /mod_bigbluebuttonbn_get_recordings | Returns a list of recordings ready to be processed by a datatable.
[**mod_bigbluebuttonbn_get_recordings_to_import**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_get_recordings_to_import) | **POST** /mod_bigbluebuttonbn_get_recordings_to_import | Returns a list of recordings ready to import to be processed by a datatable.
[**mod_bigbluebuttonbn_meeting_info**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_meeting_info) | **POST** /mod_bigbluebuttonbn_meeting_info | Get displayable information on the meeting
[**mod_bigbluebuttonbn_update_recording**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_update_recording) | **POST** /mod_bigbluebuttonbn_update_recording | Update a single recording
[**mod_bigbluebuttonbn_view_bigbluebuttonbn**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_view_bigbluebuttonbn) | **POST** /mod_bigbluebuttonbn_view_bigbluebuttonbn | Trigger the course module viewed event and update the module completion status.


# **mod_bigbluebuttonbn_can_join**
> ModBigbluebuttonbnCanJoin200Response mod_bigbluebuttonbn_can_join(mod_bigbluebuttonbn_can_join_request)

Returns information if the current user can join or not.

Returns information if the current user can join or not.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_bigbluebuttonbn_can_join200_response import ModBigbluebuttonbnCanJoin200Response
from openapi_client.models.mod_bigbluebuttonbn_can_join_request import ModBigbluebuttonbnCanJoinRequest
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
    api_instance = openapi_client.ModBigbluebuttonbnApi(api_client)
    mod_bigbluebuttonbn_can_join_request = openapi_client.ModBigbluebuttonbnCanJoinRequest() # ModBigbluebuttonbnCanJoinRequest | 

    try:
        # Returns information if the current user can join or not.
        api_response = api_instance.mod_bigbluebuttonbn_can_join(mod_bigbluebuttonbn_can_join_request)
        print("The response of ModBigbluebuttonbnApi->mod_bigbluebuttonbn_can_join:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModBigbluebuttonbnApi->mod_bigbluebuttonbn_can_join: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_bigbluebuttonbn_can_join_request** | [**ModBigbluebuttonbnCanJoinRequest**](ModBigbluebuttonbnCanJoinRequest.md)|  | 

### Return type

[**ModBigbluebuttonbnCanJoin200Response**](ModBigbluebuttonbnCanJoin200Response.md)

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

# **mod_bigbluebuttonbn_completion_validate**
> CoreCohortAddCohortMembers200Response mod_bigbluebuttonbn_completion_validate(mod_bigbluebuttonbn_completion_validate_request)

Validate completion

Validate completion

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_cohort_add_cohort_members200_response import CoreCohortAddCohortMembers200Response
from openapi_client.models.mod_bigbluebuttonbn_completion_validate_request import ModBigbluebuttonbnCompletionValidateRequest
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
    api_instance = openapi_client.ModBigbluebuttonbnApi(api_client)
    mod_bigbluebuttonbn_completion_validate_request = openapi_client.ModBigbluebuttonbnCompletionValidateRequest() # ModBigbluebuttonbnCompletionValidateRequest | 

    try:
        # Validate completion
        api_response = api_instance.mod_bigbluebuttonbn_completion_validate(mod_bigbluebuttonbn_completion_validate_request)
        print("The response of ModBigbluebuttonbnApi->mod_bigbluebuttonbn_completion_validate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModBigbluebuttonbnApi->mod_bigbluebuttonbn_completion_validate: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_bigbluebuttonbn_completion_validate_request** | [**ModBigbluebuttonbnCompletionValidateRequest**](ModBigbluebuttonbnCompletionValidateRequest.md)|  | 

### Return type

[**CoreCohortAddCohortMembers200Response**](CoreCohortAddCohortMembers200Response.md)

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

# **mod_bigbluebuttonbn_end_meeting**
> CoreCohortAddCohortMembers200Response mod_bigbluebuttonbn_end_meeting(mod_bigbluebuttonbn_end_meeting_request)

End a meeting

End a meeting

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_cohort_add_cohort_members200_response import CoreCohortAddCohortMembers200Response
from openapi_client.models.mod_bigbluebuttonbn_end_meeting_request import ModBigbluebuttonbnEndMeetingRequest
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
    api_instance = openapi_client.ModBigbluebuttonbnApi(api_client)
    mod_bigbluebuttonbn_end_meeting_request = openapi_client.ModBigbluebuttonbnEndMeetingRequest() # ModBigbluebuttonbnEndMeetingRequest | 

    try:
        # End a meeting
        api_response = api_instance.mod_bigbluebuttonbn_end_meeting(mod_bigbluebuttonbn_end_meeting_request)
        print("The response of ModBigbluebuttonbnApi->mod_bigbluebuttonbn_end_meeting:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModBigbluebuttonbnApi->mod_bigbluebuttonbn_end_meeting: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_bigbluebuttonbn_end_meeting_request** | [**ModBigbluebuttonbnEndMeetingRequest**](ModBigbluebuttonbnEndMeetingRequest.md)|  | 

### Return type

[**CoreCohortAddCohortMembers200Response**](CoreCohortAddCohortMembers200Response.md)

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

# **mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses**
> ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)

Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.

Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses200_response import ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response
from openapi_client.models.mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request import ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest
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
    api_instance = openapi_client.ModBigbluebuttonbnApi(api_client)
    mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request = openapi_client.ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest() # ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 

    try:
        # Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.
        api_response = api_instance.mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)
        print("The response of ModBigbluebuttonbnApi->mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModBigbluebuttonbnApi->mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md)|  | 

### Return type

[**ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response**](ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response.md)

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

# **mod_bigbluebuttonbn_get_join_url**
> ModBigbluebuttonbnGetJoinUrl200Response mod_bigbluebuttonbn_get_join_url(mod_bigbluebuttonbn_can_join_request)

Get the join URL for the meeting and create if it does not exist.

Get the join URL for the meeting and create if it does not exist.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_bigbluebuttonbn_can_join_request import ModBigbluebuttonbnCanJoinRequest
from openapi_client.models.mod_bigbluebuttonbn_get_join_url200_response import ModBigbluebuttonbnGetJoinUrl200Response
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
    api_instance = openapi_client.ModBigbluebuttonbnApi(api_client)
    mod_bigbluebuttonbn_can_join_request = openapi_client.ModBigbluebuttonbnCanJoinRequest() # ModBigbluebuttonbnCanJoinRequest | 

    try:
        # Get the join URL for the meeting and create if it does not exist.
        api_response = api_instance.mod_bigbluebuttonbn_get_join_url(mod_bigbluebuttonbn_can_join_request)
        print("The response of ModBigbluebuttonbnApi->mod_bigbluebuttonbn_get_join_url:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModBigbluebuttonbnApi->mod_bigbluebuttonbn_get_join_url: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_bigbluebuttonbn_can_join_request** | [**ModBigbluebuttonbnCanJoinRequest**](ModBigbluebuttonbnCanJoinRequest.md)|  | 

### Return type

[**ModBigbluebuttonbnGetJoinUrl200Response**](ModBigbluebuttonbnGetJoinUrl200Response.md)

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

# **mod_bigbluebuttonbn_get_recordings**
> ModBigbluebuttonbnGetRecordings200Response mod_bigbluebuttonbn_get_recordings(mod_bigbluebuttonbn_get_recordings_request)

Returns a list of recordings ready to be processed by a datatable.

Returns a list of recordings ready to be processed by a datatable.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_bigbluebuttonbn_get_recordings200_response import ModBigbluebuttonbnGetRecordings200Response
from openapi_client.models.mod_bigbluebuttonbn_get_recordings_request import ModBigbluebuttonbnGetRecordingsRequest
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
    api_instance = openapi_client.ModBigbluebuttonbnApi(api_client)
    mod_bigbluebuttonbn_get_recordings_request = openapi_client.ModBigbluebuttonbnGetRecordingsRequest() # ModBigbluebuttonbnGetRecordingsRequest | 

    try:
        # Returns a list of recordings ready to be processed by a datatable.
        api_response = api_instance.mod_bigbluebuttonbn_get_recordings(mod_bigbluebuttonbn_get_recordings_request)
        print("The response of ModBigbluebuttonbnApi->mod_bigbluebuttonbn_get_recordings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModBigbluebuttonbnApi->mod_bigbluebuttonbn_get_recordings: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_bigbluebuttonbn_get_recordings_request** | [**ModBigbluebuttonbnGetRecordingsRequest**](ModBigbluebuttonbnGetRecordingsRequest.md)|  | 

### Return type

[**ModBigbluebuttonbnGetRecordings200Response**](ModBigbluebuttonbnGetRecordings200Response.md)

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

# **mod_bigbluebuttonbn_get_recordings_to_import**
> ModBigbluebuttonbnGetRecordingsToImport200Response mod_bigbluebuttonbn_get_recordings_to_import(mod_bigbluebuttonbn_get_recordings_to_import_request)

Returns a list of recordings ready to import to be processed by a datatable.

Returns a list of recordings ready to import to be processed by a datatable.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_bigbluebuttonbn_get_recordings_to_import200_response import ModBigbluebuttonbnGetRecordingsToImport200Response
from openapi_client.models.mod_bigbluebuttonbn_get_recordings_to_import_request import ModBigbluebuttonbnGetRecordingsToImportRequest
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
    api_instance = openapi_client.ModBigbluebuttonbnApi(api_client)
    mod_bigbluebuttonbn_get_recordings_to_import_request = openapi_client.ModBigbluebuttonbnGetRecordingsToImportRequest() # ModBigbluebuttonbnGetRecordingsToImportRequest | 

    try:
        # Returns a list of recordings ready to import to be processed by a datatable.
        api_response = api_instance.mod_bigbluebuttonbn_get_recordings_to_import(mod_bigbluebuttonbn_get_recordings_to_import_request)
        print("The response of ModBigbluebuttonbnApi->mod_bigbluebuttonbn_get_recordings_to_import:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModBigbluebuttonbnApi->mod_bigbluebuttonbn_get_recordings_to_import: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_bigbluebuttonbn_get_recordings_to_import_request** | [**ModBigbluebuttonbnGetRecordingsToImportRequest**](ModBigbluebuttonbnGetRecordingsToImportRequest.md)|  | 

### Return type

[**ModBigbluebuttonbnGetRecordingsToImport200Response**](ModBigbluebuttonbnGetRecordingsToImport200Response.md)

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

# **mod_bigbluebuttonbn_meeting_info**
> ModBigbluebuttonbnMeetingInfo200Response mod_bigbluebuttonbn_meeting_info(mod_bigbluebuttonbn_meeting_info_request)

Get displayable information on the meeting

Get displayable information on the meeting

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_bigbluebuttonbn_meeting_info200_response import ModBigbluebuttonbnMeetingInfo200Response
from openapi_client.models.mod_bigbluebuttonbn_meeting_info_request import ModBigbluebuttonbnMeetingInfoRequest
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
    api_instance = openapi_client.ModBigbluebuttonbnApi(api_client)
    mod_bigbluebuttonbn_meeting_info_request = openapi_client.ModBigbluebuttonbnMeetingInfoRequest() # ModBigbluebuttonbnMeetingInfoRequest | 

    try:
        # Get displayable information on the meeting
        api_response = api_instance.mod_bigbluebuttonbn_meeting_info(mod_bigbluebuttonbn_meeting_info_request)
        print("The response of ModBigbluebuttonbnApi->mod_bigbluebuttonbn_meeting_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModBigbluebuttonbnApi->mod_bigbluebuttonbn_meeting_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_bigbluebuttonbn_meeting_info_request** | [**ModBigbluebuttonbnMeetingInfoRequest**](ModBigbluebuttonbnMeetingInfoRequest.md)|  | 

### Return type

[**ModBigbluebuttonbnMeetingInfo200Response**](ModBigbluebuttonbnMeetingInfo200Response.md)

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

# **mod_bigbluebuttonbn_update_recording**
> object mod_bigbluebuttonbn_update_recording(mod_bigbluebuttonbn_update_recording_request)

Update a single recording

Update a single recording

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_bigbluebuttonbn_update_recording_request import ModBigbluebuttonbnUpdateRecordingRequest
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
    api_instance = openapi_client.ModBigbluebuttonbnApi(api_client)
    mod_bigbluebuttonbn_update_recording_request = openapi_client.ModBigbluebuttonbnUpdateRecordingRequest() # ModBigbluebuttonbnUpdateRecordingRequest | 

    try:
        # Update a single recording
        api_response = api_instance.mod_bigbluebuttonbn_update_recording(mod_bigbluebuttonbn_update_recording_request)
        print("The response of ModBigbluebuttonbnApi->mod_bigbluebuttonbn_update_recording:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModBigbluebuttonbnApi->mod_bigbluebuttonbn_update_recording: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_bigbluebuttonbn_update_recording_request** | [**ModBigbluebuttonbnUpdateRecordingRequest**](ModBigbluebuttonbnUpdateRecordingRequest.md)|  | 

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

# **mod_bigbluebuttonbn_view_bigbluebuttonbn**
> CoreCalendarDeleteSubscription200Response mod_bigbluebuttonbn_view_bigbluebuttonbn(mod_bigbluebuttonbn_view_bigbluebuttonbn_request)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_bigbluebuttonbn_view_bigbluebuttonbn_request import ModBigbluebuttonbnViewBigbluebuttonbnRequest
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
    api_instance = openapi_client.ModBigbluebuttonbnApi(api_client)
    mod_bigbluebuttonbn_view_bigbluebuttonbn_request = openapi_client.ModBigbluebuttonbnViewBigbluebuttonbnRequest() # ModBigbluebuttonbnViewBigbluebuttonbnRequest | 

    try:
        # Trigger the course module viewed event and update the module completion status.
        api_response = api_instance.mod_bigbluebuttonbn_view_bigbluebuttonbn(mod_bigbluebuttonbn_view_bigbluebuttonbn_request)
        print("The response of ModBigbluebuttonbnApi->mod_bigbluebuttonbn_view_bigbluebuttonbn:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModBigbluebuttonbnApi->mod_bigbluebuttonbn_view_bigbluebuttonbn: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_bigbluebuttonbn_view_bigbluebuttonbn_request** | [**ModBigbluebuttonbnViewBigbluebuttonbnRequest**](ModBigbluebuttonbnViewBigbluebuttonbnRequest.md)|  | 

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

