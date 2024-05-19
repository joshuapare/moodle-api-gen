# GradereportSingleviewApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gradereportSingleviewGetGradeItemsForSearchWidget**](GradereportSingleviewApi.md#gradereportSingleviewGetGradeItemsForSearchWidget) | **POST** /gradereport_singleview_get_grade_items_for_search_widget | Get the gradeitem/(s) for a course |


<a id="gradereportSingleviewGetGradeItemsForSearchWidget"></a>
# **gradereportSingleviewGetGradeItemsForSearchWidget**
> GradereportSingleviewGetGradeItemsForSearchWidget200Response gradereportSingleviewGetGradeItemsForSearchWidget(coreGradesGetGroupsForSearchWidgetRequest)

Get the gradeitem/(s) for a course

Get the gradeitem/(s) for a course

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.GradereportSingleviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    GradereportSingleviewApi apiInstance = new GradereportSingleviewApi(defaultClient);
    CoreGradesGetGroupsForSearchWidgetRequest coreGradesGetGroupsForSearchWidgetRequest = new CoreGradesGetGroupsForSearchWidgetRequest(); // CoreGradesGetGroupsForSearchWidgetRequest | 
    try {
      GradereportSingleviewGetGradeItemsForSearchWidget200Response result = apiInstance.gradereportSingleviewGetGradeItemsForSearchWidget(coreGradesGetGroupsForSearchWidgetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GradereportSingleviewApi#gradereportSingleviewGetGradeItemsForSearchWidget");
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
| **coreGradesGetGroupsForSearchWidgetRequest** | [**CoreGradesGetGroupsForSearchWidgetRequest**](CoreGradesGetGroupsForSearchWidgetRequest.md)|  | |

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

