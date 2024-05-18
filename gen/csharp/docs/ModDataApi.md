# Org.OpenAPITools.Api.ModDataApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModDataAddEntry**](ModDataApi.md#moddataaddentry) | **POST** /mod_data_add_entry | Adds a new entry. |
| [**ModDataApproveEntry**](ModDataApi.md#moddataapproveentry) | **POST** /mod_data_approve_entry | Approves or unapproves an entry. |
| [**ModDataDeleteEntry**](ModDataApi.md#moddatadeleteentry) | **POST** /mod_data_delete_entry | Deletes an entry. |
| [**ModDataDeleteSavedPreset**](ModDataApi.md#moddatadeletesavedpreset) | **POST** /mod_data_delete_saved_preset | Delete site user preset. |
| [**ModDataGetDataAccessInformation**](ModDataApi.md#moddatagetdataaccessinformation) | **POST** /mod_data_get_data_access_information | Return access information for a given database. |
| [**ModDataGetDatabasesByCourses**](ModDataApi.md#moddatagetdatabasesbycourses) | **POST** /mod_data_get_databases_by_courses | Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned. |
| [**ModDataGetEntries**](ModDataApi.md#moddatagetentries) | **POST** /mod_data_get_entries | Return the complete list of entries of the given database. |
| [**ModDataGetEntry**](ModDataApi.md#moddatagetentry) | **POST** /mod_data_get_entry | Return one entry record from the database, including contents optionally. |
| [**ModDataGetFields**](ModDataApi.md#moddatagetfields) | **POST** /mod_data_get_fields | Return the list of configured fields for the given database. |
| [**ModDataGetMappingInformation**](ModDataApi.md#moddatagetmappinginformation) | **POST** /mod_data_get_mapping_information | Get importing information |
| [**ModDataSearchEntries**](ModDataApi.md#moddatasearchentries) | **POST** /mod_data_search_entries | Search for entries in the given database. |
| [**ModDataUpdateEntry**](ModDataApi.md#moddataupdateentry) | **POST** /mod_data_update_entry | Updates an existing entry. |
| [**ModDataViewDatabase**](ModDataApi.md#moddataviewdatabase) | **POST** /mod_data_view_database | Simulate the view.php web interface data: trigger events, completion, etc... |

<a id="moddataaddentry"></a>
# **ModDataAddEntry**
> ModDataAddEntry200Response ModDataAddEntry (ModDataAddEntryRequest modDataAddEntryRequest)

Adds a new entry.

Adds a new entry.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModDataAddEntryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModDataApi(config);
            var modDataAddEntryRequest = new ModDataAddEntryRequest(); // ModDataAddEntryRequest | 

            try
            {
                // Adds a new entry.
                ModDataAddEntry200Response result = apiInstance.ModDataAddEntry(modDataAddEntryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModDataApi.ModDataAddEntry: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModDataAddEntryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Adds a new entry.
    ApiResponse<ModDataAddEntry200Response> response = apiInstance.ModDataAddEntryWithHttpInfo(modDataAddEntryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModDataApi.ModDataAddEntryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modDataAddEntryRequest** | [**ModDataAddEntryRequest**](ModDataAddEntryRequest.md) |  |  |

### Return type

[**ModDataAddEntry200Response**](ModDataAddEntry200Response.md)

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

<a id="moddataapproveentry"></a>
# **ModDataApproveEntry**
> CoreCalendarDeleteSubscription200Response ModDataApproveEntry (ModDataApproveEntryRequest modDataApproveEntryRequest)

Approves or unapproves an entry.

Approves or unapproves an entry.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModDataApproveEntryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModDataApi(config);
            var modDataApproveEntryRequest = new ModDataApproveEntryRequest(); // ModDataApproveEntryRequest | 

            try
            {
                // Approves or unapproves an entry.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModDataApproveEntry(modDataApproveEntryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModDataApi.ModDataApproveEntry: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModDataApproveEntryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Approves or unapproves an entry.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModDataApproveEntryWithHttpInfo(modDataApproveEntryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModDataApi.ModDataApproveEntryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modDataApproveEntryRequest** | [**ModDataApproveEntryRequest**](ModDataApproveEntryRequest.md) |  |  |

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

<a id="moddatadeleteentry"></a>
# **ModDataDeleteEntry**
> ModDataDeleteEntry200Response ModDataDeleteEntry (ModDataDeleteEntryRequest modDataDeleteEntryRequest)

Deletes an entry.

Deletes an entry.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModDataDeleteEntryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModDataApi(config);
            var modDataDeleteEntryRequest = new ModDataDeleteEntryRequest(); // ModDataDeleteEntryRequest | 

            try
            {
                // Deletes an entry.
                ModDataDeleteEntry200Response result = apiInstance.ModDataDeleteEntry(modDataDeleteEntryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModDataApi.ModDataDeleteEntry: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModDataDeleteEntryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Deletes an entry.
    ApiResponse<ModDataDeleteEntry200Response> response = apiInstance.ModDataDeleteEntryWithHttpInfo(modDataDeleteEntryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModDataApi.ModDataDeleteEntryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modDataDeleteEntryRequest** | [**ModDataDeleteEntryRequest**](ModDataDeleteEntryRequest.md) |  |  |

### Return type

[**ModDataDeleteEntry200Response**](ModDataDeleteEntry200Response.md)

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

<a id="moddatadeletesavedpreset"></a>
# **ModDataDeleteSavedPreset**
> CoreContentbankRenameContent200Response ModDataDeleteSavedPreset (ModDataDeleteSavedPresetRequest modDataDeleteSavedPresetRequest)

Delete site user preset.

Delete site user preset.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModDataDeleteSavedPresetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModDataApi(config);
            var modDataDeleteSavedPresetRequest = new ModDataDeleteSavedPresetRequest(); // ModDataDeleteSavedPresetRequest | 

            try
            {
                // Delete site user preset.
                CoreContentbankRenameContent200Response result = apiInstance.ModDataDeleteSavedPreset(modDataDeleteSavedPresetRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModDataApi.ModDataDeleteSavedPreset: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModDataDeleteSavedPresetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete site user preset.
    ApiResponse<CoreContentbankRenameContent200Response> response = apiInstance.ModDataDeleteSavedPresetWithHttpInfo(modDataDeleteSavedPresetRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModDataApi.ModDataDeleteSavedPresetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modDataDeleteSavedPresetRequest** | [**ModDataDeleteSavedPresetRequest**](ModDataDeleteSavedPresetRequest.md) |  |  |

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

<a id="moddatagetdataaccessinformation"></a>
# **ModDataGetDataAccessInformation**
> ModDataGetDataAccessInformation200Response ModDataGetDataAccessInformation (ModDataGetDataAccessInformationRequest modDataGetDataAccessInformationRequest)

Return access information for a given database.

Return access information for a given database.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModDataGetDataAccessInformationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModDataApi(config);
            var modDataGetDataAccessInformationRequest = new ModDataGetDataAccessInformationRequest(); // ModDataGetDataAccessInformationRequest | 

            try
            {
                // Return access information for a given database.
                ModDataGetDataAccessInformation200Response result = apiInstance.ModDataGetDataAccessInformation(modDataGetDataAccessInformationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModDataApi.ModDataGetDataAccessInformation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModDataGetDataAccessInformationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return access information for a given database.
    ApiResponse<ModDataGetDataAccessInformation200Response> response = apiInstance.ModDataGetDataAccessInformationWithHttpInfo(modDataGetDataAccessInformationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModDataApi.ModDataGetDataAccessInformationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modDataGetDataAccessInformationRequest** | [**ModDataGetDataAccessInformationRequest**](ModDataGetDataAccessInformationRequest.md) |  |  |

### Return type

[**ModDataGetDataAccessInformation200Response**](ModDataGetDataAccessInformation200Response.md)

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

<a id="moddatagetdatabasesbycourses"></a>
# **ModDataGetDatabasesByCourses**
> ModDataGetDatabasesByCourses200Response ModDataGetDatabasesByCourses (ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest)

Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.

Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModDataGetDatabasesByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModDataApi(config);
            var modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 

            try
            {
                // Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.
                ModDataGetDatabasesByCourses200Response result = apiInstance.ModDataGetDatabasesByCourses(modChatGetChatsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModDataApi.ModDataGetDatabasesByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModDataGetDatabasesByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.
    ApiResponse<ModDataGetDatabasesByCourses200Response> response = apiInstance.ModDataGetDatabasesByCoursesWithHttpInfo(modChatGetChatsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModDataApi.ModDataGetDatabasesByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  |  |

### Return type

[**ModDataGetDatabasesByCourses200Response**](ModDataGetDatabasesByCourses200Response.md)

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

<a id="moddatagetentries"></a>
# **ModDataGetEntries**
> ModDataGetEntries200Response ModDataGetEntries (ModDataGetEntriesRequest modDataGetEntriesRequest)

Return the complete list of entries of the given database.

Return the complete list of entries of the given database.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModDataGetEntriesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModDataApi(config);
            var modDataGetEntriesRequest = new ModDataGetEntriesRequest(); // ModDataGetEntriesRequest | 

            try
            {
                // Return the complete list of entries of the given database.
                ModDataGetEntries200Response result = apiInstance.ModDataGetEntries(modDataGetEntriesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModDataApi.ModDataGetEntries: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModDataGetEntriesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return the complete list of entries of the given database.
    ApiResponse<ModDataGetEntries200Response> response = apiInstance.ModDataGetEntriesWithHttpInfo(modDataGetEntriesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModDataApi.ModDataGetEntriesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modDataGetEntriesRequest** | [**ModDataGetEntriesRequest**](ModDataGetEntriesRequest.md) |  |  |

### Return type

[**ModDataGetEntries200Response**](ModDataGetEntries200Response.md)

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

<a id="moddatagetentry"></a>
# **ModDataGetEntry**
> ModDataGetEntry200Response ModDataGetEntry (ModDataGetEntryRequest modDataGetEntryRequest)

Return one entry record from the database, including contents optionally.

Return one entry record from the database, including contents optionally.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModDataGetEntryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModDataApi(config);
            var modDataGetEntryRequest = new ModDataGetEntryRequest(); // ModDataGetEntryRequest | 

            try
            {
                // Return one entry record from the database, including contents optionally.
                ModDataGetEntry200Response result = apiInstance.ModDataGetEntry(modDataGetEntryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModDataApi.ModDataGetEntry: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModDataGetEntryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return one entry record from the database, including contents optionally.
    ApiResponse<ModDataGetEntry200Response> response = apiInstance.ModDataGetEntryWithHttpInfo(modDataGetEntryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModDataApi.ModDataGetEntryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modDataGetEntryRequest** | [**ModDataGetEntryRequest**](ModDataGetEntryRequest.md) |  |  |

### Return type

[**ModDataGetEntry200Response**](ModDataGetEntry200Response.md)

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

<a id="moddatagetfields"></a>
# **ModDataGetFields**
> ModDataGetFields200Response ModDataGetFields (ModDataGetFieldsRequest modDataGetFieldsRequest)

Return the list of configured fields for the given database.

Return the list of configured fields for the given database.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModDataGetFieldsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModDataApi(config);
            var modDataGetFieldsRequest = new ModDataGetFieldsRequest(); // ModDataGetFieldsRequest | 

            try
            {
                // Return the list of configured fields for the given database.
                ModDataGetFields200Response result = apiInstance.ModDataGetFields(modDataGetFieldsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModDataApi.ModDataGetFields: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModDataGetFieldsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return the list of configured fields for the given database.
    ApiResponse<ModDataGetFields200Response> response = apiInstance.ModDataGetFieldsWithHttpInfo(modDataGetFieldsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModDataApi.ModDataGetFieldsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modDataGetFieldsRequest** | [**ModDataGetFieldsRequest**](ModDataGetFieldsRequest.md) |  |  |

### Return type

[**ModDataGetFields200Response**](ModDataGetFields200Response.md)

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

<a id="moddatagetmappinginformation"></a>
# **ModDataGetMappingInformation**
> ModDataGetMappingInformation200Response ModDataGetMappingInformation (ModDataGetMappingInformationRequest modDataGetMappingInformationRequest)

Get importing information

Get importing information

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModDataGetMappingInformationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModDataApi(config);
            var modDataGetMappingInformationRequest = new ModDataGetMappingInformationRequest(); // ModDataGetMappingInformationRequest | 

            try
            {
                // Get importing information
                ModDataGetMappingInformation200Response result = apiInstance.ModDataGetMappingInformation(modDataGetMappingInformationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModDataApi.ModDataGetMappingInformation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModDataGetMappingInformationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get importing information
    ApiResponse<ModDataGetMappingInformation200Response> response = apiInstance.ModDataGetMappingInformationWithHttpInfo(modDataGetMappingInformationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModDataApi.ModDataGetMappingInformationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modDataGetMappingInformationRequest** | [**ModDataGetMappingInformationRequest**](ModDataGetMappingInformationRequest.md) |  |  |

### Return type

[**ModDataGetMappingInformation200Response**](ModDataGetMappingInformation200Response.md)

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

<a id="moddatasearchentries"></a>
# **ModDataSearchEntries**
> ModDataSearchEntries200Response ModDataSearchEntries (ModDataSearchEntriesRequest modDataSearchEntriesRequest)

Search for entries in the given database.

Search for entries in the given database.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModDataSearchEntriesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModDataApi(config);
            var modDataSearchEntriesRequest = new ModDataSearchEntriesRequest(); // ModDataSearchEntriesRequest | 

            try
            {
                // Search for entries in the given database.
                ModDataSearchEntries200Response result = apiInstance.ModDataSearchEntries(modDataSearchEntriesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModDataApi.ModDataSearchEntries: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModDataSearchEntriesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Search for entries in the given database.
    ApiResponse<ModDataSearchEntries200Response> response = apiInstance.ModDataSearchEntriesWithHttpInfo(modDataSearchEntriesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModDataApi.ModDataSearchEntriesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modDataSearchEntriesRequest** | [**ModDataSearchEntriesRequest**](ModDataSearchEntriesRequest.md) |  |  |

### Return type

[**ModDataSearchEntries200Response**](ModDataSearchEntries200Response.md)

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

<a id="moddataupdateentry"></a>
# **ModDataUpdateEntry**
> ModDataUpdateEntry200Response ModDataUpdateEntry (ModDataUpdateEntryRequest modDataUpdateEntryRequest)

Updates an existing entry.

Updates an existing entry.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModDataUpdateEntryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModDataApi(config);
            var modDataUpdateEntryRequest = new ModDataUpdateEntryRequest(); // ModDataUpdateEntryRequest | 

            try
            {
                // Updates an existing entry.
                ModDataUpdateEntry200Response result = apiInstance.ModDataUpdateEntry(modDataUpdateEntryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModDataApi.ModDataUpdateEntry: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModDataUpdateEntryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Updates an existing entry.
    ApiResponse<ModDataUpdateEntry200Response> response = apiInstance.ModDataUpdateEntryWithHttpInfo(modDataUpdateEntryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModDataApi.ModDataUpdateEntryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modDataUpdateEntryRequest** | [**ModDataUpdateEntryRequest**](ModDataUpdateEntryRequest.md) |  |  |

### Return type

[**ModDataUpdateEntry200Response**](ModDataUpdateEntry200Response.md)

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

<a id="moddataviewdatabase"></a>
# **ModDataViewDatabase**
> CoreCalendarDeleteSubscription200Response ModDataViewDatabase (ModDataViewDatabaseRequest modDataViewDatabaseRequest)

Simulate the view.php web interface data: trigger events, completion, etc...

Simulate the view.php web interface data: trigger events, completion, etc...

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModDataViewDatabaseExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModDataApi(config);
            var modDataViewDatabaseRequest = new ModDataViewDatabaseRequest(); // ModDataViewDatabaseRequest | 

            try
            {
                // Simulate the view.php web interface data: trigger events, completion, etc...
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModDataViewDatabase(modDataViewDatabaseRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModDataApi.ModDataViewDatabase: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModDataViewDatabaseWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Simulate the view.php web interface data: trigger events, completion, etc...
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModDataViewDatabaseWithHttpInfo(modDataViewDatabaseRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModDataApi.ModDataViewDatabaseWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modDataViewDatabaseRequest** | [**ModDataViewDatabaseRequest**](ModDataViewDatabaseRequest.md) |  |  |

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

