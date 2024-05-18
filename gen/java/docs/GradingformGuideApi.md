# GradingformGuideApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gradingformGuideGraderGradingpanelFetch**](GradingformGuideApi.md#gradingformGuideGraderGradingpanelFetch) | **POST** /gradingform_guide_grader_gradingpanel_fetch | Fetch the data required to display the grader grading panel, creating the grade item if required |
| [**gradingformGuideGraderGradingpanelStore**](GradingformGuideApi.md#gradingformGuideGraderGradingpanelStore) | **POST** /gradingform_guide_grader_gradingpanel_store | Store the grading data for a user from the grader grading panel. |


<a id="gradingformGuideGraderGradingpanelFetch"></a>
# **gradingformGuideGraderGradingpanelFetch**
> GradingformGuideGraderGradingpanelFetch200Response gradingformGuideGraderGradingpanelFetch(coreGradesGraderGradingpanelScaleFetchRequest)

Fetch the data required to display the grader grading panel, creating the grade item if required

Fetch the data required to display the grader grading panel, creating the grade item if required

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.GradingformGuideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    GradingformGuideApi apiInstance = new GradingformGuideApi(defaultClient);
    CoreGradesGraderGradingpanelScaleFetchRequest coreGradesGraderGradingpanelScaleFetchRequest = new CoreGradesGraderGradingpanelScaleFetchRequest(); // CoreGradesGraderGradingpanelScaleFetchRequest | 
    try {
      GradingformGuideGraderGradingpanelFetch200Response result = apiInstance.gradingformGuideGraderGradingpanelFetch(coreGradesGraderGradingpanelScaleFetchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GradingformGuideApi#gradingformGuideGraderGradingpanelFetch");
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
| **coreGradesGraderGradingpanelScaleFetchRequest** | [**CoreGradesGraderGradingpanelScaleFetchRequest**](CoreGradesGraderGradingpanelScaleFetchRequest.md)|  | |

### Return type

[**GradingformGuideGraderGradingpanelFetch200Response**](GradingformGuideGraderGradingpanelFetch200Response.md)

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

<a id="gradingformGuideGraderGradingpanelStore"></a>
# **gradingformGuideGraderGradingpanelStore**
> GradingformGuideGraderGradingpanelStore200Response gradingformGuideGraderGradingpanelStore(coreGradesGraderGradingpanelScaleStoreRequest)

Store the grading data for a user from the grader grading panel.

Store the grading data for a user from the grader grading panel.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.GradingformGuideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    GradingformGuideApi apiInstance = new GradingformGuideApi(defaultClient);
    CoreGradesGraderGradingpanelScaleStoreRequest coreGradesGraderGradingpanelScaleStoreRequest = new CoreGradesGraderGradingpanelScaleStoreRequest(); // CoreGradesGraderGradingpanelScaleStoreRequest | 
    try {
      GradingformGuideGraderGradingpanelStore200Response result = apiInstance.gradingformGuideGraderGradingpanelStore(coreGradesGraderGradingpanelScaleStoreRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GradingformGuideApi#gradingformGuideGraderGradingpanelStore");
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
| **coreGradesGraderGradingpanelScaleStoreRequest** | [**CoreGradesGraderGradingpanelScaleStoreRequest**](CoreGradesGraderGradingpanelScaleStoreRequest.md)|  | |

### Return type

[**GradingformGuideGraderGradingpanelStore200Response**](GradingformGuideGraderGradingpanelStore200Response.md)

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
