# TinyEquationApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tinyEquationFilter**](TinyEquationApi.md#tinyEquationFilter) | **POST** /tiny_equation_filter | Filter the equation |


<a id="tinyEquationFilter"></a>
# **tinyEquationFilter**
> TinyEquationFilter200Response tinyEquationFilter(tinyEquationFilterRequest)

Filter the equation

Filter the equation

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.TinyEquationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TinyEquationApi apiInstance = new TinyEquationApi(defaultClient);
    TinyEquationFilterRequest tinyEquationFilterRequest = new TinyEquationFilterRequest(); // TinyEquationFilterRequest | 
    try {
      TinyEquationFilter200Response result = apiInstance.tinyEquationFilter(tinyEquationFilterRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TinyEquationApi#tinyEquationFilter");
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
| **tinyEquationFilterRequest** | [**TinyEquationFilterRequest**](TinyEquationFilterRequest.md)|  | |

### Return type

[**TinyEquationFilter200Response**](TinyEquationFilter200Response.md)

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

