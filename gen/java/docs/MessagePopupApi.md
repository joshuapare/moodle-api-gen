# MessagePopupApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**messagePopupGetPopupNotifications**](MessagePopupApi.md#messagePopupGetPopupNotifications) | **POST** /message_popup_get_popup_notifications | Retrieve a list of popup notifications for a user |
| [**messagePopupGetUnreadPopupNotificationCount**](MessagePopupApi.md#messagePopupGetUnreadPopupNotificationCount) | **POST** /message_popup_get_unread_popup_notification_count | Retrieve the count of unread popup notifications for a given user |


<a id="messagePopupGetPopupNotifications"></a>
# **messagePopupGetPopupNotifications**
> MessagePopupGetPopupNotifications200Response messagePopupGetPopupNotifications(messagePopupGetPopupNotificationsRequest)

Retrieve a list of popup notifications for a user

Retrieve a list of popup notifications for a user

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.MessagePopupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    MessagePopupApi apiInstance = new MessagePopupApi(defaultClient);
    MessagePopupGetPopupNotificationsRequest messagePopupGetPopupNotificationsRequest = new MessagePopupGetPopupNotificationsRequest(); // MessagePopupGetPopupNotificationsRequest | 
    try {
      MessagePopupGetPopupNotifications200Response result = apiInstance.messagePopupGetPopupNotifications(messagePopupGetPopupNotificationsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagePopupApi#messagePopupGetPopupNotifications");
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
| **messagePopupGetPopupNotificationsRequest** | [**MessagePopupGetPopupNotificationsRequest**](MessagePopupGetPopupNotificationsRequest.md)|  | |

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

<a id="messagePopupGetUnreadPopupNotificationCount"></a>
# **messagePopupGetUnreadPopupNotificationCount**
> Object messagePopupGetUnreadPopupNotificationCount(coreMessageGetUnreadConversationsCountRequest)

Retrieve the count of unread popup notifications for a given user

Retrieve the count of unread popup notifications for a given user

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.MessagePopupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    MessagePopupApi apiInstance = new MessagePopupApi(defaultClient);
    CoreMessageGetUnreadConversationsCountRequest coreMessageGetUnreadConversationsCountRequest = new CoreMessageGetUnreadConversationsCountRequest(); // CoreMessageGetUnreadConversationsCountRequest | 
    try {
      Object result = apiInstance.messagePopupGetUnreadPopupNotificationCount(coreMessageGetUnreadConversationsCountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagePopupApi#messagePopupGetUnreadPopupNotificationCount");
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
| **coreMessageGetUnreadConversationsCountRequest** | [**CoreMessageGetUnreadConversationsCountRequest**](CoreMessageGetUnreadConversationsCountRequest.md)|  | |

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

