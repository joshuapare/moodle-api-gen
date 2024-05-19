# MoodleClient.Api.BlockStarredcoursesApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**BlockStarredcoursesGetStarredCourses**](BlockStarredcoursesApi.md#blockstarredcoursesgetstarredcourses) | **POST** /block_starredcourses_get_starred_courses | Get users starred courses. |

<a id="blockstarredcoursesgetstarredcourses"></a>
# **BlockStarredcoursesGetStarredCourses**
> Object BlockStarredcoursesGetStarredCourses (BlockStarredcoursesGetStarredCoursesRequest blockStarredcoursesGetStarredCoursesRequest)

Get users starred courses.

Get users starred courses.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockStarredcoursesGetStarredCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockStarredcoursesApi(config);
            var blockStarredcoursesGetStarredCoursesRequest = new BlockStarredcoursesGetStarredCoursesRequest(); // BlockStarredcoursesGetStarredCoursesRequest | 

            try
            {
                // Get users starred courses.
                Object result = apiInstance.BlockStarredcoursesGetStarredCourses(blockStarredcoursesGetStarredCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockStarredcoursesApi.BlockStarredcoursesGetStarredCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockStarredcoursesGetStarredCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get users starred courses.
    ApiResponse<Object> response = apiInstance.BlockStarredcoursesGetStarredCoursesWithHttpInfo(blockStarredcoursesGetStarredCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockStarredcoursesApi.BlockStarredcoursesGetStarredCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockStarredcoursesGetStarredCoursesRequest** | [**BlockStarredcoursesGetStarredCoursesRequest**](BlockStarredcoursesGetStarredCoursesRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

