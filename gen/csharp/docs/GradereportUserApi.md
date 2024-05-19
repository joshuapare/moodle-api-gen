# MoodleClient.Api.GradereportUserApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GradereportUserGetAccessInformation**](GradereportUserApi.md#gradereportusergetaccessinformation) | **POST** /gradereport_user_get_access_information | Returns user access information for the user grade report. |
| [**GradereportUserGetGradeItems**](GradereportUserApi.md#gradereportusergetgradeitems) | **POST** /gradereport_user_get_grade_items | Returns the complete list of grade items for users in a course |
| [**GradereportUserGetGradesTable**](GradereportUserApi.md#gradereportusergetgradestable) | **POST** /gradereport_user_get_grades_table | Get the user/s report grades table for a course |
| [**GradereportUserViewGradeReport**](GradereportUserApi.md#gradereportuserviewgradereport) | **POST** /gradereport_user_view_grade_report | Trigger the report view event |

<a id="gradereportusergetaccessinformation"></a>
# **GradereportUserGetAccessInformation**
> GradereportUserGetAccessInformation200Response GradereportUserGetAccessInformation (GradereportUserGetAccessInformationRequest gradereportUserGetAccessInformationRequest)

Returns user access information for the user grade report.

Returns user access information for the user grade report.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class GradereportUserGetAccessInformationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new GradereportUserApi(config);
            var gradereportUserGetAccessInformationRequest = new GradereportUserGetAccessInformationRequest(); // GradereportUserGetAccessInformationRequest | 

            try
            {
                // Returns user access information for the user grade report.
                GradereportUserGetAccessInformation200Response result = apiInstance.GradereportUserGetAccessInformation(gradereportUserGetAccessInformationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling GradereportUserApi.GradereportUserGetAccessInformation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GradereportUserGetAccessInformationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns user access information for the user grade report.
    ApiResponse<GradereportUserGetAccessInformation200Response> response = apiInstance.GradereportUserGetAccessInformationWithHttpInfo(gradereportUserGetAccessInformationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GradereportUserApi.GradereportUserGetAccessInformationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **gradereportUserGetAccessInformationRequest** | [**GradereportUserGetAccessInformationRequest**](GradereportUserGetAccessInformationRequest.md) |  |  |

### Return type

[**GradereportUserGetAccessInformation200Response**](GradereportUserGetAccessInformation200Response.md)

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

<a id="gradereportusergetgradeitems"></a>
# **GradereportUserGetGradeItems**
> GradereportUserGetGradeItems200Response GradereportUserGetGradeItems (GradereportUserGetGradeItemsRequest gradereportUserGetGradeItemsRequest)

Returns the complete list of grade items for users in a course

Returns the complete list of grade items for users in a course

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class GradereportUserGetGradeItemsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new GradereportUserApi(config);
            var gradereportUserGetGradeItemsRequest = new GradereportUserGetGradeItemsRequest(); // GradereportUserGetGradeItemsRequest | 

            try
            {
                // Returns the complete list of grade items for users in a course
                GradereportUserGetGradeItems200Response result = apiInstance.GradereportUserGetGradeItems(gradereportUserGetGradeItemsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling GradereportUserApi.GradereportUserGetGradeItems: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GradereportUserGetGradeItemsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns the complete list of grade items for users in a course
    ApiResponse<GradereportUserGetGradeItems200Response> response = apiInstance.GradereportUserGetGradeItemsWithHttpInfo(gradereportUserGetGradeItemsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GradereportUserApi.GradereportUserGetGradeItemsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **gradereportUserGetGradeItemsRequest** | [**GradereportUserGetGradeItemsRequest**](GradereportUserGetGradeItemsRequest.md) |  |  |

### Return type

[**GradereportUserGetGradeItems200Response**](GradereportUserGetGradeItems200Response.md)

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

<a id="gradereportusergetgradestable"></a>
# **GradereportUserGetGradesTable**
> GradereportUserGetGradesTable200Response GradereportUserGetGradesTable (GradereportUserGetGradeItemsRequest gradereportUserGetGradeItemsRequest)

Get the user/s report grades table for a course

Get the user/s report grades table for a course

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class GradereportUserGetGradesTableExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new GradereportUserApi(config);
            var gradereportUserGetGradeItemsRequest = new GradereportUserGetGradeItemsRequest(); // GradereportUserGetGradeItemsRequest | 

            try
            {
                // Get the user/s report grades table for a course
                GradereportUserGetGradesTable200Response result = apiInstance.GradereportUserGetGradesTable(gradereportUserGetGradeItemsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling GradereportUserApi.GradereportUserGetGradesTable: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GradereportUserGetGradesTableWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get the user/s report grades table for a course
    ApiResponse<GradereportUserGetGradesTable200Response> response = apiInstance.GradereportUserGetGradesTableWithHttpInfo(gradereportUserGetGradeItemsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GradereportUserApi.GradereportUserGetGradesTableWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **gradereportUserGetGradeItemsRequest** | [**GradereportUserGetGradeItemsRequest**](GradereportUserGetGradeItemsRequest.md) |  |  |

### Return type

[**GradereportUserGetGradesTable200Response**](GradereportUserGetGradesTable200Response.md)

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

<a id="gradereportuserviewgradereport"></a>
# **GradereportUserViewGradeReport**
> CoreCalendarDeleteSubscription200Response GradereportUserViewGradeReport (GradereportOverviewViewGradeReportRequest gradereportOverviewViewGradeReportRequest)

Trigger the report view event

Trigger the report view event

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class GradereportUserViewGradeReportExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new GradereportUserApi(config);
            var gradereportOverviewViewGradeReportRequest = new GradereportOverviewViewGradeReportRequest(); // GradereportOverviewViewGradeReportRequest | 

            try
            {
                // Trigger the report view event
                CoreCalendarDeleteSubscription200Response result = apiInstance.GradereportUserViewGradeReport(gradereportOverviewViewGradeReportRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling GradereportUserApi.GradereportUserViewGradeReport: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GradereportUserViewGradeReportWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the report view event
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.GradereportUserViewGradeReportWithHttpInfo(gradereportOverviewViewGradeReportRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GradereportUserApi.GradereportUserViewGradeReportWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **gradereportOverviewViewGradeReportRequest** | [**GradereportOverviewViewGradeReportRequest**](GradereportOverviewViewGradeReportRequest.md) |  |  |

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

