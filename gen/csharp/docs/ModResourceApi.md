# MoodleClient.Api.ModResourceApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModResourceGetResourcesByCourses**](ModResourceApi.md#modresourcegetresourcesbycourses) | **POST** /mod_resource_get_resources_by_courses | Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned. |
| [**ModResourceViewResource**](ModResourceApi.md#modresourceviewresource) | **POST** /mod_resource_view_resource | Simulate the view.php web interface resource: trigger events, completion, etc... |

<a id="modresourcegetresourcesbycourses"></a>
# **ModResourceGetResourcesByCourses**
> ModResourceGetResourcesByCourses200Response ModResourceGetResourcesByCourses (ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest)

Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.

Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModResourceGetResourcesByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModResourceApi(config);
            var modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = new ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 

            try
            {
                // Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
                ModResourceGetResourcesByCourses200Response result = apiInstance.ModResourceGetResourcesByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModResourceApi.ModResourceGetResourcesByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModResourceGetResourcesByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
    ApiResponse<ModResourceGetResourcesByCourses200Response> response = apiInstance.ModResourceGetResourcesByCoursesWithHttpInfo(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModResourceApi.ModResourceGetResourcesByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  |  |

### Return type

[**ModResourceGetResourcesByCourses200Response**](ModResourceGetResourcesByCourses200Response.md)

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

<a id="modresourceviewresource"></a>
# **ModResourceViewResource**
> CoreCalendarDeleteSubscription200Response ModResourceViewResource (ModResourceViewResourceRequest modResourceViewResourceRequest)

Simulate the view.php web interface resource: trigger events, completion, etc...

Simulate the view.php web interface resource: trigger events, completion, etc...

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModResourceViewResourceExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModResourceApi(config);
            var modResourceViewResourceRequest = new ModResourceViewResourceRequest(); // ModResourceViewResourceRequest | 

            try
            {
                // Simulate the view.php web interface resource: trigger events, completion, etc...
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModResourceViewResource(modResourceViewResourceRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModResourceApi.ModResourceViewResource: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModResourceViewResourceWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Simulate the view.php web interface resource: trigger events, completion, etc...
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModResourceViewResourceWithHttpInfo(modResourceViewResourceRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModResourceApi.ModResourceViewResourceWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modResourceViewResourceRequest** | [**ModResourceViewResourceRequest**](ModResourceViewResourceRequest.md) |  |  |

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

