# MoodleClient.Api.BlockRecentlyaccesseditemsApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**BlockRecentlyaccesseditemsGetRecentItems**](BlockRecentlyaccesseditemsApi.md#blockrecentlyaccesseditemsgetrecentitems) | **POST** /block_recentlyaccesseditems_get_recent_items | List of items a user has accessed most recently. |

<a id="blockrecentlyaccesseditemsgetrecentitems"></a>
# **BlockRecentlyaccesseditemsGetRecentItems**
> Object BlockRecentlyaccesseditemsGetRecentItems (BlockRecentlyaccesseditemsGetRecentItemsRequest blockRecentlyaccesseditemsGetRecentItemsRequest)

List of items a user has accessed most recently.

List of items a user has accessed most recently.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockRecentlyaccesseditemsGetRecentItemsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockRecentlyaccesseditemsApi(config);
            var blockRecentlyaccesseditemsGetRecentItemsRequest = new BlockRecentlyaccesseditemsGetRecentItemsRequest(); // BlockRecentlyaccesseditemsGetRecentItemsRequest | 

            try
            {
                // List of items a user has accessed most recently.
                Object result = apiInstance.BlockRecentlyaccesseditemsGetRecentItems(blockRecentlyaccesseditemsGetRecentItemsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockRecentlyaccesseditemsApi.BlockRecentlyaccesseditemsGetRecentItems: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockRecentlyaccesseditemsGetRecentItemsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List of items a user has accessed most recently.
    ApiResponse<Object> response = apiInstance.BlockRecentlyaccesseditemsGetRecentItemsWithHttpInfo(blockRecentlyaccesseditemsGetRecentItemsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockRecentlyaccesseditemsApi.BlockRecentlyaccesseditemsGetRecentItemsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockRecentlyaccesseditemsGetRecentItemsRequest** | [**BlockRecentlyaccesseditemsGetRecentItemsRequest**](BlockRecentlyaccesseditemsGetRecentItemsRequest.md) |  |  |

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
| **200** | The most recently accessed activities/resources by the logged user |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

