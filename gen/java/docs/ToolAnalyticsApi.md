# ToolAnalyticsApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**toolAnalyticsPotentialContexts**](ToolAnalyticsApi.md#toolAnalyticsPotentialContexts) | **POST** /tool_analytics_potential_contexts | Retrieve the list of potential contexts for a model. |


<a id="toolAnalyticsPotentialContexts"></a>
# **toolAnalyticsPotentialContexts**
> Object toolAnalyticsPotentialContexts(toolAnalyticsPotentialContextsRequest)

Retrieve the list of potential contexts for a model.

Retrieve the list of potential contexts for a model.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolAnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolAnalyticsApi apiInstance = new ToolAnalyticsApi(defaultClient);
    ToolAnalyticsPotentialContextsRequest toolAnalyticsPotentialContextsRequest = new ToolAnalyticsPotentialContextsRequest(); // ToolAnalyticsPotentialContextsRequest | 
    try {
      Object result = apiInstance.toolAnalyticsPotentialContexts(toolAnalyticsPotentialContextsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolAnalyticsApi#toolAnalyticsPotentialContexts");
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
| **toolAnalyticsPotentialContextsRequest** | [**ToolAnalyticsPotentialContextsRequest**](ToolAnalyticsPotentialContextsRequest.md)|  | |

### Return type

**Object**

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

