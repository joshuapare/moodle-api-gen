# Org.OpenAPITools.Api.MessageAirnotifierApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**MessageAirnotifierAreNotificationPreferencesConfigured**](MessageAirnotifierApi.md#messageairnotifierarenotificationpreferencesconfigured) | **POST** /message_airnotifier_are_notification_preferences_configured | Check if the users have notification preferences configured yet |
| [**MessageAirnotifierEnableDevice**](MessageAirnotifierApi.md#messageairnotifierenabledevice) | **POST** /message_airnotifier_enable_device | Enables or disables a registered user device so it can receive Push notifications |
| [**MessageAirnotifierGetUserDevices**](MessageAirnotifierApi.md#messageairnotifiergetuserdevices) | **POST** /message_airnotifier_get_user_devices | Return the list of mobile devices that are registered in Moodle for the given user |
| [**MessageAirnotifierIsSystemConfigured**](MessageAirnotifierApi.md#messageairnotifierissystemconfigured) | **POST** /message_airnotifier_is_system_configured | Check whether the airnotifier settings have been configured |

<a id="messageairnotifierarenotificationpreferencesconfigured"></a>
# **MessageAirnotifierAreNotificationPreferencesConfigured**
> MessageAirnotifierAreNotificationPreferencesConfigured200Response MessageAirnotifierAreNotificationPreferencesConfigured (MessageAirnotifierAreNotificationPreferencesConfiguredRequest messageAirnotifierAreNotificationPreferencesConfiguredRequest)

Check if the users have notification preferences configured yet

Check if the users have notification preferences configured yet

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class MessageAirnotifierAreNotificationPreferencesConfiguredExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new MessageAirnotifierApi(config);
            var messageAirnotifierAreNotificationPreferencesConfiguredRequest = new MessageAirnotifierAreNotificationPreferencesConfiguredRequest(); // MessageAirnotifierAreNotificationPreferencesConfiguredRequest | 

            try
            {
                // Check if the users have notification preferences configured yet
                MessageAirnotifierAreNotificationPreferencesConfigured200Response result = apiInstance.MessageAirnotifierAreNotificationPreferencesConfigured(messageAirnotifierAreNotificationPreferencesConfiguredRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling MessageAirnotifierApi.MessageAirnotifierAreNotificationPreferencesConfigured: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the MessageAirnotifierAreNotificationPreferencesConfiguredWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Check if the users have notification preferences configured yet
    ApiResponse<MessageAirnotifierAreNotificationPreferencesConfigured200Response> response = apiInstance.MessageAirnotifierAreNotificationPreferencesConfiguredWithHttpInfo(messageAirnotifierAreNotificationPreferencesConfiguredRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling MessageAirnotifierApi.MessageAirnotifierAreNotificationPreferencesConfiguredWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **messageAirnotifierAreNotificationPreferencesConfiguredRequest** | [**MessageAirnotifierAreNotificationPreferencesConfiguredRequest**](MessageAirnotifierAreNotificationPreferencesConfiguredRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="messageairnotifierenabledevice"></a>
# **MessageAirnotifierEnableDevice**
> MessageAirnotifierEnableDevice200Response MessageAirnotifierEnableDevice (MessageAirnotifierEnableDeviceRequest messageAirnotifierEnableDeviceRequest)

Enables or disables a registered user device so it can receive Push notifications

Enables or disables a registered user device so it can receive Push notifications

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class MessageAirnotifierEnableDeviceExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new MessageAirnotifierApi(config);
            var messageAirnotifierEnableDeviceRequest = new MessageAirnotifierEnableDeviceRequest(); // MessageAirnotifierEnableDeviceRequest | 

            try
            {
                // Enables or disables a registered user device so it can receive Push notifications
                MessageAirnotifierEnableDevice200Response result = apiInstance.MessageAirnotifierEnableDevice(messageAirnotifierEnableDeviceRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling MessageAirnotifierApi.MessageAirnotifierEnableDevice: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the MessageAirnotifierEnableDeviceWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Enables or disables a registered user device so it can receive Push notifications
    ApiResponse<MessageAirnotifierEnableDevice200Response> response = apiInstance.MessageAirnotifierEnableDeviceWithHttpInfo(messageAirnotifierEnableDeviceRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling MessageAirnotifierApi.MessageAirnotifierEnableDeviceWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **messageAirnotifierEnableDeviceRequest** | [**MessageAirnotifierEnableDeviceRequest**](MessageAirnotifierEnableDeviceRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="messageairnotifiergetuserdevices"></a>
# **MessageAirnotifierGetUserDevices**
> MessageAirnotifierGetUserDevices200Response MessageAirnotifierGetUserDevices (MessageAirnotifierGetUserDevicesRequest messageAirnotifierGetUserDevicesRequest)

Return the list of mobile devices that are registered in Moodle for the given user

Return the list of mobile devices that are registered in Moodle for the given user

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class MessageAirnotifierGetUserDevicesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new MessageAirnotifierApi(config);
            var messageAirnotifierGetUserDevicesRequest = new MessageAirnotifierGetUserDevicesRequest(); // MessageAirnotifierGetUserDevicesRequest | 

            try
            {
                // Return the list of mobile devices that are registered in Moodle for the given user
                MessageAirnotifierGetUserDevices200Response result = apiInstance.MessageAirnotifierGetUserDevices(messageAirnotifierGetUserDevicesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling MessageAirnotifierApi.MessageAirnotifierGetUserDevices: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the MessageAirnotifierGetUserDevicesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return the list of mobile devices that are registered in Moodle for the given user
    ApiResponse<MessageAirnotifierGetUserDevices200Response> response = apiInstance.MessageAirnotifierGetUserDevicesWithHttpInfo(messageAirnotifierGetUserDevicesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling MessageAirnotifierApi.MessageAirnotifierGetUserDevicesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **messageAirnotifierGetUserDevicesRequest** | [**MessageAirnotifierGetUserDevicesRequest**](MessageAirnotifierGetUserDevicesRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="messageairnotifierissystemconfigured"></a>
# **MessageAirnotifierIsSystemConfigured**
> Object MessageAirnotifierIsSystemConfigured ()

Check whether the airnotifier settings have been configured

Check whether the airnotifier settings have been configured

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class MessageAirnotifierIsSystemConfiguredExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new MessageAirnotifierApi(config);

            try
            {
                // Check whether the airnotifier settings have been configured
                Object result = apiInstance.MessageAirnotifierIsSystemConfigured();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling MessageAirnotifierApi.MessageAirnotifierIsSystemConfigured: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the MessageAirnotifierIsSystemConfiguredWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Check whether the airnotifier settings have been configured
    ApiResponse<Object> response = apiInstance.MessageAirnotifierIsSystemConfiguredWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling MessageAirnotifierApi.MessageAirnotifierIsSystemConfiguredWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 0 if the system is not configured, 1 otherwise |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

