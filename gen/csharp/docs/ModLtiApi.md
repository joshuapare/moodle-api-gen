# Org.OpenAPITools.Api.ModLtiApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModLtiCreateToolProxy**](ModLtiApi.md#modlticreatetoolproxy) | **POST** /mod_lti_create_tool_proxy | Create a tool proxy |
| [**ModLtiCreateToolType**](ModLtiApi.md#modlticreatetooltype) | **POST** /mod_lti_create_tool_type | Create a tool type |
| [**ModLtiDeleteCourseToolType**](ModLtiApi.md#modltideletecoursetooltype) | **POST** /mod_lti_delete_course_tool_type | Delete a course tool type |
| [**ModLtiDeleteToolProxy**](ModLtiApi.md#modltideletetoolproxy) | **POST** /mod_lti_delete_tool_proxy | Delete a tool proxy |
| [**ModLtiDeleteToolType**](ModLtiApi.md#modltideletetooltype) | **POST** /mod_lti_delete_tool_type | Delete a tool type |
| [**ModLtiGetLtisByCourses**](ModLtiApi.md#modltigetltisbycourses) | **POST** /mod_lti_get_ltis_by_courses | Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned. |
| [**ModLtiGetToolLaunchData**](ModLtiApi.md#modltigettoollaunchdata) | **POST** /mod_lti_get_tool_launch_data | Return the launch data for a given external tool. |
| [**ModLtiGetToolProxies**](ModLtiApi.md#modltigettoolproxies) | **POST** /mod_lti_get_tool_proxies | Get a list of the tool proxies |
| [**ModLtiGetToolProxyRegistrationRequest**](ModLtiApi.md#modltigettoolproxyregistrationrequest) | **POST** /mod_lti_get_tool_proxy_registration_request | Get a registration request for a tool proxy |
| [**ModLtiGetToolTypes**](ModLtiApi.md#modltigettooltypes) | **POST** /mod_lti_get_tool_types | Get a list of the tool types |
| [**ModLtiGetToolTypesAndProxies**](ModLtiApi.md#modltigettooltypesandproxies) | **POST** /mod_lti_get_tool_types_and_proxies | Get a list of the tool types and tool proxies |
| [**ModLtiGetToolTypesAndProxiesCount**](ModLtiApi.md#modltigettooltypesandproxiescount) | **POST** /mod_lti_get_tool_types_and_proxies_count | Get total number of the tool types and tool proxies |
| [**ModLtiIsCartridge**](ModLtiApi.md#modltiiscartridge) | **POST** /mod_lti_is_cartridge | Determine if the given url is for a cartridge |
| [**ModLtiToggleShowinactivitychooser**](ModLtiApi.md#modltitoggleshowinactivitychooser) | **POST** /mod_lti_toggle_showinactivitychooser | Toggle showinactivitychooser for a tool type in a course |
| [**ModLtiUpdateToolType**](ModLtiApi.md#modltiupdatetooltype) | **POST** /mod_lti_update_tool_type | Update a tool type |
| [**ModLtiViewLti**](ModLtiApi.md#modltiviewlti) | **POST** /mod_lti_view_lti | Trigger the course module viewed event and update the module completion status. |

<a id="modlticreatetoolproxy"></a>
# **ModLtiCreateToolProxy**
> ModLtiCreateToolProxy200Response ModLtiCreateToolProxy (ModLtiCreateToolProxyRequest modLtiCreateToolProxyRequest)

Create a tool proxy

Create a tool proxy

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModLtiCreateToolProxyExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLtiApi(config);
            var modLtiCreateToolProxyRequest = new ModLtiCreateToolProxyRequest(); // ModLtiCreateToolProxyRequest | 

            try
            {
                // Create a tool proxy
                ModLtiCreateToolProxy200Response result = apiInstance.ModLtiCreateToolProxy(modLtiCreateToolProxyRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLtiApi.ModLtiCreateToolProxy: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLtiCreateToolProxyWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create a tool proxy
    ApiResponse<ModLtiCreateToolProxy200Response> response = apiInstance.ModLtiCreateToolProxyWithHttpInfo(modLtiCreateToolProxyRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLtiApi.ModLtiCreateToolProxyWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLtiCreateToolProxyRequest** | [**ModLtiCreateToolProxyRequest**](ModLtiCreateToolProxyRequest.md) |  |  |

### Return type

[**ModLtiCreateToolProxy200Response**](ModLtiCreateToolProxy200Response.md)

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

<a id="modlticreatetooltype"></a>
# **ModLtiCreateToolType**
> ModLtiCreateToolType200Response ModLtiCreateToolType (ModLtiCreateToolTypeRequest modLtiCreateToolTypeRequest)

Create a tool type

Create a tool type

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModLtiCreateToolTypeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLtiApi(config);
            var modLtiCreateToolTypeRequest = new ModLtiCreateToolTypeRequest(); // ModLtiCreateToolTypeRequest | 

            try
            {
                // Create a tool type
                ModLtiCreateToolType200Response result = apiInstance.ModLtiCreateToolType(modLtiCreateToolTypeRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLtiApi.ModLtiCreateToolType: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLtiCreateToolTypeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create a tool type
    ApiResponse<ModLtiCreateToolType200Response> response = apiInstance.ModLtiCreateToolTypeWithHttpInfo(modLtiCreateToolTypeRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLtiApi.ModLtiCreateToolTypeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLtiCreateToolTypeRequest** | [**ModLtiCreateToolTypeRequest**](ModLtiCreateToolTypeRequest.md) |  |  |

### Return type

[**ModLtiCreateToolType200Response**](ModLtiCreateToolType200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tool |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modltideletecoursetooltype"></a>
# **ModLtiDeleteCourseToolType**
> Object ModLtiDeleteCourseToolType (ModLtiDeleteCourseToolTypeRequest modLtiDeleteCourseToolTypeRequest)

Delete a course tool type

Delete a course tool type

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModLtiDeleteCourseToolTypeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLtiApi(config);
            var modLtiDeleteCourseToolTypeRequest = new ModLtiDeleteCourseToolTypeRequest(); // ModLtiDeleteCourseToolTypeRequest | 

            try
            {
                // Delete a course tool type
                Object result = apiInstance.ModLtiDeleteCourseToolType(modLtiDeleteCourseToolTypeRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLtiApi.ModLtiDeleteCourseToolType: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLtiDeleteCourseToolTypeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete a course tool type
    ApiResponse<Object> response = apiInstance.ModLtiDeleteCourseToolTypeWithHttpInfo(modLtiDeleteCourseToolTypeRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLtiApi.ModLtiDeleteCourseToolTypeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLtiDeleteCourseToolTypeRequest** | [**ModLtiDeleteCourseToolTypeRequest**](ModLtiDeleteCourseToolTypeRequest.md) |  |  |

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
| **200** | Success |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modltideletetoolproxy"></a>
# **ModLtiDeleteToolProxy**
> ModLtiDeleteToolProxy200Response ModLtiDeleteToolProxy (ModLtiDeleteToolProxyRequest modLtiDeleteToolProxyRequest)

Delete a tool proxy

Delete a tool proxy

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModLtiDeleteToolProxyExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLtiApi(config);
            var modLtiDeleteToolProxyRequest = new ModLtiDeleteToolProxyRequest(); // ModLtiDeleteToolProxyRequest | 

            try
            {
                // Delete a tool proxy
                ModLtiDeleteToolProxy200Response result = apiInstance.ModLtiDeleteToolProxy(modLtiDeleteToolProxyRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLtiApi.ModLtiDeleteToolProxy: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLtiDeleteToolProxyWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete a tool proxy
    ApiResponse<ModLtiDeleteToolProxy200Response> response = apiInstance.ModLtiDeleteToolProxyWithHttpInfo(modLtiDeleteToolProxyRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLtiApi.ModLtiDeleteToolProxyWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLtiDeleteToolProxyRequest** | [**ModLtiDeleteToolProxyRequest**](ModLtiDeleteToolProxyRequest.md) |  |  |

### Return type

[**ModLtiDeleteToolProxy200Response**](ModLtiDeleteToolProxy200Response.md)

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

<a id="modltideletetooltype"></a>
# **ModLtiDeleteToolType**
> ModLtiDeleteToolTypeRequest ModLtiDeleteToolType (ModLtiDeleteToolTypeRequest modLtiDeleteToolTypeRequest)

Delete a tool type

Delete a tool type

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModLtiDeleteToolTypeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLtiApi(config);
            var modLtiDeleteToolTypeRequest = new ModLtiDeleteToolTypeRequest(); // ModLtiDeleteToolTypeRequest | 

            try
            {
                // Delete a tool type
                ModLtiDeleteToolTypeRequest result = apiInstance.ModLtiDeleteToolType(modLtiDeleteToolTypeRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLtiApi.ModLtiDeleteToolType: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLtiDeleteToolTypeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete a tool type
    ApiResponse<ModLtiDeleteToolTypeRequest> response = apiInstance.ModLtiDeleteToolTypeWithHttpInfo(modLtiDeleteToolTypeRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLtiApi.ModLtiDeleteToolTypeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLtiDeleteToolTypeRequest** | [**ModLtiDeleteToolTypeRequest**](ModLtiDeleteToolTypeRequest.md) |  |  |

### Return type

[**ModLtiDeleteToolTypeRequest**](ModLtiDeleteToolTypeRequest.md)

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

<a id="modltigetltisbycourses"></a>
# **ModLtiGetLtisByCourses**
> ModLtiGetLtisByCourses200Response ModLtiGetLtisByCourses (ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest)

Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.

Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModLtiGetLtisByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLtiApi(config);
            var modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 

            try
            {
                // Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.
                ModLtiGetLtisByCourses200Response result = apiInstance.ModLtiGetLtisByCourses(modChatGetChatsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLtiApi.ModLtiGetLtisByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLtiGetLtisByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.
    ApiResponse<ModLtiGetLtisByCourses200Response> response = apiInstance.ModLtiGetLtisByCoursesWithHttpInfo(modChatGetChatsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLtiApi.ModLtiGetLtisByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  |  |

### Return type

[**ModLtiGetLtisByCourses200Response**](ModLtiGetLtisByCourses200Response.md)

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

<a id="modltigettoollaunchdata"></a>
# **ModLtiGetToolLaunchData**
> ModLtiGetToolLaunchData200Response ModLtiGetToolLaunchData (ModLtiGetToolLaunchDataRequest modLtiGetToolLaunchDataRequest)

Return the launch data for a given external tool.

Return the launch data for a given external tool.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModLtiGetToolLaunchDataExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLtiApi(config);
            var modLtiGetToolLaunchDataRequest = new ModLtiGetToolLaunchDataRequest(); // ModLtiGetToolLaunchDataRequest | 

            try
            {
                // Return the launch data for a given external tool.
                ModLtiGetToolLaunchData200Response result = apiInstance.ModLtiGetToolLaunchData(modLtiGetToolLaunchDataRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLtiApi.ModLtiGetToolLaunchData: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLtiGetToolLaunchDataWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return the launch data for a given external tool.
    ApiResponse<ModLtiGetToolLaunchData200Response> response = apiInstance.ModLtiGetToolLaunchDataWithHttpInfo(modLtiGetToolLaunchDataRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLtiApi.ModLtiGetToolLaunchDataWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLtiGetToolLaunchDataRequest** | [**ModLtiGetToolLaunchDataRequest**](ModLtiGetToolLaunchDataRequest.md) |  |  |

### Return type

[**ModLtiGetToolLaunchData200Response**](ModLtiGetToolLaunchData200Response.md)

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

<a id="modltigettoolproxies"></a>
# **ModLtiGetToolProxies**
> Object ModLtiGetToolProxies (ModLtiGetToolProxiesRequest modLtiGetToolProxiesRequest)

Get a list of the tool proxies

Get a list of the tool proxies

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModLtiGetToolProxiesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLtiApi(config);
            var modLtiGetToolProxiesRequest = new ModLtiGetToolProxiesRequest(); // ModLtiGetToolProxiesRequest | 

            try
            {
                // Get a list of the tool proxies
                Object result = apiInstance.ModLtiGetToolProxies(modLtiGetToolProxiesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLtiApi.ModLtiGetToolProxies: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLtiGetToolProxiesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get a list of the tool proxies
    ApiResponse<Object> response = apiInstance.ModLtiGetToolProxiesWithHttpInfo(modLtiGetToolProxiesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLtiApi.ModLtiGetToolProxiesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLtiGetToolProxiesRequest** | [**ModLtiGetToolProxiesRequest**](ModLtiGetToolProxiesRequest.md) |  |  |

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

<a id="modltigettoolproxyregistrationrequest"></a>
# **ModLtiGetToolProxyRegistrationRequest**
> ModLtiGetToolProxyRegistrationRequest200Response ModLtiGetToolProxyRegistrationRequest (ModLtiDeleteToolProxyRequest modLtiDeleteToolProxyRequest)

Get a registration request for a tool proxy

Get a registration request for a tool proxy

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModLtiGetToolProxyRegistrationRequestExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLtiApi(config);
            var modLtiDeleteToolProxyRequest = new ModLtiDeleteToolProxyRequest(); // ModLtiDeleteToolProxyRequest | 

            try
            {
                // Get a registration request for a tool proxy
                ModLtiGetToolProxyRegistrationRequest200Response result = apiInstance.ModLtiGetToolProxyRegistrationRequest(modLtiDeleteToolProxyRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLtiApi.ModLtiGetToolProxyRegistrationRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLtiGetToolProxyRegistrationRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get a registration request for a tool proxy
    ApiResponse<ModLtiGetToolProxyRegistrationRequest200Response> response = apiInstance.ModLtiGetToolProxyRegistrationRequestWithHttpInfo(modLtiDeleteToolProxyRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLtiApi.ModLtiGetToolProxyRegistrationRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLtiDeleteToolProxyRequest** | [**ModLtiDeleteToolProxyRequest**](ModLtiDeleteToolProxyRequest.md) |  |  |

### Return type

[**ModLtiGetToolProxyRegistrationRequest200Response**](ModLtiGetToolProxyRegistrationRequest200Response.md)

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

<a id="modltigettooltypes"></a>
# **ModLtiGetToolTypes**
> Object ModLtiGetToolTypes (ModLtiGetToolTypesRequest modLtiGetToolTypesRequest)

Get a list of the tool types

Get a list of the tool types

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModLtiGetToolTypesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLtiApi(config);
            var modLtiGetToolTypesRequest = new ModLtiGetToolTypesRequest(); // ModLtiGetToolTypesRequest | 

            try
            {
                // Get a list of the tool types
                Object result = apiInstance.ModLtiGetToolTypes(modLtiGetToolTypesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLtiApi.ModLtiGetToolTypes: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLtiGetToolTypesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get a list of the tool types
    ApiResponse<Object> response = apiInstance.ModLtiGetToolTypesWithHttpInfo(modLtiGetToolTypesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLtiApi.ModLtiGetToolTypesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLtiGetToolTypesRequest** | [**ModLtiGetToolTypesRequest**](ModLtiGetToolTypesRequest.md) |  |  |

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

<a id="modltigettooltypesandproxies"></a>
# **ModLtiGetToolTypesAndProxies**
> ModLtiGetToolTypesAndProxies200Response ModLtiGetToolTypesAndProxies (ModLtiGetToolTypesAndProxiesRequest modLtiGetToolTypesAndProxiesRequest)

Get a list of the tool types and tool proxies

Get a list of the tool types and tool proxies

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModLtiGetToolTypesAndProxiesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLtiApi(config);
            var modLtiGetToolTypesAndProxiesRequest = new ModLtiGetToolTypesAndProxiesRequest(); // ModLtiGetToolTypesAndProxiesRequest | 

            try
            {
                // Get a list of the tool types and tool proxies
                ModLtiGetToolTypesAndProxies200Response result = apiInstance.ModLtiGetToolTypesAndProxies(modLtiGetToolTypesAndProxiesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLtiApi.ModLtiGetToolTypesAndProxies: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLtiGetToolTypesAndProxiesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get a list of the tool types and tool proxies
    ApiResponse<ModLtiGetToolTypesAndProxies200Response> response = apiInstance.ModLtiGetToolTypesAndProxiesWithHttpInfo(modLtiGetToolTypesAndProxiesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLtiApi.ModLtiGetToolTypesAndProxiesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLtiGetToolTypesAndProxiesRequest** | [**ModLtiGetToolTypesAndProxiesRequest**](ModLtiGetToolTypesAndProxiesRequest.md) |  |  |

### Return type

[**ModLtiGetToolTypesAndProxies200Response**](ModLtiGetToolTypesAndProxies200Response.md)

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

<a id="modltigettooltypesandproxiescount"></a>
# **ModLtiGetToolTypesAndProxiesCount**
> ModLtiGetToolTypesAndProxiesCount200Response ModLtiGetToolTypesAndProxiesCount (ModLtiGetToolTypesAndProxiesCountRequest modLtiGetToolTypesAndProxiesCountRequest)

Get total number of the tool types and tool proxies

Get total number of the tool types and tool proxies

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModLtiGetToolTypesAndProxiesCountExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLtiApi(config);
            var modLtiGetToolTypesAndProxiesCountRequest = new ModLtiGetToolTypesAndProxiesCountRequest(); // ModLtiGetToolTypesAndProxiesCountRequest | 

            try
            {
                // Get total number of the tool types and tool proxies
                ModLtiGetToolTypesAndProxiesCount200Response result = apiInstance.ModLtiGetToolTypesAndProxiesCount(modLtiGetToolTypesAndProxiesCountRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLtiApi.ModLtiGetToolTypesAndProxiesCount: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLtiGetToolTypesAndProxiesCountWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get total number of the tool types and tool proxies
    ApiResponse<ModLtiGetToolTypesAndProxiesCount200Response> response = apiInstance.ModLtiGetToolTypesAndProxiesCountWithHttpInfo(modLtiGetToolTypesAndProxiesCountRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLtiApi.ModLtiGetToolTypesAndProxiesCountWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLtiGetToolTypesAndProxiesCountRequest** | [**ModLtiGetToolTypesAndProxiesCountRequest**](ModLtiGetToolTypesAndProxiesCountRequest.md) |  |  |

### Return type

[**ModLtiGetToolTypesAndProxiesCount200Response**](ModLtiGetToolTypesAndProxiesCount200Response.md)

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

<a id="modltiiscartridge"></a>
# **ModLtiIsCartridge**
> ModLtiIsCartridge200Response ModLtiIsCartridge (ModLtiIsCartridgeRequest modLtiIsCartridgeRequest)

Determine if the given url is for a cartridge

Determine if the given url is for a cartridge

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModLtiIsCartridgeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLtiApi(config);
            var modLtiIsCartridgeRequest = new ModLtiIsCartridgeRequest(); // ModLtiIsCartridgeRequest | 

            try
            {
                // Determine if the given url is for a cartridge
                ModLtiIsCartridge200Response result = apiInstance.ModLtiIsCartridge(modLtiIsCartridgeRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLtiApi.ModLtiIsCartridge: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLtiIsCartridgeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Determine if the given url is for a cartridge
    ApiResponse<ModLtiIsCartridge200Response> response = apiInstance.ModLtiIsCartridgeWithHttpInfo(modLtiIsCartridgeRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLtiApi.ModLtiIsCartridgeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLtiIsCartridgeRequest** | [**ModLtiIsCartridgeRequest**](ModLtiIsCartridgeRequest.md) |  |  |

### Return type

[**ModLtiIsCartridge200Response**](ModLtiIsCartridge200Response.md)

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

<a id="modltitoggleshowinactivitychooser"></a>
# **ModLtiToggleShowinactivitychooser**
> Object ModLtiToggleShowinactivitychooser (ModLtiToggleShowinactivitychooserRequest modLtiToggleShowinactivitychooserRequest)

Toggle showinactivitychooser for a tool type in a course

Toggle showinactivitychooser for a tool type in a course

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModLtiToggleShowinactivitychooserExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLtiApi(config);
            var modLtiToggleShowinactivitychooserRequest = new ModLtiToggleShowinactivitychooserRequest(); // ModLtiToggleShowinactivitychooserRequest | 

            try
            {
                // Toggle showinactivitychooser for a tool type in a course
                Object result = apiInstance.ModLtiToggleShowinactivitychooser(modLtiToggleShowinactivitychooserRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLtiApi.ModLtiToggleShowinactivitychooser: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLtiToggleShowinactivitychooserWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Toggle showinactivitychooser for a tool type in a course
    ApiResponse<Object> response = apiInstance.ModLtiToggleShowinactivitychooserWithHttpInfo(modLtiToggleShowinactivitychooserRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLtiApi.ModLtiToggleShowinactivitychooserWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLtiToggleShowinactivitychooserRequest** | [**ModLtiToggleShowinactivitychooserRequest**](ModLtiToggleShowinactivitychooserRequest.md) |  |  |

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
| **200** | Success |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modltiupdatetooltype"></a>
# **ModLtiUpdateToolType**
> ModLtiUpdateToolType200Response ModLtiUpdateToolType (ModLtiUpdateToolTypeRequest modLtiUpdateToolTypeRequest)

Update a tool type

Update a tool type

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModLtiUpdateToolTypeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLtiApi(config);
            var modLtiUpdateToolTypeRequest = new ModLtiUpdateToolTypeRequest(); // ModLtiUpdateToolTypeRequest | 

            try
            {
                // Update a tool type
                ModLtiUpdateToolType200Response result = apiInstance.ModLtiUpdateToolType(modLtiUpdateToolTypeRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLtiApi.ModLtiUpdateToolType: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLtiUpdateToolTypeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update a tool type
    ApiResponse<ModLtiUpdateToolType200Response> response = apiInstance.ModLtiUpdateToolTypeWithHttpInfo(modLtiUpdateToolTypeRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLtiApi.ModLtiUpdateToolTypeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLtiUpdateToolTypeRequest** | [**ModLtiUpdateToolTypeRequest**](ModLtiUpdateToolTypeRequest.md) |  |  |

### Return type

[**ModLtiUpdateToolType200Response**](ModLtiUpdateToolType200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tool |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modltiviewlti"></a>
# **ModLtiViewLti**
> CoreCalendarDeleteSubscription200Response ModLtiViewLti (ModLtiViewLtiRequest modLtiViewLtiRequest)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModLtiViewLtiExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModLtiApi(config);
            var modLtiViewLtiRequest = new ModLtiViewLtiRequest(); // ModLtiViewLtiRequest | 

            try
            {
                // Trigger the course module viewed event and update the module completion status.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModLtiViewLti(modLtiViewLtiRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModLtiApi.ModLtiViewLti: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModLtiViewLtiWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the course module viewed event and update the module completion status.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModLtiViewLtiWithHttpInfo(modLtiViewLtiRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModLtiApi.ModLtiViewLtiWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modLtiViewLtiRequest** | [**ModLtiViewLtiRequest**](ModLtiViewLtiRequest.md) |  |  |

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

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

