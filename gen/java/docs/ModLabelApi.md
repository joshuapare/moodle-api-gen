# ModLabelApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modLabelGetLabelsByCourses**](ModLabelApi.md#modLabelGetLabelsByCourses) | **POST** /mod_label_get_labels_by_courses | Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned. |


<a id="modLabelGetLabelsByCourses"></a>
# **modLabelGetLabelsByCourses**
> ModLabelGetLabelsByCourses200Response modLabelGetLabelsByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest)

Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.

Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLabelApi apiInstance = new ModLabelApi(defaultClient);
    ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = new ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 
    try {
      ModLabelGetLabelsByCourses200Response result = apiInstance.modLabelGetLabelsByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLabelApi#modLabelGetLabelsByCourses");
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

[**ModLabelGetLabelsByCourses200Response**](ModLabelGetLabelsByCourses200Response.md)

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

