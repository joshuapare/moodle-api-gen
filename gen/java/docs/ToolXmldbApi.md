# ToolXmldbApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**toolXmldbInvokeMoveAction**](ToolXmldbApi.md#toolXmldbInvokeMoveAction) | **POST** /tool_xmldb_invoke_move_action | moves element up/down |


<a id="toolXmldbInvokeMoveAction"></a>
# **toolXmldbInvokeMoveAction**
> Object toolXmldbInvokeMoveAction(toolXmldbInvokeMoveActionRequest)

moves element up/down

moves element up/down

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolXmldbApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolXmldbApi apiInstance = new ToolXmldbApi(defaultClient);
    ToolXmldbInvokeMoveActionRequest toolXmldbInvokeMoveActionRequest = new ToolXmldbInvokeMoveActionRequest(); // ToolXmldbInvokeMoveActionRequest | 
    try {
      Object result = apiInstance.toolXmldbInvokeMoveAction(toolXmldbInvokeMoveActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolXmldbApi#toolXmldbInvokeMoveAction");
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
| **toolXmldbInvokeMoveActionRequest** | [**ToolXmldbInvokeMoveActionRequest**](ToolXmldbInvokeMoveActionRequest.md)|  | |

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

