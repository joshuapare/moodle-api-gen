# Org.OpenAPITools.Api.MessagePopupApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**MessagePopupGetPopupNotifications**](MessagePopupApi.md#messagepopupgetpopupnotifications) | **POST** /message_popup_get_popup_notifications | Retrieve a list of popup notifications for a user |
| [**MessagePopupGetUnreadPopupNotificationCount**](MessagePopupApi.md#messagepopupgetunreadpopupnotificationcount) | **POST** /message_popup_get_unread_popup_notification_count | Retrieve the count of unread popup notifications for a given user |

<a id="messagepopupgetpopupnotifications"></a>
# **MessagePopupGetPopupNotifications**
> MessagePopupGetPopupNotifications200Response MessagePopupGetPopupNotifications (MessagePopupGetPopupNotificationsRequest messagePopupGetPopupNotificationsRequest)

Retrieve a list of popup notifications for a user

Retrieve a list of popup notifications for a user

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class MessagePopupGetPopupNotificationsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new MessagePopupApi(config);
            var messagePopupGetPopupNotificationsRequest = new MessagePopupGetPopupNotificationsRequest(); // MessagePopupGetPopupNotificationsRequest | 

            try
            {
                // Retrieve a list of popup notifications for a user
                MessagePopupGetPopupNotifications200Response result = apiInstance.MessagePopupGetPopupNotifications(messagePopupGetPopupNotificationsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling MessagePopupApi.MessagePopupGetPopupNotifications: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the MessagePopupGetPopupNotificationsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieve a list of popup notifications for a user
    ApiResponse<MessagePopupGetPopupNotifications200Response> response = apiInstance.MessagePopupGetPopupNotificationsWithHttpInfo(messagePopupGetPopupNotificationsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling MessagePopupApi.MessagePopupGetPopupNotificationsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **messagePopupGetPopupNotificationsRequest** | [**MessagePopupGetPopupNotificationsRequest**](MessagePopupGetPopupNotificationsRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="messagepopupgetunreadpopupnotificationcount"></a>
# **MessagePopupGetUnreadPopupNotificationCount**
> Object MessagePopupGetUnreadPopupNotificationCount (CoreMessageGetUnreadConversationsCountRequest coreMessageGetUnreadConversationsCountRequest)

Retrieve the count of unread popup notifications for a given user

Retrieve the count of unread popup notifications for a given user

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class MessagePopupGetUnreadPopupNotificationCountExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new MessagePopupApi(config);
            var coreMessageGetUnreadConversationsCountRequest = new CoreMessageGetUnreadConversationsCountRequest(); // CoreMessageGetUnreadConversationsCountRequest | 

            try
            {
                // Retrieve the count of unread popup notifications for a given user
                Object result = apiInstance.MessagePopupGetUnreadPopupNotificationCount(coreMessageGetUnreadConversationsCountRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling MessagePopupApi.MessagePopupGetUnreadPopupNotificationCount: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the MessagePopupGetUnreadPopupNotificationCountWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieve the count of unread popup notifications for a given user
    ApiResponse<Object> response = apiInstance.MessagePopupGetUnreadPopupNotificationCountWithHttpInfo(coreMessageGetUnreadConversationsCountRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling MessagePopupApi.MessagePopupGetUnreadPopupNotificationCountWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **coreMessageGetUnreadConversationsCountRequest** | [**CoreMessageGetUnreadConversationsCountRequest**](CoreMessageGetUnreadConversationsCountRequest.md) |  |  |

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The count of unread popup notifications |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

