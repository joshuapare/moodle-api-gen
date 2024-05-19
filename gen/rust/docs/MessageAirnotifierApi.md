# \MessageAirnotifierApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**message_airnotifier_are_notification_preferences_configured**](MessageAirnotifierApi.md#message_airnotifier_are_notification_preferences_configured) | **POST** /message_airnotifier_are_notification_preferences_configured | Check if the users have notification preferences configured yet
[**message_airnotifier_enable_device**](MessageAirnotifierApi.md#message_airnotifier_enable_device) | **POST** /message_airnotifier_enable_device | Enables or disables a registered user device so it can receive Push notifications
[**message_airnotifier_get_user_devices**](MessageAirnotifierApi.md#message_airnotifier_get_user_devices) | **POST** /message_airnotifier_get_user_devices | Return the list of mobile devices that are registered in Moodle for the given user
[**message_airnotifier_is_system_configured**](MessageAirnotifierApi.md#message_airnotifier_is_system_configured) | **POST** /message_airnotifier_is_system_configured | Check whether the airnotifier settings have been configured



## message_airnotifier_are_notification_preferences_configured

> models::MessageAirnotifierAreNotificationPreferencesConfigured200Response message_airnotifier_are_notification_preferences_configured(message_airnotifier_are_notification_preferences_configured_request)
Check if the users have notification preferences configured yet

Check if the users have notification preferences configured yet

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**message_airnotifier_are_notification_preferences_configured_request** | [**MessageAirnotifierAreNotificationPreferencesConfiguredRequest**](MessageAirnotifierAreNotificationPreferencesConfiguredRequest.md) |  | [required] |

### Return type

[**models::MessageAirnotifierAreNotificationPreferencesConfigured200Response**](message_airnotifier_are_notification_preferences_configured_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## message_airnotifier_enable_device

> models::MessageAirnotifierEnableDevice200Response message_airnotifier_enable_device(message_airnotifier_enable_device_request)
Enables or disables a registered user device so it can receive Push notifications

Enables or disables a registered user device so it can receive Push notifications

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**message_airnotifier_enable_device_request** | [**MessageAirnotifierEnableDeviceRequest**](MessageAirnotifierEnableDeviceRequest.md) |  | [required] |

### Return type

[**models::MessageAirnotifierEnableDevice200Response**](message_airnotifier_enable_device_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## message_airnotifier_get_user_devices

> models::MessageAirnotifierGetUserDevices200Response message_airnotifier_get_user_devices(message_airnotifier_get_user_devices_request)
Return the list of mobile devices that are registered in Moodle for the given user

Return the list of mobile devices that are registered in Moodle for the given user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**message_airnotifier_get_user_devices_request** | [**MessageAirnotifierGetUserDevicesRequest**](MessageAirnotifierGetUserDevicesRequest.md) |  | [required] |

### Return type

[**models::MessageAirnotifierGetUserDevices200Response**](message_airnotifier_get_user_devices_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## message_airnotifier_is_system_configured

> serde_json::Value message_airnotifier_is_system_configured()
Check whether the airnotifier settings have been configured

Check whether the airnotifier settings have been configured

### Parameters

This endpoint does not need any parameter.

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

