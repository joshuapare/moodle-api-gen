# Org.OpenAPITools.Api.ReportCompetencyApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ReportCompetencyDataForReport**](ReportCompetencyApi.md#reportcompetencydataforreport) | **POST** /report_competency_data_for_report | Load the data for the competency report in a course. |

<a id="reportcompetencydataforreport"></a>
# **ReportCompetencyDataForReport**
> ReportCompetencyDataForReport200Response ReportCompetencyDataForReport (ReportCompetencyDataForReportRequest reportCompetencyDataForReportRequest)

Load the data for the competency report in a course.

Load the data for the competency report in a course.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ReportCompetencyDataForReportExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReportCompetencyApi(config);
            var reportCompetencyDataForReportRequest = new ReportCompetencyDataForReportRequest(); // ReportCompetencyDataForReportRequest | 

            try
            {
                // Load the data for the competency report in a course.
                ReportCompetencyDataForReport200Response result = apiInstance.ReportCompetencyDataForReport(reportCompetencyDataForReportRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReportCompetencyApi.ReportCompetencyDataForReport: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ReportCompetencyDataForReportWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load the data for the competency report in a course.
    ApiResponse<ReportCompetencyDataForReport200Response> response = apiInstance.ReportCompetencyDataForReportWithHttpInfo(reportCompetencyDataForReportRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReportCompetencyApi.ReportCompetencyDataForReportWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **reportCompetencyDataForReportRequest** | [**ReportCompetencyDataForReportRequest**](ReportCompetencyDataForReportRequest.md) |  |  |

### Return type

[**ReportCompetencyDataForReport200Response**](ReportCompetencyDataForReport200Response.md)

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

