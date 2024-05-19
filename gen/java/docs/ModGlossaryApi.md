# ModGlossaryApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modGlossaryAddEntry**](ModGlossaryApi.md#modGlossaryAddEntry) | **POST** /mod_glossary_add_entry | Add a new entry to a given glossary |
| [**modGlossaryDeleteEntry**](ModGlossaryApi.md#modGlossaryDeleteEntry) | **POST** /mod_glossary_delete_entry | Delete the given entry from the glossary. |
| [**modGlossaryGetAuthors**](ModGlossaryApi.md#modGlossaryGetAuthors) | **POST** /mod_glossary_get_authors | Get the authors. |
| [**modGlossaryGetCategories**](ModGlossaryApi.md#modGlossaryGetCategories) | **POST** /mod_glossary_get_categories | Get the categories. |
| [**modGlossaryGetEntriesByAuthor**](ModGlossaryApi.md#modGlossaryGetEntriesByAuthor) | **POST** /mod_glossary_get_entries_by_author | Browse entries by author. |
| [**modGlossaryGetEntriesByAuthorId**](ModGlossaryApi.md#modGlossaryGetEntriesByAuthorId) | **POST** /mod_glossary_get_entries_by_author_id | Browse entries by author ID. |
| [**modGlossaryGetEntriesByCategory**](ModGlossaryApi.md#modGlossaryGetEntriesByCategory) | **POST** /mod_glossary_get_entries_by_category | Browse entries by category. |
| [**modGlossaryGetEntriesByDate**](ModGlossaryApi.md#modGlossaryGetEntriesByDate) | **POST** /mod_glossary_get_entries_by_date | Browse entries by date. |
| [**modGlossaryGetEntriesByLetter**](ModGlossaryApi.md#modGlossaryGetEntriesByLetter) | **POST** /mod_glossary_get_entries_by_letter | Browse entries by letter. |
| [**modGlossaryGetEntriesBySearch**](ModGlossaryApi.md#modGlossaryGetEntriesBySearch) | **POST** /mod_glossary_get_entries_by_search | Browse entries by search query. |
| [**modGlossaryGetEntriesByTerm**](ModGlossaryApi.md#modGlossaryGetEntriesByTerm) | **POST** /mod_glossary_get_entries_by_term | Browse entries by term (concept or alias). |
| [**modGlossaryGetEntriesToApprove**](ModGlossaryApi.md#modGlossaryGetEntriesToApprove) | **POST** /mod_glossary_get_entries_to_approve | Browse entries to be approved. |
| [**modGlossaryGetEntryById**](ModGlossaryApi.md#modGlossaryGetEntryById) | **POST** /mod_glossary_get_entry_by_id | Get an entry by ID |
| [**modGlossaryGetGlossariesByCourses**](ModGlossaryApi.md#modGlossaryGetGlossariesByCourses) | **POST** /mod_glossary_get_glossaries_by_courses | Retrieve a list of glossaries from several courses. |
| [**modGlossaryPrepareEntryForEdition**](ModGlossaryApi.md#modGlossaryPrepareEntryForEdition) | **POST** /mod_glossary_prepare_entry_for_edition | Prepares the given entry for edition returning draft item areas and file areas information. |
| [**modGlossaryUpdateEntry**](ModGlossaryApi.md#modGlossaryUpdateEntry) | **POST** /mod_glossary_update_entry | Updates the given glossary entry. |
| [**modGlossaryViewEntry**](ModGlossaryApi.md#modGlossaryViewEntry) | **POST** /mod_glossary_view_entry | Notify a glossary entry as being viewed. |
| [**modGlossaryViewGlossary**](ModGlossaryApi.md#modGlossaryViewGlossary) | **POST** /mod_glossary_view_glossary | Notify the glossary as being viewed. |


<a id="modGlossaryAddEntry"></a>
# **modGlossaryAddEntry**
> ModGlossaryAddEntry200Response modGlossaryAddEntry(modGlossaryAddEntryRequest)

Add a new entry to a given glossary

Add a new entry to a given glossary

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModGlossaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModGlossaryApi apiInstance = new ModGlossaryApi(defaultClient);
    ModGlossaryAddEntryRequest modGlossaryAddEntryRequest = new ModGlossaryAddEntryRequest(); // ModGlossaryAddEntryRequest | 
    try {
      ModGlossaryAddEntry200Response result = apiInstance.modGlossaryAddEntry(modGlossaryAddEntryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModGlossaryApi#modGlossaryAddEntry");
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
| **modGlossaryAddEntryRequest** | [**ModGlossaryAddEntryRequest**](ModGlossaryAddEntryRequest.md)|  | |

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

<a id="modGlossaryDeleteEntry"></a>
# **modGlossaryDeleteEntry**
> CoreContentbankRenameContent200Response modGlossaryDeleteEntry(modGlossaryDeleteEntryRequest)

Delete the given entry from the glossary.

Delete the given entry from the glossary.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModGlossaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModGlossaryApi apiInstance = new ModGlossaryApi(defaultClient);
    ModGlossaryDeleteEntryRequest modGlossaryDeleteEntryRequest = new ModGlossaryDeleteEntryRequest(); // ModGlossaryDeleteEntryRequest | 
    try {
      CoreContentbankRenameContent200Response result = apiInstance.modGlossaryDeleteEntry(modGlossaryDeleteEntryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModGlossaryApi#modGlossaryDeleteEntry");
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
| **modGlossaryDeleteEntryRequest** | [**ModGlossaryDeleteEntryRequest**](ModGlossaryDeleteEntryRequest.md)|  | |

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

<a id="modGlossaryGetAuthors"></a>
# **modGlossaryGetAuthors**
> ModGlossaryGetAuthors200Response modGlossaryGetAuthors(modGlossaryGetAuthorsRequest)

Get the authors.

Get the authors.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModGlossaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModGlossaryApi apiInstance = new ModGlossaryApi(defaultClient);
    ModGlossaryGetAuthorsRequest modGlossaryGetAuthorsRequest = new ModGlossaryGetAuthorsRequest(); // ModGlossaryGetAuthorsRequest | 
    try {
      ModGlossaryGetAuthors200Response result = apiInstance.modGlossaryGetAuthors(modGlossaryGetAuthorsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModGlossaryApi#modGlossaryGetAuthors");
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
| **modGlossaryGetAuthorsRequest** | [**ModGlossaryGetAuthorsRequest**](ModGlossaryGetAuthorsRequest.md)|  | |

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

<a id="modGlossaryGetCategories"></a>
# **modGlossaryGetCategories**
> ModGlossaryGetCategories200Response modGlossaryGetCategories(modGlossaryGetCategoriesRequest)

Get the categories.

Get the categories.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModGlossaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModGlossaryApi apiInstance = new ModGlossaryApi(defaultClient);
    ModGlossaryGetCategoriesRequest modGlossaryGetCategoriesRequest = new ModGlossaryGetCategoriesRequest(); // ModGlossaryGetCategoriesRequest | 
    try {
      ModGlossaryGetCategories200Response result = apiInstance.modGlossaryGetCategories(modGlossaryGetCategoriesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModGlossaryApi#modGlossaryGetCategories");
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
| **modGlossaryGetCategoriesRequest** | [**ModGlossaryGetCategoriesRequest**](ModGlossaryGetCategoriesRequest.md)|  | |

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

<a id="modGlossaryGetEntriesByAuthor"></a>
# **modGlossaryGetEntriesByAuthor**
> ModGlossaryGetEntriesByAuthor200Response modGlossaryGetEntriesByAuthor(modGlossaryGetEntriesByAuthorRequest)

Browse entries by author.

Browse entries by author.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModGlossaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModGlossaryApi apiInstance = new ModGlossaryApi(defaultClient);
    ModGlossaryGetEntriesByAuthorRequest modGlossaryGetEntriesByAuthorRequest = new ModGlossaryGetEntriesByAuthorRequest(); // ModGlossaryGetEntriesByAuthorRequest | 
    try {
      ModGlossaryGetEntriesByAuthor200Response result = apiInstance.modGlossaryGetEntriesByAuthor(modGlossaryGetEntriesByAuthorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModGlossaryApi#modGlossaryGetEntriesByAuthor");
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
| **modGlossaryGetEntriesByAuthorRequest** | [**ModGlossaryGetEntriesByAuthorRequest**](ModGlossaryGetEntriesByAuthorRequest.md)|  | |

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

<a id="modGlossaryGetEntriesByAuthorId"></a>
# **modGlossaryGetEntriesByAuthorId**
> ModGlossaryGetEntriesByAuthorId200Response modGlossaryGetEntriesByAuthorId(modGlossaryGetEntriesByAuthorIdRequest)

Browse entries by author ID.

Browse entries by author ID.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModGlossaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModGlossaryApi apiInstance = new ModGlossaryApi(defaultClient);
    ModGlossaryGetEntriesByAuthorIdRequest modGlossaryGetEntriesByAuthorIdRequest = new ModGlossaryGetEntriesByAuthorIdRequest(); // ModGlossaryGetEntriesByAuthorIdRequest | 
    try {
      ModGlossaryGetEntriesByAuthorId200Response result = apiInstance.modGlossaryGetEntriesByAuthorId(modGlossaryGetEntriesByAuthorIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModGlossaryApi#modGlossaryGetEntriesByAuthorId");
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
| **modGlossaryGetEntriesByAuthorIdRequest** | [**ModGlossaryGetEntriesByAuthorIdRequest**](ModGlossaryGetEntriesByAuthorIdRequest.md)|  | |

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

<a id="modGlossaryGetEntriesByCategory"></a>
# **modGlossaryGetEntriesByCategory**
> ModGlossaryGetEntriesByCategory200Response modGlossaryGetEntriesByCategory(modGlossaryGetEntriesByCategoryRequest)

Browse entries by category.

Browse entries by category.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModGlossaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModGlossaryApi apiInstance = new ModGlossaryApi(defaultClient);
    ModGlossaryGetEntriesByCategoryRequest modGlossaryGetEntriesByCategoryRequest = new ModGlossaryGetEntriesByCategoryRequest(); // ModGlossaryGetEntriesByCategoryRequest | 
    try {
      ModGlossaryGetEntriesByCategory200Response result = apiInstance.modGlossaryGetEntriesByCategory(modGlossaryGetEntriesByCategoryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModGlossaryApi#modGlossaryGetEntriesByCategory");
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
| **modGlossaryGetEntriesByCategoryRequest** | [**ModGlossaryGetEntriesByCategoryRequest**](ModGlossaryGetEntriesByCategoryRequest.md)|  | |

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

<a id="modGlossaryGetEntriesByDate"></a>
# **modGlossaryGetEntriesByDate**
> ModGlossaryGetEntriesByAuthorId200Response modGlossaryGetEntriesByDate(modGlossaryGetEntriesByDateRequest)

Browse entries by date.

Browse entries by date.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModGlossaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModGlossaryApi apiInstance = new ModGlossaryApi(defaultClient);
    ModGlossaryGetEntriesByDateRequest modGlossaryGetEntriesByDateRequest = new ModGlossaryGetEntriesByDateRequest(); // ModGlossaryGetEntriesByDateRequest | 
    try {
      ModGlossaryGetEntriesByAuthorId200Response result = apiInstance.modGlossaryGetEntriesByDate(modGlossaryGetEntriesByDateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModGlossaryApi#modGlossaryGetEntriesByDate");
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
| **modGlossaryGetEntriesByDateRequest** | [**ModGlossaryGetEntriesByDateRequest**](ModGlossaryGetEntriesByDateRequest.md)|  | |

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

<a id="modGlossaryGetEntriesByLetter"></a>
# **modGlossaryGetEntriesByLetter**
> ModGlossaryGetEntriesByAuthorId200Response modGlossaryGetEntriesByLetter(modGlossaryGetEntriesByLetterRequest)

Browse entries by letter.

Browse entries by letter.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModGlossaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModGlossaryApi apiInstance = new ModGlossaryApi(defaultClient);
    ModGlossaryGetEntriesByLetterRequest modGlossaryGetEntriesByLetterRequest = new ModGlossaryGetEntriesByLetterRequest(); // ModGlossaryGetEntriesByLetterRequest | 
    try {
      ModGlossaryGetEntriesByAuthorId200Response result = apiInstance.modGlossaryGetEntriesByLetter(modGlossaryGetEntriesByLetterRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModGlossaryApi#modGlossaryGetEntriesByLetter");
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
| **modGlossaryGetEntriesByLetterRequest** | [**ModGlossaryGetEntriesByLetterRequest**](ModGlossaryGetEntriesByLetterRequest.md)|  | |

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

<a id="modGlossaryGetEntriesBySearch"></a>
# **modGlossaryGetEntriesBySearch**
> ModGlossaryGetEntriesByAuthorId200Response modGlossaryGetEntriesBySearch(modGlossaryGetEntriesBySearchRequest)

Browse entries by search query.

Browse entries by search query.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModGlossaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModGlossaryApi apiInstance = new ModGlossaryApi(defaultClient);
    ModGlossaryGetEntriesBySearchRequest modGlossaryGetEntriesBySearchRequest = new ModGlossaryGetEntriesBySearchRequest(); // ModGlossaryGetEntriesBySearchRequest | 
    try {
      ModGlossaryGetEntriesByAuthorId200Response result = apiInstance.modGlossaryGetEntriesBySearch(modGlossaryGetEntriesBySearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModGlossaryApi#modGlossaryGetEntriesBySearch");
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
| **modGlossaryGetEntriesBySearchRequest** | [**ModGlossaryGetEntriesBySearchRequest**](ModGlossaryGetEntriesBySearchRequest.md)|  | |

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

<a id="modGlossaryGetEntriesByTerm"></a>
# **modGlossaryGetEntriesByTerm**
> ModGlossaryGetEntriesByAuthorId200Response modGlossaryGetEntriesByTerm(modGlossaryGetEntriesByTermRequest)

Browse entries by term (concept or alias).

Browse entries by term (concept or alias).

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModGlossaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModGlossaryApi apiInstance = new ModGlossaryApi(defaultClient);
    ModGlossaryGetEntriesByTermRequest modGlossaryGetEntriesByTermRequest = new ModGlossaryGetEntriesByTermRequest(); // ModGlossaryGetEntriesByTermRequest | 
    try {
      ModGlossaryGetEntriesByAuthorId200Response result = apiInstance.modGlossaryGetEntriesByTerm(modGlossaryGetEntriesByTermRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModGlossaryApi#modGlossaryGetEntriesByTerm");
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
| **modGlossaryGetEntriesByTermRequest** | [**ModGlossaryGetEntriesByTermRequest**](ModGlossaryGetEntriesByTermRequest.md)|  | |

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

<a id="modGlossaryGetEntriesToApprove"></a>
# **modGlossaryGetEntriesToApprove**
> ModGlossaryGetEntriesByAuthorId200Response modGlossaryGetEntriesToApprove(modGlossaryGetEntriesToApproveRequest)

Browse entries to be approved.

Browse entries to be approved.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModGlossaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModGlossaryApi apiInstance = new ModGlossaryApi(defaultClient);
    ModGlossaryGetEntriesToApproveRequest modGlossaryGetEntriesToApproveRequest = new ModGlossaryGetEntriesToApproveRequest(); // ModGlossaryGetEntriesToApproveRequest | 
    try {
      ModGlossaryGetEntriesByAuthorId200Response result = apiInstance.modGlossaryGetEntriesToApprove(modGlossaryGetEntriesToApproveRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModGlossaryApi#modGlossaryGetEntriesToApprove");
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
| **modGlossaryGetEntriesToApproveRequest** | [**ModGlossaryGetEntriesToApproveRequest**](ModGlossaryGetEntriesToApproveRequest.md)|  | |

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

<a id="modGlossaryGetEntryById"></a>
# **modGlossaryGetEntryById**
> ModGlossaryGetEntryById200Response modGlossaryGetEntryById(modGlossaryGetEntryByIdRequest)

Get an entry by ID

Get an entry by ID

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModGlossaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModGlossaryApi apiInstance = new ModGlossaryApi(defaultClient);
    ModGlossaryGetEntryByIdRequest modGlossaryGetEntryByIdRequest = new ModGlossaryGetEntryByIdRequest(); // ModGlossaryGetEntryByIdRequest | 
    try {
      ModGlossaryGetEntryById200Response result = apiInstance.modGlossaryGetEntryById(modGlossaryGetEntryByIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModGlossaryApi#modGlossaryGetEntryById");
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
| **modGlossaryGetEntryByIdRequest** | [**ModGlossaryGetEntryByIdRequest**](ModGlossaryGetEntryByIdRequest.md)|  | |

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

<a id="modGlossaryGetGlossariesByCourses"></a>
# **modGlossaryGetGlossariesByCourses**
> ModGlossaryGetGlossariesByCourses200Response modGlossaryGetGlossariesByCourses(modChatGetChatsByCoursesRequest)

Retrieve a list of glossaries from several courses.

Retrieve a list of glossaries from several courses.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModGlossaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModGlossaryApi apiInstance = new ModGlossaryApi(defaultClient);
    ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 
    try {
      ModGlossaryGetGlossariesByCourses200Response result = apiInstance.modGlossaryGetGlossariesByCourses(modChatGetChatsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModGlossaryApi#modGlossaryGetGlossariesByCourses");
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

<a id="modGlossaryPrepareEntryForEdition"></a>
# **modGlossaryPrepareEntryForEdition**
> ModGlossaryPrepareEntryForEdition200Response modGlossaryPrepareEntryForEdition(modGlossaryPrepareEntryForEditionRequest)

Prepares the given entry for edition returning draft item areas and file areas information.

Prepares the given entry for edition returning draft item areas and file areas information.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModGlossaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModGlossaryApi apiInstance = new ModGlossaryApi(defaultClient);
    ModGlossaryPrepareEntryForEditionRequest modGlossaryPrepareEntryForEditionRequest = new ModGlossaryPrepareEntryForEditionRequest(); // ModGlossaryPrepareEntryForEditionRequest | 
    try {
      ModGlossaryPrepareEntryForEdition200Response result = apiInstance.modGlossaryPrepareEntryForEdition(modGlossaryPrepareEntryForEditionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModGlossaryApi#modGlossaryPrepareEntryForEdition");
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
| **modGlossaryPrepareEntryForEditionRequest** | [**ModGlossaryPrepareEntryForEditionRequest**](ModGlossaryPrepareEntryForEditionRequest.md)|  | |

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

<a id="modGlossaryUpdateEntry"></a>
# **modGlossaryUpdateEntry**
> ModGlossaryUpdateEntry200Response modGlossaryUpdateEntry(modGlossaryUpdateEntryRequest)

Updates the given glossary entry.

Updates the given glossary entry.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModGlossaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModGlossaryApi apiInstance = new ModGlossaryApi(defaultClient);
    ModGlossaryUpdateEntryRequest modGlossaryUpdateEntryRequest = new ModGlossaryUpdateEntryRequest(); // ModGlossaryUpdateEntryRequest | 
    try {
      ModGlossaryUpdateEntry200Response result = apiInstance.modGlossaryUpdateEntry(modGlossaryUpdateEntryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModGlossaryApi#modGlossaryUpdateEntry");
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
| **modGlossaryUpdateEntryRequest** | [**ModGlossaryUpdateEntryRequest**](ModGlossaryUpdateEntryRequest.md)|  | |

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

<a id="modGlossaryViewEntry"></a>
# **modGlossaryViewEntry**
> ModGlossaryViewEntry200Response modGlossaryViewEntry(modGlossaryGetEntryByIdRequest)

Notify a glossary entry as being viewed.

Notify a glossary entry as being viewed.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModGlossaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModGlossaryApi apiInstance = new ModGlossaryApi(defaultClient);
    ModGlossaryGetEntryByIdRequest modGlossaryGetEntryByIdRequest = new ModGlossaryGetEntryByIdRequest(); // ModGlossaryGetEntryByIdRequest | 
    try {
      ModGlossaryViewEntry200Response result = apiInstance.modGlossaryViewEntry(modGlossaryGetEntryByIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModGlossaryApi#modGlossaryViewEntry");
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
| **modGlossaryGetEntryByIdRequest** | [**ModGlossaryGetEntryByIdRequest**](ModGlossaryGetEntryByIdRequest.md)|  | |

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

<a id="modGlossaryViewGlossary"></a>
# **modGlossaryViewGlossary**
> ModGlossaryViewGlossary200Response modGlossaryViewGlossary(modGlossaryViewGlossaryRequest)

Notify the glossary as being viewed.

Notify the glossary as being viewed.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModGlossaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModGlossaryApi apiInstance = new ModGlossaryApi(defaultClient);
    ModGlossaryViewGlossaryRequest modGlossaryViewGlossaryRequest = new ModGlossaryViewGlossaryRequest(); // ModGlossaryViewGlossaryRequest | 
    try {
      ModGlossaryViewGlossary200Response result = apiInstance.modGlossaryViewGlossary(modGlossaryViewGlossaryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModGlossaryApi#modGlossaryViewGlossary");
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
| **modGlossaryViewGlossaryRequest** | [**ModGlossaryViewGlossaryRequest**](ModGlossaryViewGlossaryRequest.md)|  | |

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

