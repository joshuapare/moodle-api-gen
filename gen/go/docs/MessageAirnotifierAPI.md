# \MessageAirnotifierAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MessageAirnotifierAreNotificationPreferencesConfigured**](MessageAirnotifierAPI.md#MessageAirnotifierAreNotificationPreferencesConfigured) | **Post** /message_airnotifier_are_notification_preferences_configured | Check if the users have notification preferences configured yet
[**MessageAirnotifierEnableDevice**](MessageAirnotifierAPI.md#MessageAirnotifierEnableDevice) | **Post** /message_airnotifier_enable_device | Enables or disables a registered user device so it can receive Push notifications
[**MessageAirnotifierGetUserDevices**](MessageAirnotifierAPI.md#MessageAirnotifierGetUserDevices) | **Post** /message_airnotifier_get_user_devices | Return the list of mobile devices that are registered in Moodle for the given user
[**MessageAirnotifierIsSystemConfigured**](MessageAirnotifierAPI.md#MessageAirnotifierIsSystemConfigured) | **Post** /message_airnotifier_is_system_configured | Check whether the airnotifier settings have been configured



## MessageAirnotifierAreNotificationPreferencesConfigured

> MessageAirnotifierAreNotificationPreferencesConfigured200Response MessageAirnotifierAreNotificationPreferencesConfigured(ctx).MessageAirnotifierAreNotificationPreferencesConfiguredRequest(messageAirnotifierAreNotificationPreferencesConfiguredRequest).Execute()

Check if the users have notification preferences configured yet



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	messageAirnotifierAreNotificationPreferencesConfiguredRequest := *openapiclient.NewMessageAirnotifierAreNotificationPreferencesConfiguredRequest([]map[string]interface{}{map[string]interface{}(123)}) // MessageAirnotifierAreNotificationPreferencesConfiguredRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MessageAirnotifierAPI.MessageAirnotifierAreNotificationPreferencesConfigured(context.Background()).MessageAirnotifierAreNotificationPreferencesConfiguredRequest(messageAirnotifierAreNotificationPreferencesConfiguredRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MessageAirnotifierAPI.MessageAirnotifierAreNotificationPreferencesConfigured``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MessageAirnotifierAreNotificationPreferencesConfigured`: MessageAirnotifierAreNotificationPreferencesConfigured200Response
	fmt.Fprintf(os.Stdout, "Response from `MessageAirnotifierAPI.MessageAirnotifierAreNotificationPreferencesConfigured`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMessageAirnotifierAreNotificationPreferencesConfiguredRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageAirnotifierAreNotificationPreferencesConfiguredRequest** | [**MessageAirnotifierAreNotificationPreferencesConfiguredRequest**](MessageAirnotifierAreNotificationPreferencesConfiguredRequest.md) |  | 

### Return type

[**MessageAirnotifierAreNotificationPreferencesConfigured200Response**](MessageAirnotifierAreNotificationPreferencesConfigured200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MessageAirnotifierEnableDevice

> MessageAirnotifierEnableDevice200Response MessageAirnotifierEnableDevice(ctx).MessageAirnotifierEnableDeviceRequest(messageAirnotifierEnableDeviceRequest).Execute()

Enables or disables a registered user device so it can receive Push notifications



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	messageAirnotifierEnableDeviceRequest := *openapiclient.NewMessageAirnotifierEnableDeviceRequest(int32(123), false) // MessageAirnotifierEnableDeviceRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MessageAirnotifierAPI.MessageAirnotifierEnableDevice(context.Background()).MessageAirnotifierEnableDeviceRequest(messageAirnotifierEnableDeviceRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MessageAirnotifierAPI.MessageAirnotifierEnableDevice``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MessageAirnotifierEnableDevice`: MessageAirnotifierEnableDevice200Response
	fmt.Fprintf(os.Stdout, "Response from `MessageAirnotifierAPI.MessageAirnotifierEnableDevice`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMessageAirnotifierEnableDeviceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageAirnotifierEnableDeviceRequest** | [**MessageAirnotifierEnableDeviceRequest**](MessageAirnotifierEnableDeviceRequest.md) |  | 

### Return type

[**MessageAirnotifierEnableDevice200Response**](MessageAirnotifierEnableDevice200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MessageAirnotifierGetUserDevices

> MessageAirnotifierGetUserDevices200Response MessageAirnotifierGetUserDevices(ctx).MessageAirnotifierGetUserDevicesRequest(messageAirnotifierGetUserDevicesRequest).Execute()

Return the list of mobile devices that are registered in Moodle for the given user



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	messageAirnotifierGetUserDevicesRequest := *openapiclient.NewMessageAirnotifierGetUserDevicesRequest("Appid_example") // MessageAirnotifierGetUserDevicesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MessageAirnotifierAPI.MessageAirnotifierGetUserDevices(context.Background()).MessageAirnotifierGetUserDevicesRequest(messageAirnotifierGetUserDevicesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MessageAirnotifierAPI.MessageAirnotifierGetUserDevices``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MessageAirnotifierGetUserDevices`: MessageAirnotifierGetUserDevices200Response
	fmt.Fprintf(os.Stdout, "Response from `MessageAirnotifierAPI.MessageAirnotifierGetUserDevices`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMessageAirnotifierGetUserDevicesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageAirnotifierGetUserDevicesRequest** | [**MessageAirnotifierGetUserDevicesRequest**](MessageAirnotifierGetUserDevicesRequest.md) |  | 

### Return type

[**MessageAirnotifierGetUserDevices200Response**](MessageAirnotifierGetUserDevices200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MessageAirnotifierIsSystemConfigured

> map[string]interface{} MessageAirnotifierIsSystemConfigured(ctx).Execute()

Check whether the airnotifier settings have been configured



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MessageAirnotifierAPI.MessageAirnotifierIsSystemConfigured(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MessageAirnotifierAPI.MessageAirnotifierIsSystemConfigured``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MessageAirnotifierIsSystemConfigured`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MessageAirnotifierAPI.MessageAirnotifierIsSystemConfigured`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiMessageAirnotifierIsSystemConfiguredRequest struct via the builder pattern


### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

