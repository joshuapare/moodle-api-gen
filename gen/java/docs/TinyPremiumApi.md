# TinyPremiumApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tinyPremiumGetApiKey**](TinyPremiumApi.md#tinyPremiumGetApiKey) | **POST** /tiny_premium_get_api_key | Get the Tiny Premium API key from Moodle |


<a id="tinyPremiumGetApiKey"></a>
# **tinyPremiumGetApiKey**
> TinyPremiumGetApiKey200Response tinyPremiumGetApiKey(tinyPremiumGetApiKeyRequest)

Get the Tiny Premium API key from Moodle

Get the Tiny Premium API key from Moodle

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.TinyPremiumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TinyPremiumApi apiInstance = new TinyPremiumApi(defaultClient);
    TinyPremiumGetApiKeyRequest tinyPremiumGetApiKeyRequest = new TinyPremiumGetApiKeyRequest(); // TinyPremiumGetApiKeyRequest | 
    try {
      TinyPremiumGetApiKey200Response result = apiInstance.tinyPremiumGetApiKey(tinyPremiumGetApiKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TinyPremiumApi#tinyPremiumGetApiKey");
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
| **tinyPremiumGetApiKeyRequest** | [**TinyPremiumGetApiKeyRequest**](TinyPremiumGetApiKeyRequest.md)|  | |

### Return type

[**TinyPremiumGetApiKey200Response**](TinyPremiumGetApiKey200Response.md)

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

