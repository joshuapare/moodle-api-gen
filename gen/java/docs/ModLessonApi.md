# ModLessonApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modLessonFinishAttempt**](ModLessonApi.md#modLessonFinishAttempt) | **POST** /mod_lesson_finish_attempt | Finishes the current attempt. |
| [**modLessonGetAttemptsOverview**](ModLessonApi.md#modLessonGetAttemptsOverview) | **POST** /mod_lesson_get_attempts_overview | Get a list of all the attempts made by users in a lesson. |
| [**modLessonGetContentPagesViewed**](ModLessonApi.md#modLessonGetContentPagesViewed) | **POST** /mod_lesson_get_content_pages_viewed | Return the list of content pages viewed by a user during a lesson attempt. |
| [**modLessonGetLesson**](ModLessonApi.md#modLessonGetLesson) | **POST** /mod_lesson_get_lesson | Return information of a given lesson. |
| [**modLessonGetLessonAccessInformation**](ModLessonApi.md#modLessonGetLessonAccessInformation) | **POST** /mod_lesson_get_lesson_access_information | Return access information for a given lesson. |
| [**modLessonGetLessonsByCourses**](ModLessonApi.md#modLessonGetLessonsByCourses) | **POST** /mod_lesson_get_lessons_by_courses | Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned. |
| [**modLessonGetPageData**](ModLessonApi.md#modLessonGetPageData) | **POST** /mod_lesson_get_page_data | Return information of a given page, including its contents. |
| [**modLessonGetPages**](ModLessonApi.md#modLessonGetPages) | **POST** /mod_lesson_get_pages | Return the list of pages in a lesson (based on the user permissions). |
| [**modLessonGetPagesPossibleJumps**](ModLessonApi.md#modLessonGetPagesPossibleJumps) | **POST** /mod_lesson_get_pages_possible_jumps | Return all the possible jumps for the pages in a given lesson. |
| [**modLessonGetQuestionsAttempts**](ModLessonApi.md#modLessonGetQuestionsAttempts) | **POST** /mod_lesson_get_questions_attempts | Return the list of questions attempts in a given lesson. |
| [**modLessonGetUserAttempt**](ModLessonApi.md#modLessonGetUserAttempt) | **POST** /mod_lesson_get_user_attempt | Return information about the given user attempt (including answers). |
| [**modLessonGetUserAttemptGrade**](ModLessonApi.md#modLessonGetUserAttemptGrade) | **POST** /mod_lesson_get_user_attempt_grade | Return grade information in the attempt for a given user. |
| [**modLessonGetUserGrade**](ModLessonApi.md#modLessonGetUserGrade) | **POST** /mod_lesson_get_user_grade | Return the final grade in the lesson for the given user. |
| [**modLessonGetUserTimers**](ModLessonApi.md#modLessonGetUserTimers) | **POST** /mod_lesson_get_user_timers | Return the timers in the current lesson for the given user. |
| [**modLessonLaunchAttempt**](ModLessonApi.md#modLessonLaunchAttempt) | **POST** /mod_lesson_launch_attempt | Starts a new attempt or continues an existing one. |
| [**modLessonProcessPage**](ModLessonApi.md#modLessonProcessPage) | **POST** /mod_lesson_process_page | Processes page responses. |
| [**modLessonViewLesson**](ModLessonApi.md#modLessonViewLesson) | **POST** /mod_lesson_view_lesson | Trigger the course module viewed event and update the module completion status. |


<a id="modLessonFinishAttempt"></a>
# **modLessonFinishAttempt**
> ModLessonFinishAttempt200Response modLessonFinishAttempt(modLessonFinishAttemptRequest)

Finishes the current attempt.

Finishes the current attempt.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLessonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLessonApi apiInstance = new ModLessonApi(defaultClient);
    ModLessonFinishAttemptRequest modLessonFinishAttemptRequest = new ModLessonFinishAttemptRequest(); // ModLessonFinishAttemptRequest | 
    try {
      ModLessonFinishAttempt200Response result = apiInstance.modLessonFinishAttempt(modLessonFinishAttemptRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLessonApi#modLessonFinishAttempt");
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
| **modLessonFinishAttemptRequest** | [**ModLessonFinishAttemptRequest**](ModLessonFinishAttemptRequest.md)|  | |

### Return type

[**ModLessonFinishAttempt200Response**](ModLessonFinishAttempt200Response.md)

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

<a id="modLessonGetAttemptsOverview"></a>
# **modLessonGetAttemptsOverview**
> ModLessonGetAttemptsOverview200Response modLessonGetAttemptsOverview(modLessonGetAttemptsOverviewRequest)

Get a list of all the attempts made by users in a lesson.

Get a list of all the attempts made by users in a lesson.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLessonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLessonApi apiInstance = new ModLessonApi(defaultClient);
    ModLessonGetAttemptsOverviewRequest modLessonGetAttemptsOverviewRequest = new ModLessonGetAttemptsOverviewRequest(); // ModLessonGetAttemptsOverviewRequest | 
    try {
      ModLessonGetAttemptsOverview200Response result = apiInstance.modLessonGetAttemptsOverview(modLessonGetAttemptsOverviewRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLessonApi#modLessonGetAttemptsOverview");
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
| **modLessonGetAttemptsOverviewRequest** | [**ModLessonGetAttemptsOverviewRequest**](ModLessonGetAttemptsOverviewRequest.md)|  | |

### Return type

[**ModLessonGetAttemptsOverview200Response**](ModLessonGetAttemptsOverview200Response.md)

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

<a id="modLessonGetContentPagesViewed"></a>
# **modLessonGetContentPagesViewed**
> ModLessonGetContentPagesViewed200Response modLessonGetContentPagesViewed(modLessonGetContentPagesViewedRequest)

Return the list of content pages viewed by a user during a lesson attempt.

Return the list of content pages viewed by a user during a lesson attempt.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLessonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLessonApi apiInstance = new ModLessonApi(defaultClient);
    ModLessonGetContentPagesViewedRequest modLessonGetContentPagesViewedRequest = new ModLessonGetContentPagesViewedRequest(); // ModLessonGetContentPagesViewedRequest | 
    try {
      ModLessonGetContentPagesViewed200Response result = apiInstance.modLessonGetContentPagesViewed(modLessonGetContentPagesViewedRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLessonApi#modLessonGetContentPagesViewed");
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
| **modLessonGetContentPagesViewedRequest** | [**ModLessonGetContentPagesViewedRequest**](ModLessonGetContentPagesViewedRequest.md)|  | |

### Return type

[**ModLessonGetContentPagesViewed200Response**](ModLessonGetContentPagesViewed200Response.md)

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

<a id="modLessonGetLesson"></a>
# **modLessonGetLesson**
> ModLessonGetLesson200Response modLessonGetLesson(modLessonGetLessonRequest)

Return information of a given lesson.

Return information of a given lesson.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLessonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLessonApi apiInstance = new ModLessonApi(defaultClient);
    ModLessonGetLessonRequest modLessonGetLessonRequest = new ModLessonGetLessonRequest(); // ModLessonGetLessonRequest | 
    try {
      ModLessonGetLesson200Response result = apiInstance.modLessonGetLesson(modLessonGetLessonRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLessonApi#modLessonGetLesson");
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
| **modLessonGetLessonRequest** | [**ModLessonGetLessonRequest**](ModLessonGetLessonRequest.md)|  | |

### Return type

[**ModLessonGetLesson200Response**](ModLessonGetLesson200Response.md)

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

<a id="modLessonGetLessonAccessInformation"></a>
# **modLessonGetLessonAccessInformation**
> ModLessonGetLessonAccessInformation200Response modLessonGetLessonAccessInformation(modLessonGetLessonAccessInformationRequest)

Return access information for a given lesson.

Return access information for a given lesson.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLessonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLessonApi apiInstance = new ModLessonApi(defaultClient);
    ModLessonGetLessonAccessInformationRequest modLessonGetLessonAccessInformationRequest = new ModLessonGetLessonAccessInformationRequest(); // ModLessonGetLessonAccessInformationRequest | 
    try {
      ModLessonGetLessonAccessInformation200Response result = apiInstance.modLessonGetLessonAccessInformation(modLessonGetLessonAccessInformationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLessonApi#modLessonGetLessonAccessInformation");
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
| **modLessonGetLessonAccessInformationRequest** | [**ModLessonGetLessonAccessInformationRequest**](ModLessonGetLessonAccessInformationRequest.md)|  | |

### Return type

[**ModLessonGetLessonAccessInformation200Response**](ModLessonGetLessonAccessInformation200Response.md)

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

<a id="modLessonGetLessonsByCourses"></a>
# **modLessonGetLessonsByCourses**
> ModLessonGetLessonsByCourses200Response modLessonGetLessonsByCourses(modChatGetChatsByCoursesRequest)

Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.

Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLessonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLessonApi apiInstance = new ModLessonApi(defaultClient);
    ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 
    try {
      ModLessonGetLessonsByCourses200Response result = apiInstance.modLessonGetLessonsByCourses(modChatGetChatsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLessonApi#modLessonGetLessonsByCourses");
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

[**ModLessonGetLessonsByCourses200Response**](ModLessonGetLessonsByCourses200Response.md)

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

<a id="modLessonGetPageData"></a>
# **modLessonGetPageData**
> ModLessonGetPageData200Response modLessonGetPageData(modLessonGetPageDataRequest)

Return information of a given page, including its contents.

Return information of a given page, including its contents.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLessonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLessonApi apiInstance = new ModLessonApi(defaultClient);
    ModLessonGetPageDataRequest modLessonGetPageDataRequest = new ModLessonGetPageDataRequest(); // ModLessonGetPageDataRequest | 
    try {
      ModLessonGetPageData200Response result = apiInstance.modLessonGetPageData(modLessonGetPageDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLessonApi#modLessonGetPageData");
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
| **modLessonGetPageDataRequest** | [**ModLessonGetPageDataRequest**](ModLessonGetPageDataRequest.md)|  | |

### Return type

[**ModLessonGetPageData200Response**](ModLessonGetPageData200Response.md)

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

<a id="modLessonGetPages"></a>
# **modLessonGetPages**
> ModLessonGetPages200Response modLessonGetPages(modLessonGetPagesRequest)

Return the list of pages in a lesson (based on the user permissions).

Return the list of pages in a lesson (based on the user permissions).

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLessonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLessonApi apiInstance = new ModLessonApi(defaultClient);
    ModLessonGetPagesRequest modLessonGetPagesRequest = new ModLessonGetPagesRequest(); // ModLessonGetPagesRequest | 
    try {
      ModLessonGetPages200Response result = apiInstance.modLessonGetPages(modLessonGetPagesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLessonApi#modLessonGetPages");
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
| **modLessonGetPagesRequest** | [**ModLessonGetPagesRequest**](ModLessonGetPagesRequest.md)|  | |

### Return type

[**ModLessonGetPages200Response**](ModLessonGetPages200Response.md)

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

<a id="modLessonGetPagesPossibleJumps"></a>
# **modLessonGetPagesPossibleJumps**
> ModLessonGetPagesPossibleJumps200Response modLessonGetPagesPossibleJumps(modLessonGetLessonAccessInformationRequest)

Return all the possible jumps for the pages in a given lesson.

Return all the possible jumps for the pages in a given lesson.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLessonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLessonApi apiInstance = new ModLessonApi(defaultClient);
    ModLessonGetLessonAccessInformationRequest modLessonGetLessonAccessInformationRequest = new ModLessonGetLessonAccessInformationRequest(); // ModLessonGetLessonAccessInformationRequest | 
    try {
      ModLessonGetPagesPossibleJumps200Response result = apiInstance.modLessonGetPagesPossibleJumps(modLessonGetLessonAccessInformationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLessonApi#modLessonGetPagesPossibleJumps");
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
| **modLessonGetLessonAccessInformationRequest** | [**ModLessonGetLessonAccessInformationRequest**](ModLessonGetLessonAccessInformationRequest.md)|  | |

### Return type

[**ModLessonGetPagesPossibleJumps200Response**](ModLessonGetPagesPossibleJumps200Response.md)

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

<a id="modLessonGetQuestionsAttempts"></a>
# **modLessonGetQuestionsAttempts**
> ModLessonGetQuestionsAttempts200Response modLessonGetQuestionsAttempts(modLessonGetQuestionsAttemptsRequest)

Return the list of questions attempts in a given lesson.

Return the list of questions attempts in a given lesson.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLessonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLessonApi apiInstance = new ModLessonApi(defaultClient);
    ModLessonGetQuestionsAttemptsRequest modLessonGetQuestionsAttemptsRequest = new ModLessonGetQuestionsAttemptsRequest(); // ModLessonGetQuestionsAttemptsRequest | 
    try {
      ModLessonGetQuestionsAttempts200Response result = apiInstance.modLessonGetQuestionsAttempts(modLessonGetQuestionsAttemptsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLessonApi#modLessonGetQuestionsAttempts");
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
| **modLessonGetQuestionsAttemptsRequest** | [**ModLessonGetQuestionsAttemptsRequest**](ModLessonGetQuestionsAttemptsRequest.md)|  | |

### Return type

[**ModLessonGetQuestionsAttempts200Response**](ModLessonGetQuestionsAttempts200Response.md)

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

<a id="modLessonGetUserAttempt"></a>
# **modLessonGetUserAttempt**
> ModLessonGetUserAttempt200Response modLessonGetUserAttempt(modLessonGetUserAttemptRequest)

Return information about the given user attempt (including answers).

Return information about the given user attempt (including answers).

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLessonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLessonApi apiInstance = new ModLessonApi(defaultClient);
    ModLessonGetUserAttemptRequest modLessonGetUserAttemptRequest = new ModLessonGetUserAttemptRequest(); // ModLessonGetUserAttemptRequest | 
    try {
      ModLessonGetUserAttempt200Response result = apiInstance.modLessonGetUserAttempt(modLessonGetUserAttemptRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLessonApi#modLessonGetUserAttempt");
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
| **modLessonGetUserAttemptRequest** | [**ModLessonGetUserAttemptRequest**](ModLessonGetUserAttemptRequest.md)|  | |

### Return type

[**ModLessonGetUserAttempt200Response**](ModLessonGetUserAttempt200Response.md)

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

<a id="modLessonGetUserAttemptGrade"></a>
# **modLessonGetUserAttemptGrade**
> ModLessonGetUserAttemptGrade200Response modLessonGetUserAttemptGrade(modLessonGetUserAttemptGradeRequest)

Return grade information in the attempt for a given user.

Return grade information in the attempt for a given user.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLessonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLessonApi apiInstance = new ModLessonApi(defaultClient);
    ModLessonGetUserAttemptGradeRequest modLessonGetUserAttemptGradeRequest = new ModLessonGetUserAttemptGradeRequest(); // ModLessonGetUserAttemptGradeRequest | 
    try {
      ModLessonGetUserAttemptGrade200Response result = apiInstance.modLessonGetUserAttemptGrade(modLessonGetUserAttemptGradeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLessonApi#modLessonGetUserAttemptGrade");
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
| **modLessonGetUserAttemptGradeRequest** | [**ModLessonGetUserAttemptGradeRequest**](ModLessonGetUserAttemptGradeRequest.md)|  | |

### Return type

[**ModLessonGetUserAttemptGrade200Response**](ModLessonGetUserAttemptGrade200Response.md)

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

<a id="modLessonGetUserGrade"></a>
# **modLessonGetUserGrade**
> ModLessonGetUserGrade200Response modLessonGetUserGrade(modLessonGetUserGradeRequest)

Return the final grade in the lesson for the given user.

Return the final grade in the lesson for the given user.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLessonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLessonApi apiInstance = new ModLessonApi(defaultClient);
    ModLessonGetUserGradeRequest modLessonGetUserGradeRequest = new ModLessonGetUserGradeRequest(); // ModLessonGetUserGradeRequest | 
    try {
      ModLessonGetUserGrade200Response result = apiInstance.modLessonGetUserGrade(modLessonGetUserGradeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLessonApi#modLessonGetUserGrade");
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
| **modLessonGetUserGradeRequest** | [**ModLessonGetUserGradeRequest**](ModLessonGetUserGradeRequest.md)|  | |

### Return type

[**ModLessonGetUserGrade200Response**](ModLessonGetUserGrade200Response.md)

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

<a id="modLessonGetUserTimers"></a>
# **modLessonGetUserTimers**
> ModLessonGetUserTimers200Response modLessonGetUserTimers(modLessonGetUserGradeRequest)

Return the timers in the current lesson for the given user.

Return the timers in the current lesson for the given user.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLessonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLessonApi apiInstance = new ModLessonApi(defaultClient);
    ModLessonGetUserGradeRequest modLessonGetUserGradeRequest = new ModLessonGetUserGradeRequest(); // ModLessonGetUserGradeRequest | 
    try {
      ModLessonGetUserTimers200Response result = apiInstance.modLessonGetUserTimers(modLessonGetUserGradeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLessonApi#modLessonGetUserTimers");
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
| **modLessonGetUserGradeRequest** | [**ModLessonGetUserGradeRequest**](ModLessonGetUserGradeRequest.md)|  | |

### Return type

[**ModLessonGetUserTimers200Response**](ModLessonGetUserTimers200Response.md)

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

<a id="modLessonLaunchAttempt"></a>
# **modLessonLaunchAttempt**
> ModLessonLaunchAttempt200Response modLessonLaunchAttempt(modLessonLaunchAttemptRequest)

Starts a new attempt or continues an existing one.

Starts a new attempt or continues an existing one.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLessonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLessonApi apiInstance = new ModLessonApi(defaultClient);
    ModLessonLaunchAttemptRequest modLessonLaunchAttemptRequest = new ModLessonLaunchAttemptRequest(); // ModLessonLaunchAttemptRequest | 
    try {
      ModLessonLaunchAttempt200Response result = apiInstance.modLessonLaunchAttempt(modLessonLaunchAttemptRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLessonApi#modLessonLaunchAttempt");
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
| **modLessonLaunchAttemptRequest** | [**ModLessonLaunchAttemptRequest**](ModLessonLaunchAttemptRequest.md)|  | |

### Return type

[**ModLessonLaunchAttempt200Response**](ModLessonLaunchAttempt200Response.md)

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

<a id="modLessonProcessPage"></a>
# **modLessonProcessPage**
> ModLessonProcessPage200Response modLessonProcessPage(modLessonProcessPageRequest)

Processes page responses.

Processes page responses.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLessonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLessonApi apiInstance = new ModLessonApi(defaultClient);
    ModLessonProcessPageRequest modLessonProcessPageRequest = new ModLessonProcessPageRequest(); // ModLessonProcessPageRequest | 
    try {
      ModLessonProcessPage200Response result = apiInstance.modLessonProcessPage(modLessonProcessPageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLessonApi#modLessonProcessPage");
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
| **modLessonProcessPageRequest** | [**ModLessonProcessPageRequest**](ModLessonProcessPageRequest.md)|  | |

### Return type

[**ModLessonProcessPage200Response**](ModLessonProcessPage200Response.md)

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

<a id="modLessonViewLesson"></a>
# **modLessonViewLesson**
> CoreCalendarDeleteSubscription200Response modLessonViewLesson(modLessonGetLessonRequest)

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
import com.joshuapare.moodleclient.ModLessonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLessonApi apiInstance = new ModLessonApi(defaultClient);
    ModLessonGetLessonRequest modLessonGetLessonRequest = new ModLessonGetLessonRequest(); // ModLessonGetLessonRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modLessonViewLesson(modLessonGetLessonRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLessonApi#modLessonViewLesson");
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
| **modLessonGetLessonRequest** | [**ModLessonGetLessonRequest**](ModLessonGetLessonRequest.md)|  | |

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

