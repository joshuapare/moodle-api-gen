# Org.OpenAPITools.Api.EnrolLicenseApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**EnrolLicenseEnrolUser**](EnrolLicenseApi.md#enrollicenseenroluser) | **POST** /enrol_license_enrol_user | License enrol the current user in the given course. |
| [**EnrolLicenseGetInstanceInfo**](EnrolLicenseApi.md#enrollicensegetinstanceinfo) | **POST** /enrol_license_get_instance_info | License enrolment instance information. |

<a id="enrollicenseenroluser"></a>
# **EnrolLicenseEnrolUser**
> EnrolLicenseEnrolUser200Response EnrolLicenseEnrolUser (EnrolLicenseEnrolUserRequest enrolLicenseEnrolUserRequest)

License enrol the current user in the given course.

License enrol the current user in the given course.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EnrolLicenseEnrolUserExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new EnrolLicenseApi(config);
            var enrolLicenseEnrolUserRequest = new EnrolLicenseEnrolUserRequest(); // EnrolLicenseEnrolUserRequest | 

            try
            {
                // License enrol the current user in the given course.
                EnrolLicenseEnrolUser200Response result = apiInstance.EnrolLicenseEnrolUser(enrolLicenseEnrolUserRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EnrolLicenseApi.EnrolLicenseEnrolUser: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the EnrolLicenseEnrolUserWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // License enrol the current user in the given course.
    ApiResponse<EnrolLicenseEnrolUser200Response> response = apiInstance.EnrolLicenseEnrolUserWithHttpInfo(enrolLicenseEnrolUserRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling EnrolLicenseApi.EnrolLicenseEnrolUserWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **enrolLicenseEnrolUserRequest** | [**EnrolLicenseEnrolUserRequest**](EnrolLicenseEnrolUserRequest.md) |  |  |

### Return type

[**EnrolLicenseEnrolUser200Response**](EnrolLicenseEnrolUser200Response.md)

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

<a id="enrollicensegetinstanceinfo"></a>
# **EnrolLicenseGetInstanceInfo**
> EnrolLicenseGetInstanceInfo200Response EnrolLicenseGetInstanceInfo (EnrolLicenseGetInstanceInfoRequest enrolLicenseGetInstanceInfoRequest)

License enrolment instance information.

License enrolment instance information.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EnrolLicenseGetInstanceInfoExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new EnrolLicenseApi(config);
            var enrolLicenseGetInstanceInfoRequest = new EnrolLicenseGetInstanceInfoRequest(); // EnrolLicenseGetInstanceInfoRequest | 

            try
            {
                // License enrolment instance information.
                EnrolLicenseGetInstanceInfo200Response result = apiInstance.EnrolLicenseGetInstanceInfo(enrolLicenseGetInstanceInfoRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EnrolLicenseApi.EnrolLicenseGetInstanceInfo: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the EnrolLicenseGetInstanceInfoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // License enrolment instance information.
    ApiResponse<EnrolLicenseGetInstanceInfo200Response> response = apiInstance.EnrolLicenseGetInstanceInfoWithHttpInfo(enrolLicenseGetInstanceInfoRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling EnrolLicenseApi.EnrolLicenseGetInstanceInfoWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **enrolLicenseGetInstanceInfoRequest** | [**EnrolLicenseGetInstanceInfoRequest**](EnrolLicenseGetInstanceInfoRequest.md) |  |  |

### Return type

[**EnrolLicenseGetInstanceInfo200Response**](EnrolLicenseGetInstanceInfo200Response.md)

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

