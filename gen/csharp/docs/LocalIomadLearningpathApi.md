# Org.OpenAPITools.Api.LocalIomadLearningpathApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**LocalIomadLearningpathActivate**](LocalIomadLearningpathApi.md#localiomadlearningpathactivate) | **POST** /local_iomad_learningpath_activate | Activates / deactivates learning path |
| [**LocalIomadLearningpathAddcourses**](LocalIomadLearningpathApi.md#localiomadlearningpathaddcourses) | **POST** /local_iomad_learningpath_addcourses | Add courses to learning path |
| [**LocalIomadLearningpathAddusers**](LocalIomadLearningpathApi.md#localiomadlearningpathaddusers) | **POST** /local_iomad_learningpath_addusers | Add users to learning path |
| [**LocalIomadLearningpathCopypath**](LocalIomadLearningpathApi.md#localiomadlearningpathcopypath) | **POST** /local_iomad_learningpath_copypath | Copy a learning path |
| [**LocalIomadLearningpathDeletepath**](LocalIomadLearningpathApi.md#localiomadlearningpathdeletepath) | **POST** /local_iomad_learningpath_deletepath | Completely delete a learning path |
| [**LocalIomadLearningpathGetcourses**](LocalIomadLearningpathApi.md#localiomadlearningpathgetcourses) | **POST** /local_iomad_learningpath_getcourses | Read list of courses for given learning |
| [**LocalIomadLearningpathGetprospectivecourses**](LocalIomadLearningpathApi.md#localiomadlearningpathgetprospectivecourses) | **POST** /local_iomad_learningpath_getprospectivecourses | Read set of filtered courses for given company |
| [**LocalIomadLearningpathGetprospectiveusers**](LocalIomadLearningpathApi.md#localiomadlearningpathgetprospectiveusers) | **POST** /local_iomad_learningpath_getprospectiveusers | Get set of filtered users for given company |
| [**LocalIomadLearningpathGetusers**](LocalIomadLearningpathApi.md#localiomadlearningpathgetusers) | **POST** /local_iomad_learningpath_getusers | Get users assigned to path |
| [**LocalIomadLearningpathOrdercourses**](LocalIomadLearningpathApi.md#localiomadlearningpathordercourses) | **POST** /local_iomad_learningpath_ordercourses | Set sequence of courses in learning path |
| [**LocalIomadLearningpathRemovecourses**](LocalIomadLearningpathApi.md#localiomadlearningpathremovecourses) | **POST** /local_iomad_learningpath_removecourses | Remove courses from learning path |
| [**LocalIomadLearningpathRemoveusers**](LocalIomadLearningpathApi.md#localiomadlearningpathremoveusers) | **POST** /local_iomad_learningpath_removeusers | Remove users from learning path |

<a id="localiomadlearningpathactivate"></a>
# **LocalIomadLearningpathActivate**
> Object LocalIomadLearningpathActivate (LocalIomadLearningpathActivateRequest localIomadLearningpathActivateRequest)

Activates / deactivates learning path

Activates / deactivates learning path

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class LocalIomadLearningpathActivateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new LocalIomadLearningpathApi(config);
            var localIomadLearningpathActivateRequest = new LocalIomadLearningpathActivateRequest(); // LocalIomadLearningpathActivateRequest | 

            try
            {
                // Activates / deactivates learning path
                Object result = apiInstance.LocalIomadLearningpathActivate(localIomadLearningpathActivateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathActivate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LocalIomadLearningpathActivateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Activates / deactivates learning path
    ApiResponse<Object> response = apiInstance.LocalIomadLearningpathActivateWithHttpInfo(localIomadLearningpathActivateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathActivateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **localIomadLearningpathActivateRequest** | [**LocalIomadLearningpathActivateRequest**](LocalIomadLearningpathActivateRequest.md) |  |  |

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
| **200** | True if active state set correctly |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="localiomadlearningpathaddcourses"></a>
# **LocalIomadLearningpathAddcourses**
> Object LocalIomadLearningpathAddcourses (LocalIomadLearningpathAddcoursesRequest localIomadLearningpathAddcoursesRequest)

Add courses to learning path

Add courses to learning path

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class LocalIomadLearningpathAddcoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new LocalIomadLearningpathApi(config);
            var localIomadLearningpathAddcoursesRequest = new LocalIomadLearningpathAddcoursesRequest(); // LocalIomadLearningpathAddcoursesRequest | 

            try
            {
                // Add courses to learning path
                Object result = apiInstance.LocalIomadLearningpathAddcourses(localIomadLearningpathAddcoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathAddcourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LocalIomadLearningpathAddcoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Add courses to learning path
    ApiResponse<Object> response = apiInstance.LocalIomadLearningpathAddcoursesWithHttpInfo(localIomadLearningpathAddcoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathAddcoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **localIomadLearningpathAddcoursesRequest** | [**LocalIomadLearningpathAddcoursesRequest**](LocalIomadLearningpathAddcoursesRequest.md) |  |  |

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
| **200** | True if courses added correctly |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="localiomadlearningpathaddusers"></a>
# **LocalIomadLearningpathAddusers**
> Object LocalIomadLearningpathAddusers (LocalIomadLearningpathAddusersRequest localIomadLearningpathAddusersRequest)

Add users to learning path

Add users to learning path

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class LocalIomadLearningpathAddusersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new LocalIomadLearningpathApi(config);
            var localIomadLearningpathAddusersRequest = new LocalIomadLearningpathAddusersRequest(); // LocalIomadLearningpathAddusersRequest | 

            try
            {
                // Add users to learning path
                Object result = apiInstance.LocalIomadLearningpathAddusers(localIomadLearningpathAddusersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathAddusers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LocalIomadLearningpathAddusersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Add users to learning path
    ApiResponse<Object> response = apiInstance.LocalIomadLearningpathAddusersWithHttpInfo(localIomadLearningpathAddusersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathAddusersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **localIomadLearningpathAddusersRequest** | [**LocalIomadLearningpathAddusersRequest**](LocalIomadLearningpathAddusersRequest.md) |  |  |

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
| **200** | True if users added correctly |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="localiomadlearningpathcopypath"></a>
# **LocalIomadLearningpathCopypath**
> Object LocalIomadLearningpathCopypath (LocalIomadLearningpathCopypathRequest localIomadLearningpathCopypathRequest)

Copy a learning path

Copy a learning path

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class LocalIomadLearningpathCopypathExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new LocalIomadLearningpathApi(config);
            var localIomadLearningpathCopypathRequest = new LocalIomadLearningpathCopypathRequest(); // LocalIomadLearningpathCopypathRequest | 

            try
            {
                // Copy a learning path
                Object result = apiInstance.LocalIomadLearningpathCopypath(localIomadLearningpathCopypathRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathCopypath: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LocalIomadLearningpathCopypathWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Copy a learning path
    ApiResponse<Object> response = apiInstance.LocalIomadLearningpathCopypathWithHttpInfo(localIomadLearningpathCopypathRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathCopypathWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **localIomadLearningpathCopypathRequest** | [**LocalIomadLearningpathCopypathRequest**](LocalIomadLearningpathCopypathRequest.md) |  |  |

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
| **200** | True if path copied correctly |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="localiomadlearningpathdeletepath"></a>
# **LocalIomadLearningpathDeletepath**
> Object LocalIomadLearningpathDeletepath (LocalIomadLearningpathCopypathRequest localIomadLearningpathCopypathRequest)

Completely delete a learning path

Completely delete a learning path

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class LocalIomadLearningpathDeletepathExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new LocalIomadLearningpathApi(config);
            var localIomadLearningpathCopypathRequest = new LocalIomadLearningpathCopypathRequest(); // LocalIomadLearningpathCopypathRequest | 

            try
            {
                // Completely delete a learning path
                Object result = apiInstance.LocalIomadLearningpathDeletepath(localIomadLearningpathCopypathRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathDeletepath: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LocalIomadLearningpathDeletepathWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Completely delete a learning path
    ApiResponse<Object> response = apiInstance.LocalIomadLearningpathDeletepathWithHttpInfo(localIomadLearningpathCopypathRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathDeletepathWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **localIomadLearningpathCopypathRequest** | [**LocalIomadLearningpathCopypathRequest**](LocalIomadLearningpathCopypathRequest.md) |  |  |

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
| **200** | True if courses added correctly |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="localiomadlearningpathgetcourses"></a>
# **LocalIomadLearningpathGetcourses**
> Object LocalIomadLearningpathGetcourses (LocalIomadLearningpathGetcoursesRequest localIomadLearningpathGetcoursesRequest)

Read list of courses for given learning

Read list of courses for given learning

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class LocalIomadLearningpathGetcoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new LocalIomadLearningpathApi(config);
            var localIomadLearningpathGetcoursesRequest = new LocalIomadLearningpathGetcoursesRequest(); // LocalIomadLearningpathGetcoursesRequest | 

            try
            {
                // Read list of courses for given learning
                Object result = apiInstance.LocalIomadLearningpathGetcourses(localIomadLearningpathGetcoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathGetcourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LocalIomadLearningpathGetcoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Read list of courses for given learning
    ApiResponse<Object> response = apiInstance.LocalIomadLearningpathGetcoursesWithHttpInfo(localIomadLearningpathGetcoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathGetcoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **localIomadLearningpathGetcoursesRequest** | [**LocalIomadLearningpathGetcoursesRequest**](LocalIomadLearningpathGetcoursesRequest.md) |  |  |

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

<a id="localiomadlearningpathgetprospectivecourses"></a>
# **LocalIomadLearningpathGetprospectivecourses**
> Object LocalIomadLearningpathGetprospectivecourses (LocalIomadLearningpathGetprospectivecoursesRequest localIomadLearningpathGetprospectivecoursesRequest)

Read set of filtered courses for given company

Read set of filtered courses for given company

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class LocalIomadLearningpathGetprospectivecoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new LocalIomadLearningpathApi(config);
            var localIomadLearningpathGetprospectivecoursesRequest = new LocalIomadLearningpathGetprospectivecoursesRequest(); // LocalIomadLearningpathGetprospectivecoursesRequest | 

            try
            {
                // Read set of filtered courses for given company
                Object result = apiInstance.LocalIomadLearningpathGetprospectivecourses(localIomadLearningpathGetprospectivecoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathGetprospectivecourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LocalIomadLearningpathGetprospectivecoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Read set of filtered courses for given company
    ApiResponse<Object> response = apiInstance.LocalIomadLearningpathGetprospectivecoursesWithHttpInfo(localIomadLearningpathGetprospectivecoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathGetprospectivecoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **localIomadLearningpathGetprospectivecoursesRequest** | [**LocalIomadLearningpathGetprospectivecoursesRequest**](LocalIomadLearningpathGetprospectivecoursesRequest.md) |  |  |

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

<a id="localiomadlearningpathgetprospectiveusers"></a>
# **LocalIomadLearningpathGetprospectiveusers**
> Object LocalIomadLearningpathGetprospectiveusers (LocalIomadLearningpathGetprospectiveusersRequest localIomadLearningpathGetprospectiveusersRequest)

Get set of filtered users for given company

Get set of filtered users for given company

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class LocalIomadLearningpathGetprospectiveusersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new LocalIomadLearningpathApi(config);
            var localIomadLearningpathGetprospectiveusersRequest = new LocalIomadLearningpathGetprospectiveusersRequest(); // LocalIomadLearningpathGetprospectiveusersRequest | 

            try
            {
                // Get set of filtered users for given company
                Object result = apiInstance.LocalIomadLearningpathGetprospectiveusers(localIomadLearningpathGetprospectiveusersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathGetprospectiveusers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LocalIomadLearningpathGetprospectiveusersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get set of filtered users for given company
    ApiResponse<Object> response = apiInstance.LocalIomadLearningpathGetprospectiveusersWithHttpInfo(localIomadLearningpathGetprospectiveusersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathGetprospectiveusersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **localIomadLearningpathGetprospectiveusersRequest** | [**LocalIomadLearningpathGetprospectiveusersRequest**](LocalIomadLearningpathGetprospectiveusersRequest.md) |  |  |

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

<a id="localiomadlearningpathgetusers"></a>
# **LocalIomadLearningpathGetusers**
> Object LocalIomadLearningpathGetusers (LocalIomadLearningpathGetusersRequest localIomadLearningpathGetusersRequest)

Get users assigned to path

Get users assigned to path

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class LocalIomadLearningpathGetusersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new LocalIomadLearningpathApi(config);
            var localIomadLearningpathGetusersRequest = new LocalIomadLearningpathGetusersRequest(); // LocalIomadLearningpathGetusersRequest | 

            try
            {
                // Get users assigned to path
                Object result = apiInstance.LocalIomadLearningpathGetusers(localIomadLearningpathGetusersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathGetusers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LocalIomadLearningpathGetusersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get users assigned to path
    ApiResponse<Object> response = apiInstance.LocalIomadLearningpathGetusersWithHttpInfo(localIomadLearningpathGetusersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathGetusersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **localIomadLearningpathGetusersRequest** | [**LocalIomadLearningpathGetusersRequest**](LocalIomadLearningpathGetusersRequest.md) |  |  |

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

<a id="localiomadlearningpathordercourses"></a>
# **LocalIomadLearningpathOrdercourses**
> Object LocalIomadLearningpathOrdercourses (LocalIomadLearningpathOrdercoursesRequest localIomadLearningpathOrdercoursesRequest)

Set sequence of courses in learning path

Set sequence of courses in learning path

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class LocalIomadLearningpathOrdercoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new LocalIomadLearningpathApi(config);
            var localIomadLearningpathOrdercoursesRequest = new LocalIomadLearningpathOrdercoursesRequest(); // LocalIomadLearningpathOrdercoursesRequest | 

            try
            {
                // Set sequence of courses in learning path
                Object result = apiInstance.LocalIomadLearningpathOrdercourses(localIomadLearningpathOrdercoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathOrdercourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LocalIomadLearningpathOrdercoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Set sequence of courses in learning path
    ApiResponse<Object> response = apiInstance.LocalIomadLearningpathOrdercoursesWithHttpInfo(localIomadLearningpathOrdercoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathOrdercoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **localIomadLearningpathOrdercoursesRequest** | [**LocalIomadLearningpathOrdercoursesRequest**](LocalIomadLearningpathOrdercoursesRequest.md) |  |  |

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
| **200** | True if courses ordered correctly |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="localiomadlearningpathremovecourses"></a>
# **LocalIomadLearningpathRemovecourses**
> Object LocalIomadLearningpathRemovecourses (LocalIomadLearningpathRemovecoursesRequest localIomadLearningpathRemovecoursesRequest)

Remove courses from learning path

Remove courses from learning path

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class LocalIomadLearningpathRemovecoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new LocalIomadLearningpathApi(config);
            var localIomadLearningpathRemovecoursesRequest = new LocalIomadLearningpathRemovecoursesRequest(); // LocalIomadLearningpathRemovecoursesRequest | 

            try
            {
                // Remove courses from learning path
                Object result = apiInstance.LocalIomadLearningpathRemovecourses(localIomadLearningpathRemovecoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathRemovecourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LocalIomadLearningpathRemovecoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Remove courses from learning path
    ApiResponse<Object> response = apiInstance.LocalIomadLearningpathRemovecoursesWithHttpInfo(localIomadLearningpathRemovecoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathRemovecoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **localIomadLearningpathRemovecoursesRequest** | [**LocalIomadLearningpathRemovecoursesRequest**](LocalIomadLearningpathRemovecoursesRequest.md) |  |  |

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
| **200** | True if courses removed correctly |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="localiomadlearningpathremoveusers"></a>
# **LocalIomadLearningpathRemoveusers**
> Object LocalIomadLearningpathRemoveusers (LocalIomadLearningpathRemoveusersRequest localIomadLearningpathRemoveusersRequest)

Remove users from learning path

Remove users from learning path

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class LocalIomadLearningpathRemoveusersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new LocalIomadLearningpathApi(config);
            var localIomadLearningpathRemoveusersRequest = new LocalIomadLearningpathRemoveusersRequest(); // LocalIomadLearningpathRemoveusersRequest | 

            try
            {
                // Remove users from learning path
                Object result = apiInstance.LocalIomadLearningpathRemoveusers(localIomadLearningpathRemoveusersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathRemoveusers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LocalIomadLearningpathRemoveusersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Remove users from learning path
    ApiResponse<Object> response = apiInstance.LocalIomadLearningpathRemoveusersWithHttpInfo(localIomadLearningpathRemoveusersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LocalIomadLearningpathApi.LocalIomadLearningpathRemoveusersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **localIomadLearningpathRemoveusersRequest** | [**LocalIomadLearningpathRemoveusersRequest**](LocalIomadLearningpathRemoveusersRequest.md) |  |  |

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
| **200** | True if users removed correctly |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

