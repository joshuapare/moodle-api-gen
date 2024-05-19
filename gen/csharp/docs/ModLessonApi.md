# MoodleClient.Api.ModLessonApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModLessonFinishAttempt**](ModLessonApi.md#modlessonfinishattempt) | **POST** /mod_lesson_finish_attempt | Finishes the current attempt. |
| [**ModLessonGetAttemptsOverview**](ModLessonApi.md#modlessongetattemptsoverview) | **POST** /mod_lesson_get_attempts_overview | Get a list of all the attempts made by users in a lesson. |
| [**ModLessonGetContentPagesViewed**](ModLessonApi.md#modlessongetcontentpagesviewed) | **POST** /mod_lesson_get_content_pages_viewed | Return the list of content pages viewed by a user during a lesson attempt. |
| [**ModLessonGetLesson**](ModLessonApi.md#modlessongetlesson) | **POST** /mod_lesson_get_lesson | Return information of a given lesson. |
| [**ModLessonGetLessonAccessInformation**](ModLessonApi.md#modlessongetlessonaccessinformation) | **POST** /mod_lesson_get_lesson_access_information | Return access information for a given lesson. |
| [**ModLessonGetLessonsByCourses**](ModLessonApi.md#modlessongetlessonsbycourses) | **POST** /mod_lesson_get_lessons_by_courses | Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned. |
| [**ModLessonGetPageData**](ModLessonApi.md#modlessongetpagedata) | **POST** /mod_lesson_get_page_data | Return information of a given page, including its contents. |
| [**ModLessonGetPages**](ModLessonApi.md#modlessongetpages) | **POST** /mod_lesson_get_pages | Return the list of pages in a lesson (based on the user permissions). |
| [**ModLessonGetPagesPossibleJumps**](ModLessonApi.md#modlessongetpagespossiblejumps) | **POST** /mod_lesson_get_pages_possible_jumps | Return all the possible jumps for the pages in a given lesson. |
| [**ModLessonGetQuestionsAttempts**](ModLessonApi.md#modlessongetquestionsattempts) | **POST** /mod_lesson_get_questions_attempts | Return the list of questions attempts in a given lesson. |
| [**ModLessonGetUserAttempt**](ModLessonApi.md#modlessongetuserattempt) | **POST** /mod_lesson_get_user_attempt | Return information about the given user attempt (including answers). |
| [**ModLessonGetUserAttemptGrade**](ModLessonApi.md#modlessongetuserattemptgrade) | **POST** /mod_lesson_get_user_attempt_grade | Return grade information in the attempt for a given user. |
| [**ModLessonGetUserGrade**](ModLessonApi.md#modlessongetusergrade) | **POST** /mod_lesson_get_user_grade | Return the final grade in the lesson for the given user. |
| [**ModLessonGetUserTimers**](ModLessonApi.md#modlessongetusertimers) | **POST** /mod_lesson_get_user_timers | Return the timers in the current lesson for the given user. |
| [**ModLessonLaunchAttempt**](ModLessonApi.md#modlessonlaunchattempt) | **POST** /mod_lesson_launch_attempt | Starts a new attempt or continues an existing one. |
| [**ModLessonProcessPage**](ModLessonApi.md#modlessonprocesspage) | **POST** /mod_lesson_process_page | Processes page responses. |
| [**ModLessonViewLesson**](ModLessonApi.md#modlessonviewlesson) | **POST** /mod_lesson_view_lesson | Trigger the course module viewed event and update the module completion status. |

<a id="modlessonfinishattempt"></a>
# **ModLessonFinishAttempt**
> ModLessonFinishAttempt200Response ModLessonFinishAttempt (ModLessonFinishAttemptRequest modLessonFinishAttemptRequest)

Finishes the current attempt.

Finishes the current attempt.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModLessonFinishAttemptExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLessonApi(config);
            var modLessonFinishAttemptRequest = new ModLessonFinishAttemptRequest(); // ModLessonFinishAttemptRequest | 

            try
            {
                // Finishes the current attempt.
                ModLessonFinishAttempt200Response result = apiInstance.ModLessonFinishAttempt(modLessonFinishAttemptRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLessonApi.ModLessonFinishAttempt: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLessonFinishAttemptWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Finishes the current attempt.
    ApiResponse<ModLessonFinishAttempt200Response> response = apiInstance.ModLessonFinishAttemptWithHttpInfo(modLessonFinishAttemptRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLessonApi.ModLessonFinishAttemptWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLessonFinishAttemptRequest** | [**ModLessonFinishAttemptRequest**](ModLessonFinishAttemptRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modlessongetattemptsoverview"></a>
# **ModLessonGetAttemptsOverview**
> ModLessonGetAttemptsOverview200Response ModLessonGetAttemptsOverview (ModLessonGetAttemptsOverviewRequest modLessonGetAttemptsOverviewRequest)

Get a list of all the attempts made by users in a lesson.

Get a list of all the attempts made by users in a lesson.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModLessonGetAttemptsOverviewExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLessonApi(config);
            var modLessonGetAttemptsOverviewRequest = new ModLessonGetAttemptsOverviewRequest(); // ModLessonGetAttemptsOverviewRequest | 

            try
            {
                // Get a list of all the attempts made by users in a lesson.
                ModLessonGetAttemptsOverview200Response result = apiInstance.ModLessonGetAttemptsOverview(modLessonGetAttemptsOverviewRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLessonApi.ModLessonGetAttemptsOverview: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLessonGetAttemptsOverviewWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get a list of all the attempts made by users in a lesson.
    ApiResponse<ModLessonGetAttemptsOverview200Response> response = apiInstance.ModLessonGetAttemptsOverviewWithHttpInfo(modLessonGetAttemptsOverviewRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLessonApi.ModLessonGetAttemptsOverviewWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLessonGetAttemptsOverviewRequest** | [**ModLessonGetAttemptsOverviewRequest**](ModLessonGetAttemptsOverviewRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modlessongetcontentpagesviewed"></a>
# **ModLessonGetContentPagesViewed**
> ModLessonGetContentPagesViewed200Response ModLessonGetContentPagesViewed (ModLessonGetContentPagesViewedRequest modLessonGetContentPagesViewedRequest)

Return the list of content pages viewed by a user during a lesson attempt.

Return the list of content pages viewed by a user during a lesson attempt.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModLessonGetContentPagesViewedExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLessonApi(config);
            var modLessonGetContentPagesViewedRequest = new ModLessonGetContentPagesViewedRequest(); // ModLessonGetContentPagesViewedRequest | 

            try
            {
                // Return the list of content pages viewed by a user during a lesson attempt.
                ModLessonGetContentPagesViewed200Response result = apiInstance.ModLessonGetContentPagesViewed(modLessonGetContentPagesViewedRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLessonApi.ModLessonGetContentPagesViewed: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLessonGetContentPagesViewedWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return the list of content pages viewed by a user during a lesson attempt.
    ApiResponse<ModLessonGetContentPagesViewed200Response> response = apiInstance.ModLessonGetContentPagesViewedWithHttpInfo(modLessonGetContentPagesViewedRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLessonApi.ModLessonGetContentPagesViewedWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLessonGetContentPagesViewedRequest** | [**ModLessonGetContentPagesViewedRequest**](ModLessonGetContentPagesViewedRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modlessongetlesson"></a>
# **ModLessonGetLesson**
> ModLessonGetLesson200Response ModLessonGetLesson (ModLessonGetLessonRequest modLessonGetLessonRequest)

Return information of a given lesson.

Return information of a given lesson.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModLessonGetLessonExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLessonApi(config);
            var modLessonGetLessonRequest = new ModLessonGetLessonRequest(); // ModLessonGetLessonRequest | 

            try
            {
                // Return information of a given lesson.
                ModLessonGetLesson200Response result = apiInstance.ModLessonGetLesson(modLessonGetLessonRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLessonApi.ModLessonGetLesson: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLessonGetLessonWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return information of a given lesson.
    ApiResponse<ModLessonGetLesson200Response> response = apiInstance.ModLessonGetLessonWithHttpInfo(modLessonGetLessonRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLessonApi.ModLessonGetLessonWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLessonGetLessonRequest** | [**ModLessonGetLessonRequest**](ModLessonGetLessonRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modlessongetlessonaccessinformation"></a>
# **ModLessonGetLessonAccessInformation**
> ModLessonGetLessonAccessInformation200Response ModLessonGetLessonAccessInformation (ModLessonGetLessonAccessInformationRequest modLessonGetLessonAccessInformationRequest)

Return access information for a given lesson.

Return access information for a given lesson.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModLessonGetLessonAccessInformationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLessonApi(config);
            var modLessonGetLessonAccessInformationRequest = new ModLessonGetLessonAccessInformationRequest(); // ModLessonGetLessonAccessInformationRequest | 

            try
            {
                // Return access information for a given lesson.
                ModLessonGetLessonAccessInformation200Response result = apiInstance.ModLessonGetLessonAccessInformation(modLessonGetLessonAccessInformationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLessonApi.ModLessonGetLessonAccessInformation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLessonGetLessonAccessInformationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return access information for a given lesson.
    ApiResponse<ModLessonGetLessonAccessInformation200Response> response = apiInstance.ModLessonGetLessonAccessInformationWithHttpInfo(modLessonGetLessonAccessInformationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLessonApi.ModLessonGetLessonAccessInformationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLessonGetLessonAccessInformationRequest** | [**ModLessonGetLessonAccessInformationRequest**](ModLessonGetLessonAccessInformationRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modlessongetlessonsbycourses"></a>
# **ModLessonGetLessonsByCourses**
> ModLessonGetLessonsByCourses200Response ModLessonGetLessonsByCourses (ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest)

Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.

Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModLessonGetLessonsByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLessonApi(config);
            var modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 

            try
            {
                // Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.
                ModLessonGetLessonsByCourses200Response result = apiInstance.ModLessonGetLessonsByCourses(modChatGetChatsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLessonApi.ModLessonGetLessonsByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLessonGetLessonsByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.
    ApiResponse<ModLessonGetLessonsByCourses200Response> response = apiInstance.ModLessonGetLessonsByCoursesWithHttpInfo(modChatGetChatsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLessonApi.ModLessonGetLessonsByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modlessongetpagedata"></a>
# **ModLessonGetPageData**
> ModLessonGetPageData200Response ModLessonGetPageData (ModLessonGetPageDataRequest modLessonGetPageDataRequest)

Return information of a given page, including its contents.

Return information of a given page, including its contents.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModLessonGetPageDataExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLessonApi(config);
            var modLessonGetPageDataRequest = new ModLessonGetPageDataRequest(); // ModLessonGetPageDataRequest | 

            try
            {
                // Return information of a given page, including its contents.
                ModLessonGetPageData200Response result = apiInstance.ModLessonGetPageData(modLessonGetPageDataRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLessonApi.ModLessonGetPageData: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLessonGetPageDataWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return information of a given page, including its contents.
    ApiResponse<ModLessonGetPageData200Response> response = apiInstance.ModLessonGetPageDataWithHttpInfo(modLessonGetPageDataRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLessonApi.ModLessonGetPageDataWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLessonGetPageDataRequest** | [**ModLessonGetPageDataRequest**](ModLessonGetPageDataRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modlessongetpages"></a>
# **ModLessonGetPages**
> ModLessonGetPages200Response ModLessonGetPages (ModLessonGetPagesRequest modLessonGetPagesRequest)

Return the list of pages in a lesson (based on the user permissions).

Return the list of pages in a lesson (based on the user permissions).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModLessonGetPagesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLessonApi(config);
            var modLessonGetPagesRequest = new ModLessonGetPagesRequest(); // ModLessonGetPagesRequest | 

            try
            {
                // Return the list of pages in a lesson (based on the user permissions).
                ModLessonGetPages200Response result = apiInstance.ModLessonGetPages(modLessonGetPagesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLessonApi.ModLessonGetPages: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLessonGetPagesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return the list of pages in a lesson (based on the user permissions).
    ApiResponse<ModLessonGetPages200Response> response = apiInstance.ModLessonGetPagesWithHttpInfo(modLessonGetPagesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLessonApi.ModLessonGetPagesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLessonGetPagesRequest** | [**ModLessonGetPagesRequest**](ModLessonGetPagesRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modlessongetpagespossiblejumps"></a>
# **ModLessonGetPagesPossibleJumps**
> ModLessonGetPagesPossibleJumps200Response ModLessonGetPagesPossibleJumps (ModLessonGetLessonAccessInformationRequest modLessonGetLessonAccessInformationRequest)

Return all the possible jumps for the pages in a given lesson.

Return all the possible jumps for the pages in a given lesson.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModLessonGetPagesPossibleJumpsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLessonApi(config);
            var modLessonGetLessonAccessInformationRequest = new ModLessonGetLessonAccessInformationRequest(); // ModLessonGetLessonAccessInformationRequest | 

            try
            {
                // Return all the possible jumps for the pages in a given lesson.
                ModLessonGetPagesPossibleJumps200Response result = apiInstance.ModLessonGetPagesPossibleJumps(modLessonGetLessonAccessInformationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLessonApi.ModLessonGetPagesPossibleJumps: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLessonGetPagesPossibleJumpsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return all the possible jumps for the pages in a given lesson.
    ApiResponse<ModLessonGetPagesPossibleJumps200Response> response = apiInstance.ModLessonGetPagesPossibleJumpsWithHttpInfo(modLessonGetLessonAccessInformationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLessonApi.ModLessonGetPagesPossibleJumpsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLessonGetLessonAccessInformationRequest** | [**ModLessonGetLessonAccessInformationRequest**](ModLessonGetLessonAccessInformationRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modlessongetquestionsattempts"></a>
# **ModLessonGetQuestionsAttempts**
> ModLessonGetQuestionsAttempts200Response ModLessonGetQuestionsAttempts (ModLessonGetQuestionsAttemptsRequest modLessonGetQuestionsAttemptsRequest)

Return the list of questions attempts in a given lesson.

Return the list of questions attempts in a given lesson.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModLessonGetQuestionsAttemptsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLessonApi(config);
            var modLessonGetQuestionsAttemptsRequest = new ModLessonGetQuestionsAttemptsRequest(); // ModLessonGetQuestionsAttemptsRequest | 

            try
            {
                // Return the list of questions attempts in a given lesson.
                ModLessonGetQuestionsAttempts200Response result = apiInstance.ModLessonGetQuestionsAttempts(modLessonGetQuestionsAttemptsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLessonApi.ModLessonGetQuestionsAttempts: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLessonGetQuestionsAttemptsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return the list of questions attempts in a given lesson.
    ApiResponse<ModLessonGetQuestionsAttempts200Response> response = apiInstance.ModLessonGetQuestionsAttemptsWithHttpInfo(modLessonGetQuestionsAttemptsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLessonApi.ModLessonGetQuestionsAttemptsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLessonGetQuestionsAttemptsRequest** | [**ModLessonGetQuestionsAttemptsRequest**](ModLessonGetQuestionsAttemptsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modlessongetuserattempt"></a>
# **ModLessonGetUserAttempt**
> ModLessonGetUserAttempt200Response ModLessonGetUserAttempt (ModLessonGetUserAttemptRequest modLessonGetUserAttemptRequest)

Return information about the given user attempt (including answers).

Return information about the given user attempt (including answers).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModLessonGetUserAttemptExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLessonApi(config);
            var modLessonGetUserAttemptRequest = new ModLessonGetUserAttemptRequest(); // ModLessonGetUserAttemptRequest | 

            try
            {
                // Return information about the given user attempt (including answers).
                ModLessonGetUserAttempt200Response result = apiInstance.ModLessonGetUserAttempt(modLessonGetUserAttemptRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLessonApi.ModLessonGetUserAttempt: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLessonGetUserAttemptWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return information about the given user attempt (including answers).
    ApiResponse<ModLessonGetUserAttempt200Response> response = apiInstance.ModLessonGetUserAttemptWithHttpInfo(modLessonGetUserAttemptRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLessonApi.ModLessonGetUserAttemptWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLessonGetUserAttemptRequest** | [**ModLessonGetUserAttemptRequest**](ModLessonGetUserAttemptRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modlessongetuserattemptgrade"></a>
# **ModLessonGetUserAttemptGrade**
> ModLessonGetUserAttemptGrade200Response ModLessonGetUserAttemptGrade (ModLessonGetUserAttemptGradeRequest modLessonGetUserAttemptGradeRequest)

Return grade information in the attempt for a given user.

Return grade information in the attempt for a given user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModLessonGetUserAttemptGradeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLessonApi(config);
            var modLessonGetUserAttemptGradeRequest = new ModLessonGetUserAttemptGradeRequest(); // ModLessonGetUserAttemptGradeRequest | 

            try
            {
                // Return grade information in the attempt for a given user.
                ModLessonGetUserAttemptGrade200Response result = apiInstance.ModLessonGetUserAttemptGrade(modLessonGetUserAttemptGradeRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLessonApi.ModLessonGetUserAttemptGrade: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLessonGetUserAttemptGradeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return grade information in the attempt for a given user.
    ApiResponse<ModLessonGetUserAttemptGrade200Response> response = apiInstance.ModLessonGetUserAttemptGradeWithHttpInfo(modLessonGetUserAttemptGradeRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLessonApi.ModLessonGetUserAttemptGradeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLessonGetUserAttemptGradeRequest** | [**ModLessonGetUserAttemptGradeRequest**](ModLessonGetUserAttemptGradeRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modlessongetusergrade"></a>
# **ModLessonGetUserGrade**
> ModLessonGetUserGrade200Response ModLessonGetUserGrade (ModLessonGetUserGradeRequest modLessonGetUserGradeRequest)

Return the final grade in the lesson for the given user.

Return the final grade in the lesson for the given user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModLessonGetUserGradeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLessonApi(config);
            var modLessonGetUserGradeRequest = new ModLessonGetUserGradeRequest(); // ModLessonGetUserGradeRequest | 

            try
            {
                // Return the final grade in the lesson for the given user.
                ModLessonGetUserGrade200Response result = apiInstance.ModLessonGetUserGrade(modLessonGetUserGradeRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLessonApi.ModLessonGetUserGrade: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLessonGetUserGradeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return the final grade in the lesson for the given user.
    ApiResponse<ModLessonGetUserGrade200Response> response = apiInstance.ModLessonGetUserGradeWithHttpInfo(modLessonGetUserGradeRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLessonApi.ModLessonGetUserGradeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLessonGetUserGradeRequest** | [**ModLessonGetUserGradeRequest**](ModLessonGetUserGradeRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modlessongetusertimers"></a>
# **ModLessonGetUserTimers**
> ModLessonGetUserTimers200Response ModLessonGetUserTimers (ModLessonGetUserGradeRequest modLessonGetUserGradeRequest)

Return the timers in the current lesson for the given user.

Return the timers in the current lesson for the given user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModLessonGetUserTimersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLessonApi(config);
            var modLessonGetUserGradeRequest = new ModLessonGetUserGradeRequest(); // ModLessonGetUserGradeRequest | 

            try
            {
                // Return the timers in the current lesson for the given user.
                ModLessonGetUserTimers200Response result = apiInstance.ModLessonGetUserTimers(modLessonGetUserGradeRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLessonApi.ModLessonGetUserTimers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLessonGetUserTimersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return the timers in the current lesson for the given user.
    ApiResponse<ModLessonGetUserTimers200Response> response = apiInstance.ModLessonGetUserTimersWithHttpInfo(modLessonGetUserGradeRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLessonApi.ModLessonGetUserTimersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLessonGetUserGradeRequest** | [**ModLessonGetUserGradeRequest**](ModLessonGetUserGradeRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modlessonlaunchattempt"></a>
# **ModLessonLaunchAttempt**
> ModLessonLaunchAttempt200Response ModLessonLaunchAttempt (ModLessonLaunchAttemptRequest modLessonLaunchAttemptRequest)

Starts a new attempt or continues an existing one.

Starts a new attempt or continues an existing one.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModLessonLaunchAttemptExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLessonApi(config);
            var modLessonLaunchAttemptRequest = new ModLessonLaunchAttemptRequest(); // ModLessonLaunchAttemptRequest | 

            try
            {
                // Starts a new attempt or continues an existing one.
                ModLessonLaunchAttempt200Response result = apiInstance.ModLessonLaunchAttempt(modLessonLaunchAttemptRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLessonApi.ModLessonLaunchAttempt: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLessonLaunchAttemptWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Starts a new attempt or continues an existing one.
    ApiResponse<ModLessonLaunchAttempt200Response> response = apiInstance.ModLessonLaunchAttemptWithHttpInfo(modLessonLaunchAttemptRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLessonApi.ModLessonLaunchAttemptWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLessonLaunchAttemptRequest** | [**ModLessonLaunchAttemptRequest**](ModLessonLaunchAttemptRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modlessonprocesspage"></a>
# **ModLessonProcessPage**
> ModLessonProcessPage200Response ModLessonProcessPage (ModLessonProcessPageRequest modLessonProcessPageRequest)

Processes page responses.

Processes page responses.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModLessonProcessPageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLessonApi(config);
            var modLessonProcessPageRequest = new ModLessonProcessPageRequest(); // ModLessonProcessPageRequest | 

            try
            {
                // Processes page responses.
                ModLessonProcessPage200Response result = apiInstance.ModLessonProcessPage(modLessonProcessPageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLessonApi.ModLessonProcessPage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLessonProcessPageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Processes page responses.
    ApiResponse<ModLessonProcessPage200Response> response = apiInstance.ModLessonProcessPageWithHttpInfo(modLessonProcessPageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLessonApi.ModLessonProcessPageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLessonProcessPageRequest** | [**ModLessonProcessPageRequest**](ModLessonProcessPageRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modlessonviewlesson"></a>
# **ModLessonViewLesson**
> CoreCalendarDeleteSubscription200Response ModLessonViewLesson (ModLessonGetLessonRequest modLessonGetLessonRequest)

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
    public class ModLessonViewLessonExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLessonApi(config);
            var modLessonGetLessonRequest = new ModLessonGetLessonRequest(); // ModLessonGetLessonRequest | 

            try
            {
                // Trigger the course module viewed event and update the module completion status.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModLessonViewLesson(modLessonGetLessonRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLessonApi.ModLessonViewLesson: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLessonViewLessonWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the course module viewed event and update the module completion status.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModLessonViewLessonWithHttpInfo(modLessonGetLessonRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLessonApi.ModLessonViewLessonWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLessonGetLessonRequest** | [**ModLessonGetLessonRequest**](ModLessonGetLessonRequest.md) |  |  |

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

