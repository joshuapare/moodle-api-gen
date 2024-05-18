# ToolBehatApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**toolBehatGetEntityGenerator**](ToolBehatApi.md#toolBehatGetEntityGenerator) | **POST** /tool_behat_get_entity_generator | Get the generator details for an entity |


<a id="toolBehatGetEntityGenerator"></a>
# **toolBehatGetEntityGenerator**
> ToolBehatGetEntityGenerator200Response toolBehatGetEntityGenerator(toolBehatGetEntityGeneratorRequest)

Get the generator details for an entity

Get the generator details for an entity

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolBehatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolBehatApi apiInstance = new ToolBehatApi(defaultClient);
    ToolBehatGetEntityGeneratorRequest toolBehatGetEntityGeneratorRequest = new ToolBehatGetEntityGeneratorRequest(); // ToolBehatGetEntityGeneratorRequest | 
    try {
      ToolBehatGetEntityGenerator200Response result = apiInstance.toolBehatGetEntityGenerator(toolBehatGetEntityGeneratorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolBehatApi#toolBehatGetEntityGenerator");
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
| **toolBehatGetEntityGeneratorRequest** | [**ToolBehatGetEntityGeneratorRequest**](ToolBehatGetEntityGeneratorRequest.md)|  | |

### Return type

[**ToolBehatGetEntityGenerator200Response**](ToolBehatGetEntityGenerator200Response.md)

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
