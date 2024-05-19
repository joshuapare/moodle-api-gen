# MoodleClient.Api.ToolTemplatelibraryApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ToolTemplatelibraryListTemplates**](ToolTemplatelibraryApi.md#tooltemplatelibrarylisttemplates) | **POST** /tool_templatelibrary_list_templates | List/search templates by component. |
| [**ToolTemplatelibraryLoadCanonicalTemplate**](ToolTemplatelibraryApi.md#tooltemplatelibraryloadcanonicaltemplate) | **POST** /tool_templatelibrary_load_canonical_template | Load a canonical template by name (not the theme overidden one). |

<a id="tooltemplatelibrarylisttemplates"></a>
# **ToolTemplatelibraryListTemplates**
> Object ToolTemplatelibraryListTemplates (ToolTemplatelibraryListTemplatesRequest toolTemplatelibraryListTemplatesRequest)

List/search templates by component.

List/search templates by component.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolTemplatelibraryListTemplatesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolTemplatelibraryApi(config);
            var toolTemplatelibraryListTemplatesRequest = new ToolTemplatelibraryListTemplatesRequest(); // ToolTemplatelibraryListTemplatesRequest | 

            try
            {
                // List/search templates by component.
                Object result = apiInstance.ToolTemplatelibraryListTemplates(toolTemplatelibraryListTemplatesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolTemplatelibraryApi.ToolTemplatelibraryListTemplates: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolTemplatelibraryListTemplatesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List/search templates by component.
    ApiResponse<Object> response = apiInstance.ToolTemplatelibraryListTemplatesWithHttpInfo(toolTemplatelibraryListTemplatesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolTemplatelibraryApi.ToolTemplatelibraryListTemplatesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolTemplatelibraryListTemplatesRequest** | [**ToolTemplatelibraryListTemplatesRequest**](ToolTemplatelibraryListTemplatesRequest.md) |  |  |

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

<a id="tooltemplatelibraryloadcanonicaltemplate"></a>
# **ToolTemplatelibraryLoadCanonicalTemplate**
> Object ToolTemplatelibraryLoadCanonicalTemplate (ToolTemplatelibraryLoadCanonicalTemplateRequest toolTemplatelibraryLoadCanonicalTemplateRequest)

Load a canonical template by name (not the theme overidden one).

Load a canonical template by name (not the theme overidden one).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolTemplatelibraryLoadCanonicalTemplateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolTemplatelibraryApi(config);
            var toolTemplatelibraryLoadCanonicalTemplateRequest = new ToolTemplatelibraryLoadCanonicalTemplateRequest(); // ToolTemplatelibraryLoadCanonicalTemplateRequest | 

            try
            {
                // Load a canonical template by name (not the theme overidden one).
                Object result = apiInstance.ToolTemplatelibraryLoadCanonicalTemplate(toolTemplatelibraryLoadCanonicalTemplateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolTemplatelibraryApi.ToolTemplatelibraryLoadCanonicalTemplate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolTemplatelibraryLoadCanonicalTemplateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load a canonical template by name (not the theme overidden one).
    ApiResponse<Object> response = apiInstance.ToolTemplatelibraryLoadCanonicalTemplateWithHttpInfo(toolTemplatelibraryLoadCanonicalTemplateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolTemplatelibraryApi.ToolTemplatelibraryLoadCanonicalTemplateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolTemplatelibraryLoadCanonicalTemplateRequest** | [**ToolTemplatelibraryLoadCanonicalTemplateRequest**](ToolTemplatelibraryLoadCanonicalTemplateRequest.md) |  |  |

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
| **200** | template |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

