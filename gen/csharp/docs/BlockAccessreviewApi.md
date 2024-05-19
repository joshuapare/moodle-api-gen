# MoodleClient.Api.BlockAccessreviewApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**BlockAccessreviewGetModuleData**](BlockAccessreviewApi.md#blockaccessreviewgetmoduledata) | **POST** /block_accessreview_get_module_data | Gets error data for course modules. |
| [**BlockAccessreviewGetSectionData**](BlockAccessreviewApi.md#blockaccessreviewgetsectiondata) | **POST** /block_accessreview_get_section_data | Gets error data for course sections. |

<a id="blockaccessreviewgetmoduledata"></a>
# **BlockAccessreviewGetModuleData**
> Object BlockAccessreviewGetModuleData (BlockAccessreviewGetModuleDataRequest blockAccessreviewGetModuleDataRequest)

Gets error data for course modules.

Gets error data for course modules.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockAccessreviewGetModuleDataExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockAccessreviewApi(config);
            var blockAccessreviewGetModuleDataRequest = new BlockAccessreviewGetModuleDataRequest(); // BlockAccessreviewGetModuleDataRequest | 

            try
            {
                // Gets error data for course modules.
                Object result = apiInstance.BlockAccessreviewGetModuleData(blockAccessreviewGetModuleDataRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockAccessreviewApi.BlockAccessreviewGetModuleData: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockAccessreviewGetModuleDataWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Gets error data for course modules.
    ApiResponse<Object> response = apiInstance.BlockAccessreviewGetModuleDataWithHttpInfo(blockAccessreviewGetModuleDataRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockAccessreviewApi.BlockAccessreviewGetModuleDataWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockAccessreviewGetModuleDataRequest** | [**BlockAccessreviewGetModuleDataRequest**](BlockAccessreviewGetModuleDataRequest.md) |  |  |

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

<a id="blockaccessreviewgetsectiondata"></a>
# **BlockAccessreviewGetSectionData**
> Object BlockAccessreviewGetSectionData (BlockAccessreviewGetSectionDataRequest blockAccessreviewGetSectionDataRequest)

Gets error data for course sections.

Gets error data for course sections.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockAccessreviewGetSectionDataExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockAccessreviewApi(config);
            var blockAccessreviewGetSectionDataRequest = new BlockAccessreviewGetSectionDataRequest(); // BlockAccessreviewGetSectionDataRequest | 

            try
            {
                // Gets error data for course sections.
                Object result = apiInstance.BlockAccessreviewGetSectionData(blockAccessreviewGetSectionDataRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockAccessreviewApi.BlockAccessreviewGetSectionData: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockAccessreviewGetSectionDataWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Gets error data for course sections.
    ApiResponse<Object> response = apiInstance.BlockAccessreviewGetSectionDataWithHttpInfo(blockAccessreviewGetSectionDataRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockAccessreviewApi.BlockAccessreviewGetSectionDataWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockAccessreviewGetSectionDataRequest** | [**BlockAccessreviewGetSectionDataRequest**](BlockAccessreviewGetSectionDataRequest.md) |  |  |

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

