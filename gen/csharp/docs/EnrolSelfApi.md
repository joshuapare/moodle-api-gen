# Org.OpenAPITools.Api.EnrolSelfApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**EnrolSelfEnrolUser**](EnrolSelfApi.md#enrolselfenroluser) | **POST** /enrol_self_enrol_user | Self enrol the current user in the given course. |
| [**EnrolSelfGetInstanceInfo**](EnrolSelfApi.md#enrolselfgetinstanceinfo) | **POST** /enrol_self_get_instance_info | self enrolment instance information. |

<a id="enrolselfenroluser"></a>
# **EnrolSelfEnrolUser**
> EnrolSelfEnrolUser200Response EnrolSelfEnrolUser (EnrolSelfEnrolUserRequest enrolSelfEnrolUserRequest)

Self enrol the current user in the given course.

Self enrol the current user in the given course.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EnrolSelfEnrolUserExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new EnrolSelfApi(config);
            var enrolSelfEnrolUserRequest = new EnrolSelfEnrolUserRequest(); // EnrolSelfEnrolUserRequest | 

            try
            {
                // Self enrol the current user in the given course.
                EnrolSelfEnrolUser200Response result = apiInstance.EnrolSelfEnrolUser(enrolSelfEnrolUserRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EnrolSelfApi.EnrolSelfEnrolUser: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the EnrolSelfEnrolUserWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Self enrol the current user in the given course.
    ApiResponse<EnrolSelfEnrolUser200Response> response = apiInstance.EnrolSelfEnrolUserWithHttpInfo(enrolSelfEnrolUserRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling EnrolSelfApi.EnrolSelfEnrolUserWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **enrolSelfEnrolUserRequest** | [**EnrolSelfEnrolUserRequest**](EnrolSelfEnrolUserRequest.md) |  |  |

### Return type

[**EnrolSelfEnrolUser200Response**](EnrolSelfEnrolUser200Response.md)

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

<a id="enrolselfgetinstanceinfo"></a>
# **EnrolSelfGetInstanceInfo**
> EnrolSelfGetInstanceInfo200Response EnrolSelfGetInstanceInfo (EnrolSelfGetInstanceInfoRequest enrolSelfGetInstanceInfoRequest)

self enrolment instance information.

self enrolment instance information.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EnrolSelfGetInstanceInfoExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new EnrolSelfApi(config);
            var enrolSelfGetInstanceInfoRequest = new EnrolSelfGetInstanceInfoRequest(); // EnrolSelfGetInstanceInfoRequest | 

            try
            {
                // self enrolment instance information.
                EnrolSelfGetInstanceInfo200Response result = apiInstance.EnrolSelfGetInstanceInfo(enrolSelfGetInstanceInfoRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EnrolSelfApi.EnrolSelfGetInstanceInfo: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the EnrolSelfGetInstanceInfoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // self enrolment instance information.
    ApiResponse<EnrolSelfGetInstanceInfo200Response> response = apiInstance.EnrolSelfGetInstanceInfoWithHttpInfo(enrolSelfGetInstanceInfoRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling EnrolSelfApi.EnrolSelfGetInstanceInfoWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **enrolSelfGetInstanceInfoRequest** | [**EnrolSelfGetInstanceInfoRequest**](EnrolSelfGetInstanceInfoRequest.md) |  |  |

### Return type

[**EnrolSelfGetInstanceInfo200Response**](EnrolSelfGetInstanceInfo200Response.md)

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

