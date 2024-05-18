# Org.OpenAPITools.Api.ModIomadcertificateApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModIomadcertificateGetIomadcertificatesByCourses**](ModIomadcertificateApi.md#modiomadcertificategetiomadcertificatesbycourses) | **POST** /mod_iomadcertificate_get_iomadcertificates_by_courses | Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned. |
| [**ModIomadcertificateGetIssuedIomadcertificates**](ModIomadcertificateApi.md#modiomadcertificategetissuediomadcertificates) | **POST** /mod_iomadcertificate_get_issued_iomadcertificates | Get the list of issued iomadcertificates for the current user. |
| [**ModIomadcertificateIssueIomadcertificate**](ModIomadcertificateApi.md#modiomadcertificateissueiomadcertificate) | **POST** /mod_iomadcertificate_issue_iomadcertificate | Create new iomadcertificate record, or return existing record for the current user. |
| [**ModIomadcertificateViewIomadcertificate**](ModIomadcertificateApi.md#modiomadcertificateviewiomadcertificate) | **POST** /mod_iomadcertificate_view_iomadcertificate | Trigger the course module viewed event and update the module completion status. |

<a id="modiomadcertificategetiomadcertificatesbycourses"></a>
# **ModIomadcertificateGetIomadcertificatesByCourses**
> ModIomadcertificateGetIomadcertificatesByCourses200Response ModIomadcertificateGetIomadcertificatesByCourses (ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest)

Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.

Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModIomadcertificateGetIomadcertificatesByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModIomadcertificateApi(config);
            var modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 

            try
            {
                // Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.
                ModIomadcertificateGetIomadcertificatesByCourses200Response result = apiInstance.ModIomadcertificateGetIomadcertificatesByCourses(modChatGetChatsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModIomadcertificateApi.ModIomadcertificateGetIomadcertificatesByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModIomadcertificateGetIomadcertificatesByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.
    ApiResponse<ModIomadcertificateGetIomadcertificatesByCourses200Response> response = apiInstance.ModIomadcertificateGetIomadcertificatesByCoursesWithHttpInfo(modChatGetChatsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModIomadcertificateApi.ModIomadcertificateGetIomadcertificatesByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  |  |

### Return type

[**ModIomadcertificateGetIomadcertificatesByCourses200Response**](ModIomadcertificateGetIomadcertificatesByCourses200Response.md)

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

<a id="modiomadcertificategetissuediomadcertificates"></a>
# **ModIomadcertificateGetIssuedIomadcertificates**
> ModIomadcertificateGetIssuedIomadcertificates200Response ModIomadcertificateGetIssuedIomadcertificates (ModIomadcertificateGetIssuedIomadcertificatesRequest modIomadcertificateGetIssuedIomadcertificatesRequest)

Get the list of issued iomadcertificates for the current user.

Get the list of issued iomadcertificates for the current user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModIomadcertificateGetIssuedIomadcertificatesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModIomadcertificateApi(config);
            var modIomadcertificateGetIssuedIomadcertificatesRequest = new ModIomadcertificateGetIssuedIomadcertificatesRequest(); // ModIomadcertificateGetIssuedIomadcertificatesRequest | 

            try
            {
                // Get the list of issued iomadcertificates for the current user.
                ModIomadcertificateGetIssuedIomadcertificates200Response result = apiInstance.ModIomadcertificateGetIssuedIomadcertificates(modIomadcertificateGetIssuedIomadcertificatesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModIomadcertificateApi.ModIomadcertificateGetIssuedIomadcertificates: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModIomadcertificateGetIssuedIomadcertificatesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get the list of issued iomadcertificates for the current user.
    ApiResponse<ModIomadcertificateGetIssuedIomadcertificates200Response> response = apiInstance.ModIomadcertificateGetIssuedIomadcertificatesWithHttpInfo(modIomadcertificateGetIssuedIomadcertificatesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModIomadcertificateApi.ModIomadcertificateGetIssuedIomadcertificatesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modIomadcertificateGetIssuedIomadcertificatesRequest** | [**ModIomadcertificateGetIssuedIomadcertificatesRequest**](ModIomadcertificateGetIssuedIomadcertificatesRequest.md) |  |  |

### Return type

[**ModIomadcertificateGetIssuedIomadcertificates200Response**](ModIomadcertificateGetIssuedIomadcertificates200Response.md)

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

<a id="modiomadcertificateissueiomadcertificate"></a>
# **ModIomadcertificateIssueIomadcertificate**
> ModIomadcertificateIssueIomadcertificate200Response ModIomadcertificateIssueIomadcertificate (ModIomadcertificateIssueIomadcertificateRequest modIomadcertificateIssueIomadcertificateRequest)

Create new iomadcertificate record, or return existing record for the current user.

Create new iomadcertificate record, or return existing record for the current user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModIomadcertificateIssueIomadcertificateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModIomadcertificateApi(config);
            var modIomadcertificateIssueIomadcertificateRequest = new ModIomadcertificateIssueIomadcertificateRequest(); // ModIomadcertificateIssueIomadcertificateRequest | 

            try
            {
                // Create new iomadcertificate record, or return existing record for the current user.
                ModIomadcertificateIssueIomadcertificate200Response result = apiInstance.ModIomadcertificateIssueIomadcertificate(modIomadcertificateIssueIomadcertificateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModIomadcertificateApi.ModIomadcertificateIssueIomadcertificate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModIomadcertificateIssueIomadcertificateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create new iomadcertificate record, or return existing record for the current user.
    ApiResponse<ModIomadcertificateIssueIomadcertificate200Response> response = apiInstance.ModIomadcertificateIssueIomadcertificateWithHttpInfo(modIomadcertificateIssueIomadcertificateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModIomadcertificateApi.ModIomadcertificateIssueIomadcertificateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modIomadcertificateIssueIomadcertificateRequest** | [**ModIomadcertificateIssueIomadcertificateRequest**](ModIomadcertificateIssueIomadcertificateRequest.md) |  |  |

### Return type

[**ModIomadcertificateIssueIomadcertificate200Response**](ModIomadcertificateIssueIomadcertificate200Response.md)

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

<a id="modiomadcertificateviewiomadcertificate"></a>
# **ModIomadcertificateViewIomadcertificate**
> CoreCalendarDeleteSubscription200Response ModIomadcertificateViewIomadcertificate (ModIomadcertificateIssueIomadcertificateRequest modIomadcertificateIssueIomadcertificateRequest)

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
    public class ModIomadcertificateViewIomadcertificateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModIomadcertificateApi(config);
            var modIomadcertificateIssueIomadcertificateRequest = new ModIomadcertificateIssueIomadcertificateRequest(); // ModIomadcertificateIssueIomadcertificateRequest | 

            try
            {
                // Trigger the course module viewed event and update the module completion status.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModIomadcertificateViewIomadcertificate(modIomadcertificateIssueIomadcertificateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModIomadcertificateApi.ModIomadcertificateViewIomadcertificate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModIomadcertificateViewIomadcertificateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the course module viewed event and update the module completion status.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModIomadcertificateViewIomadcertificateWithHttpInfo(modIomadcertificateIssueIomadcertificateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModIomadcertificateApi.ModIomadcertificateViewIomadcertificateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modIomadcertificateIssueIomadcertificateRequest** | [**ModIomadcertificateIssueIomadcertificateRequest**](ModIomadcertificateIssueIomadcertificateRequest.md) |  |  |

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

