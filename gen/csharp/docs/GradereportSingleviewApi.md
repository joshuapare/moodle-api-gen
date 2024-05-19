# MoodleClient.Api.GradereportSingleviewApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GradereportSingleviewGetGradeItemsForSearchWidget**](GradereportSingleviewApi.md#gradereportsingleviewgetgradeitemsforsearchwidget) | **POST** /gradereport_singleview_get_grade_items_for_search_widget | Get the gradeitem/(s) for a course |

<a id="gradereportsingleviewgetgradeitemsforsearchwidget"></a>
# **GradereportSingleviewGetGradeItemsForSearchWidget**
> GradereportSingleviewGetGradeItemsForSearchWidget200Response GradereportSingleviewGetGradeItemsForSearchWidget (CoreGradesGetGroupsForSearchWidgetRequest coreGradesGetGroupsForSearchWidgetRequest)

Get the gradeitem/(s) for a course

Get the gradeitem/(s) for a course

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class GradereportSingleviewGetGradeItemsForSearchWidgetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new GradereportSingleviewApi(config);
            var coreGradesGetGroupsForSearchWidgetRequest = new CoreGradesGetGroupsForSearchWidgetRequest(); // CoreGradesGetGroupsForSearchWidgetRequest | 

            try
            {
                // Get the gradeitem/(s) for a course
                GradereportSingleviewGetGradeItemsForSearchWidget200Response result = apiInstance.GradereportSingleviewGetGradeItemsForSearchWidget(coreGradesGetGroupsForSearchWidgetRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling GradereportSingleviewApi.GradereportSingleviewGetGradeItemsForSearchWidget: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GradereportSingleviewGetGradeItemsForSearchWidgetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get the gradeitem/(s) for a course
    ApiResponse<GradereportSingleviewGetGradeItemsForSearchWidget200Response> response = apiInstance.GradereportSingleviewGetGradeItemsForSearchWidgetWithHttpInfo(coreGradesGetGroupsForSearchWidgetRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GradereportSingleviewApi.GradereportSingleviewGetGradeItemsForSearchWidgetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **coreGradesGetGroupsForSearchWidgetRequest** | [**CoreGradesGetGroupsForSearchWidgetRequest**](CoreGradesGetGroupsForSearchWidgetRequest.md) |  |  |

### Return type

[**GradereportSingleviewGetGradeItemsForSearchWidget200Response**](GradereportSingleviewGetGradeItemsForSearchWidget200Response.md)

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

