# ModChatApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modChatGetChatLatestMessages**](ModChatApi.md#modChatGetChatLatestMessages) | **POST** /mod_chat_get_chat_latest_messages | Get the latest messages from the given chat session. |
| [**modChatGetChatUsers**](ModChatApi.md#modChatGetChatUsers) | **POST** /mod_chat_get_chat_users | Get the list of users in the given chat session. |
| [**modChatGetChatsByCourses**](ModChatApi.md#modChatGetChatsByCourses) | **POST** /mod_chat_get_chats_by_courses | Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned. |
| [**modChatGetSessionMessages**](ModChatApi.md#modChatGetSessionMessages) | **POST** /mod_chat_get_session_messages | Retrieves messages of the given chat session. |
| [**modChatGetSessions**](ModChatApi.md#modChatGetSessions) | **POST** /mod_chat_get_sessions | Retrieves chat sessions for a given chat. |
| [**modChatLoginUser**](ModChatApi.md#modChatLoginUser) | **POST** /mod_chat_login_user | Log a user into a chat room in the given chat. |
| [**modChatSendChatMessage**](ModChatApi.md#modChatSendChatMessage) | **POST** /mod_chat_send_chat_message | Send a message on the given chat session. |
| [**modChatViewChat**](ModChatApi.md#modChatViewChat) | **POST** /mod_chat_view_chat | Trigger the course module viewed event and update the module completion status. |
| [**modChatViewSessions**](ModChatApi.md#modChatViewSessions) | **POST** /mod_chat_view_sessions | Trigger the chat session viewed event. |


<a id="modChatGetChatLatestMessages"></a>
# **modChatGetChatLatestMessages**
> ModChatGetChatLatestMessages200Response modChatGetChatLatestMessages(modChatGetChatLatestMessagesRequest)

Get the latest messages from the given chat session.

Get the latest messages from the given chat session.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModChatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModChatApi apiInstance = new ModChatApi(defaultClient);
    ModChatGetChatLatestMessagesRequest modChatGetChatLatestMessagesRequest = new ModChatGetChatLatestMessagesRequest(); // ModChatGetChatLatestMessagesRequest | 
    try {
      ModChatGetChatLatestMessages200Response result = apiInstance.modChatGetChatLatestMessages(modChatGetChatLatestMessagesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModChatApi#modChatGetChatLatestMessages");
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
| **modChatGetChatLatestMessagesRequest** | [**ModChatGetChatLatestMessagesRequest**](ModChatGetChatLatestMessagesRequest.md)|  | |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modChatGetChatUsers"></a>
# **modChatGetChatUsers**
> ModChatGetChatUsers200Response modChatGetChatUsers(modChatGetChatUsersRequest)

Get the list of users in the given chat session.

Get the list of users in the given chat session.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModChatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModChatApi apiInstance = new ModChatApi(defaultClient);
    ModChatGetChatUsersRequest modChatGetChatUsersRequest = new ModChatGetChatUsersRequest(); // ModChatGetChatUsersRequest | 
    try {
      ModChatGetChatUsers200Response result = apiInstance.modChatGetChatUsers(modChatGetChatUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModChatApi#modChatGetChatUsers");
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
| **modChatGetChatUsersRequest** | [**ModChatGetChatUsersRequest**](ModChatGetChatUsersRequest.md)|  | |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modChatGetChatsByCourses"></a>
# **modChatGetChatsByCourses**
> ModChatGetChatsByCourses200Response modChatGetChatsByCourses(modChatGetChatsByCoursesRequest)

Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.

Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModChatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModChatApi apiInstance = new ModChatApi(defaultClient);
    ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 
    try {
      ModChatGetChatsByCourses200Response result = apiInstance.modChatGetChatsByCourses(modChatGetChatsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModChatApi#modChatGetChatsByCourses");
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
| **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md)|  | |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modChatGetSessionMessages"></a>
# **modChatGetSessionMessages**
> ModChatGetSessionMessages200Response modChatGetSessionMessages(modChatGetSessionMessagesRequest)

Retrieves messages of the given chat session.

Retrieves messages of the given chat session.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModChatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModChatApi apiInstance = new ModChatApi(defaultClient);
    ModChatGetSessionMessagesRequest modChatGetSessionMessagesRequest = new ModChatGetSessionMessagesRequest(); // ModChatGetSessionMessagesRequest | 
    try {
      ModChatGetSessionMessages200Response result = apiInstance.modChatGetSessionMessages(modChatGetSessionMessagesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModChatApi#modChatGetSessionMessages");
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
| **modChatGetSessionMessagesRequest** | [**ModChatGetSessionMessagesRequest**](ModChatGetSessionMessagesRequest.md)|  | |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modChatGetSessions"></a>
# **modChatGetSessions**
> ModChatGetSessions200Response modChatGetSessions(modChatGetSessionsRequest)

Retrieves chat sessions for a given chat.

Retrieves chat sessions for a given chat.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModChatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModChatApi apiInstance = new ModChatApi(defaultClient);
    ModChatGetSessionsRequest modChatGetSessionsRequest = new ModChatGetSessionsRequest(); // ModChatGetSessionsRequest | 
    try {
      ModChatGetSessions200Response result = apiInstance.modChatGetSessions(modChatGetSessionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModChatApi#modChatGetSessions");
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
| **modChatGetSessionsRequest** | [**ModChatGetSessionsRequest**](ModChatGetSessionsRequest.md)|  | |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modChatLoginUser"></a>
# **modChatLoginUser**
> ModChatLoginUser200Response modChatLoginUser(modChatLoginUserRequest)

Log a user into a chat room in the given chat.

Log a user into a chat room in the given chat.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModChatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModChatApi apiInstance = new ModChatApi(defaultClient);
    ModChatLoginUserRequest modChatLoginUserRequest = new ModChatLoginUserRequest(); // ModChatLoginUserRequest | 
    try {
      ModChatLoginUser200Response result = apiInstance.modChatLoginUser(modChatLoginUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModChatApi#modChatLoginUser");
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
| **modChatLoginUserRequest** | [**ModChatLoginUserRequest**](ModChatLoginUserRequest.md)|  | |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modChatSendChatMessage"></a>
# **modChatSendChatMessage**
> ModChatSendChatMessage200Response modChatSendChatMessage(modChatSendChatMessageRequest)

Send a message on the given chat session.

Send a message on the given chat session.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModChatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModChatApi apiInstance = new ModChatApi(defaultClient);
    ModChatSendChatMessageRequest modChatSendChatMessageRequest = new ModChatSendChatMessageRequest(); // ModChatSendChatMessageRequest | 
    try {
      ModChatSendChatMessage200Response result = apiInstance.modChatSendChatMessage(modChatSendChatMessageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModChatApi#modChatSendChatMessage");
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
| **modChatSendChatMessageRequest** | [**ModChatSendChatMessageRequest**](ModChatSendChatMessageRequest.md)|  | |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modChatViewChat"></a>
# **modChatViewChat**
> CoreCalendarDeleteSubscription200Response modChatViewChat(modChatViewChatRequest)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModChatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModChatApi apiInstance = new ModChatApi(defaultClient);
    ModChatViewChatRequest modChatViewChatRequest = new ModChatViewChatRequest(); // ModChatViewChatRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modChatViewChat(modChatViewChatRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModChatApi#modChatViewChat");
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
| **modChatViewChatRequest** | [**ModChatViewChatRequest**](ModChatViewChatRequest.md)|  | |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modChatViewSessions"></a>
# **modChatViewSessions**
> CoreCalendarDeleteSubscription200Response modChatViewSessions(modChatViewSessionsRequest)

Trigger the chat session viewed event.

Trigger the chat session viewed event.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModChatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModChatApi apiInstance = new ModChatApi(defaultClient);
    ModChatViewSessionsRequest modChatViewSessionsRequest = new ModChatViewSessionsRequest(); // ModChatViewSessionsRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modChatViewSessions(modChatViewSessionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModChatApi#modChatViewSessions");
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
| **modChatViewSessionsRequest** | [**ModChatViewSessionsRequest**](ModChatViewSessionsRequest.md)|  | |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

