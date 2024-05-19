# MoodleClient.Api.TinyPremiumApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**TinyPremiumGetApiKey**](TinyPremiumApi.md#tinypremiumgetapikey) | **POST** /tiny_premium_get_api_key | Get the Tiny Premium API key from Moodle |

<a id="tinypremiumgetapikey"></a>
# **TinyPremiumGetApiKey**
> TinyPremiumGetApiKey200Response TinyPremiumGetApiKey (TinyPremiumGetApiKeyRequest tinyPremiumGetApiKeyRequest)

Get the Tiny Premium API key from Moodle

Get the Tiny Premium API key from Moodle

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class TinyPremiumGetApiKeyExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new TinyPremiumApi(config);
            var tinyPremiumGetApiKeyRequest = new TinyPremiumGetApiKeyRequest(); // TinyPremiumGetApiKeyRequest | 

            try
            {
                // Get the Tiny Premium API key from Moodle
                TinyPremiumGetApiKey200Response result = apiInstance.TinyPremiumGetApiKey(tinyPremiumGetApiKeyRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling TinyPremiumApi.TinyPremiumGetApiKey: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the TinyPremiumGetApiKeyWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get the Tiny Premium API key from Moodle
    ApiResponse<TinyPremiumGetApiKey200Response> response = apiInstance.TinyPremiumGetApiKeyWithHttpInfo(tinyPremiumGetApiKeyRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling TinyPremiumApi.TinyPremiumGetApiKeyWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **tinyPremiumGetApiKeyRequest** | [**TinyPremiumGetApiKeyRequest**](TinyPremiumGetApiKeyRequest.md) |  |  |

### Return type

[**TinyPremiumGetApiKey200Response**](TinyPremiumGetApiKey200Response.md)

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

