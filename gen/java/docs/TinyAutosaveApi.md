# TinyAutosaveApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tinyAutosaveResetSession**](TinyAutosaveApi.md#tinyAutosaveResetSession) | **POST** /tiny_autosave_reset_session | Reset an autosave session |
| [**tinyAutosaveResumeSession**](TinyAutosaveApi.md#tinyAutosaveResumeSession) | **POST** /tiny_autosave_resume_session | Resume an autosave session |
| [**tinyAutosaveUpdateSession**](TinyAutosaveApi.md#tinyAutosaveUpdateSession) | **POST** /tiny_autosave_update_session | Update an autosave session |


<a id="tinyAutosaveResetSession"></a>
# **tinyAutosaveResetSession**
> Object tinyAutosaveResetSession(tinyAutosaveResetSessionRequest)

Reset an autosave session

Reset an autosave session

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.TinyAutosaveApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TinyAutosaveApi apiInstance = new TinyAutosaveApi(defaultClient);
    TinyAutosaveResetSessionRequest tinyAutosaveResetSessionRequest = new TinyAutosaveResetSessionRequest(); // TinyAutosaveResetSessionRequest | 
    try {
      Object result = apiInstance.tinyAutosaveResetSession(tinyAutosaveResetSessionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TinyAutosaveApi#tinyAutosaveResetSession");
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
| **tinyAutosaveResetSessionRequest** | [**TinyAutosaveResetSessionRequest**](TinyAutosaveResetSessionRequest.md)|  | |

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

<a id="tinyAutosaveResumeSession"></a>
# **tinyAutosaveResumeSession**
> TinyAutosaveResumeSession200Response tinyAutosaveResumeSession(tinyAutosaveResumeSessionRequest)

Resume an autosave session

Resume an autosave session

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.TinyAutosaveApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TinyAutosaveApi apiInstance = new TinyAutosaveApi(defaultClient);
    TinyAutosaveResumeSessionRequest tinyAutosaveResumeSessionRequest = new TinyAutosaveResumeSessionRequest(); // TinyAutosaveResumeSessionRequest | 
    try {
      TinyAutosaveResumeSession200Response result = apiInstance.tinyAutosaveResumeSession(tinyAutosaveResumeSessionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TinyAutosaveApi#tinyAutosaveResumeSession");
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
| **tinyAutosaveResumeSessionRequest** | [**TinyAutosaveResumeSessionRequest**](TinyAutosaveResumeSessionRequest.md)|  | |

### Return type

[**TinyAutosaveResumeSession200Response**](TinyAutosaveResumeSession200Response.md)

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

<a id="tinyAutosaveUpdateSession"></a>
# **tinyAutosaveUpdateSession**
> Object tinyAutosaveUpdateSession(tinyAutosaveUpdateSessionRequest)

Update an autosave session

Update an autosave session

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.TinyAutosaveApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TinyAutosaveApi apiInstance = new TinyAutosaveApi(defaultClient);
    TinyAutosaveUpdateSessionRequest tinyAutosaveUpdateSessionRequest = new TinyAutosaveUpdateSessionRequest(); // TinyAutosaveUpdateSessionRequest | 
    try {
      Object result = apiInstance.tinyAutosaveUpdateSession(tinyAutosaveUpdateSessionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TinyAutosaveApi#tinyAutosaveUpdateSession");
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
| **tinyAutosaveUpdateSessionRequest** | [**TinyAutosaveUpdateSessionRequest**](TinyAutosaveUpdateSessionRequest.md)|  | |

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

