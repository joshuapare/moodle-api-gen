# MoodleClient.Api.TinyEquationApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**TinyEquationFilter**](TinyEquationApi.md#tinyequationfilter) | **POST** /tiny_equation_filter | Filter the equation |

<a id="tinyequationfilter"></a>
# **TinyEquationFilter**
> TinyEquationFilter200Response TinyEquationFilter (TinyEquationFilterRequest tinyEquationFilterRequest)

Filter the equation

Filter the equation

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class TinyEquationFilterExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new TinyEquationApi(config);
            var tinyEquationFilterRequest = new TinyEquationFilterRequest(); // TinyEquationFilterRequest | 

            try
            {
                // Filter the equation
                TinyEquationFilter200Response result = apiInstance.TinyEquationFilter(tinyEquationFilterRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling TinyEquationApi.TinyEquationFilter: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the TinyEquationFilterWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Filter the equation
    ApiResponse<TinyEquationFilter200Response> response = apiInstance.TinyEquationFilterWithHttpInfo(tinyEquationFilterRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling TinyEquationApi.TinyEquationFilterWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **tinyEquationFilterRequest** | [**TinyEquationFilterRequest**](TinyEquationFilterRequest.md) |  |  |

### Return type

[**TinyEquationFilter200Response**](TinyEquationFilter200Response.md)

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

