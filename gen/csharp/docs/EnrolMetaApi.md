# MoodleClient.Api.EnrolMetaApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**EnrolMetaAddInstances**](EnrolMetaApi.md#enrolmetaaddinstances) | **POST** /enrol_meta_add_instances | Add meta enrolment instances |
| [**EnrolMetaDeleteInstances**](EnrolMetaApi.md#enrolmetadeleteinstances) | **POST** /enrol_meta_delete_instances | Delete meta enrolment instances |

<a id="enrolmetaaddinstances"></a>
# **EnrolMetaAddInstances**
> Object EnrolMetaAddInstances (EnrolMetaAddInstancesRequest enrolMetaAddInstancesRequest)

Add meta enrolment instances

Add meta enrolment instances

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class EnrolMetaAddInstancesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new EnrolMetaApi(config);
            var enrolMetaAddInstancesRequest = new EnrolMetaAddInstancesRequest(); // EnrolMetaAddInstancesRequest | 

            try
            {
                // Add meta enrolment instances
                Object result = apiInstance.EnrolMetaAddInstances(enrolMetaAddInstancesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EnrolMetaApi.EnrolMetaAddInstances: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the EnrolMetaAddInstancesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Add meta enrolment instances
    ApiResponse<Object> response = apiInstance.EnrolMetaAddInstancesWithHttpInfo(enrolMetaAddInstancesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling EnrolMetaApi.EnrolMetaAddInstancesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **enrolMetaAddInstancesRequest** | [**EnrolMetaAddInstancesRequest**](EnrolMetaAddInstancesRequest.md) |  |  |

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
| **200** | List of course meta enrolment instances that were created. |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="enrolmetadeleteinstances"></a>
# **EnrolMetaDeleteInstances**
> Object EnrolMetaDeleteInstances (EnrolMetaDeleteInstancesRequest enrolMetaDeleteInstancesRequest)

Delete meta enrolment instances

Delete meta enrolment instances

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class EnrolMetaDeleteInstancesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new EnrolMetaApi(config);
            var enrolMetaDeleteInstancesRequest = new EnrolMetaDeleteInstancesRequest(); // EnrolMetaDeleteInstancesRequest | 

            try
            {
                // Delete meta enrolment instances
                Object result = apiInstance.EnrolMetaDeleteInstances(enrolMetaDeleteInstancesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EnrolMetaApi.EnrolMetaDeleteInstances: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the EnrolMetaDeleteInstancesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete meta enrolment instances
    ApiResponse<Object> response = apiInstance.EnrolMetaDeleteInstancesWithHttpInfo(enrolMetaDeleteInstancesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling EnrolMetaApi.EnrolMetaDeleteInstancesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **enrolMetaDeleteInstancesRequest** | [**EnrolMetaDeleteInstancesRequest**](EnrolMetaDeleteInstancesRequest.md) |  |  |

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
| **200** | List of course meta enrolment instances that were deleted. |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

