# ModBookApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modBookGetBooksByCourses**](ModBookApi.md#modBookGetBooksByCourses) | **POST** /mod_book_get_books_by_courses | Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned. |
| [**modBookViewBook**](ModBookApi.md#modBookViewBook) | **POST** /mod_book_view_book | Simulate the view.php web interface book: trigger events, completion, etc... |


<a id="modBookGetBooksByCourses"></a>
# **modBookGetBooksByCourses**
> ModBookGetBooksByCourses200Response modBookGetBooksByCourses(modBookGetBooksByCoursesRequest)

Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.

Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModBookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModBookApi apiInstance = new ModBookApi(defaultClient);
    ModBookGetBooksByCoursesRequest modBookGetBooksByCoursesRequest = new ModBookGetBooksByCoursesRequest(); // ModBookGetBooksByCoursesRequest | 
    try {
      ModBookGetBooksByCourses200Response result = apiInstance.modBookGetBooksByCourses(modBookGetBooksByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModBookApi#modBookGetBooksByCourses");
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
| **modBookGetBooksByCoursesRequest** | [**ModBookGetBooksByCoursesRequest**](ModBookGetBooksByCoursesRequest.md)|  | |

### Return type

[**ModBookGetBooksByCourses200Response**](ModBookGetBooksByCourses200Response.md)

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

<a id="modBookViewBook"></a>
# **modBookViewBook**
> CoreCalendarDeleteSubscription200Response modBookViewBook(modBookViewBookRequest)

Simulate the view.php web interface book: trigger events, completion, etc...

Simulate the view.php web interface book: trigger events, completion, etc...

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModBookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModBookApi apiInstance = new ModBookApi(defaultClient);
    ModBookViewBookRequest modBookViewBookRequest = new ModBookViewBookRequest(); // ModBookViewBookRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modBookViewBook(modBookViewBookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModBookApi#modBookViewBook");
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
| **modBookViewBookRequest** | [**ModBookViewBookRequest**](ModBookViewBookRequest.md)|  | |

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

