# ModQuizApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modQuizAddRandomQuestions**](ModQuizApi.md#modQuizAddRandomQuestions) | **POST** /mod_quiz_add_random_questions | Add a number of random questions to a quiz. |
| [**modQuizGetAttemptAccessInformation**](ModQuizApi.md#modQuizGetAttemptAccessInformation) | **POST** /mod_quiz_get_attempt_access_information | Return access information for a given attempt in a quiz. |
| [**modQuizGetAttemptData**](ModQuizApi.md#modQuizGetAttemptData) | **POST** /mod_quiz_get_attempt_data | Returns information for the given attempt page for a quiz attempt in progress. |
| [**modQuizGetAttemptReview**](ModQuizApi.md#modQuizGetAttemptReview) | **POST** /mod_quiz_get_attempt_review | Returns review information for the given finished attempt, can be used by users or teachers. |
| [**modQuizGetAttemptSummary**](ModQuizApi.md#modQuizGetAttemptSummary) | **POST** /mod_quiz_get_attempt_summary | Returns a summary of a quiz attempt before it is submitted. |
| [**modQuizGetCombinedReviewOptions**](ModQuizApi.md#modQuizGetCombinedReviewOptions) | **POST** /mod_quiz_get_combined_review_options | Combines the review options from a number of different quiz attempts. |
| [**modQuizGetQuizAccessInformation**](ModQuizApi.md#modQuizGetQuizAccessInformation) | **POST** /mod_quiz_get_quiz_access_information | Return access information for a given quiz. |
| [**modQuizGetQuizFeedbackForGrade**](ModQuizApi.md#modQuizGetQuizFeedbackForGrade) | **POST** /mod_quiz_get_quiz_feedback_for_grade | Get the feedback text that should be show to a student who got the given grade in the given quiz. |
| [**modQuizGetQuizRequiredQtypes**](ModQuizApi.md#modQuizGetQuizRequiredQtypes) | **POST** /mod_quiz_get_quiz_required_qtypes | Return the potential question types that would be required for a given quiz. |
| [**modQuizGetQuizzesByCourses**](ModQuizApi.md#modQuizGetQuizzesByCourses) | **POST** /mod_quiz_get_quizzes_by_courses | Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned. |
| [**modQuizGetReopenAttemptConfirmation**](ModQuizApi.md#modQuizGetReopenAttemptConfirmation) | **POST** /mod_quiz_get_reopen_attempt_confirmation | Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message. |
| [**modQuizGetUserAttempts**](ModQuizApi.md#modQuizGetUserAttempts) | **POST** /mod_quiz_get_user_attempts | Return a list of attempts for the given quiz and user. |
| [**modQuizGetUserBestGrade**](ModQuizApi.md#modQuizGetUserBestGrade) | **POST** /mod_quiz_get_user_best_grade | Get the best current grade for the given user on a quiz. |
| [**modQuizProcessAttempt**](ModQuizApi.md#modQuizProcessAttempt) | **POST** /mod_quiz_process_attempt | Process responses during an attempt at a quiz and also deals with attempts finishing. |
| [**modQuizReopenAttempt**](ModQuizApi.md#modQuizReopenAttempt) | **POST** /mod_quiz_reopen_attempt | Re-open an attempt that is currently in the never submitted state. |
| [**modQuizSaveAttempt**](ModQuizApi.md#modQuizSaveAttempt) | **POST** /mod_quiz_save_attempt | Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature. |
| [**modQuizSetQuestionVersion**](ModQuizApi.md#modQuizSetQuestionVersion) | **POST** /mod_quiz_set_question_version | Set the version of question that would be required for a given quiz. |
| [**modQuizStartAttempt**](ModQuizApi.md#modQuizStartAttempt) | **POST** /mod_quiz_start_attempt | Starts a new attempt at a quiz. |
| [**modQuizUpdateFilterCondition**](ModQuizApi.md#modQuizUpdateFilterCondition) | **POST** /mod_quiz_update_filter_condition | Update filter condition for a random question slot. |
| [**modQuizViewAttempt**](ModQuizApi.md#modQuizViewAttempt) | **POST** /mod_quiz_view_attempt | Trigger the attempt viewed event. |
| [**modQuizViewAttemptReview**](ModQuizApi.md#modQuizViewAttemptReview) | **POST** /mod_quiz_view_attempt_review | Trigger the attempt reviewed event. |
| [**modQuizViewAttemptSummary**](ModQuizApi.md#modQuizViewAttemptSummary) | **POST** /mod_quiz_view_attempt_summary | Trigger the attempt summary viewed event. |
| [**modQuizViewQuiz**](ModQuizApi.md#modQuizViewQuiz) | **POST** /mod_quiz_view_quiz | Trigger the course module viewed event and update the module completion status. |


<a id="modQuizAddRandomQuestions"></a>
# **modQuizAddRandomQuestions**
> ModQuizAddRandomQuestions200Response modQuizAddRandomQuestions(modQuizAddRandomQuestionsRequest)

Add a number of random questions to a quiz.

Add a number of random questions to a quiz.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizAddRandomQuestionsRequest modQuizAddRandomQuestionsRequest = new ModQuizAddRandomQuestionsRequest(); // ModQuizAddRandomQuestionsRequest | 
    try {
      ModQuizAddRandomQuestions200Response result = apiInstance.modQuizAddRandomQuestions(modQuizAddRandomQuestionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizAddRandomQuestions");
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
| **modQuizAddRandomQuestionsRequest** | [**ModQuizAddRandomQuestionsRequest**](ModQuizAddRandomQuestionsRequest.md)|  | |

### Return type

[**ModQuizAddRandomQuestions200Response**](ModQuizAddRandomQuestions200Response.md)

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

<a id="modQuizGetAttemptAccessInformation"></a>
# **modQuizGetAttemptAccessInformation**
> ModQuizGetAttemptAccessInformation200Response modQuizGetAttemptAccessInformation(modQuizGetAttemptAccessInformationRequest)

Return access information for a given attempt in a quiz.

Return access information for a given attempt in a quiz.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizGetAttemptAccessInformationRequest modQuizGetAttemptAccessInformationRequest = new ModQuizGetAttemptAccessInformationRequest(); // ModQuizGetAttemptAccessInformationRequest | 
    try {
      ModQuizGetAttemptAccessInformation200Response result = apiInstance.modQuizGetAttemptAccessInformation(modQuizGetAttemptAccessInformationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizGetAttemptAccessInformation");
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
| **modQuizGetAttemptAccessInformationRequest** | [**ModQuizGetAttemptAccessInformationRequest**](ModQuizGetAttemptAccessInformationRequest.md)|  | |

### Return type

[**ModQuizGetAttemptAccessInformation200Response**](ModQuizGetAttemptAccessInformation200Response.md)

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

<a id="modQuizGetAttemptData"></a>
# **modQuizGetAttemptData**
> ModQuizGetAttemptData200Response modQuizGetAttemptData(modQuizGetAttemptDataRequest)

Returns information for the given attempt page for a quiz attempt in progress.

Returns information for the given attempt page for a quiz attempt in progress.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizGetAttemptDataRequest modQuizGetAttemptDataRequest = new ModQuizGetAttemptDataRequest(); // ModQuizGetAttemptDataRequest | 
    try {
      ModQuizGetAttemptData200Response result = apiInstance.modQuizGetAttemptData(modQuizGetAttemptDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizGetAttemptData");
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
| **modQuizGetAttemptDataRequest** | [**ModQuizGetAttemptDataRequest**](ModQuizGetAttemptDataRequest.md)|  | |

### Return type

[**ModQuizGetAttemptData200Response**](ModQuizGetAttemptData200Response.md)

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

<a id="modQuizGetAttemptReview"></a>
# **modQuizGetAttemptReview**
> ModQuizGetAttemptReview200Response modQuizGetAttemptReview(modQuizGetAttemptReviewRequest)

Returns review information for the given finished attempt, can be used by users or teachers.

Returns review information for the given finished attempt, can be used by users or teachers.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizGetAttemptReviewRequest modQuizGetAttemptReviewRequest = new ModQuizGetAttemptReviewRequest(); // ModQuizGetAttemptReviewRequest | 
    try {
      ModQuizGetAttemptReview200Response result = apiInstance.modQuizGetAttemptReview(modQuizGetAttemptReviewRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizGetAttemptReview");
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
| **modQuizGetAttemptReviewRequest** | [**ModQuizGetAttemptReviewRequest**](ModQuizGetAttemptReviewRequest.md)|  | |

### Return type

[**ModQuizGetAttemptReview200Response**](ModQuizGetAttemptReview200Response.md)

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

<a id="modQuizGetAttemptSummary"></a>
# **modQuizGetAttemptSummary**
> ModQuizGetAttemptSummary200Response modQuizGetAttemptSummary(modQuizGetAttemptSummaryRequest)

Returns a summary of a quiz attempt before it is submitted.

Returns a summary of a quiz attempt before it is submitted.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizGetAttemptSummaryRequest modQuizGetAttemptSummaryRequest = new ModQuizGetAttemptSummaryRequest(); // ModQuizGetAttemptSummaryRequest | 
    try {
      ModQuizGetAttemptSummary200Response result = apiInstance.modQuizGetAttemptSummary(modQuizGetAttemptSummaryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizGetAttemptSummary");
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
| **modQuizGetAttemptSummaryRequest** | [**ModQuizGetAttemptSummaryRequest**](ModQuizGetAttemptSummaryRequest.md)|  | |

### Return type

[**ModQuizGetAttemptSummary200Response**](ModQuizGetAttemptSummary200Response.md)

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

<a id="modQuizGetCombinedReviewOptions"></a>
# **modQuizGetCombinedReviewOptions**
> ModQuizGetCombinedReviewOptions200Response modQuizGetCombinedReviewOptions(modQuizGetCombinedReviewOptionsRequest)

Combines the review options from a number of different quiz attempts.

Combines the review options from a number of different quiz attempts.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizGetCombinedReviewOptionsRequest modQuizGetCombinedReviewOptionsRequest = new ModQuizGetCombinedReviewOptionsRequest(); // ModQuizGetCombinedReviewOptionsRequest | 
    try {
      ModQuizGetCombinedReviewOptions200Response result = apiInstance.modQuizGetCombinedReviewOptions(modQuizGetCombinedReviewOptionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizGetCombinedReviewOptions");
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
| **modQuizGetCombinedReviewOptionsRequest** | [**ModQuizGetCombinedReviewOptionsRequest**](ModQuizGetCombinedReviewOptionsRequest.md)|  | |

### Return type

[**ModQuizGetCombinedReviewOptions200Response**](ModQuizGetCombinedReviewOptions200Response.md)

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

<a id="modQuizGetQuizAccessInformation"></a>
# **modQuizGetQuizAccessInformation**
> ModQuizGetQuizAccessInformation200Response modQuizGetQuizAccessInformation(modQuizGetQuizAccessInformationRequest)

Return access information for a given quiz.

Return access information for a given quiz.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizGetQuizAccessInformationRequest modQuizGetQuizAccessInformationRequest = new ModQuizGetQuizAccessInformationRequest(); // ModQuizGetQuizAccessInformationRequest | 
    try {
      ModQuizGetQuizAccessInformation200Response result = apiInstance.modQuizGetQuizAccessInformation(modQuizGetQuizAccessInformationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizGetQuizAccessInformation");
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
| **modQuizGetQuizAccessInformationRequest** | [**ModQuizGetQuizAccessInformationRequest**](ModQuizGetQuizAccessInformationRequest.md)|  | |

### Return type

[**ModQuizGetQuizAccessInformation200Response**](ModQuizGetQuizAccessInformation200Response.md)

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

<a id="modQuizGetQuizFeedbackForGrade"></a>
# **modQuizGetQuizFeedbackForGrade**
> ModQuizGetQuizFeedbackForGrade200Response modQuizGetQuizFeedbackForGrade(modQuizGetQuizFeedbackForGradeRequest)

Get the feedback text that should be show to a student who got the given grade in the given quiz.

Get the feedback text that should be show to a student who got the given grade in the given quiz.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizGetQuizFeedbackForGradeRequest modQuizGetQuizFeedbackForGradeRequest = new ModQuizGetQuizFeedbackForGradeRequest(); // ModQuizGetQuizFeedbackForGradeRequest | 
    try {
      ModQuizGetQuizFeedbackForGrade200Response result = apiInstance.modQuizGetQuizFeedbackForGrade(modQuizGetQuizFeedbackForGradeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizGetQuizFeedbackForGrade");
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
| **modQuizGetQuizFeedbackForGradeRequest** | [**ModQuizGetQuizFeedbackForGradeRequest**](ModQuizGetQuizFeedbackForGradeRequest.md)|  | |

### Return type

[**ModQuizGetQuizFeedbackForGrade200Response**](ModQuizGetQuizFeedbackForGrade200Response.md)

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

<a id="modQuizGetQuizRequiredQtypes"></a>
# **modQuizGetQuizRequiredQtypes**
> ModQuizGetQuizRequiredQtypes200Response modQuizGetQuizRequiredQtypes(modQuizGetQuizAccessInformationRequest)

Return the potential question types that would be required for a given quiz.

Return the potential question types that would be required for a given quiz.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizGetQuizAccessInformationRequest modQuizGetQuizAccessInformationRequest = new ModQuizGetQuizAccessInformationRequest(); // ModQuizGetQuizAccessInformationRequest | 
    try {
      ModQuizGetQuizRequiredQtypes200Response result = apiInstance.modQuizGetQuizRequiredQtypes(modQuizGetQuizAccessInformationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizGetQuizRequiredQtypes");
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
| **modQuizGetQuizAccessInformationRequest** | [**ModQuizGetQuizAccessInformationRequest**](ModQuizGetQuizAccessInformationRequest.md)|  | |

### Return type

[**ModQuizGetQuizRequiredQtypes200Response**](ModQuizGetQuizRequiredQtypes200Response.md)

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

<a id="modQuizGetQuizzesByCourses"></a>
# **modQuizGetQuizzesByCourses**
> ModQuizGetQuizzesByCourses200Response modQuizGetQuizzesByCourses(modChatGetChatsByCoursesRequest)

Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.

Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 
    try {
      ModQuizGetQuizzesByCourses200Response result = apiInstance.modQuizGetQuizzesByCourses(modChatGetChatsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizGetQuizzesByCourses");
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

[**ModQuizGetQuizzesByCourses200Response**](ModQuizGetQuizzesByCourses200Response.md)

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

<a id="modQuizGetReopenAttemptConfirmation"></a>
# **modQuizGetReopenAttemptConfirmation**
> Object modQuizGetReopenAttemptConfirmation(modQuizGetReopenAttemptConfirmationRequest)

Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.

Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizGetReopenAttemptConfirmationRequest modQuizGetReopenAttemptConfirmationRequest = new ModQuizGetReopenAttemptConfirmationRequest(); // ModQuizGetReopenAttemptConfirmationRequest | 
    try {
      Object result = apiInstance.modQuizGetReopenAttemptConfirmation(modQuizGetReopenAttemptConfirmationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizGetReopenAttemptConfirmation");
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
| **modQuizGetReopenAttemptConfirmationRequest** | [**ModQuizGetReopenAttemptConfirmationRequest**](ModQuizGetReopenAttemptConfirmationRequest.md)|  | |

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
| **200** | Confirmation to show the user before the attempt is reopened. |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modQuizGetUserAttempts"></a>
# **modQuizGetUserAttempts**
> ModQuizGetUserAttempts200Response modQuizGetUserAttempts(modQuizGetUserAttemptsRequest)

Return a list of attempts for the given quiz and user.

Return a list of attempts for the given quiz and user.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizGetUserAttemptsRequest modQuizGetUserAttemptsRequest = new ModQuizGetUserAttemptsRequest(); // ModQuizGetUserAttemptsRequest | 
    try {
      ModQuizGetUserAttempts200Response result = apiInstance.modQuizGetUserAttempts(modQuizGetUserAttemptsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizGetUserAttempts");
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
| **modQuizGetUserAttemptsRequest** | [**ModQuizGetUserAttemptsRequest**](ModQuizGetUserAttemptsRequest.md)|  | |

### Return type

[**ModQuizGetUserAttempts200Response**](ModQuizGetUserAttempts200Response.md)

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

<a id="modQuizGetUserBestGrade"></a>
# **modQuizGetUserBestGrade**
> ModQuizGetUserBestGrade200Response modQuizGetUserBestGrade(modQuizGetUserBestGradeRequest)

Get the best current grade for the given user on a quiz.

Get the best current grade for the given user on a quiz.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizGetUserBestGradeRequest modQuizGetUserBestGradeRequest = new ModQuizGetUserBestGradeRequest(); // ModQuizGetUserBestGradeRequest | 
    try {
      ModQuizGetUserBestGrade200Response result = apiInstance.modQuizGetUserBestGrade(modQuizGetUserBestGradeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizGetUserBestGrade");
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
| **modQuizGetUserBestGradeRequest** | [**ModQuizGetUserBestGradeRequest**](ModQuizGetUserBestGradeRequest.md)|  | |

### Return type

[**ModQuizGetUserBestGrade200Response**](ModQuizGetUserBestGrade200Response.md)

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

<a id="modQuizProcessAttempt"></a>
# **modQuizProcessAttempt**
> ModQuizProcessAttempt200Response modQuizProcessAttempt(modQuizProcessAttemptRequest)

Process responses during an attempt at a quiz and also deals with attempts finishing.

Process responses during an attempt at a quiz and also deals with attempts finishing.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizProcessAttemptRequest modQuizProcessAttemptRequest = new ModQuizProcessAttemptRequest(); // ModQuizProcessAttemptRequest | 
    try {
      ModQuizProcessAttempt200Response result = apiInstance.modQuizProcessAttempt(modQuizProcessAttemptRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizProcessAttempt");
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
| **modQuizProcessAttemptRequest** | [**ModQuizProcessAttemptRequest**](ModQuizProcessAttemptRequest.md)|  | |

### Return type

[**ModQuizProcessAttempt200Response**](ModQuizProcessAttempt200Response.md)

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

<a id="modQuizReopenAttempt"></a>
# **modQuizReopenAttempt**
> Object modQuizReopenAttempt(modQuizReopenAttemptRequest)

Re-open an attempt that is currently in the never submitted state.

Re-open an attempt that is currently in the never submitted state.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizReopenAttemptRequest modQuizReopenAttemptRequest = new ModQuizReopenAttemptRequest(); // ModQuizReopenAttemptRequest | 
    try {
      Object result = apiInstance.modQuizReopenAttempt(modQuizReopenAttemptRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizReopenAttempt");
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
| **modQuizReopenAttemptRequest** | [**ModQuizReopenAttemptRequest**](ModQuizReopenAttemptRequest.md)|  | |

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

<a id="modQuizSaveAttempt"></a>
# **modQuizSaveAttempt**
> CoreCalendarDeleteSubscription200Response modQuizSaveAttempt(modQuizSaveAttemptRequest)

Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.

Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizSaveAttemptRequest modQuizSaveAttemptRequest = new ModQuizSaveAttemptRequest(); // ModQuizSaveAttemptRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modQuizSaveAttempt(modQuizSaveAttemptRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizSaveAttempt");
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
| **modQuizSaveAttemptRequest** | [**ModQuizSaveAttemptRequest**](ModQuizSaveAttemptRequest.md)|  | |

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

<a id="modQuizSetQuestionVersion"></a>
# **modQuizSetQuestionVersion**
> ModQuizSetQuestionVersion200Response modQuizSetQuestionVersion(modQuizSetQuestionVersionRequest)

Set the version of question that would be required for a given quiz.

Set the version of question that would be required for a given quiz.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizSetQuestionVersionRequest modQuizSetQuestionVersionRequest = new ModQuizSetQuestionVersionRequest(); // ModQuizSetQuestionVersionRequest | 
    try {
      ModQuizSetQuestionVersion200Response result = apiInstance.modQuizSetQuestionVersion(modQuizSetQuestionVersionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizSetQuestionVersion");
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
| **modQuizSetQuestionVersionRequest** | [**ModQuizSetQuestionVersionRequest**](ModQuizSetQuestionVersionRequest.md)|  | |

### Return type

[**ModQuizSetQuestionVersion200Response**](ModQuizSetQuestionVersion200Response.md)

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

<a id="modQuizStartAttempt"></a>
# **modQuizStartAttempt**
> ModQuizStartAttempt200Response modQuizStartAttempt(modQuizStartAttemptRequest)

Starts a new attempt at a quiz.

Starts a new attempt at a quiz.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizStartAttemptRequest modQuizStartAttemptRequest = new ModQuizStartAttemptRequest(); // ModQuizStartAttemptRequest | 
    try {
      ModQuizStartAttempt200Response result = apiInstance.modQuizStartAttempt(modQuizStartAttemptRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizStartAttempt");
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
| **modQuizStartAttemptRequest** | [**ModQuizStartAttemptRequest**](ModQuizStartAttemptRequest.md)|  | |

### Return type

[**ModQuizStartAttempt200Response**](ModQuizStartAttempt200Response.md)

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

<a id="modQuizUpdateFilterCondition"></a>
# **modQuizUpdateFilterCondition**
> ModQuizAddRandomQuestions200Response modQuizUpdateFilterCondition(modQuizUpdateFilterConditionRequest)

Update filter condition for a random question slot.

Update filter condition for a random question slot.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizUpdateFilterConditionRequest modQuizUpdateFilterConditionRequest = new ModQuizUpdateFilterConditionRequest(); // ModQuizUpdateFilterConditionRequest | 
    try {
      ModQuizAddRandomQuestions200Response result = apiInstance.modQuizUpdateFilterCondition(modQuizUpdateFilterConditionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizUpdateFilterCondition");
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
| **modQuizUpdateFilterConditionRequest** | [**ModQuizUpdateFilterConditionRequest**](ModQuizUpdateFilterConditionRequest.md)|  | |

### Return type

[**ModQuizAddRandomQuestions200Response**](ModQuizAddRandomQuestions200Response.md)

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

<a id="modQuizViewAttempt"></a>
# **modQuizViewAttempt**
> CoreCalendarDeleteSubscription200Response modQuizViewAttempt(modQuizViewAttemptRequest)

Trigger the attempt viewed event.

Trigger the attempt viewed event.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizViewAttemptRequest modQuizViewAttemptRequest = new ModQuizViewAttemptRequest(); // ModQuizViewAttemptRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modQuizViewAttempt(modQuizViewAttemptRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizViewAttempt");
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
| **modQuizViewAttemptRequest** | [**ModQuizViewAttemptRequest**](ModQuizViewAttemptRequest.md)|  | |

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

<a id="modQuizViewAttemptReview"></a>
# **modQuizViewAttemptReview**
> CoreCalendarDeleteSubscription200Response modQuizViewAttemptReview(modQuizViewAttemptReviewRequest)

Trigger the attempt reviewed event.

Trigger the attempt reviewed event.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizViewAttemptReviewRequest modQuizViewAttemptReviewRequest = new ModQuizViewAttemptReviewRequest(); // ModQuizViewAttemptReviewRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modQuizViewAttemptReview(modQuizViewAttemptReviewRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizViewAttemptReview");
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
| **modQuizViewAttemptReviewRequest** | [**ModQuizViewAttemptReviewRequest**](ModQuizViewAttemptReviewRequest.md)|  | |

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

<a id="modQuizViewAttemptSummary"></a>
# **modQuizViewAttemptSummary**
> CoreCalendarDeleteSubscription200Response modQuizViewAttemptSummary(modQuizGetAttemptSummaryRequest)

Trigger the attempt summary viewed event.

Trigger the attempt summary viewed event.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizGetAttemptSummaryRequest modQuizGetAttemptSummaryRequest = new ModQuizGetAttemptSummaryRequest(); // ModQuizGetAttemptSummaryRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modQuizViewAttemptSummary(modQuizGetAttemptSummaryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizViewAttemptSummary");
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
| **modQuizGetAttemptSummaryRequest** | [**ModQuizGetAttemptSummaryRequest**](ModQuizGetAttemptSummaryRequest.md)|  | |

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

<a id="modQuizViewQuiz"></a>
# **modQuizViewQuiz**
> CoreCalendarDeleteSubscription200Response modQuizViewQuiz(modQuizGetQuizAccessInformationRequest)

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
import com.joshuapare.moodleclient.ModQuizApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModQuizApi apiInstance = new ModQuizApi(defaultClient);
    ModQuizGetQuizAccessInformationRequest modQuizGetQuizAccessInformationRequest = new ModQuizGetQuizAccessInformationRequest(); // ModQuizGetQuizAccessInformationRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modQuizViewQuiz(modQuizGetQuizAccessInformationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModQuizApi#modQuizViewQuiz");
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
| **modQuizGetQuizAccessInformationRequest** | [**ModQuizGetQuizAccessInformationRequest**](ModQuizGetQuizAccessInformationRequest.md)|  | |

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

