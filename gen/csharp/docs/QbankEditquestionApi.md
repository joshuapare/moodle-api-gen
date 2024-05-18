# Org.OpenAPITools.Api.QbankEditquestionApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**QbankEditquestionSetStatus**](QbankEditquestionApi.md#qbankeditquestionsetstatus) | **POST** /qbank_editquestion_set_status | Update the question status. |

<a id="qbankeditquestionsetstatus"></a>
# **QbankEditquestionSetStatus**
> QbankEditquestionSetStatus200Response QbankEditquestionSetStatus (QbankEditquestionSetStatusRequest qbankEditquestionSetStatusRequest)

Update the question status.

Update the question status.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class QbankEditquestionSetStatusExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new QbankEditquestionApi(config);
            var qbankEditquestionSetStatusRequest = new QbankEditquestionSetStatusRequest(); // QbankEditquestionSetStatusRequest | 

            try
            {
                // Update the question status.
                QbankEditquestionSetStatus200Response result = apiInstance.QbankEditquestionSetStatus(qbankEditquestionSetStatusRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling QbankEditquestionApi.QbankEditquestionSetStatus: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the QbankEditquestionSetStatusWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update the question status.
    ApiResponse<QbankEditquestionSetStatus200Response> response = apiInstance.QbankEditquestionSetStatusWithHttpInfo(qbankEditquestionSetStatusRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling QbankEditquestionApi.QbankEditquestionSetStatusWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **qbankEditquestionSetStatusRequest** | [**QbankEditquestionSetStatusRequest**](QbankEditquestionSetStatusRequest.md) |  |  |

### Return type

[**QbankEditquestionSetStatus200Response**](QbankEditquestionSetStatus200Response.md)

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

