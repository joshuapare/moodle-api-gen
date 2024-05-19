# MoodleClient.Api.ModImscpApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModImscpGetImscpsByCourses**](ModImscpApi.md#modimscpgetimscpsbycourses) | **POST** /mod_imscp_get_imscps_by_courses | Returns a list of IMSCP instances in a provided set of courses,                             if no courses are provided then all the IMSCP instances the user has access to will be returned. |
| [**ModImscpViewImscp**](ModImscpApi.md#modimscpviewimscp) | **POST** /mod_imscp_view_imscp | Simulate the view.php web interface imscp: trigger events, completion, etc... |

<a id="modimscpgetimscpsbycourses"></a>
# **ModImscpGetImscpsByCourses**
> ModImscpGetImscpsByCourses200Response ModImscpGetImscpsByCourses (ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest)

Returns a list of IMSCP instances in a provided set of courses,                             if no courses are provided then all the IMSCP instances the user has access to will be returned.

Returns a list of IMSCP instances in a provided set of courses,                             if no courses are provided then all the IMSCP instances the user has access to will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModImscpGetImscpsByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModImscpApi(config);
            var modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 

            try
            {
                // Returns a list of IMSCP instances in a provided set of courses,                             if no courses are provided then all the IMSCP instances the user has access to will be returned.
                ModImscpGetImscpsByCourses200Response result = apiInstance.ModImscpGetImscpsByCourses(modChatGetChatsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModImscpApi.ModImscpGetImscpsByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModImscpGetImscpsByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of IMSCP instances in a provided set of courses,                             if no courses are provided then all the IMSCP instances the user has access to will be returned.
    ApiResponse<ModImscpGetImscpsByCourses200Response> response = apiInstance.ModImscpGetImscpsByCoursesWithHttpInfo(modChatGetChatsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModImscpApi.ModImscpGetImscpsByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  |  |

### Return type

[**ModImscpGetImscpsByCourses200Response**](ModImscpGetImscpsByCourses200Response.md)

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

<a id="modimscpviewimscp"></a>
# **ModImscpViewImscp**
> CoreCalendarDeleteSubscription200Response ModImscpViewImscp (ModImscpViewImscpRequest modImscpViewImscpRequest)

Simulate the view.php web interface imscp: trigger events, completion, etc...

Simulate the view.php web interface imscp: trigger events, completion, etc...

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModImscpViewImscpExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModImscpApi(config);
            var modImscpViewImscpRequest = new ModImscpViewImscpRequest(); // ModImscpViewImscpRequest | 

            try
            {
                // Simulate the view.php web interface imscp: trigger events, completion, etc...
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModImscpViewImscp(modImscpViewImscpRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModImscpApi.ModImscpViewImscp: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModImscpViewImscpWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Simulate the view.php web interface imscp: trigger events, completion, etc...
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModImscpViewImscpWithHttpInfo(modImscpViewImscpRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModImscpApi.ModImscpViewImscpWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modImscpViewImscpRequest** | [**ModImscpViewImscpRequest**](ModImscpViewImscpRequest.md) |  |  |

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

