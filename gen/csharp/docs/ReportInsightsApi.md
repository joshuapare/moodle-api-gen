# MoodleClient.Api.ReportInsightsApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ReportInsightsActionExecuted**](ReportInsightsApi.md#reportinsightsactionexecuted) | **POST** /report_insights_action_executed | Stores an action executed over a group of predictions. |
| [**ReportInsightsSetFixedPrediction**](ReportInsightsApi.md#reportinsightssetfixedprediction) | **POST** /report_insights_set_fixed_prediction | Flags a prediction as fixed. |
| [**ReportInsightsSetNotusefulPrediction**](ReportInsightsApi.md#reportinsightssetnotusefulprediction) | **POST** /report_insights_set_notuseful_prediction | Flags the prediction as not useful. |

<a id="reportinsightsactionexecuted"></a>
# **ReportInsightsActionExecuted**
> CoreCohortAddCohortMembers200Response ReportInsightsActionExecuted (ReportInsightsActionExecutedRequest reportInsightsActionExecutedRequest)

Stores an action executed over a group of predictions.

Stores an action executed over a group of predictions.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ReportInsightsActionExecutedExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReportInsightsApi(config);
            var reportInsightsActionExecutedRequest = new ReportInsightsActionExecutedRequest(); // ReportInsightsActionExecutedRequest | 

            try
            {
                // Stores an action executed over a group of predictions.
                CoreCohortAddCohortMembers200Response result = apiInstance.ReportInsightsActionExecuted(reportInsightsActionExecutedRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReportInsightsApi.ReportInsightsActionExecuted: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ReportInsightsActionExecutedWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Stores an action executed over a group of predictions.
    ApiResponse<CoreCohortAddCohortMembers200Response> response = apiInstance.ReportInsightsActionExecutedWithHttpInfo(reportInsightsActionExecutedRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReportInsightsApi.ReportInsightsActionExecutedWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **reportInsightsActionExecutedRequest** | [**ReportInsightsActionExecutedRequest**](ReportInsightsActionExecutedRequest.md) |  |  |

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

<a id="reportinsightssetfixedprediction"></a>
# **ReportInsightsSetFixedPrediction**
> ReportInsightsSetFixedPrediction200Response ReportInsightsSetFixedPrediction (ReportInsightsSetFixedPredictionRequest reportInsightsSetFixedPredictionRequest)

Flags a prediction as fixed.

Flags a prediction as fixed.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ReportInsightsSetFixedPredictionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReportInsightsApi(config);
            var reportInsightsSetFixedPredictionRequest = new ReportInsightsSetFixedPredictionRequest(); // ReportInsightsSetFixedPredictionRequest | 

            try
            {
                // Flags a prediction as fixed.
                ReportInsightsSetFixedPrediction200Response result = apiInstance.ReportInsightsSetFixedPrediction(reportInsightsSetFixedPredictionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReportInsightsApi.ReportInsightsSetFixedPrediction: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ReportInsightsSetFixedPredictionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Flags a prediction as fixed.
    ApiResponse<ReportInsightsSetFixedPrediction200Response> response = apiInstance.ReportInsightsSetFixedPredictionWithHttpInfo(reportInsightsSetFixedPredictionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReportInsightsApi.ReportInsightsSetFixedPredictionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **reportInsightsSetFixedPredictionRequest** | [**ReportInsightsSetFixedPredictionRequest**](ReportInsightsSetFixedPredictionRequest.md) |  |  |

### Return type

[**ReportInsightsSetFixedPrediction200Response**](ReportInsightsSetFixedPrediction200Response.md)

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

<a id="reportinsightssetnotusefulprediction"></a>
# **ReportInsightsSetNotusefulPrediction**
> ReportInsightsSetNotusefulPrediction200Response ReportInsightsSetNotusefulPrediction (ReportInsightsSetNotusefulPredictionRequest reportInsightsSetNotusefulPredictionRequest)

Flags the prediction as not useful.

Flags the prediction as not useful.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ReportInsightsSetNotusefulPredictionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReportInsightsApi(config);
            var reportInsightsSetNotusefulPredictionRequest = new ReportInsightsSetNotusefulPredictionRequest(); // ReportInsightsSetNotusefulPredictionRequest | 

            try
            {
                // Flags the prediction as not useful.
                ReportInsightsSetNotusefulPrediction200Response result = apiInstance.ReportInsightsSetNotusefulPrediction(reportInsightsSetNotusefulPredictionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReportInsightsApi.ReportInsightsSetNotusefulPrediction: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ReportInsightsSetNotusefulPredictionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Flags the prediction as not useful.
    ApiResponse<ReportInsightsSetNotusefulPrediction200Response> response = apiInstance.ReportInsightsSetNotusefulPredictionWithHttpInfo(reportInsightsSetNotusefulPredictionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReportInsightsApi.ReportInsightsSetNotusefulPredictionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **reportInsightsSetNotusefulPredictionRequest** | [**ReportInsightsSetNotusefulPredictionRequest**](ReportInsightsSetNotusefulPredictionRequest.md) |  |  |

### Return type

[**ReportInsightsSetNotusefulPrediction200Response**](ReportInsightsSetNotusefulPrediction200Response.md)

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

