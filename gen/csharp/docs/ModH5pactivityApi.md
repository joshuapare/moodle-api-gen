# Org.OpenAPITools.Api.ModH5pactivityApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModH5pactivityGetAttempts**](ModH5pactivityApi.md#modh5pactivitygetattempts) | **POST** /mod_h5pactivity_get_attempts | Return the information needed to list a user attempts. |
| [**ModH5pactivityGetH5pactivitiesByCourses**](ModH5pactivityApi.md#modh5pactivitygeth5pactivitiesbycourses) | **POST** /mod_h5pactivity_get_h5pactivities_by_courses | Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned. |
| [**ModH5pactivityGetH5pactivityAccessInformation**](ModH5pactivityApi.md#modh5pactivitygeth5pactivityaccessinformation) | **POST** /mod_h5pactivity_get_h5pactivity_access_information | Return access information for a given h5p activity. |
| [**ModH5pactivityGetResults**](ModH5pactivityApi.md#modh5pactivitygetresults) | **POST** /mod_h5pactivity_get_results | Return the information needed to list a user attempt results. |
| [**ModH5pactivityGetUserAttempts**](ModH5pactivityApi.md#modh5pactivitygetuserattempts) | **POST** /mod_h5pactivity_get_user_attempts | Return the information needed to list all enrolled user attempts. |
| [**ModH5pactivityLogReportViewed**](ModH5pactivityApi.md#modh5pactivitylogreportviewed) | **POST** /mod_h5pactivity_log_report_viewed | Log that the h5pactivity was viewed. |
| [**ModH5pactivityViewH5pactivity**](ModH5pactivityApi.md#modh5pactivityviewh5pactivity) | **POST** /mod_h5pactivity_view_h5pactivity | Trigger the course module viewed event and update the module completion status. |

<a id="modh5pactivitygetattempts"></a>
# **ModH5pactivityGetAttempts**
> ModH5pactivityGetAttempts200Response ModH5pactivityGetAttempts (ModH5pactivityGetAttemptsRequest modH5pactivityGetAttemptsRequest)

Return the information needed to list a user attempts.

Return the information needed to list a user attempts.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModH5pactivityGetAttemptsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModH5pactivityApi(config);
            var modH5pactivityGetAttemptsRequest = new ModH5pactivityGetAttemptsRequest(); // ModH5pactivityGetAttemptsRequest | 

            try
            {
                // Return the information needed to list a user attempts.
                ModH5pactivityGetAttempts200Response result = apiInstance.ModH5pactivityGetAttempts(modH5pactivityGetAttemptsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModH5pactivityApi.ModH5pactivityGetAttempts: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModH5pactivityGetAttemptsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return the information needed to list a user attempts.
    ApiResponse<ModH5pactivityGetAttempts200Response> response = apiInstance.ModH5pactivityGetAttemptsWithHttpInfo(modH5pactivityGetAttemptsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModH5pactivityApi.ModH5pactivityGetAttemptsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modH5pactivityGetAttemptsRequest** | [**ModH5pactivityGetAttemptsRequest**](ModH5pactivityGetAttemptsRequest.md) |  |  |

### Return type

[**ModH5pactivityGetAttempts200Response**](ModH5pactivityGetAttempts200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Activity attempts data |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modh5pactivitygeth5pactivitiesbycourses"></a>
# **ModH5pactivityGetH5pactivitiesByCourses**
> ModH5pactivityGetH5pactivitiesByCourses200Response ModH5pactivityGetH5pactivitiesByCourses (ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest)

Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.

Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModH5pactivityGetH5pactivitiesByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModH5pactivityApi(config);
            var modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = new ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 

            try
            {
                // Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.
                ModH5pactivityGetH5pactivitiesByCourses200Response result = apiInstance.ModH5pactivityGetH5pactivitiesByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModH5pactivityApi.ModH5pactivityGetH5pactivitiesByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModH5pactivityGetH5pactivitiesByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.
    ApiResponse<ModH5pactivityGetH5pactivitiesByCourses200Response> response = apiInstance.ModH5pactivityGetH5pactivitiesByCoursesWithHttpInfo(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModH5pactivityApi.ModH5pactivityGetH5pactivitiesByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  |  |

### Return type

[**ModH5pactivityGetH5pactivitiesByCourses200Response**](ModH5pactivityGetH5pactivitiesByCourses200Response.md)

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

<a id="modh5pactivitygeth5pactivityaccessinformation"></a>
# **ModH5pactivityGetH5pactivityAccessInformation**
> ModH5pactivityGetH5pactivityAccessInformation200Response ModH5pactivityGetH5pactivityAccessInformation (ModH5pactivityGetH5pactivityAccessInformationRequest modH5pactivityGetH5pactivityAccessInformationRequest)

Return access information for a given h5p activity.

Return access information for a given h5p activity.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModH5pactivityGetH5pactivityAccessInformationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModH5pactivityApi(config);
            var modH5pactivityGetH5pactivityAccessInformationRequest = new ModH5pactivityGetH5pactivityAccessInformationRequest(); // ModH5pactivityGetH5pactivityAccessInformationRequest | 

            try
            {
                // Return access information for a given h5p activity.
                ModH5pactivityGetH5pactivityAccessInformation200Response result = apiInstance.ModH5pactivityGetH5pactivityAccessInformation(modH5pactivityGetH5pactivityAccessInformationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModH5pactivityApi.ModH5pactivityGetH5pactivityAccessInformation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModH5pactivityGetH5pactivityAccessInformationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return access information for a given h5p activity.
    ApiResponse<ModH5pactivityGetH5pactivityAccessInformation200Response> response = apiInstance.ModH5pactivityGetH5pactivityAccessInformationWithHttpInfo(modH5pactivityGetH5pactivityAccessInformationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModH5pactivityApi.ModH5pactivityGetH5pactivityAccessInformationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modH5pactivityGetH5pactivityAccessInformationRequest** | [**ModH5pactivityGetH5pactivityAccessInformationRequest**](ModH5pactivityGetH5pactivityAccessInformationRequest.md) |  |  |

### Return type

[**ModH5pactivityGetH5pactivityAccessInformation200Response**](ModH5pactivityGetH5pactivityAccessInformation200Response.md)

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

<a id="modh5pactivitygetresults"></a>
# **ModH5pactivityGetResults**
> ModH5pactivityGetResults200Response ModH5pactivityGetResults (ModH5pactivityGetResultsRequest modH5pactivityGetResultsRequest)

Return the information needed to list a user attempt results.

Return the information needed to list a user attempt results.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModH5pactivityGetResultsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModH5pactivityApi(config);
            var modH5pactivityGetResultsRequest = new ModH5pactivityGetResultsRequest(); // ModH5pactivityGetResultsRequest | 

            try
            {
                // Return the information needed to list a user attempt results.
                ModH5pactivityGetResults200Response result = apiInstance.ModH5pactivityGetResults(modH5pactivityGetResultsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModH5pactivityApi.ModH5pactivityGetResults: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModH5pactivityGetResultsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return the information needed to list a user attempt results.
    ApiResponse<ModH5pactivityGetResults200Response> response = apiInstance.ModH5pactivityGetResultsWithHttpInfo(modH5pactivityGetResultsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModH5pactivityApi.ModH5pactivityGetResultsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modH5pactivityGetResultsRequest** | [**ModH5pactivityGetResultsRequest**](ModH5pactivityGetResultsRequest.md) |  |  |

### Return type

[**ModH5pactivityGetResults200Response**](ModH5pactivityGetResults200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Activity attempts results data |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modh5pactivitygetuserattempts"></a>
# **ModH5pactivityGetUserAttempts**
> ModH5pactivityGetUserAttempts200Response ModH5pactivityGetUserAttempts (ModH5pactivityGetUserAttemptsRequest modH5pactivityGetUserAttemptsRequest)

Return the information needed to list all enrolled user attempts.

Return the information needed to list all enrolled user attempts.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModH5pactivityGetUserAttemptsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModH5pactivityApi(config);
            var modH5pactivityGetUserAttemptsRequest = new ModH5pactivityGetUserAttemptsRequest(); // ModH5pactivityGetUserAttemptsRequest | 

            try
            {
                // Return the information needed to list all enrolled user attempts.
                ModH5pactivityGetUserAttempts200Response result = apiInstance.ModH5pactivityGetUserAttempts(modH5pactivityGetUserAttemptsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModH5pactivityApi.ModH5pactivityGetUserAttempts: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModH5pactivityGetUserAttemptsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return the information needed to list all enrolled user attempts.
    ApiResponse<ModH5pactivityGetUserAttempts200Response> response = apiInstance.ModH5pactivityGetUserAttemptsWithHttpInfo(modH5pactivityGetUserAttemptsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModH5pactivityApi.ModH5pactivityGetUserAttemptsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modH5pactivityGetUserAttemptsRequest** | [**ModH5pactivityGetUserAttemptsRequest**](ModH5pactivityGetUserAttemptsRequest.md) |  |  |

### Return type

[**ModH5pactivityGetUserAttempts200Response**](ModH5pactivityGetUserAttempts200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Activity attempts data |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modh5pactivitylogreportviewed"></a>
# **ModH5pactivityLogReportViewed**
> CoreCalendarDeleteSubscription200Response ModH5pactivityLogReportViewed (ModH5pactivityLogReportViewedRequest modH5pactivityLogReportViewedRequest)

Log that the h5pactivity was viewed.

Log that the h5pactivity was viewed.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModH5pactivityLogReportViewedExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModH5pactivityApi(config);
            var modH5pactivityLogReportViewedRequest = new ModH5pactivityLogReportViewedRequest(); // ModH5pactivityLogReportViewedRequest | 

            try
            {
                // Log that the h5pactivity was viewed.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModH5pactivityLogReportViewed(modH5pactivityLogReportViewedRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModH5pactivityApi.ModH5pactivityLogReportViewed: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModH5pactivityLogReportViewedWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Log that the h5pactivity was viewed.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModH5pactivityLogReportViewedWithHttpInfo(modH5pactivityLogReportViewedRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModH5pactivityApi.ModH5pactivityLogReportViewedWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modH5pactivityLogReportViewedRequest** | [**ModH5pactivityLogReportViewedRequest**](ModH5pactivityLogReportViewedRequest.md) |  |  |

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

<a id="modh5pactivityviewh5pactivity"></a>
# **ModH5pactivityViewH5pactivity**
> CoreCalendarDeleteSubscription200Response ModH5pactivityViewH5pactivity (ModH5pactivityViewH5pactivityRequest modH5pactivityViewH5pactivityRequest)

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
    public class ModH5pactivityViewH5pactivityExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModH5pactivityApi(config);
            var modH5pactivityViewH5pactivityRequest = new ModH5pactivityViewH5pactivityRequest(); // ModH5pactivityViewH5pactivityRequest | 

            try
            {
                // Trigger the course module viewed event and update the module completion status.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModH5pactivityViewH5pactivity(modH5pactivityViewH5pactivityRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModH5pactivityApi.ModH5pactivityViewH5pactivity: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModH5pactivityViewH5pactivityWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the course module viewed event and update the module completion status.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModH5pactivityViewH5pactivityWithHttpInfo(modH5pactivityViewH5pactivityRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModH5pactivityApi.ModH5pactivityViewH5pactivityWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modH5pactivityViewH5pactivityRequest** | [**ModH5pactivityViewH5pactivityRequest**](ModH5pactivityViewH5pactivityRequest.md) |  |  |

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

