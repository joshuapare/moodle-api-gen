# MoodleClient.Api.ToolAnalyticsApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ToolAnalyticsPotentialContexts**](ToolAnalyticsApi.md#toolanalyticspotentialcontexts) | **POST** /tool_analytics_potential_contexts | Retrieve the list of potential contexts for a model. |

<a id="toolanalyticspotentialcontexts"></a>
# **ToolAnalyticsPotentialContexts**
> Object ToolAnalyticsPotentialContexts (ToolAnalyticsPotentialContextsRequest toolAnalyticsPotentialContextsRequest)

Retrieve the list of potential contexts for a model.

Retrieve the list of potential contexts for a model.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolAnalyticsPotentialContextsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolAnalyticsApi(config);
            var toolAnalyticsPotentialContextsRequest = new ToolAnalyticsPotentialContextsRequest(); // ToolAnalyticsPotentialContextsRequest | 

            try
            {
                // Retrieve the list of potential contexts for a model.
                Object result = apiInstance.ToolAnalyticsPotentialContexts(toolAnalyticsPotentialContextsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolAnalyticsApi.ToolAnalyticsPotentialContexts: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolAnalyticsPotentialContextsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieve the list of potential contexts for a model.
    ApiResponse<Object> response = apiInstance.ToolAnalyticsPotentialContextsWithHttpInfo(toolAnalyticsPotentialContextsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolAnalyticsApi.ToolAnalyticsPotentialContextsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolAnalyticsPotentialContextsRequest** | [**ToolAnalyticsPotentialContextsRequest**](ToolAnalyticsPotentialContextsRequest.md) |  |  |

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

