# openapi_client.ModScormApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_scorm_get_scorm_access_information**](ModScormApi.md#mod_scorm_get_scorm_access_information) | **POST** /mod_scorm_get_scorm_access_information | Return capabilities information for a given scorm.
[**mod_scorm_get_scorm_attempt_count**](ModScormApi.md#mod_scorm_get_scorm_attempt_count) | **POST** /mod_scorm_get_scorm_attempt_count | Return the number of attempts done by a user in the given SCORM.
[**mod_scorm_get_scorm_sco_tracks**](ModScormApi.md#mod_scorm_get_scorm_sco_tracks) | **POST** /mod_scorm_get_scorm_sco_tracks | Retrieves SCO tracking data for the given user id and attempt number
[**mod_scorm_get_scorm_scoes**](ModScormApi.md#mod_scorm_get_scorm_scoes) | **POST** /mod_scorm_get_scorm_scoes | Returns a list containing all the scoes data related to the given scorm id
[**mod_scorm_get_scorm_user_data**](ModScormApi.md#mod_scorm_get_scorm_user_data) | **POST** /mod_scorm_get_scorm_user_data | Retrieves user tracking and SCO data and default SCORM values
[**mod_scorm_get_scorms_by_courses**](ModScormApi.md#mod_scorm_get_scorms_by_courses) | **POST** /mod_scorm_get_scorms_by_courses | Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.
[**mod_scorm_insert_scorm_tracks**](ModScormApi.md#mod_scorm_insert_scorm_tracks) | **POST** /mod_scorm_insert_scorm_tracks | Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.
[**mod_scorm_launch_sco**](ModScormApi.md#mod_scorm_launch_sco) | **POST** /mod_scorm_launch_sco | Trigger the SCO launched event.
[**mod_scorm_view_scorm**](ModScormApi.md#mod_scorm_view_scorm) | **POST** /mod_scorm_view_scorm | Trigger the course module viewed event.


# **mod_scorm_get_scorm_access_information**
> ModScormGetScormAccessInformation200Response mod_scorm_get_scorm_access_information(mod_scorm_get_scorm_access_information_request)

Return capabilities information for a given scorm.

Return capabilities information for a given scorm.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_scorm_get_scorm_access_information200_response import ModScormGetScormAccessInformation200Response
from openapi_client.models.mod_scorm_get_scorm_access_information_request import ModScormGetScormAccessInformationRequest
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
    api_instance = openapi_client.ModScormApi(api_client)
    mod_scorm_get_scorm_access_information_request = openapi_client.ModScormGetScormAccessInformationRequest() # ModScormGetScormAccessInformationRequest | 

    try:
        # Return capabilities information for a given scorm.
        api_response = api_instance.mod_scorm_get_scorm_access_information(mod_scorm_get_scorm_access_information_request)
        print("The response of ModScormApi->mod_scorm_get_scorm_access_information:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModScormApi->mod_scorm_get_scorm_access_information: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_scorm_get_scorm_access_information_request** | [**ModScormGetScormAccessInformationRequest**](ModScormGetScormAccessInformationRequest.md)|  | 

### Return type

[**ModScormGetScormAccessInformation200Response**](ModScormGetScormAccessInformation200Response.md)

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

# **mod_scorm_get_scorm_attempt_count**
> ModScormGetScormAttemptCount200Response mod_scorm_get_scorm_attempt_count(mod_scorm_get_scorm_attempt_count_request)

Return the number of attempts done by a user in the given SCORM.

Return the number of attempts done by a user in the given SCORM.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_scorm_get_scorm_attempt_count200_response import ModScormGetScormAttemptCount200Response
from openapi_client.models.mod_scorm_get_scorm_attempt_count_request import ModScormGetScormAttemptCountRequest
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
    api_instance = openapi_client.ModScormApi(api_client)
    mod_scorm_get_scorm_attempt_count_request = openapi_client.ModScormGetScormAttemptCountRequest() # ModScormGetScormAttemptCountRequest | 

    try:
        # Return the number of attempts done by a user in the given SCORM.
        api_response = api_instance.mod_scorm_get_scorm_attempt_count(mod_scorm_get_scorm_attempt_count_request)
        print("The response of ModScormApi->mod_scorm_get_scorm_attempt_count:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModScormApi->mod_scorm_get_scorm_attempt_count: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_scorm_get_scorm_attempt_count_request** | [**ModScormGetScormAttemptCountRequest**](ModScormGetScormAttemptCountRequest.md)|  | 

### Return type

[**ModScormGetScormAttemptCount200Response**](ModScormGetScormAttemptCount200Response.md)

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

# **mod_scorm_get_scorm_sco_tracks**
> ModScormGetScormScoTracks200Response mod_scorm_get_scorm_sco_tracks(mod_scorm_get_scorm_sco_tracks_request)

Retrieves SCO tracking data for the given user id and attempt number

Retrieves SCO tracking data for the given user id and attempt number

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_scorm_get_scorm_sco_tracks200_response import ModScormGetScormScoTracks200Response
from openapi_client.models.mod_scorm_get_scorm_sco_tracks_request import ModScormGetScormScoTracksRequest
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
    api_instance = openapi_client.ModScormApi(api_client)
    mod_scorm_get_scorm_sco_tracks_request = openapi_client.ModScormGetScormScoTracksRequest() # ModScormGetScormScoTracksRequest | 

    try:
        # Retrieves SCO tracking data for the given user id and attempt number
        api_response = api_instance.mod_scorm_get_scorm_sco_tracks(mod_scorm_get_scorm_sco_tracks_request)
        print("The response of ModScormApi->mod_scorm_get_scorm_sco_tracks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModScormApi->mod_scorm_get_scorm_sco_tracks: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_scorm_get_scorm_sco_tracks_request** | [**ModScormGetScormScoTracksRequest**](ModScormGetScormScoTracksRequest.md)|  | 

### Return type

[**ModScormGetScormScoTracks200Response**](ModScormGetScormScoTracks200Response.md)

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

# **mod_scorm_get_scorm_scoes**
> ModScormGetScormScoes200Response mod_scorm_get_scorm_scoes(mod_scorm_get_scorm_scoes_request)

Returns a list containing all the scoes data related to the given scorm id

Returns a list containing all the scoes data related to the given scorm id

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_scorm_get_scorm_scoes200_response import ModScormGetScormScoes200Response
from openapi_client.models.mod_scorm_get_scorm_scoes_request import ModScormGetScormScoesRequest
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
    api_instance = openapi_client.ModScormApi(api_client)
    mod_scorm_get_scorm_scoes_request = openapi_client.ModScormGetScormScoesRequest() # ModScormGetScormScoesRequest | 

    try:
        # Returns a list containing all the scoes data related to the given scorm id
        api_response = api_instance.mod_scorm_get_scorm_scoes(mod_scorm_get_scorm_scoes_request)
        print("The response of ModScormApi->mod_scorm_get_scorm_scoes:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModScormApi->mod_scorm_get_scorm_scoes: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_scorm_get_scorm_scoes_request** | [**ModScormGetScormScoesRequest**](ModScormGetScormScoesRequest.md)|  | 

### Return type

[**ModScormGetScormScoes200Response**](ModScormGetScormScoes200Response.md)

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

# **mod_scorm_get_scorm_user_data**
> ModScormGetScormUserData200Response mod_scorm_get_scorm_user_data(mod_scorm_get_scorm_user_data_request)

Retrieves user tracking and SCO data and default SCORM values

Retrieves user tracking and SCO data and default SCORM values

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_scorm_get_scorm_user_data200_response import ModScormGetScormUserData200Response
from openapi_client.models.mod_scorm_get_scorm_user_data_request import ModScormGetScormUserDataRequest
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
    api_instance = openapi_client.ModScormApi(api_client)
    mod_scorm_get_scorm_user_data_request = openapi_client.ModScormGetScormUserDataRequest() # ModScormGetScormUserDataRequest | 

    try:
        # Retrieves user tracking and SCO data and default SCORM values
        api_response = api_instance.mod_scorm_get_scorm_user_data(mod_scorm_get_scorm_user_data_request)
        print("The response of ModScormApi->mod_scorm_get_scorm_user_data:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModScormApi->mod_scorm_get_scorm_user_data: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_scorm_get_scorm_user_data_request** | [**ModScormGetScormUserDataRequest**](ModScormGetScormUserDataRequest.md)|  | 

### Return type

[**ModScormGetScormUserData200Response**](ModScormGetScormUserData200Response.md)

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

# **mod_scorm_get_scorms_by_courses**
> ModScormGetScormsByCourses200Response mod_scorm_get_scorms_by_courses(mod_chat_get_chats_by_courses_request)

Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.

Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_chat_get_chats_by_courses_request import ModChatGetChatsByCoursesRequest
from openapi_client.models.mod_scorm_get_scorms_by_courses200_response import ModScormGetScormsByCourses200Response
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
    api_instance = openapi_client.ModScormApi(api_client)
    mod_chat_get_chats_by_courses_request = openapi_client.ModChatGetChatsByCoursesRequest() # ModChatGetChatsByCoursesRequest | 

    try:
        # Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.
        api_response = api_instance.mod_scorm_get_scorms_by_courses(mod_chat_get_chats_by_courses_request)
        print("The response of ModScormApi->mod_scorm_get_scorms_by_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModScormApi->mod_scorm_get_scorms_by_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md)|  | 

### Return type

[**ModScormGetScormsByCourses200Response**](ModScormGetScormsByCourses200Response.md)

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

# **mod_scorm_insert_scorm_tracks**
> ModScormInsertScormTracks200Response mod_scorm_insert_scorm_tracks(mod_scorm_insert_scorm_tracks_request)

Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.

Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_scorm_insert_scorm_tracks200_response import ModScormInsertScormTracks200Response
from openapi_client.models.mod_scorm_insert_scorm_tracks_request import ModScormInsertScormTracksRequest
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
    api_instance = openapi_client.ModScormApi(api_client)
    mod_scorm_insert_scorm_tracks_request = openapi_client.ModScormInsertScormTracksRequest() # ModScormInsertScormTracksRequest | 

    try:
        # Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.
        api_response = api_instance.mod_scorm_insert_scorm_tracks(mod_scorm_insert_scorm_tracks_request)
        print("The response of ModScormApi->mod_scorm_insert_scorm_tracks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModScormApi->mod_scorm_insert_scorm_tracks: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_scorm_insert_scorm_tracks_request** | [**ModScormInsertScormTracksRequest**](ModScormInsertScormTracksRequest.md)|  | 

### Return type

[**ModScormInsertScormTracks200Response**](ModScormInsertScormTracks200Response.md)

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

# **mod_scorm_launch_sco**
> CoreCalendarDeleteSubscription200Response mod_scorm_launch_sco(mod_scorm_launch_sco_request)

Trigger the SCO launched event.

Trigger the SCO launched event.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_scorm_launch_sco_request import ModScormLaunchScoRequest
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
    api_instance = openapi_client.ModScormApi(api_client)
    mod_scorm_launch_sco_request = openapi_client.ModScormLaunchScoRequest() # ModScormLaunchScoRequest | 

    try:
        # Trigger the SCO launched event.
        api_response = api_instance.mod_scorm_launch_sco(mod_scorm_launch_sco_request)
        print("The response of ModScormApi->mod_scorm_launch_sco:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModScormApi->mod_scorm_launch_sco: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_scorm_launch_sco_request** | [**ModScormLaunchScoRequest**](ModScormLaunchScoRequest.md)|  | 

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

# **mod_scorm_view_scorm**
> CoreCalendarDeleteSubscription200Response mod_scorm_view_scorm(mod_scorm_view_scorm_request)

Trigger the course module viewed event.

Trigger the course module viewed event.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_scorm_view_scorm_request import ModScormViewScormRequest
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
    api_instance = openapi_client.ModScormApi(api_client)
    mod_scorm_view_scorm_request = openapi_client.ModScormViewScormRequest() # ModScormViewScormRequest | 

    try:
        # Trigger the course module viewed event.
        api_response = api_instance.mod_scorm_view_scorm(mod_scorm_view_scorm_request)
        print("The response of ModScormApi->mod_scorm_view_scorm:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModScormApi->mod_scorm_view_scorm: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_scorm_view_scorm_request** | [**ModScormViewScormRequest**](ModScormViewScormRequest.md)|  | 

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

