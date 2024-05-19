# openapi_client.MessageAirnotifierApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**message_airnotifier_are_notification_preferences_configured**](MessageAirnotifierApi.md#message_airnotifier_are_notification_preferences_configured) | **POST** /message_airnotifier_are_notification_preferences_configured | Check if the users have notification preferences configured yet
[**message_airnotifier_enable_device**](MessageAirnotifierApi.md#message_airnotifier_enable_device) | **POST** /message_airnotifier_enable_device | Enables or disables a registered user device so it can receive Push notifications
[**message_airnotifier_get_user_devices**](MessageAirnotifierApi.md#message_airnotifier_get_user_devices) | **POST** /message_airnotifier_get_user_devices | Return the list of mobile devices that are registered in Moodle for the given user
[**message_airnotifier_is_system_configured**](MessageAirnotifierApi.md#message_airnotifier_is_system_configured) | **POST** /message_airnotifier_is_system_configured | Check whether the airnotifier settings have been configured


# **message_airnotifier_are_notification_preferences_configured**
> MessageAirnotifierAreNotificationPreferencesConfigured200Response message_airnotifier_are_notification_preferences_configured(message_airnotifier_are_notification_preferences_configured_request)

Check if the users have notification preferences configured yet

Check if the users have notification preferences configured yet

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.message_airnotifier_are_notification_preferences_configured200_response import MessageAirnotifierAreNotificationPreferencesConfigured200Response
from openapi_client.models.message_airnotifier_are_notification_preferences_configured_request import MessageAirnotifierAreNotificationPreferencesConfiguredRequest
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
    api_instance = openapi_client.MessageAirnotifierApi(api_client)
    message_airnotifier_are_notification_preferences_configured_request = openapi_client.MessageAirnotifierAreNotificationPreferencesConfiguredRequest() # MessageAirnotifierAreNotificationPreferencesConfiguredRequest | 

    try:
        # Check if the users have notification preferences configured yet
        api_response = api_instance.message_airnotifier_are_notification_preferences_configured(message_airnotifier_are_notification_preferences_configured_request)
        print("The response of MessageAirnotifierApi->message_airnotifier_are_notification_preferences_configured:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MessageAirnotifierApi->message_airnotifier_are_notification_preferences_configured: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_airnotifier_are_notification_preferences_configured_request** | [**MessageAirnotifierAreNotificationPreferencesConfiguredRequest**](MessageAirnotifierAreNotificationPreferencesConfiguredRequest.md)|  | 

### Return type

[**MessageAirnotifierAreNotificationPreferencesConfigured200Response**](MessageAirnotifierAreNotificationPreferencesConfigured200Response.md)

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

# **message_airnotifier_enable_device**
> MessageAirnotifierEnableDevice200Response message_airnotifier_enable_device(message_airnotifier_enable_device_request)

Enables or disables a registered user device so it can receive Push notifications

Enables or disables a registered user device so it can receive Push notifications

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.message_airnotifier_enable_device200_response import MessageAirnotifierEnableDevice200Response
from openapi_client.models.message_airnotifier_enable_device_request import MessageAirnotifierEnableDeviceRequest
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
    api_instance = openapi_client.MessageAirnotifierApi(api_client)
    message_airnotifier_enable_device_request = openapi_client.MessageAirnotifierEnableDeviceRequest() # MessageAirnotifierEnableDeviceRequest | 

    try:
        # Enables or disables a registered user device so it can receive Push notifications
        api_response = api_instance.message_airnotifier_enable_device(message_airnotifier_enable_device_request)
        print("The response of MessageAirnotifierApi->message_airnotifier_enable_device:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MessageAirnotifierApi->message_airnotifier_enable_device: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_airnotifier_enable_device_request** | [**MessageAirnotifierEnableDeviceRequest**](MessageAirnotifierEnableDeviceRequest.md)|  | 

### Return type

[**MessageAirnotifierEnableDevice200Response**](MessageAirnotifierEnableDevice200Response.md)

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

# **message_airnotifier_get_user_devices**
> MessageAirnotifierGetUserDevices200Response message_airnotifier_get_user_devices(message_airnotifier_get_user_devices_request)

Return the list of mobile devices that are registered in Moodle for the given user

Return the list of mobile devices that are registered in Moodle for the given user

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.message_airnotifier_get_user_devices200_response import MessageAirnotifierGetUserDevices200Response
from openapi_client.models.message_airnotifier_get_user_devices_request import MessageAirnotifierGetUserDevicesRequest
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
    api_instance = openapi_client.MessageAirnotifierApi(api_client)
    message_airnotifier_get_user_devices_request = openapi_client.MessageAirnotifierGetUserDevicesRequest() # MessageAirnotifierGetUserDevicesRequest | 

    try:
        # Return the list of mobile devices that are registered in Moodle for the given user
        api_response = api_instance.message_airnotifier_get_user_devices(message_airnotifier_get_user_devices_request)
        print("The response of MessageAirnotifierApi->message_airnotifier_get_user_devices:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MessageAirnotifierApi->message_airnotifier_get_user_devices: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_airnotifier_get_user_devices_request** | [**MessageAirnotifierGetUserDevicesRequest**](MessageAirnotifierGetUserDevicesRequest.md)|  | 

### Return type

[**MessageAirnotifierGetUserDevices200Response**](MessageAirnotifierGetUserDevices200Response.md)

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

# **message_airnotifier_is_system_configured**
> object message_airnotifier_is_system_configured()

Check whether the airnotifier settings have been configured

Check whether the airnotifier settings have been configured

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
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
    api_instance = openapi_client.MessageAirnotifierApi(api_client)

    try:
        # Check whether the airnotifier settings have been configured
        api_response = api_instance.message_airnotifier_is_system_configured()
        print("The response of MessageAirnotifierApi->message_airnotifier_is_system_configured:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MessageAirnotifierApi->message_airnotifier_is_system_configured: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

**object**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 0 if the system is not configured, 1 otherwise |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

