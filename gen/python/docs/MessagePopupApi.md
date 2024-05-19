# openapi_client.MessagePopupApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**message_popup_get_popup_notifications**](MessagePopupApi.md#message_popup_get_popup_notifications) | **POST** /message_popup_get_popup_notifications | Retrieve a list of popup notifications for a user
[**message_popup_get_unread_popup_notification_count**](MessagePopupApi.md#message_popup_get_unread_popup_notification_count) | **POST** /message_popup_get_unread_popup_notification_count | Retrieve the count of unread popup notifications for a given user


# **message_popup_get_popup_notifications**
> MessagePopupGetPopupNotifications200Response message_popup_get_popup_notifications(message_popup_get_popup_notifications_request)

Retrieve a list of popup notifications for a user

Retrieve a list of popup notifications for a user

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.message_popup_get_popup_notifications200_response import MessagePopupGetPopupNotifications200Response
from openapi_client.models.message_popup_get_popup_notifications_request import MessagePopupGetPopupNotificationsRequest
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
    api_instance = openapi_client.MessagePopupApi(api_client)
    message_popup_get_popup_notifications_request = openapi_client.MessagePopupGetPopupNotificationsRequest() # MessagePopupGetPopupNotificationsRequest | 

    try:
        # Retrieve a list of popup notifications for a user
        api_response = api_instance.message_popup_get_popup_notifications(message_popup_get_popup_notifications_request)
        print("The response of MessagePopupApi->message_popup_get_popup_notifications:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MessagePopupApi->message_popup_get_popup_notifications: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_popup_get_popup_notifications_request** | [**MessagePopupGetPopupNotificationsRequest**](MessagePopupGetPopupNotificationsRequest.md)|  | 

### Return type

[**MessagePopupGetPopupNotifications200Response**](MessagePopupGetPopupNotifications200Response.md)

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

# **message_popup_get_unread_popup_notification_count**
> object message_popup_get_unread_popup_notification_count(core_message_get_unread_conversations_count_request)

Retrieve the count of unread popup notifications for a given user

Retrieve the count of unread popup notifications for a given user

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_message_get_unread_conversations_count_request import CoreMessageGetUnreadConversationsCountRequest
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
    api_instance = openapi_client.MessagePopupApi(api_client)
    core_message_get_unread_conversations_count_request = openapi_client.CoreMessageGetUnreadConversationsCountRequest() # CoreMessageGetUnreadConversationsCountRequest | 

    try:
        # Retrieve the count of unread popup notifications for a given user
        api_response = api_instance.message_popup_get_unread_popup_notification_count(core_message_get_unread_conversations_count_request)
        print("The response of MessagePopupApi->message_popup_get_unread_popup_notification_count:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MessagePopupApi->message_popup_get_unread_popup_notification_count: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **core_message_get_unread_conversations_count_request** | [**CoreMessageGetUnreadConversationsCountRequest**](CoreMessageGetUnreadConversationsCountRequest.md)|  | 

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
**200** | The count of unread popup notifications |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

