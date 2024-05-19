# MessageAirnotifierApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**messageAirnotifierAreNotificationPreferencesConfigured**](MessageAirnotifierApi.md#messageAirnotifierAreNotificationPreferencesConfigured) | **POST** /message_airnotifier_are_notification_preferences_configured | Check if the users have notification preferences configured yet |
| [**messageAirnotifierEnableDevice**](MessageAirnotifierApi.md#messageAirnotifierEnableDevice) | **POST** /message_airnotifier_enable_device | Enables or disables a registered user device so it can receive Push notifications |
| [**messageAirnotifierGetUserDevices**](MessageAirnotifierApi.md#messageAirnotifierGetUserDevices) | **POST** /message_airnotifier_get_user_devices | Return the list of mobile devices that are registered in Moodle for the given user |
| [**messageAirnotifierIsSystemConfigured**](MessageAirnotifierApi.md#messageAirnotifierIsSystemConfigured) | **POST** /message_airnotifier_is_system_configured | Check whether the airnotifier settings have been configured |


<a id="messageAirnotifierAreNotificationPreferencesConfigured"></a>
# **messageAirnotifierAreNotificationPreferencesConfigured**
> MessageAirnotifierAreNotificationPreferencesConfigured200Response messageAirnotifierAreNotificationPreferencesConfigured(messageAirnotifierAreNotificationPreferencesConfiguredRequest)

Check if the users have notification preferences configured yet

Check if the users have notification preferences configured yet

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.MessageAirnotifierApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    MessageAirnotifierApi apiInstance = new MessageAirnotifierApi(defaultClient);
    MessageAirnotifierAreNotificationPreferencesConfiguredRequest messageAirnotifierAreNotificationPreferencesConfiguredRequest = new MessageAirnotifierAreNotificationPreferencesConfiguredRequest(); // MessageAirnotifierAreNotificationPreferencesConfiguredRequest | 
    try {
      MessageAirnotifierAreNotificationPreferencesConfigured200Response result = apiInstance.messageAirnotifierAreNotificationPreferencesConfigured(messageAirnotifierAreNotificationPreferencesConfiguredRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAirnotifierApi#messageAirnotifierAreNotificationPreferencesConfigured");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messageAirnotifierAreNotificationPreferencesConfiguredRequest** | [**MessageAirnotifierAreNotificationPreferencesConfiguredRequest**](MessageAirnotifierAreNotificationPreferencesConfiguredRequest.md)|  | |

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

<a id="messageAirnotifierEnableDevice"></a>
# **messageAirnotifierEnableDevice**
> MessageAirnotifierEnableDevice200Response messageAirnotifierEnableDevice(messageAirnotifierEnableDeviceRequest)

Enables or disables a registered user device so it can receive Push notifications

Enables or disables a registered user device so it can receive Push notifications

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.MessageAirnotifierApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    MessageAirnotifierApi apiInstance = new MessageAirnotifierApi(defaultClient);
    MessageAirnotifierEnableDeviceRequest messageAirnotifierEnableDeviceRequest = new MessageAirnotifierEnableDeviceRequest(); // MessageAirnotifierEnableDeviceRequest | 
    try {
      MessageAirnotifierEnableDevice200Response result = apiInstance.messageAirnotifierEnableDevice(messageAirnotifierEnableDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAirnotifierApi#messageAirnotifierEnableDevice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messageAirnotifierEnableDeviceRequest** | [**MessageAirnotifierEnableDeviceRequest**](MessageAirnotifierEnableDeviceRequest.md)|  | |

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

<a id="messageAirnotifierGetUserDevices"></a>
# **messageAirnotifierGetUserDevices**
> MessageAirnotifierGetUserDevices200Response messageAirnotifierGetUserDevices(messageAirnotifierGetUserDevicesRequest)

Return the list of mobile devices that are registered in Moodle for the given user

Return the list of mobile devices that are registered in Moodle for the given user

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.MessageAirnotifierApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    MessageAirnotifierApi apiInstance = new MessageAirnotifierApi(defaultClient);
    MessageAirnotifierGetUserDevicesRequest messageAirnotifierGetUserDevicesRequest = new MessageAirnotifierGetUserDevicesRequest(); // MessageAirnotifierGetUserDevicesRequest | 
    try {
      MessageAirnotifierGetUserDevices200Response result = apiInstance.messageAirnotifierGetUserDevices(messageAirnotifierGetUserDevicesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAirnotifierApi#messageAirnotifierGetUserDevices");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messageAirnotifierGetUserDevicesRequest** | [**MessageAirnotifierGetUserDevicesRequest**](MessageAirnotifierGetUserDevicesRequest.md)|  | |

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

<a id="messageAirnotifierIsSystemConfigured"></a>
# **messageAirnotifierIsSystemConfigured**
> Object messageAirnotifierIsSystemConfigured()

Check whether the airnotifier settings have been configured

Check whether the airnotifier settings have been configured

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.MessageAirnotifierApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    MessageAirnotifierApi apiInstance = new MessageAirnotifierApi(defaultClient);
    try {
      Object result = apiInstance.messageAirnotifierIsSystemConfigured();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAirnotifierApi#messageAirnotifierIsSystemConfigured");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

