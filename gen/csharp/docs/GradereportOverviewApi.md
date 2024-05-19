# MoodleClient.Api.GradereportOverviewApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GradereportOverviewGetCourseGrades**](GradereportOverviewApi.md#gradereportoverviewgetcoursegrades) | **POST** /gradereport_overview_get_course_grades | Get the given user courses final grades |
| [**GradereportOverviewViewGradeReport**](GradereportOverviewApi.md#gradereportoverviewviewgradereport) | **POST** /gradereport_overview_view_grade_report | Trigger the report view event |

<a id="gradereportoverviewgetcoursegrades"></a>
# **GradereportOverviewGetCourseGrades**
> GradereportOverviewGetCourseGrades200Response GradereportOverviewGetCourseGrades (GradereportOverviewGetCourseGradesRequest gradereportOverviewGetCourseGradesRequest)

Get the given user courses final grades

Get the given user courses final grades

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class GradereportOverviewGetCourseGradesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new GradereportOverviewApi(config);
            var gradereportOverviewGetCourseGradesRequest = new GradereportOverviewGetCourseGradesRequest(); // GradereportOverviewGetCourseGradesRequest | 

            try
            {
                // Get the given user courses final grades
                GradereportOverviewGetCourseGrades200Response result = apiInstance.GradereportOverviewGetCourseGrades(gradereportOverviewGetCourseGradesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling GradereportOverviewApi.GradereportOverviewGetCourseGrades: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GradereportOverviewGetCourseGradesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get the given user courses final grades
    ApiResponse<GradereportOverviewGetCourseGrades200Response> response = apiInstance.GradereportOverviewGetCourseGradesWithHttpInfo(gradereportOverviewGetCourseGradesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GradereportOverviewApi.GradereportOverviewGetCourseGradesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **gradereportOverviewGetCourseGradesRequest** | [**GradereportOverviewGetCourseGradesRequest**](GradereportOverviewGetCourseGradesRequest.md) |  |  |

### Return type

[**GradereportOverviewGetCourseGrades200Response**](GradereportOverviewGetCourseGrades200Response.md)

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

<a id="gradereportoverviewviewgradereport"></a>
# **GradereportOverviewViewGradeReport**
> CoreCalendarDeleteSubscription200Response GradereportOverviewViewGradeReport (GradereportOverviewViewGradeReportRequest gradereportOverviewViewGradeReportRequest)

Trigger the report view event

Trigger the report view event

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class GradereportOverviewViewGradeReportExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new GradereportOverviewApi(config);
            var gradereportOverviewViewGradeReportRequest = new GradereportOverviewViewGradeReportRequest(); // GradereportOverviewViewGradeReportRequest | 

            try
            {
                // Trigger the report view event
                CoreCalendarDeleteSubscription200Response result = apiInstance.GradereportOverviewViewGradeReport(gradereportOverviewViewGradeReportRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling GradereportOverviewApi.GradereportOverviewViewGradeReport: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GradereportOverviewViewGradeReportWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the report view event
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.GradereportOverviewViewGradeReportWithHttpInfo(gradereportOverviewViewGradeReportRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GradereportOverviewApi.GradereportOverviewViewGradeReportWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **gradereportOverviewViewGradeReportRequest** | [**GradereportOverviewViewGradeReportRequest**](GradereportOverviewViewGradeReportRequest.md) |  |  |

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

