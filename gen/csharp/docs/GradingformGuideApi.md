# MoodleClient.Api.GradingformGuideApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GradingformGuideGraderGradingpanelFetch**](GradingformGuideApi.md#gradingformguidegradergradingpanelfetch) | **POST** /gradingform_guide_grader_gradingpanel_fetch | Fetch the data required to display the grader grading panel, creating the grade item if required |
| [**GradingformGuideGraderGradingpanelStore**](GradingformGuideApi.md#gradingformguidegradergradingpanelstore) | **POST** /gradingform_guide_grader_gradingpanel_store | Store the grading data for a user from the grader grading panel. |

<a id="gradingformguidegradergradingpanelfetch"></a>
# **GradingformGuideGraderGradingpanelFetch**
> GradingformGuideGraderGradingpanelFetch200Response GradingformGuideGraderGradingpanelFetch (CoreGradesGraderGradingpanelScaleFetchRequest coreGradesGraderGradingpanelScaleFetchRequest)

Fetch the data required to display the grader grading panel, creating the grade item if required

Fetch the data required to display the grader grading panel, creating the grade item if required

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class GradingformGuideGraderGradingpanelFetchExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new GradingformGuideApi(config);
            var coreGradesGraderGradingpanelScaleFetchRequest = new CoreGradesGraderGradingpanelScaleFetchRequest(); // CoreGradesGraderGradingpanelScaleFetchRequest | 

            try
            {
                // Fetch the data required to display the grader grading panel, creating the grade item if required
                GradingformGuideGraderGradingpanelFetch200Response result = apiInstance.GradingformGuideGraderGradingpanelFetch(coreGradesGraderGradingpanelScaleFetchRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling GradingformGuideApi.GradingformGuideGraderGradingpanelFetch: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GradingformGuideGraderGradingpanelFetchWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Fetch the data required to display the grader grading panel, creating the grade item if required
    ApiResponse<GradingformGuideGraderGradingpanelFetch200Response> response = apiInstance.GradingformGuideGraderGradingpanelFetchWithHttpInfo(coreGradesGraderGradingpanelScaleFetchRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GradingformGuideApi.GradingformGuideGraderGradingpanelFetchWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **coreGradesGraderGradingpanelScaleFetchRequest** | [**CoreGradesGraderGradingpanelScaleFetchRequest**](CoreGradesGraderGradingpanelScaleFetchRequest.md) |  |  |

### Return type

[**GradingformGuideGraderGradingpanelFetch200Response**](GradingformGuideGraderGradingpanelFetch200Response.md)

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

<a id="gradingformguidegradergradingpanelstore"></a>
# **GradingformGuideGraderGradingpanelStore**
> GradingformGuideGraderGradingpanelStore200Response GradingformGuideGraderGradingpanelStore (CoreGradesGraderGradingpanelScaleStoreRequest coreGradesGraderGradingpanelScaleStoreRequest)

Store the grading data for a user from the grader grading panel.

Store the grading data for a user from the grader grading panel.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class GradingformGuideGraderGradingpanelStoreExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new GradingformGuideApi(config);
            var coreGradesGraderGradingpanelScaleStoreRequest = new CoreGradesGraderGradingpanelScaleStoreRequest(); // CoreGradesGraderGradingpanelScaleStoreRequest | 

            try
            {
                // Store the grading data for a user from the grader grading panel.
                GradingformGuideGraderGradingpanelStore200Response result = apiInstance.GradingformGuideGraderGradingpanelStore(coreGradesGraderGradingpanelScaleStoreRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling GradingformGuideApi.GradingformGuideGraderGradingpanelStore: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GradingformGuideGraderGradingpanelStoreWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Store the grading data for a user from the grader grading panel.
    ApiResponse<GradingformGuideGraderGradingpanelStore200Response> response = apiInstance.GradingformGuideGraderGradingpanelStoreWithHttpInfo(coreGradesGraderGradingpanelScaleStoreRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GradingformGuideApi.GradingformGuideGraderGradingpanelStoreWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **coreGradesGraderGradingpanelScaleStoreRequest** | [**CoreGradesGraderGradingpanelScaleStoreRequest**](CoreGradesGraderGradingpanelScaleStoreRequest.md) |  |  |

### Return type

[**GradingformGuideGraderGradingpanelStore200Response**](GradingformGuideGraderGradingpanelStore200Response.md)

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

