# ModImscpApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modImscpGetImscpsByCourses**](ModImscpApi.md#modImscpGetImscpsByCourses) | **POST** /mod_imscp_get_imscps_by_courses | Returns a list of IMSCP instances in a provided set of courses,                             if no courses are provided then all the IMSCP instances the user has access to will be returned. |
| [**modImscpViewImscp**](ModImscpApi.md#modImscpViewImscp) | **POST** /mod_imscp_view_imscp | Simulate the view.php web interface imscp: trigger events, completion, etc... |


<a id="modImscpGetImscpsByCourses"></a>
# **modImscpGetImscpsByCourses**
> ModImscpGetImscpsByCourses200Response modImscpGetImscpsByCourses(modChatGetChatsByCoursesRequest)

Returns a list of IMSCP instances in a provided set of courses,                             if no courses are provided then all the IMSCP instances the user has access to will be returned.

Returns a list of IMSCP instances in a provided set of courses,                             if no courses are provided then all the IMSCP instances the user has access to will be returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModImscpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModImscpApi apiInstance = new ModImscpApi(defaultClient);
    ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 
    try {
      ModImscpGetImscpsByCourses200Response result = apiInstance.modImscpGetImscpsByCourses(modChatGetChatsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModImscpApi#modImscpGetImscpsByCourses");
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
| **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md)|  | |

### Return type

[**ModImscpGetImscpsByCourses200Response**](ModImscpGetImscpsByCourses200Response.md)

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

<a id="modImscpViewImscp"></a>
# **modImscpViewImscp**
> CoreCalendarDeleteSubscription200Response modImscpViewImscp(modImscpViewImscpRequest)

Simulate the view.php web interface imscp: trigger events, completion, etc...

Simulate the view.php web interface imscp: trigger events, completion, etc...

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModImscpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModImscpApi apiInstance = new ModImscpApi(defaultClient);
    ModImscpViewImscpRequest modImscpViewImscpRequest = new ModImscpViewImscpRequest(); // ModImscpViewImscpRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modImscpViewImscp(modImscpViewImscpRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModImscpApi#modImscpViewImscp");
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
| **modImscpViewImscpRequest** | [**ModImscpViewImscpRequest**](ModImscpViewImscpRequest.md)|  | |

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

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

