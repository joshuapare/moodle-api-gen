# openapi_client.ModChatApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_chat_get_chat_latest_messages**](ModChatApi.md#mod_chat_get_chat_latest_messages) | **POST** /mod_chat_get_chat_latest_messages | Get the latest messages from the given chat session.
[**mod_chat_get_chat_users**](ModChatApi.md#mod_chat_get_chat_users) | **POST** /mod_chat_get_chat_users | Get the list of users in the given chat session.
[**mod_chat_get_chats_by_courses**](ModChatApi.md#mod_chat_get_chats_by_courses) | **POST** /mod_chat_get_chats_by_courses | Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.
[**mod_chat_get_session_messages**](ModChatApi.md#mod_chat_get_session_messages) | **POST** /mod_chat_get_session_messages | Retrieves messages of the given chat session.
[**mod_chat_get_sessions**](ModChatApi.md#mod_chat_get_sessions) | **POST** /mod_chat_get_sessions | Retrieves chat sessions for a given chat.
[**mod_chat_login_user**](ModChatApi.md#mod_chat_login_user) | **POST** /mod_chat_login_user | Log a user into a chat room in the given chat.
[**mod_chat_send_chat_message**](ModChatApi.md#mod_chat_send_chat_message) | **POST** /mod_chat_send_chat_message | Send a message on the given chat session.
[**mod_chat_view_chat**](ModChatApi.md#mod_chat_view_chat) | **POST** /mod_chat_view_chat | Trigger the course module viewed event and update the module completion status.
[**mod_chat_view_sessions**](ModChatApi.md#mod_chat_view_sessions) | **POST** /mod_chat_view_sessions | Trigger the chat session viewed event.


# **mod_chat_get_chat_latest_messages**
> ModChatGetChatLatestMessages200Response mod_chat_get_chat_latest_messages(mod_chat_get_chat_latest_messages_request)

Get the latest messages from the given chat session.

Get the latest messages from the given chat session.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_chat_get_chat_latest_messages200_response import ModChatGetChatLatestMessages200Response
from openapi_client.models.mod_chat_get_chat_latest_messages_request import ModChatGetChatLatestMessagesRequest
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
    api_instance = openapi_client.ModChatApi(api_client)
    mod_chat_get_chat_latest_messages_request = openapi_client.ModChatGetChatLatestMessagesRequest() # ModChatGetChatLatestMessagesRequest | 

    try:
        # Get the latest messages from the given chat session.
        api_response = api_instance.mod_chat_get_chat_latest_messages(mod_chat_get_chat_latest_messages_request)
        print("The response of ModChatApi->mod_chat_get_chat_latest_messages:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModChatApi->mod_chat_get_chat_latest_messages: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_chat_get_chat_latest_messages_request** | [**ModChatGetChatLatestMessagesRequest**](ModChatGetChatLatestMessagesRequest.md)|  | 

### Return type

[**ModChatGetChatLatestMessages200Response**](ModChatGetChatLatestMessages200Response.md)

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

# **mod_chat_get_chat_users**
> ModChatGetChatUsers200Response mod_chat_get_chat_users(mod_chat_get_chat_users_request)

Get the list of users in the given chat session.

Get the list of users in the given chat session.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_chat_get_chat_users200_response import ModChatGetChatUsers200Response
from openapi_client.models.mod_chat_get_chat_users_request import ModChatGetChatUsersRequest
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
    api_instance = openapi_client.ModChatApi(api_client)
    mod_chat_get_chat_users_request = openapi_client.ModChatGetChatUsersRequest() # ModChatGetChatUsersRequest | 

    try:
        # Get the list of users in the given chat session.
        api_response = api_instance.mod_chat_get_chat_users(mod_chat_get_chat_users_request)
        print("The response of ModChatApi->mod_chat_get_chat_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModChatApi->mod_chat_get_chat_users: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_chat_get_chat_users_request** | [**ModChatGetChatUsersRequest**](ModChatGetChatUsersRequest.md)|  | 

### Return type

[**ModChatGetChatUsers200Response**](ModChatGetChatUsers200Response.md)

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

# **mod_chat_get_chats_by_courses**
> ModChatGetChatsByCourses200Response mod_chat_get_chats_by_courses(mod_chat_get_chats_by_courses_request)

Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.

Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_chat_get_chats_by_courses200_response import ModChatGetChatsByCourses200Response
from openapi_client.models.mod_chat_get_chats_by_courses_request import ModChatGetChatsByCoursesRequest
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
    api_instance = openapi_client.ModChatApi(api_client)
    mod_chat_get_chats_by_courses_request = openapi_client.ModChatGetChatsByCoursesRequest() # ModChatGetChatsByCoursesRequest | 

    try:
        # Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.
        api_response = api_instance.mod_chat_get_chats_by_courses(mod_chat_get_chats_by_courses_request)
        print("The response of ModChatApi->mod_chat_get_chats_by_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModChatApi->mod_chat_get_chats_by_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md)|  | 

### Return type

[**ModChatGetChatsByCourses200Response**](ModChatGetChatsByCourses200Response.md)

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

# **mod_chat_get_session_messages**
> ModChatGetSessionMessages200Response mod_chat_get_session_messages(mod_chat_get_session_messages_request)

Retrieves messages of the given chat session.

Retrieves messages of the given chat session.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_chat_get_session_messages200_response import ModChatGetSessionMessages200Response
from openapi_client.models.mod_chat_get_session_messages_request import ModChatGetSessionMessagesRequest
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
    api_instance = openapi_client.ModChatApi(api_client)
    mod_chat_get_session_messages_request = openapi_client.ModChatGetSessionMessagesRequest() # ModChatGetSessionMessagesRequest | 

    try:
        # Retrieves messages of the given chat session.
        api_response = api_instance.mod_chat_get_session_messages(mod_chat_get_session_messages_request)
        print("The response of ModChatApi->mod_chat_get_session_messages:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModChatApi->mod_chat_get_session_messages: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_chat_get_session_messages_request** | [**ModChatGetSessionMessagesRequest**](ModChatGetSessionMessagesRequest.md)|  | 

### Return type

[**ModChatGetSessionMessages200Response**](ModChatGetSessionMessages200Response.md)

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

# **mod_chat_get_sessions**
> ModChatGetSessions200Response mod_chat_get_sessions(mod_chat_get_sessions_request)

Retrieves chat sessions for a given chat.

Retrieves chat sessions for a given chat.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_chat_get_sessions200_response import ModChatGetSessions200Response
from openapi_client.models.mod_chat_get_sessions_request import ModChatGetSessionsRequest
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
    api_instance = openapi_client.ModChatApi(api_client)
    mod_chat_get_sessions_request = openapi_client.ModChatGetSessionsRequest() # ModChatGetSessionsRequest | 

    try:
        # Retrieves chat sessions for a given chat.
        api_response = api_instance.mod_chat_get_sessions(mod_chat_get_sessions_request)
        print("The response of ModChatApi->mod_chat_get_sessions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModChatApi->mod_chat_get_sessions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_chat_get_sessions_request** | [**ModChatGetSessionsRequest**](ModChatGetSessionsRequest.md)|  | 

### Return type

[**ModChatGetSessions200Response**](ModChatGetSessions200Response.md)

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

# **mod_chat_login_user**
> ModChatLoginUser200Response mod_chat_login_user(mod_chat_login_user_request)

Log a user into a chat room in the given chat.

Log a user into a chat room in the given chat.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_chat_login_user200_response import ModChatLoginUser200Response
from openapi_client.models.mod_chat_login_user_request import ModChatLoginUserRequest
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
    api_instance = openapi_client.ModChatApi(api_client)
    mod_chat_login_user_request = openapi_client.ModChatLoginUserRequest() # ModChatLoginUserRequest | 

    try:
        # Log a user into a chat room in the given chat.
        api_response = api_instance.mod_chat_login_user(mod_chat_login_user_request)
        print("The response of ModChatApi->mod_chat_login_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModChatApi->mod_chat_login_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_chat_login_user_request** | [**ModChatLoginUserRequest**](ModChatLoginUserRequest.md)|  | 

### Return type

[**ModChatLoginUser200Response**](ModChatLoginUser200Response.md)

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

# **mod_chat_send_chat_message**
> ModChatSendChatMessage200Response mod_chat_send_chat_message(mod_chat_send_chat_message_request)

Send a message on the given chat session.

Send a message on the given chat session.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_chat_send_chat_message200_response import ModChatSendChatMessage200Response
from openapi_client.models.mod_chat_send_chat_message_request import ModChatSendChatMessageRequest
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
    api_instance = openapi_client.ModChatApi(api_client)
    mod_chat_send_chat_message_request = openapi_client.ModChatSendChatMessageRequest() # ModChatSendChatMessageRequest | 

    try:
        # Send a message on the given chat session.
        api_response = api_instance.mod_chat_send_chat_message(mod_chat_send_chat_message_request)
        print("The response of ModChatApi->mod_chat_send_chat_message:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModChatApi->mod_chat_send_chat_message: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_chat_send_chat_message_request** | [**ModChatSendChatMessageRequest**](ModChatSendChatMessageRequest.md)|  | 

### Return type

[**ModChatSendChatMessage200Response**](ModChatSendChatMessage200Response.md)

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

# **mod_chat_view_chat**
> CoreCalendarDeleteSubscription200Response mod_chat_view_chat(mod_chat_view_chat_request)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_chat_view_chat_request import ModChatViewChatRequest
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
    api_instance = openapi_client.ModChatApi(api_client)
    mod_chat_view_chat_request = openapi_client.ModChatViewChatRequest() # ModChatViewChatRequest | 

    try:
        # Trigger the course module viewed event and update the module completion status.
        api_response = api_instance.mod_chat_view_chat(mod_chat_view_chat_request)
        print("The response of ModChatApi->mod_chat_view_chat:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModChatApi->mod_chat_view_chat: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_chat_view_chat_request** | [**ModChatViewChatRequest**](ModChatViewChatRequest.md)|  | 

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

# **mod_chat_view_sessions**
> CoreCalendarDeleteSubscription200Response mod_chat_view_sessions(mod_chat_view_sessions_request)

Trigger the chat session viewed event.

Trigger the chat session viewed event.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_chat_view_sessions_request import ModChatViewSessionsRequest
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
    api_instance = openapi_client.ModChatApi(api_client)
    mod_chat_view_sessions_request = openapi_client.ModChatViewSessionsRequest() # ModChatViewSessionsRequest | 

    try:
        # Trigger the chat session viewed event.
        api_response = api_instance.mod_chat_view_sessions(mod_chat_view_sessions_request)
        print("The response of ModChatApi->mod_chat_view_sessions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModChatApi->mod_chat_view_sessions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_chat_view_sessions_request** | [**ModChatViewSessionsRequest**](ModChatViewSessionsRequest.md)|  | 

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

