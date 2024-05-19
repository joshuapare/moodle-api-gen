# MoodleClient.Api.EnrolGuestApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**EnrolGuestGetInstanceInfo**](EnrolGuestApi.md#enrolguestgetinstanceinfo) | **POST** /enrol_guest_get_instance_info | Return guest enrolment instance information. |
| [**EnrolGuestValidatePassword**](EnrolGuestApi.md#enrolguestvalidatepassword) | **POST** /enrol_guest_validate_password | Perform password validation. |

<a id="enrolguestgetinstanceinfo"></a>
# **EnrolGuestGetInstanceInfo**
> EnrolGuestGetInstanceInfo200Response EnrolGuestGetInstanceInfo (EnrolGuestGetInstanceInfoRequest enrolGuestGetInstanceInfoRequest)

Return guest enrolment instance information.

Return guest enrolment instance information.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class EnrolGuestGetInstanceInfoExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new EnrolGuestApi(config);
            var enrolGuestGetInstanceInfoRequest = new EnrolGuestGetInstanceInfoRequest(); // EnrolGuestGetInstanceInfoRequest | 

            try
            {
                // Return guest enrolment instance information.
                EnrolGuestGetInstanceInfo200Response result = apiInstance.EnrolGuestGetInstanceInfo(enrolGuestGetInstanceInfoRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EnrolGuestApi.EnrolGuestGetInstanceInfo: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the EnrolGuestGetInstanceInfoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return guest enrolment instance information.
    ApiResponse<EnrolGuestGetInstanceInfo200Response> response = apiInstance.EnrolGuestGetInstanceInfoWithHttpInfo(enrolGuestGetInstanceInfoRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling EnrolGuestApi.EnrolGuestGetInstanceInfoWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **enrolGuestGetInstanceInfoRequest** | [**EnrolGuestGetInstanceInfoRequest**](EnrolGuestGetInstanceInfoRequest.md) |  |  |

### Return type

[**EnrolGuestGetInstanceInfo200Response**](EnrolGuestGetInstanceInfo200Response.md)

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

<a id="enrolguestvalidatepassword"></a>
# **EnrolGuestValidatePassword**
> EnrolGuestValidatePassword200Response EnrolGuestValidatePassword (EnrolGuestValidatePasswordRequest enrolGuestValidatePasswordRequest)

Perform password validation.

Perform password validation.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class EnrolGuestValidatePasswordExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new EnrolGuestApi(config);
            var enrolGuestValidatePasswordRequest = new EnrolGuestValidatePasswordRequest(); // EnrolGuestValidatePasswordRequest | 

            try
            {
                // Perform password validation.
                EnrolGuestValidatePassword200Response result = apiInstance.EnrolGuestValidatePassword(enrolGuestValidatePasswordRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EnrolGuestApi.EnrolGuestValidatePassword: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the EnrolGuestValidatePasswordWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Perform password validation.
    ApiResponse<EnrolGuestValidatePassword200Response> response = apiInstance.EnrolGuestValidatePasswordWithHttpInfo(enrolGuestValidatePasswordRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling EnrolGuestApi.EnrolGuestValidatePasswordWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **enrolGuestValidatePasswordRequest** | [**EnrolGuestValidatePasswordRequest**](EnrolGuestValidatePasswordRequest.md) |  |  |

### Return type

[**EnrolGuestValidatePassword200Response**](EnrolGuestValidatePassword200Response.md)

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

