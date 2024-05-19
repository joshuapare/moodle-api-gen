# Org.OpenAPITools.Api.TinyAutosaveApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**TinyAutosaveResetSession**](TinyAutosaveApi.md#tinyautosaveresetsession) | **POST** /tiny_autosave_reset_session | Reset an autosave session |
| [**TinyAutosaveResumeSession**](TinyAutosaveApi.md#tinyautosaveresumesession) | **POST** /tiny_autosave_resume_session | Resume an autosave session |
| [**TinyAutosaveUpdateSession**](TinyAutosaveApi.md#tinyautosaveupdatesession) | **POST** /tiny_autosave_update_session | Update an autosave session |

<a id="tinyautosaveresetsession"></a>
# **TinyAutosaveResetSession**
> Object TinyAutosaveResetSession (TinyAutosaveResetSessionRequest tinyAutosaveResetSessionRequest)

Reset an autosave session

Reset an autosave session

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class TinyAutosaveResetSessionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new TinyAutosaveApi(config);
            var tinyAutosaveResetSessionRequest = new TinyAutosaveResetSessionRequest(); // TinyAutosaveResetSessionRequest | 

            try
            {
                // Reset an autosave session
                Object result = apiInstance.TinyAutosaveResetSession(tinyAutosaveResetSessionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling TinyAutosaveApi.TinyAutosaveResetSession: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the TinyAutosaveResetSessionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Reset an autosave session
    ApiResponse<Object> response = apiInstance.TinyAutosaveResetSessionWithHttpInfo(tinyAutosaveResetSessionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling TinyAutosaveApi.TinyAutosaveResetSessionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **tinyAutosaveResetSessionRequest** | [**TinyAutosaveResetSessionRequest**](TinyAutosaveResetSessionRequest.md) |  |  |

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

<a id="tinyautosaveresumesession"></a>
# **TinyAutosaveResumeSession**
> TinyAutosaveResumeSession200Response TinyAutosaveResumeSession (TinyAutosaveResumeSessionRequest tinyAutosaveResumeSessionRequest)

Resume an autosave session

Resume an autosave session

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class TinyAutosaveResumeSessionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new TinyAutosaveApi(config);
            var tinyAutosaveResumeSessionRequest = new TinyAutosaveResumeSessionRequest(); // TinyAutosaveResumeSessionRequest | 

            try
            {
                // Resume an autosave session
                TinyAutosaveResumeSession200Response result = apiInstance.TinyAutosaveResumeSession(tinyAutosaveResumeSessionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling TinyAutosaveApi.TinyAutosaveResumeSession: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the TinyAutosaveResumeSessionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Resume an autosave session
    ApiResponse<TinyAutosaveResumeSession200Response> response = apiInstance.TinyAutosaveResumeSessionWithHttpInfo(tinyAutosaveResumeSessionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling TinyAutosaveApi.TinyAutosaveResumeSessionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **tinyAutosaveResumeSessionRequest** | [**TinyAutosaveResumeSessionRequest**](TinyAutosaveResumeSessionRequest.md) |  |  |

### Return type

[**TinyAutosaveResumeSession200Response**](TinyAutosaveResumeSession200Response.md)

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

<a id="tinyautosaveupdatesession"></a>
# **TinyAutosaveUpdateSession**
> Object TinyAutosaveUpdateSession (TinyAutosaveUpdateSessionRequest tinyAutosaveUpdateSessionRequest)

Update an autosave session

Update an autosave session

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class TinyAutosaveUpdateSessionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new TinyAutosaveApi(config);
            var tinyAutosaveUpdateSessionRequest = new TinyAutosaveUpdateSessionRequest(); // TinyAutosaveUpdateSessionRequest | 

            try
            {
                // Update an autosave session
                Object result = apiInstance.TinyAutosaveUpdateSession(tinyAutosaveUpdateSessionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling TinyAutosaveApi.TinyAutosaveUpdateSession: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the TinyAutosaveUpdateSessionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update an autosave session
    ApiResponse<Object> response = apiInstance.TinyAutosaveUpdateSessionWithHttpInfo(tinyAutosaveUpdateSessionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling TinyAutosaveApi.TinyAutosaveUpdateSessionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **tinyAutosaveUpdateSessionRequest** | [**TinyAutosaveUpdateSessionRequest**](TinyAutosaveUpdateSessionRequest.md) |  |  |

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

