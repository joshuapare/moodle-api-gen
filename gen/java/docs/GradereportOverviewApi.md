# GradereportOverviewApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gradereportOverviewGetCourseGrades**](GradereportOverviewApi.md#gradereportOverviewGetCourseGrades) | **POST** /gradereport_overview_get_course_grades | Get the given user courses final grades |
| [**gradereportOverviewViewGradeReport**](GradereportOverviewApi.md#gradereportOverviewViewGradeReport) | **POST** /gradereport_overview_view_grade_report | Trigger the report view event |


<a id="gradereportOverviewGetCourseGrades"></a>
# **gradereportOverviewGetCourseGrades**
> GradereportOverviewGetCourseGrades200Response gradereportOverviewGetCourseGrades(gradereportOverviewGetCourseGradesRequest)

Get the given user courses final grades

Get the given user courses final grades

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.GradereportOverviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    GradereportOverviewApi apiInstance = new GradereportOverviewApi(defaultClient);
    GradereportOverviewGetCourseGradesRequest gradereportOverviewGetCourseGradesRequest = new GradereportOverviewGetCourseGradesRequest(); // GradereportOverviewGetCourseGradesRequest | 
    try {
      GradereportOverviewGetCourseGrades200Response result = apiInstance.gradereportOverviewGetCourseGrades(gradereportOverviewGetCourseGradesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GradereportOverviewApi#gradereportOverviewGetCourseGrades");
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
| **gradereportOverviewGetCourseGradesRequest** | [**GradereportOverviewGetCourseGradesRequest**](GradereportOverviewGetCourseGradesRequest.md)|  | |

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

<a id="gradereportOverviewViewGradeReport"></a>
# **gradereportOverviewViewGradeReport**
> CoreCalendarDeleteSubscription200Response gradereportOverviewViewGradeReport(gradereportOverviewViewGradeReportRequest)

Trigger the report view event

Trigger the report view event

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.GradereportOverviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    GradereportOverviewApi apiInstance = new GradereportOverviewApi(defaultClient);
    GradereportOverviewViewGradeReportRequest gradereportOverviewViewGradeReportRequest = new GradereportOverviewViewGradeReportRequest(); // GradereportOverviewViewGradeReportRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.gradereportOverviewViewGradeReport(gradereportOverviewViewGradeReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GradereportOverviewApi#gradereportOverviewViewGradeReport");
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
| **gradereportOverviewViewGradeReportRequest** | [**GradereportOverviewViewGradeReportRequest**](GradereportOverviewViewGradeReportRequest.md)|  | |

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

