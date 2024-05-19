# MoodleClient.Api.ModLabelApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModLabelGetLabelsByCourses**](ModLabelApi.md#modlabelgetlabelsbycourses) | **POST** /mod_label_get_labels_by_courses | Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned. |

<a id="modlabelgetlabelsbycourses"></a>
# **ModLabelGetLabelsByCourses**
> ModLabelGetLabelsByCourses200Response ModLabelGetLabelsByCourses (ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest)

Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.

Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModLabelGetLabelsByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLabelApi(config);
            var modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = new ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 

            try
            {
                // Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.
                ModLabelGetLabelsByCourses200Response result = apiInstance.ModLabelGetLabelsByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLabelApi.ModLabelGetLabelsByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLabelGetLabelsByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.
    ApiResponse<ModLabelGetLabelsByCourses200Response> response = apiInstance.ModLabelGetLabelsByCoursesWithHttpInfo(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLabelApi.ModLabelGetLabelsByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  |  |

### Return type

[**ModLabelGetLabelsByCourses200Response**](ModLabelGetLabelsByCourses200Response.md)

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

