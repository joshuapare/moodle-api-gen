# ToolUsertoursApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**toolUsertoursCompleteTour**](ToolUsertoursApi.md#toolUsertoursCompleteTour) | **POST** /tool_usertours_complete_tour | Mark the specified tour as completed for the current user |
| [**toolUsertoursFetchAndStartTour**](ToolUsertoursApi.md#toolUsertoursFetchAndStartTour) | **POST** /tool_usertours_fetch_and_start_tour | Fetch the specified tour |
| [**toolUsertoursResetTour**](ToolUsertoursApi.md#toolUsertoursResetTour) | **POST** /tool_usertours_reset_tour | Remove the specified tour |
| [**toolUsertoursStepShown**](ToolUsertoursApi.md#toolUsertoursStepShown) | **POST** /tool_usertours_step_shown | Mark the specified step as completed for the current user |


<a id="toolUsertoursCompleteTour"></a>
# **toolUsertoursCompleteTour**
> Object toolUsertoursCompleteTour(toolUsertoursCompleteTourRequest)

Mark the specified tour as completed for the current user

Mark the specified tour as completed for the current user

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolUsertoursApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolUsertoursApi apiInstance = new ToolUsertoursApi(defaultClient);
    ToolUsertoursCompleteTourRequest toolUsertoursCompleteTourRequest = new ToolUsertoursCompleteTourRequest(); // ToolUsertoursCompleteTourRequest | 
    try {
      Object result = apiInstance.toolUsertoursCompleteTour(toolUsertoursCompleteTourRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolUsertoursApi#toolUsertoursCompleteTour");
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
| **toolUsertoursCompleteTourRequest** | [**ToolUsertoursCompleteTourRequest**](ToolUsertoursCompleteTourRequest.md)|  | |

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

<a id="toolUsertoursFetchAndStartTour"></a>
# **toolUsertoursFetchAndStartTour**
> ToolUsertoursFetchAndStartTour200Response toolUsertoursFetchAndStartTour(toolUsertoursFetchAndStartTourRequest)

Fetch the specified tour

Fetch the specified tour

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolUsertoursApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolUsertoursApi apiInstance = new ToolUsertoursApi(defaultClient);
    ToolUsertoursFetchAndStartTourRequest toolUsertoursFetchAndStartTourRequest = new ToolUsertoursFetchAndStartTourRequest(); // ToolUsertoursFetchAndStartTourRequest | 
    try {
      ToolUsertoursFetchAndStartTour200Response result = apiInstance.toolUsertoursFetchAndStartTour(toolUsertoursFetchAndStartTourRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolUsertoursApi#toolUsertoursFetchAndStartTour");
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
| **toolUsertoursFetchAndStartTourRequest** | [**ToolUsertoursFetchAndStartTourRequest**](ToolUsertoursFetchAndStartTourRequest.md)|  | |

### Return type

[**ToolUsertoursFetchAndStartTour200Response**](ToolUsertoursFetchAndStartTour200Response.md)

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

<a id="toolUsertoursResetTour"></a>
# **toolUsertoursResetTour**
> ToolUsertoursResetTour200Response toolUsertoursResetTour(toolUsertoursResetTourRequest)

Remove the specified tour

Remove the specified tour

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolUsertoursApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolUsertoursApi apiInstance = new ToolUsertoursApi(defaultClient);
    ToolUsertoursResetTourRequest toolUsertoursResetTourRequest = new ToolUsertoursResetTourRequest(); // ToolUsertoursResetTourRequest | 
    try {
      ToolUsertoursResetTour200Response result = apiInstance.toolUsertoursResetTour(toolUsertoursResetTourRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolUsertoursApi#toolUsertoursResetTour");
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
| **toolUsertoursResetTourRequest** | [**ToolUsertoursResetTourRequest**](ToolUsertoursResetTourRequest.md)|  | |

### Return type

[**ToolUsertoursResetTour200Response**](ToolUsertoursResetTour200Response.md)

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

<a id="toolUsertoursStepShown"></a>
# **toolUsertoursStepShown**
> Object toolUsertoursStepShown(toolUsertoursStepShownRequest)

Mark the specified step as completed for the current user

Mark the specified step as completed for the current user

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolUsertoursApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolUsertoursApi apiInstance = new ToolUsertoursApi(defaultClient);
    ToolUsertoursStepShownRequest toolUsertoursStepShownRequest = new ToolUsertoursStepShownRequest(); // ToolUsertoursStepShownRequest | 
    try {
      Object result = apiInstance.toolUsertoursStepShown(toolUsertoursStepShownRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolUsertoursApi#toolUsertoursStepShown");
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
| **toolUsertoursStepShownRequest** | [**ToolUsertoursStepShownRequest**](ToolUsertoursStepShownRequest.md)|  | |

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

