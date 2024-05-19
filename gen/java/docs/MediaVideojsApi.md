# MediaVideojsApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**mediaVideojsGetLanguage**](MediaVideojsApi.md#mediaVideojsGetLanguage) | **POST** /media_videojs_get_language | get language. |


<a id="mediaVideojsGetLanguage"></a>
# **mediaVideojsGetLanguage**
> Object mediaVideojsGetLanguage(mediaVideojsGetLanguageRequest)

get language.

get language.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.MediaVideojsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    MediaVideojsApi apiInstance = new MediaVideojsApi(defaultClient);
    MediaVideojsGetLanguageRequest mediaVideojsGetLanguageRequest = new MediaVideojsGetLanguageRequest(); // MediaVideojsGetLanguageRequest | 
    try {
      Object result = apiInstance.mediaVideojsGetLanguage(mediaVideojsGetLanguageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideojsApi#mediaVideojsGetLanguage");
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
| **mediaVideojsGetLanguageRequest** | [**MediaVideojsGetLanguageRequest**](MediaVideojsGetLanguageRequest.md)|  | |

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
| **200** | language pack json |  -  |
| **400** | Invalid parameter value detected |  -  |

