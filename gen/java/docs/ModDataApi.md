# ModDataApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modDataAddEntry**](ModDataApi.md#modDataAddEntry) | **POST** /mod_data_add_entry | Adds a new entry. |
| [**modDataApproveEntry**](ModDataApi.md#modDataApproveEntry) | **POST** /mod_data_approve_entry | Approves or unapproves an entry. |
| [**modDataDeleteEntry**](ModDataApi.md#modDataDeleteEntry) | **POST** /mod_data_delete_entry | Deletes an entry. |
| [**modDataDeleteSavedPreset**](ModDataApi.md#modDataDeleteSavedPreset) | **POST** /mod_data_delete_saved_preset | Delete site user preset. |
| [**modDataGetDataAccessInformation**](ModDataApi.md#modDataGetDataAccessInformation) | **POST** /mod_data_get_data_access_information | Return access information for a given database. |
| [**modDataGetDatabasesByCourses**](ModDataApi.md#modDataGetDatabasesByCourses) | **POST** /mod_data_get_databases_by_courses | Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned. |
| [**modDataGetEntries**](ModDataApi.md#modDataGetEntries) | **POST** /mod_data_get_entries | Return the complete list of entries of the given database. |
| [**modDataGetEntry**](ModDataApi.md#modDataGetEntry) | **POST** /mod_data_get_entry | Return one entry record from the database, including contents optionally. |
| [**modDataGetFields**](ModDataApi.md#modDataGetFields) | **POST** /mod_data_get_fields | Return the list of configured fields for the given database. |
| [**modDataGetMappingInformation**](ModDataApi.md#modDataGetMappingInformation) | **POST** /mod_data_get_mapping_information | Get importing information |
| [**modDataSearchEntries**](ModDataApi.md#modDataSearchEntries) | **POST** /mod_data_search_entries | Search for entries in the given database. |
| [**modDataUpdateEntry**](ModDataApi.md#modDataUpdateEntry) | **POST** /mod_data_update_entry | Updates an existing entry. |
| [**modDataViewDatabase**](ModDataApi.md#modDataViewDatabase) | **POST** /mod_data_view_database | Simulate the view.php web interface data: trigger events, completion, etc... |


<a id="modDataAddEntry"></a>
# **modDataAddEntry**
> ModDataAddEntry200Response modDataAddEntry(modDataAddEntryRequest)

Adds a new entry.

Adds a new entry.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModDataApi apiInstance = new ModDataApi(defaultClient);
    ModDataAddEntryRequest modDataAddEntryRequest = new ModDataAddEntryRequest(); // ModDataAddEntryRequest | 
    try {
      ModDataAddEntry200Response result = apiInstance.modDataAddEntry(modDataAddEntryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModDataApi#modDataAddEntry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modDataAddEntryRequest** | [**ModDataAddEntryRequest**](ModDataAddEntryRequest.md)|  | |

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

<a id="modDataApproveEntry"></a>
# **modDataApproveEntry**
> CoreCalendarDeleteSubscription200Response modDataApproveEntry(modDataApproveEntryRequest)

Approves or unapproves an entry.

Approves or unapproves an entry.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModDataApi apiInstance = new ModDataApi(defaultClient);
    ModDataApproveEntryRequest modDataApproveEntryRequest = new ModDataApproveEntryRequest(); // ModDataApproveEntryRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modDataApproveEntry(modDataApproveEntryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModDataApi#modDataApproveEntry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modDataApproveEntryRequest** | [**ModDataApproveEntryRequest**](ModDataApproveEntryRequest.md)|  | |

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

<a id="modDataDeleteEntry"></a>
# **modDataDeleteEntry**
> ModDataDeleteEntry200Response modDataDeleteEntry(modDataDeleteEntryRequest)

Deletes an entry.

Deletes an entry.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModDataApi apiInstance = new ModDataApi(defaultClient);
    ModDataDeleteEntryRequest modDataDeleteEntryRequest = new ModDataDeleteEntryRequest(); // ModDataDeleteEntryRequest | 
    try {
      ModDataDeleteEntry200Response result = apiInstance.modDataDeleteEntry(modDataDeleteEntryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModDataApi#modDataDeleteEntry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modDataDeleteEntryRequest** | [**ModDataDeleteEntryRequest**](ModDataDeleteEntryRequest.md)|  | |

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

<a id="modDataDeleteSavedPreset"></a>
# **modDataDeleteSavedPreset**
> CoreContentbankRenameContent200Response modDataDeleteSavedPreset(modDataDeleteSavedPresetRequest)

Delete site user preset.

Delete site user preset.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModDataApi apiInstance = new ModDataApi(defaultClient);
    ModDataDeleteSavedPresetRequest modDataDeleteSavedPresetRequest = new ModDataDeleteSavedPresetRequest(); // ModDataDeleteSavedPresetRequest | 
    try {
      CoreContentbankRenameContent200Response result = apiInstance.modDataDeleteSavedPreset(modDataDeleteSavedPresetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModDataApi#modDataDeleteSavedPreset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modDataDeleteSavedPresetRequest** | [**ModDataDeleteSavedPresetRequest**](ModDataDeleteSavedPresetRequest.md)|  | |

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

<a id="modDataGetDataAccessInformation"></a>
# **modDataGetDataAccessInformation**
> ModDataGetDataAccessInformation200Response modDataGetDataAccessInformation(modDataGetDataAccessInformationRequest)

Return access information for a given database.

Return access information for a given database.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModDataApi apiInstance = new ModDataApi(defaultClient);
    ModDataGetDataAccessInformationRequest modDataGetDataAccessInformationRequest = new ModDataGetDataAccessInformationRequest(); // ModDataGetDataAccessInformationRequest | 
    try {
      ModDataGetDataAccessInformation200Response result = apiInstance.modDataGetDataAccessInformation(modDataGetDataAccessInformationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModDataApi#modDataGetDataAccessInformation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modDataGetDataAccessInformationRequest** | [**ModDataGetDataAccessInformationRequest**](ModDataGetDataAccessInformationRequest.md)|  | |

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

<a id="modDataGetDatabasesByCourses"></a>
# **modDataGetDatabasesByCourses**
> ModDataGetDatabasesByCourses200Response modDataGetDatabasesByCourses(modChatGetChatsByCoursesRequest)

Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.

Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModDataApi apiInstance = new ModDataApi(defaultClient);
    ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 
    try {
      ModDataGetDatabasesByCourses200Response result = apiInstance.modDataGetDatabasesByCourses(modChatGetChatsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModDataApi#modDataGetDatabasesByCourses");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md)|  | |

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

<a id="modDataGetEntries"></a>
# **modDataGetEntries**
> ModDataGetEntries200Response modDataGetEntries(modDataGetEntriesRequest)

Return the complete list of entries of the given database.

Return the complete list of entries of the given database.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModDataApi apiInstance = new ModDataApi(defaultClient);
    ModDataGetEntriesRequest modDataGetEntriesRequest = new ModDataGetEntriesRequest(); // ModDataGetEntriesRequest | 
    try {
      ModDataGetEntries200Response result = apiInstance.modDataGetEntries(modDataGetEntriesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModDataApi#modDataGetEntries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modDataGetEntriesRequest** | [**ModDataGetEntriesRequest**](ModDataGetEntriesRequest.md)|  | |

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

<a id="modDataGetEntry"></a>
# **modDataGetEntry**
> ModDataGetEntry200Response modDataGetEntry(modDataGetEntryRequest)

Return one entry record from the database, including contents optionally.

Return one entry record from the database, including contents optionally.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModDataApi apiInstance = new ModDataApi(defaultClient);
    ModDataGetEntryRequest modDataGetEntryRequest = new ModDataGetEntryRequest(); // ModDataGetEntryRequest | 
    try {
      ModDataGetEntry200Response result = apiInstance.modDataGetEntry(modDataGetEntryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModDataApi#modDataGetEntry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modDataGetEntryRequest** | [**ModDataGetEntryRequest**](ModDataGetEntryRequest.md)|  | |

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

<a id="modDataGetFields"></a>
# **modDataGetFields**
> ModDataGetFields200Response modDataGetFields(modDataGetFieldsRequest)

Return the list of configured fields for the given database.

Return the list of configured fields for the given database.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModDataApi apiInstance = new ModDataApi(defaultClient);
    ModDataGetFieldsRequest modDataGetFieldsRequest = new ModDataGetFieldsRequest(); // ModDataGetFieldsRequest | 
    try {
      ModDataGetFields200Response result = apiInstance.modDataGetFields(modDataGetFieldsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModDataApi#modDataGetFields");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modDataGetFieldsRequest** | [**ModDataGetFieldsRequest**](ModDataGetFieldsRequest.md)|  | |

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

<a id="modDataGetMappingInformation"></a>
# **modDataGetMappingInformation**
> ModDataGetMappingInformation200Response modDataGetMappingInformation(modDataGetMappingInformationRequest)

Get importing information

Get importing information

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModDataApi apiInstance = new ModDataApi(defaultClient);
    ModDataGetMappingInformationRequest modDataGetMappingInformationRequest = new ModDataGetMappingInformationRequest(); // ModDataGetMappingInformationRequest | 
    try {
      ModDataGetMappingInformation200Response result = apiInstance.modDataGetMappingInformation(modDataGetMappingInformationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModDataApi#modDataGetMappingInformation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modDataGetMappingInformationRequest** | [**ModDataGetMappingInformationRequest**](ModDataGetMappingInformationRequest.md)|  | |

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

<a id="modDataSearchEntries"></a>
# **modDataSearchEntries**
> ModDataSearchEntries200Response modDataSearchEntries(modDataSearchEntriesRequest)

Search for entries in the given database.

Search for entries in the given database.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModDataApi apiInstance = new ModDataApi(defaultClient);
    ModDataSearchEntriesRequest modDataSearchEntriesRequest = new ModDataSearchEntriesRequest(); // ModDataSearchEntriesRequest | 
    try {
      ModDataSearchEntries200Response result = apiInstance.modDataSearchEntries(modDataSearchEntriesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModDataApi#modDataSearchEntries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modDataSearchEntriesRequest** | [**ModDataSearchEntriesRequest**](ModDataSearchEntriesRequest.md)|  | |

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

<a id="modDataUpdateEntry"></a>
# **modDataUpdateEntry**
> ModDataUpdateEntry200Response modDataUpdateEntry(modDataUpdateEntryRequest)

Updates an existing entry.

Updates an existing entry.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModDataApi apiInstance = new ModDataApi(defaultClient);
    ModDataUpdateEntryRequest modDataUpdateEntryRequest = new ModDataUpdateEntryRequest(); // ModDataUpdateEntryRequest | 
    try {
      ModDataUpdateEntry200Response result = apiInstance.modDataUpdateEntry(modDataUpdateEntryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModDataApi#modDataUpdateEntry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modDataUpdateEntryRequest** | [**ModDataUpdateEntryRequest**](ModDataUpdateEntryRequest.md)|  | |

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

<a id="modDataViewDatabase"></a>
# **modDataViewDatabase**
> CoreCalendarDeleteSubscription200Response modDataViewDatabase(modDataViewDatabaseRequest)

Simulate the view.php web interface data: trigger events, completion, etc...

Simulate the view.php web interface data: trigger events, completion, etc...

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModDataApi apiInstance = new ModDataApi(defaultClient);
    ModDataViewDatabaseRequest modDataViewDatabaseRequest = new ModDataViewDatabaseRequest(); // ModDataViewDatabaseRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modDataViewDatabase(modDataViewDatabaseRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModDataApi#modDataViewDatabase");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modDataViewDatabaseRequest** | [**ModDataViewDatabaseRequest**](ModDataViewDatabaseRequest.md)|  | |

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

