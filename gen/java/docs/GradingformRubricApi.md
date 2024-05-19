# GradingformRubricApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gradingformRubricGraderGradingpanelFetch**](GradingformRubricApi.md#gradingformRubricGraderGradingpanelFetch) | **POST** /gradingform_rubric_grader_gradingpanel_fetch | Fetch the data required to display the grader grading panel, creating the grade item if required |
| [**gradingformRubricGraderGradingpanelStore**](GradingformRubricApi.md#gradingformRubricGraderGradingpanelStore) | **POST** /gradingform_rubric_grader_gradingpanel_store | Store the grading data for a user from the grader grading panel. |


<a id="gradingformRubricGraderGradingpanelFetch"></a>
# **gradingformRubricGraderGradingpanelFetch**
> GradingformRubricGraderGradingpanelFetch200Response gradingformRubricGraderGradingpanelFetch(coreGradesGraderGradingpanelScaleFetchRequest)

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
import com.joshuapare.moodleclient.GradingformRubricApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    GradingformRubricApi apiInstance = new GradingformRubricApi(defaultClient);
    CoreGradesGraderGradingpanelScaleFetchRequest coreGradesGraderGradingpanelScaleFetchRequest = new CoreGradesGraderGradingpanelScaleFetchRequest(); // CoreGradesGraderGradingpanelScaleFetchRequest | 
    try {
      GradingformRubricGraderGradingpanelFetch200Response result = apiInstance.gradingformRubricGraderGradingpanelFetch(coreGradesGraderGradingpanelScaleFetchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GradingformRubricApi#gradingformRubricGraderGradingpanelFetch");
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

[**GradingformRubricGraderGradingpanelFetch200Response**](GradingformRubricGraderGradingpanelFetch200Response.md)

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

<a id="gradingformRubricGraderGradingpanelStore"></a>
# **gradingformRubricGraderGradingpanelStore**
> GradingformRubricGraderGradingpanelStore200Response gradingformRubricGraderGradingpanelStore(coreGradesGraderGradingpanelScaleStoreRequest)

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
import com.joshuapare.moodleclient.GradingformRubricApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    GradingformRubricApi apiInstance = new GradingformRubricApi(defaultClient);
    CoreGradesGraderGradingpanelScaleStoreRequest coreGradesGraderGradingpanelScaleStoreRequest = new CoreGradesGraderGradingpanelScaleStoreRequest(); // CoreGradesGraderGradingpanelScaleStoreRequest | 
    try {
      GradingformRubricGraderGradingpanelStore200Response result = apiInstance.gradingformRubricGraderGradingpanelStore(coreGradesGraderGradingpanelScaleStoreRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GradingformRubricApi#gradingformRubricGraderGradingpanelStore");
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

[**GradingformRubricGraderGradingpanelStore200Response**](GradingformRubricGraderGradingpanelStore200Response.md)

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

