# Org.OpenAPITools.Api.ModSurveyApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModSurveyGetQuestions**](ModSurveyApi.md#modsurveygetquestions) | **POST** /mod_survey_get_questions | Get the complete list of questions for the survey, including subquestions. |
| [**ModSurveyGetSurveysByCourses**](ModSurveyApi.md#modsurveygetsurveysbycourses) | **POST** /mod_survey_get_surveys_by_courses | Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned. |
| [**ModSurveySubmitAnswers**](ModSurveyApi.md#modsurveysubmitanswers) | **POST** /mod_survey_submit_answers | Submit the answers for a given survey. |
| [**ModSurveyViewSurvey**](ModSurveyApi.md#modsurveyviewsurvey) | **POST** /mod_survey_view_survey | Trigger the course module viewed event and update the module completion status. |

<a id="modsurveygetquestions"></a>
# **ModSurveyGetQuestions**
> ModSurveyGetQuestions200Response ModSurveyGetQuestions (ModSurveyGetQuestionsRequest modSurveyGetQuestionsRequest)

Get the complete list of questions for the survey, including subquestions.

Get the complete list of questions for the survey, including subquestions.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModSurveyGetQuestionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModSurveyApi(config);
            var modSurveyGetQuestionsRequest = new ModSurveyGetQuestionsRequest(); // ModSurveyGetQuestionsRequest | 

            try
            {
                // Get the complete list of questions for the survey, including subquestions.
                ModSurveyGetQuestions200Response result = apiInstance.ModSurveyGetQuestions(modSurveyGetQuestionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModSurveyApi.ModSurveyGetQuestions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModSurveyGetQuestionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get the complete list of questions for the survey, including subquestions.
    ApiResponse<ModSurveyGetQuestions200Response> response = apiInstance.ModSurveyGetQuestionsWithHttpInfo(modSurveyGetQuestionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModSurveyApi.ModSurveyGetQuestionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modSurveyGetQuestionsRequest** | [**ModSurveyGetQuestionsRequest**](ModSurveyGetQuestionsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modsurveygetsurveysbycourses"></a>
# **ModSurveyGetSurveysByCourses**
> ModSurveyGetSurveysByCourses200Response ModSurveyGetSurveysByCourses (ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest)

Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.

Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModSurveyGetSurveysByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModSurveyApi(config);
            var modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 

            try
            {
                // Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.
                ModSurveyGetSurveysByCourses200Response result = apiInstance.ModSurveyGetSurveysByCourses(modChatGetChatsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModSurveyApi.ModSurveyGetSurveysByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModSurveyGetSurveysByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.
    ApiResponse<ModSurveyGetSurveysByCourses200Response> response = apiInstance.ModSurveyGetSurveysByCoursesWithHttpInfo(modChatGetChatsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModSurveyApi.ModSurveyGetSurveysByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modsurveysubmitanswers"></a>
# **ModSurveySubmitAnswers**
> CoreCalendarDeleteSubscription200Response ModSurveySubmitAnswers (ModSurveySubmitAnswersRequest modSurveySubmitAnswersRequest)

Submit the answers for a given survey.

Submit the answers for a given survey.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModSurveySubmitAnswersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModSurveyApi(config);
            var modSurveySubmitAnswersRequest = new ModSurveySubmitAnswersRequest(); // ModSurveySubmitAnswersRequest | 

            try
            {
                // Submit the answers for a given survey.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModSurveySubmitAnswers(modSurveySubmitAnswersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModSurveyApi.ModSurveySubmitAnswers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModSurveySubmitAnswersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Submit the answers for a given survey.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModSurveySubmitAnswersWithHttpInfo(modSurveySubmitAnswersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModSurveyApi.ModSurveySubmitAnswersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modSurveySubmitAnswersRequest** | [**ModSurveySubmitAnswersRequest**](ModSurveySubmitAnswersRequest.md) |  |  |

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

<a id="modsurveyviewsurvey"></a>
# **ModSurveyViewSurvey**
> CoreCalendarDeleteSubscription200Response ModSurveyViewSurvey (ModSurveyViewSurveyRequest modSurveyViewSurveyRequest)

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
    public class ModSurveyViewSurveyExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModSurveyApi(config);
            var modSurveyViewSurveyRequest = new ModSurveyViewSurveyRequest(); // ModSurveyViewSurveyRequest | 

            try
            {
                // Trigger the course module viewed event and update the module completion status.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModSurveyViewSurvey(modSurveyViewSurveyRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModSurveyApi.ModSurveyViewSurvey: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModSurveyViewSurveyWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the course module viewed event and update the module completion status.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModSurveyViewSurveyWithHttpInfo(modSurveyViewSurveyRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModSurveyApi.ModSurveyViewSurveyWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modSurveyViewSurveyRequest** | [**ModSurveyViewSurveyRequest**](ModSurveyViewSurveyRequest.md) |  |  |

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

