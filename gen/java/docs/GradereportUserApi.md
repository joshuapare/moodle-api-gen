# GradereportUserApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gradereportUserGetAccessInformation**](GradereportUserApi.md#gradereportUserGetAccessInformation) | **POST** /gradereport_user_get_access_information | Returns user access information for the user grade report. |
| [**gradereportUserGetGradeItems**](GradereportUserApi.md#gradereportUserGetGradeItems) | **POST** /gradereport_user_get_grade_items | Returns the complete list of grade items for users in a course |
| [**gradereportUserGetGradesTable**](GradereportUserApi.md#gradereportUserGetGradesTable) | **POST** /gradereport_user_get_grades_table | Get the user/s report grades table for a course |
| [**gradereportUserViewGradeReport**](GradereportUserApi.md#gradereportUserViewGradeReport) | **POST** /gradereport_user_view_grade_report | Trigger the report view event |


<a id="gradereportUserGetAccessInformation"></a>
# **gradereportUserGetAccessInformation**
> GradereportUserGetAccessInformation200Response gradereportUserGetAccessInformation(gradereportUserGetAccessInformationRequest)

Returns user access information for the user grade report.

Returns user access information for the user grade report.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.GradereportUserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    GradereportUserApi apiInstance = new GradereportUserApi(defaultClient);
    GradereportUserGetAccessInformationRequest gradereportUserGetAccessInformationRequest = new GradereportUserGetAccessInformationRequest(); // GradereportUserGetAccessInformationRequest | 
    try {
      GradereportUserGetAccessInformation200Response result = apiInstance.gradereportUserGetAccessInformation(gradereportUserGetAccessInformationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GradereportUserApi#gradereportUserGetAccessInformation");
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
| **gradereportUserGetAccessInformationRequest** | [**GradereportUserGetAccessInformationRequest**](GradereportUserGetAccessInformationRequest.md)|  | |

### Return type

[**GradereportUserGetAccessInformation200Response**](GradereportUserGetAccessInformation200Response.md)

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

<a id="gradereportUserGetGradeItems"></a>
# **gradereportUserGetGradeItems**
> GradereportUserGetGradeItems200Response gradereportUserGetGradeItems(gradereportUserGetGradeItemsRequest)

Returns the complete list of grade items for users in a course

Returns the complete list of grade items for users in a course

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.GradereportUserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    GradereportUserApi apiInstance = new GradereportUserApi(defaultClient);
    GradereportUserGetGradeItemsRequest gradereportUserGetGradeItemsRequest = new GradereportUserGetGradeItemsRequest(); // GradereportUserGetGradeItemsRequest | 
    try {
      GradereportUserGetGradeItems200Response result = apiInstance.gradereportUserGetGradeItems(gradereportUserGetGradeItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GradereportUserApi#gradereportUserGetGradeItems");
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
| **gradereportUserGetGradeItemsRequest** | [**GradereportUserGetGradeItemsRequest**](GradereportUserGetGradeItemsRequest.md)|  | |

### Return type

[**GradereportUserGetGradeItems200Response**](GradereportUserGetGradeItems200Response.md)

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

<a id="gradereportUserGetGradesTable"></a>
# **gradereportUserGetGradesTable**
> GradereportUserGetGradesTable200Response gradereportUserGetGradesTable(gradereportUserGetGradeItemsRequest)

Get the user/s report grades table for a course

Get the user/s report grades table for a course

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.GradereportUserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    GradereportUserApi apiInstance = new GradereportUserApi(defaultClient);
    GradereportUserGetGradeItemsRequest gradereportUserGetGradeItemsRequest = new GradereportUserGetGradeItemsRequest(); // GradereportUserGetGradeItemsRequest | 
    try {
      GradereportUserGetGradesTable200Response result = apiInstance.gradereportUserGetGradesTable(gradereportUserGetGradeItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GradereportUserApi#gradereportUserGetGradesTable");
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
| **gradereportUserGetGradeItemsRequest** | [**GradereportUserGetGradeItemsRequest**](GradereportUserGetGradeItemsRequest.md)|  | |

### Return type

[**GradereportUserGetGradesTable200Response**](GradereportUserGetGradesTable200Response.md)

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

<a id="gradereportUserViewGradeReport"></a>
# **gradereportUserViewGradeReport**
> CoreCalendarDeleteSubscription200Response gradereportUserViewGradeReport(gradereportOverviewViewGradeReportRequest)

Trigger the report view event

Trigger the report view event

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.GradereportUserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    GradereportUserApi apiInstance = new GradereportUserApi(defaultClient);
    GradereportOverviewViewGradeReportRequest gradereportOverviewViewGradeReportRequest = new GradereportOverviewViewGradeReportRequest(); // GradereportOverviewViewGradeReportRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.gradereportUserViewGradeReport(gradereportOverviewViewGradeReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GradereportUserApi#gradereportUserViewGradeReport");
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
| **gradereportOverviewViewGradeReportRequest** | [**GradereportOverviewViewGradeReportRequest**](GradereportOverviewViewGradeReportRequest.md)|  | |

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

