# Org.OpenAPITools.Api.ToolMobileApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ToolMobileCallExternalFunctions**](ToolMobileApi.md#toolmobilecallexternalfunctions) | **POST** /tool_mobile_call_external_functions | Call multiple external functions and return all responses. |
| [**ToolMobileGetAutologinKey**](ToolMobileApi.md#toolmobilegetautologinkey) | **POST** /tool_mobile_get_autologin_key | Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app. |
| [**ToolMobileGetConfig**](ToolMobileApi.md#toolmobilegetconfig) | **POST** /tool_mobile_get_config | Returns a list of the site configurations, filtering by section. |
| [**ToolMobileGetContent**](ToolMobileApi.md#toolmobilegetcontent) | **POST** /tool_mobile_get_content | Returns a piece of content to be displayed in the Mobile app. |
| [**ToolMobileGetPluginsSupportingMobile**](ToolMobileApi.md#toolmobilegetpluginssupportingmobile) | **POST** /tool_mobile_get_plugins_supporting_mobile | Returns a list of Moodle plugins supporting the mobile app. |
| [**ToolMobileGetPublicConfig**](ToolMobileApi.md#toolmobilegetpublicconfig) | **POST** /tool_mobile_get_public_config | Returns a list of the site public settings, those not requiring authentication. |
| [**ToolMobileGetTokensForQrLogin**](ToolMobileApi.md#toolmobilegettokensforqrlogin) | **POST** /tool_mobile_get_tokens_for_qr_login | Returns a WebService token (and private token) for QR login. |
| [**ToolMobileValidateSubscriptionKey**](ToolMobileApi.md#toolmobilevalidatesubscriptionkey) | **POST** /tool_mobile_validate_subscription_key | Check if the given site subscription key is valid. |

<a id="toolmobilecallexternalfunctions"></a>
# **ToolMobileCallExternalFunctions**
> ToolMobileCallExternalFunctions200Response ToolMobileCallExternalFunctions (ToolMobileCallExternalFunctionsRequest toolMobileCallExternalFunctionsRequest)

Call multiple external functions and return all responses.

Call multiple external functions and return all responses.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolMobileCallExternalFunctionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolMobileApi(config);
            var toolMobileCallExternalFunctionsRequest = new ToolMobileCallExternalFunctionsRequest(); // ToolMobileCallExternalFunctionsRequest | 

            try
            {
                // Call multiple external functions and return all responses.
                ToolMobileCallExternalFunctions200Response result = apiInstance.ToolMobileCallExternalFunctions(toolMobileCallExternalFunctionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolMobileApi.ToolMobileCallExternalFunctions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolMobileCallExternalFunctionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Call multiple external functions and return all responses.
    ApiResponse<ToolMobileCallExternalFunctions200Response> response = apiInstance.ToolMobileCallExternalFunctionsWithHttpInfo(toolMobileCallExternalFunctionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolMobileApi.ToolMobileCallExternalFunctionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolMobileCallExternalFunctionsRequest** | [**ToolMobileCallExternalFunctionsRequest**](ToolMobileCallExternalFunctionsRequest.md) |  |  |

### Return type

[**ToolMobileCallExternalFunctions200Response**](ToolMobileCallExternalFunctions200Response.md)

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

<a id="toolmobilegetautologinkey"></a>
# **ToolMobileGetAutologinKey**
> ToolMobileGetAutologinKey200Response ToolMobileGetAutologinKey (ToolMobileGetAutologinKeyRequest toolMobileGetAutologinKeyRequest)

Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.

Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolMobileGetAutologinKeyExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolMobileApi(config);
            var toolMobileGetAutologinKeyRequest = new ToolMobileGetAutologinKeyRequest(); // ToolMobileGetAutologinKeyRequest | 

            try
            {
                // Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.
                ToolMobileGetAutologinKey200Response result = apiInstance.ToolMobileGetAutologinKey(toolMobileGetAutologinKeyRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolMobileApi.ToolMobileGetAutologinKey: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolMobileGetAutologinKeyWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.
    ApiResponse<ToolMobileGetAutologinKey200Response> response = apiInstance.ToolMobileGetAutologinKeyWithHttpInfo(toolMobileGetAutologinKeyRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolMobileApi.ToolMobileGetAutologinKeyWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolMobileGetAutologinKeyRequest** | [**ToolMobileGetAutologinKeyRequest**](ToolMobileGetAutologinKeyRequest.md) |  |  |

### Return type

[**ToolMobileGetAutologinKey200Response**](ToolMobileGetAutologinKey200Response.md)

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

<a id="toolmobilegetconfig"></a>
# **ToolMobileGetConfig**
> ToolMobileGetConfig200Response ToolMobileGetConfig (ToolMobileGetConfigRequest toolMobileGetConfigRequest)

Returns a list of the site configurations, filtering by section.

Returns a list of the site configurations, filtering by section.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolMobileGetConfigExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolMobileApi(config);
            var toolMobileGetConfigRequest = new ToolMobileGetConfigRequest(); // ToolMobileGetConfigRequest | 

            try
            {
                // Returns a list of the site configurations, filtering by section.
                ToolMobileGetConfig200Response result = apiInstance.ToolMobileGetConfig(toolMobileGetConfigRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolMobileApi.ToolMobileGetConfig: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolMobileGetConfigWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of the site configurations, filtering by section.
    ApiResponse<ToolMobileGetConfig200Response> response = apiInstance.ToolMobileGetConfigWithHttpInfo(toolMobileGetConfigRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolMobileApi.ToolMobileGetConfigWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolMobileGetConfigRequest** | [**ToolMobileGetConfigRequest**](ToolMobileGetConfigRequest.md) |  |  |

### Return type

[**ToolMobileGetConfig200Response**](ToolMobileGetConfig200Response.md)

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

<a id="toolmobilegetcontent"></a>
# **ToolMobileGetContent**
> ToolMobileGetContent200Response ToolMobileGetContent (ToolMobileGetContentRequest toolMobileGetContentRequest)

Returns a piece of content to be displayed in the Mobile app.

Returns a piece of content to be displayed in the Mobile app.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolMobileGetContentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolMobileApi(config);
            var toolMobileGetContentRequest = new ToolMobileGetContentRequest(); // ToolMobileGetContentRequest | 

            try
            {
                // Returns a piece of content to be displayed in the Mobile app.
                ToolMobileGetContent200Response result = apiInstance.ToolMobileGetContent(toolMobileGetContentRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolMobileApi.ToolMobileGetContent: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolMobileGetContentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a piece of content to be displayed in the Mobile app.
    ApiResponse<ToolMobileGetContent200Response> response = apiInstance.ToolMobileGetContentWithHttpInfo(toolMobileGetContentRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolMobileApi.ToolMobileGetContentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolMobileGetContentRequest** | [**ToolMobileGetContentRequest**](ToolMobileGetContentRequest.md) |  |  |

### Return type

[**ToolMobileGetContent200Response**](ToolMobileGetContent200Response.md)

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

<a id="toolmobilegetpluginssupportingmobile"></a>
# **ToolMobileGetPluginsSupportingMobile**
> ToolMobileGetPluginsSupportingMobile200Response ToolMobileGetPluginsSupportingMobile ()

Returns a list of Moodle plugins supporting the mobile app.

Returns a list of Moodle plugins supporting the mobile app.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolMobileGetPluginsSupportingMobileExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolMobileApi(config);

            try
            {
                // Returns a list of Moodle plugins supporting the mobile app.
                ToolMobileGetPluginsSupportingMobile200Response result = apiInstance.ToolMobileGetPluginsSupportingMobile();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolMobileApi.ToolMobileGetPluginsSupportingMobile: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolMobileGetPluginsSupportingMobileWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of Moodle plugins supporting the mobile app.
    ApiResponse<ToolMobileGetPluginsSupportingMobile200Response> response = apiInstance.ToolMobileGetPluginsSupportingMobileWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolMobileApi.ToolMobileGetPluginsSupportingMobileWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**ToolMobileGetPluginsSupportingMobile200Response**](ToolMobileGetPluginsSupportingMobile200Response.md)

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

<a id="toolmobilegetpublicconfig"></a>
# **ToolMobileGetPublicConfig**
> ToolMobileGetPublicConfig200Response ToolMobileGetPublicConfig ()

Returns a list of the site public settings, those not requiring authentication.

Returns a list of the site public settings, those not requiring authentication.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolMobileGetPublicConfigExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolMobileApi(config);

            try
            {
                // Returns a list of the site public settings, those not requiring authentication.
                ToolMobileGetPublicConfig200Response result = apiInstance.ToolMobileGetPublicConfig();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolMobileApi.ToolMobileGetPublicConfig: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolMobileGetPublicConfigWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of the site public settings, those not requiring authentication.
    ApiResponse<ToolMobileGetPublicConfig200Response> response = apiInstance.ToolMobileGetPublicConfigWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolMobileApi.ToolMobileGetPublicConfigWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**ToolMobileGetPublicConfig200Response**](ToolMobileGetPublicConfig200Response.md)

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

<a id="toolmobilegettokensforqrlogin"></a>
# **ToolMobileGetTokensForQrLogin**
> ToolMobileGetTokensForQrLogin200Response ToolMobileGetTokensForQrLogin (ToolMobileGetTokensForQrLoginRequest toolMobileGetTokensForQrLoginRequest)

Returns a WebService token (and private token) for QR login.

Returns a WebService token (and private token) for QR login.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolMobileGetTokensForQrLoginExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolMobileApi(config);
            var toolMobileGetTokensForQrLoginRequest = new ToolMobileGetTokensForQrLoginRequest(); // ToolMobileGetTokensForQrLoginRequest | 

            try
            {
                // Returns a WebService token (and private token) for QR login.
                ToolMobileGetTokensForQrLogin200Response result = apiInstance.ToolMobileGetTokensForQrLogin(toolMobileGetTokensForQrLoginRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolMobileApi.ToolMobileGetTokensForQrLogin: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolMobileGetTokensForQrLoginWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a WebService token (and private token) for QR login.
    ApiResponse<ToolMobileGetTokensForQrLogin200Response> response = apiInstance.ToolMobileGetTokensForQrLoginWithHttpInfo(toolMobileGetTokensForQrLoginRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolMobileApi.ToolMobileGetTokensForQrLoginWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolMobileGetTokensForQrLoginRequest** | [**ToolMobileGetTokensForQrLoginRequest**](ToolMobileGetTokensForQrLoginRequest.md) |  |  |

### Return type

[**ToolMobileGetTokensForQrLogin200Response**](ToolMobileGetTokensForQrLogin200Response.md)

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

<a id="toolmobilevalidatesubscriptionkey"></a>
# **ToolMobileValidateSubscriptionKey**
> ToolMobileValidateSubscriptionKey200Response ToolMobileValidateSubscriptionKey (ToolMobileValidateSubscriptionKeyRequest toolMobileValidateSubscriptionKeyRequest)

Check if the given site subscription key is valid.

Check if the given site subscription key is valid.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolMobileValidateSubscriptionKeyExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolMobileApi(config);
            var toolMobileValidateSubscriptionKeyRequest = new ToolMobileValidateSubscriptionKeyRequest(); // ToolMobileValidateSubscriptionKeyRequest | 

            try
            {
                // Check if the given site subscription key is valid.
                ToolMobileValidateSubscriptionKey200Response result = apiInstance.ToolMobileValidateSubscriptionKey(toolMobileValidateSubscriptionKeyRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolMobileApi.ToolMobileValidateSubscriptionKey: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolMobileValidateSubscriptionKeyWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Check if the given site subscription key is valid.
    ApiResponse<ToolMobileValidateSubscriptionKey200Response> response = apiInstance.ToolMobileValidateSubscriptionKeyWithHttpInfo(toolMobileValidateSubscriptionKeyRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolMobileApi.ToolMobileValidateSubscriptionKeyWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolMobileValidateSubscriptionKeyRequest** | [**ToolMobileValidateSubscriptionKeyRequest**](ToolMobileValidateSubscriptionKeyRequest.md) |  |  |

### Return type

[**ToolMobileValidateSubscriptionKey200Response**](ToolMobileValidateSubscriptionKey200Response.md)

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

