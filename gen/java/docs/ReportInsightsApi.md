# ReportInsightsApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**reportInsightsActionExecuted**](ReportInsightsApi.md#reportInsightsActionExecuted) | **POST** /report_insights_action_executed | Stores an action executed over a group of predictions. |
| [**reportInsightsSetFixedPrediction**](ReportInsightsApi.md#reportInsightsSetFixedPrediction) | **POST** /report_insights_set_fixed_prediction | Flags a prediction as fixed. |
| [**reportInsightsSetNotusefulPrediction**](ReportInsightsApi.md#reportInsightsSetNotusefulPrediction) | **POST** /report_insights_set_notuseful_prediction | Flags the prediction as not useful. |


<a id="reportInsightsActionExecuted"></a>
# **reportInsightsActionExecuted**
> CoreCohortAddCohortMembers200Response reportInsightsActionExecuted(reportInsightsActionExecutedRequest)

Stores an action executed over a group of predictions.

Stores an action executed over a group of predictions.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ReportInsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ReportInsightsApi apiInstance = new ReportInsightsApi(defaultClient);
    ReportInsightsActionExecutedRequest reportInsightsActionExecutedRequest = new ReportInsightsActionExecutedRequest(); // ReportInsightsActionExecutedRequest | 
    try {
      CoreCohortAddCohortMembers200Response result = apiInstance.reportInsightsActionExecuted(reportInsightsActionExecutedRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportInsightsApi#reportInsightsActionExecuted");
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
| **reportInsightsActionExecutedRequest** | [**ReportInsightsActionExecutedRequest**](ReportInsightsActionExecutedRequest.md)|  | |

### Return type

[**CoreCohortAddCohortMembers200Response**](CoreCohortAddCohortMembers200Response.md)

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

<a id="reportInsightsSetFixedPrediction"></a>
# **reportInsightsSetFixedPrediction**
> ReportInsightsSetFixedPrediction200Response reportInsightsSetFixedPrediction(reportInsightsSetFixedPredictionRequest)

Flags a prediction as fixed.

Flags a prediction as fixed.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ReportInsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ReportInsightsApi apiInstance = new ReportInsightsApi(defaultClient);
    ReportInsightsSetFixedPredictionRequest reportInsightsSetFixedPredictionRequest = new ReportInsightsSetFixedPredictionRequest(); // ReportInsightsSetFixedPredictionRequest | 
    try {
      ReportInsightsSetFixedPrediction200Response result = apiInstance.reportInsightsSetFixedPrediction(reportInsightsSetFixedPredictionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportInsightsApi#reportInsightsSetFixedPrediction");
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
| **reportInsightsSetFixedPredictionRequest** | [**ReportInsightsSetFixedPredictionRequest**](ReportInsightsSetFixedPredictionRequest.md)|  | |

### Return type

[**ReportInsightsSetFixedPrediction200Response**](ReportInsightsSetFixedPrediction200Response.md)

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

<a id="reportInsightsSetNotusefulPrediction"></a>
# **reportInsightsSetNotusefulPrediction**
> ReportInsightsSetNotusefulPrediction200Response reportInsightsSetNotusefulPrediction(reportInsightsSetNotusefulPredictionRequest)

Flags the prediction as not useful.

Flags the prediction as not useful.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ReportInsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ReportInsightsApi apiInstance = new ReportInsightsApi(defaultClient);
    ReportInsightsSetNotusefulPredictionRequest reportInsightsSetNotusefulPredictionRequest = new ReportInsightsSetNotusefulPredictionRequest(); // ReportInsightsSetNotusefulPredictionRequest | 
    try {
      ReportInsightsSetNotusefulPrediction200Response result = apiInstance.reportInsightsSetNotusefulPrediction(reportInsightsSetNotusefulPredictionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportInsightsApi#reportInsightsSetNotusefulPrediction");
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
| **reportInsightsSetNotusefulPredictionRequest** | [**ReportInsightsSetNotusefulPredictionRequest**](ReportInsightsSetNotusefulPredictionRequest.md)|  | |

### Return type

[**ReportInsightsSetNotusefulPrediction200Response**](ReportInsightsSetNotusefulPrediction200Response.md)

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

