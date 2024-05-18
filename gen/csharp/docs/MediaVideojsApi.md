# Org.OpenAPITools.Api.MediaVideojsApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**MediaVideojsGetLanguage**](MediaVideojsApi.md#mediavideojsgetlanguage) | **POST** /media_videojs_get_language | get language. |

<a id="mediavideojsgetlanguage"></a>
# **MediaVideojsGetLanguage**
> Object MediaVideojsGetLanguage (MediaVideojsGetLanguageRequest mediaVideojsGetLanguageRequest)

get language.

get language.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class MediaVideojsGetLanguageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new MediaVideojsApi(config);
            var mediaVideojsGetLanguageRequest = new MediaVideojsGetLanguageRequest(); // MediaVideojsGetLanguageRequest | 

            try
            {
                // get language.
                Object result = apiInstance.MediaVideojsGetLanguage(mediaVideojsGetLanguageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling MediaVideojsApi.MediaVideojsGetLanguage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the MediaVideojsGetLanguageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // get language.
    ApiResponse<Object> response = apiInstance.MediaVideojsGetLanguageWithHttpInfo(mediaVideojsGetLanguageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling MediaVideojsApi.MediaVideojsGetLanguageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **mediaVideojsGetLanguageRequest** | [**MediaVideojsGetLanguageRequest**](MediaVideojsGetLanguageRequest.md) |  |  |

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
| **200** | language pack json |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

