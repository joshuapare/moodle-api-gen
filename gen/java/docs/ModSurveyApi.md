# ModSurveyApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modSurveyGetQuestions**](ModSurveyApi.md#modSurveyGetQuestions) | **POST** /mod_survey_get_questions | Get the complete list of questions for the survey, including subquestions. |
| [**modSurveyGetSurveysByCourses**](ModSurveyApi.md#modSurveyGetSurveysByCourses) | **POST** /mod_survey_get_surveys_by_courses | Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned. |
| [**modSurveySubmitAnswers**](ModSurveyApi.md#modSurveySubmitAnswers) | **POST** /mod_survey_submit_answers | Submit the answers for a given survey. |
| [**modSurveyViewSurvey**](ModSurveyApi.md#modSurveyViewSurvey) | **POST** /mod_survey_view_survey | Trigger the course module viewed event and update the module completion status. |


<a id="modSurveyGetQuestions"></a>
# **modSurveyGetQuestions**
> ModSurveyGetQuestions200Response modSurveyGetQuestions(modSurveyGetQuestionsRequest)

Get the complete list of questions for the survey, including subquestions.

Get the complete list of questions for the survey, including subquestions.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModSurveyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModSurveyApi apiInstance = new ModSurveyApi(defaultClient);
    ModSurveyGetQuestionsRequest modSurveyGetQuestionsRequest = new ModSurveyGetQuestionsRequest(); // ModSurveyGetQuestionsRequest | 
    try {
      ModSurveyGetQuestions200Response result = apiInstance.modSurveyGetQuestions(modSurveyGetQuestionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModSurveyApi#modSurveyGetQuestions");
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
| **modSurveyGetQuestionsRequest** | [**ModSurveyGetQuestionsRequest**](ModSurveyGetQuestionsRequest.md)|  | |

### Return type

[**ModSurveyGetQuestions200Response**](ModSurveyGetQuestions200Response.md)

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

<a id="modSurveyGetSurveysByCourses"></a>
# **modSurveyGetSurveysByCourses**
> ModSurveyGetSurveysByCourses200Response modSurveyGetSurveysByCourses(modChatGetChatsByCoursesRequest)

Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.

Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModSurveyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModSurveyApi apiInstance = new ModSurveyApi(defaultClient);
    ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 
    try {
      ModSurveyGetSurveysByCourses200Response result = apiInstance.modSurveyGetSurveysByCourses(modChatGetChatsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModSurveyApi#modSurveyGetSurveysByCourses");
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

[**ModSurveyGetSurveysByCourses200Response**](ModSurveyGetSurveysByCourses200Response.md)

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

<a id="modSurveySubmitAnswers"></a>
# **modSurveySubmitAnswers**
> CoreCalendarDeleteSubscription200Response modSurveySubmitAnswers(modSurveySubmitAnswersRequest)

Submit the answers for a given survey.

Submit the answers for a given survey.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModSurveyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModSurveyApi apiInstance = new ModSurveyApi(defaultClient);
    ModSurveySubmitAnswersRequest modSurveySubmitAnswersRequest = new ModSurveySubmitAnswersRequest(); // ModSurveySubmitAnswersRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modSurveySubmitAnswers(modSurveySubmitAnswersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModSurveyApi#modSurveySubmitAnswers");
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
| **modSurveySubmitAnswersRequest** | [**ModSurveySubmitAnswersRequest**](ModSurveySubmitAnswersRequest.md)|  | |

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

<a id="modSurveyViewSurvey"></a>
# **modSurveyViewSurvey**
> CoreCalendarDeleteSubscription200Response modSurveyViewSurvey(modSurveyViewSurveyRequest)

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
import com.joshuapare.moodleclient.ModSurveyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModSurveyApi apiInstance = new ModSurveyApi(defaultClient);
    ModSurveyViewSurveyRequest modSurveyViewSurveyRequest = new ModSurveyViewSurveyRequest(); // ModSurveyViewSurveyRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modSurveyViewSurvey(modSurveyViewSurveyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModSurveyApi#modSurveyViewSurvey");
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
| **modSurveyViewSurveyRequest** | [**ModSurveyViewSurveyRequest**](ModSurveyViewSurveyRequest.md)|  | |

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

