# Org.OpenAPITools.Api.GradingformRubricApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GradingformRubricGraderGradingpanelFetch**](GradingformRubricApi.md#gradingformrubricgradergradingpanelfetch) | **POST** /gradingform_rubric_grader_gradingpanel_fetch | Fetch the data required to display the grader grading panel, creating the grade item if required |
| [**GradingformRubricGraderGradingpanelStore**](GradingformRubricApi.md#gradingformrubricgradergradingpanelstore) | **POST** /gradingform_rubric_grader_gradingpanel_store | Store the grading data for a user from the grader grading panel. |

<a id="gradingformrubricgradergradingpanelfetch"></a>
# **GradingformRubricGraderGradingpanelFetch**
> GradingformRubricGraderGradingpanelFetch200Response GradingformRubricGraderGradingpanelFetch (CoreGradesGraderGradingpanelScaleFetchRequest coreGradesGraderGradingpanelScaleFetchRequest)

Fetch the data required to display the grader grading panel, creating the grade item if required

Fetch the data required to display the grader grading panel, creating the grade item if required

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GradingformRubricGraderGradingpanelFetchExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new GradingformRubricApi(config);
            var coreGradesGraderGradingpanelScaleFetchRequest = new CoreGradesGraderGradingpanelScaleFetchRequest(); // CoreGradesGraderGradingpanelScaleFetchRequest | 

            try
            {
                // Fetch the data required to display the grader grading panel, creating the grade item if required
                GradingformRubricGraderGradingpanelFetch200Response result = apiInstance.GradingformRubricGraderGradingpanelFetch(coreGradesGraderGradingpanelScaleFetchRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling GradingformRubricApi.GradingformRubricGraderGradingpanelFetch: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GradingformRubricGraderGradingpanelFetchWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Fetch the data required to display the grader grading panel, creating the grade item if required
    ApiResponse<GradingformRubricGraderGradingpanelFetch200Response> response = apiInstance.GradingformRubricGraderGradingpanelFetchWithHttpInfo(coreGradesGraderGradingpanelScaleFetchRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GradingformRubricApi.GradingformRubricGraderGradingpanelFetchWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **coreGradesGraderGradingpanelScaleFetchRequest** | [**CoreGradesGraderGradingpanelScaleFetchRequest**](CoreGradesGraderGradingpanelScaleFetchRequest.md) |  |  |

### Return type

[**GradingformRubricGraderGradingpanelFetch200Response**](GradingformRubricGraderGradingpanelFetch200Response.md)

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

<a id="gradingformrubricgradergradingpanelstore"></a>
# **GradingformRubricGraderGradingpanelStore**
> GradingformRubricGraderGradingpanelStore200Response GradingformRubricGraderGradingpanelStore (CoreGradesGraderGradingpanelScaleStoreRequest coreGradesGraderGradingpanelScaleStoreRequest)

Store the grading data for a user from the grader grading panel.

Store the grading data for a user from the grader grading panel.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GradingformRubricGraderGradingpanelStoreExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new GradingformRubricApi(config);
            var coreGradesGraderGradingpanelScaleStoreRequest = new CoreGradesGraderGradingpanelScaleStoreRequest(); // CoreGradesGraderGradingpanelScaleStoreRequest | 

            try
            {
                // Store the grading data for a user from the grader grading panel.
                GradingformRubricGraderGradingpanelStore200Response result = apiInstance.GradingformRubricGraderGradingpanelStore(coreGradesGraderGradingpanelScaleStoreRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling GradingformRubricApi.GradingformRubricGraderGradingpanelStore: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GradingformRubricGraderGradingpanelStoreWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Store the grading data for a user from the grader grading panel.
    ApiResponse<GradingformRubricGraderGradingpanelStore200Response> response = apiInstance.GradingformRubricGraderGradingpanelStoreWithHttpInfo(coreGradesGraderGradingpanelScaleStoreRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GradingformRubricApi.GradingformRubricGraderGradingpanelStoreWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **coreGradesGraderGradingpanelScaleStoreRequest** | [**CoreGradesGraderGradingpanelScaleStoreRequest**](CoreGradesGraderGradingpanelScaleStoreRequest.md) |  |  |

### Return type

[**GradingformRubricGraderGradingpanelStore200Response**](GradingformRubricGraderGradingpanelStore200Response.md)

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

