# ModFeedbackApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modFeedbackGetAnalysis**](ModFeedbackApi.md#modFeedbackGetAnalysis) | **POST** /mod_feedback_get_analysis | Retrieves the feedback analysis. |
| [**modFeedbackGetCurrentCompletedTmp**](ModFeedbackApi.md#modFeedbackGetCurrentCompletedTmp) | **POST** /mod_feedback_get_current_completed_tmp | Returns the temporary completion record for the current user. |
| [**modFeedbackGetFeedbackAccessInformation**](ModFeedbackApi.md#modFeedbackGetFeedbackAccessInformation) | **POST** /mod_feedback_get_feedback_access_information | Return access information for a given feedback. |
| [**modFeedbackGetFeedbacksByCourses**](ModFeedbackApi.md#modFeedbackGetFeedbacksByCourses) | **POST** /mod_feedback_get_feedbacks_by_courses | Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned. |
| [**modFeedbackGetFinishedResponses**](ModFeedbackApi.md#modFeedbackGetFinishedResponses) | **POST** /mod_feedback_get_finished_responses | Retrieves responses from the last finished attempt. |
| [**modFeedbackGetItems**](ModFeedbackApi.md#modFeedbackGetItems) | **POST** /mod_feedback_get_items | Returns the items (questions) in the given feedback. |
| [**modFeedbackGetLastCompleted**](ModFeedbackApi.md#modFeedbackGetLastCompleted) | **POST** /mod_feedback_get_last_completed | Retrieves the last completion record for the current user. |
| [**modFeedbackGetNonRespondents**](ModFeedbackApi.md#modFeedbackGetNonRespondents) | **POST** /mod_feedback_get_non_respondents | Retrieves a list of students who didn&#39;t submit the feedback. |
| [**modFeedbackGetPageItems**](ModFeedbackApi.md#modFeedbackGetPageItems) | **POST** /mod_feedback_get_page_items | Get a single feedback page items. |
| [**modFeedbackGetResponsesAnalysis**](ModFeedbackApi.md#modFeedbackGetResponsesAnalysis) | **POST** /mod_feedback_get_responses_analysis | Return the feedback user responses analysis. |
| [**modFeedbackGetUnfinishedResponses**](ModFeedbackApi.md#modFeedbackGetUnfinishedResponses) | **POST** /mod_feedback_get_unfinished_responses | Retrieves responses from the current unfinished attempt. |
| [**modFeedbackLaunchFeedback**](ModFeedbackApi.md#modFeedbackLaunchFeedback) | **POST** /mod_feedback_launch_feedback | Starts or continues a feedback submission. |
| [**modFeedbackProcessPage**](ModFeedbackApi.md#modFeedbackProcessPage) | **POST** /mod_feedback_process_page | Process a jump between pages. |
| [**modFeedbackViewFeedback**](ModFeedbackApi.md#modFeedbackViewFeedback) | **POST** /mod_feedback_view_feedback | Trigger the course module viewed event and update the module completion status. |


<a id="modFeedbackGetAnalysis"></a>
# **modFeedbackGetAnalysis**
> ModFeedbackGetAnalysis200Response modFeedbackGetAnalysis(modFeedbackGetAnalysisRequest)

Retrieves the feedback analysis.

Retrieves the feedback analysis.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModFeedbackApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModFeedbackApi apiInstance = new ModFeedbackApi(defaultClient);
    ModFeedbackGetAnalysisRequest modFeedbackGetAnalysisRequest = new ModFeedbackGetAnalysisRequest(); // ModFeedbackGetAnalysisRequest | 
    try {
      ModFeedbackGetAnalysis200Response result = apiInstance.modFeedbackGetAnalysis(modFeedbackGetAnalysisRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModFeedbackApi#modFeedbackGetAnalysis");
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
| **modFeedbackGetAnalysisRequest** | [**ModFeedbackGetAnalysisRequest**](ModFeedbackGetAnalysisRequest.md)|  | |

### Return type

[**ModFeedbackGetAnalysis200Response**](ModFeedbackGetAnalysis200Response.md)

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

<a id="modFeedbackGetCurrentCompletedTmp"></a>
# **modFeedbackGetCurrentCompletedTmp**
> ModFeedbackGetCurrentCompletedTmp200Response modFeedbackGetCurrentCompletedTmp(modFeedbackGetCurrentCompletedTmpRequest)

Returns the temporary completion record for the current user.

Returns the temporary completion record for the current user.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModFeedbackApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModFeedbackApi apiInstance = new ModFeedbackApi(defaultClient);
    ModFeedbackGetCurrentCompletedTmpRequest modFeedbackGetCurrentCompletedTmpRequest = new ModFeedbackGetCurrentCompletedTmpRequest(); // ModFeedbackGetCurrentCompletedTmpRequest | 
    try {
      ModFeedbackGetCurrentCompletedTmp200Response result = apiInstance.modFeedbackGetCurrentCompletedTmp(modFeedbackGetCurrentCompletedTmpRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModFeedbackApi#modFeedbackGetCurrentCompletedTmp");
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
| **modFeedbackGetCurrentCompletedTmpRequest** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md)|  | |

### Return type

[**ModFeedbackGetCurrentCompletedTmp200Response**](ModFeedbackGetCurrentCompletedTmp200Response.md)

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

<a id="modFeedbackGetFeedbackAccessInformation"></a>
# **modFeedbackGetFeedbackAccessInformation**
> ModFeedbackGetFeedbackAccessInformation200Response modFeedbackGetFeedbackAccessInformation(modFeedbackGetFeedbackAccessInformationRequest)

Return access information for a given feedback.

Return access information for a given feedback.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModFeedbackApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModFeedbackApi apiInstance = new ModFeedbackApi(defaultClient);
    ModFeedbackGetFeedbackAccessInformationRequest modFeedbackGetFeedbackAccessInformationRequest = new ModFeedbackGetFeedbackAccessInformationRequest(); // ModFeedbackGetFeedbackAccessInformationRequest | 
    try {
      ModFeedbackGetFeedbackAccessInformation200Response result = apiInstance.modFeedbackGetFeedbackAccessInformation(modFeedbackGetFeedbackAccessInformationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModFeedbackApi#modFeedbackGetFeedbackAccessInformation");
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
| **modFeedbackGetFeedbackAccessInformationRequest** | [**ModFeedbackGetFeedbackAccessInformationRequest**](ModFeedbackGetFeedbackAccessInformationRequest.md)|  | |

### Return type

[**ModFeedbackGetFeedbackAccessInformation200Response**](ModFeedbackGetFeedbackAccessInformation200Response.md)

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

<a id="modFeedbackGetFeedbacksByCourses"></a>
# **modFeedbackGetFeedbacksByCourses**
> ModFeedbackGetFeedbacksByCourses200Response modFeedbackGetFeedbacksByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest)

Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.

Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModFeedbackApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModFeedbackApi apiInstance = new ModFeedbackApi(defaultClient);
    ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = new ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 
    try {
      ModFeedbackGetFeedbacksByCourses200Response result = apiInstance.modFeedbackGetFeedbacksByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModFeedbackApi#modFeedbackGetFeedbacksByCourses");
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

[**ModFeedbackGetFeedbacksByCourses200Response**](ModFeedbackGetFeedbacksByCourses200Response.md)

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

<a id="modFeedbackGetFinishedResponses"></a>
# **modFeedbackGetFinishedResponses**
> ModFeedbackGetFinishedResponses200Response modFeedbackGetFinishedResponses(modFeedbackGetFinishedResponsesRequest)

Retrieves responses from the last finished attempt.

Retrieves responses from the last finished attempt.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModFeedbackApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModFeedbackApi apiInstance = new ModFeedbackApi(defaultClient);
    ModFeedbackGetFinishedResponsesRequest modFeedbackGetFinishedResponsesRequest = new ModFeedbackGetFinishedResponsesRequest(); // ModFeedbackGetFinishedResponsesRequest | 
    try {
      ModFeedbackGetFinishedResponses200Response result = apiInstance.modFeedbackGetFinishedResponses(modFeedbackGetFinishedResponsesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModFeedbackApi#modFeedbackGetFinishedResponses");
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
| **modFeedbackGetFinishedResponsesRequest** | [**ModFeedbackGetFinishedResponsesRequest**](ModFeedbackGetFinishedResponsesRequest.md)|  | |

### Return type

[**ModFeedbackGetFinishedResponses200Response**](ModFeedbackGetFinishedResponses200Response.md)

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

<a id="modFeedbackGetItems"></a>
# **modFeedbackGetItems**
> ModFeedbackGetItems200Response modFeedbackGetItems(modFeedbackGetCurrentCompletedTmpRequest)

Returns the items (questions) in the given feedback.

Returns the items (questions) in the given feedback.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModFeedbackApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModFeedbackApi apiInstance = new ModFeedbackApi(defaultClient);
    ModFeedbackGetCurrentCompletedTmpRequest modFeedbackGetCurrentCompletedTmpRequest = new ModFeedbackGetCurrentCompletedTmpRequest(); // ModFeedbackGetCurrentCompletedTmpRequest | 
    try {
      ModFeedbackGetItems200Response result = apiInstance.modFeedbackGetItems(modFeedbackGetCurrentCompletedTmpRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModFeedbackApi#modFeedbackGetItems");
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
| **modFeedbackGetCurrentCompletedTmpRequest** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md)|  | |

### Return type

[**ModFeedbackGetItems200Response**](ModFeedbackGetItems200Response.md)

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

<a id="modFeedbackGetLastCompleted"></a>
# **modFeedbackGetLastCompleted**
> ModFeedbackGetLastCompleted200Response modFeedbackGetLastCompleted(modFeedbackGetCurrentCompletedTmpRequest)

Retrieves the last completion record for the current user.

Retrieves the last completion record for the current user.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModFeedbackApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModFeedbackApi apiInstance = new ModFeedbackApi(defaultClient);
    ModFeedbackGetCurrentCompletedTmpRequest modFeedbackGetCurrentCompletedTmpRequest = new ModFeedbackGetCurrentCompletedTmpRequest(); // ModFeedbackGetCurrentCompletedTmpRequest | 
    try {
      ModFeedbackGetLastCompleted200Response result = apiInstance.modFeedbackGetLastCompleted(modFeedbackGetCurrentCompletedTmpRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModFeedbackApi#modFeedbackGetLastCompleted");
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
| **modFeedbackGetCurrentCompletedTmpRequest** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md)|  | |

### Return type

[**ModFeedbackGetLastCompleted200Response**](ModFeedbackGetLastCompleted200Response.md)

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

<a id="modFeedbackGetNonRespondents"></a>
# **modFeedbackGetNonRespondents**
> ModFeedbackGetNonRespondents200Response modFeedbackGetNonRespondents(modFeedbackGetNonRespondentsRequest)

Retrieves a list of students who didn&#39;t submit the feedback.

Retrieves a list of students who didn&#39;t submit the feedback.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModFeedbackApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModFeedbackApi apiInstance = new ModFeedbackApi(defaultClient);
    ModFeedbackGetNonRespondentsRequest modFeedbackGetNonRespondentsRequest = new ModFeedbackGetNonRespondentsRequest(); // ModFeedbackGetNonRespondentsRequest | 
    try {
      ModFeedbackGetNonRespondents200Response result = apiInstance.modFeedbackGetNonRespondents(modFeedbackGetNonRespondentsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModFeedbackApi#modFeedbackGetNonRespondents");
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
| **modFeedbackGetNonRespondentsRequest** | [**ModFeedbackGetNonRespondentsRequest**](ModFeedbackGetNonRespondentsRequest.md)|  | |

### Return type

[**ModFeedbackGetNonRespondents200Response**](ModFeedbackGetNonRespondents200Response.md)

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

<a id="modFeedbackGetPageItems"></a>
# **modFeedbackGetPageItems**
> ModFeedbackGetPageItems200Response modFeedbackGetPageItems(modFeedbackGetPageItemsRequest)

Get a single feedback page items.

Get a single feedback page items.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModFeedbackApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModFeedbackApi apiInstance = new ModFeedbackApi(defaultClient);
    ModFeedbackGetPageItemsRequest modFeedbackGetPageItemsRequest = new ModFeedbackGetPageItemsRequest(); // ModFeedbackGetPageItemsRequest | 
    try {
      ModFeedbackGetPageItems200Response result = apiInstance.modFeedbackGetPageItems(modFeedbackGetPageItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModFeedbackApi#modFeedbackGetPageItems");
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
| **modFeedbackGetPageItemsRequest** | [**ModFeedbackGetPageItemsRequest**](ModFeedbackGetPageItemsRequest.md)|  | |

### Return type

[**ModFeedbackGetPageItems200Response**](ModFeedbackGetPageItems200Response.md)

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

<a id="modFeedbackGetResponsesAnalysis"></a>
# **modFeedbackGetResponsesAnalysis**
> ModFeedbackGetResponsesAnalysis200Response modFeedbackGetResponsesAnalysis(modFeedbackGetResponsesAnalysisRequest)

Return the feedback user responses analysis.

Return the feedback user responses analysis.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModFeedbackApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModFeedbackApi apiInstance = new ModFeedbackApi(defaultClient);
    ModFeedbackGetResponsesAnalysisRequest modFeedbackGetResponsesAnalysisRequest = new ModFeedbackGetResponsesAnalysisRequest(); // ModFeedbackGetResponsesAnalysisRequest | 
    try {
      ModFeedbackGetResponsesAnalysis200Response result = apiInstance.modFeedbackGetResponsesAnalysis(modFeedbackGetResponsesAnalysisRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModFeedbackApi#modFeedbackGetResponsesAnalysis");
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
| **modFeedbackGetResponsesAnalysisRequest** | [**ModFeedbackGetResponsesAnalysisRequest**](ModFeedbackGetResponsesAnalysisRequest.md)|  | |

### Return type

[**ModFeedbackGetResponsesAnalysis200Response**](ModFeedbackGetResponsesAnalysis200Response.md)

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

<a id="modFeedbackGetUnfinishedResponses"></a>
# **modFeedbackGetUnfinishedResponses**
> ModFeedbackGetUnfinishedResponses200Response modFeedbackGetUnfinishedResponses(modFeedbackGetFinishedResponsesRequest)

Retrieves responses from the current unfinished attempt.

Retrieves responses from the current unfinished attempt.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModFeedbackApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModFeedbackApi apiInstance = new ModFeedbackApi(defaultClient);
    ModFeedbackGetFinishedResponsesRequest modFeedbackGetFinishedResponsesRequest = new ModFeedbackGetFinishedResponsesRequest(); // ModFeedbackGetFinishedResponsesRequest | 
    try {
      ModFeedbackGetUnfinishedResponses200Response result = apiInstance.modFeedbackGetUnfinishedResponses(modFeedbackGetFinishedResponsesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModFeedbackApi#modFeedbackGetUnfinishedResponses");
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
| **modFeedbackGetFinishedResponsesRequest** | [**ModFeedbackGetFinishedResponsesRequest**](ModFeedbackGetFinishedResponsesRequest.md)|  | |

### Return type

[**ModFeedbackGetUnfinishedResponses200Response**](ModFeedbackGetUnfinishedResponses200Response.md)

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

<a id="modFeedbackLaunchFeedback"></a>
# **modFeedbackLaunchFeedback**
> ModFeedbackLaunchFeedback200Response modFeedbackLaunchFeedback(modFeedbackGetCurrentCompletedTmpRequest)

Starts or continues a feedback submission.

Starts or continues a feedback submission.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModFeedbackApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModFeedbackApi apiInstance = new ModFeedbackApi(defaultClient);
    ModFeedbackGetCurrentCompletedTmpRequest modFeedbackGetCurrentCompletedTmpRequest = new ModFeedbackGetCurrentCompletedTmpRequest(); // ModFeedbackGetCurrentCompletedTmpRequest | 
    try {
      ModFeedbackLaunchFeedback200Response result = apiInstance.modFeedbackLaunchFeedback(modFeedbackGetCurrentCompletedTmpRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModFeedbackApi#modFeedbackLaunchFeedback");
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
| **modFeedbackGetCurrentCompletedTmpRequest** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md)|  | |

### Return type

[**ModFeedbackLaunchFeedback200Response**](ModFeedbackLaunchFeedback200Response.md)

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

<a id="modFeedbackProcessPage"></a>
# **modFeedbackProcessPage**
> ModFeedbackProcessPage200Response modFeedbackProcessPage(modFeedbackProcessPageRequest)

Process a jump between pages.

Process a jump between pages.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModFeedbackApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModFeedbackApi apiInstance = new ModFeedbackApi(defaultClient);
    ModFeedbackProcessPageRequest modFeedbackProcessPageRequest = new ModFeedbackProcessPageRequest(); // ModFeedbackProcessPageRequest | 
    try {
      ModFeedbackProcessPage200Response result = apiInstance.modFeedbackProcessPage(modFeedbackProcessPageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModFeedbackApi#modFeedbackProcessPage");
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
| **modFeedbackProcessPageRequest** | [**ModFeedbackProcessPageRequest**](ModFeedbackProcessPageRequest.md)|  | |

### Return type

[**ModFeedbackProcessPage200Response**](ModFeedbackProcessPage200Response.md)

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

<a id="modFeedbackViewFeedback"></a>
# **modFeedbackViewFeedback**
> CoreCalendarDeleteSubscription200Response modFeedbackViewFeedback(modFeedbackViewFeedbackRequest)

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
import com.joshuapare.moodleclient.ModFeedbackApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModFeedbackApi apiInstance = new ModFeedbackApi(defaultClient);
    ModFeedbackViewFeedbackRequest modFeedbackViewFeedbackRequest = new ModFeedbackViewFeedbackRequest(); // ModFeedbackViewFeedbackRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modFeedbackViewFeedback(modFeedbackViewFeedbackRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModFeedbackApi#modFeedbackViewFeedback");
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
| **modFeedbackViewFeedbackRequest** | [**ModFeedbackViewFeedbackRequest**](ModFeedbackViewFeedbackRequest.md)|  | |

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

