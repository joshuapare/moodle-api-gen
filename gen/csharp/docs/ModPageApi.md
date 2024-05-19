# MoodleClient.Api.ModPageApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModPageGetPagesByCourses**](ModPageApi.md#modpagegetpagesbycourses) | **POST** /mod_page_get_pages_by_courses | Returns a list of pages in a provided list of courses, if no list is provided all pages that the user                             can view will be returned. |
| [**ModPageViewPage**](ModPageApi.md#modpageviewpage) | **POST** /mod_page_view_page | Simulate the view.php web interface page: trigger events, completion, etc... |

<a id="modpagegetpagesbycourses"></a>
# **ModPageGetPagesByCourses**
> ModPageGetPagesByCourses200Response ModPageGetPagesByCourses (ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest)

Returns a list of pages in a provided list of courses, if no list is provided all pages that the user                             can view will be returned.

Returns a list of pages in a provided list of courses, if no list is provided all pages that the user                             can view will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModPageGetPagesByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModPageApi(config);
            var modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = new ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 

            try
            {
                // Returns a list of pages in a provided list of courses, if no list is provided all pages that the user                             can view will be returned.
                ModPageGetPagesByCourses200Response result = apiInstance.ModPageGetPagesByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModPageApi.ModPageGetPagesByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModPageGetPagesByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of pages in a provided list of courses, if no list is provided all pages that the user                             can view will be returned.
    ApiResponse<ModPageGetPagesByCourses200Response> response = apiInstance.ModPageGetPagesByCoursesWithHttpInfo(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModPageApi.ModPageGetPagesByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  |  |

### Return type

[**ModPageGetPagesByCourses200Response**](ModPageGetPagesByCourses200Response.md)

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

<a id="modpageviewpage"></a>
# **ModPageViewPage**
> CoreCalendarDeleteSubscription200Response ModPageViewPage (ModPageViewPageRequest modPageViewPageRequest)

Simulate the view.php web interface page: trigger events, completion, etc...

Simulate the view.php web interface page: trigger events, completion, etc...

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModPageViewPageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModPageApi(config);
            var modPageViewPageRequest = new ModPageViewPageRequest(); // ModPageViewPageRequest | 

            try
            {
                // Simulate the view.php web interface page: trigger events, completion, etc...
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModPageViewPage(modPageViewPageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModPageApi.ModPageViewPage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModPageViewPageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Simulate the view.php web interface page: trigger events, completion, etc...
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModPageViewPageWithHttpInfo(modPageViewPageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModPageApi.ModPageViewPageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modPageViewPageRequest** | [**ModPageViewPageRequest**](ModPageViewPageRequest.md) |  |  |

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

