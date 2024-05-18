# Org.OpenAPITools.Api.ModWikiApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModWikiEditPage**](ModWikiApi.md#modwikieditpage) | **POST** /mod_wiki_edit_page | Save the contents of a page. |
| [**ModWikiGetPageContents**](ModWikiApi.md#modwikigetpagecontents) | **POST** /mod_wiki_get_page_contents | Returns the contents of a page. |
| [**ModWikiGetPageForEditing**](ModWikiApi.md#modwikigetpageforediting) | **POST** /mod_wiki_get_page_for_editing | Locks and retrieves info of page-section to be edited. |
| [**ModWikiGetSubwikiFiles**](ModWikiApi.md#modwikigetsubwikifiles) | **POST** /mod_wiki_get_subwiki_files | Returns the list of files for a specific subwiki. |
| [**ModWikiGetSubwikiPages**](ModWikiApi.md#modwikigetsubwikipages) | **POST** /mod_wiki_get_subwiki_pages | Returns the list of pages for a specific subwiki. |
| [**ModWikiGetSubwikis**](ModWikiApi.md#modwikigetsubwikis) | **POST** /mod_wiki_get_subwikis | Returns the list of subwikis the user can see in a specific wiki. |
| [**ModWikiGetWikisByCourses**](ModWikiApi.md#modwikigetwikisbycourses) | **POST** /mod_wiki_get_wikis_by_courses | Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned. |
| [**ModWikiNewPage**](ModWikiApi.md#modwikinewpage) | **POST** /mod_wiki_new_page | Create a new page in a subwiki. |
| [**ModWikiViewPage**](ModWikiApi.md#modwikiviewpage) | **POST** /mod_wiki_view_page | Trigger the page viewed event and update the module completion status. |
| [**ModWikiViewWiki**](ModWikiApi.md#modwikiviewwiki) | **POST** /mod_wiki_view_wiki | Trigger the course module viewed event and update the module completion status. |

<a id="modwikieditpage"></a>
# **ModWikiEditPage**
> ModWikiEditPage200Response ModWikiEditPage (ModWikiEditPageRequest modWikiEditPageRequest)

Save the contents of a page.

Save the contents of a page.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModWikiEditPageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWikiApi(config);
            var modWikiEditPageRequest = new ModWikiEditPageRequest(); // ModWikiEditPageRequest | 

            try
            {
                // Save the contents of a page.
                ModWikiEditPage200Response result = apiInstance.ModWikiEditPage(modWikiEditPageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWikiApi.ModWikiEditPage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWikiEditPageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Save the contents of a page.
    ApiResponse<ModWikiEditPage200Response> response = apiInstance.ModWikiEditPageWithHttpInfo(modWikiEditPageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWikiApi.ModWikiEditPageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWikiEditPageRequest** | [**ModWikiEditPageRequest**](ModWikiEditPageRequest.md) |  |  |

### Return type

[**ModWikiEditPage200Response**](ModWikiEditPage200Response.md)

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

<a id="modwikigetpagecontents"></a>
# **ModWikiGetPageContents**
> ModWikiGetPageContents200Response ModWikiGetPageContents (ModWikiGetPageContentsRequest modWikiGetPageContentsRequest)

Returns the contents of a page.

Returns the contents of a page.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModWikiGetPageContentsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWikiApi(config);
            var modWikiGetPageContentsRequest = new ModWikiGetPageContentsRequest(); // ModWikiGetPageContentsRequest | 

            try
            {
                // Returns the contents of a page.
                ModWikiGetPageContents200Response result = apiInstance.ModWikiGetPageContents(modWikiGetPageContentsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWikiApi.ModWikiGetPageContents: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWikiGetPageContentsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns the contents of a page.
    ApiResponse<ModWikiGetPageContents200Response> response = apiInstance.ModWikiGetPageContentsWithHttpInfo(modWikiGetPageContentsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWikiApi.ModWikiGetPageContentsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWikiGetPageContentsRequest** | [**ModWikiGetPageContentsRequest**](ModWikiGetPageContentsRequest.md) |  |  |

### Return type

[**ModWikiGetPageContents200Response**](ModWikiGetPageContents200Response.md)

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

<a id="modwikigetpageforediting"></a>
# **ModWikiGetPageForEditing**
> ModWikiGetPageForEditing200Response ModWikiGetPageForEditing (ModWikiGetPageForEditingRequest modWikiGetPageForEditingRequest)

Locks and retrieves info of page-section to be edited.

Locks and retrieves info of page-section to be edited.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModWikiGetPageForEditingExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWikiApi(config);
            var modWikiGetPageForEditingRequest = new ModWikiGetPageForEditingRequest(); // ModWikiGetPageForEditingRequest | 

            try
            {
                // Locks and retrieves info of page-section to be edited.
                ModWikiGetPageForEditing200Response result = apiInstance.ModWikiGetPageForEditing(modWikiGetPageForEditingRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWikiApi.ModWikiGetPageForEditing: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWikiGetPageForEditingWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Locks and retrieves info of page-section to be edited.
    ApiResponse<ModWikiGetPageForEditing200Response> response = apiInstance.ModWikiGetPageForEditingWithHttpInfo(modWikiGetPageForEditingRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWikiApi.ModWikiGetPageForEditingWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWikiGetPageForEditingRequest** | [**ModWikiGetPageForEditingRequest**](ModWikiGetPageForEditingRequest.md) |  |  |

### Return type

[**ModWikiGetPageForEditing200Response**](ModWikiGetPageForEditing200Response.md)

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

<a id="modwikigetsubwikifiles"></a>
# **ModWikiGetSubwikiFiles**
> CoreH5pGetTrustedH5pFile200Response ModWikiGetSubwikiFiles (ModWikiGetSubwikiFilesRequest modWikiGetSubwikiFilesRequest)

Returns the list of files for a specific subwiki.

Returns the list of files for a specific subwiki.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModWikiGetSubwikiFilesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWikiApi(config);
            var modWikiGetSubwikiFilesRequest = new ModWikiGetSubwikiFilesRequest(); // ModWikiGetSubwikiFilesRequest | 

            try
            {
                // Returns the list of files for a specific subwiki.
                CoreH5pGetTrustedH5pFile200Response result = apiInstance.ModWikiGetSubwikiFiles(modWikiGetSubwikiFilesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWikiApi.ModWikiGetSubwikiFiles: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWikiGetSubwikiFilesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns the list of files for a specific subwiki.
    ApiResponse<CoreH5pGetTrustedH5pFile200Response> response = apiInstance.ModWikiGetSubwikiFilesWithHttpInfo(modWikiGetSubwikiFilesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWikiApi.ModWikiGetSubwikiFilesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWikiGetSubwikiFilesRequest** | [**ModWikiGetSubwikiFilesRequest**](ModWikiGetSubwikiFilesRequest.md) |  |  |

### Return type

[**CoreH5pGetTrustedH5pFile200Response**](CoreH5pGetTrustedH5pFile200Response.md)

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

<a id="modwikigetsubwikipages"></a>
# **ModWikiGetSubwikiPages**
> ModWikiGetSubwikiPages200Response ModWikiGetSubwikiPages (ModWikiGetSubwikiPagesRequest modWikiGetSubwikiPagesRequest)

Returns the list of pages for a specific subwiki.

Returns the list of pages for a specific subwiki.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModWikiGetSubwikiPagesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWikiApi(config);
            var modWikiGetSubwikiPagesRequest = new ModWikiGetSubwikiPagesRequest(); // ModWikiGetSubwikiPagesRequest | 

            try
            {
                // Returns the list of pages for a specific subwiki.
                ModWikiGetSubwikiPages200Response result = apiInstance.ModWikiGetSubwikiPages(modWikiGetSubwikiPagesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWikiApi.ModWikiGetSubwikiPages: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWikiGetSubwikiPagesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns the list of pages for a specific subwiki.
    ApiResponse<ModWikiGetSubwikiPages200Response> response = apiInstance.ModWikiGetSubwikiPagesWithHttpInfo(modWikiGetSubwikiPagesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWikiApi.ModWikiGetSubwikiPagesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWikiGetSubwikiPagesRequest** | [**ModWikiGetSubwikiPagesRequest**](ModWikiGetSubwikiPagesRequest.md) |  |  |

### Return type

[**ModWikiGetSubwikiPages200Response**](ModWikiGetSubwikiPages200Response.md)

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

<a id="modwikigetsubwikis"></a>
# **ModWikiGetSubwikis**
> ModWikiGetSubwikis200Response ModWikiGetSubwikis (ModWikiGetSubwikisRequest modWikiGetSubwikisRequest)

Returns the list of subwikis the user can see in a specific wiki.

Returns the list of subwikis the user can see in a specific wiki.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModWikiGetSubwikisExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWikiApi(config);
            var modWikiGetSubwikisRequest = new ModWikiGetSubwikisRequest(); // ModWikiGetSubwikisRequest | 

            try
            {
                // Returns the list of subwikis the user can see in a specific wiki.
                ModWikiGetSubwikis200Response result = apiInstance.ModWikiGetSubwikis(modWikiGetSubwikisRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWikiApi.ModWikiGetSubwikis: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWikiGetSubwikisWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns the list of subwikis the user can see in a specific wiki.
    ApiResponse<ModWikiGetSubwikis200Response> response = apiInstance.ModWikiGetSubwikisWithHttpInfo(modWikiGetSubwikisRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWikiApi.ModWikiGetSubwikisWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWikiGetSubwikisRequest** | [**ModWikiGetSubwikisRequest**](ModWikiGetSubwikisRequest.md) |  |  |

### Return type

[**ModWikiGetSubwikis200Response**](ModWikiGetSubwikis200Response.md)

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

<a id="modwikigetwikisbycourses"></a>
# **ModWikiGetWikisByCourses**
> ModWikiGetWikisByCourses200Response ModWikiGetWikisByCourses (ModWikiGetWikisByCoursesRequest modWikiGetWikisByCoursesRequest)

Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.

Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModWikiGetWikisByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWikiApi(config);
            var modWikiGetWikisByCoursesRequest = new ModWikiGetWikisByCoursesRequest(); // ModWikiGetWikisByCoursesRequest | 

            try
            {
                // Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.
                ModWikiGetWikisByCourses200Response result = apiInstance.ModWikiGetWikisByCourses(modWikiGetWikisByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWikiApi.ModWikiGetWikisByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWikiGetWikisByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.
    ApiResponse<ModWikiGetWikisByCourses200Response> response = apiInstance.ModWikiGetWikisByCoursesWithHttpInfo(modWikiGetWikisByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWikiApi.ModWikiGetWikisByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWikiGetWikisByCoursesRequest** | [**ModWikiGetWikisByCoursesRequest**](ModWikiGetWikisByCoursesRequest.md) |  |  |

### Return type

[**ModWikiGetWikisByCourses200Response**](ModWikiGetWikisByCourses200Response.md)

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

<a id="modwikinewpage"></a>
# **ModWikiNewPage**
> ModWikiNewPage200Response ModWikiNewPage (ModWikiNewPageRequest modWikiNewPageRequest)

Create a new page in a subwiki.

Create a new page in a subwiki.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModWikiNewPageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWikiApi(config);
            var modWikiNewPageRequest = new ModWikiNewPageRequest(); // ModWikiNewPageRequest | 

            try
            {
                // Create a new page in a subwiki.
                ModWikiNewPage200Response result = apiInstance.ModWikiNewPage(modWikiNewPageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWikiApi.ModWikiNewPage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWikiNewPageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create a new page in a subwiki.
    ApiResponse<ModWikiNewPage200Response> response = apiInstance.ModWikiNewPageWithHttpInfo(modWikiNewPageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWikiApi.ModWikiNewPageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWikiNewPageRequest** | [**ModWikiNewPageRequest**](ModWikiNewPageRequest.md) |  |  |

### Return type

[**ModWikiNewPage200Response**](ModWikiNewPage200Response.md)

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

<a id="modwikiviewpage"></a>
# **ModWikiViewPage**
> ModWikiViewPage200Response ModWikiViewPage (ModWikiViewPageRequest modWikiViewPageRequest)

Trigger the page viewed event and update the module completion status.

Trigger the page viewed event and update the module completion status.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModWikiViewPageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWikiApi(config);
            var modWikiViewPageRequest = new ModWikiViewPageRequest(); // ModWikiViewPageRequest | 

            try
            {
                // Trigger the page viewed event and update the module completion status.
                ModWikiViewPage200Response result = apiInstance.ModWikiViewPage(modWikiViewPageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWikiApi.ModWikiViewPage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWikiViewPageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the page viewed event and update the module completion status.
    ApiResponse<ModWikiViewPage200Response> response = apiInstance.ModWikiViewPageWithHttpInfo(modWikiViewPageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWikiApi.ModWikiViewPageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWikiViewPageRequest** | [**ModWikiViewPageRequest**](ModWikiViewPageRequest.md) |  |  |

### Return type

[**ModWikiViewPage200Response**](ModWikiViewPage200Response.md)

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

<a id="modwikiviewwiki"></a>
# **ModWikiViewWiki**
> ModWikiViewWiki200Response ModWikiViewWiki (ModWikiGetSubwikisRequest modWikiGetSubwikisRequest)

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
    public class ModWikiViewWikiExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModWikiApi(config);
            var modWikiGetSubwikisRequest = new ModWikiGetSubwikisRequest(); // ModWikiGetSubwikisRequest | 

            try
            {
                // Trigger the course module viewed event and update the module completion status.
                ModWikiViewWiki200Response result = apiInstance.ModWikiViewWiki(modWikiGetSubwikisRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModWikiApi.ModWikiViewWiki: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModWikiViewWikiWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the course module viewed event and update the module completion status.
    ApiResponse<ModWikiViewWiki200Response> response = apiInstance.ModWikiViewWikiWithHttpInfo(modWikiGetSubwikisRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModWikiApi.ModWikiViewWikiWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modWikiGetSubwikisRequest** | [**ModWikiGetSubwikisRequest**](ModWikiGetSubwikisRequest.md) |  |  |

### Return type

[**ModWikiViewWiki200Response**](ModWikiViewWiki200Response.md)

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

