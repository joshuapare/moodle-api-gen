# MoodleClient.Api.ModAssignApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModAssignCopyPreviousAttempt**](ModAssignApi.md#modassigncopypreviousattempt) | **POST** /mod_assign_copy_previous_attempt | Copy a students previous attempt to a new attempt. |
| [**ModAssignGetAssignments**](ModAssignApi.md#modassigngetassignments) | **POST** /mod_assign_get_assignments | Returns the courses and assignments for the users capability |
| [**ModAssignGetGrades**](ModAssignApi.md#modassigngetgrades) | **POST** /mod_assign_get_grades | Returns grades from the assignment |
| [**ModAssignGetParticipant**](ModAssignApi.md#modassigngetparticipant) | **POST** /mod_assign_get_participant | Get a participant for an assignment, with some summary info about their submissions. |
| [**ModAssignGetSubmissionStatus**](ModAssignApi.md#modassigngetsubmissionstatus) | **POST** /mod_assign_get_submission_status | Returns information about an assignment submission status for a given user. |
| [**ModAssignGetSubmissions**](ModAssignApi.md#modassigngetsubmissions) | **POST** /mod_assign_get_submissions | Returns the submissions for assignments |
| [**ModAssignGetUserFlags**](ModAssignApi.md#modassigngetuserflags) | **POST** /mod_assign_get_user_flags | Returns the user flags for assignments |
| [**ModAssignGetUserMappings**](ModAssignApi.md#modassigngetusermappings) | **POST** /mod_assign_get_user_mappings | Returns the blind marking mappings for assignments |
| [**ModAssignListParticipants**](ModAssignApi.md#modassignlistparticipants) | **POST** /mod_assign_list_participants | List the participants for a single assignment, with some summary info about their submissions. |
| [**ModAssignLockSubmissions**](ModAssignApi.md#modassignlocksubmissions) | **POST** /mod_assign_lock_submissions | Prevent students from making changes to a list of submissions |
| [**ModAssignRevealIdentities**](ModAssignApi.md#modassignrevealidentities) | **POST** /mod_assign_reveal_identities | Reveal the identities for a blind marking assignment |
| [**ModAssignRevertSubmissionsToDraft**](ModAssignApi.md#modassignrevertsubmissionstodraft) | **POST** /mod_assign_revert_submissions_to_draft | Reverts the list of submissions to draft status |
| [**ModAssignSaveGrade**](ModAssignApi.md#modassignsavegrade) | **POST** /mod_assign_save_grade | Save a grade update for a single student. |
| [**ModAssignSaveGrades**](ModAssignApi.md#modassignsavegrades) | **POST** /mod_assign_save_grades | Save multiple grade updates for an assignment. |
| [**ModAssignSaveSubmission**](ModAssignApi.md#modassignsavesubmission) | **POST** /mod_assign_save_submission | Update the current students submission |
| [**ModAssignSaveUserExtensions**](ModAssignApi.md#modassignsaveuserextensions) | **POST** /mod_assign_save_user_extensions | Save a list of assignment extensions |
| [**ModAssignSetUserFlags**](ModAssignApi.md#modassignsetuserflags) | **POST** /mod_assign_set_user_flags | Creates or updates user flags |
| [**ModAssignStartSubmission**](ModAssignApi.md#modassignstartsubmission) | **POST** /mod_assign_start_submission | Start a submission for user if assignment has a time limit. |
| [**ModAssignSubmitForGrading**](ModAssignApi.md#modassignsubmitforgrading) | **POST** /mod_assign_submit_for_grading | Submit the current students assignment for grading |
| [**ModAssignSubmitGradingForm**](ModAssignApi.md#modassignsubmitgradingform) | **POST** /mod_assign_submit_grading_form | Submit the grading form data via ajax |
| [**ModAssignUnlockSubmissions**](ModAssignApi.md#modassignunlocksubmissions) | **POST** /mod_assign_unlock_submissions | Allow students to make changes to a list of submissions |
| [**ModAssignViewAssign**](ModAssignApi.md#modassignviewassign) | **POST** /mod_assign_view_assign | Update the module completion status. |
| [**ModAssignViewGradingTable**](ModAssignApi.md#modassignviewgradingtable) | **POST** /mod_assign_view_grading_table | Trigger the grading_table_viewed event. |
| [**ModAssignViewSubmissionStatus**](ModAssignApi.md#modassignviewsubmissionstatus) | **POST** /mod_assign_view_submission_status | Trigger the submission status viewed event. |

<a id="modassigncopypreviousattempt"></a>
# **ModAssignCopyPreviousAttempt**
> Object ModAssignCopyPreviousAttempt (ModAssignCopyPreviousAttemptRequest modAssignCopyPreviousAttemptRequest)

Copy a students previous attempt to a new attempt.

Copy a students previous attempt to a new attempt.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignCopyPreviousAttemptExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignCopyPreviousAttemptRequest = new ModAssignCopyPreviousAttemptRequest(); // ModAssignCopyPreviousAttemptRequest | 

            try
            {
                // Copy a students previous attempt to a new attempt.
                Object result = apiInstance.ModAssignCopyPreviousAttempt(modAssignCopyPreviousAttemptRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignCopyPreviousAttempt: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignCopyPreviousAttemptWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Copy a students previous attempt to a new attempt.
    ApiResponse<Object> response = apiInstance.ModAssignCopyPreviousAttemptWithHttpInfo(modAssignCopyPreviousAttemptRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignCopyPreviousAttemptWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignCopyPreviousAttemptRequest** | [**ModAssignCopyPreviousAttemptRequest**](ModAssignCopyPreviousAttemptRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modassigngetassignments"></a>
# **ModAssignGetAssignments**
> ModAssignGetAssignments200Response ModAssignGetAssignments (ModAssignGetAssignmentsRequest modAssignGetAssignmentsRequest)

Returns the courses and assignments for the users capability

Returns the courses and assignments for the users capability

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignGetAssignmentsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignGetAssignmentsRequest = new ModAssignGetAssignmentsRequest(); // ModAssignGetAssignmentsRequest | 

            try
            {
                // Returns the courses and assignments for the users capability
                ModAssignGetAssignments200Response result = apiInstance.ModAssignGetAssignments(modAssignGetAssignmentsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignGetAssignments: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignGetAssignmentsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns the courses and assignments for the users capability
    ApiResponse<ModAssignGetAssignments200Response> response = apiInstance.ModAssignGetAssignmentsWithHttpInfo(modAssignGetAssignmentsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignGetAssignmentsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignGetAssignmentsRequest** | [**ModAssignGetAssignmentsRequest**](ModAssignGetAssignmentsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modassigngetgrades"></a>
# **ModAssignGetGrades**
> ModAssignGetGrades200Response ModAssignGetGrades (ModAssignGetGradesRequest modAssignGetGradesRequest)

Returns grades from the assignment

Returns grades from the assignment

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignGetGradesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignGetGradesRequest = new ModAssignGetGradesRequest(); // ModAssignGetGradesRequest | 

            try
            {
                // Returns grades from the assignment
                ModAssignGetGrades200Response result = apiInstance.ModAssignGetGrades(modAssignGetGradesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignGetGrades: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignGetGradesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns grades from the assignment
    ApiResponse<ModAssignGetGrades200Response> response = apiInstance.ModAssignGetGradesWithHttpInfo(modAssignGetGradesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignGetGradesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignGetGradesRequest** | [**ModAssignGetGradesRequest**](ModAssignGetGradesRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modassigngetparticipant"></a>
# **ModAssignGetParticipant**
> ModAssignGetParticipant200Response ModAssignGetParticipant (ModAssignGetParticipantRequest modAssignGetParticipantRequest)

Get a participant for an assignment, with some summary info about their submissions.

Get a participant for an assignment, with some summary info about their submissions.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignGetParticipantExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignGetParticipantRequest = new ModAssignGetParticipantRequest(); // ModAssignGetParticipantRequest | 

            try
            {
                // Get a participant for an assignment, with some summary info about their submissions.
                ModAssignGetParticipant200Response result = apiInstance.ModAssignGetParticipant(modAssignGetParticipantRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignGetParticipant: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignGetParticipantWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get a participant for an assignment, with some summary info about their submissions.
    ApiResponse<ModAssignGetParticipant200Response> response = apiInstance.ModAssignGetParticipantWithHttpInfo(modAssignGetParticipantRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignGetParticipantWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignGetParticipantRequest** | [**ModAssignGetParticipantRequest**](ModAssignGetParticipantRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modassigngetsubmissionstatus"></a>
# **ModAssignGetSubmissionStatus**
> ModAssignGetSubmissionStatus200Response ModAssignGetSubmissionStatus (ModAssignGetSubmissionStatusRequest modAssignGetSubmissionStatusRequest)

Returns information about an assignment submission status for a given user.

Returns information about an assignment submission status for a given user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignGetSubmissionStatusExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignGetSubmissionStatusRequest = new ModAssignGetSubmissionStatusRequest(); // ModAssignGetSubmissionStatusRequest | 

            try
            {
                // Returns information about an assignment submission status for a given user.
                ModAssignGetSubmissionStatus200Response result = apiInstance.ModAssignGetSubmissionStatus(modAssignGetSubmissionStatusRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignGetSubmissionStatus: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignGetSubmissionStatusWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns information about an assignment submission status for a given user.
    ApiResponse<ModAssignGetSubmissionStatus200Response> response = apiInstance.ModAssignGetSubmissionStatusWithHttpInfo(modAssignGetSubmissionStatusRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignGetSubmissionStatusWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignGetSubmissionStatusRequest** | [**ModAssignGetSubmissionStatusRequest**](ModAssignGetSubmissionStatusRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modassigngetsubmissions"></a>
# **ModAssignGetSubmissions**
> ModAssignGetSubmissions200Response ModAssignGetSubmissions (ModAssignGetSubmissionsRequest modAssignGetSubmissionsRequest)

Returns the submissions for assignments

Returns the submissions for assignments

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignGetSubmissionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignGetSubmissionsRequest = new ModAssignGetSubmissionsRequest(); // ModAssignGetSubmissionsRequest | 

            try
            {
                // Returns the submissions for assignments
                ModAssignGetSubmissions200Response result = apiInstance.ModAssignGetSubmissions(modAssignGetSubmissionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignGetSubmissions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignGetSubmissionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns the submissions for assignments
    ApiResponse<ModAssignGetSubmissions200Response> response = apiInstance.ModAssignGetSubmissionsWithHttpInfo(modAssignGetSubmissionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignGetSubmissionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignGetSubmissionsRequest** | [**ModAssignGetSubmissionsRequest**](ModAssignGetSubmissionsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modassigngetuserflags"></a>
# **ModAssignGetUserFlags**
> ModAssignGetUserFlags200Response ModAssignGetUserFlags (ModAssignGetUserFlagsRequest modAssignGetUserFlagsRequest)

Returns the user flags for assignments

Returns the user flags for assignments

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignGetUserFlagsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignGetUserFlagsRequest = new ModAssignGetUserFlagsRequest(); // ModAssignGetUserFlagsRequest | 

            try
            {
                // Returns the user flags for assignments
                ModAssignGetUserFlags200Response result = apiInstance.ModAssignGetUserFlags(modAssignGetUserFlagsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignGetUserFlags: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignGetUserFlagsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns the user flags for assignments
    ApiResponse<ModAssignGetUserFlags200Response> response = apiInstance.ModAssignGetUserFlagsWithHttpInfo(modAssignGetUserFlagsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignGetUserFlagsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignGetUserFlagsRequest** | [**ModAssignGetUserFlagsRequest**](ModAssignGetUserFlagsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modassigngetusermappings"></a>
# **ModAssignGetUserMappings**
> ModAssignGetUserMappings200Response ModAssignGetUserMappings (ModAssignGetUserFlagsRequest modAssignGetUserFlagsRequest)

Returns the blind marking mappings for assignments

Returns the blind marking mappings for assignments

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignGetUserMappingsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignGetUserFlagsRequest = new ModAssignGetUserFlagsRequest(); // ModAssignGetUserFlagsRequest | 

            try
            {
                // Returns the blind marking mappings for assignments
                ModAssignGetUserMappings200Response result = apiInstance.ModAssignGetUserMappings(modAssignGetUserFlagsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignGetUserMappings: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignGetUserMappingsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns the blind marking mappings for assignments
    ApiResponse<ModAssignGetUserMappings200Response> response = apiInstance.ModAssignGetUserMappingsWithHttpInfo(modAssignGetUserFlagsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignGetUserMappingsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignGetUserFlagsRequest** | [**ModAssignGetUserFlagsRequest**](ModAssignGetUserFlagsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modassignlistparticipants"></a>
# **ModAssignListParticipants**
> Object ModAssignListParticipants (ModAssignListParticipantsRequest modAssignListParticipantsRequest)

List the participants for a single assignment, with some summary info about their submissions.

List the participants for a single assignment, with some summary info about their submissions.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignListParticipantsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignListParticipantsRequest = new ModAssignListParticipantsRequest(); // ModAssignListParticipantsRequest | 

            try
            {
                // List the participants for a single assignment, with some summary info about their submissions.
                Object result = apiInstance.ModAssignListParticipants(modAssignListParticipantsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignListParticipants: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignListParticipantsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List the participants for a single assignment, with some summary info about their submissions.
    ApiResponse<Object> response = apiInstance.ModAssignListParticipantsWithHttpInfo(modAssignListParticipantsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignListParticipantsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignListParticipantsRequest** | [**ModAssignListParticipantsRequest**](ModAssignListParticipantsRequest.md) |  |  |

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

<a id="modassignlocksubmissions"></a>
# **ModAssignLockSubmissions**
> Object ModAssignLockSubmissions (ModAssignLockSubmissionsRequest modAssignLockSubmissionsRequest)

Prevent students from making changes to a list of submissions

Prevent students from making changes to a list of submissions

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignLockSubmissionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignLockSubmissionsRequest = new ModAssignLockSubmissionsRequest(); // ModAssignLockSubmissionsRequest | 

            try
            {
                // Prevent students from making changes to a list of submissions
                Object result = apiInstance.ModAssignLockSubmissions(modAssignLockSubmissionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignLockSubmissions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignLockSubmissionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Prevent students from making changes to a list of submissions
    ApiResponse<Object> response = apiInstance.ModAssignLockSubmissionsWithHttpInfo(modAssignLockSubmissionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignLockSubmissionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignLockSubmissionsRequest** | [**ModAssignLockSubmissionsRequest**](ModAssignLockSubmissionsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modassignrevealidentities"></a>
# **ModAssignRevealIdentities**
> Object ModAssignRevealIdentities (ModAssignRevealIdentitiesRequest modAssignRevealIdentitiesRequest)

Reveal the identities for a blind marking assignment

Reveal the identities for a blind marking assignment

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignRevealIdentitiesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignRevealIdentitiesRequest = new ModAssignRevealIdentitiesRequest(); // ModAssignRevealIdentitiesRequest | 

            try
            {
                // Reveal the identities for a blind marking assignment
                Object result = apiInstance.ModAssignRevealIdentities(modAssignRevealIdentitiesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignRevealIdentities: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignRevealIdentitiesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Reveal the identities for a blind marking assignment
    ApiResponse<Object> response = apiInstance.ModAssignRevealIdentitiesWithHttpInfo(modAssignRevealIdentitiesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignRevealIdentitiesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignRevealIdentitiesRequest** | [**ModAssignRevealIdentitiesRequest**](ModAssignRevealIdentitiesRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modassignrevertsubmissionstodraft"></a>
# **ModAssignRevertSubmissionsToDraft**
> Object ModAssignRevertSubmissionsToDraft (ModAssignRevertSubmissionsToDraftRequest modAssignRevertSubmissionsToDraftRequest)

Reverts the list of submissions to draft status

Reverts the list of submissions to draft status

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignRevertSubmissionsToDraftExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignRevertSubmissionsToDraftRequest = new ModAssignRevertSubmissionsToDraftRequest(); // ModAssignRevertSubmissionsToDraftRequest | 

            try
            {
                // Reverts the list of submissions to draft status
                Object result = apiInstance.ModAssignRevertSubmissionsToDraft(modAssignRevertSubmissionsToDraftRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignRevertSubmissionsToDraft: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignRevertSubmissionsToDraftWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Reverts the list of submissions to draft status
    ApiResponse<Object> response = apiInstance.ModAssignRevertSubmissionsToDraftWithHttpInfo(modAssignRevertSubmissionsToDraftRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignRevertSubmissionsToDraftWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignRevertSubmissionsToDraftRequest** | [**ModAssignRevertSubmissionsToDraftRequest**](ModAssignRevertSubmissionsToDraftRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modassignsavegrade"></a>
# **ModAssignSaveGrade**
> Object ModAssignSaveGrade (ModAssignSaveGradeRequest modAssignSaveGradeRequest)

Save a grade update for a single student.

Save a grade update for a single student.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignSaveGradeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignSaveGradeRequest = new ModAssignSaveGradeRequest(); // ModAssignSaveGradeRequest | 

            try
            {
                // Save a grade update for a single student.
                Object result = apiInstance.ModAssignSaveGrade(modAssignSaveGradeRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignSaveGrade: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignSaveGradeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Save a grade update for a single student.
    ApiResponse<Object> response = apiInstance.ModAssignSaveGradeWithHttpInfo(modAssignSaveGradeRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignSaveGradeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignSaveGradeRequest** | [**ModAssignSaveGradeRequest**](ModAssignSaveGradeRequest.md) |  |  |

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

<a id="modassignsavegrades"></a>
# **ModAssignSaveGrades**
> Object ModAssignSaveGrades (ModAssignSaveGradesRequest modAssignSaveGradesRequest)

Save multiple grade updates for an assignment.

Save multiple grade updates for an assignment.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignSaveGradesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignSaveGradesRequest = new ModAssignSaveGradesRequest(); // ModAssignSaveGradesRequest | 

            try
            {
                // Save multiple grade updates for an assignment.
                Object result = apiInstance.ModAssignSaveGrades(modAssignSaveGradesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignSaveGrades: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignSaveGradesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Save multiple grade updates for an assignment.
    ApiResponse<Object> response = apiInstance.ModAssignSaveGradesWithHttpInfo(modAssignSaveGradesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignSaveGradesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignSaveGradesRequest** | [**ModAssignSaveGradesRequest**](ModAssignSaveGradesRequest.md) |  |  |

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

<a id="modassignsavesubmission"></a>
# **ModAssignSaveSubmission**
> Object ModAssignSaveSubmission (ModAssignSaveSubmissionRequest modAssignSaveSubmissionRequest)

Update the current students submission

Update the current students submission

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignSaveSubmissionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignSaveSubmissionRequest = new ModAssignSaveSubmissionRequest(); // ModAssignSaveSubmissionRequest | 

            try
            {
                // Update the current students submission
                Object result = apiInstance.ModAssignSaveSubmission(modAssignSaveSubmissionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignSaveSubmission: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignSaveSubmissionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update the current students submission
    ApiResponse<Object> response = apiInstance.ModAssignSaveSubmissionWithHttpInfo(modAssignSaveSubmissionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignSaveSubmissionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignSaveSubmissionRequest** | [**ModAssignSaveSubmissionRequest**](ModAssignSaveSubmissionRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modassignsaveuserextensions"></a>
# **ModAssignSaveUserExtensions**
> Object ModAssignSaveUserExtensions (ModAssignSaveUserExtensionsRequest modAssignSaveUserExtensionsRequest)

Save a list of assignment extensions

Save a list of assignment extensions

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignSaveUserExtensionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignSaveUserExtensionsRequest = new ModAssignSaveUserExtensionsRequest(); // ModAssignSaveUserExtensionsRequest | 

            try
            {
                // Save a list of assignment extensions
                Object result = apiInstance.ModAssignSaveUserExtensions(modAssignSaveUserExtensionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignSaveUserExtensions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignSaveUserExtensionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Save a list of assignment extensions
    ApiResponse<Object> response = apiInstance.ModAssignSaveUserExtensionsWithHttpInfo(modAssignSaveUserExtensionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignSaveUserExtensionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignSaveUserExtensionsRequest** | [**ModAssignSaveUserExtensionsRequest**](ModAssignSaveUserExtensionsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modassignsetuserflags"></a>
# **ModAssignSetUserFlags**
> Object ModAssignSetUserFlags (ModAssignSetUserFlagsRequest modAssignSetUserFlagsRequest)

Creates or updates user flags

Creates or updates user flags

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignSetUserFlagsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignSetUserFlagsRequest = new ModAssignSetUserFlagsRequest(); // ModAssignSetUserFlagsRequest | 

            try
            {
                // Creates or updates user flags
                Object result = apiInstance.ModAssignSetUserFlags(modAssignSetUserFlagsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignSetUserFlags: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignSetUserFlagsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Creates or updates user flags
    ApiResponse<Object> response = apiInstance.ModAssignSetUserFlagsWithHttpInfo(modAssignSetUserFlagsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignSetUserFlagsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignSetUserFlagsRequest** | [**ModAssignSetUserFlagsRequest**](ModAssignSetUserFlagsRequest.md) |  |  |

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

<a id="modassignstartsubmission"></a>
# **ModAssignStartSubmission**
> ModAssignStartSubmission200Response ModAssignStartSubmission (ModAssignStartSubmissionRequest modAssignStartSubmissionRequest)

Start a submission for user if assignment has a time limit.

Start a submission for user if assignment has a time limit.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignStartSubmissionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignStartSubmissionRequest = new ModAssignStartSubmissionRequest(); // ModAssignStartSubmissionRequest | 

            try
            {
                // Start a submission for user if assignment has a time limit.
                ModAssignStartSubmission200Response result = apiInstance.ModAssignStartSubmission(modAssignStartSubmissionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignStartSubmission: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignStartSubmissionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Start a submission for user if assignment has a time limit.
    ApiResponse<ModAssignStartSubmission200Response> response = apiInstance.ModAssignStartSubmissionWithHttpInfo(modAssignStartSubmissionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignStartSubmissionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignStartSubmissionRequest** | [**ModAssignStartSubmissionRequest**](ModAssignStartSubmissionRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modassignsubmitforgrading"></a>
# **ModAssignSubmitForGrading**
> Object ModAssignSubmitForGrading (ModAssignSubmitForGradingRequest modAssignSubmitForGradingRequest)

Submit the current students assignment for grading

Submit the current students assignment for grading

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignSubmitForGradingExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignSubmitForGradingRequest = new ModAssignSubmitForGradingRequest(); // ModAssignSubmitForGradingRequest | 

            try
            {
                // Submit the current students assignment for grading
                Object result = apiInstance.ModAssignSubmitForGrading(modAssignSubmitForGradingRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignSubmitForGrading: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignSubmitForGradingWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Submit the current students assignment for grading
    ApiResponse<Object> response = apiInstance.ModAssignSubmitForGradingWithHttpInfo(modAssignSubmitForGradingRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignSubmitForGradingWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignSubmitForGradingRequest** | [**ModAssignSubmitForGradingRequest**](ModAssignSubmitForGradingRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modassignsubmitgradingform"></a>
# **ModAssignSubmitGradingForm**
> Object ModAssignSubmitGradingForm (ModAssignSubmitGradingFormRequest modAssignSubmitGradingFormRequest)

Submit the grading form data via ajax

Submit the grading form data via ajax

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignSubmitGradingFormExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignSubmitGradingFormRequest = new ModAssignSubmitGradingFormRequest(); // ModAssignSubmitGradingFormRequest | 

            try
            {
                // Submit the grading form data via ajax
                Object result = apiInstance.ModAssignSubmitGradingForm(modAssignSubmitGradingFormRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignSubmitGradingForm: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignSubmitGradingFormWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Submit the grading form data via ajax
    ApiResponse<Object> response = apiInstance.ModAssignSubmitGradingFormWithHttpInfo(modAssignSubmitGradingFormRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignSubmitGradingFormWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignSubmitGradingFormRequest** | [**ModAssignSubmitGradingFormRequest**](ModAssignSubmitGradingFormRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modassignunlocksubmissions"></a>
# **ModAssignUnlockSubmissions**
> Object ModAssignUnlockSubmissions (ModAssignRevertSubmissionsToDraftRequest modAssignRevertSubmissionsToDraftRequest)

Allow students to make changes to a list of submissions

Allow students to make changes to a list of submissions

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignUnlockSubmissionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignRevertSubmissionsToDraftRequest = new ModAssignRevertSubmissionsToDraftRequest(); // ModAssignRevertSubmissionsToDraftRequest | 

            try
            {
                // Allow students to make changes to a list of submissions
                Object result = apiInstance.ModAssignUnlockSubmissions(modAssignRevertSubmissionsToDraftRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignUnlockSubmissions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignUnlockSubmissionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Allow students to make changes to a list of submissions
    ApiResponse<Object> response = apiInstance.ModAssignUnlockSubmissionsWithHttpInfo(modAssignRevertSubmissionsToDraftRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignUnlockSubmissionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignRevertSubmissionsToDraftRequest** | [**ModAssignRevertSubmissionsToDraftRequest**](ModAssignRevertSubmissionsToDraftRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modassignviewassign"></a>
# **ModAssignViewAssign**
> CoreCalendarDeleteSubscription200Response ModAssignViewAssign (ModAssignViewAssignRequest modAssignViewAssignRequest)

Update the module completion status.

Update the module completion status.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignViewAssignExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignViewAssignRequest = new ModAssignViewAssignRequest(); // ModAssignViewAssignRequest | 

            try
            {
                // Update the module completion status.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModAssignViewAssign(modAssignViewAssignRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignViewAssign: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignViewAssignWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update the module completion status.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModAssignViewAssignWithHttpInfo(modAssignViewAssignRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignViewAssignWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignViewAssignRequest** | [**ModAssignViewAssignRequest**](ModAssignViewAssignRequest.md) |  |  |

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

<a id="modassignviewgradingtable"></a>
# **ModAssignViewGradingTable**
> CoreCalendarDeleteSubscription200Response ModAssignViewGradingTable (ModAssignViewAssignRequest modAssignViewAssignRequest)

Trigger the grading_table_viewed event.

Trigger the grading_table_viewed event.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignViewGradingTableExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignViewAssignRequest = new ModAssignViewAssignRequest(); // ModAssignViewAssignRequest | 

            try
            {
                // Trigger the grading_table_viewed event.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModAssignViewGradingTable(modAssignViewAssignRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignViewGradingTable: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignViewGradingTableWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the grading_table_viewed event.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModAssignViewGradingTableWithHttpInfo(modAssignViewAssignRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignViewGradingTableWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignViewAssignRequest** | [**ModAssignViewAssignRequest**](ModAssignViewAssignRequest.md) |  |  |

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

<a id="modassignviewsubmissionstatus"></a>
# **ModAssignViewSubmissionStatus**
> CoreCalendarDeleteSubscription200Response ModAssignViewSubmissionStatus (ModAssignViewAssignRequest modAssignViewAssignRequest)

Trigger the submission status viewed event.

Trigger the submission status viewed event.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModAssignViewSubmissionStatusExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModAssignApi(config);
            var modAssignViewAssignRequest = new ModAssignViewAssignRequest(); // ModAssignViewAssignRequest | 

            try
            {
                // Trigger the submission status viewed event.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModAssignViewSubmissionStatus(modAssignViewAssignRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModAssignApi.ModAssignViewSubmissionStatus: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModAssignViewSubmissionStatusWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the submission status viewed event.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModAssignViewSubmissionStatusWithHttpInfo(modAssignViewAssignRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModAssignApi.ModAssignViewSubmissionStatusWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modAssignViewAssignRequest** | [**ModAssignViewAssignRequest**](ModAssignViewAssignRequest.md) |  |  |

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

