# MoodleClient.Api.ToolIomadpolicyApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ToolIomadpolicyGetIomadpolicyVersion**](ToolIomadpolicyApi.md#tooliomadpolicygetiomadpolicyversion) | **POST** /tool_iomadpolicy_get_iomadpolicy_version | Fetch the details of a iomadpolicy version |
| [**ToolIomadpolicySubmitAcceptOnBehalf**](ToolIomadpolicyApi.md#tooliomadpolicysubmitacceptonbehalf) | **POST** /tool_iomadpolicy_submit_accept_on_behalf | Accept policies on behalf of other users |

<a id="tooliomadpolicygetiomadpolicyversion"></a>
# **ToolIomadpolicyGetIomadpolicyVersion**
> ToolIomadpolicyGetIomadpolicyVersion200Response ToolIomadpolicyGetIomadpolicyVersion (ToolIomadpolicyGetIomadpolicyVersionRequest toolIomadpolicyGetIomadpolicyVersionRequest)

Fetch the details of a iomadpolicy version

Fetch the details of a iomadpolicy version

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolIomadpolicyGetIomadpolicyVersionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolIomadpolicyApi(config);
            var toolIomadpolicyGetIomadpolicyVersionRequest = new ToolIomadpolicyGetIomadpolicyVersionRequest(); // ToolIomadpolicyGetIomadpolicyVersionRequest | 

            try
            {
                // Fetch the details of a iomadpolicy version
                ToolIomadpolicyGetIomadpolicyVersion200Response result = apiInstance.ToolIomadpolicyGetIomadpolicyVersion(toolIomadpolicyGetIomadpolicyVersionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolIomadpolicyApi.ToolIomadpolicyGetIomadpolicyVersion: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolIomadpolicyGetIomadpolicyVersionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Fetch the details of a iomadpolicy version
    ApiResponse<ToolIomadpolicyGetIomadpolicyVersion200Response> response = apiInstance.ToolIomadpolicyGetIomadpolicyVersionWithHttpInfo(toolIomadpolicyGetIomadpolicyVersionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolIomadpolicyApi.ToolIomadpolicyGetIomadpolicyVersionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolIomadpolicyGetIomadpolicyVersionRequest** | [**ToolIomadpolicyGetIomadpolicyVersionRequest**](ToolIomadpolicyGetIomadpolicyVersionRequest.md) |  |  |

### Return type

[**ToolIomadpolicyGetIomadpolicyVersion200Response**](ToolIomadpolicyGetIomadpolicyVersion200Response.md)

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

<a id="tooliomadpolicysubmitacceptonbehalf"></a>
# **ToolIomadpolicySubmitAcceptOnBehalf**
> Object ToolIomadpolicySubmitAcceptOnBehalf (ToolIomadpolicySubmitAcceptOnBehalfRequest toolIomadpolicySubmitAcceptOnBehalfRequest)

Accept policies on behalf of other users

Accept policies on behalf of other users

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolIomadpolicySubmitAcceptOnBehalfExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolIomadpolicyApi(config);
            var toolIomadpolicySubmitAcceptOnBehalfRequest = new ToolIomadpolicySubmitAcceptOnBehalfRequest(); // ToolIomadpolicySubmitAcceptOnBehalfRequest | 

            try
            {
                // Accept policies on behalf of other users
                Object result = apiInstance.ToolIomadpolicySubmitAcceptOnBehalf(toolIomadpolicySubmitAcceptOnBehalfRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolIomadpolicyApi.ToolIomadpolicySubmitAcceptOnBehalf: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolIomadpolicySubmitAcceptOnBehalfWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Accept policies on behalf of other users
    ApiResponse<Object> response = apiInstance.ToolIomadpolicySubmitAcceptOnBehalfWithHttpInfo(toolIomadpolicySubmitAcceptOnBehalfRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolIomadpolicyApi.ToolIomadpolicySubmitAcceptOnBehalfWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolIomadpolicySubmitAcceptOnBehalfRequest** | [**ToolIomadpolicySubmitAcceptOnBehalfRequest**](ToolIomadpolicySubmitAcceptOnBehalfRequest.md) |  |  |

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
| **200** | success |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

