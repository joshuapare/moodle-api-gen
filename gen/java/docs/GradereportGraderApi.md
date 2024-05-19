# GradereportGraderApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gradereportGraderGetUsersInReport**](GradereportGraderApi.md#gradereportGraderGetUsersInReport) | **POST** /gradereport_grader_get_users_in_report | Returns the dataset of users within the report |


<a id="gradereportGraderGetUsersInReport"></a>
# **gradereportGraderGetUsersInReport**
> CoreGradesGetGradableUsers200Response gradereportGraderGetUsersInReport(coreCompletionMarkCourseSelfCompletedRequest)

Returns the dataset of users within the report

Returns the dataset of users within the report

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.GradereportGraderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    GradereportGraderApi apiInstance = new GradereportGraderApi(defaultClient);
    CoreCompletionMarkCourseSelfCompletedRequest coreCompletionMarkCourseSelfCompletedRequest = new CoreCompletionMarkCourseSelfCompletedRequest(); // CoreCompletionMarkCourseSelfCompletedRequest | 
    try {
      CoreGradesGetGradableUsers200Response result = apiInstance.gradereportGraderGetUsersInReport(coreCompletionMarkCourseSelfCompletedRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GradereportGraderApi#gradereportGraderGetUsersInReport");
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
| **coreCompletionMarkCourseSelfCompletedRequest** | [**CoreCompletionMarkCourseSelfCompletedRequest**](CoreCompletionMarkCourseSelfCompletedRequest.md)|  | |

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

