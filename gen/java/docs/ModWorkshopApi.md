# ModWorkshopApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modWorkshopAddSubmission**](ModWorkshopApi.md#modWorkshopAddSubmission) | **POST** /mod_workshop_add_submission | Add a new submission to a given workshop. |
| [**modWorkshopDeleteSubmission**](ModWorkshopApi.md#modWorkshopDeleteSubmission) | **POST** /mod_workshop_delete_submission | Deletes the given submission. |
| [**modWorkshopEvaluateAssessment**](ModWorkshopApi.md#modWorkshopEvaluateAssessment) | **POST** /mod_workshop_evaluate_assessment | Evaluates an assessment (used by teachers for provide feedback to the reviewer). |
| [**modWorkshopEvaluateSubmission**](ModWorkshopApi.md#modWorkshopEvaluateSubmission) | **POST** /mod_workshop_evaluate_submission | Evaluates a submission (used by teachers for provide feedback or override the submission grade). |
| [**modWorkshopGetAssessment**](ModWorkshopApi.md#modWorkshopGetAssessment) | **POST** /mod_workshop_get_assessment | Retrieves the given assessment. |
| [**modWorkshopGetAssessmentFormDefinition**](ModWorkshopApi.md#modWorkshopGetAssessmentFormDefinition) | **POST** /mod_workshop_get_assessment_form_definition | Retrieves the assessment form definition. |
| [**modWorkshopGetGrades**](ModWorkshopApi.md#modWorkshopGetGrades) | **POST** /mod_workshop_get_grades | Returns the assessment and submission grade for the given user. |
| [**modWorkshopGetGradesReport**](ModWorkshopApi.md#modWorkshopGetGradesReport) | **POST** /mod_workshop_get_grades_report | Retrieves the assessment grades report. |
| [**modWorkshopGetReviewerAssessments**](ModWorkshopApi.md#modWorkshopGetReviewerAssessments) | **POST** /mod_workshop_get_reviewer_assessments | Retrieves all the assessments reviewed by the given user. |
| [**modWorkshopGetSubmission**](ModWorkshopApi.md#modWorkshopGetSubmission) | **POST** /mod_workshop_get_submission | Retrieves the given submission. |
| [**modWorkshopGetSubmissionAssessments**](ModWorkshopApi.md#modWorkshopGetSubmissionAssessments) | **POST** /mod_workshop_get_submission_assessments | Retrieves all the assessments of the given submission. |
| [**modWorkshopGetSubmissions**](ModWorkshopApi.md#modWorkshopGetSubmissions) | **POST** /mod_workshop_get_submissions | Retrieves all the workshop submissions or the one done by the given user (except example submissions). |
| [**modWorkshopGetUserPlan**](ModWorkshopApi.md#modWorkshopGetUserPlan) | **POST** /mod_workshop_get_user_plan | Return the planner information for the given user. |
| [**modWorkshopGetWorkshopAccessInformation**](ModWorkshopApi.md#modWorkshopGetWorkshopAccessInformation) | **POST** /mod_workshop_get_workshop_access_information | Return access information for a given workshop. |
| [**modWorkshopGetWorkshopsByCourses**](ModWorkshopApi.md#modWorkshopGetWorkshopsByCourses) | **POST** /mod_workshop_get_workshops_by_courses | Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned. |
| [**modWorkshopUpdateAssessment**](ModWorkshopApi.md#modWorkshopUpdateAssessment) | **POST** /mod_workshop_update_assessment | Add information to an allocated assessment. |
| [**modWorkshopUpdateSubmission**](ModWorkshopApi.md#modWorkshopUpdateSubmission) | **POST** /mod_workshop_update_submission | Update the given submission. |
| [**modWorkshopViewSubmission**](ModWorkshopApi.md#modWorkshopViewSubmission) | **POST** /mod_workshop_view_submission | Trigger the submission viewed event. |
| [**modWorkshopViewWorkshop**](ModWorkshopApi.md#modWorkshopViewWorkshop) | **POST** /mod_workshop_view_workshop | Trigger the course module viewed event and update the module completion status. |


<a id="modWorkshopAddSubmission"></a>
# **modWorkshopAddSubmission**
> ModWorkshopAddSubmission200Response modWorkshopAddSubmission(modWorkshopAddSubmissionRequest)

Add a new submission to a given workshop.

Add a new submission to a given workshop.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModWorkshopAddSubmissionRequest modWorkshopAddSubmissionRequest = new ModWorkshopAddSubmissionRequest(); // ModWorkshopAddSubmissionRequest | 
    try {
      ModWorkshopAddSubmission200Response result = apiInstance.modWorkshopAddSubmission(modWorkshopAddSubmissionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopAddSubmission");
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
| **modWorkshopAddSubmissionRequest** | [**ModWorkshopAddSubmissionRequest**](ModWorkshopAddSubmissionRequest.md)|  | |

### Return type

[**ModWorkshopAddSubmission200Response**](ModWorkshopAddSubmission200Response.md)

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

<a id="modWorkshopDeleteSubmission"></a>
# **modWorkshopDeleteSubmission**
> ModWorkshopDeleteSubmission200Response modWorkshopDeleteSubmission(modWorkshopDeleteSubmissionRequest)

Deletes the given submission.

Deletes the given submission.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModWorkshopDeleteSubmissionRequest modWorkshopDeleteSubmissionRequest = new ModWorkshopDeleteSubmissionRequest(); // ModWorkshopDeleteSubmissionRequest | 
    try {
      ModWorkshopDeleteSubmission200Response result = apiInstance.modWorkshopDeleteSubmission(modWorkshopDeleteSubmissionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopDeleteSubmission");
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
| **modWorkshopDeleteSubmissionRequest** | [**ModWorkshopDeleteSubmissionRequest**](ModWorkshopDeleteSubmissionRequest.md)|  | |

### Return type

[**ModWorkshopDeleteSubmission200Response**](ModWorkshopDeleteSubmission200Response.md)

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

<a id="modWorkshopEvaluateAssessment"></a>
# **modWorkshopEvaluateAssessment**
> ModWorkshopEvaluateAssessment200Response modWorkshopEvaluateAssessment(modWorkshopEvaluateAssessmentRequest)

Evaluates an assessment (used by teachers for provide feedback to the reviewer).

Evaluates an assessment (used by teachers for provide feedback to the reviewer).

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModWorkshopEvaluateAssessmentRequest modWorkshopEvaluateAssessmentRequest = new ModWorkshopEvaluateAssessmentRequest(); // ModWorkshopEvaluateAssessmentRequest | 
    try {
      ModWorkshopEvaluateAssessment200Response result = apiInstance.modWorkshopEvaluateAssessment(modWorkshopEvaluateAssessmentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopEvaluateAssessment");
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
| **modWorkshopEvaluateAssessmentRequest** | [**ModWorkshopEvaluateAssessmentRequest**](ModWorkshopEvaluateAssessmentRequest.md)|  | |

### Return type

[**ModWorkshopEvaluateAssessment200Response**](ModWorkshopEvaluateAssessment200Response.md)

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

<a id="modWorkshopEvaluateSubmission"></a>
# **modWorkshopEvaluateSubmission**
> ModWorkshopEvaluateSubmission200Response modWorkshopEvaluateSubmission(modWorkshopEvaluateSubmissionRequest)

Evaluates a submission (used by teachers for provide feedback or override the submission grade).

Evaluates a submission (used by teachers for provide feedback or override the submission grade).

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModWorkshopEvaluateSubmissionRequest modWorkshopEvaluateSubmissionRequest = new ModWorkshopEvaluateSubmissionRequest(); // ModWorkshopEvaluateSubmissionRequest | 
    try {
      ModWorkshopEvaluateSubmission200Response result = apiInstance.modWorkshopEvaluateSubmission(modWorkshopEvaluateSubmissionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopEvaluateSubmission");
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
| **modWorkshopEvaluateSubmissionRequest** | [**ModWorkshopEvaluateSubmissionRequest**](ModWorkshopEvaluateSubmissionRequest.md)|  | |

### Return type

[**ModWorkshopEvaluateSubmission200Response**](ModWorkshopEvaluateSubmission200Response.md)

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

<a id="modWorkshopGetAssessment"></a>
# **modWorkshopGetAssessment**
> ModWorkshopGetAssessment200Response modWorkshopGetAssessment(modWorkshopGetAssessmentRequest)

Retrieves the given assessment.

Retrieves the given assessment.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModWorkshopGetAssessmentRequest modWorkshopGetAssessmentRequest = new ModWorkshopGetAssessmentRequest(); // ModWorkshopGetAssessmentRequest | 
    try {
      ModWorkshopGetAssessment200Response result = apiInstance.modWorkshopGetAssessment(modWorkshopGetAssessmentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopGetAssessment");
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
| **modWorkshopGetAssessmentRequest** | [**ModWorkshopGetAssessmentRequest**](ModWorkshopGetAssessmentRequest.md)|  | |

### Return type

[**ModWorkshopGetAssessment200Response**](ModWorkshopGetAssessment200Response.md)

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

<a id="modWorkshopGetAssessmentFormDefinition"></a>
# **modWorkshopGetAssessmentFormDefinition**
> ModWorkshopGetAssessmentFormDefinition200Response modWorkshopGetAssessmentFormDefinition(modWorkshopGetAssessmentFormDefinitionRequest)

Retrieves the assessment form definition.

Retrieves the assessment form definition.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModWorkshopGetAssessmentFormDefinitionRequest modWorkshopGetAssessmentFormDefinitionRequest = new ModWorkshopGetAssessmentFormDefinitionRequest(); // ModWorkshopGetAssessmentFormDefinitionRequest | 
    try {
      ModWorkshopGetAssessmentFormDefinition200Response result = apiInstance.modWorkshopGetAssessmentFormDefinition(modWorkshopGetAssessmentFormDefinitionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopGetAssessmentFormDefinition");
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
| **modWorkshopGetAssessmentFormDefinitionRequest** | [**ModWorkshopGetAssessmentFormDefinitionRequest**](ModWorkshopGetAssessmentFormDefinitionRequest.md)|  | |

### Return type

[**ModWorkshopGetAssessmentFormDefinition200Response**](ModWorkshopGetAssessmentFormDefinition200Response.md)

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

<a id="modWorkshopGetGrades"></a>
# **modWorkshopGetGrades**
> ModWorkshopGetGrades200Response modWorkshopGetGrades(modWorkshopGetGradesRequest)

Returns the assessment and submission grade for the given user.

Returns the assessment and submission grade for the given user.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModWorkshopGetGradesRequest modWorkshopGetGradesRequest = new ModWorkshopGetGradesRequest(); // ModWorkshopGetGradesRequest | 
    try {
      ModWorkshopGetGrades200Response result = apiInstance.modWorkshopGetGrades(modWorkshopGetGradesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopGetGrades");
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
| **modWorkshopGetGradesRequest** | [**ModWorkshopGetGradesRequest**](ModWorkshopGetGradesRequest.md)|  | |

### Return type

[**ModWorkshopGetGrades200Response**](ModWorkshopGetGrades200Response.md)

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

<a id="modWorkshopGetGradesReport"></a>
# **modWorkshopGetGradesReport**
> ModWorkshopGetGradesReport200Response modWorkshopGetGradesReport(modWorkshopGetGradesReportRequest)

Retrieves the assessment grades report.

Retrieves the assessment grades report.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModWorkshopGetGradesReportRequest modWorkshopGetGradesReportRequest = new ModWorkshopGetGradesReportRequest(); // ModWorkshopGetGradesReportRequest | 
    try {
      ModWorkshopGetGradesReport200Response result = apiInstance.modWorkshopGetGradesReport(modWorkshopGetGradesReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopGetGradesReport");
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
| **modWorkshopGetGradesReportRequest** | [**ModWorkshopGetGradesReportRequest**](ModWorkshopGetGradesReportRequest.md)|  | |

### Return type

[**ModWorkshopGetGradesReport200Response**](ModWorkshopGetGradesReport200Response.md)

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

<a id="modWorkshopGetReviewerAssessments"></a>
# **modWorkshopGetReviewerAssessments**
> ModWorkshopGetReviewerAssessments200Response modWorkshopGetReviewerAssessments(modWorkshopGetReviewerAssessmentsRequest)

Retrieves all the assessments reviewed by the given user.

Retrieves all the assessments reviewed by the given user.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModWorkshopGetReviewerAssessmentsRequest modWorkshopGetReviewerAssessmentsRequest = new ModWorkshopGetReviewerAssessmentsRequest(); // ModWorkshopGetReviewerAssessmentsRequest | 
    try {
      ModWorkshopGetReviewerAssessments200Response result = apiInstance.modWorkshopGetReviewerAssessments(modWorkshopGetReviewerAssessmentsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopGetReviewerAssessments");
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
| **modWorkshopGetReviewerAssessmentsRequest** | [**ModWorkshopGetReviewerAssessmentsRequest**](ModWorkshopGetReviewerAssessmentsRequest.md)|  | |

### Return type

[**ModWorkshopGetReviewerAssessments200Response**](ModWorkshopGetReviewerAssessments200Response.md)

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

<a id="modWorkshopGetSubmission"></a>
# **modWorkshopGetSubmission**
> ModWorkshopGetSubmission200Response modWorkshopGetSubmission(modWorkshopGetSubmissionRequest)

Retrieves the given submission.

Retrieves the given submission.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModWorkshopGetSubmissionRequest modWorkshopGetSubmissionRequest = new ModWorkshopGetSubmissionRequest(); // ModWorkshopGetSubmissionRequest | 
    try {
      ModWorkshopGetSubmission200Response result = apiInstance.modWorkshopGetSubmission(modWorkshopGetSubmissionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopGetSubmission");
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
| **modWorkshopGetSubmissionRequest** | [**ModWorkshopGetSubmissionRequest**](ModWorkshopGetSubmissionRequest.md)|  | |

### Return type

[**ModWorkshopGetSubmission200Response**](ModWorkshopGetSubmission200Response.md)

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

<a id="modWorkshopGetSubmissionAssessments"></a>
# **modWorkshopGetSubmissionAssessments**
> ModWorkshopGetReviewerAssessments200Response modWorkshopGetSubmissionAssessments(modWorkshopGetSubmissionRequest)

Retrieves all the assessments of the given submission.

Retrieves all the assessments of the given submission.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModWorkshopGetSubmissionRequest modWorkshopGetSubmissionRequest = new ModWorkshopGetSubmissionRequest(); // ModWorkshopGetSubmissionRequest | 
    try {
      ModWorkshopGetReviewerAssessments200Response result = apiInstance.modWorkshopGetSubmissionAssessments(modWorkshopGetSubmissionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopGetSubmissionAssessments");
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
| **modWorkshopGetSubmissionRequest** | [**ModWorkshopGetSubmissionRequest**](ModWorkshopGetSubmissionRequest.md)|  | |

### Return type

[**ModWorkshopGetReviewerAssessments200Response**](ModWorkshopGetReviewerAssessments200Response.md)

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

<a id="modWorkshopGetSubmissions"></a>
# **modWorkshopGetSubmissions**
> ModWorkshopGetSubmissions200Response modWorkshopGetSubmissions(modWorkshopGetSubmissionsRequest)

Retrieves all the workshop submissions or the one done by the given user (except example submissions).

Retrieves all the workshop submissions or the one done by the given user (except example submissions).

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModWorkshopGetSubmissionsRequest modWorkshopGetSubmissionsRequest = new ModWorkshopGetSubmissionsRequest(); // ModWorkshopGetSubmissionsRequest | 
    try {
      ModWorkshopGetSubmissions200Response result = apiInstance.modWorkshopGetSubmissions(modWorkshopGetSubmissionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopGetSubmissions");
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
| **modWorkshopGetSubmissionsRequest** | [**ModWorkshopGetSubmissionsRequest**](ModWorkshopGetSubmissionsRequest.md)|  | |

### Return type

[**ModWorkshopGetSubmissions200Response**](ModWorkshopGetSubmissions200Response.md)

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

<a id="modWorkshopGetUserPlan"></a>
# **modWorkshopGetUserPlan**
> ModWorkshopGetUserPlan200Response modWorkshopGetUserPlan(modWorkshopGetUserPlanRequest)

Return the planner information for the given user.

Return the planner information for the given user.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModWorkshopGetUserPlanRequest modWorkshopGetUserPlanRequest = new ModWorkshopGetUserPlanRequest(); // ModWorkshopGetUserPlanRequest | 
    try {
      ModWorkshopGetUserPlan200Response result = apiInstance.modWorkshopGetUserPlan(modWorkshopGetUserPlanRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopGetUserPlan");
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
| **modWorkshopGetUserPlanRequest** | [**ModWorkshopGetUserPlanRequest**](ModWorkshopGetUserPlanRequest.md)|  | |

### Return type

[**ModWorkshopGetUserPlan200Response**](ModWorkshopGetUserPlan200Response.md)

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

<a id="modWorkshopGetWorkshopAccessInformation"></a>
# **modWorkshopGetWorkshopAccessInformation**
> ModWorkshopGetWorkshopAccessInformation200Response modWorkshopGetWorkshopAccessInformation(modWorkshopGetWorkshopAccessInformationRequest)

Return access information for a given workshop.

Return access information for a given workshop.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModWorkshopGetWorkshopAccessInformationRequest modWorkshopGetWorkshopAccessInformationRequest = new ModWorkshopGetWorkshopAccessInformationRequest(); // ModWorkshopGetWorkshopAccessInformationRequest | 
    try {
      ModWorkshopGetWorkshopAccessInformation200Response result = apiInstance.modWorkshopGetWorkshopAccessInformation(modWorkshopGetWorkshopAccessInformationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopGetWorkshopAccessInformation");
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
| **modWorkshopGetWorkshopAccessInformationRequest** | [**ModWorkshopGetWorkshopAccessInformationRequest**](ModWorkshopGetWorkshopAccessInformationRequest.md)|  | |

### Return type

[**ModWorkshopGetWorkshopAccessInformation200Response**](ModWorkshopGetWorkshopAccessInformation200Response.md)

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

<a id="modWorkshopGetWorkshopsByCourses"></a>
# **modWorkshopGetWorkshopsByCourses**
> ModWorkshopGetWorkshopsByCourses200Response modWorkshopGetWorkshopsByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest)

Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.

Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = new ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 
    try {
      ModWorkshopGetWorkshopsByCourses200Response result = apiInstance.modWorkshopGetWorkshopsByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopGetWorkshopsByCourses");
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

[**ModWorkshopGetWorkshopsByCourses200Response**](ModWorkshopGetWorkshopsByCourses200Response.md)

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

<a id="modWorkshopUpdateAssessment"></a>
# **modWorkshopUpdateAssessment**
> ModWorkshopUpdateAssessment200Response modWorkshopUpdateAssessment(modWorkshopUpdateAssessmentRequest)

Add information to an allocated assessment.

Add information to an allocated assessment.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModWorkshopUpdateAssessmentRequest modWorkshopUpdateAssessmentRequest = new ModWorkshopUpdateAssessmentRequest(); // ModWorkshopUpdateAssessmentRequest | 
    try {
      ModWorkshopUpdateAssessment200Response result = apiInstance.modWorkshopUpdateAssessment(modWorkshopUpdateAssessmentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopUpdateAssessment");
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
| **modWorkshopUpdateAssessmentRequest** | [**ModWorkshopUpdateAssessmentRequest**](ModWorkshopUpdateAssessmentRequest.md)|  | |

### Return type

[**ModWorkshopUpdateAssessment200Response**](ModWorkshopUpdateAssessment200Response.md)

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

<a id="modWorkshopUpdateSubmission"></a>
# **modWorkshopUpdateSubmission**
> ModWorkshopUpdateSubmission200Response modWorkshopUpdateSubmission(modWorkshopUpdateSubmissionRequest)

Update the given submission.

Update the given submission.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModWorkshopUpdateSubmissionRequest modWorkshopUpdateSubmissionRequest = new ModWorkshopUpdateSubmissionRequest(); // ModWorkshopUpdateSubmissionRequest | 
    try {
      ModWorkshopUpdateSubmission200Response result = apiInstance.modWorkshopUpdateSubmission(modWorkshopUpdateSubmissionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopUpdateSubmission");
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
| **modWorkshopUpdateSubmissionRequest** | [**ModWorkshopUpdateSubmissionRequest**](ModWorkshopUpdateSubmissionRequest.md)|  | |

### Return type

[**ModWorkshopUpdateSubmission200Response**](ModWorkshopUpdateSubmission200Response.md)

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

<a id="modWorkshopViewSubmission"></a>
# **modWorkshopViewSubmission**
> CoreCalendarDeleteSubscription200Response modWorkshopViewSubmission(modWorkshopGetSubmissionRequest)

Trigger the submission viewed event.

Trigger the submission viewed event.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModWorkshopGetSubmissionRequest modWorkshopGetSubmissionRequest = new ModWorkshopGetSubmissionRequest(); // ModWorkshopGetSubmissionRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modWorkshopViewSubmission(modWorkshopGetSubmissionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopViewSubmission");
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
| **modWorkshopGetSubmissionRequest** | [**ModWorkshopGetSubmissionRequest**](ModWorkshopGetSubmissionRequest.md)|  | |

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

<a id="modWorkshopViewWorkshop"></a>
# **modWorkshopViewWorkshop**
> CoreCalendarDeleteSubscription200Response modWorkshopViewWorkshop(modWorkshopViewWorkshopRequest)

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
import com.joshuapare.moodleclient.ModWorkshopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWorkshopApi apiInstance = new ModWorkshopApi(defaultClient);
    ModWorkshopViewWorkshopRequest modWorkshopViewWorkshopRequest = new ModWorkshopViewWorkshopRequest(); // ModWorkshopViewWorkshopRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modWorkshopViewWorkshop(modWorkshopViewWorkshopRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWorkshopApi#modWorkshopViewWorkshop");
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
| **modWorkshopViewWorkshopRequest** | [**ModWorkshopViewWorkshopRequest**](ModWorkshopViewWorkshopRequest.md)|  | |

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

