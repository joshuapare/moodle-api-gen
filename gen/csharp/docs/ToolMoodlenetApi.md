# Org.OpenAPITools.Api.ToolMoodlenetApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ToolMoodlenetSearchCourses**](ToolMoodlenetApi.md#toolmoodlenetsearchcourses) | **POST** /tool_moodlenet_search_courses | For some given input search for a course that matches |
| [**ToolMoodlenetVerifyWebfinger**](ToolMoodlenetApi.md#toolmoodlenetverifywebfinger) | **POST** /tool_moodlenet_verify_webfinger | Verify if the passed information resolves into a WebFinger profile URL |

<a id="toolmoodlenetsearchcourses"></a>
# **ToolMoodlenetSearchCourses**
> ToolMoodlenetSearchCourses200Response ToolMoodlenetSearchCourses (ToolMoodlenetSearchCoursesRequest toolMoodlenetSearchCoursesRequest)

For some given input search for a course that matches

For some given input search for a course that matches

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolMoodlenetSearchCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolMoodlenetApi(config);
            var toolMoodlenetSearchCoursesRequest = new ToolMoodlenetSearchCoursesRequest(); // ToolMoodlenetSearchCoursesRequest | 

            try
            {
                // For some given input search for a course that matches
                ToolMoodlenetSearchCourses200Response result = apiInstance.ToolMoodlenetSearchCourses(toolMoodlenetSearchCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolMoodlenetApi.ToolMoodlenetSearchCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolMoodlenetSearchCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // For some given input search for a course that matches
    ApiResponse<ToolMoodlenetSearchCourses200Response> response = apiInstance.ToolMoodlenetSearchCoursesWithHttpInfo(toolMoodlenetSearchCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolMoodlenetApi.ToolMoodlenetSearchCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolMoodlenetSearchCoursesRequest** | [**ToolMoodlenetSearchCoursesRequest**](ToolMoodlenetSearchCoursesRequest.md) |  |  |

### Return type

[**ToolMoodlenetSearchCourses200Response**](ToolMoodlenetSearchCourses200Response.md)

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

<a id="toolmoodlenetverifywebfinger"></a>
# **ToolMoodlenetVerifyWebfinger**
> ToolMoodlenetVerifyWebfinger200Response ToolMoodlenetVerifyWebfinger (ToolMoodlenetVerifyWebfingerRequest toolMoodlenetVerifyWebfingerRequest)

Verify if the passed information resolves into a WebFinger profile URL

Verify if the passed information resolves into a WebFinger profile URL

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolMoodlenetVerifyWebfingerExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolMoodlenetApi(config);
            var toolMoodlenetVerifyWebfingerRequest = new ToolMoodlenetVerifyWebfingerRequest(); // ToolMoodlenetVerifyWebfingerRequest | 

            try
            {
                // Verify if the passed information resolves into a WebFinger profile URL
                ToolMoodlenetVerifyWebfinger200Response result = apiInstance.ToolMoodlenetVerifyWebfinger(toolMoodlenetVerifyWebfingerRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolMoodlenetApi.ToolMoodlenetVerifyWebfinger: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolMoodlenetVerifyWebfingerWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Verify if the passed information resolves into a WebFinger profile URL
    ApiResponse<ToolMoodlenetVerifyWebfinger200Response> response = apiInstance.ToolMoodlenetVerifyWebfingerWithHttpInfo(toolMoodlenetVerifyWebfingerRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolMoodlenetApi.ToolMoodlenetVerifyWebfingerWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolMoodlenetVerifyWebfingerRequest** | [**ToolMoodlenetVerifyWebfingerRequest**](ToolMoodlenetVerifyWebfingerRequest.md) |  |  |

### Return type

[**ToolMoodlenetVerifyWebfinger200Response**](ToolMoodlenetVerifyWebfinger200Response.md)

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

