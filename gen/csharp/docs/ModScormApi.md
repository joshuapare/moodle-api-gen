# MoodleClient.Api.ModScormApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModScormGetScormAccessInformation**](ModScormApi.md#modscormgetscormaccessinformation) | **POST** /mod_scorm_get_scorm_access_information | Return capabilities information for a given scorm. |
| [**ModScormGetScormAttemptCount**](ModScormApi.md#modscormgetscormattemptcount) | **POST** /mod_scorm_get_scorm_attempt_count | Return the number of attempts done by a user in the given SCORM. |
| [**ModScormGetScormScoTracks**](ModScormApi.md#modscormgetscormscotracks) | **POST** /mod_scorm_get_scorm_sco_tracks | Retrieves SCO tracking data for the given user id and attempt number |
| [**ModScormGetScormScoes**](ModScormApi.md#modscormgetscormscoes) | **POST** /mod_scorm_get_scorm_scoes | Returns a list containing all the scoes data related to the given scorm id |
| [**ModScormGetScormUserData**](ModScormApi.md#modscormgetscormuserdata) | **POST** /mod_scorm_get_scorm_user_data | Retrieves user tracking and SCO data and default SCORM values |
| [**ModScormGetScormsByCourses**](ModScormApi.md#modscormgetscormsbycourses) | **POST** /mod_scorm_get_scorms_by_courses | Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned. |
| [**ModScormInsertScormTracks**](ModScormApi.md#modscorminsertscormtracks) | **POST** /mod_scorm_insert_scorm_tracks | Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data. |
| [**ModScormLaunchSco**](ModScormApi.md#modscormlaunchsco) | **POST** /mod_scorm_launch_sco | Trigger the SCO launched event. |
| [**ModScormViewScorm**](ModScormApi.md#modscormviewscorm) | **POST** /mod_scorm_view_scorm | Trigger the course module viewed event. |

<a id="modscormgetscormaccessinformation"></a>
# **ModScormGetScormAccessInformation**
> ModScormGetScormAccessInformation200Response ModScormGetScormAccessInformation (ModScormGetScormAccessInformationRequest modScormGetScormAccessInformationRequest)

Return capabilities information for a given scorm.

Return capabilities information for a given scorm.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModScormGetScormAccessInformationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModScormApi(config);
            var modScormGetScormAccessInformationRequest = new ModScormGetScormAccessInformationRequest(); // ModScormGetScormAccessInformationRequest | 

            try
            {
                // Return capabilities information for a given scorm.
                ModScormGetScormAccessInformation200Response result = apiInstance.ModScormGetScormAccessInformation(modScormGetScormAccessInformationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModScormApi.ModScormGetScormAccessInformation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModScormGetScormAccessInformationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return capabilities information for a given scorm.
    ApiResponse<ModScormGetScormAccessInformation200Response> response = apiInstance.ModScormGetScormAccessInformationWithHttpInfo(modScormGetScormAccessInformationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModScormApi.ModScormGetScormAccessInformationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modScormGetScormAccessInformationRequest** | [**ModScormGetScormAccessInformationRequest**](ModScormGetScormAccessInformationRequest.md) |  |  |

### Return type

[**ModScormGetScormAccessInformation200Response**](ModScormGetScormAccessInformation200Response.md)

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

<a id="modscormgetscormattemptcount"></a>
# **ModScormGetScormAttemptCount**
> ModScormGetScormAttemptCount200Response ModScormGetScormAttemptCount (ModScormGetScormAttemptCountRequest modScormGetScormAttemptCountRequest)

Return the number of attempts done by a user in the given SCORM.

Return the number of attempts done by a user in the given SCORM.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModScormGetScormAttemptCountExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModScormApi(config);
            var modScormGetScormAttemptCountRequest = new ModScormGetScormAttemptCountRequest(); // ModScormGetScormAttemptCountRequest | 

            try
            {
                // Return the number of attempts done by a user in the given SCORM.
                ModScormGetScormAttemptCount200Response result = apiInstance.ModScormGetScormAttemptCount(modScormGetScormAttemptCountRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModScormApi.ModScormGetScormAttemptCount: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModScormGetScormAttemptCountWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return the number of attempts done by a user in the given SCORM.
    ApiResponse<ModScormGetScormAttemptCount200Response> response = apiInstance.ModScormGetScormAttemptCountWithHttpInfo(modScormGetScormAttemptCountRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModScormApi.ModScormGetScormAttemptCountWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modScormGetScormAttemptCountRequest** | [**ModScormGetScormAttemptCountRequest**](ModScormGetScormAttemptCountRequest.md) |  |  |

### Return type

[**ModScormGetScormAttemptCount200Response**](ModScormGetScormAttemptCount200Response.md)

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

<a id="modscormgetscormscotracks"></a>
# **ModScormGetScormScoTracks**
> ModScormGetScormScoTracks200Response ModScormGetScormScoTracks (ModScormGetScormScoTracksRequest modScormGetScormScoTracksRequest)

Retrieves SCO tracking data for the given user id and attempt number

Retrieves SCO tracking data for the given user id and attempt number

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModScormGetScormScoTracksExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModScormApi(config);
            var modScormGetScormScoTracksRequest = new ModScormGetScormScoTracksRequest(); // ModScormGetScormScoTracksRequest | 

            try
            {
                // Retrieves SCO tracking data for the given user id and attempt number
                ModScormGetScormScoTracks200Response result = apiInstance.ModScormGetScormScoTracks(modScormGetScormScoTracksRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModScormApi.ModScormGetScormScoTracks: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModScormGetScormScoTracksWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieves SCO tracking data for the given user id and attempt number
    ApiResponse<ModScormGetScormScoTracks200Response> response = apiInstance.ModScormGetScormScoTracksWithHttpInfo(modScormGetScormScoTracksRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModScormApi.ModScormGetScormScoTracksWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modScormGetScormScoTracksRequest** | [**ModScormGetScormScoTracksRequest**](ModScormGetScormScoTracksRequest.md) |  |  |

### Return type

[**ModScormGetScormScoTracks200Response**](ModScormGetScormScoTracks200Response.md)

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

<a id="modscormgetscormscoes"></a>
# **ModScormGetScormScoes**
> ModScormGetScormScoes200Response ModScormGetScormScoes (ModScormGetScormScoesRequest modScormGetScormScoesRequest)

Returns a list containing all the scoes data related to the given scorm id

Returns a list containing all the scoes data related to the given scorm id

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModScormGetScormScoesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModScormApi(config);
            var modScormGetScormScoesRequest = new ModScormGetScormScoesRequest(); // ModScormGetScormScoesRequest | 

            try
            {
                // Returns a list containing all the scoes data related to the given scorm id
                ModScormGetScormScoes200Response result = apiInstance.ModScormGetScormScoes(modScormGetScormScoesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModScormApi.ModScormGetScormScoes: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModScormGetScormScoesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list containing all the scoes data related to the given scorm id
    ApiResponse<ModScormGetScormScoes200Response> response = apiInstance.ModScormGetScormScoesWithHttpInfo(modScormGetScormScoesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModScormApi.ModScormGetScormScoesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modScormGetScormScoesRequest** | [**ModScormGetScormScoesRequest**](ModScormGetScormScoesRequest.md) |  |  |

### Return type

[**ModScormGetScormScoes200Response**](ModScormGetScormScoes200Response.md)

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

<a id="modscormgetscormuserdata"></a>
# **ModScormGetScormUserData**
> ModScormGetScormUserData200Response ModScormGetScormUserData (ModScormGetScormUserDataRequest modScormGetScormUserDataRequest)

Retrieves user tracking and SCO data and default SCORM values

Retrieves user tracking and SCO data and default SCORM values

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModScormGetScormUserDataExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModScormApi(config);
            var modScormGetScormUserDataRequest = new ModScormGetScormUserDataRequest(); // ModScormGetScormUserDataRequest | 

            try
            {
                // Retrieves user tracking and SCO data and default SCORM values
                ModScormGetScormUserData200Response result = apiInstance.ModScormGetScormUserData(modScormGetScormUserDataRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModScormApi.ModScormGetScormUserData: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModScormGetScormUserDataWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieves user tracking and SCO data and default SCORM values
    ApiResponse<ModScormGetScormUserData200Response> response = apiInstance.ModScormGetScormUserDataWithHttpInfo(modScormGetScormUserDataRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModScormApi.ModScormGetScormUserDataWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modScormGetScormUserDataRequest** | [**ModScormGetScormUserDataRequest**](ModScormGetScormUserDataRequest.md) |  |  |

### Return type

[**ModScormGetScormUserData200Response**](ModScormGetScormUserData200Response.md)

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

<a id="modscormgetscormsbycourses"></a>
# **ModScormGetScormsByCourses**
> ModScormGetScormsByCourses200Response ModScormGetScormsByCourses (ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest)

Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.

Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModScormGetScormsByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModScormApi(config);
            var modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 

            try
            {
                // Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.
                ModScormGetScormsByCourses200Response result = apiInstance.ModScormGetScormsByCourses(modChatGetChatsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModScormApi.ModScormGetScormsByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModScormGetScormsByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.
    ApiResponse<ModScormGetScormsByCourses200Response> response = apiInstance.ModScormGetScormsByCoursesWithHttpInfo(modChatGetChatsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModScormApi.ModScormGetScormsByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  |  |

### Return type

[**ModScormGetScormsByCourses200Response**](ModScormGetScormsByCourses200Response.md)

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

<a id="modscorminsertscormtracks"></a>
# **ModScormInsertScormTracks**
> ModScormInsertScormTracks200Response ModScormInsertScormTracks (ModScormInsertScormTracksRequest modScormInsertScormTracksRequest)

Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.

Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModScormInsertScormTracksExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModScormApi(config);
            var modScormInsertScormTracksRequest = new ModScormInsertScormTracksRequest(); // ModScormInsertScormTracksRequest | 

            try
            {
                // Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.
                ModScormInsertScormTracks200Response result = apiInstance.ModScormInsertScormTracks(modScormInsertScormTracksRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModScormApi.ModScormInsertScormTracks: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModScormInsertScormTracksWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.
    ApiResponse<ModScormInsertScormTracks200Response> response = apiInstance.ModScormInsertScormTracksWithHttpInfo(modScormInsertScormTracksRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModScormApi.ModScormInsertScormTracksWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modScormInsertScormTracksRequest** | [**ModScormInsertScormTracksRequest**](ModScormInsertScormTracksRequest.md) |  |  |

### Return type

[**ModScormInsertScormTracks200Response**](ModScormInsertScormTracks200Response.md)

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

<a id="modscormlaunchsco"></a>
# **ModScormLaunchSco**
> CoreCalendarDeleteSubscription200Response ModScormLaunchSco (ModScormLaunchScoRequest modScormLaunchScoRequest)

Trigger the SCO launched event.

Trigger the SCO launched event.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModScormLaunchScoExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModScormApi(config);
            var modScormLaunchScoRequest = new ModScormLaunchScoRequest(); // ModScormLaunchScoRequest | 

            try
            {
                // Trigger the SCO launched event.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModScormLaunchSco(modScormLaunchScoRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModScormApi.ModScormLaunchSco: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModScormLaunchScoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the SCO launched event.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModScormLaunchScoWithHttpInfo(modScormLaunchScoRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModScormApi.ModScormLaunchScoWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modScormLaunchScoRequest** | [**ModScormLaunchScoRequest**](ModScormLaunchScoRequest.md) |  |  |

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

<a id="modscormviewscorm"></a>
# **ModScormViewScorm**
> CoreCalendarDeleteSubscription200Response ModScormViewScorm (ModScormViewScormRequest modScormViewScormRequest)

Trigger the course module viewed event.

Trigger the course module viewed event.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ModScormViewScormExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModScormApi(config);
            var modScormViewScormRequest = new ModScormViewScormRequest(); // ModScormViewScormRequest | 

            try
            {
                // Trigger the course module viewed event.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModScormViewScorm(modScormViewScormRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModScormApi.ModScormViewScorm: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModScormViewScormWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the course module viewed event.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModScormViewScormWithHttpInfo(modScormViewScormRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModScormApi.ModScormViewScormWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modScormViewScormRequest** | [**ModScormViewScormRequest**](ModScormViewScormRequest.md) |  |  |

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

