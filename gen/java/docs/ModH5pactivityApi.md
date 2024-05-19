# ModH5pactivityApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modH5pactivityGetAttempts**](ModH5pactivityApi.md#modH5pactivityGetAttempts) | **POST** /mod_h5pactivity_get_attempts | Return the information needed to list a user attempts. |
| [**modH5pactivityGetH5pactivitiesByCourses**](ModH5pactivityApi.md#modH5pactivityGetH5pactivitiesByCourses) | **POST** /mod_h5pactivity_get_h5pactivities_by_courses | Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned. |
| [**modH5pactivityGetH5pactivityAccessInformation**](ModH5pactivityApi.md#modH5pactivityGetH5pactivityAccessInformation) | **POST** /mod_h5pactivity_get_h5pactivity_access_information | Return access information for a given h5p activity. |
| [**modH5pactivityGetResults**](ModH5pactivityApi.md#modH5pactivityGetResults) | **POST** /mod_h5pactivity_get_results | Return the information needed to list a user attempt results. |
| [**modH5pactivityGetUserAttempts**](ModH5pactivityApi.md#modH5pactivityGetUserAttempts) | **POST** /mod_h5pactivity_get_user_attempts | Return the information needed to list all enrolled user attempts. |
| [**modH5pactivityLogReportViewed**](ModH5pactivityApi.md#modH5pactivityLogReportViewed) | **POST** /mod_h5pactivity_log_report_viewed | Log that the h5pactivity was viewed. |
| [**modH5pactivityViewH5pactivity**](ModH5pactivityApi.md#modH5pactivityViewH5pactivity) | **POST** /mod_h5pactivity_view_h5pactivity | Trigger the course module viewed event and update the module completion status. |


<a id="modH5pactivityGetAttempts"></a>
# **modH5pactivityGetAttempts**
> ModH5pactivityGetAttempts200Response modH5pactivityGetAttempts(modH5pactivityGetAttemptsRequest)

Return the information needed to list a user attempts.

Return the information needed to list a user attempts.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModH5pactivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModH5pactivityApi apiInstance = new ModH5pactivityApi(defaultClient);
    ModH5pactivityGetAttemptsRequest modH5pactivityGetAttemptsRequest = new ModH5pactivityGetAttemptsRequest(); // ModH5pactivityGetAttemptsRequest | 
    try {
      ModH5pactivityGetAttempts200Response result = apiInstance.modH5pactivityGetAttempts(modH5pactivityGetAttemptsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModH5pactivityApi#modH5pactivityGetAttempts");
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
| **modH5pactivityGetAttemptsRequest** | [**ModH5pactivityGetAttemptsRequest**](ModH5pactivityGetAttemptsRequest.md)|  | |

### Return type

[**ModH5pactivityGetAttempts200Response**](ModH5pactivityGetAttempts200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Activity attempts data |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modH5pactivityGetH5pactivitiesByCourses"></a>
# **modH5pactivityGetH5pactivitiesByCourses**
> ModH5pactivityGetH5pactivitiesByCourses200Response modH5pactivityGetH5pactivitiesByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest)

Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.

Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModH5pactivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModH5pactivityApi apiInstance = new ModH5pactivityApi(defaultClient);
    ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = new ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 
    try {
      ModH5pactivityGetH5pactivitiesByCourses200Response result = apiInstance.modH5pactivityGetH5pactivitiesByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModH5pactivityApi#modH5pactivityGetH5pactivitiesByCourses");
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

[**ModH5pactivityGetH5pactivitiesByCourses200Response**](ModH5pactivityGetH5pactivitiesByCourses200Response.md)

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

<a id="modH5pactivityGetH5pactivityAccessInformation"></a>
# **modH5pactivityGetH5pactivityAccessInformation**
> ModH5pactivityGetH5pactivityAccessInformation200Response modH5pactivityGetH5pactivityAccessInformation(modH5pactivityGetH5pactivityAccessInformationRequest)

Return access information for a given h5p activity.

Return access information for a given h5p activity.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModH5pactivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModH5pactivityApi apiInstance = new ModH5pactivityApi(defaultClient);
    ModH5pactivityGetH5pactivityAccessInformationRequest modH5pactivityGetH5pactivityAccessInformationRequest = new ModH5pactivityGetH5pactivityAccessInformationRequest(); // ModH5pactivityGetH5pactivityAccessInformationRequest | 
    try {
      ModH5pactivityGetH5pactivityAccessInformation200Response result = apiInstance.modH5pactivityGetH5pactivityAccessInformation(modH5pactivityGetH5pactivityAccessInformationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModH5pactivityApi#modH5pactivityGetH5pactivityAccessInformation");
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
| **modH5pactivityGetH5pactivityAccessInformationRequest** | [**ModH5pactivityGetH5pactivityAccessInformationRequest**](ModH5pactivityGetH5pactivityAccessInformationRequest.md)|  | |

### Return type

[**ModH5pactivityGetH5pactivityAccessInformation200Response**](ModH5pactivityGetH5pactivityAccessInformation200Response.md)

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

<a id="modH5pactivityGetResults"></a>
# **modH5pactivityGetResults**
> ModH5pactivityGetResults200Response modH5pactivityGetResults(modH5pactivityGetResultsRequest)

Return the information needed to list a user attempt results.

Return the information needed to list a user attempt results.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModH5pactivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModH5pactivityApi apiInstance = new ModH5pactivityApi(defaultClient);
    ModH5pactivityGetResultsRequest modH5pactivityGetResultsRequest = new ModH5pactivityGetResultsRequest(); // ModH5pactivityGetResultsRequest | 
    try {
      ModH5pactivityGetResults200Response result = apiInstance.modH5pactivityGetResults(modH5pactivityGetResultsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModH5pactivityApi#modH5pactivityGetResults");
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
| **modH5pactivityGetResultsRequest** | [**ModH5pactivityGetResultsRequest**](ModH5pactivityGetResultsRequest.md)|  | |

### Return type

[**ModH5pactivityGetResults200Response**](ModH5pactivityGetResults200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Activity attempts results data |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modH5pactivityGetUserAttempts"></a>
# **modH5pactivityGetUserAttempts**
> ModH5pactivityGetUserAttempts200Response modH5pactivityGetUserAttempts(modH5pactivityGetUserAttemptsRequest)

Return the information needed to list all enrolled user attempts.

Return the information needed to list all enrolled user attempts.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModH5pactivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModH5pactivityApi apiInstance = new ModH5pactivityApi(defaultClient);
    ModH5pactivityGetUserAttemptsRequest modH5pactivityGetUserAttemptsRequest = new ModH5pactivityGetUserAttemptsRequest(); // ModH5pactivityGetUserAttemptsRequest | 
    try {
      ModH5pactivityGetUserAttempts200Response result = apiInstance.modH5pactivityGetUserAttempts(modH5pactivityGetUserAttemptsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModH5pactivityApi#modH5pactivityGetUserAttempts");
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
| **modH5pactivityGetUserAttemptsRequest** | [**ModH5pactivityGetUserAttemptsRequest**](ModH5pactivityGetUserAttemptsRequest.md)|  | |

### Return type

[**ModH5pactivityGetUserAttempts200Response**](ModH5pactivityGetUserAttempts200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Activity attempts data |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modH5pactivityLogReportViewed"></a>
# **modH5pactivityLogReportViewed**
> CoreCalendarDeleteSubscription200Response modH5pactivityLogReportViewed(modH5pactivityLogReportViewedRequest)

Log that the h5pactivity was viewed.

Log that the h5pactivity was viewed.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModH5pactivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModH5pactivityApi apiInstance = new ModH5pactivityApi(defaultClient);
    ModH5pactivityLogReportViewedRequest modH5pactivityLogReportViewedRequest = new ModH5pactivityLogReportViewedRequest(); // ModH5pactivityLogReportViewedRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modH5pactivityLogReportViewed(modH5pactivityLogReportViewedRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModH5pactivityApi#modH5pactivityLogReportViewed");
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
| **modH5pactivityLogReportViewedRequest** | [**ModH5pactivityLogReportViewedRequest**](ModH5pactivityLogReportViewedRequest.md)|  | |

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

<a id="modH5pactivityViewH5pactivity"></a>
# **modH5pactivityViewH5pactivity**
> CoreCalendarDeleteSubscription200Response modH5pactivityViewH5pactivity(modH5pactivityViewH5pactivityRequest)

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
import com.joshuapare.moodleclient.ModH5pactivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModH5pactivityApi apiInstance = new ModH5pactivityApi(defaultClient);
    ModH5pactivityViewH5pactivityRequest modH5pactivityViewH5pactivityRequest = new ModH5pactivityViewH5pactivityRequest(); // ModH5pactivityViewH5pactivityRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modH5pactivityViewH5pactivity(modH5pactivityViewH5pactivityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModH5pactivityApi#modH5pactivityViewH5pactivity");
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
| **modH5pactivityViewH5pactivityRequest** | [**ModH5pactivityViewH5pactivityRequest**](ModH5pactivityViewH5pactivityRequest.md)|  | |

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

