# MoodleClient.Api.ModChoiceApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModChoiceDeleteChoiceResponses**](ModChoiceApi.md#modchoicedeletechoiceresponses) | **POST** /mod_choice_delete_choice_responses | Delete the given submitted responses in a choice |
| [**ModChoiceGetChoiceOptions**](ModChoiceApi.md#modchoicegetchoiceoptions) | **POST** /mod_choice_get_choice_options | Retrieve options for a specific choice. |
| [**ModChoiceGetChoiceResults**](ModChoiceApi.md#modchoicegetchoiceresults) | **POST** /mod_choice_get_choice_results | Retrieve users results for a given choice. |
| [**ModChoiceGetChoicesByCourses**](ModChoiceApi.md#modchoicegetchoicesbycourses) | **POST** /mod_choice_get_choices_by_courses | Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned. |
| [**ModChoiceSubmitChoiceResponse**](ModChoiceApi.md#modchoicesubmitchoiceresponse) | **POST** /mod_choice_submit_choice_response | Submit responses to a specific choice item. |
| [**ModChoiceViewChoice**](ModChoiceApi.md#modchoiceviewchoice) | **POST** /mod_choice_view_choice | Trigger the course module viewed event and update the module completion status. |

<a id="modchoicedeletechoiceresponses"></a>
# **ModChoiceDeleteChoiceResponses**
> ModChoiceDeleteChoiceResponses200Response ModChoiceDeleteChoiceResponses (ModChoiceDeleteChoiceResponsesRequest modChoiceDeleteChoiceResponsesRequest)

Delete the given submitted responses in a choice

Delete the given submitted responses in a choice

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModChoiceDeleteChoiceResponsesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModChoiceApi(config);
            var modChoiceDeleteChoiceResponsesRequest = new ModChoiceDeleteChoiceResponsesRequest(); // ModChoiceDeleteChoiceResponsesRequest | 

            try
            {
                // Delete the given submitted responses in a choice
                ModChoiceDeleteChoiceResponses200Response result = apiInstance.ModChoiceDeleteChoiceResponses(modChoiceDeleteChoiceResponsesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModChoiceApi.ModChoiceDeleteChoiceResponses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModChoiceDeleteChoiceResponsesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete the given submitted responses in a choice
    ApiResponse<ModChoiceDeleteChoiceResponses200Response> response = apiInstance.ModChoiceDeleteChoiceResponsesWithHttpInfo(modChoiceDeleteChoiceResponsesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModChoiceApi.ModChoiceDeleteChoiceResponsesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChoiceDeleteChoiceResponsesRequest** | [**ModChoiceDeleteChoiceResponsesRequest**](ModChoiceDeleteChoiceResponsesRequest.md) |  |  |

### Return type

[**ModChoiceDeleteChoiceResponses200Response**](ModChoiceDeleteChoiceResponses200Response.md)

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

<a id="modchoicegetchoiceoptions"></a>
# **ModChoiceGetChoiceOptions**
> ModChoiceGetChoiceOptions200Response ModChoiceGetChoiceOptions (ModChoiceGetChoiceOptionsRequest modChoiceGetChoiceOptionsRequest)

Retrieve options for a specific choice.

Retrieve options for a specific choice.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModChoiceGetChoiceOptionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModChoiceApi(config);
            var modChoiceGetChoiceOptionsRequest = new ModChoiceGetChoiceOptionsRequest(); // ModChoiceGetChoiceOptionsRequest | 

            try
            {
                // Retrieve options for a specific choice.
                ModChoiceGetChoiceOptions200Response result = apiInstance.ModChoiceGetChoiceOptions(modChoiceGetChoiceOptionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModChoiceApi.ModChoiceGetChoiceOptions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModChoiceGetChoiceOptionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieve options for a specific choice.
    ApiResponse<ModChoiceGetChoiceOptions200Response> response = apiInstance.ModChoiceGetChoiceOptionsWithHttpInfo(modChoiceGetChoiceOptionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModChoiceApi.ModChoiceGetChoiceOptionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChoiceGetChoiceOptionsRequest** | [**ModChoiceGetChoiceOptionsRequest**](ModChoiceGetChoiceOptionsRequest.md) |  |  |

### Return type

[**ModChoiceGetChoiceOptions200Response**](ModChoiceGetChoiceOptions200Response.md)

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

<a id="modchoicegetchoiceresults"></a>
# **ModChoiceGetChoiceResults**
> ModChoiceGetChoiceResults200Response ModChoiceGetChoiceResults (ModChoiceGetChoiceOptionsRequest modChoiceGetChoiceOptionsRequest)

Retrieve users results for a given choice.

Retrieve users results for a given choice.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModChoiceGetChoiceResultsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModChoiceApi(config);
            var modChoiceGetChoiceOptionsRequest = new ModChoiceGetChoiceOptionsRequest(); // ModChoiceGetChoiceOptionsRequest | 

            try
            {
                // Retrieve users results for a given choice.
                ModChoiceGetChoiceResults200Response result = apiInstance.ModChoiceGetChoiceResults(modChoiceGetChoiceOptionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModChoiceApi.ModChoiceGetChoiceResults: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModChoiceGetChoiceResultsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieve users results for a given choice.
    ApiResponse<ModChoiceGetChoiceResults200Response> response = apiInstance.ModChoiceGetChoiceResultsWithHttpInfo(modChoiceGetChoiceOptionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModChoiceApi.ModChoiceGetChoiceResultsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChoiceGetChoiceOptionsRequest** | [**ModChoiceGetChoiceOptionsRequest**](ModChoiceGetChoiceOptionsRequest.md) |  |  |

### Return type

[**ModChoiceGetChoiceResults200Response**](ModChoiceGetChoiceResults200Response.md)

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

<a id="modchoicegetchoicesbycourses"></a>
# **ModChoiceGetChoicesByCourses**
> ModChoiceGetChoicesByCourses200Response ModChoiceGetChoicesByCourses (ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest)

Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.

Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModChoiceGetChoicesByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModChoiceApi(config);
            var modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 

            try
            {
                // Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.
                ModChoiceGetChoicesByCourses200Response result = apiInstance.ModChoiceGetChoicesByCourses(modChatGetChatsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModChoiceApi.ModChoiceGetChoicesByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModChoiceGetChoicesByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.
    ApiResponse<ModChoiceGetChoicesByCourses200Response> response = apiInstance.ModChoiceGetChoicesByCoursesWithHttpInfo(modChatGetChatsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModChoiceApi.ModChoiceGetChoicesByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  |  |

### Return type

[**ModChoiceGetChoicesByCourses200Response**](ModChoiceGetChoicesByCourses200Response.md)

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

<a id="modchoicesubmitchoiceresponse"></a>
# **ModChoiceSubmitChoiceResponse**
> ModChoiceSubmitChoiceResponse200Response ModChoiceSubmitChoiceResponse (ModChoiceSubmitChoiceResponseRequest modChoiceSubmitChoiceResponseRequest)

Submit responses to a specific choice item.

Submit responses to a specific choice item.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModChoiceSubmitChoiceResponseExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModChoiceApi(config);
            var modChoiceSubmitChoiceResponseRequest = new ModChoiceSubmitChoiceResponseRequest(); // ModChoiceSubmitChoiceResponseRequest | 

            try
            {
                // Submit responses to a specific choice item.
                ModChoiceSubmitChoiceResponse200Response result = apiInstance.ModChoiceSubmitChoiceResponse(modChoiceSubmitChoiceResponseRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModChoiceApi.ModChoiceSubmitChoiceResponse: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModChoiceSubmitChoiceResponseWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Submit responses to a specific choice item.
    ApiResponse<ModChoiceSubmitChoiceResponse200Response> response = apiInstance.ModChoiceSubmitChoiceResponseWithHttpInfo(modChoiceSubmitChoiceResponseRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModChoiceApi.ModChoiceSubmitChoiceResponseWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChoiceSubmitChoiceResponseRequest** | [**ModChoiceSubmitChoiceResponseRequest**](ModChoiceSubmitChoiceResponseRequest.md) |  |  |

### Return type

[**ModChoiceSubmitChoiceResponse200Response**](ModChoiceSubmitChoiceResponse200Response.md)

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

<a id="modchoiceviewchoice"></a>
# **ModChoiceViewChoice**
> CoreCalendarDeleteSubscription200Response ModChoiceViewChoice (ModChoiceGetChoiceOptionsRequest modChoiceGetChoiceOptionsRequest)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModChoiceViewChoiceExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModChoiceApi(config);
            var modChoiceGetChoiceOptionsRequest = new ModChoiceGetChoiceOptionsRequest(); // ModChoiceGetChoiceOptionsRequest | 

            try
            {
                // Trigger the course module viewed event and update the module completion status.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModChoiceViewChoice(modChoiceGetChoiceOptionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModChoiceApi.ModChoiceViewChoice: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModChoiceViewChoiceWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the course module viewed event and update the module completion status.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModChoiceViewChoiceWithHttpInfo(modChoiceGetChoiceOptionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModChoiceApi.ModChoiceViewChoiceWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChoiceGetChoiceOptionsRequest** | [**ModChoiceGetChoiceOptionsRequest**](ModChoiceGetChoiceOptionsRequest.md) |  |  |

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

