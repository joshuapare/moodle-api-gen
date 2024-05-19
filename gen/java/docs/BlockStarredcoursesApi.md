# BlockStarredcoursesApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**blockStarredcoursesGetStarredCourses**](BlockStarredcoursesApi.md#blockStarredcoursesGetStarredCourses) | **POST** /block_starredcourses_get_starred_courses | Get users starred courses. |


<a id="blockStarredcoursesGetStarredCourses"></a>
# **blockStarredcoursesGetStarredCourses**
> Object blockStarredcoursesGetStarredCourses(blockStarredcoursesGetStarredCoursesRequest)

Get users starred courses.

Get users starred courses.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockStarredcoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockStarredcoursesApi apiInstance = new BlockStarredcoursesApi(defaultClient);
    BlockStarredcoursesGetStarredCoursesRequest blockStarredcoursesGetStarredCoursesRequest = new BlockStarredcoursesGetStarredCoursesRequest(); // BlockStarredcoursesGetStarredCoursesRequest | 
    try {
      Object result = apiInstance.blockStarredcoursesGetStarredCourses(blockStarredcoursesGetStarredCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockStarredcoursesApi#blockStarredcoursesGetStarredCourses");
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
| **blockStarredcoursesGetStarredCoursesRequest** | [**BlockStarredcoursesGetStarredCoursesRequest**](BlockStarredcoursesGetStarredCoursesRequest.md)|  | |

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

