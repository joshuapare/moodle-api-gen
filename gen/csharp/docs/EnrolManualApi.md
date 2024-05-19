# Org.OpenAPITools.Api.EnrolManualApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**EnrolManualEnrolUsers**](EnrolManualApi.md#enrolmanualenrolusers) | **POST** /enrol_manual_enrol_users | Manual enrol users |
| [**EnrolManualUnenrolUsers**](EnrolManualApi.md#enrolmanualunenrolusers) | **POST** /enrol_manual_unenrol_users | Manual unenrol users |

<a id="enrolmanualenrolusers"></a>
# **EnrolManualEnrolUsers**
> Object EnrolManualEnrolUsers (EnrolManualEnrolUsersRequest enrolManualEnrolUsersRequest)

Manual enrol users

Manual enrol users

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EnrolManualEnrolUsersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new EnrolManualApi(config);
            var enrolManualEnrolUsersRequest = new EnrolManualEnrolUsersRequest(); // EnrolManualEnrolUsersRequest | 

            try
            {
                // Manual enrol users
                Object result = apiInstance.EnrolManualEnrolUsers(enrolManualEnrolUsersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EnrolManualApi.EnrolManualEnrolUsers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the EnrolManualEnrolUsersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Manual enrol users
    ApiResponse<Object> response = apiInstance.EnrolManualEnrolUsersWithHttpInfo(enrolManualEnrolUsersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling EnrolManualApi.EnrolManualEnrolUsersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **enrolManualEnrolUsersRequest** | [**EnrolManualEnrolUsersRequest**](EnrolManualEnrolUsersRequest.md) |  |  |

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

<a id="enrolmanualunenrolusers"></a>
# **EnrolManualUnenrolUsers**
> Object EnrolManualUnenrolUsers (EnrolManualUnenrolUsersRequest enrolManualUnenrolUsersRequest)

Manual unenrol users

Manual unenrol users

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EnrolManualUnenrolUsersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new EnrolManualApi(config);
            var enrolManualUnenrolUsersRequest = new EnrolManualUnenrolUsersRequest(); // EnrolManualUnenrolUsersRequest | 

            try
            {
                // Manual unenrol users
                Object result = apiInstance.EnrolManualUnenrolUsers(enrolManualUnenrolUsersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EnrolManualApi.EnrolManualUnenrolUsers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the EnrolManualUnenrolUsersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Manual unenrol users
    ApiResponse<Object> response = apiInstance.EnrolManualUnenrolUsersWithHttpInfo(enrolManualUnenrolUsersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling EnrolManualApi.EnrolManualUnenrolUsersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **enrolManualUnenrolUsersRequest** | [**EnrolManualUnenrolUsersRequest**](EnrolManualUnenrolUsersRequest.md) |  |  |

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

