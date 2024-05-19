# MoodleClient.Api.ModFolderApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModFolderGetFoldersByCourses**](ModFolderApi.md#modfoldergetfoldersbycourses) | **POST** /mod_folder_get_folders_by_courses | Returns a list of folders in a provided list of courses, if no list is provided all folders that                             the user can view will be returned. Please note that this WS is not returning the folder contents. |
| [**ModFolderViewFolder**](ModFolderApi.md#modfolderviewfolder) | **POST** /mod_folder_view_folder | Simulate the view.php web interface folder: trigger events, completion, etc... |

<a id="modfoldergetfoldersbycourses"></a>
# **ModFolderGetFoldersByCourses**
> ModFolderGetFoldersByCourses200Response ModFolderGetFoldersByCourses (ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest)

Returns a list of folders in a provided list of courses, if no list is provided all folders that                             the user can view will be returned. Please note that this WS is not returning the folder contents.

Returns a list of folders in a provided list of courses, if no list is provided all folders that                             the user can view will be returned. Please note that this WS is not returning the folder contents.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModFolderGetFoldersByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModFolderApi(config);
            var modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = new ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 

            try
            {
                // Returns a list of folders in a provided list of courses, if no list is provided all folders that                             the user can view will be returned. Please note that this WS is not returning the folder contents.
                ModFolderGetFoldersByCourses200Response result = apiInstance.ModFolderGetFoldersByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModFolderApi.ModFolderGetFoldersByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModFolderGetFoldersByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of folders in a provided list of courses, if no list is provided all folders that                             the user can view will be returned. Please note that this WS is not returning the folder contents.
    ApiResponse<ModFolderGetFoldersByCourses200Response> response = apiInstance.ModFolderGetFoldersByCoursesWithHttpInfo(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModFolderApi.ModFolderGetFoldersByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  |  |

### Return type

[**ModFolderGetFoldersByCourses200Response**](ModFolderGetFoldersByCourses200Response.md)

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

<a id="modfolderviewfolder"></a>
# **ModFolderViewFolder**
> CoreCalendarDeleteSubscription200Response ModFolderViewFolder (ModFolderViewFolderRequest modFolderViewFolderRequest)

Simulate the view.php web interface folder: trigger events, completion, etc...

Simulate the view.php web interface folder: trigger events, completion, etc...

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModFolderViewFolderExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModFolderApi(config);
            var modFolderViewFolderRequest = new ModFolderViewFolderRequest(); // ModFolderViewFolderRequest | 

            try
            {
                // Simulate the view.php web interface folder: trigger events, completion, etc...
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModFolderViewFolder(modFolderViewFolderRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModFolderApi.ModFolderViewFolder: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModFolderViewFolderWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Simulate the view.php web interface folder: trigger events, completion, etc...
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModFolderViewFolderWithHttpInfo(modFolderViewFolderRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModFolderApi.ModFolderViewFolderWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modFolderViewFolderRequest** | [**ModFolderViewFolderRequest**](ModFolderViewFolderRequest.md) |  |  |

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

