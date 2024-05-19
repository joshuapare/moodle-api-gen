# Org.OpenAPITools.Api.ModChatApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModChatGetChatLatestMessages**](ModChatApi.md#modchatgetchatlatestmessages) | **POST** /mod_chat_get_chat_latest_messages | Get the latest messages from the given chat session. |
| [**ModChatGetChatUsers**](ModChatApi.md#modchatgetchatusers) | **POST** /mod_chat_get_chat_users | Get the list of users in the given chat session. |
| [**ModChatGetChatsByCourses**](ModChatApi.md#modchatgetchatsbycourses) | **POST** /mod_chat_get_chats_by_courses | Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned. |
| [**ModChatGetSessionMessages**](ModChatApi.md#modchatgetsessionmessages) | **POST** /mod_chat_get_session_messages | Retrieves messages of the given chat session. |
| [**ModChatGetSessions**](ModChatApi.md#modchatgetsessions) | **POST** /mod_chat_get_sessions | Retrieves chat sessions for a given chat. |
| [**ModChatLoginUser**](ModChatApi.md#modchatloginuser) | **POST** /mod_chat_login_user | Log a user into a chat room in the given chat. |
| [**ModChatSendChatMessage**](ModChatApi.md#modchatsendchatmessage) | **POST** /mod_chat_send_chat_message | Send a message on the given chat session. |
| [**ModChatViewChat**](ModChatApi.md#modchatviewchat) | **POST** /mod_chat_view_chat | Trigger the course module viewed event and update the module completion status. |
| [**ModChatViewSessions**](ModChatApi.md#modchatviewsessions) | **POST** /mod_chat_view_sessions | Trigger the chat session viewed event. |

<a id="modchatgetchatlatestmessages"></a>
# **ModChatGetChatLatestMessages**
> ModChatGetChatLatestMessages200Response ModChatGetChatLatestMessages (ModChatGetChatLatestMessagesRequest modChatGetChatLatestMessagesRequest)

Get the latest messages from the given chat session.

Get the latest messages from the given chat session.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModChatGetChatLatestMessagesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModChatApi(config);
            var modChatGetChatLatestMessagesRequest = new ModChatGetChatLatestMessagesRequest(); // ModChatGetChatLatestMessagesRequest | 

            try
            {
                // Get the latest messages from the given chat session.
                ModChatGetChatLatestMessages200Response result = apiInstance.ModChatGetChatLatestMessages(modChatGetChatLatestMessagesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModChatApi.ModChatGetChatLatestMessages: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModChatGetChatLatestMessagesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get the latest messages from the given chat session.
    ApiResponse<ModChatGetChatLatestMessages200Response> response = apiInstance.ModChatGetChatLatestMessagesWithHttpInfo(modChatGetChatLatestMessagesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModChatApi.ModChatGetChatLatestMessagesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatGetChatLatestMessagesRequest** | [**ModChatGetChatLatestMessagesRequest**](ModChatGetChatLatestMessagesRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modchatgetchatusers"></a>
# **ModChatGetChatUsers**
> ModChatGetChatUsers200Response ModChatGetChatUsers (ModChatGetChatUsersRequest modChatGetChatUsersRequest)

Get the list of users in the given chat session.

Get the list of users in the given chat session.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModChatGetChatUsersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModChatApi(config);
            var modChatGetChatUsersRequest = new ModChatGetChatUsersRequest(); // ModChatGetChatUsersRequest | 

            try
            {
                // Get the list of users in the given chat session.
                ModChatGetChatUsers200Response result = apiInstance.ModChatGetChatUsers(modChatGetChatUsersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModChatApi.ModChatGetChatUsers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModChatGetChatUsersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get the list of users in the given chat session.
    ApiResponse<ModChatGetChatUsers200Response> response = apiInstance.ModChatGetChatUsersWithHttpInfo(modChatGetChatUsersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModChatApi.ModChatGetChatUsersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatGetChatUsersRequest** | [**ModChatGetChatUsersRequest**](ModChatGetChatUsersRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modchatgetchatsbycourses"></a>
# **ModChatGetChatsByCourses**
> ModChatGetChatsByCourses200Response ModChatGetChatsByCourses (ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest)

Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.

Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModChatGetChatsByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModChatApi(config);
            var modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 

            try
            {
                // Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.
                ModChatGetChatsByCourses200Response result = apiInstance.ModChatGetChatsByCourses(modChatGetChatsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModChatApi.ModChatGetChatsByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModChatGetChatsByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.
    ApiResponse<ModChatGetChatsByCourses200Response> response = apiInstance.ModChatGetChatsByCoursesWithHttpInfo(modChatGetChatsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModChatApi.ModChatGetChatsByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modchatgetsessionmessages"></a>
# **ModChatGetSessionMessages**
> ModChatGetSessionMessages200Response ModChatGetSessionMessages (ModChatGetSessionMessagesRequest modChatGetSessionMessagesRequest)

Retrieves messages of the given chat session.

Retrieves messages of the given chat session.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModChatGetSessionMessagesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModChatApi(config);
            var modChatGetSessionMessagesRequest = new ModChatGetSessionMessagesRequest(); // ModChatGetSessionMessagesRequest | 

            try
            {
                // Retrieves messages of the given chat session.
                ModChatGetSessionMessages200Response result = apiInstance.ModChatGetSessionMessages(modChatGetSessionMessagesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModChatApi.ModChatGetSessionMessages: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModChatGetSessionMessagesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieves messages of the given chat session.
    ApiResponse<ModChatGetSessionMessages200Response> response = apiInstance.ModChatGetSessionMessagesWithHttpInfo(modChatGetSessionMessagesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModChatApi.ModChatGetSessionMessagesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatGetSessionMessagesRequest** | [**ModChatGetSessionMessagesRequest**](ModChatGetSessionMessagesRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modchatgetsessions"></a>
# **ModChatGetSessions**
> ModChatGetSessions200Response ModChatGetSessions (ModChatGetSessionsRequest modChatGetSessionsRequest)

Retrieves chat sessions for a given chat.

Retrieves chat sessions for a given chat.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModChatGetSessionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModChatApi(config);
            var modChatGetSessionsRequest = new ModChatGetSessionsRequest(); // ModChatGetSessionsRequest | 

            try
            {
                // Retrieves chat sessions for a given chat.
                ModChatGetSessions200Response result = apiInstance.ModChatGetSessions(modChatGetSessionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModChatApi.ModChatGetSessions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModChatGetSessionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieves chat sessions for a given chat.
    ApiResponse<ModChatGetSessions200Response> response = apiInstance.ModChatGetSessionsWithHttpInfo(modChatGetSessionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModChatApi.ModChatGetSessionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatGetSessionsRequest** | [**ModChatGetSessionsRequest**](ModChatGetSessionsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modchatloginuser"></a>
# **ModChatLoginUser**
> ModChatLoginUser200Response ModChatLoginUser (ModChatLoginUserRequest modChatLoginUserRequest)

Log a user into a chat room in the given chat.

Log a user into a chat room in the given chat.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModChatLoginUserExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModChatApi(config);
            var modChatLoginUserRequest = new ModChatLoginUserRequest(); // ModChatLoginUserRequest | 

            try
            {
                // Log a user into a chat room in the given chat.
                ModChatLoginUser200Response result = apiInstance.ModChatLoginUser(modChatLoginUserRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModChatApi.ModChatLoginUser: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModChatLoginUserWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Log a user into a chat room in the given chat.
    ApiResponse<ModChatLoginUser200Response> response = apiInstance.ModChatLoginUserWithHttpInfo(modChatLoginUserRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModChatApi.ModChatLoginUserWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatLoginUserRequest** | [**ModChatLoginUserRequest**](ModChatLoginUserRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modchatsendchatmessage"></a>
# **ModChatSendChatMessage**
> ModChatSendChatMessage200Response ModChatSendChatMessage (ModChatSendChatMessageRequest modChatSendChatMessageRequest)

Send a message on the given chat session.

Send a message on the given chat session.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModChatSendChatMessageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModChatApi(config);
            var modChatSendChatMessageRequest = new ModChatSendChatMessageRequest(); // ModChatSendChatMessageRequest | 

            try
            {
                // Send a message on the given chat session.
                ModChatSendChatMessage200Response result = apiInstance.ModChatSendChatMessage(modChatSendChatMessageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModChatApi.ModChatSendChatMessage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModChatSendChatMessageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Send a message on the given chat session.
    ApiResponse<ModChatSendChatMessage200Response> response = apiInstance.ModChatSendChatMessageWithHttpInfo(modChatSendChatMessageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModChatApi.ModChatSendChatMessageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatSendChatMessageRequest** | [**ModChatSendChatMessageRequest**](ModChatSendChatMessageRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modchatviewchat"></a>
# **ModChatViewChat**
> CoreCalendarDeleteSubscription200Response ModChatViewChat (ModChatViewChatRequest modChatViewChatRequest)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModChatViewChatExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModChatApi(config);
            var modChatViewChatRequest = new ModChatViewChatRequest(); // ModChatViewChatRequest | 

            try
            {
                // Trigger the course module viewed event and update the module completion status.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModChatViewChat(modChatViewChatRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModChatApi.ModChatViewChat: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModChatViewChatWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the course module viewed event and update the module completion status.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModChatViewChatWithHttpInfo(modChatViewChatRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModChatApi.ModChatViewChatWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatViewChatRequest** | [**ModChatViewChatRequest**](ModChatViewChatRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modchatviewsessions"></a>
# **ModChatViewSessions**
> CoreCalendarDeleteSubscription200Response ModChatViewSessions (ModChatViewSessionsRequest modChatViewSessionsRequest)

Trigger the chat session viewed event.

Trigger the chat session viewed event.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModChatViewSessionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModChatApi(config);
            var modChatViewSessionsRequest = new ModChatViewSessionsRequest(); // ModChatViewSessionsRequest | 

            try
            {
                // Trigger the chat session viewed event.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModChatViewSessions(modChatViewSessionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModChatApi.ModChatViewSessions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModChatViewSessionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the chat session viewed event.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModChatViewSessionsWithHttpInfo(modChatViewSessionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModChatApi.ModChatViewSessionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatViewSessionsRequest** | [**ModChatViewSessionsRequest**](ModChatViewSessionsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

