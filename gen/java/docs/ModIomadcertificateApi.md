# ModIomadcertificateApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modIomadcertificateGetIomadcertificatesByCourses**](ModIomadcertificateApi.md#modIomadcertificateGetIomadcertificatesByCourses) | **POST** /mod_iomadcertificate_get_iomadcertificates_by_courses | Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned. |
| [**modIomadcertificateGetIssuedIomadcertificates**](ModIomadcertificateApi.md#modIomadcertificateGetIssuedIomadcertificates) | **POST** /mod_iomadcertificate_get_issued_iomadcertificates | Get the list of issued iomadcertificates for the current user. |
| [**modIomadcertificateIssueIomadcertificate**](ModIomadcertificateApi.md#modIomadcertificateIssueIomadcertificate) | **POST** /mod_iomadcertificate_issue_iomadcertificate | Create new iomadcertificate record, or return existing record for the current user. |
| [**modIomadcertificateViewIomadcertificate**](ModIomadcertificateApi.md#modIomadcertificateViewIomadcertificate) | **POST** /mod_iomadcertificate_view_iomadcertificate | Trigger the course module viewed event and update the module completion status. |


<a id="modIomadcertificateGetIomadcertificatesByCourses"></a>
# **modIomadcertificateGetIomadcertificatesByCourses**
> ModIomadcertificateGetIomadcertificatesByCourses200Response modIomadcertificateGetIomadcertificatesByCourses(modChatGetChatsByCoursesRequest)

Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.

Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModIomadcertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModIomadcertificateApi apiInstance = new ModIomadcertificateApi(defaultClient);
    ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 
    try {
      ModIomadcertificateGetIomadcertificatesByCourses200Response result = apiInstance.modIomadcertificateGetIomadcertificatesByCourses(modChatGetChatsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModIomadcertificateApi#modIomadcertificateGetIomadcertificatesByCourses");
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

[**ModIomadcertificateGetIomadcertificatesByCourses200Response**](ModIomadcertificateGetIomadcertificatesByCourses200Response.md)

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

<a id="modIomadcertificateGetIssuedIomadcertificates"></a>
# **modIomadcertificateGetIssuedIomadcertificates**
> ModIomadcertificateGetIssuedIomadcertificates200Response modIomadcertificateGetIssuedIomadcertificates(modIomadcertificateGetIssuedIomadcertificatesRequest)

Get the list of issued iomadcertificates for the current user.

Get the list of issued iomadcertificates for the current user.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModIomadcertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModIomadcertificateApi apiInstance = new ModIomadcertificateApi(defaultClient);
    ModIomadcertificateGetIssuedIomadcertificatesRequest modIomadcertificateGetIssuedIomadcertificatesRequest = new ModIomadcertificateGetIssuedIomadcertificatesRequest(); // ModIomadcertificateGetIssuedIomadcertificatesRequest | 
    try {
      ModIomadcertificateGetIssuedIomadcertificates200Response result = apiInstance.modIomadcertificateGetIssuedIomadcertificates(modIomadcertificateGetIssuedIomadcertificatesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModIomadcertificateApi#modIomadcertificateGetIssuedIomadcertificates");
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
| **modIomadcertificateGetIssuedIomadcertificatesRequest** | [**ModIomadcertificateGetIssuedIomadcertificatesRequest**](ModIomadcertificateGetIssuedIomadcertificatesRequest.md)|  | |

### Return type

[**ModIomadcertificateGetIssuedIomadcertificates200Response**](ModIomadcertificateGetIssuedIomadcertificates200Response.md)

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

<a id="modIomadcertificateIssueIomadcertificate"></a>
# **modIomadcertificateIssueIomadcertificate**
> ModIomadcertificateIssueIomadcertificate200Response modIomadcertificateIssueIomadcertificate(modIomadcertificateIssueIomadcertificateRequest)

Create new iomadcertificate record, or return existing record for the current user.

Create new iomadcertificate record, or return existing record for the current user.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModIomadcertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModIomadcertificateApi apiInstance = new ModIomadcertificateApi(defaultClient);
    ModIomadcertificateIssueIomadcertificateRequest modIomadcertificateIssueIomadcertificateRequest = new ModIomadcertificateIssueIomadcertificateRequest(); // ModIomadcertificateIssueIomadcertificateRequest | 
    try {
      ModIomadcertificateIssueIomadcertificate200Response result = apiInstance.modIomadcertificateIssueIomadcertificate(modIomadcertificateIssueIomadcertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModIomadcertificateApi#modIomadcertificateIssueIomadcertificate");
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
| **modIomadcertificateIssueIomadcertificateRequest** | [**ModIomadcertificateIssueIomadcertificateRequest**](ModIomadcertificateIssueIomadcertificateRequest.md)|  | |

### Return type

[**ModIomadcertificateIssueIomadcertificate200Response**](ModIomadcertificateIssueIomadcertificate200Response.md)

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

<a id="modIomadcertificateViewIomadcertificate"></a>
# **modIomadcertificateViewIomadcertificate**
> CoreCalendarDeleteSubscription200Response modIomadcertificateViewIomadcertificate(modIomadcertificateIssueIomadcertificateRequest)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModIomadcertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModIomadcertificateApi apiInstance = new ModIomadcertificateApi(defaultClient);
    ModIomadcertificateIssueIomadcertificateRequest modIomadcertificateIssueIomadcertificateRequest = new ModIomadcertificateIssueIomadcertificateRequest(); // ModIomadcertificateIssueIomadcertificateRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modIomadcertificateViewIomadcertificate(modIomadcertificateIssueIomadcertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModIomadcertificateApi#modIomadcertificateViewIomadcertificate");
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
| **modIomadcertificateIssueIomadcertificateRequest** | [**ModIomadcertificateIssueIomadcertificateRequest**](ModIomadcertificateIssueIomadcertificateRequest.md)|  | |

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

