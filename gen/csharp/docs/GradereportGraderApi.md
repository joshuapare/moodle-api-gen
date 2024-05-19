# MoodleClient.Api.GradereportGraderApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GradereportGraderGetUsersInReport**](GradereportGraderApi.md#gradereportgradergetusersinreport) | **POST** /gradereport_grader_get_users_in_report | Returns the dataset of users within the report |

<a id="gradereportgradergetusersinreport"></a>
# **GradereportGraderGetUsersInReport**
> CoreGradesGetGradableUsers200Response GradereportGraderGetUsersInReport (CoreCompletionMarkCourseSelfCompletedRequest coreCompletionMarkCourseSelfCompletedRequest)

Returns the dataset of users within the report

Returns the dataset of users within the report

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class GradereportGraderGetUsersInReportExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new GradereportGraderApi(config);
            var coreCompletionMarkCourseSelfCompletedRequest = new CoreCompletionMarkCourseSelfCompletedRequest(); // CoreCompletionMarkCourseSelfCompletedRequest | 

            try
            {
                // Returns the dataset of users within the report
                CoreGradesGetGradableUsers200Response result = apiInstance.GradereportGraderGetUsersInReport(coreCompletionMarkCourseSelfCompletedRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling GradereportGraderApi.GradereportGraderGetUsersInReport: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GradereportGraderGetUsersInReportWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns the dataset of users within the report
    ApiResponse<CoreGradesGetGradableUsers200Response> response = apiInstance.GradereportGraderGetUsersInReportWithHttpInfo(coreCompletionMarkCourseSelfCompletedRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GradereportGraderApi.GradereportGraderGetUsersInReportWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **coreCompletionMarkCourseSelfCompletedRequest** | [**CoreCompletionMarkCourseSelfCompletedRequest**](CoreCompletionMarkCourseSelfCompletedRequest.md) |  |  |

### Return type

[**CoreGradesGetGradableUsers200Response**](CoreGradesGetGradableUsers200Response.md)

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

