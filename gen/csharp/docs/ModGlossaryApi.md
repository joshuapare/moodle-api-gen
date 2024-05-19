# Org.OpenAPITools.Api.ModGlossaryApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModGlossaryAddEntry**](ModGlossaryApi.md#modglossaryaddentry) | **POST** /mod_glossary_add_entry | Add a new entry to a given glossary |
| [**ModGlossaryDeleteEntry**](ModGlossaryApi.md#modglossarydeleteentry) | **POST** /mod_glossary_delete_entry | Delete the given entry from the glossary. |
| [**ModGlossaryGetAuthors**](ModGlossaryApi.md#modglossarygetauthors) | **POST** /mod_glossary_get_authors | Get the authors. |
| [**ModGlossaryGetCategories**](ModGlossaryApi.md#modglossarygetcategories) | **POST** /mod_glossary_get_categories | Get the categories. |
| [**ModGlossaryGetEntriesByAuthor**](ModGlossaryApi.md#modglossarygetentriesbyauthor) | **POST** /mod_glossary_get_entries_by_author | Browse entries by author. |
| [**ModGlossaryGetEntriesByAuthorId**](ModGlossaryApi.md#modglossarygetentriesbyauthorid) | **POST** /mod_glossary_get_entries_by_author_id | Browse entries by author ID. |
| [**ModGlossaryGetEntriesByCategory**](ModGlossaryApi.md#modglossarygetentriesbycategory) | **POST** /mod_glossary_get_entries_by_category | Browse entries by category. |
| [**ModGlossaryGetEntriesByDate**](ModGlossaryApi.md#modglossarygetentriesbydate) | **POST** /mod_glossary_get_entries_by_date | Browse entries by date. |
| [**ModGlossaryGetEntriesByLetter**](ModGlossaryApi.md#modglossarygetentriesbyletter) | **POST** /mod_glossary_get_entries_by_letter | Browse entries by letter. |
| [**ModGlossaryGetEntriesBySearch**](ModGlossaryApi.md#modglossarygetentriesbysearch) | **POST** /mod_glossary_get_entries_by_search | Browse entries by search query. |
| [**ModGlossaryGetEntriesByTerm**](ModGlossaryApi.md#modglossarygetentriesbyterm) | **POST** /mod_glossary_get_entries_by_term | Browse entries by term (concept or alias). |
| [**ModGlossaryGetEntriesToApprove**](ModGlossaryApi.md#modglossarygetentriestoapprove) | **POST** /mod_glossary_get_entries_to_approve | Browse entries to be approved. |
| [**ModGlossaryGetEntryById**](ModGlossaryApi.md#modglossarygetentrybyid) | **POST** /mod_glossary_get_entry_by_id | Get an entry by ID |
| [**ModGlossaryGetGlossariesByCourses**](ModGlossaryApi.md#modglossarygetglossariesbycourses) | **POST** /mod_glossary_get_glossaries_by_courses | Retrieve a list of glossaries from several courses. |
| [**ModGlossaryPrepareEntryForEdition**](ModGlossaryApi.md#modglossaryprepareentryforedition) | **POST** /mod_glossary_prepare_entry_for_edition | Prepares the given entry for edition returning draft item areas and file areas information. |
| [**ModGlossaryUpdateEntry**](ModGlossaryApi.md#modglossaryupdateentry) | **POST** /mod_glossary_update_entry | Updates the given glossary entry. |
| [**ModGlossaryViewEntry**](ModGlossaryApi.md#modglossaryviewentry) | **POST** /mod_glossary_view_entry | Notify a glossary entry as being viewed. |
| [**ModGlossaryViewGlossary**](ModGlossaryApi.md#modglossaryviewglossary) | **POST** /mod_glossary_view_glossary | Notify the glossary as being viewed. |

<a id="modglossaryaddentry"></a>
# **ModGlossaryAddEntry**
> ModGlossaryAddEntry200Response ModGlossaryAddEntry (ModGlossaryAddEntryRequest modGlossaryAddEntryRequest)

Add a new entry to a given glossary

Add a new entry to a given glossary

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModGlossaryAddEntryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModGlossaryApi(config);
            var modGlossaryAddEntryRequest = new ModGlossaryAddEntryRequest(); // ModGlossaryAddEntryRequest | 

            try
            {
                // Add a new entry to a given glossary
                ModGlossaryAddEntry200Response result = apiInstance.ModGlossaryAddEntry(modGlossaryAddEntryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryAddEntry: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModGlossaryAddEntryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Add a new entry to a given glossary
    ApiResponse<ModGlossaryAddEntry200Response> response = apiInstance.ModGlossaryAddEntryWithHttpInfo(modGlossaryAddEntryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryAddEntryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modGlossaryAddEntryRequest** | [**ModGlossaryAddEntryRequest**](ModGlossaryAddEntryRequest.md) |  |  |

### Return type

[**ModGlossaryAddEntry200Response**](ModGlossaryAddEntry200Response.md)

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

<a id="modglossarydeleteentry"></a>
# **ModGlossaryDeleteEntry**
> CoreContentbankRenameContent200Response ModGlossaryDeleteEntry (ModGlossaryDeleteEntryRequest modGlossaryDeleteEntryRequest)

Delete the given entry from the glossary.

Delete the given entry from the glossary.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModGlossaryDeleteEntryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModGlossaryApi(config);
            var modGlossaryDeleteEntryRequest = new ModGlossaryDeleteEntryRequest(); // ModGlossaryDeleteEntryRequest | 

            try
            {
                // Delete the given entry from the glossary.
                CoreContentbankRenameContent200Response result = apiInstance.ModGlossaryDeleteEntry(modGlossaryDeleteEntryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryDeleteEntry: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModGlossaryDeleteEntryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete the given entry from the glossary.
    ApiResponse<CoreContentbankRenameContent200Response> response = apiInstance.ModGlossaryDeleteEntryWithHttpInfo(modGlossaryDeleteEntryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryDeleteEntryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modGlossaryDeleteEntryRequest** | [**ModGlossaryDeleteEntryRequest**](ModGlossaryDeleteEntryRequest.md) |  |  |

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

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

<a id="modglossarygetauthors"></a>
# **ModGlossaryGetAuthors**
> ModGlossaryGetAuthors200Response ModGlossaryGetAuthors (ModGlossaryGetAuthorsRequest modGlossaryGetAuthorsRequest)

Get the authors.

Get the authors.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModGlossaryGetAuthorsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModGlossaryApi(config);
            var modGlossaryGetAuthorsRequest = new ModGlossaryGetAuthorsRequest(); // ModGlossaryGetAuthorsRequest | 

            try
            {
                // Get the authors.
                ModGlossaryGetAuthors200Response result = apiInstance.ModGlossaryGetAuthors(modGlossaryGetAuthorsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetAuthors: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModGlossaryGetAuthorsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get the authors.
    ApiResponse<ModGlossaryGetAuthors200Response> response = apiInstance.ModGlossaryGetAuthorsWithHttpInfo(modGlossaryGetAuthorsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetAuthorsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modGlossaryGetAuthorsRequest** | [**ModGlossaryGetAuthorsRequest**](ModGlossaryGetAuthorsRequest.md) |  |  |

### Return type

[**ModGlossaryGetAuthors200Response**](ModGlossaryGetAuthors200Response.md)

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

<a id="modglossarygetcategories"></a>
# **ModGlossaryGetCategories**
> ModGlossaryGetCategories200Response ModGlossaryGetCategories (ModGlossaryGetCategoriesRequest modGlossaryGetCategoriesRequest)

Get the categories.

Get the categories.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModGlossaryGetCategoriesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModGlossaryApi(config);
            var modGlossaryGetCategoriesRequest = new ModGlossaryGetCategoriesRequest(); // ModGlossaryGetCategoriesRequest | 

            try
            {
                // Get the categories.
                ModGlossaryGetCategories200Response result = apiInstance.ModGlossaryGetCategories(modGlossaryGetCategoriesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetCategories: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModGlossaryGetCategoriesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get the categories.
    ApiResponse<ModGlossaryGetCategories200Response> response = apiInstance.ModGlossaryGetCategoriesWithHttpInfo(modGlossaryGetCategoriesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetCategoriesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modGlossaryGetCategoriesRequest** | [**ModGlossaryGetCategoriesRequest**](ModGlossaryGetCategoriesRequest.md) |  |  |

### Return type

[**ModGlossaryGetCategories200Response**](ModGlossaryGetCategories200Response.md)

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

<a id="modglossarygetentriesbyauthor"></a>
# **ModGlossaryGetEntriesByAuthor**
> ModGlossaryGetEntriesByAuthor200Response ModGlossaryGetEntriesByAuthor (ModGlossaryGetEntriesByAuthorRequest modGlossaryGetEntriesByAuthorRequest)

Browse entries by author.

Browse entries by author.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModGlossaryGetEntriesByAuthorExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModGlossaryApi(config);
            var modGlossaryGetEntriesByAuthorRequest = new ModGlossaryGetEntriesByAuthorRequest(); // ModGlossaryGetEntriesByAuthorRequest | 

            try
            {
                // Browse entries by author.
                ModGlossaryGetEntriesByAuthor200Response result = apiInstance.ModGlossaryGetEntriesByAuthor(modGlossaryGetEntriesByAuthorRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetEntriesByAuthor: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModGlossaryGetEntriesByAuthorWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Browse entries by author.
    ApiResponse<ModGlossaryGetEntriesByAuthor200Response> response = apiInstance.ModGlossaryGetEntriesByAuthorWithHttpInfo(modGlossaryGetEntriesByAuthorRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetEntriesByAuthorWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modGlossaryGetEntriesByAuthorRequest** | [**ModGlossaryGetEntriesByAuthorRequest**](ModGlossaryGetEntriesByAuthorRequest.md) |  |  |

### Return type

[**ModGlossaryGetEntriesByAuthor200Response**](ModGlossaryGetEntriesByAuthor200Response.md)

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

<a id="modglossarygetentriesbyauthorid"></a>
# **ModGlossaryGetEntriesByAuthorId**
> ModGlossaryGetEntriesByAuthorId200Response ModGlossaryGetEntriesByAuthorId (ModGlossaryGetEntriesByAuthorIdRequest modGlossaryGetEntriesByAuthorIdRequest)

Browse entries by author ID.

Browse entries by author ID.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModGlossaryGetEntriesByAuthorIdExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModGlossaryApi(config);
            var modGlossaryGetEntriesByAuthorIdRequest = new ModGlossaryGetEntriesByAuthorIdRequest(); // ModGlossaryGetEntriesByAuthorIdRequest | 

            try
            {
                // Browse entries by author ID.
                ModGlossaryGetEntriesByAuthorId200Response result = apiInstance.ModGlossaryGetEntriesByAuthorId(modGlossaryGetEntriesByAuthorIdRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetEntriesByAuthorId: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModGlossaryGetEntriesByAuthorIdWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Browse entries by author ID.
    ApiResponse<ModGlossaryGetEntriesByAuthorId200Response> response = apiInstance.ModGlossaryGetEntriesByAuthorIdWithHttpInfo(modGlossaryGetEntriesByAuthorIdRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetEntriesByAuthorIdWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modGlossaryGetEntriesByAuthorIdRequest** | [**ModGlossaryGetEntriesByAuthorIdRequest**](ModGlossaryGetEntriesByAuthorIdRequest.md) |  |  |

### Return type

[**ModGlossaryGetEntriesByAuthorId200Response**](ModGlossaryGetEntriesByAuthorId200Response.md)

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

<a id="modglossarygetentriesbycategory"></a>
# **ModGlossaryGetEntriesByCategory**
> ModGlossaryGetEntriesByCategory200Response ModGlossaryGetEntriesByCategory (ModGlossaryGetEntriesByCategoryRequest modGlossaryGetEntriesByCategoryRequest)

Browse entries by category.

Browse entries by category.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModGlossaryGetEntriesByCategoryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModGlossaryApi(config);
            var modGlossaryGetEntriesByCategoryRequest = new ModGlossaryGetEntriesByCategoryRequest(); // ModGlossaryGetEntriesByCategoryRequest | 

            try
            {
                // Browse entries by category.
                ModGlossaryGetEntriesByCategory200Response result = apiInstance.ModGlossaryGetEntriesByCategory(modGlossaryGetEntriesByCategoryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetEntriesByCategory: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModGlossaryGetEntriesByCategoryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Browse entries by category.
    ApiResponse<ModGlossaryGetEntriesByCategory200Response> response = apiInstance.ModGlossaryGetEntriesByCategoryWithHttpInfo(modGlossaryGetEntriesByCategoryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetEntriesByCategoryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modGlossaryGetEntriesByCategoryRequest** | [**ModGlossaryGetEntriesByCategoryRequest**](ModGlossaryGetEntriesByCategoryRequest.md) |  |  |

### Return type

[**ModGlossaryGetEntriesByCategory200Response**](ModGlossaryGetEntriesByCategory200Response.md)

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

<a id="modglossarygetentriesbydate"></a>
# **ModGlossaryGetEntriesByDate**
> ModGlossaryGetEntriesByAuthorId200Response ModGlossaryGetEntriesByDate (ModGlossaryGetEntriesByDateRequest modGlossaryGetEntriesByDateRequest)

Browse entries by date.

Browse entries by date.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModGlossaryGetEntriesByDateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModGlossaryApi(config);
            var modGlossaryGetEntriesByDateRequest = new ModGlossaryGetEntriesByDateRequest(); // ModGlossaryGetEntriesByDateRequest | 

            try
            {
                // Browse entries by date.
                ModGlossaryGetEntriesByAuthorId200Response result = apiInstance.ModGlossaryGetEntriesByDate(modGlossaryGetEntriesByDateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetEntriesByDate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModGlossaryGetEntriesByDateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Browse entries by date.
    ApiResponse<ModGlossaryGetEntriesByAuthorId200Response> response = apiInstance.ModGlossaryGetEntriesByDateWithHttpInfo(modGlossaryGetEntriesByDateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetEntriesByDateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modGlossaryGetEntriesByDateRequest** | [**ModGlossaryGetEntriesByDateRequest**](ModGlossaryGetEntriesByDateRequest.md) |  |  |

### Return type

[**ModGlossaryGetEntriesByAuthorId200Response**](ModGlossaryGetEntriesByAuthorId200Response.md)

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

<a id="modglossarygetentriesbyletter"></a>
# **ModGlossaryGetEntriesByLetter**
> ModGlossaryGetEntriesByAuthorId200Response ModGlossaryGetEntriesByLetter (ModGlossaryGetEntriesByLetterRequest modGlossaryGetEntriesByLetterRequest)

Browse entries by letter.

Browse entries by letter.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModGlossaryGetEntriesByLetterExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModGlossaryApi(config);
            var modGlossaryGetEntriesByLetterRequest = new ModGlossaryGetEntriesByLetterRequest(); // ModGlossaryGetEntriesByLetterRequest | 

            try
            {
                // Browse entries by letter.
                ModGlossaryGetEntriesByAuthorId200Response result = apiInstance.ModGlossaryGetEntriesByLetter(modGlossaryGetEntriesByLetterRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetEntriesByLetter: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModGlossaryGetEntriesByLetterWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Browse entries by letter.
    ApiResponse<ModGlossaryGetEntriesByAuthorId200Response> response = apiInstance.ModGlossaryGetEntriesByLetterWithHttpInfo(modGlossaryGetEntriesByLetterRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetEntriesByLetterWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modGlossaryGetEntriesByLetterRequest** | [**ModGlossaryGetEntriesByLetterRequest**](ModGlossaryGetEntriesByLetterRequest.md) |  |  |

### Return type

[**ModGlossaryGetEntriesByAuthorId200Response**](ModGlossaryGetEntriesByAuthorId200Response.md)

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

<a id="modglossarygetentriesbysearch"></a>
# **ModGlossaryGetEntriesBySearch**
> ModGlossaryGetEntriesByAuthorId200Response ModGlossaryGetEntriesBySearch (ModGlossaryGetEntriesBySearchRequest modGlossaryGetEntriesBySearchRequest)

Browse entries by search query.

Browse entries by search query.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModGlossaryGetEntriesBySearchExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModGlossaryApi(config);
            var modGlossaryGetEntriesBySearchRequest = new ModGlossaryGetEntriesBySearchRequest(); // ModGlossaryGetEntriesBySearchRequest | 

            try
            {
                // Browse entries by search query.
                ModGlossaryGetEntriesByAuthorId200Response result = apiInstance.ModGlossaryGetEntriesBySearch(modGlossaryGetEntriesBySearchRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetEntriesBySearch: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModGlossaryGetEntriesBySearchWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Browse entries by search query.
    ApiResponse<ModGlossaryGetEntriesByAuthorId200Response> response = apiInstance.ModGlossaryGetEntriesBySearchWithHttpInfo(modGlossaryGetEntriesBySearchRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetEntriesBySearchWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modGlossaryGetEntriesBySearchRequest** | [**ModGlossaryGetEntriesBySearchRequest**](ModGlossaryGetEntriesBySearchRequest.md) |  |  |

### Return type

[**ModGlossaryGetEntriesByAuthorId200Response**](ModGlossaryGetEntriesByAuthorId200Response.md)

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

<a id="modglossarygetentriesbyterm"></a>
# **ModGlossaryGetEntriesByTerm**
> ModGlossaryGetEntriesByAuthorId200Response ModGlossaryGetEntriesByTerm (ModGlossaryGetEntriesByTermRequest modGlossaryGetEntriesByTermRequest)

Browse entries by term (concept or alias).

Browse entries by term (concept or alias).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModGlossaryGetEntriesByTermExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModGlossaryApi(config);
            var modGlossaryGetEntriesByTermRequest = new ModGlossaryGetEntriesByTermRequest(); // ModGlossaryGetEntriesByTermRequest | 

            try
            {
                // Browse entries by term (concept or alias).
                ModGlossaryGetEntriesByAuthorId200Response result = apiInstance.ModGlossaryGetEntriesByTerm(modGlossaryGetEntriesByTermRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetEntriesByTerm: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModGlossaryGetEntriesByTermWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Browse entries by term (concept or alias).
    ApiResponse<ModGlossaryGetEntriesByAuthorId200Response> response = apiInstance.ModGlossaryGetEntriesByTermWithHttpInfo(modGlossaryGetEntriesByTermRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetEntriesByTermWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modGlossaryGetEntriesByTermRequest** | [**ModGlossaryGetEntriesByTermRequest**](ModGlossaryGetEntriesByTermRequest.md) |  |  |

### Return type

[**ModGlossaryGetEntriesByAuthorId200Response**](ModGlossaryGetEntriesByAuthorId200Response.md)

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

<a id="modglossarygetentriestoapprove"></a>
# **ModGlossaryGetEntriesToApprove**
> ModGlossaryGetEntriesByAuthorId200Response ModGlossaryGetEntriesToApprove (ModGlossaryGetEntriesToApproveRequest modGlossaryGetEntriesToApproveRequest)

Browse entries to be approved.

Browse entries to be approved.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModGlossaryGetEntriesToApproveExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModGlossaryApi(config);
            var modGlossaryGetEntriesToApproveRequest = new ModGlossaryGetEntriesToApproveRequest(); // ModGlossaryGetEntriesToApproveRequest | 

            try
            {
                // Browse entries to be approved.
                ModGlossaryGetEntriesByAuthorId200Response result = apiInstance.ModGlossaryGetEntriesToApprove(modGlossaryGetEntriesToApproveRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetEntriesToApprove: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModGlossaryGetEntriesToApproveWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Browse entries to be approved.
    ApiResponse<ModGlossaryGetEntriesByAuthorId200Response> response = apiInstance.ModGlossaryGetEntriesToApproveWithHttpInfo(modGlossaryGetEntriesToApproveRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetEntriesToApproveWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modGlossaryGetEntriesToApproveRequest** | [**ModGlossaryGetEntriesToApproveRequest**](ModGlossaryGetEntriesToApproveRequest.md) |  |  |

### Return type

[**ModGlossaryGetEntriesByAuthorId200Response**](ModGlossaryGetEntriesByAuthorId200Response.md)

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

<a id="modglossarygetentrybyid"></a>
# **ModGlossaryGetEntryById**
> ModGlossaryGetEntryById200Response ModGlossaryGetEntryById (ModGlossaryGetEntryByIdRequest modGlossaryGetEntryByIdRequest)

Get an entry by ID

Get an entry by ID

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModGlossaryGetEntryByIdExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModGlossaryApi(config);
            var modGlossaryGetEntryByIdRequest = new ModGlossaryGetEntryByIdRequest(); // ModGlossaryGetEntryByIdRequest | 

            try
            {
                // Get an entry by ID
                ModGlossaryGetEntryById200Response result = apiInstance.ModGlossaryGetEntryById(modGlossaryGetEntryByIdRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetEntryById: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModGlossaryGetEntryByIdWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get an entry by ID
    ApiResponse<ModGlossaryGetEntryById200Response> response = apiInstance.ModGlossaryGetEntryByIdWithHttpInfo(modGlossaryGetEntryByIdRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetEntryByIdWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modGlossaryGetEntryByIdRequest** | [**ModGlossaryGetEntryByIdRequest**](ModGlossaryGetEntryByIdRequest.md) |  |  |

### Return type

[**ModGlossaryGetEntryById200Response**](ModGlossaryGetEntryById200Response.md)

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

<a id="modglossarygetglossariesbycourses"></a>
# **ModGlossaryGetGlossariesByCourses**
> ModGlossaryGetGlossariesByCourses200Response ModGlossaryGetGlossariesByCourses (ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest)

Retrieve a list of glossaries from several courses.

Retrieve a list of glossaries from several courses.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModGlossaryGetGlossariesByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModGlossaryApi(config);
            var modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 

            try
            {
                // Retrieve a list of glossaries from several courses.
                ModGlossaryGetGlossariesByCourses200Response result = apiInstance.ModGlossaryGetGlossariesByCourses(modChatGetChatsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetGlossariesByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModGlossaryGetGlossariesByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieve a list of glossaries from several courses.
    ApiResponse<ModGlossaryGetGlossariesByCourses200Response> response = apiInstance.ModGlossaryGetGlossariesByCoursesWithHttpInfo(modChatGetChatsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryGetGlossariesByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  |  |

### Return type

[**ModGlossaryGetGlossariesByCourses200Response**](ModGlossaryGetGlossariesByCourses200Response.md)

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

<a id="modglossaryprepareentryforedition"></a>
# **ModGlossaryPrepareEntryForEdition**
> ModGlossaryPrepareEntryForEdition200Response ModGlossaryPrepareEntryForEdition (ModGlossaryPrepareEntryForEditionRequest modGlossaryPrepareEntryForEditionRequest)

Prepares the given entry for edition returning draft item areas and file areas information.

Prepares the given entry for edition returning draft item areas and file areas information.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModGlossaryPrepareEntryForEditionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModGlossaryApi(config);
            var modGlossaryPrepareEntryForEditionRequest = new ModGlossaryPrepareEntryForEditionRequest(); // ModGlossaryPrepareEntryForEditionRequest | 

            try
            {
                // Prepares the given entry for edition returning draft item areas and file areas information.
                ModGlossaryPrepareEntryForEdition200Response result = apiInstance.ModGlossaryPrepareEntryForEdition(modGlossaryPrepareEntryForEditionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryPrepareEntryForEdition: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModGlossaryPrepareEntryForEditionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Prepares the given entry for edition returning draft item areas and file areas information.
    ApiResponse<ModGlossaryPrepareEntryForEdition200Response> response = apiInstance.ModGlossaryPrepareEntryForEditionWithHttpInfo(modGlossaryPrepareEntryForEditionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryPrepareEntryForEditionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modGlossaryPrepareEntryForEditionRequest** | [**ModGlossaryPrepareEntryForEditionRequest**](ModGlossaryPrepareEntryForEditionRequest.md) |  |  |

### Return type

[**ModGlossaryPrepareEntryForEdition200Response**](ModGlossaryPrepareEntryForEdition200Response.md)

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

<a id="modglossaryupdateentry"></a>
# **ModGlossaryUpdateEntry**
> ModGlossaryUpdateEntry200Response ModGlossaryUpdateEntry (ModGlossaryUpdateEntryRequest modGlossaryUpdateEntryRequest)

Updates the given glossary entry.

Updates the given glossary entry.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModGlossaryUpdateEntryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModGlossaryApi(config);
            var modGlossaryUpdateEntryRequest = new ModGlossaryUpdateEntryRequest(); // ModGlossaryUpdateEntryRequest | 

            try
            {
                // Updates the given glossary entry.
                ModGlossaryUpdateEntry200Response result = apiInstance.ModGlossaryUpdateEntry(modGlossaryUpdateEntryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryUpdateEntry: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModGlossaryUpdateEntryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Updates the given glossary entry.
    ApiResponse<ModGlossaryUpdateEntry200Response> response = apiInstance.ModGlossaryUpdateEntryWithHttpInfo(modGlossaryUpdateEntryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryUpdateEntryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modGlossaryUpdateEntryRequest** | [**ModGlossaryUpdateEntryRequest**](ModGlossaryUpdateEntryRequest.md) |  |  |

### Return type

[**ModGlossaryUpdateEntry200Response**](ModGlossaryUpdateEntry200Response.md)

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

<a id="modglossaryviewentry"></a>
# **ModGlossaryViewEntry**
> ModGlossaryViewEntry200Response ModGlossaryViewEntry (ModGlossaryGetEntryByIdRequest modGlossaryGetEntryByIdRequest)

Notify a glossary entry as being viewed.

Notify a glossary entry as being viewed.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModGlossaryViewEntryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModGlossaryApi(config);
            var modGlossaryGetEntryByIdRequest = new ModGlossaryGetEntryByIdRequest(); // ModGlossaryGetEntryByIdRequest | 

            try
            {
                // Notify a glossary entry as being viewed.
                ModGlossaryViewEntry200Response result = apiInstance.ModGlossaryViewEntry(modGlossaryGetEntryByIdRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryViewEntry: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModGlossaryViewEntryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Notify a glossary entry as being viewed.
    ApiResponse<ModGlossaryViewEntry200Response> response = apiInstance.ModGlossaryViewEntryWithHttpInfo(modGlossaryGetEntryByIdRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryViewEntryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modGlossaryGetEntryByIdRequest** | [**ModGlossaryGetEntryByIdRequest**](ModGlossaryGetEntryByIdRequest.md) |  |  |

### Return type

[**ModGlossaryViewEntry200Response**](ModGlossaryViewEntry200Response.md)

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

<a id="modglossaryviewglossary"></a>
# **ModGlossaryViewGlossary**
> ModGlossaryViewGlossary200Response ModGlossaryViewGlossary (ModGlossaryViewGlossaryRequest modGlossaryViewGlossaryRequest)

Notify the glossary as being viewed.

Notify the glossary as being viewed.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModGlossaryViewGlossaryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModGlossaryApi(config);
            var modGlossaryViewGlossaryRequest = new ModGlossaryViewGlossaryRequest(); // ModGlossaryViewGlossaryRequest | 

            try
            {
                // Notify the glossary as being viewed.
                ModGlossaryViewGlossary200Response result = apiInstance.ModGlossaryViewGlossary(modGlossaryViewGlossaryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryViewGlossary: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModGlossaryViewGlossaryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Notify the glossary as being viewed.
    ApiResponse<ModGlossaryViewGlossary200Response> response = apiInstance.ModGlossaryViewGlossaryWithHttpInfo(modGlossaryViewGlossaryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModGlossaryApi.ModGlossaryViewGlossaryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modGlossaryViewGlossaryRequest** | [**ModGlossaryViewGlossaryRequest**](ModGlossaryViewGlossaryRequest.md) |  |  |

### Return type

[**ModGlossaryViewGlossary200Response**](ModGlossaryViewGlossary200Response.md)

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

