# Org.OpenAPITools.Api.ModFeedbackApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModFeedbackGetAnalysis**](ModFeedbackApi.md#modfeedbackgetanalysis) | **POST** /mod_feedback_get_analysis | Retrieves the feedback analysis. |
| [**ModFeedbackGetCurrentCompletedTmp**](ModFeedbackApi.md#modfeedbackgetcurrentcompletedtmp) | **POST** /mod_feedback_get_current_completed_tmp | Returns the temporary completion record for the current user. |
| [**ModFeedbackGetFeedbackAccessInformation**](ModFeedbackApi.md#modfeedbackgetfeedbackaccessinformation) | **POST** /mod_feedback_get_feedback_access_information | Return access information for a given feedback. |
| [**ModFeedbackGetFeedbacksByCourses**](ModFeedbackApi.md#modfeedbackgetfeedbacksbycourses) | **POST** /mod_feedback_get_feedbacks_by_courses | Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned. |
| [**ModFeedbackGetFinishedResponses**](ModFeedbackApi.md#modfeedbackgetfinishedresponses) | **POST** /mod_feedback_get_finished_responses | Retrieves responses from the last finished attempt. |
| [**ModFeedbackGetItems**](ModFeedbackApi.md#modfeedbackgetitems) | **POST** /mod_feedback_get_items | Returns the items (questions) in the given feedback. |
| [**ModFeedbackGetLastCompleted**](ModFeedbackApi.md#modfeedbackgetlastcompleted) | **POST** /mod_feedback_get_last_completed | Retrieves the last completion record for the current user. |
| [**ModFeedbackGetNonRespondents**](ModFeedbackApi.md#modfeedbackgetnonrespondents) | **POST** /mod_feedback_get_non_respondents | Retrieves a list of students who didn&#39;t submit the feedback. |
| [**ModFeedbackGetPageItems**](ModFeedbackApi.md#modfeedbackgetpageitems) | **POST** /mod_feedback_get_page_items | Get a single feedback page items. |
| [**ModFeedbackGetResponsesAnalysis**](ModFeedbackApi.md#modfeedbackgetresponsesanalysis) | **POST** /mod_feedback_get_responses_analysis | Return the feedback user responses analysis. |
| [**ModFeedbackGetUnfinishedResponses**](ModFeedbackApi.md#modfeedbackgetunfinishedresponses) | **POST** /mod_feedback_get_unfinished_responses | Retrieves responses from the current unfinished attempt. |
| [**ModFeedbackLaunchFeedback**](ModFeedbackApi.md#modfeedbacklaunchfeedback) | **POST** /mod_feedback_launch_feedback | Starts or continues a feedback submission. |
| [**ModFeedbackProcessPage**](ModFeedbackApi.md#modfeedbackprocesspage) | **POST** /mod_feedback_process_page | Process a jump between pages. |
| [**ModFeedbackViewFeedback**](ModFeedbackApi.md#modfeedbackviewfeedback) | **POST** /mod_feedback_view_feedback | Trigger the course module viewed event and update the module completion status. |

<a id="modfeedbackgetanalysis"></a>
# **ModFeedbackGetAnalysis**
> ModFeedbackGetAnalysis200Response ModFeedbackGetAnalysis (ModFeedbackGetAnalysisRequest modFeedbackGetAnalysisRequest)

Retrieves the feedback analysis.

Retrieves the feedback analysis.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModFeedbackGetAnalysisExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModFeedbackApi(config);
            var modFeedbackGetAnalysisRequest = new ModFeedbackGetAnalysisRequest(); // ModFeedbackGetAnalysisRequest | 

            try
            {
                // Retrieves the feedback analysis.
                ModFeedbackGetAnalysis200Response result = apiInstance.ModFeedbackGetAnalysis(modFeedbackGetAnalysisRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetAnalysis: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModFeedbackGetAnalysisWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieves the feedback analysis.
    ApiResponse<ModFeedbackGetAnalysis200Response> response = apiInstance.ModFeedbackGetAnalysisWithHttpInfo(modFeedbackGetAnalysisRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetAnalysisWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modFeedbackGetAnalysisRequest** | [**ModFeedbackGetAnalysisRequest**](ModFeedbackGetAnalysisRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modfeedbackgetcurrentcompletedtmp"></a>
# **ModFeedbackGetCurrentCompletedTmp**
> ModFeedbackGetCurrentCompletedTmp200Response ModFeedbackGetCurrentCompletedTmp (ModFeedbackGetCurrentCompletedTmpRequest modFeedbackGetCurrentCompletedTmpRequest)

Returns the temporary completion record for the current user.

Returns the temporary completion record for the current user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModFeedbackGetCurrentCompletedTmpExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModFeedbackApi(config);
            var modFeedbackGetCurrentCompletedTmpRequest = new ModFeedbackGetCurrentCompletedTmpRequest(); // ModFeedbackGetCurrentCompletedTmpRequest | 

            try
            {
                // Returns the temporary completion record for the current user.
                ModFeedbackGetCurrentCompletedTmp200Response result = apiInstance.ModFeedbackGetCurrentCompletedTmp(modFeedbackGetCurrentCompletedTmpRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetCurrentCompletedTmp: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModFeedbackGetCurrentCompletedTmpWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns the temporary completion record for the current user.
    ApiResponse<ModFeedbackGetCurrentCompletedTmp200Response> response = apiInstance.ModFeedbackGetCurrentCompletedTmpWithHttpInfo(modFeedbackGetCurrentCompletedTmpRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetCurrentCompletedTmpWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modFeedbackGetCurrentCompletedTmpRequest** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modfeedbackgetfeedbackaccessinformation"></a>
# **ModFeedbackGetFeedbackAccessInformation**
> ModFeedbackGetFeedbackAccessInformation200Response ModFeedbackGetFeedbackAccessInformation (ModFeedbackGetFeedbackAccessInformationRequest modFeedbackGetFeedbackAccessInformationRequest)

Return access information for a given feedback.

Return access information for a given feedback.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModFeedbackGetFeedbackAccessInformationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModFeedbackApi(config);
            var modFeedbackGetFeedbackAccessInformationRequest = new ModFeedbackGetFeedbackAccessInformationRequest(); // ModFeedbackGetFeedbackAccessInformationRequest | 

            try
            {
                // Return access information for a given feedback.
                ModFeedbackGetFeedbackAccessInformation200Response result = apiInstance.ModFeedbackGetFeedbackAccessInformation(modFeedbackGetFeedbackAccessInformationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetFeedbackAccessInformation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModFeedbackGetFeedbackAccessInformationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return access information for a given feedback.
    ApiResponse<ModFeedbackGetFeedbackAccessInformation200Response> response = apiInstance.ModFeedbackGetFeedbackAccessInformationWithHttpInfo(modFeedbackGetFeedbackAccessInformationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetFeedbackAccessInformationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modFeedbackGetFeedbackAccessInformationRequest** | [**ModFeedbackGetFeedbackAccessInformationRequest**](ModFeedbackGetFeedbackAccessInformationRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modfeedbackgetfeedbacksbycourses"></a>
# **ModFeedbackGetFeedbacksByCourses**
> ModFeedbackGetFeedbacksByCourses200Response ModFeedbackGetFeedbacksByCourses (ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest)

Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.

Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModFeedbackGetFeedbacksByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModFeedbackApi(config);
            var modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = new ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 

            try
            {
                // Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.
                ModFeedbackGetFeedbacksByCourses200Response result = apiInstance.ModFeedbackGetFeedbacksByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetFeedbacksByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModFeedbackGetFeedbacksByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.
    ApiResponse<ModFeedbackGetFeedbacksByCourses200Response> response = apiInstance.ModFeedbackGetFeedbacksByCoursesWithHttpInfo(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetFeedbacksByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modfeedbackgetfinishedresponses"></a>
# **ModFeedbackGetFinishedResponses**
> ModFeedbackGetFinishedResponses200Response ModFeedbackGetFinishedResponses (ModFeedbackGetFinishedResponsesRequest modFeedbackGetFinishedResponsesRequest)

Retrieves responses from the last finished attempt.

Retrieves responses from the last finished attempt.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModFeedbackGetFinishedResponsesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModFeedbackApi(config);
            var modFeedbackGetFinishedResponsesRequest = new ModFeedbackGetFinishedResponsesRequest(); // ModFeedbackGetFinishedResponsesRequest | 

            try
            {
                // Retrieves responses from the last finished attempt.
                ModFeedbackGetFinishedResponses200Response result = apiInstance.ModFeedbackGetFinishedResponses(modFeedbackGetFinishedResponsesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetFinishedResponses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModFeedbackGetFinishedResponsesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieves responses from the last finished attempt.
    ApiResponse<ModFeedbackGetFinishedResponses200Response> response = apiInstance.ModFeedbackGetFinishedResponsesWithHttpInfo(modFeedbackGetFinishedResponsesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetFinishedResponsesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modFeedbackGetFinishedResponsesRequest** | [**ModFeedbackGetFinishedResponsesRequest**](ModFeedbackGetFinishedResponsesRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modfeedbackgetitems"></a>
# **ModFeedbackGetItems**
> ModFeedbackGetItems200Response ModFeedbackGetItems (ModFeedbackGetCurrentCompletedTmpRequest modFeedbackGetCurrentCompletedTmpRequest)

Returns the items (questions) in the given feedback.

Returns the items (questions) in the given feedback.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModFeedbackGetItemsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModFeedbackApi(config);
            var modFeedbackGetCurrentCompletedTmpRequest = new ModFeedbackGetCurrentCompletedTmpRequest(); // ModFeedbackGetCurrentCompletedTmpRequest | 

            try
            {
                // Returns the items (questions) in the given feedback.
                ModFeedbackGetItems200Response result = apiInstance.ModFeedbackGetItems(modFeedbackGetCurrentCompletedTmpRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetItems: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModFeedbackGetItemsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns the items (questions) in the given feedback.
    ApiResponse<ModFeedbackGetItems200Response> response = apiInstance.ModFeedbackGetItemsWithHttpInfo(modFeedbackGetCurrentCompletedTmpRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetItemsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modFeedbackGetCurrentCompletedTmpRequest** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modfeedbackgetlastcompleted"></a>
# **ModFeedbackGetLastCompleted**
> ModFeedbackGetLastCompleted200Response ModFeedbackGetLastCompleted (ModFeedbackGetCurrentCompletedTmpRequest modFeedbackGetCurrentCompletedTmpRequest)

Retrieves the last completion record for the current user.

Retrieves the last completion record for the current user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModFeedbackGetLastCompletedExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModFeedbackApi(config);
            var modFeedbackGetCurrentCompletedTmpRequest = new ModFeedbackGetCurrentCompletedTmpRequest(); // ModFeedbackGetCurrentCompletedTmpRequest | 

            try
            {
                // Retrieves the last completion record for the current user.
                ModFeedbackGetLastCompleted200Response result = apiInstance.ModFeedbackGetLastCompleted(modFeedbackGetCurrentCompletedTmpRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetLastCompleted: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModFeedbackGetLastCompletedWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieves the last completion record for the current user.
    ApiResponse<ModFeedbackGetLastCompleted200Response> response = apiInstance.ModFeedbackGetLastCompletedWithHttpInfo(modFeedbackGetCurrentCompletedTmpRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetLastCompletedWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modFeedbackGetCurrentCompletedTmpRequest** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modfeedbackgetnonrespondents"></a>
# **ModFeedbackGetNonRespondents**
> ModFeedbackGetNonRespondents200Response ModFeedbackGetNonRespondents (ModFeedbackGetNonRespondentsRequest modFeedbackGetNonRespondentsRequest)

Retrieves a list of students who didn't submit the feedback.

Retrieves a list of students who didn't submit the feedback.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModFeedbackGetNonRespondentsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModFeedbackApi(config);
            var modFeedbackGetNonRespondentsRequest = new ModFeedbackGetNonRespondentsRequest(); // ModFeedbackGetNonRespondentsRequest | 

            try
            {
                // Retrieves a list of students who didn't submit the feedback.
                ModFeedbackGetNonRespondents200Response result = apiInstance.ModFeedbackGetNonRespondents(modFeedbackGetNonRespondentsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetNonRespondents: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModFeedbackGetNonRespondentsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieves a list of students who didn't submit the feedback.
    ApiResponse<ModFeedbackGetNonRespondents200Response> response = apiInstance.ModFeedbackGetNonRespondentsWithHttpInfo(modFeedbackGetNonRespondentsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetNonRespondentsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modFeedbackGetNonRespondentsRequest** | [**ModFeedbackGetNonRespondentsRequest**](ModFeedbackGetNonRespondentsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modfeedbackgetpageitems"></a>
# **ModFeedbackGetPageItems**
> ModFeedbackGetPageItems200Response ModFeedbackGetPageItems (ModFeedbackGetPageItemsRequest modFeedbackGetPageItemsRequest)

Get a single feedback page items.

Get a single feedback page items.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModFeedbackGetPageItemsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModFeedbackApi(config);
            var modFeedbackGetPageItemsRequest = new ModFeedbackGetPageItemsRequest(); // ModFeedbackGetPageItemsRequest | 

            try
            {
                // Get a single feedback page items.
                ModFeedbackGetPageItems200Response result = apiInstance.ModFeedbackGetPageItems(modFeedbackGetPageItemsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetPageItems: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModFeedbackGetPageItemsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get a single feedback page items.
    ApiResponse<ModFeedbackGetPageItems200Response> response = apiInstance.ModFeedbackGetPageItemsWithHttpInfo(modFeedbackGetPageItemsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetPageItemsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modFeedbackGetPageItemsRequest** | [**ModFeedbackGetPageItemsRequest**](ModFeedbackGetPageItemsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modfeedbackgetresponsesanalysis"></a>
# **ModFeedbackGetResponsesAnalysis**
> ModFeedbackGetResponsesAnalysis200Response ModFeedbackGetResponsesAnalysis (ModFeedbackGetResponsesAnalysisRequest modFeedbackGetResponsesAnalysisRequest)

Return the feedback user responses analysis.

Return the feedback user responses analysis.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModFeedbackGetResponsesAnalysisExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModFeedbackApi(config);
            var modFeedbackGetResponsesAnalysisRequest = new ModFeedbackGetResponsesAnalysisRequest(); // ModFeedbackGetResponsesAnalysisRequest | 

            try
            {
                // Return the feedback user responses analysis.
                ModFeedbackGetResponsesAnalysis200Response result = apiInstance.ModFeedbackGetResponsesAnalysis(modFeedbackGetResponsesAnalysisRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetResponsesAnalysis: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModFeedbackGetResponsesAnalysisWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return the feedback user responses analysis.
    ApiResponse<ModFeedbackGetResponsesAnalysis200Response> response = apiInstance.ModFeedbackGetResponsesAnalysisWithHttpInfo(modFeedbackGetResponsesAnalysisRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetResponsesAnalysisWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modFeedbackGetResponsesAnalysisRequest** | [**ModFeedbackGetResponsesAnalysisRequest**](ModFeedbackGetResponsesAnalysisRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modfeedbackgetunfinishedresponses"></a>
# **ModFeedbackGetUnfinishedResponses**
> ModFeedbackGetUnfinishedResponses200Response ModFeedbackGetUnfinishedResponses (ModFeedbackGetFinishedResponsesRequest modFeedbackGetFinishedResponsesRequest)

Retrieves responses from the current unfinished attempt.

Retrieves responses from the current unfinished attempt.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModFeedbackGetUnfinishedResponsesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModFeedbackApi(config);
            var modFeedbackGetFinishedResponsesRequest = new ModFeedbackGetFinishedResponsesRequest(); // ModFeedbackGetFinishedResponsesRequest | 

            try
            {
                // Retrieves responses from the current unfinished attempt.
                ModFeedbackGetUnfinishedResponses200Response result = apiInstance.ModFeedbackGetUnfinishedResponses(modFeedbackGetFinishedResponsesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetUnfinishedResponses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModFeedbackGetUnfinishedResponsesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieves responses from the current unfinished attempt.
    ApiResponse<ModFeedbackGetUnfinishedResponses200Response> response = apiInstance.ModFeedbackGetUnfinishedResponsesWithHttpInfo(modFeedbackGetFinishedResponsesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackGetUnfinishedResponsesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modFeedbackGetFinishedResponsesRequest** | [**ModFeedbackGetFinishedResponsesRequest**](ModFeedbackGetFinishedResponsesRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modfeedbacklaunchfeedback"></a>
# **ModFeedbackLaunchFeedback**
> ModFeedbackLaunchFeedback200Response ModFeedbackLaunchFeedback (ModFeedbackGetCurrentCompletedTmpRequest modFeedbackGetCurrentCompletedTmpRequest)

Starts or continues a feedback submission.

Starts or continues a feedback submission.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModFeedbackLaunchFeedbackExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModFeedbackApi(config);
            var modFeedbackGetCurrentCompletedTmpRequest = new ModFeedbackGetCurrentCompletedTmpRequest(); // ModFeedbackGetCurrentCompletedTmpRequest | 

            try
            {
                // Starts or continues a feedback submission.
                ModFeedbackLaunchFeedback200Response result = apiInstance.ModFeedbackLaunchFeedback(modFeedbackGetCurrentCompletedTmpRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackLaunchFeedback: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModFeedbackLaunchFeedbackWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Starts or continues a feedback submission.
    ApiResponse<ModFeedbackLaunchFeedback200Response> response = apiInstance.ModFeedbackLaunchFeedbackWithHttpInfo(modFeedbackGetCurrentCompletedTmpRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackLaunchFeedbackWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modFeedbackGetCurrentCompletedTmpRequest** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modfeedbackprocesspage"></a>
# **ModFeedbackProcessPage**
> ModFeedbackProcessPage200Response ModFeedbackProcessPage (ModFeedbackProcessPageRequest modFeedbackProcessPageRequest)

Process a jump between pages.

Process a jump between pages.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModFeedbackProcessPageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModFeedbackApi(config);
            var modFeedbackProcessPageRequest = new ModFeedbackProcessPageRequest(); // ModFeedbackProcessPageRequest | 

            try
            {
                // Process a jump between pages.
                ModFeedbackProcessPage200Response result = apiInstance.ModFeedbackProcessPage(modFeedbackProcessPageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackProcessPage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModFeedbackProcessPageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Process a jump between pages.
    ApiResponse<ModFeedbackProcessPage200Response> response = apiInstance.ModFeedbackProcessPageWithHttpInfo(modFeedbackProcessPageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackProcessPageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modFeedbackProcessPageRequest** | [**ModFeedbackProcessPageRequest**](ModFeedbackProcessPageRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modfeedbackviewfeedback"></a>
# **ModFeedbackViewFeedback**
> CoreCalendarDeleteSubscription200Response ModFeedbackViewFeedback (ModFeedbackViewFeedbackRequest modFeedbackViewFeedbackRequest)

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
    public class ModFeedbackViewFeedbackExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModFeedbackApi(config);
            var modFeedbackViewFeedbackRequest = new ModFeedbackViewFeedbackRequest(); // ModFeedbackViewFeedbackRequest | 

            try
            {
                // Trigger the course module viewed event and update the module completion status.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModFeedbackViewFeedback(modFeedbackViewFeedbackRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackViewFeedback: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModFeedbackViewFeedbackWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the course module viewed event and update the module completion status.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModFeedbackViewFeedbackWithHttpInfo(modFeedbackViewFeedbackRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModFeedbackApi.ModFeedbackViewFeedbackWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modFeedbackViewFeedbackRequest** | [**ModFeedbackViewFeedbackRequest**](ModFeedbackViewFeedbackRequest.md) |  |  |

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

