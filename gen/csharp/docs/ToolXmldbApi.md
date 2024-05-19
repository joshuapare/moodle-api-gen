# MoodleClient.Api.ToolXmldbApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ToolXmldbInvokeMoveAction**](ToolXmldbApi.md#toolxmldbinvokemoveaction) | **POST** /tool_xmldb_invoke_move_action | moves element up/down |

<a id="toolxmldbinvokemoveaction"></a>
# **ToolXmldbInvokeMoveAction**
> Object ToolXmldbInvokeMoveAction (ToolXmldbInvokeMoveActionRequest toolXmldbInvokeMoveActionRequest)

moves element up/down

moves element up/down

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolXmldbInvokeMoveActionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolXmldbApi(config);
            var toolXmldbInvokeMoveActionRequest = new ToolXmldbInvokeMoveActionRequest(); // ToolXmldbInvokeMoveActionRequest | 

            try
            {
                // moves element up/down
                Object result = apiInstance.ToolXmldbInvokeMoveAction(toolXmldbInvokeMoveActionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolXmldbApi.ToolXmldbInvokeMoveAction: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolXmldbInvokeMoveActionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // moves element up/down
    ApiResponse<Object> response = apiInstance.ToolXmldbInvokeMoveActionWithHttpInfo(toolXmldbInvokeMoveActionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolXmldbApi.ToolXmldbInvokeMoveActionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolXmldbInvokeMoveActionRequest** | [**ToolXmldbInvokeMoveActionRequest**](ToolXmldbInvokeMoveActionRequest.md) |  |  |

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

