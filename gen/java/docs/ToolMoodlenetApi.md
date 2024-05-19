# ToolMoodlenetApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**toolMoodlenetSearchCourses**](ToolMoodlenetApi.md#toolMoodlenetSearchCourses) | **POST** /tool_moodlenet_search_courses | For some given input search for a course that matches |
| [**toolMoodlenetVerifyWebfinger**](ToolMoodlenetApi.md#toolMoodlenetVerifyWebfinger) | **POST** /tool_moodlenet_verify_webfinger | Verify if the passed information resolves into a WebFinger profile URL |


<a id="toolMoodlenetSearchCourses"></a>
# **toolMoodlenetSearchCourses**
> ToolMoodlenetSearchCourses200Response toolMoodlenetSearchCourses(toolMoodlenetSearchCoursesRequest)

For some given input search for a course that matches

For some given input search for a course that matches

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolMoodlenetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolMoodlenetApi apiInstance = new ToolMoodlenetApi(defaultClient);
    ToolMoodlenetSearchCoursesRequest toolMoodlenetSearchCoursesRequest = new ToolMoodlenetSearchCoursesRequest(); // ToolMoodlenetSearchCoursesRequest | 
    try {
      ToolMoodlenetSearchCourses200Response result = apiInstance.toolMoodlenetSearchCourses(toolMoodlenetSearchCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolMoodlenetApi#toolMoodlenetSearchCourses");
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
| **toolMoodlenetSearchCoursesRequest** | [**ToolMoodlenetSearchCoursesRequest**](ToolMoodlenetSearchCoursesRequest.md)|  | |

### Return type

[**ToolMoodlenetSearchCourses200Response**](ToolMoodlenetSearchCourses200Response.md)

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

<a id="toolMoodlenetVerifyWebfinger"></a>
# **toolMoodlenetVerifyWebfinger**
> ToolMoodlenetVerifyWebfinger200Response toolMoodlenetVerifyWebfinger(toolMoodlenetVerifyWebfingerRequest)

Verify if the passed information resolves into a WebFinger profile URL

Verify if the passed information resolves into a WebFinger profile URL

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolMoodlenetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolMoodlenetApi apiInstance = new ToolMoodlenetApi(defaultClient);
    ToolMoodlenetVerifyWebfingerRequest toolMoodlenetVerifyWebfingerRequest = new ToolMoodlenetVerifyWebfingerRequest(); // ToolMoodlenetVerifyWebfingerRequest | 
    try {
      ToolMoodlenetVerifyWebfinger200Response result = apiInstance.toolMoodlenetVerifyWebfinger(toolMoodlenetVerifyWebfingerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolMoodlenetApi#toolMoodlenetVerifyWebfinger");
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
| **toolMoodlenetVerifyWebfingerRequest** | [**ToolMoodlenetVerifyWebfingerRequest**](ToolMoodlenetVerifyWebfingerRequest.md)|  | |

### Return type

[**ToolMoodlenetVerifyWebfinger200Response**](ToolMoodlenetVerifyWebfinger200Response.md)

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

