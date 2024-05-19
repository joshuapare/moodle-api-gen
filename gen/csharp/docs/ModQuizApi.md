# Org.OpenAPITools.Api.ModQuizApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModQuizAddRandomQuestions**](ModQuizApi.md#modquizaddrandomquestions) | **POST** /mod_quiz_add_random_questions | Add a number of random questions to a quiz. |
| [**ModQuizGetAttemptAccessInformation**](ModQuizApi.md#modquizgetattemptaccessinformation) | **POST** /mod_quiz_get_attempt_access_information | Return access information for a given attempt in a quiz. |
| [**ModQuizGetAttemptData**](ModQuizApi.md#modquizgetattemptdata) | **POST** /mod_quiz_get_attempt_data | Returns information for the given attempt page for a quiz attempt in progress. |
| [**ModQuizGetAttemptReview**](ModQuizApi.md#modquizgetattemptreview) | **POST** /mod_quiz_get_attempt_review | Returns review information for the given finished attempt, can be used by users or teachers. |
| [**ModQuizGetAttemptSummary**](ModQuizApi.md#modquizgetattemptsummary) | **POST** /mod_quiz_get_attempt_summary | Returns a summary of a quiz attempt before it is submitted. |
| [**ModQuizGetCombinedReviewOptions**](ModQuizApi.md#modquizgetcombinedreviewoptions) | **POST** /mod_quiz_get_combined_review_options | Combines the review options from a number of different quiz attempts. |
| [**ModQuizGetQuizAccessInformation**](ModQuizApi.md#modquizgetquizaccessinformation) | **POST** /mod_quiz_get_quiz_access_information | Return access information for a given quiz. |
| [**ModQuizGetQuizFeedbackForGrade**](ModQuizApi.md#modquizgetquizfeedbackforgrade) | **POST** /mod_quiz_get_quiz_feedback_for_grade | Get the feedback text that should be show to a student who got the given grade in the given quiz. |
| [**ModQuizGetQuizRequiredQtypes**](ModQuizApi.md#modquizgetquizrequiredqtypes) | **POST** /mod_quiz_get_quiz_required_qtypes | Return the potential question types that would be required for a given quiz. |
| [**ModQuizGetQuizzesByCourses**](ModQuizApi.md#modquizgetquizzesbycourses) | **POST** /mod_quiz_get_quizzes_by_courses | Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned. |
| [**ModQuizGetReopenAttemptConfirmation**](ModQuizApi.md#modquizgetreopenattemptconfirmation) | **POST** /mod_quiz_get_reopen_attempt_confirmation | Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message. |
| [**ModQuizGetUserAttempts**](ModQuizApi.md#modquizgetuserattempts) | **POST** /mod_quiz_get_user_attempts | Return a list of attempts for the given quiz and user. |
| [**ModQuizGetUserBestGrade**](ModQuizApi.md#modquizgetuserbestgrade) | **POST** /mod_quiz_get_user_best_grade | Get the best current grade for the given user on a quiz. |
| [**ModQuizProcessAttempt**](ModQuizApi.md#modquizprocessattempt) | **POST** /mod_quiz_process_attempt | Process responses during an attempt at a quiz and also deals with attempts finishing. |
| [**ModQuizReopenAttempt**](ModQuizApi.md#modquizreopenattempt) | **POST** /mod_quiz_reopen_attempt | Re-open an attempt that is currently in the never submitted state. |
| [**ModQuizSaveAttempt**](ModQuizApi.md#modquizsaveattempt) | **POST** /mod_quiz_save_attempt | Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature. |
| [**ModQuizSetQuestionVersion**](ModQuizApi.md#modquizsetquestionversion) | **POST** /mod_quiz_set_question_version | Set the version of question that would be required for a given quiz. |
| [**ModQuizStartAttempt**](ModQuizApi.md#modquizstartattempt) | **POST** /mod_quiz_start_attempt | Starts a new attempt at a quiz. |
| [**ModQuizUpdateFilterCondition**](ModQuizApi.md#modquizupdatefiltercondition) | **POST** /mod_quiz_update_filter_condition | Update filter condition for a random question slot. |
| [**ModQuizViewAttempt**](ModQuizApi.md#modquizviewattempt) | **POST** /mod_quiz_view_attempt | Trigger the attempt viewed event. |
| [**ModQuizViewAttemptReview**](ModQuizApi.md#modquizviewattemptreview) | **POST** /mod_quiz_view_attempt_review | Trigger the attempt reviewed event. |
| [**ModQuizViewAttemptSummary**](ModQuizApi.md#modquizviewattemptsummary) | **POST** /mod_quiz_view_attempt_summary | Trigger the attempt summary viewed event. |
| [**ModQuizViewQuiz**](ModQuizApi.md#modquizviewquiz) | **POST** /mod_quiz_view_quiz | Trigger the course module viewed event and update the module completion status. |

<a id="modquizaddrandomquestions"></a>
# **ModQuizAddRandomQuestions**
> ModQuizAddRandomQuestions200Response ModQuizAddRandomQuestions (ModQuizAddRandomQuestionsRequest modQuizAddRandomQuestionsRequest)

Add a number of random questions to a quiz.

Add a number of random questions to a quiz.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizAddRandomQuestionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizAddRandomQuestionsRequest = new ModQuizAddRandomQuestionsRequest(); // ModQuizAddRandomQuestionsRequest | 

            try
            {
                // Add a number of random questions to a quiz.
                ModQuizAddRandomQuestions200Response result = apiInstance.ModQuizAddRandomQuestions(modQuizAddRandomQuestionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizAddRandomQuestions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizAddRandomQuestionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Add a number of random questions to a quiz.
    ApiResponse<ModQuizAddRandomQuestions200Response> response = apiInstance.ModQuizAddRandomQuestionsWithHttpInfo(modQuizAddRandomQuestionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizAddRandomQuestionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizAddRandomQuestionsRequest** | [**ModQuizAddRandomQuestionsRequest**](ModQuizAddRandomQuestionsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizgetattemptaccessinformation"></a>
# **ModQuizGetAttemptAccessInformation**
> ModQuizGetAttemptAccessInformation200Response ModQuizGetAttemptAccessInformation (ModQuizGetAttemptAccessInformationRequest modQuizGetAttemptAccessInformationRequest)

Return access information for a given attempt in a quiz.

Return access information for a given attempt in a quiz.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizGetAttemptAccessInformationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizGetAttemptAccessInformationRequest = new ModQuizGetAttemptAccessInformationRequest(); // ModQuizGetAttemptAccessInformationRequest | 

            try
            {
                // Return access information for a given attempt in a quiz.
                ModQuizGetAttemptAccessInformation200Response result = apiInstance.ModQuizGetAttemptAccessInformation(modQuizGetAttemptAccessInformationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizGetAttemptAccessInformation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizGetAttemptAccessInformationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return access information for a given attempt in a quiz.
    ApiResponse<ModQuizGetAttemptAccessInformation200Response> response = apiInstance.ModQuizGetAttemptAccessInformationWithHttpInfo(modQuizGetAttemptAccessInformationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizGetAttemptAccessInformationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizGetAttemptAccessInformationRequest** | [**ModQuizGetAttemptAccessInformationRequest**](ModQuizGetAttemptAccessInformationRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizgetattemptdata"></a>
# **ModQuizGetAttemptData**
> ModQuizGetAttemptData200Response ModQuizGetAttemptData (ModQuizGetAttemptDataRequest modQuizGetAttemptDataRequest)

Returns information for the given attempt page for a quiz attempt in progress.

Returns information for the given attempt page for a quiz attempt in progress.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizGetAttemptDataExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizGetAttemptDataRequest = new ModQuizGetAttemptDataRequest(); // ModQuizGetAttemptDataRequest | 

            try
            {
                // Returns information for the given attempt page for a quiz attempt in progress.
                ModQuizGetAttemptData200Response result = apiInstance.ModQuizGetAttemptData(modQuizGetAttemptDataRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizGetAttemptData: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizGetAttemptDataWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns information for the given attempt page for a quiz attempt in progress.
    ApiResponse<ModQuizGetAttemptData200Response> response = apiInstance.ModQuizGetAttemptDataWithHttpInfo(modQuizGetAttemptDataRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizGetAttemptDataWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizGetAttemptDataRequest** | [**ModQuizGetAttemptDataRequest**](ModQuizGetAttemptDataRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizgetattemptreview"></a>
# **ModQuizGetAttemptReview**
> ModQuizGetAttemptReview200Response ModQuizGetAttemptReview (ModQuizGetAttemptReviewRequest modQuizGetAttemptReviewRequest)

Returns review information for the given finished attempt, can be used by users or teachers.

Returns review information for the given finished attempt, can be used by users or teachers.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizGetAttemptReviewExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizGetAttemptReviewRequest = new ModQuizGetAttemptReviewRequest(); // ModQuizGetAttemptReviewRequest | 

            try
            {
                // Returns review information for the given finished attempt, can be used by users or teachers.
                ModQuizGetAttemptReview200Response result = apiInstance.ModQuizGetAttemptReview(modQuizGetAttemptReviewRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizGetAttemptReview: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizGetAttemptReviewWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns review information for the given finished attempt, can be used by users or teachers.
    ApiResponse<ModQuizGetAttemptReview200Response> response = apiInstance.ModQuizGetAttemptReviewWithHttpInfo(modQuizGetAttemptReviewRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizGetAttemptReviewWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizGetAttemptReviewRequest** | [**ModQuizGetAttemptReviewRequest**](ModQuizGetAttemptReviewRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizgetattemptsummary"></a>
# **ModQuizGetAttemptSummary**
> ModQuizGetAttemptSummary200Response ModQuizGetAttemptSummary (ModQuizGetAttemptSummaryRequest modQuizGetAttemptSummaryRequest)

Returns a summary of a quiz attempt before it is submitted.

Returns a summary of a quiz attempt before it is submitted.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizGetAttemptSummaryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizGetAttemptSummaryRequest = new ModQuizGetAttemptSummaryRequest(); // ModQuizGetAttemptSummaryRequest | 

            try
            {
                // Returns a summary of a quiz attempt before it is submitted.
                ModQuizGetAttemptSummary200Response result = apiInstance.ModQuizGetAttemptSummary(modQuizGetAttemptSummaryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizGetAttemptSummary: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizGetAttemptSummaryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a summary of a quiz attempt before it is submitted.
    ApiResponse<ModQuizGetAttemptSummary200Response> response = apiInstance.ModQuizGetAttemptSummaryWithHttpInfo(modQuizGetAttemptSummaryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizGetAttemptSummaryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizGetAttemptSummaryRequest** | [**ModQuizGetAttemptSummaryRequest**](ModQuizGetAttemptSummaryRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizgetcombinedreviewoptions"></a>
# **ModQuizGetCombinedReviewOptions**
> ModQuizGetCombinedReviewOptions200Response ModQuizGetCombinedReviewOptions (ModQuizGetCombinedReviewOptionsRequest modQuizGetCombinedReviewOptionsRequest)

Combines the review options from a number of different quiz attempts.

Combines the review options from a number of different quiz attempts.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizGetCombinedReviewOptionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizGetCombinedReviewOptionsRequest = new ModQuizGetCombinedReviewOptionsRequest(); // ModQuizGetCombinedReviewOptionsRequest | 

            try
            {
                // Combines the review options from a number of different quiz attempts.
                ModQuizGetCombinedReviewOptions200Response result = apiInstance.ModQuizGetCombinedReviewOptions(modQuizGetCombinedReviewOptionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizGetCombinedReviewOptions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizGetCombinedReviewOptionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Combines the review options from a number of different quiz attempts.
    ApiResponse<ModQuizGetCombinedReviewOptions200Response> response = apiInstance.ModQuizGetCombinedReviewOptionsWithHttpInfo(modQuizGetCombinedReviewOptionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizGetCombinedReviewOptionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizGetCombinedReviewOptionsRequest** | [**ModQuizGetCombinedReviewOptionsRequest**](ModQuizGetCombinedReviewOptionsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizgetquizaccessinformation"></a>
# **ModQuizGetQuizAccessInformation**
> ModQuizGetQuizAccessInformation200Response ModQuizGetQuizAccessInformation (ModQuizGetQuizAccessInformationRequest modQuizGetQuizAccessInformationRequest)

Return access information for a given quiz.

Return access information for a given quiz.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizGetQuizAccessInformationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizGetQuizAccessInformationRequest = new ModQuizGetQuizAccessInformationRequest(); // ModQuizGetQuizAccessInformationRequest | 

            try
            {
                // Return access information for a given quiz.
                ModQuizGetQuizAccessInformation200Response result = apiInstance.ModQuizGetQuizAccessInformation(modQuizGetQuizAccessInformationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizGetQuizAccessInformation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizGetQuizAccessInformationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return access information for a given quiz.
    ApiResponse<ModQuizGetQuizAccessInformation200Response> response = apiInstance.ModQuizGetQuizAccessInformationWithHttpInfo(modQuizGetQuizAccessInformationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizGetQuizAccessInformationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizGetQuizAccessInformationRequest** | [**ModQuizGetQuizAccessInformationRequest**](ModQuizGetQuizAccessInformationRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizgetquizfeedbackforgrade"></a>
# **ModQuizGetQuizFeedbackForGrade**
> ModQuizGetQuizFeedbackForGrade200Response ModQuizGetQuizFeedbackForGrade (ModQuizGetQuizFeedbackForGradeRequest modQuizGetQuizFeedbackForGradeRequest)

Get the feedback text that should be show to a student who got the given grade in the given quiz.

Get the feedback text that should be show to a student who got the given grade in the given quiz.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizGetQuizFeedbackForGradeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizGetQuizFeedbackForGradeRequest = new ModQuizGetQuizFeedbackForGradeRequest(); // ModQuizGetQuizFeedbackForGradeRequest | 

            try
            {
                // Get the feedback text that should be show to a student who got the given grade in the given quiz.
                ModQuizGetQuizFeedbackForGrade200Response result = apiInstance.ModQuizGetQuizFeedbackForGrade(modQuizGetQuizFeedbackForGradeRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizGetQuizFeedbackForGrade: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizGetQuizFeedbackForGradeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get the feedback text that should be show to a student who got the given grade in the given quiz.
    ApiResponse<ModQuizGetQuizFeedbackForGrade200Response> response = apiInstance.ModQuizGetQuizFeedbackForGradeWithHttpInfo(modQuizGetQuizFeedbackForGradeRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizGetQuizFeedbackForGradeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizGetQuizFeedbackForGradeRequest** | [**ModQuizGetQuizFeedbackForGradeRequest**](ModQuizGetQuizFeedbackForGradeRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizgetquizrequiredqtypes"></a>
# **ModQuizGetQuizRequiredQtypes**
> ModQuizGetQuizRequiredQtypes200Response ModQuizGetQuizRequiredQtypes (ModQuizGetQuizAccessInformationRequest modQuizGetQuizAccessInformationRequest)

Return the potential question types that would be required for a given quiz.

Return the potential question types that would be required for a given quiz.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizGetQuizRequiredQtypesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizGetQuizAccessInformationRequest = new ModQuizGetQuizAccessInformationRequest(); // ModQuizGetQuizAccessInformationRequest | 

            try
            {
                // Return the potential question types that would be required for a given quiz.
                ModQuizGetQuizRequiredQtypes200Response result = apiInstance.ModQuizGetQuizRequiredQtypes(modQuizGetQuizAccessInformationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizGetQuizRequiredQtypes: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizGetQuizRequiredQtypesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return the potential question types that would be required for a given quiz.
    ApiResponse<ModQuizGetQuizRequiredQtypes200Response> response = apiInstance.ModQuizGetQuizRequiredQtypesWithHttpInfo(modQuizGetQuizAccessInformationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizGetQuizRequiredQtypesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizGetQuizAccessInformationRequest** | [**ModQuizGetQuizAccessInformationRequest**](ModQuizGetQuizAccessInformationRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizgetquizzesbycourses"></a>
# **ModQuizGetQuizzesByCourses**
> ModQuizGetQuizzesByCourses200Response ModQuizGetQuizzesByCourses (ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest)

Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.

Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizGetQuizzesByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 

            try
            {
                // Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.
                ModQuizGetQuizzesByCourses200Response result = apiInstance.ModQuizGetQuizzesByCourses(modChatGetChatsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizGetQuizzesByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizGetQuizzesByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.
    ApiResponse<ModQuizGetQuizzesByCourses200Response> response = apiInstance.ModQuizGetQuizzesByCoursesWithHttpInfo(modChatGetChatsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizGetQuizzesByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizgetreopenattemptconfirmation"></a>
# **ModQuizGetReopenAttemptConfirmation**
> Object ModQuizGetReopenAttemptConfirmation (ModQuizGetReopenAttemptConfirmationRequest modQuizGetReopenAttemptConfirmationRequest)

Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.

Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizGetReopenAttemptConfirmationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizGetReopenAttemptConfirmationRequest = new ModQuizGetReopenAttemptConfirmationRequest(); // ModQuizGetReopenAttemptConfirmationRequest | 

            try
            {
                // Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.
                Object result = apiInstance.ModQuizGetReopenAttemptConfirmation(modQuizGetReopenAttemptConfirmationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizGetReopenAttemptConfirmation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizGetReopenAttemptConfirmationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.
    ApiResponse<Object> response = apiInstance.ModQuizGetReopenAttemptConfirmationWithHttpInfo(modQuizGetReopenAttemptConfirmationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizGetReopenAttemptConfirmationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizGetReopenAttemptConfirmationRequest** | [**ModQuizGetReopenAttemptConfirmationRequest**](ModQuizGetReopenAttemptConfirmationRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizgetuserattempts"></a>
# **ModQuizGetUserAttempts**
> ModQuizGetUserAttempts200Response ModQuizGetUserAttempts (ModQuizGetUserAttemptsRequest modQuizGetUserAttemptsRequest)

Return a list of attempts for the given quiz and user.

Return a list of attempts for the given quiz and user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizGetUserAttemptsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizGetUserAttemptsRequest = new ModQuizGetUserAttemptsRequest(); // ModQuizGetUserAttemptsRequest | 

            try
            {
                // Return a list of attempts for the given quiz and user.
                ModQuizGetUserAttempts200Response result = apiInstance.ModQuizGetUserAttempts(modQuizGetUserAttemptsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizGetUserAttempts: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizGetUserAttemptsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return a list of attempts for the given quiz and user.
    ApiResponse<ModQuizGetUserAttempts200Response> response = apiInstance.ModQuizGetUserAttemptsWithHttpInfo(modQuizGetUserAttemptsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizGetUserAttemptsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizGetUserAttemptsRequest** | [**ModQuizGetUserAttemptsRequest**](ModQuizGetUserAttemptsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizgetuserbestgrade"></a>
# **ModQuizGetUserBestGrade**
> ModQuizGetUserBestGrade200Response ModQuizGetUserBestGrade (ModQuizGetUserBestGradeRequest modQuizGetUserBestGradeRequest)

Get the best current grade for the given user on a quiz.

Get the best current grade for the given user on a quiz.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizGetUserBestGradeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizGetUserBestGradeRequest = new ModQuizGetUserBestGradeRequest(); // ModQuizGetUserBestGradeRequest | 

            try
            {
                // Get the best current grade for the given user on a quiz.
                ModQuizGetUserBestGrade200Response result = apiInstance.ModQuizGetUserBestGrade(modQuizGetUserBestGradeRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizGetUserBestGrade: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizGetUserBestGradeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get the best current grade for the given user on a quiz.
    ApiResponse<ModQuizGetUserBestGrade200Response> response = apiInstance.ModQuizGetUserBestGradeWithHttpInfo(modQuizGetUserBestGradeRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizGetUserBestGradeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizGetUserBestGradeRequest** | [**ModQuizGetUserBestGradeRequest**](ModQuizGetUserBestGradeRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizprocessattempt"></a>
# **ModQuizProcessAttempt**
> ModQuizProcessAttempt200Response ModQuizProcessAttempt (ModQuizProcessAttemptRequest modQuizProcessAttemptRequest)

Process responses during an attempt at a quiz and also deals with attempts finishing.

Process responses during an attempt at a quiz and also deals with attempts finishing.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizProcessAttemptExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizProcessAttemptRequest = new ModQuizProcessAttemptRequest(); // ModQuizProcessAttemptRequest | 

            try
            {
                // Process responses during an attempt at a quiz and also deals with attempts finishing.
                ModQuizProcessAttempt200Response result = apiInstance.ModQuizProcessAttempt(modQuizProcessAttemptRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizProcessAttempt: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizProcessAttemptWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Process responses during an attempt at a quiz and also deals with attempts finishing.
    ApiResponse<ModQuizProcessAttempt200Response> response = apiInstance.ModQuizProcessAttemptWithHttpInfo(modQuizProcessAttemptRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizProcessAttemptWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizProcessAttemptRequest** | [**ModQuizProcessAttemptRequest**](ModQuizProcessAttemptRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizreopenattempt"></a>
# **ModQuizReopenAttempt**
> Object ModQuizReopenAttempt (ModQuizReopenAttemptRequest modQuizReopenAttemptRequest)

Re-open an attempt that is currently in the never submitted state.

Re-open an attempt that is currently in the never submitted state.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizReopenAttemptExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizReopenAttemptRequest = new ModQuizReopenAttemptRequest(); // ModQuizReopenAttemptRequest | 

            try
            {
                // Re-open an attempt that is currently in the never submitted state.
                Object result = apiInstance.ModQuizReopenAttempt(modQuizReopenAttemptRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizReopenAttempt: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizReopenAttemptWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Re-open an attempt that is currently in the never submitted state.
    ApiResponse<Object> response = apiInstance.ModQuizReopenAttemptWithHttpInfo(modQuizReopenAttemptRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizReopenAttemptWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizReopenAttemptRequest** | [**ModQuizReopenAttemptRequest**](ModQuizReopenAttemptRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizsaveattempt"></a>
# **ModQuizSaveAttempt**
> CoreCalendarDeleteSubscription200Response ModQuizSaveAttempt (ModQuizSaveAttemptRequest modQuizSaveAttemptRequest)

Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.

Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizSaveAttemptExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizSaveAttemptRequest = new ModQuizSaveAttemptRequest(); // ModQuizSaveAttemptRequest | 

            try
            {
                // Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModQuizSaveAttempt(modQuizSaveAttemptRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizSaveAttempt: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizSaveAttemptWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModQuizSaveAttemptWithHttpInfo(modQuizSaveAttemptRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizSaveAttemptWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizSaveAttemptRequest** | [**ModQuizSaveAttemptRequest**](ModQuizSaveAttemptRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizsetquestionversion"></a>
# **ModQuizSetQuestionVersion**
> ModQuizSetQuestionVersion200Response ModQuizSetQuestionVersion (ModQuizSetQuestionVersionRequest modQuizSetQuestionVersionRequest)

Set the version of question that would be required for a given quiz.

Set the version of question that would be required for a given quiz.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizSetQuestionVersionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizSetQuestionVersionRequest = new ModQuizSetQuestionVersionRequest(); // ModQuizSetQuestionVersionRequest | 

            try
            {
                // Set the version of question that would be required for a given quiz.
                ModQuizSetQuestionVersion200Response result = apiInstance.ModQuizSetQuestionVersion(modQuizSetQuestionVersionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizSetQuestionVersion: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizSetQuestionVersionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Set the version of question that would be required for a given quiz.
    ApiResponse<ModQuizSetQuestionVersion200Response> response = apiInstance.ModQuizSetQuestionVersionWithHttpInfo(modQuizSetQuestionVersionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizSetQuestionVersionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizSetQuestionVersionRequest** | [**ModQuizSetQuestionVersionRequest**](ModQuizSetQuestionVersionRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizstartattempt"></a>
# **ModQuizStartAttempt**
> ModQuizStartAttempt200Response ModQuizStartAttempt (ModQuizStartAttemptRequest modQuizStartAttemptRequest)

Starts a new attempt at a quiz.

Starts a new attempt at a quiz.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizStartAttemptExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizStartAttemptRequest = new ModQuizStartAttemptRequest(); // ModQuizStartAttemptRequest | 

            try
            {
                // Starts a new attempt at a quiz.
                ModQuizStartAttempt200Response result = apiInstance.ModQuizStartAttempt(modQuizStartAttemptRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizStartAttempt: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizStartAttemptWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Starts a new attempt at a quiz.
    ApiResponse<ModQuizStartAttempt200Response> response = apiInstance.ModQuizStartAttemptWithHttpInfo(modQuizStartAttemptRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizStartAttemptWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizStartAttemptRequest** | [**ModQuizStartAttemptRequest**](ModQuizStartAttemptRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizupdatefiltercondition"></a>
# **ModQuizUpdateFilterCondition**
> ModQuizAddRandomQuestions200Response ModQuizUpdateFilterCondition (ModQuizUpdateFilterConditionRequest modQuizUpdateFilterConditionRequest)

Update filter condition for a random question slot.

Update filter condition for a random question slot.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizUpdateFilterConditionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizUpdateFilterConditionRequest = new ModQuizUpdateFilterConditionRequest(); // ModQuizUpdateFilterConditionRequest | 

            try
            {
                // Update filter condition for a random question slot.
                ModQuizAddRandomQuestions200Response result = apiInstance.ModQuizUpdateFilterCondition(modQuizUpdateFilterConditionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizUpdateFilterCondition: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizUpdateFilterConditionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update filter condition for a random question slot.
    ApiResponse<ModQuizAddRandomQuestions200Response> response = apiInstance.ModQuizUpdateFilterConditionWithHttpInfo(modQuizUpdateFilterConditionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizUpdateFilterConditionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizUpdateFilterConditionRequest** | [**ModQuizUpdateFilterConditionRequest**](ModQuizUpdateFilterConditionRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizviewattempt"></a>
# **ModQuizViewAttempt**
> CoreCalendarDeleteSubscription200Response ModQuizViewAttempt (ModQuizViewAttemptRequest modQuizViewAttemptRequest)

Trigger the attempt viewed event.

Trigger the attempt viewed event.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizViewAttemptExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizViewAttemptRequest = new ModQuizViewAttemptRequest(); // ModQuizViewAttemptRequest | 

            try
            {
                // Trigger the attempt viewed event.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModQuizViewAttempt(modQuizViewAttemptRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizViewAttempt: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizViewAttemptWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the attempt viewed event.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModQuizViewAttemptWithHttpInfo(modQuizViewAttemptRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizViewAttemptWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizViewAttemptRequest** | [**ModQuizViewAttemptRequest**](ModQuizViewAttemptRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizviewattemptreview"></a>
# **ModQuizViewAttemptReview**
> CoreCalendarDeleteSubscription200Response ModQuizViewAttemptReview (ModQuizViewAttemptReviewRequest modQuizViewAttemptReviewRequest)

Trigger the attempt reviewed event.

Trigger the attempt reviewed event.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizViewAttemptReviewExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizViewAttemptReviewRequest = new ModQuizViewAttemptReviewRequest(); // ModQuizViewAttemptReviewRequest | 

            try
            {
                // Trigger the attempt reviewed event.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModQuizViewAttemptReview(modQuizViewAttemptReviewRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizViewAttemptReview: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizViewAttemptReviewWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the attempt reviewed event.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModQuizViewAttemptReviewWithHttpInfo(modQuizViewAttemptReviewRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizViewAttemptReviewWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizViewAttemptReviewRequest** | [**ModQuizViewAttemptReviewRequest**](ModQuizViewAttemptReviewRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizviewattemptsummary"></a>
# **ModQuizViewAttemptSummary**
> CoreCalendarDeleteSubscription200Response ModQuizViewAttemptSummary (ModQuizGetAttemptSummaryRequest modQuizGetAttemptSummaryRequest)

Trigger the attempt summary viewed event.

Trigger the attempt summary viewed event.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizViewAttemptSummaryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizGetAttemptSummaryRequest = new ModQuizGetAttemptSummaryRequest(); // ModQuizGetAttemptSummaryRequest | 

            try
            {
                // Trigger the attempt summary viewed event.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModQuizViewAttemptSummary(modQuizGetAttemptSummaryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizViewAttemptSummary: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizViewAttemptSummaryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the attempt summary viewed event.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModQuizViewAttemptSummaryWithHttpInfo(modQuizGetAttemptSummaryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizViewAttemptSummaryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizGetAttemptSummaryRequest** | [**ModQuizGetAttemptSummaryRequest**](ModQuizGetAttemptSummaryRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modquizviewquiz"></a>
# **ModQuizViewQuiz**
> CoreCalendarDeleteSubscription200Response ModQuizViewQuiz (ModQuizGetQuizAccessInformationRequest modQuizGetQuizAccessInformationRequest)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModQuizViewQuizExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModQuizApi(config);
            var modQuizGetQuizAccessInformationRequest = new ModQuizGetQuizAccessInformationRequest(); // ModQuizGetQuizAccessInformationRequest | 

            try
            {
                // Trigger the course module viewed event and update the module completion status.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModQuizViewQuiz(modQuizGetQuizAccessInformationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModQuizApi.ModQuizViewQuiz: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModQuizViewQuizWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the course module viewed event and update the module completion status.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModQuizViewQuizWithHttpInfo(modQuizGetQuizAccessInformationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModQuizApi.ModQuizViewQuizWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modQuizGetQuizAccessInformationRequest** | [**ModQuizGetQuizAccessInformationRequest**](ModQuizGetQuizAccessInformationRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

