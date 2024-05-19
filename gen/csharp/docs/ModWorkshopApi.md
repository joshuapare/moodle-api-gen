# MoodleClient.Api.ModWorkshopApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModWorkshopAddSubmission**](ModWorkshopApi.md#modworkshopaddsubmission) | **POST** /mod_workshop_add_submission | Add a new submission to a given workshop. |
| [**ModWorkshopDeleteSubmission**](ModWorkshopApi.md#modworkshopdeletesubmission) | **POST** /mod_workshop_delete_submission | Deletes the given submission. |
| [**ModWorkshopEvaluateAssessment**](ModWorkshopApi.md#modworkshopevaluateassessment) | **POST** /mod_workshop_evaluate_assessment | Evaluates an assessment (used by teachers for provide feedback to the reviewer). |
| [**ModWorkshopEvaluateSubmission**](ModWorkshopApi.md#modworkshopevaluatesubmission) | **POST** /mod_workshop_evaluate_submission | Evaluates a submission (used by teachers for provide feedback or override the submission grade). |
| [**ModWorkshopGetAssessment**](ModWorkshopApi.md#modworkshopgetassessment) | **POST** /mod_workshop_get_assessment | Retrieves the given assessment. |
| [**ModWorkshopGetAssessmentFormDefinition**](ModWorkshopApi.md#modworkshopgetassessmentformdefinition) | **POST** /mod_workshop_get_assessment_form_definition | Retrieves the assessment form definition. |
| [**ModWorkshopGetGrades**](ModWorkshopApi.md#modworkshopgetgrades) | **POST** /mod_workshop_get_grades | Returns the assessment and submission grade for the given user. |
| [**ModWorkshopGetGradesReport**](ModWorkshopApi.md#modworkshopgetgradesreport) | **POST** /mod_workshop_get_grades_report | Retrieves the assessment grades report. |
| [**ModWorkshopGetReviewerAssessments**](ModWorkshopApi.md#modworkshopgetreviewerassessments) | **POST** /mod_workshop_get_reviewer_assessments | Retrieves all the assessments reviewed by the given user. |
| [**ModWorkshopGetSubmission**](ModWorkshopApi.md#modworkshopgetsubmission) | **POST** /mod_workshop_get_submission | Retrieves the given submission. |
| [**ModWorkshopGetSubmissionAssessments**](ModWorkshopApi.md#modworkshopgetsubmissionassessments) | **POST** /mod_workshop_get_submission_assessments | Retrieves all the assessments of the given submission. |
| [**ModWorkshopGetSubmissions**](ModWorkshopApi.md#modworkshopgetsubmissions) | **POST** /mod_workshop_get_submissions | Retrieves all the workshop submissions or the one done by the given user (except example submissions). |
| [**ModWorkshopGetUserPlan**](ModWorkshopApi.md#modworkshopgetuserplan) | **POST** /mod_workshop_get_user_plan | Return the planner information for the given user. |
| [**ModWorkshopGetWorkshopAccessInformation**](ModWorkshopApi.md#modworkshopgetworkshopaccessinformation) | **POST** /mod_workshop_get_workshop_access_information | Return access information for a given workshop. |
| [**ModWorkshopGetWorkshopsByCourses**](ModWorkshopApi.md#modworkshopgetworkshopsbycourses) | **POST** /mod_workshop_get_workshops_by_courses | Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned. |
| [**ModWorkshopUpdateAssessment**](ModWorkshopApi.md#modworkshopupdateassessment) | **POST** /mod_workshop_update_assessment | Add information to an allocated assessment. |
| [**ModWorkshopUpdateSubmission**](ModWorkshopApi.md#modworkshopupdatesubmission) | **POST** /mod_workshop_update_submission | Update the given submission. |
| [**ModWorkshopViewSubmission**](ModWorkshopApi.md#modworkshopviewsubmission) | **POST** /mod_workshop_view_submission | Trigger the submission viewed event. |
| [**ModWorkshopViewWorkshop**](ModWorkshopApi.md#modworkshopviewworkshop) | **POST** /mod_workshop_view_workshop | Trigger the course module viewed event and update the module completion status. |

<a id="modworkshopaddsubmission"></a>
# **ModWorkshopAddSubmission**
> ModWorkshopAddSubmission200Response ModWorkshopAddSubmission (ModWorkshopAddSubmissionRequest modWorkshopAddSubmissionRequest)

Add a new submission to a given workshop.

Add a new submission to a given workshop.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopAddSubmissionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modWorkshopAddSubmissionRequest = new ModWorkshopAddSubmissionRequest(); // ModWorkshopAddSubmissionRequest | 

            try
            {
                // Add a new submission to a given workshop.
                ModWorkshopAddSubmission200Response result = apiInstance.ModWorkshopAddSubmission(modWorkshopAddSubmissionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopAddSubmission: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopAddSubmissionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Add a new submission to a given workshop.
    ApiResponse<ModWorkshopAddSubmission200Response> response = apiInstance.ModWorkshopAddSubmissionWithHttpInfo(modWorkshopAddSubmissionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopAddSubmissionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWorkshopAddSubmissionRequest** | [**ModWorkshopAddSubmissionRequest**](ModWorkshopAddSubmissionRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modworkshopdeletesubmission"></a>
# **ModWorkshopDeleteSubmission**
> ModWorkshopDeleteSubmission200Response ModWorkshopDeleteSubmission (ModWorkshopDeleteSubmissionRequest modWorkshopDeleteSubmissionRequest)

Deletes the given submission.

Deletes the given submission.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopDeleteSubmissionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modWorkshopDeleteSubmissionRequest = new ModWorkshopDeleteSubmissionRequest(); // ModWorkshopDeleteSubmissionRequest | 

            try
            {
                // Deletes the given submission.
                ModWorkshopDeleteSubmission200Response result = apiInstance.ModWorkshopDeleteSubmission(modWorkshopDeleteSubmissionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopDeleteSubmission: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopDeleteSubmissionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Deletes the given submission.
    ApiResponse<ModWorkshopDeleteSubmission200Response> response = apiInstance.ModWorkshopDeleteSubmissionWithHttpInfo(modWorkshopDeleteSubmissionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopDeleteSubmissionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWorkshopDeleteSubmissionRequest** | [**ModWorkshopDeleteSubmissionRequest**](ModWorkshopDeleteSubmissionRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modworkshopevaluateassessment"></a>
# **ModWorkshopEvaluateAssessment**
> ModWorkshopEvaluateAssessment200Response ModWorkshopEvaluateAssessment (ModWorkshopEvaluateAssessmentRequest modWorkshopEvaluateAssessmentRequest)

Evaluates an assessment (used by teachers for provide feedback to the reviewer).

Evaluates an assessment (used by teachers for provide feedback to the reviewer).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopEvaluateAssessmentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modWorkshopEvaluateAssessmentRequest = new ModWorkshopEvaluateAssessmentRequest(); // ModWorkshopEvaluateAssessmentRequest | 

            try
            {
                // Evaluates an assessment (used by teachers for provide feedback to the reviewer).
                ModWorkshopEvaluateAssessment200Response result = apiInstance.ModWorkshopEvaluateAssessment(modWorkshopEvaluateAssessmentRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopEvaluateAssessment: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopEvaluateAssessmentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Evaluates an assessment (used by teachers for provide feedback to the reviewer).
    ApiResponse<ModWorkshopEvaluateAssessment200Response> response = apiInstance.ModWorkshopEvaluateAssessmentWithHttpInfo(modWorkshopEvaluateAssessmentRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopEvaluateAssessmentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWorkshopEvaluateAssessmentRequest** | [**ModWorkshopEvaluateAssessmentRequest**](ModWorkshopEvaluateAssessmentRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modworkshopevaluatesubmission"></a>
# **ModWorkshopEvaluateSubmission**
> ModWorkshopEvaluateSubmission200Response ModWorkshopEvaluateSubmission (ModWorkshopEvaluateSubmissionRequest modWorkshopEvaluateSubmissionRequest)

Evaluates a submission (used by teachers for provide feedback or override the submission grade).

Evaluates a submission (used by teachers for provide feedback or override the submission grade).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopEvaluateSubmissionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modWorkshopEvaluateSubmissionRequest = new ModWorkshopEvaluateSubmissionRequest(); // ModWorkshopEvaluateSubmissionRequest | 

            try
            {
                // Evaluates a submission (used by teachers for provide feedback or override the submission grade).
                ModWorkshopEvaluateSubmission200Response result = apiInstance.ModWorkshopEvaluateSubmission(modWorkshopEvaluateSubmissionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopEvaluateSubmission: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopEvaluateSubmissionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Evaluates a submission (used by teachers for provide feedback or override the submission grade).
    ApiResponse<ModWorkshopEvaluateSubmission200Response> response = apiInstance.ModWorkshopEvaluateSubmissionWithHttpInfo(modWorkshopEvaluateSubmissionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopEvaluateSubmissionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWorkshopEvaluateSubmissionRequest** | [**ModWorkshopEvaluateSubmissionRequest**](ModWorkshopEvaluateSubmissionRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modworkshopgetassessment"></a>
# **ModWorkshopGetAssessment**
> ModWorkshopGetAssessment200Response ModWorkshopGetAssessment (ModWorkshopGetAssessmentRequest modWorkshopGetAssessmentRequest)

Retrieves the given assessment.

Retrieves the given assessment.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopGetAssessmentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modWorkshopGetAssessmentRequest = new ModWorkshopGetAssessmentRequest(); // ModWorkshopGetAssessmentRequest | 

            try
            {
                // Retrieves the given assessment.
                ModWorkshopGetAssessment200Response result = apiInstance.ModWorkshopGetAssessment(modWorkshopGetAssessmentRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetAssessment: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopGetAssessmentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieves the given assessment.
    ApiResponse<ModWorkshopGetAssessment200Response> response = apiInstance.ModWorkshopGetAssessmentWithHttpInfo(modWorkshopGetAssessmentRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetAssessmentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWorkshopGetAssessmentRequest** | [**ModWorkshopGetAssessmentRequest**](ModWorkshopGetAssessmentRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modworkshopgetassessmentformdefinition"></a>
# **ModWorkshopGetAssessmentFormDefinition**
> ModWorkshopGetAssessmentFormDefinition200Response ModWorkshopGetAssessmentFormDefinition (ModWorkshopGetAssessmentFormDefinitionRequest modWorkshopGetAssessmentFormDefinitionRequest)

Retrieves the assessment form definition.

Retrieves the assessment form definition.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopGetAssessmentFormDefinitionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modWorkshopGetAssessmentFormDefinitionRequest = new ModWorkshopGetAssessmentFormDefinitionRequest(); // ModWorkshopGetAssessmentFormDefinitionRequest | 

            try
            {
                // Retrieves the assessment form definition.
                ModWorkshopGetAssessmentFormDefinition200Response result = apiInstance.ModWorkshopGetAssessmentFormDefinition(modWorkshopGetAssessmentFormDefinitionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetAssessmentFormDefinition: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopGetAssessmentFormDefinitionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieves the assessment form definition.
    ApiResponse<ModWorkshopGetAssessmentFormDefinition200Response> response = apiInstance.ModWorkshopGetAssessmentFormDefinitionWithHttpInfo(modWorkshopGetAssessmentFormDefinitionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetAssessmentFormDefinitionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWorkshopGetAssessmentFormDefinitionRequest** | [**ModWorkshopGetAssessmentFormDefinitionRequest**](ModWorkshopGetAssessmentFormDefinitionRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modworkshopgetgrades"></a>
# **ModWorkshopGetGrades**
> ModWorkshopGetGrades200Response ModWorkshopGetGrades (ModWorkshopGetGradesRequest modWorkshopGetGradesRequest)

Returns the assessment and submission grade for the given user.

Returns the assessment and submission grade for the given user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopGetGradesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modWorkshopGetGradesRequest = new ModWorkshopGetGradesRequest(); // ModWorkshopGetGradesRequest | 

            try
            {
                // Returns the assessment and submission grade for the given user.
                ModWorkshopGetGrades200Response result = apiInstance.ModWorkshopGetGrades(modWorkshopGetGradesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetGrades: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopGetGradesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns the assessment and submission grade for the given user.
    ApiResponse<ModWorkshopGetGrades200Response> response = apiInstance.ModWorkshopGetGradesWithHttpInfo(modWorkshopGetGradesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetGradesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWorkshopGetGradesRequest** | [**ModWorkshopGetGradesRequest**](ModWorkshopGetGradesRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modworkshopgetgradesreport"></a>
# **ModWorkshopGetGradesReport**
> ModWorkshopGetGradesReport200Response ModWorkshopGetGradesReport (ModWorkshopGetGradesReportRequest modWorkshopGetGradesReportRequest)

Retrieves the assessment grades report.

Retrieves the assessment grades report.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopGetGradesReportExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modWorkshopGetGradesReportRequest = new ModWorkshopGetGradesReportRequest(); // ModWorkshopGetGradesReportRequest | 

            try
            {
                // Retrieves the assessment grades report.
                ModWorkshopGetGradesReport200Response result = apiInstance.ModWorkshopGetGradesReport(modWorkshopGetGradesReportRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetGradesReport: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopGetGradesReportWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieves the assessment grades report.
    ApiResponse<ModWorkshopGetGradesReport200Response> response = apiInstance.ModWorkshopGetGradesReportWithHttpInfo(modWorkshopGetGradesReportRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetGradesReportWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWorkshopGetGradesReportRequest** | [**ModWorkshopGetGradesReportRequest**](ModWorkshopGetGradesReportRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modworkshopgetreviewerassessments"></a>
# **ModWorkshopGetReviewerAssessments**
> ModWorkshopGetReviewerAssessments200Response ModWorkshopGetReviewerAssessments (ModWorkshopGetReviewerAssessmentsRequest modWorkshopGetReviewerAssessmentsRequest)

Retrieves all the assessments reviewed by the given user.

Retrieves all the assessments reviewed by the given user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopGetReviewerAssessmentsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modWorkshopGetReviewerAssessmentsRequest = new ModWorkshopGetReviewerAssessmentsRequest(); // ModWorkshopGetReviewerAssessmentsRequest | 

            try
            {
                // Retrieves all the assessments reviewed by the given user.
                ModWorkshopGetReviewerAssessments200Response result = apiInstance.ModWorkshopGetReviewerAssessments(modWorkshopGetReviewerAssessmentsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetReviewerAssessments: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopGetReviewerAssessmentsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieves all the assessments reviewed by the given user.
    ApiResponse<ModWorkshopGetReviewerAssessments200Response> response = apiInstance.ModWorkshopGetReviewerAssessmentsWithHttpInfo(modWorkshopGetReviewerAssessmentsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetReviewerAssessmentsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWorkshopGetReviewerAssessmentsRequest** | [**ModWorkshopGetReviewerAssessmentsRequest**](ModWorkshopGetReviewerAssessmentsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modworkshopgetsubmission"></a>
# **ModWorkshopGetSubmission**
> ModWorkshopGetSubmission200Response ModWorkshopGetSubmission (ModWorkshopGetSubmissionRequest modWorkshopGetSubmissionRequest)

Retrieves the given submission.

Retrieves the given submission.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopGetSubmissionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modWorkshopGetSubmissionRequest = new ModWorkshopGetSubmissionRequest(); // ModWorkshopGetSubmissionRequest | 

            try
            {
                // Retrieves the given submission.
                ModWorkshopGetSubmission200Response result = apiInstance.ModWorkshopGetSubmission(modWorkshopGetSubmissionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetSubmission: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopGetSubmissionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieves the given submission.
    ApiResponse<ModWorkshopGetSubmission200Response> response = apiInstance.ModWorkshopGetSubmissionWithHttpInfo(modWorkshopGetSubmissionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetSubmissionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWorkshopGetSubmissionRequest** | [**ModWorkshopGetSubmissionRequest**](ModWorkshopGetSubmissionRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modworkshopgetsubmissionassessments"></a>
# **ModWorkshopGetSubmissionAssessments**
> ModWorkshopGetReviewerAssessments200Response ModWorkshopGetSubmissionAssessments (ModWorkshopGetSubmissionRequest modWorkshopGetSubmissionRequest)

Retrieves all the assessments of the given submission.

Retrieves all the assessments of the given submission.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopGetSubmissionAssessmentsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modWorkshopGetSubmissionRequest = new ModWorkshopGetSubmissionRequest(); // ModWorkshopGetSubmissionRequest | 

            try
            {
                // Retrieves all the assessments of the given submission.
                ModWorkshopGetReviewerAssessments200Response result = apiInstance.ModWorkshopGetSubmissionAssessments(modWorkshopGetSubmissionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetSubmissionAssessments: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopGetSubmissionAssessmentsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieves all the assessments of the given submission.
    ApiResponse<ModWorkshopGetReviewerAssessments200Response> response = apiInstance.ModWorkshopGetSubmissionAssessmentsWithHttpInfo(modWorkshopGetSubmissionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetSubmissionAssessmentsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWorkshopGetSubmissionRequest** | [**ModWorkshopGetSubmissionRequest**](ModWorkshopGetSubmissionRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modworkshopgetsubmissions"></a>
# **ModWorkshopGetSubmissions**
> ModWorkshopGetSubmissions200Response ModWorkshopGetSubmissions (ModWorkshopGetSubmissionsRequest modWorkshopGetSubmissionsRequest)

Retrieves all the workshop submissions or the one done by the given user (except example submissions).

Retrieves all the workshop submissions or the one done by the given user (except example submissions).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopGetSubmissionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modWorkshopGetSubmissionsRequest = new ModWorkshopGetSubmissionsRequest(); // ModWorkshopGetSubmissionsRequest | 

            try
            {
                // Retrieves all the workshop submissions or the one done by the given user (except example submissions).
                ModWorkshopGetSubmissions200Response result = apiInstance.ModWorkshopGetSubmissions(modWorkshopGetSubmissionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetSubmissions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopGetSubmissionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieves all the workshop submissions or the one done by the given user (except example submissions).
    ApiResponse<ModWorkshopGetSubmissions200Response> response = apiInstance.ModWorkshopGetSubmissionsWithHttpInfo(modWorkshopGetSubmissionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetSubmissionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWorkshopGetSubmissionsRequest** | [**ModWorkshopGetSubmissionsRequest**](ModWorkshopGetSubmissionsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modworkshopgetuserplan"></a>
# **ModWorkshopGetUserPlan**
> ModWorkshopGetUserPlan200Response ModWorkshopGetUserPlan (ModWorkshopGetUserPlanRequest modWorkshopGetUserPlanRequest)

Return the planner information for the given user.

Return the planner information for the given user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopGetUserPlanExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modWorkshopGetUserPlanRequest = new ModWorkshopGetUserPlanRequest(); // ModWorkshopGetUserPlanRequest | 

            try
            {
                // Return the planner information for the given user.
                ModWorkshopGetUserPlan200Response result = apiInstance.ModWorkshopGetUserPlan(modWorkshopGetUserPlanRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetUserPlan: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopGetUserPlanWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return the planner information for the given user.
    ApiResponse<ModWorkshopGetUserPlan200Response> response = apiInstance.ModWorkshopGetUserPlanWithHttpInfo(modWorkshopGetUserPlanRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetUserPlanWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWorkshopGetUserPlanRequest** | [**ModWorkshopGetUserPlanRequest**](ModWorkshopGetUserPlanRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modworkshopgetworkshopaccessinformation"></a>
# **ModWorkshopGetWorkshopAccessInformation**
> ModWorkshopGetWorkshopAccessInformation200Response ModWorkshopGetWorkshopAccessInformation (ModWorkshopGetWorkshopAccessInformationRequest modWorkshopGetWorkshopAccessInformationRequest)

Return access information for a given workshop.

Return access information for a given workshop.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopGetWorkshopAccessInformationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modWorkshopGetWorkshopAccessInformationRequest = new ModWorkshopGetWorkshopAccessInformationRequest(); // ModWorkshopGetWorkshopAccessInformationRequest | 

            try
            {
                // Return access information for a given workshop.
                ModWorkshopGetWorkshopAccessInformation200Response result = apiInstance.ModWorkshopGetWorkshopAccessInformation(modWorkshopGetWorkshopAccessInformationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetWorkshopAccessInformation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopGetWorkshopAccessInformationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return access information for a given workshop.
    ApiResponse<ModWorkshopGetWorkshopAccessInformation200Response> response = apiInstance.ModWorkshopGetWorkshopAccessInformationWithHttpInfo(modWorkshopGetWorkshopAccessInformationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetWorkshopAccessInformationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWorkshopGetWorkshopAccessInformationRequest** | [**ModWorkshopGetWorkshopAccessInformationRequest**](ModWorkshopGetWorkshopAccessInformationRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modworkshopgetworkshopsbycourses"></a>
# **ModWorkshopGetWorkshopsByCourses**
> ModWorkshopGetWorkshopsByCourses200Response ModWorkshopGetWorkshopsByCourses (ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest)

Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.

Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopGetWorkshopsByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = new ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 

            try
            {
                // Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.
                ModWorkshopGetWorkshopsByCourses200Response result = apiInstance.ModWorkshopGetWorkshopsByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetWorkshopsByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopGetWorkshopsByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.
    ApiResponse<ModWorkshopGetWorkshopsByCourses200Response> response = apiInstance.ModWorkshopGetWorkshopsByCoursesWithHttpInfo(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopGetWorkshopsByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modworkshopupdateassessment"></a>
# **ModWorkshopUpdateAssessment**
> ModWorkshopUpdateAssessment200Response ModWorkshopUpdateAssessment (ModWorkshopUpdateAssessmentRequest modWorkshopUpdateAssessmentRequest)

Add information to an allocated assessment.

Add information to an allocated assessment.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopUpdateAssessmentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modWorkshopUpdateAssessmentRequest = new ModWorkshopUpdateAssessmentRequest(); // ModWorkshopUpdateAssessmentRequest | 

            try
            {
                // Add information to an allocated assessment.
                ModWorkshopUpdateAssessment200Response result = apiInstance.ModWorkshopUpdateAssessment(modWorkshopUpdateAssessmentRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopUpdateAssessment: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopUpdateAssessmentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Add information to an allocated assessment.
    ApiResponse<ModWorkshopUpdateAssessment200Response> response = apiInstance.ModWorkshopUpdateAssessmentWithHttpInfo(modWorkshopUpdateAssessmentRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopUpdateAssessmentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWorkshopUpdateAssessmentRequest** | [**ModWorkshopUpdateAssessmentRequest**](ModWorkshopUpdateAssessmentRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modworkshopupdatesubmission"></a>
# **ModWorkshopUpdateSubmission**
> ModWorkshopUpdateSubmission200Response ModWorkshopUpdateSubmission (ModWorkshopUpdateSubmissionRequest modWorkshopUpdateSubmissionRequest)

Update the given submission.

Update the given submission.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopUpdateSubmissionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modWorkshopUpdateSubmissionRequest = new ModWorkshopUpdateSubmissionRequest(); // ModWorkshopUpdateSubmissionRequest | 

            try
            {
                // Update the given submission.
                ModWorkshopUpdateSubmission200Response result = apiInstance.ModWorkshopUpdateSubmission(modWorkshopUpdateSubmissionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopUpdateSubmission: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopUpdateSubmissionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update the given submission.
    ApiResponse<ModWorkshopUpdateSubmission200Response> response = apiInstance.ModWorkshopUpdateSubmissionWithHttpInfo(modWorkshopUpdateSubmissionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopUpdateSubmissionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWorkshopUpdateSubmissionRequest** | [**ModWorkshopUpdateSubmissionRequest**](ModWorkshopUpdateSubmissionRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modworkshopviewsubmission"></a>
# **ModWorkshopViewSubmission**
> CoreCalendarDeleteSubscription200Response ModWorkshopViewSubmission (ModWorkshopGetSubmissionRequest modWorkshopGetSubmissionRequest)

Trigger the submission viewed event.

Trigger the submission viewed event.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopViewSubmissionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modWorkshopGetSubmissionRequest = new ModWorkshopGetSubmissionRequest(); // ModWorkshopGetSubmissionRequest | 

            try
            {
                // Trigger the submission viewed event.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModWorkshopViewSubmission(modWorkshopGetSubmissionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopViewSubmission: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopViewSubmissionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the submission viewed event.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModWorkshopViewSubmissionWithHttpInfo(modWorkshopGetSubmissionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopViewSubmissionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWorkshopGetSubmissionRequest** | [**ModWorkshopGetSubmissionRequest**](ModWorkshopGetSubmissionRequest.md) |  |  |

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

<a id="modworkshopviewworkshop"></a>
# **ModWorkshopViewWorkshop**
> CoreCalendarDeleteSubscription200Response ModWorkshopViewWorkshop (ModWorkshopViewWorkshopRequest modWorkshopViewWorkshopRequest)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModWorkshopViewWorkshopExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWorkshopApi(config);
            var modWorkshopViewWorkshopRequest = new ModWorkshopViewWorkshopRequest(); // ModWorkshopViewWorkshopRequest | 

            try
            {
                // Trigger the course module viewed event and update the module completion status.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModWorkshopViewWorkshop(modWorkshopViewWorkshopRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopViewWorkshop: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWorkshopViewWorkshopWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the course module viewed event and update the module completion status.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModWorkshopViewWorkshopWithHttpInfo(modWorkshopViewWorkshopRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWorkshopApi.ModWorkshopViewWorkshopWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWorkshopViewWorkshopRequest** | [**ModWorkshopViewWorkshopRequest**](ModWorkshopViewWorkshopRequest.md) |  |  |

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

