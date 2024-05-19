# ModFolderApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modFolderGetFoldersByCourses**](ModFolderApi.md#modFolderGetFoldersByCourses) | **POST** /mod_folder_get_folders_by_courses | Returns a list of folders in a provided list of courses, if no list is provided all folders that                             the user can view will be returned. Please note that this WS is not returning the folder contents. |
| [**modFolderViewFolder**](ModFolderApi.md#modFolderViewFolder) | **POST** /mod_folder_view_folder | Simulate the view.php web interface folder: trigger events, completion, etc... |


<a id="modFolderGetFoldersByCourses"></a>
# **modFolderGetFoldersByCourses**
> ModFolderGetFoldersByCourses200Response modFolderGetFoldersByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest)

Returns a list of folders in a provided list of courses, if no list is provided all folders that                             the user can view will be returned. Please note that this WS is not returning the folder contents.

Returns a list of folders in a provided list of courses, if no list is provided all folders that                             the user can view will be returned. Please note that this WS is not returning the folder contents.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModFolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModFolderApi apiInstance = new ModFolderApi(defaultClient);
    ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = new ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 
    try {
      ModFolderGetFoldersByCourses200Response result = apiInstance.modFolderGetFoldersByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModFolderApi#modFolderGetFoldersByCourses");
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

[**ModFolderGetFoldersByCourses200Response**](ModFolderGetFoldersByCourses200Response.md)

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

<a id="modFolderViewFolder"></a>
# **modFolderViewFolder**
> CoreCalendarDeleteSubscription200Response modFolderViewFolder(modFolderViewFolderRequest)

Simulate the view.php web interface folder: trigger events, completion, etc...

Simulate the view.php web interface folder: trigger events, completion, etc...

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModFolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModFolderApi apiInstance = new ModFolderApi(defaultClient);
    ModFolderViewFolderRequest modFolderViewFolderRequest = new ModFolderViewFolderRequest(); // ModFolderViewFolderRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modFolderViewFolder(modFolderViewFolderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModFolderApi#modFolderViewFolder");
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
| **modFolderViewFolderRequest** | [**ModFolderViewFolderRequest**](ModFolderViewFolderRequest.md)|  | |

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

