# Org.OpenAPITools.Api.AuthEmailApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AuthEmailGetSignupSettings**](AuthEmailApi.md#authemailgetsignupsettings) | **POST** /auth_email_get_signup_settings | Get the signup required settings and profile fields. |
| [**AuthEmailSignupUser**](AuthEmailApi.md#authemailsignupuser) | **POST** /auth_email_signup_user | Adds a new user (pendingto be confirmed) in the site. |

<a id="authemailgetsignupsettings"></a>
# **AuthEmailGetSignupSettings**
> AuthEmailGetSignupSettings200Response AuthEmailGetSignupSettings ()

Get the signup required settings and profile fields.

Get the signup required settings and profile fields.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AuthEmailGetSignupSettingsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new AuthEmailApi(config);

            try
            {
                // Get the signup required settings and profile fields.
                AuthEmailGetSignupSettings200Response result = apiInstance.AuthEmailGetSignupSettings();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthEmailApi.AuthEmailGetSignupSettings: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AuthEmailGetSignupSettingsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get the signup required settings and profile fields.
    ApiResponse<AuthEmailGetSignupSettings200Response> response = apiInstance.AuthEmailGetSignupSettingsWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthEmailApi.AuthEmailGetSignupSettingsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**AuthEmailGetSignupSettings200Response**](AuthEmailGetSignupSettings200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="authemailsignupuser"></a>
# **AuthEmailSignupUser**
> AuthEmailSignupUser200Response AuthEmailSignupUser (AuthEmailSignupUserRequest authEmailSignupUserRequest)

Adds a new user (pendingto be confirmed) in the site.

Adds a new user (pendingto be confirmed) in the site.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AuthEmailSignupUserExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new AuthEmailApi(config);
            var authEmailSignupUserRequest = new AuthEmailSignupUserRequest(); // AuthEmailSignupUserRequest | 

            try
            {
                // Adds a new user (pendingto be confirmed) in the site.
                AuthEmailSignupUser200Response result = apiInstance.AuthEmailSignupUser(authEmailSignupUserRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthEmailApi.AuthEmailSignupUser: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AuthEmailSignupUserWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Adds a new user (pendingto be confirmed) in the site.
    ApiResponse<AuthEmailSignupUser200Response> response = apiInstance.AuthEmailSignupUserWithHttpInfo(authEmailSignupUserRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthEmailApi.AuthEmailSignupUserWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authEmailSignupUserRequest** | [**AuthEmailSignupUserRequest**](AuthEmailSignupUserRequest.md) |  |  |

### Return type

[**AuthEmailSignupUser200Response**](AuthEmailSignupUser200Response.md)

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

