# MoodleClient.Api.ModBigbluebuttonbnApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModBigbluebuttonbnCanJoin**](ModBigbluebuttonbnApi.md#modbigbluebuttonbncanjoin) | **POST** /mod_bigbluebuttonbn_can_join | Returns information if the current user can join or not. |
| [**ModBigbluebuttonbnCompletionValidate**](ModBigbluebuttonbnApi.md#modbigbluebuttonbncompletionvalidate) | **POST** /mod_bigbluebuttonbn_completion_validate | Validate completion |
| [**ModBigbluebuttonbnEndMeeting**](ModBigbluebuttonbnApi.md#modbigbluebuttonbnendmeeting) | **POST** /mod_bigbluebuttonbn_end_meeting | End a meeting |
| [**ModBigbluebuttonbnGetBigbluebuttonbnsByCourses**](ModBigbluebuttonbnApi.md#modbigbluebuttonbngetbigbluebuttonbnsbycourses) | **POST** /mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses | Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned. |
| [**ModBigbluebuttonbnGetJoinUrl**](ModBigbluebuttonbnApi.md#modbigbluebuttonbngetjoinurl) | **POST** /mod_bigbluebuttonbn_get_join_url | Get the join URL for the meeting and create if it does not exist. |
| [**ModBigbluebuttonbnGetRecordings**](ModBigbluebuttonbnApi.md#modbigbluebuttonbngetrecordings) | **POST** /mod_bigbluebuttonbn_get_recordings | Returns a list of recordings ready to be processed by a datatable. |
| [**ModBigbluebuttonbnGetRecordingsToImport**](ModBigbluebuttonbnApi.md#modbigbluebuttonbngetrecordingstoimport) | **POST** /mod_bigbluebuttonbn_get_recordings_to_import | Returns a list of recordings ready to import to be processed by a datatable. |
| [**ModBigbluebuttonbnMeetingInfo**](ModBigbluebuttonbnApi.md#modbigbluebuttonbnmeetinginfo) | **POST** /mod_bigbluebuttonbn_meeting_info | Get displayable information on the meeting |
| [**ModBigbluebuttonbnUpdateRecording**](ModBigbluebuttonbnApi.md#modbigbluebuttonbnupdaterecording) | **POST** /mod_bigbluebuttonbn_update_recording | Update a single recording |
| [**ModBigbluebuttonbnViewBigbluebuttonbn**](ModBigbluebuttonbnApi.md#modbigbluebuttonbnviewbigbluebuttonbn) | **POST** /mod_bigbluebuttonbn_view_bigbluebuttonbn | Trigger the course module viewed event and update the module completion status. |

<a id="modbigbluebuttonbncanjoin"></a>
# **ModBigbluebuttonbnCanJoin**
> ModBigbluebuttonbnCanJoin200Response ModBigbluebuttonbnCanJoin (ModBigbluebuttonbnCanJoinRequest modBigbluebuttonbnCanJoinRequest)

Returns information if the current user can join or not.

Returns information if the current user can join or not.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModBigbluebuttonbnCanJoinExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModBigbluebuttonbnApi(config);
            var modBigbluebuttonbnCanJoinRequest = new ModBigbluebuttonbnCanJoinRequest(); // ModBigbluebuttonbnCanJoinRequest | 

            try
            {
                // Returns information if the current user can join or not.
                ModBigbluebuttonbnCanJoin200Response result = apiInstance.ModBigbluebuttonbnCanJoin(modBigbluebuttonbnCanJoinRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnCanJoin: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModBigbluebuttonbnCanJoinWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns information if the current user can join or not.
    ApiResponse<ModBigbluebuttonbnCanJoin200Response> response = apiInstance.ModBigbluebuttonbnCanJoinWithHttpInfo(modBigbluebuttonbnCanJoinRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnCanJoinWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBigbluebuttonbnCanJoinRequest** | [**ModBigbluebuttonbnCanJoinRequest**](ModBigbluebuttonbnCanJoinRequest.md) |  |  |

### Return type

[**ModBigbluebuttonbnCanJoin200Response**](ModBigbluebuttonbnCanJoin200Response.md)

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

<a id="modbigbluebuttonbncompletionvalidate"></a>
# **ModBigbluebuttonbnCompletionValidate**
> CoreCohortAddCohortMembers200Response ModBigbluebuttonbnCompletionValidate (ModBigbluebuttonbnCompletionValidateRequest modBigbluebuttonbnCompletionValidateRequest)

Validate completion

Validate completion

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModBigbluebuttonbnCompletionValidateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModBigbluebuttonbnApi(config);
            var modBigbluebuttonbnCompletionValidateRequest = new ModBigbluebuttonbnCompletionValidateRequest(); // ModBigbluebuttonbnCompletionValidateRequest | 

            try
            {
                // Validate completion
                CoreCohortAddCohortMembers200Response result = apiInstance.ModBigbluebuttonbnCompletionValidate(modBigbluebuttonbnCompletionValidateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnCompletionValidate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModBigbluebuttonbnCompletionValidateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Validate completion
    ApiResponse<CoreCohortAddCohortMembers200Response> response = apiInstance.ModBigbluebuttonbnCompletionValidateWithHttpInfo(modBigbluebuttonbnCompletionValidateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnCompletionValidateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBigbluebuttonbnCompletionValidateRequest** | [**ModBigbluebuttonbnCompletionValidateRequest**](ModBigbluebuttonbnCompletionValidateRequest.md) |  |  |

### Return type

[**CoreCohortAddCohortMembers200Response**](CoreCohortAddCohortMembers200Response.md)

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

<a id="modbigbluebuttonbnendmeeting"></a>
# **ModBigbluebuttonbnEndMeeting**
> CoreCohortAddCohortMembers200Response ModBigbluebuttonbnEndMeeting (ModBigbluebuttonbnEndMeetingRequest modBigbluebuttonbnEndMeetingRequest)

End a meeting

End a meeting

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModBigbluebuttonbnEndMeetingExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModBigbluebuttonbnApi(config);
            var modBigbluebuttonbnEndMeetingRequest = new ModBigbluebuttonbnEndMeetingRequest(); // ModBigbluebuttonbnEndMeetingRequest | 

            try
            {
                // End a meeting
                CoreCohortAddCohortMembers200Response result = apiInstance.ModBigbluebuttonbnEndMeeting(modBigbluebuttonbnEndMeetingRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnEndMeeting: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModBigbluebuttonbnEndMeetingWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // End a meeting
    ApiResponse<CoreCohortAddCohortMembers200Response> response = apiInstance.ModBigbluebuttonbnEndMeetingWithHttpInfo(modBigbluebuttonbnEndMeetingRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnEndMeetingWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBigbluebuttonbnEndMeetingRequest** | [**ModBigbluebuttonbnEndMeetingRequest**](ModBigbluebuttonbnEndMeetingRequest.md) |  |  |

### Return type

[**CoreCohortAddCohortMembers200Response**](CoreCohortAddCohortMembers200Response.md)

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

<a id="modbigbluebuttonbngetbigbluebuttonbnsbycourses"></a>
# **ModBigbluebuttonbnGetBigbluebuttonbnsByCourses**
> ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response ModBigbluebuttonbnGetBigbluebuttonbnsByCourses (ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest)

Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.

Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModBigbluebuttonbnApi(config);
            var modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = new ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 

            try
            {
                // Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.
                ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response result = apiInstance.ModBigbluebuttonbnGetBigbluebuttonbnsByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnGetBigbluebuttonbnsByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.
    ApiResponse<ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response> response = apiInstance.ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesWithHttpInfo(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  |  |

### Return type

[**ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response**](ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response.md)

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

<a id="modbigbluebuttonbngetjoinurl"></a>
# **ModBigbluebuttonbnGetJoinUrl**
> ModBigbluebuttonbnGetJoinUrl200Response ModBigbluebuttonbnGetJoinUrl (ModBigbluebuttonbnCanJoinRequest modBigbluebuttonbnCanJoinRequest)

Get the join URL for the meeting and create if it does not exist.

Get the join URL for the meeting and create if it does not exist.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModBigbluebuttonbnGetJoinUrlExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModBigbluebuttonbnApi(config);
            var modBigbluebuttonbnCanJoinRequest = new ModBigbluebuttonbnCanJoinRequest(); // ModBigbluebuttonbnCanJoinRequest | 

            try
            {
                // Get the join URL for the meeting and create if it does not exist.
                ModBigbluebuttonbnGetJoinUrl200Response result = apiInstance.ModBigbluebuttonbnGetJoinUrl(modBigbluebuttonbnCanJoinRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnGetJoinUrl: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModBigbluebuttonbnGetJoinUrlWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get the join URL for the meeting and create if it does not exist.
    ApiResponse<ModBigbluebuttonbnGetJoinUrl200Response> response = apiInstance.ModBigbluebuttonbnGetJoinUrlWithHttpInfo(modBigbluebuttonbnCanJoinRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnGetJoinUrlWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBigbluebuttonbnCanJoinRequest** | [**ModBigbluebuttonbnCanJoinRequest**](ModBigbluebuttonbnCanJoinRequest.md) |  |  |

### Return type

[**ModBigbluebuttonbnGetJoinUrl200Response**](ModBigbluebuttonbnGetJoinUrl200Response.md)

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

<a id="modbigbluebuttonbngetrecordings"></a>
# **ModBigbluebuttonbnGetRecordings**
> ModBigbluebuttonbnGetRecordings200Response ModBigbluebuttonbnGetRecordings (ModBigbluebuttonbnGetRecordingsRequest modBigbluebuttonbnGetRecordingsRequest)

Returns a list of recordings ready to be processed by a datatable.

Returns a list of recordings ready to be processed by a datatable.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModBigbluebuttonbnGetRecordingsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModBigbluebuttonbnApi(config);
            var modBigbluebuttonbnGetRecordingsRequest = new ModBigbluebuttonbnGetRecordingsRequest(); // ModBigbluebuttonbnGetRecordingsRequest | 

            try
            {
                // Returns a list of recordings ready to be processed by a datatable.
                ModBigbluebuttonbnGetRecordings200Response result = apiInstance.ModBigbluebuttonbnGetRecordings(modBigbluebuttonbnGetRecordingsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnGetRecordings: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModBigbluebuttonbnGetRecordingsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of recordings ready to be processed by a datatable.
    ApiResponse<ModBigbluebuttonbnGetRecordings200Response> response = apiInstance.ModBigbluebuttonbnGetRecordingsWithHttpInfo(modBigbluebuttonbnGetRecordingsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnGetRecordingsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBigbluebuttonbnGetRecordingsRequest** | [**ModBigbluebuttonbnGetRecordingsRequest**](ModBigbluebuttonbnGetRecordingsRequest.md) |  |  |

### Return type

[**ModBigbluebuttonbnGetRecordings200Response**](ModBigbluebuttonbnGetRecordings200Response.md)

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

<a id="modbigbluebuttonbngetrecordingstoimport"></a>
# **ModBigbluebuttonbnGetRecordingsToImport**
> ModBigbluebuttonbnGetRecordingsToImport200Response ModBigbluebuttonbnGetRecordingsToImport (ModBigbluebuttonbnGetRecordingsToImportRequest modBigbluebuttonbnGetRecordingsToImportRequest)

Returns a list of recordings ready to import to be processed by a datatable.

Returns a list of recordings ready to import to be processed by a datatable.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModBigbluebuttonbnGetRecordingsToImportExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModBigbluebuttonbnApi(config);
            var modBigbluebuttonbnGetRecordingsToImportRequest = new ModBigbluebuttonbnGetRecordingsToImportRequest(); // ModBigbluebuttonbnGetRecordingsToImportRequest | 

            try
            {
                // Returns a list of recordings ready to import to be processed by a datatable.
                ModBigbluebuttonbnGetRecordingsToImport200Response result = apiInstance.ModBigbluebuttonbnGetRecordingsToImport(modBigbluebuttonbnGetRecordingsToImportRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnGetRecordingsToImport: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModBigbluebuttonbnGetRecordingsToImportWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of recordings ready to import to be processed by a datatable.
    ApiResponse<ModBigbluebuttonbnGetRecordingsToImport200Response> response = apiInstance.ModBigbluebuttonbnGetRecordingsToImportWithHttpInfo(modBigbluebuttonbnGetRecordingsToImportRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnGetRecordingsToImportWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBigbluebuttonbnGetRecordingsToImportRequest** | [**ModBigbluebuttonbnGetRecordingsToImportRequest**](ModBigbluebuttonbnGetRecordingsToImportRequest.md) |  |  |

### Return type

[**ModBigbluebuttonbnGetRecordingsToImport200Response**](ModBigbluebuttonbnGetRecordingsToImport200Response.md)

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

<a id="modbigbluebuttonbnmeetinginfo"></a>
# **ModBigbluebuttonbnMeetingInfo**
> ModBigbluebuttonbnMeetingInfo200Response ModBigbluebuttonbnMeetingInfo (ModBigbluebuttonbnMeetingInfoRequest modBigbluebuttonbnMeetingInfoRequest)

Get displayable information on the meeting

Get displayable information on the meeting

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModBigbluebuttonbnMeetingInfoExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModBigbluebuttonbnApi(config);
            var modBigbluebuttonbnMeetingInfoRequest = new ModBigbluebuttonbnMeetingInfoRequest(); // ModBigbluebuttonbnMeetingInfoRequest | 

            try
            {
                // Get displayable information on the meeting
                ModBigbluebuttonbnMeetingInfo200Response result = apiInstance.ModBigbluebuttonbnMeetingInfo(modBigbluebuttonbnMeetingInfoRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnMeetingInfo: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModBigbluebuttonbnMeetingInfoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get displayable information on the meeting
    ApiResponse<ModBigbluebuttonbnMeetingInfo200Response> response = apiInstance.ModBigbluebuttonbnMeetingInfoWithHttpInfo(modBigbluebuttonbnMeetingInfoRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnMeetingInfoWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBigbluebuttonbnMeetingInfoRequest** | [**ModBigbluebuttonbnMeetingInfoRequest**](ModBigbluebuttonbnMeetingInfoRequest.md) |  |  |

### Return type

[**ModBigbluebuttonbnMeetingInfo200Response**](ModBigbluebuttonbnMeetingInfo200Response.md)

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

<a id="modbigbluebuttonbnupdaterecording"></a>
# **ModBigbluebuttonbnUpdateRecording**
> Object ModBigbluebuttonbnUpdateRecording (ModBigbluebuttonbnUpdateRecordingRequest modBigbluebuttonbnUpdateRecordingRequest)

Update a single recording

Update a single recording

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModBigbluebuttonbnUpdateRecordingExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModBigbluebuttonbnApi(config);
            var modBigbluebuttonbnUpdateRecordingRequest = new ModBigbluebuttonbnUpdateRecordingRequest(); // ModBigbluebuttonbnUpdateRecordingRequest | 

            try
            {
                // Update a single recording
                Object result = apiInstance.ModBigbluebuttonbnUpdateRecording(modBigbluebuttonbnUpdateRecordingRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnUpdateRecording: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModBigbluebuttonbnUpdateRecordingWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update a single recording
    ApiResponse<Object> response = apiInstance.ModBigbluebuttonbnUpdateRecordingWithHttpInfo(modBigbluebuttonbnUpdateRecordingRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnUpdateRecordingWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBigbluebuttonbnUpdateRecordingRequest** | [**ModBigbluebuttonbnUpdateRecordingRequest**](ModBigbluebuttonbnUpdateRecordingRequest.md) |  |  |

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

<a id="modbigbluebuttonbnviewbigbluebuttonbn"></a>
# **ModBigbluebuttonbnViewBigbluebuttonbn**
> CoreCalendarDeleteSubscription200Response ModBigbluebuttonbnViewBigbluebuttonbn (ModBigbluebuttonbnViewBigbluebuttonbnRequest modBigbluebuttonbnViewBigbluebuttonbnRequest)

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
    public class ModBigbluebuttonbnViewBigbluebuttonbnExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModBigbluebuttonbnApi(config);
            var modBigbluebuttonbnViewBigbluebuttonbnRequest = new ModBigbluebuttonbnViewBigbluebuttonbnRequest(); // ModBigbluebuttonbnViewBigbluebuttonbnRequest | 

            try
            {
                // Trigger the course module viewed event and update the module completion status.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModBigbluebuttonbnViewBigbluebuttonbn(modBigbluebuttonbnViewBigbluebuttonbnRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnViewBigbluebuttonbn: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModBigbluebuttonbnViewBigbluebuttonbnWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the course module viewed event and update the module completion status.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModBigbluebuttonbnViewBigbluebuttonbnWithHttpInfo(modBigbluebuttonbnViewBigbluebuttonbnRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModBigbluebuttonbnApi.ModBigbluebuttonbnViewBigbluebuttonbnWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBigbluebuttonbnViewBigbluebuttonbnRequest** | [**ModBigbluebuttonbnViewBigbluebuttonbnRequest**](ModBigbluebuttonbnViewBigbluebuttonbnRequest.md) |  |  |

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

