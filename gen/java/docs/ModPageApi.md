# ModPageApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modPageGetPagesByCourses**](ModPageApi.md#modPageGetPagesByCourses) | **POST** /mod_page_get_pages_by_courses | Returns a list of pages in a provided list of courses, if no list is provided all pages that the user                             can view will be returned. |
| [**modPageViewPage**](ModPageApi.md#modPageViewPage) | **POST** /mod_page_view_page | Simulate the view.php web interface page: trigger events, completion, etc... |


<a id="modPageGetPagesByCourses"></a>
# **modPageGetPagesByCourses**
> ModPageGetPagesByCourses200Response modPageGetPagesByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest)

Returns a list of pages in a provided list of courses, if no list is provided all pages that the user                             can view will be returned.

Returns a list of pages in a provided list of courses, if no list is provided all pages that the user                             can view will be returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModPageApi apiInstance = new ModPageApi(defaultClient);
    ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = new ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 
    try {
      ModPageGetPagesByCourses200Response result = apiInstance.modPageGetPagesByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModPageApi#modPageGetPagesByCourses");
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
| **modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md)|  | |

### Return type

[**ModPageGetPagesByCourses200Response**](ModPageGetPagesByCourses200Response.md)

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

<a id="modPageViewPage"></a>
# **modPageViewPage**
> CoreCalendarDeleteSubscription200Response modPageViewPage(modPageViewPageRequest)

Simulate the view.php web interface page: trigger events, completion, etc...

Simulate the view.php web interface page: trigger events, completion, etc...

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModPageApi apiInstance = new ModPageApi(defaultClient);
    ModPageViewPageRequest modPageViewPageRequest = new ModPageViewPageRequest(); // ModPageViewPageRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modPageViewPage(modPageViewPageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModPageApi#modPageViewPage");
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
| **modPageViewPageRequest** | [**ModPageViewPageRequest**](ModPageViewPageRequest.md)|  | |

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

