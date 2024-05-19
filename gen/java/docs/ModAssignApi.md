# ModAssignApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modAssignCopyPreviousAttempt**](ModAssignApi.md#modAssignCopyPreviousAttempt) | **POST** /mod_assign_copy_previous_attempt | Copy a students previous attempt to a new attempt. |
| [**modAssignGetAssignments**](ModAssignApi.md#modAssignGetAssignments) | **POST** /mod_assign_get_assignments | Returns the courses and assignments for the users capability |
| [**modAssignGetGrades**](ModAssignApi.md#modAssignGetGrades) | **POST** /mod_assign_get_grades | Returns grades from the assignment |
| [**modAssignGetParticipant**](ModAssignApi.md#modAssignGetParticipant) | **POST** /mod_assign_get_participant | Get a participant for an assignment, with some summary info about their submissions. |
| [**modAssignGetSubmissionStatus**](ModAssignApi.md#modAssignGetSubmissionStatus) | **POST** /mod_assign_get_submission_status | Returns information about an assignment submission status for a given user. |
| [**modAssignGetSubmissions**](ModAssignApi.md#modAssignGetSubmissions) | **POST** /mod_assign_get_submissions | Returns the submissions for assignments |
| [**modAssignGetUserFlags**](ModAssignApi.md#modAssignGetUserFlags) | **POST** /mod_assign_get_user_flags | Returns the user flags for assignments |
| [**modAssignGetUserMappings**](ModAssignApi.md#modAssignGetUserMappings) | **POST** /mod_assign_get_user_mappings | Returns the blind marking mappings for assignments |
| [**modAssignListParticipants**](ModAssignApi.md#modAssignListParticipants) | **POST** /mod_assign_list_participants | List the participants for a single assignment, with some summary info about their submissions. |
| [**modAssignLockSubmissions**](ModAssignApi.md#modAssignLockSubmissions) | **POST** /mod_assign_lock_submissions | Prevent students from making changes to a list of submissions |
| [**modAssignRevealIdentities**](ModAssignApi.md#modAssignRevealIdentities) | **POST** /mod_assign_reveal_identities | Reveal the identities for a blind marking assignment |
| [**modAssignRevertSubmissionsToDraft**](ModAssignApi.md#modAssignRevertSubmissionsToDraft) | **POST** /mod_assign_revert_submissions_to_draft | Reverts the list of submissions to draft status |
| [**modAssignSaveGrade**](ModAssignApi.md#modAssignSaveGrade) | **POST** /mod_assign_save_grade | Save a grade update for a single student. |
| [**modAssignSaveGrades**](ModAssignApi.md#modAssignSaveGrades) | **POST** /mod_assign_save_grades | Save multiple grade updates for an assignment. |
| [**modAssignSaveSubmission**](ModAssignApi.md#modAssignSaveSubmission) | **POST** /mod_assign_save_submission | Update the current students submission |
| [**modAssignSaveUserExtensions**](ModAssignApi.md#modAssignSaveUserExtensions) | **POST** /mod_assign_save_user_extensions | Save a list of assignment extensions |
| [**modAssignSetUserFlags**](ModAssignApi.md#modAssignSetUserFlags) | **POST** /mod_assign_set_user_flags | Creates or updates user flags |
| [**modAssignStartSubmission**](ModAssignApi.md#modAssignStartSubmission) | **POST** /mod_assign_start_submission | Start a submission for user if assignment has a time limit. |
| [**modAssignSubmitForGrading**](ModAssignApi.md#modAssignSubmitForGrading) | **POST** /mod_assign_submit_for_grading | Submit the current students assignment for grading |
| [**modAssignSubmitGradingForm**](ModAssignApi.md#modAssignSubmitGradingForm) | **POST** /mod_assign_submit_grading_form | Submit the grading form data via ajax |
| [**modAssignUnlockSubmissions**](ModAssignApi.md#modAssignUnlockSubmissions) | **POST** /mod_assign_unlock_submissions | Allow students to make changes to a list of submissions |
| [**modAssignViewAssign**](ModAssignApi.md#modAssignViewAssign) | **POST** /mod_assign_view_assign | Update the module completion status. |
| [**modAssignViewGradingTable**](ModAssignApi.md#modAssignViewGradingTable) | **POST** /mod_assign_view_grading_table | Trigger the grading_table_viewed event. |
| [**modAssignViewSubmissionStatus**](ModAssignApi.md#modAssignViewSubmissionStatus) | **POST** /mod_assign_view_submission_status | Trigger the submission status viewed event. |


<a id="modAssignCopyPreviousAttempt"></a>
# **modAssignCopyPreviousAttempt**
> Object modAssignCopyPreviousAttempt(modAssignCopyPreviousAttemptRequest)

Copy a students previous attempt to a new attempt.

Copy a students previous attempt to a new attempt.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignCopyPreviousAttemptRequest modAssignCopyPreviousAttemptRequest = new ModAssignCopyPreviousAttemptRequest(); // ModAssignCopyPreviousAttemptRequest | 
    try {
      Object result = apiInstance.modAssignCopyPreviousAttempt(modAssignCopyPreviousAttemptRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignCopyPreviousAttempt");
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
| **modAssignCopyPreviousAttemptRequest** | [**ModAssignCopyPreviousAttemptRequest**](ModAssignCopyPreviousAttemptRequest.md)|  | |

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
| **200** | list of warnings |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modAssignGetAssignments"></a>
# **modAssignGetAssignments**
> ModAssignGetAssignments200Response modAssignGetAssignments(modAssignGetAssignmentsRequest)

Returns the courses and assignments for the users capability

Returns the courses and assignments for the users capability

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignGetAssignmentsRequest modAssignGetAssignmentsRequest = new ModAssignGetAssignmentsRequest(); // ModAssignGetAssignmentsRequest | 
    try {
      ModAssignGetAssignments200Response result = apiInstance.modAssignGetAssignments(modAssignGetAssignmentsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignGetAssignments");
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
| **modAssignGetAssignmentsRequest** | [**ModAssignGetAssignmentsRequest**](ModAssignGetAssignmentsRequest.md)|  | |

### Return type

[**ModAssignGetAssignments200Response**](ModAssignGetAssignments200Response.md)

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

<a id="modAssignGetGrades"></a>
# **modAssignGetGrades**
> ModAssignGetGrades200Response modAssignGetGrades(modAssignGetGradesRequest)

Returns grades from the assignment

Returns grades from the assignment

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignGetGradesRequest modAssignGetGradesRequest = new ModAssignGetGradesRequest(); // ModAssignGetGradesRequest | 
    try {
      ModAssignGetGrades200Response result = apiInstance.modAssignGetGrades(modAssignGetGradesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignGetGrades");
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
| **modAssignGetGradesRequest** | [**ModAssignGetGradesRequest**](ModAssignGetGradesRequest.md)|  | |

### Return type

[**ModAssignGetGrades200Response**](ModAssignGetGrades200Response.md)

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

<a id="modAssignGetParticipant"></a>
# **modAssignGetParticipant**
> ModAssignGetParticipant200Response modAssignGetParticipant(modAssignGetParticipantRequest)

Get a participant for an assignment, with some summary info about their submissions.

Get a participant for an assignment, with some summary info about their submissions.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignGetParticipantRequest modAssignGetParticipantRequest = new ModAssignGetParticipantRequest(); // ModAssignGetParticipantRequest | 
    try {
      ModAssignGetParticipant200Response result = apiInstance.modAssignGetParticipant(modAssignGetParticipantRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignGetParticipant");
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
| **modAssignGetParticipantRequest** | [**ModAssignGetParticipantRequest**](ModAssignGetParticipantRequest.md)|  | |

### Return type

[**ModAssignGetParticipant200Response**](ModAssignGetParticipant200Response.md)

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

<a id="modAssignGetSubmissionStatus"></a>
# **modAssignGetSubmissionStatus**
> ModAssignGetSubmissionStatus200Response modAssignGetSubmissionStatus(modAssignGetSubmissionStatusRequest)

Returns information about an assignment submission status for a given user.

Returns information about an assignment submission status for a given user.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignGetSubmissionStatusRequest modAssignGetSubmissionStatusRequest = new ModAssignGetSubmissionStatusRequest(); // ModAssignGetSubmissionStatusRequest | 
    try {
      ModAssignGetSubmissionStatus200Response result = apiInstance.modAssignGetSubmissionStatus(modAssignGetSubmissionStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignGetSubmissionStatus");
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
| **modAssignGetSubmissionStatusRequest** | [**ModAssignGetSubmissionStatusRequest**](ModAssignGetSubmissionStatusRequest.md)|  | |

### Return type

[**ModAssignGetSubmissionStatus200Response**](ModAssignGetSubmissionStatus200Response.md)

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

<a id="modAssignGetSubmissions"></a>
# **modAssignGetSubmissions**
> ModAssignGetSubmissions200Response modAssignGetSubmissions(modAssignGetSubmissionsRequest)

Returns the submissions for assignments

Returns the submissions for assignments

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignGetSubmissionsRequest modAssignGetSubmissionsRequest = new ModAssignGetSubmissionsRequest(); // ModAssignGetSubmissionsRequest | 
    try {
      ModAssignGetSubmissions200Response result = apiInstance.modAssignGetSubmissions(modAssignGetSubmissionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignGetSubmissions");
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
| **modAssignGetSubmissionsRequest** | [**ModAssignGetSubmissionsRequest**](ModAssignGetSubmissionsRequest.md)|  | |

### Return type

[**ModAssignGetSubmissions200Response**](ModAssignGetSubmissions200Response.md)

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

<a id="modAssignGetUserFlags"></a>
# **modAssignGetUserFlags**
> ModAssignGetUserFlags200Response modAssignGetUserFlags(modAssignGetUserFlagsRequest)

Returns the user flags for assignments

Returns the user flags for assignments

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignGetUserFlagsRequest modAssignGetUserFlagsRequest = new ModAssignGetUserFlagsRequest(); // ModAssignGetUserFlagsRequest | 
    try {
      ModAssignGetUserFlags200Response result = apiInstance.modAssignGetUserFlags(modAssignGetUserFlagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignGetUserFlags");
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
| **modAssignGetUserFlagsRequest** | [**ModAssignGetUserFlagsRequest**](ModAssignGetUserFlagsRequest.md)|  | |

### Return type

[**ModAssignGetUserFlags200Response**](ModAssignGetUserFlags200Response.md)

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

<a id="modAssignGetUserMappings"></a>
# **modAssignGetUserMappings**
> ModAssignGetUserMappings200Response modAssignGetUserMappings(modAssignGetUserFlagsRequest)

Returns the blind marking mappings for assignments

Returns the blind marking mappings for assignments

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignGetUserFlagsRequest modAssignGetUserFlagsRequest = new ModAssignGetUserFlagsRequest(); // ModAssignGetUserFlagsRequest | 
    try {
      ModAssignGetUserMappings200Response result = apiInstance.modAssignGetUserMappings(modAssignGetUserFlagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignGetUserMappings");
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
| **modAssignGetUserFlagsRequest** | [**ModAssignGetUserFlagsRequest**](ModAssignGetUserFlagsRequest.md)|  | |

### Return type

[**ModAssignGetUserMappings200Response**](ModAssignGetUserMappings200Response.md)

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

<a id="modAssignListParticipants"></a>
# **modAssignListParticipants**
> Object modAssignListParticipants(modAssignListParticipantsRequest)

List the participants for a single assignment, with some summary info about their submissions.

List the participants for a single assignment, with some summary info about their submissions.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignListParticipantsRequest modAssignListParticipantsRequest = new ModAssignListParticipantsRequest(); // ModAssignListParticipantsRequest | 
    try {
      Object result = apiInstance.modAssignListParticipants(modAssignListParticipantsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignListParticipants");
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
| **modAssignListParticipantsRequest** | [**ModAssignListParticipantsRequest**](ModAssignListParticipantsRequest.md)|  | |

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

<a id="modAssignLockSubmissions"></a>
# **modAssignLockSubmissions**
> Object modAssignLockSubmissions(modAssignLockSubmissionsRequest)

Prevent students from making changes to a list of submissions

Prevent students from making changes to a list of submissions

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignLockSubmissionsRequest modAssignLockSubmissionsRequest = new ModAssignLockSubmissionsRequest(); // ModAssignLockSubmissionsRequest | 
    try {
      Object result = apiInstance.modAssignLockSubmissions(modAssignLockSubmissionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignLockSubmissions");
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
| **modAssignLockSubmissionsRequest** | [**ModAssignLockSubmissionsRequest**](ModAssignLockSubmissionsRequest.md)|  | |

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
| **200** | list of warnings |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modAssignRevealIdentities"></a>
# **modAssignRevealIdentities**
> Object modAssignRevealIdentities(modAssignRevealIdentitiesRequest)

Reveal the identities for a blind marking assignment

Reveal the identities for a blind marking assignment

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignRevealIdentitiesRequest modAssignRevealIdentitiesRequest = new ModAssignRevealIdentitiesRequest(); // ModAssignRevealIdentitiesRequest | 
    try {
      Object result = apiInstance.modAssignRevealIdentities(modAssignRevealIdentitiesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignRevealIdentities");
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
| **modAssignRevealIdentitiesRequest** | [**ModAssignRevealIdentitiesRequest**](ModAssignRevealIdentitiesRequest.md)|  | |

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
| **200** | list of warnings |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modAssignRevertSubmissionsToDraft"></a>
# **modAssignRevertSubmissionsToDraft**
> Object modAssignRevertSubmissionsToDraft(modAssignRevertSubmissionsToDraftRequest)

Reverts the list of submissions to draft status

Reverts the list of submissions to draft status

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignRevertSubmissionsToDraftRequest modAssignRevertSubmissionsToDraftRequest = new ModAssignRevertSubmissionsToDraftRequest(); // ModAssignRevertSubmissionsToDraftRequest | 
    try {
      Object result = apiInstance.modAssignRevertSubmissionsToDraft(modAssignRevertSubmissionsToDraftRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignRevertSubmissionsToDraft");
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
| **modAssignRevertSubmissionsToDraftRequest** | [**ModAssignRevertSubmissionsToDraftRequest**](ModAssignRevertSubmissionsToDraftRequest.md)|  | |

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
| **200** | list of warnings |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modAssignSaveGrade"></a>
# **modAssignSaveGrade**
> Object modAssignSaveGrade(modAssignSaveGradeRequest)

Save a grade update for a single student.

Save a grade update for a single student.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignSaveGradeRequest modAssignSaveGradeRequest = new ModAssignSaveGradeRequest(); // ModAssignSaveGradeRequest | 
    try {
      Object result = apiInstance.modAssignSaveGrade(modAssignSaveGradeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignSaveGrade");
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
| **modAssignSaveGradeRequest** | [**ModAssignSaveGradeRequest**](ModAssignSaveGradeRequest.md)|  | |

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

<a id="modAssignSaveGrades"></a>
# **modAssignSaveGrades**
> Object modAssignSaveGrades(modAssignSaveGradesRequest)

Save multiple grade updates for an assignment.

Save multiple grade updates for an assignment.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignSaveGradesRequest modAssignSaveGradesRequest = new ModAssignSaveGradesRequest(); // ModAssignSaveGradesRequest | 
    try {
      Object result = apiInstance.modAssignSaveGrades(modAssignSaveGradesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignSaveGrades");
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
| **modAssignSaveGradesRequest** | [**ModAssignSaveGradesRequest**](ModAssignSaveGradesRequest.md)|  | |

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

<a id="modAssignSaveSubmission"></a>
# **modAssignSaveSubmission**
> Object modAssignSaveSubmission(modAssignSaveSubmissionRequest)

Update the current students submission

Update the current students submission

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignSaveSubmissionRequest modAssignSaveSubmissionRequest = new ModAssignSaveSubmissionRequest(); // ModAssignSaveSubmissionRequest | 
    try {
      Object result = apiInstance.modAssignSaveSubmission(modAssignSaveSubmissionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignSaveSubmission");
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
| **modAssignSaveSubmissionRequest** | [**ModAssignSaveSubmissionRequest**](ModAssignSaveSubmissionRequest.md)|  | |

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
| **200** | list of warnings |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modAssignSaveUserExtensions"></a>
# **modAssignSaveUserExtensions**
> Object modAssignSaveUserExtensions(modAssignSaveUserExtensionsRequest)

Save a list of assignment extensions

Save a list of assignment extensions

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignSaveUserExtensionsRequest modAssignSaveUserExtensionsRequest = new ModAssignSaveUserExtensionsRequest(); // ModAssignSaveUserExtensionsRequest | 
    try {
      Object result = apiInstance.modAssignSaveUserExtensions(modAssignSaveUserExtensionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignSaveUserExtensions");
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
| **modAssignSaveUserExtensionsRequest** | [**ModAssignSaveUserExtensionsRequest**](ModAssignSaveUserExtensionsRequest.md)|  | |

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
| **200** | list of warnings |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modAssignSetUserFlags"></a>
# **modAssignSetUserFlags**
> Object modAssignSetUserFlags(modAssignSetUserFlagsRequest)

Creates or updates user flags

Creates or updates user flags

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignSetUserFlagsRequest modAssignSetUserFlagsRequest = new ModAssignSetUserFlagsRequest(); // ModAssignSetUserFlagsRequest | 
    try {
      Object result = apiInstance.modAssignSetUserFlags(modAssignSetUserFlagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignSetUserFlags");
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
| **modAssignSetUserFlagsRequest** | [**ModAssignSetUserFlagsRequest**](ModAssignSetUserFlagsRequest.md)|  | |

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

<a id="modAssignStartSubmission"></a>
# **modAssignStartSubmission**
> ModAssignStartSubmission200Response modAssignStartSubmission(modAssignStartSubmissionRequest)

Start a submission for user if assignment has a time limit.

Start a submission for user if assignment has a time limit.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignStartSubmissionRequest modAssignStartSubmissionRequest = new ModAssignStartSubmissionRequest(); // ModAssignStartSubmissionRequest | 
    try {
      ModAssignStartSubmission200Response result = apiInstance.modAssignStartSubmission(modAssignStartSubmissionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignStartSubmission");
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
| **modAssignStartSubmissionRequest** | [**ModAssignStartSubmissionRequest**](ModAssignStartSubmissionRequest.md)|  | |

### Return type

[**ModAssignStartSubmission200Response**](ModAssignStartSubmission200Response.md)

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

<a id="modAssignSubmitForGrading"></a>
# **modAssignSubmitForGrading**
> Object modAssignSubmitForGrading(modAssignSubmitForGradingRequest)

Submit the current students assignment for grading

Submit the current students assignment for grading

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignSubmitForGradingRequest modAssignSubmitForGradingRequest = new ModAssignSubmitForGradingRequest(); // ModAssignSubmitForGradingRequest | 
    try {
      Object result = apiInstance.modAssignSubmitForGrading(modAssignSubmitForGradingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignSubmitForGrading");
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
| **modAssignSubmitForGradingRequest** | [**ModAssignSubmitForGradingRequest**](ModAssignSubmitForGradingRequest.md)|  | |

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
| **200** | list of warnings |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modAssignSubmitGradingForm"></a>
# **modAssignSubmitGradingForm**
> Object modAssignSubmitGradingForm(modAssignSubmitGradingFormRequest)

Submit the grading form data via ajax

Submit the grading form data via ajax

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignSubmitGradingFormRequest modAssignSubmitGradingFormRequest = new ModAssignSubmitGradingFormRequest(); // ModAssignSubmitGradingFormRequest | 
    try {
      Object result = apiInstance.modAssignSubmitGradingForm(modAssignSubmitGradingFormRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignSubmitGradingForm");
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
| **modAssignSubmitGradingFormRequest** | [**ModAssignSubmitGradingFormRequest**](ModAssignSubmitGradingFormRequest.md)|  | |

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
| **200** | list of warnings |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modAssignUnlockSubmissions"></a>
# **modAssignUnlockSubmissions**
> Object modAssignUnlockSubmissions(modAssignRevertSubmissionsToDraftRequest)

Allow students to make changes to a list of submissions

Allow students to make changes to a list of submissions

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignRevertSubmissionsToDraftRequest modAssignRevertSubmissionsToDraftRequest = new ModAssignRevertSubmissionsToDraftRequest(); // ModAssignRevertSubmissionsToDraftRequest | 
    try {
      Object result = apiInstance.modAssignUnlockSubmissions(modAssignRevertSubmissionsToDraftRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignUnlockSubmissions");
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
| **modAssignRevertSubmissionsToDraftRequest** | [**ModAssignRevertSubmissionsToDraftRequest**](ModAssignRevertSubmissionsToDraftRequest.md)|  | |

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
| **200** | list of warnings |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="modAssignViewAssign"></a>
# **modAssignViewAssign**
> CoreCalendarDeleteSubscription200Response modAssignViewAssign(modAssignViewAssignRequest)

Update the module completion status.

Update the module completion status.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignViewAssignRequest modAssignViewAssignRequest = new ModAssignViewAssignRequest(); // ModAssignViewAssignRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modAssignViewAssign(modAssignViewAssignRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignViewAssign");
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
| **modAssignViewAssignRequest** | [**ModAssignViewAssignRequest**](ModAssignViewAssignRequest.md)|  | |

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

<a id="modAssignViewGradingTable"></a>
# **modAssignViewGradingTable**
> CoreCalendarDeleteSubscription200Response modAssignViewGradingTable(modAssignViewAssignRequest)

Trigger the grading_table_viewed event.

Trigger the grading_table_viewed event.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignViewAssignRequest modAssignViewAssignRequest = new ModAssignViewAssignRequest(); // ModAssignViewAssignRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modAssignViewGradingTable(modAssignViewAssignRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignViewGradingTable");
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
| **modAssignViewAssignRequest** | [**ModAssignViewAssignRequest**](ModAssignViewAssignRequest.md)|  | |

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

<a id="modAssignViewSubmissionStatus"></a>
# **modAssignViewSubmissionStatus**
> CoreCalendarDeleteSubscription200Response modAssignViewSubmissionStatus(modAssignViewAssignRequest)

Trigger the submission status viewed event.

Trigger the submission status viewed event.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModAssignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModAssignApi apiInstance = new ModAssignApi(defaultClient);
    ModAssignViewAssignRequest modAssignViewAssignRequest = new ModAssignViewAssignRequest(); // ModAssignViewAssignRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modAssignViewSubmissionStatus(modAssignViewAssignRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModAssignApi#modAssignViewSubmissionStatus");
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
| **modAssignViewAssignRequest** | [**ModAssignViewAssignRequest**](ModAssignViewAssignRequest.md)|  | |

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

