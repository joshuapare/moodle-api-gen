# ReportCompetencyApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**reportCompetencyDataForReport**](ReportCompetencyApi.md#reportCompetencyDataForReport) | **POST** /report_competency_data_for_report | Load the data for the competency report in a course. |


<a id="reportCompetencyDataForReport"></a>
# **reportCompetencyDataForReport**
> ReportCompetencyDataForReport200Response reportCompetencyDataForReport(reportCompetencyDataForReportRequest)

Load the data for the competency report in a course.

Load the data for the competency report in a course.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ReportCompetencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ReportCompetencyApi apiInstance = new ReportCompetencyApi(defaultClient);
    ReportCompetencyDataForReportRequest reportCompetencyDataForReportRequest = new ReportCompetencyDataForReportRequest(); // ReportCompetencyDataForReportRequest | 
    try {
      ReportCompetencyDataForReport200Response result = apiInstance.reportCompetencyDataForReport(reportCompetencyDataForReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportCompetencyApi#reportCompetencyDataForReport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportCompetencyDataForReportRequest** | [**ReportCompetencyDataForReportRequest**](ReportCompetencyDataForReportRequest.md)|  | |

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

