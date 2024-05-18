# Org.OpenAPITools.Api.ToolPolicyApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ToolPolicyGetPolicyVersion**](ToolPolicyApi.md#toolpolicygetpolicyversion) | **POST** /tool_policy_get_policy_version | Fetch the details of a policy version |
| [**ToolPolicySubmitAcceptOnBehalf**](ToolPolicyApi.md#toolpolicysubmitacceptonbehalf) | **POST** /tool_policy_submit_accept_on_behalf | Accept policies on behalf of other users |

<a id="toolpolicygetpolicyversion"></a>
# **ToolPolicyGetPolicyVersion**
> ToolPolicyGetPolicyVersion200Response ToolPolicyGetPolicyVersion (ToolPolicyGetPolicyVersionRequest toolPolicyGetPolicyVersionRequest)

Fetch the details of a policy version

Fetch the details of a policy version

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolPolicyGetPolicyVersionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolPolicyApi(config);
            var toolPolicyGetPolicyVersionRequest = new ToolPolicyGetPolicyVersionRequest(); // ToolPolicyGetPolicyVersionRequest | 

            try
            {
                // Fetch the details of a policy version
                ToolPolicyGetPolicyVersion200Response result = apiInstance.ToolPolicyGetPolicyVersion(toolPolicyGetPolicyVersionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolPolicyApi.ToolPolicyGetPolicyVersion: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolPolicyGetPolicyVersionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Fetch the details of a policy version
    ApiResponse<ToolPolicyGetPolicyVersion200Response> response = apiInstance.ToolPolicyGetPolicyVersionWithHttpInfo(toolPolicyGetPolicyVersionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolPolicyApi.ToolPolicyGetPolicyVersionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolPolicyGetPolicyVersionRequest** | [**ToolPolicyGetPolicyVersionRequest**](ToolPolicyGetPolicyVersionRequest.md) |  |  |

### Return type

[**ToolPolicyGetPolicyVersion200Response**](ToolPolicyGetPolicyVersion200Response.md)

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

<a id="toolpolicysubmitacceptonbehalf"></a>
# **ToolPolicySubmitAcceptOnBehalf**
> Object ToolPolicySubmitAcceptOnBehalf (ToolPolicySubmitAcceptOnBehalfRequest toolPolicySubmitAcceptOnBehalfRequest)

Accept policies on behalf of other users

Accept policies on behalf of other users

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolPolicySubmitAcceptOnBehalfExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolPolicyApi(config);
            var toolPolicySubmitAcceptOnBehalfRequest = new ToolPolicySubmitAcceptOnBehalfRequest(); // ToolPolicySubmitAcceptOnBehalfRequest | 

            try
            {
                // Accept policies on behalf of other users
                Object result = apiInstance.ToolPolicySubmitAcceptOnBehalf(toolPolicySubmitAcceptOnBehalfRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolPolicyApi.ToolPolicySubmitAcceptOnBehalf: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolPolicySubmitAcceptOnBehalfWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Accept policies on behalf of other users
    ApiResponse<Object> response = apiInstance.ToolPolicySubmitAcceptOnBehalfWithHttpInfo(toolPolicySubmitAcceptOnBehalfRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolPolicyApi.ToolPolicySubmitAcceptOnBehalfWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolPolicySubmitAcceptOnBehalfRequest** | [**ToolPolicySubmitAcceptOnBehalfRequest**](ToolPolicySubmitAcceptOnBehalfRequest.md) |  |  |

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

