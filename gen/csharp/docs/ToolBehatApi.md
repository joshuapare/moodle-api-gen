# MoodleClient.Api.ToolBehatApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ToolBehatGetEntityGenerator**](ToolBehatApi.md#toolbehatgetentitygenerator) | **POST** /tool_behat_get_entity_generator | Get the generator details for an entity |

<a id="toolbehatgetentitygenerator"></a>
# **ToolBehatGetEntityGenerator**
> ToolBehatGetEntityGenerator200Response ToolBehatGetEntityGenerator (ToolBehatGetEntityGeneratorRequest toolBehatGetEntityGeneratorRequest)

Get the generator details for an entity

Get the generator details for an entity

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolBehatGetEntityGeneratorExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolBehatApi(config);
            var toolBehatGetEntityGeneratorRequest = new ToolBehatGetEntityGeneratorRequest(); // ToolBehatGetEntityGeneratorRequest | 

            try
            {
                // Get the generator details for an entity
                ToolBehatGetEntityGenerator200Response result = apiInstance.ToolBehatGetEntityGenerator(toolBehatGetEntityGeneratorRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolBehatApi.ToolBehatGetEntityGenerator: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolBehatGetEntityGeneratorWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get the generator details for an entity
    ApiResponse<ToolBehatGetEntityGenerator200Response> response = apiInstance.ToolBehatGetEntityGeneratorWithHttpInfo(toolBehatGetEntityGeneratorRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolBehatApi.ToolBehatGetEntityGeneratorWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolBehatGetEntityGeneratorRequest** | [**ToolBehatGetEntityGeneratorRequest**](ToolBehatGetEntityGeneratorRequest.md) |  |  |

### Return type

[**ToolBehatGetEntityGenerator200Response**](ToolBehatGetEntityGenerator200Response.md)

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

