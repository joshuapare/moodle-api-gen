# Org.OpenAPITools.Api.ToolUsertoursApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ToolUsertoursCompleteTour**](ToolUsertoursApi.md#toolusertourscompletetour) | **POST** /tool_usertours_complete_tour | Mark the specified tour as completed for the current user |
| [**ToolUsertoursFetchAndStartTour**](ToolUsertoursApi.md#toolusertoursfetchandstarttour) | **POST** /tool_usertours_fetch_and_start_tour | Fetch the specified tour |
| [**ToolUsertoursResetTour**](ToolUsertoursApi.md#toolusertoursresettour) | **POST** /tool_usertours_reset_tour | Remove the specified tour |
| [**ToolUsertoursStepShown**](ToolUsertoursApi.md#toolusertoursstepshown) | **POST** /tool_usertours_step_shown | Mark the specified step as completed for the current user |

<a id="toolusertourscompletetour"></a>
# **ToolUsertoursCompleteTour**
> Object ToolUsertoursCompleteTour (ToolUsertoursCompleteTourRequest toolUsertoursCompleteTourRequest)

Mark the specified tour as completed for the current user

Mark the specified tour as completed for the current user

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolUsertoursCompleteTourExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolUsertoursApi(config);
            var toolUsertoursCompleteTourRequest = new ToolUsertoursCompleteTourRequest(); // ToolUsertoursCompleteTourRequest | 

            try
            {
                // Mark the specified tour as completed for the current user
                Object result = apiInstance.ToolUsertoursCompleteTour(toolUsertoursCompleteTourRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolUsertoursApi.ToolUsertoursCompleteTour: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolUsertoursCompleteTourWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Mark the specified tour as completed for the current user
    ApiResponse<Object> response = apiInstance.ToolUsertoursCompleteTourWithHttpInfo(toolUsertoursCompleteTourRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolUsertoursApi.ToolUsertoursCompleteTourWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolUsertoursCompleteTourRequest** | [**ToolUsertoursCompleteTourRequest**](ToolUsertoursCompleteTourRequest.md) |  |  |

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

<a id="toolusertoursfetchandstarttour"></a>
# **ToolUsertoursFetchAndStartTour**
> ToolUsertoursFetchAndStartTour200Response ToolUsertoursFetchAndStartTour (ToolUsertoursFetchAndStartTourRequest toolUsertoursFetchAndStartTourRequest)

Fetch the specified tour

Fetch the specified tour

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolUsertoursFetchAndStartTourExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolUsertoursApi(config);
            var toolUsertoursFetchAndStartTourRequest = new ToolUsertoursFetchAndStartTourRequest(); // ToolUsertoursFetchAndStartTourRequest | 

            try
            {
                // Fetch the specified tour
                ToolUsertoursFetchAndStartTour200Response result = apiInstance.ToolUsertoursFetchAndStartTour(toolUsertoursFetchAndStartTourRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolUsertoursApi.ToolUsertoursFetchAndStartTour: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolUsertoursFetchAndStartTourWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Fetch the specified tour
    ApiResponse<ToolUsertoursFetchAndStartTour200Response> response = apiInstance.ToolUsertoursFetchAndStartTourWithHttpInfo(toolUsertoursFetchAndStartTourRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolUsertoursApi.ToolUsertoursFetchAndStartTourWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolUsertoursFetchAndStartTourRequest** | [**ToolUsertoursFetchAndStartTourRequest**](ToolUsertoursFetchAndStartTourRequest.md) |  |  |

### Return type

[**ToolUsertoursFetchAndStartTour200Response**](ToolUsertoursFetchAndStartTour200Response.md)

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

<a id="toolusertoursresettour"></a>
# **ToolUsertoursResetTour**
> ToolUsertoursResetTour200Response ToolUsertoursResetTour (ToolUsertoursResetTourRequest toolUsertoursResetTourRequest)

Remove the specified tour

Remove the specified tour

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolUsertoursResetTourExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolUsertoursApi(config);
            var toolUsertoursResetTourRequest = new ToolUsertoursResetTourRequest(); // ToolUsertoursResetTourRequest | 

            try
            {
                // Remove the specified tour
                ToolUsertoursResetTour200Response result = apiInstance.ToolUsertoursResetTour(toolUsertoursResetTourRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolUsertoursApi.ToolUsertoursResetTour: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolUsertoursResetTourWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Remove the specified tour
    ApiResponse<ToolUsertoursResetTour200Response> response = apiInstance.ToolUsertoursResetTourWithHttpInfo(toolUsertoursResetTourRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolUsertoursApi.ToolUsertoursResetTourWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolUsertoursResetTourRequest** | [**ToolUsertoursResetTourRequest**](ToolUsertoursResetTourRequest.md) |  |  |

### Return type

[**ToolUsertoursResetTour200Response**](ToolUsertoursResetTour200Response.md)

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

<a id="toolusertoursstepshown"></a>
# **ToolUsertoursStepShown**
> Object ToolUsertoursStepShown (ToolUsertoursStepShownRequest toolUsertoursStepShownRequest)

Mark the specified step as completed for the current user

Mark the specified step as completed for the current user

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolUsertoursStepShownExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolUsertoursApi(config);
            var toolUsertoursStepShownRequest = new ToolUsertoursStepShownRequest(); // ToolUsertoursStepShownRequest | 

            try
            {
                // Mark the specified step as completed for the current user
                Object result = apiInstance.ToolUsertoursStepShown(toolUsertoursStepShownRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolUsertoursApi.ToolUsertoursStepShown: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolUsertoursStepShownWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Mark the specified step as completed for the current user
    ApiResponse<Object> response = apiInstance.ToolUsertoursStepShownWithHttpInfo(toolUsertoursStepShownRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolUsertoursApi.ToolUsertoursStepShownWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolUsertoursStepShownRequest** | [**ToolUsertoursStepShownRequest**](ToolUsertoursStepShownRequest.md) |  |  |

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

