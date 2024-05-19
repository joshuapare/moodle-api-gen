# ModWikiApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modWikiEditPage**](ModWikiApi.md#modWikiEditPage) | **POST** /mod_wiki_edit_page | Save the contents of a page. |
| [**modWikiGetPageContents**](ModWikiApi.md#modWikiGetPageContents) | **POST** /mod_wiki_get_page_contents | Returns the contents of a page. |
| [**modWikiGetPageForEditing**](ModWikiApi.md#modWikiGetPageForEditing) | **POST** /mod_wiki_get_page_for_editing | Locks and retrieves info of page-section to be edited. |
| [**modWikiGetSubwikiFiles**](ModWikiApi.md#modWikiGetSubwikiFiles) | **POST** /mod_wiki_get_subwiki_files | Returns the list of files for a specific subwiki. |
| [**modWikiGetSubwikiPages**](ModWikiApi.md#modWikiGetSubwikiPages) | **POST** /mod_wiki_get_subwiki_pages | Returns the list of pages for a specific subwiki. |
| [**modWikiGetSubwikis**](ModWikiApi.md#modWikiGetSubwikis) | **POST** /mod_wiki_get_subwikis | Returns the list of subwikis the user can see in a specific wiki. |
| [**modWikiGetWikisByCourses**](ModWikiApi.md#modWikiGetWikisByCourses) | **POST** /mod_wiki_get_wikis_by_courses | Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned. |
| [**modWikiNewPage**](ModWikiApi.md#modWikiNewPage) | **POST** /mod_wiki_new_page | Create a new page in a subwiki. |
| [**modWikiViewPage**](ModWikiApi.md#modWikiViewPage) | **POST** /mod_wiki_view_page | Trigger the page viewed event and update the module completion status. |
| [**modWikiViewWiki**](ModWikiApi.md#modWikiViewWiki) | **POST** /mod_wiki_view_wiki | Trigger the course module viewed event and update the module completion status. |


<a id="modWikiEditPage"></a>
# **modWikiEditPage**
> ModWikiEditPage200Response modWikiEditPage(modWikiEditPageRequest)

Save the contents of a page.

Save the contents of a page.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWikiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWikiApi apiInstance = new ModWikiApi(defaultClient);
    ModWikiEditPageRequest modWikiEditPageRequest = new ModWikiEditPageRequest(); // ModWikiEditPageRequest | 
    try {
      ModWikiEditPage200Response result = apiInstance.modWikiEditPage(modWikiEditPageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWikiApi#modWikiEditPage");
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
| **modWikiEditPageRequest** | [**ModWikiEditPageRequest**](ModWikiEditPageRequest.md)|  | |

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

<a id="modWikiGetPageContents"></a>
# **modWikiGetPageContents**
> ModWikiGetPageContents200Response modWikiGetPageContents(modWikiGetPageContentsRequest)

Returns the contents of a page.

Returns the contents of a page.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWikiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWikiApi apiInstance = new ModWikiApi(defaultClient);
    ModWikiGetPageContentsRequest modWikiGetPageContentsRequest = new ModWikiGetPageContentsRequest(); // ModWikiGetPageContentsRequest | 
    try {
      ModWikiGetPageContents200Response result = apiInstance.modWikiGetPageContents(modWikiGetPageContentsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWikiApi#modWikiGetPageContents");
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
| **modWikiGetPageContentsRequest** | [**ModWikiGetPageContentsRequest**](ModWikiGetPageContentsRequest.md)|  | |

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

<a id="modWikiGetPageForEditing"></a>
# **modWikiGetPageForEditing**
> ModWikiGetPageForEditing200Response modWikiGetPageForEditing(modWikiGetPageForEditingRequest)

Locks and retrieves info of page-section to be edited.

Locks and retrieves info of page-section to be edited.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWikiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWikiApi apiInstance = new ModWikiApi(defaultClient);
    ModWikiGetPageForEditingRequest modWikiGetPageForEditingRequest = new ModWikiGetPageForEditingRequest(); // ModWikiGetPageForEditingRequest | 
    try {
      ModWikiGetPageForEditing200Response result = apiInstance.modWikiGetPageForEditing(modWikiGetPageForEditingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWikiApi#modWikiGetPageForEditing");
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
| **modWikiGetPageForEditingRequest** | [**ModWikiGetPageForEditingRequest**](ModWikiGetPageForEditingRequest.md)|  | |

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

<a id="modWikiGetSubwikiFiles"></a>
# **modWikiGetSubwikiFiles**
> CoreH5pGetTrustedH5pFile200Response modWikiGetSubwikiFiles(modWikiGetSubwikiFilesRequest)

Returns the list of files for a specific subwiki.

Returns the list of files for a specific subwiki.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWikiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWikiApi apiInstance = new ModWikiApi(defaultClient);
    ModWikiGetSubwikiFilesRequest modWikiGetSubwikiFilesRequest = new ModWikiGetSubwikiFilesRequest(); // ModWikiGetSubwikiFilesRequest | 
    try {
      CoreH5pGetTrustedH5pFile200Response result = apiInstance.modWikiGetSubwikiFiles(modWikiGetSubwikiFilesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWikiApi#modWikiGetSubwikiFiles");
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
| **modWikiGetSubwikiFilesRequest** | [**ModWikiGetSubwikiFilesRequest**](ModWikiGetSubwikiFilesRequest.md)|  | |

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

<a id="modWikiGetSubwikiPages"></a>
# **modWikiGetSubwikiPages**
> ModWikiGetSubwikiPages200Response modWikiGetSubwikiPages(modWikiGetSubwikiPagesRequest)

Returns the list of pages for a specific subwiki.

Returns the list of pages for a specific subwiki.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWikiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWikiApi apiInstance = new ModWikiApi(defaultClient);
    ModWikiGetSubwikiPagesRequest modWikiGetSubwikiPagesRequest = new ModWikiGetSubwikiPagesRequest(); // ModWikiGetSubwikiPagesRequest | 
    try {
      ModWikiGetSubwikiPages200Response result = apiInstance.modWikiGetSubwikiPages(modWikiGetSubwikiPagesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWikiApi#modWikiGetSubwikiPages");
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
| **modWikiGetSubwikiPagesRequest** | [**ModWikiGetSubwikiPagesRequest**](ModWikiGetSubwikiPagesRequest.md)|  | |

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

<a id="modWikiGetSubwikis"></a>
# **modWikiGetSubwikis**
> ModWikiGetSubwikis200Response modWikiGetSubwikis(modWikiGetSubwikisRequest)

Returns the list of subwikis the user can see in a specific wiki.

Returns the list of subwikis the user can see in a specific wiki.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWikiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWikiApi apiInstance = new ModWikiApi(defaultClient);
    ModWikiGetSubwikisRequest modWikiGetSubwikisRequest = new ModWikiGetSubwikisRequest(); // ModWikiGetSubwikisRequest | 
    try {
      ModWikiGetSubwikis200Response result = apiInstance.modWikiGetSubwikis(modWikiGetSubwikisRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWikiApi#modWikiGetSubwikis");
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
| **modWikiGetSubwikisRequest** | [**ModWikiGetSubwikisRequest**](ModWikiGetSubwikisRequest.md)|  | |

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

<a id="modWikiGetWikisByCourses"></a>
# **modWikiGetWikisByCourses**
> ModWikiGetWikisByCourses200Response modWikiGetWikisByCourses(modWikiGetWikisByCoursesRequest)

Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.

Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWikiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWikiApi apiInstance = new ModWikiApi(defaultClient);
    ModWikiGetWikisByCoursesRequest modWikiGetWikisByCoursesRequest = new ModWikiGetWikisByCoursesRequest(); // ModWikiGetWikisByCoursesRequest | 
    try {
      ModWikiGetWikisByCourses200Response result = apiInstance.modWikiGetWikisByCourses(modWikiGetWikisByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWikiApi#modWikiGetWikisByCourses");
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
| **modWikiGetWikisByCoursesRequest** | [**ModWikiGetWikisByCoursesRequest**](ModWikiGetWikisByCoursesRequest.md)|  | |

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

<a id="modWikiNewPage"></a>
# **modWikiNewPage**
> ModWikiNewPage200Response modWikiNewPage(modWikiNewPageRequest)

Create a new page in a subwiki.

Create a new page in a subwiki.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWikiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWikiApi apiInstance = new ModWikiApi(defaultClient);
    ModWikiNewPageRequest modWikiNewPageRequest = new ModWikiNewPageRequest(); // ModWikiNewPageRequest | 
    try {
      ModWikiNewPage200Response result = apiInstance.modWikiNewPage(modWikiNewPageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWikiApi#modWikiNewPage");
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
| **modWikiNewPageRequest** | [**ModWikiNewPageRequest**](ModWikiNewPageRequest.md)|  | |

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

<a id="modWikiViewPage"></a>
# **modWikiViewPage**
> ModWikiViewPage200Response modWikiViewPage(modWikiViewPageRequest)

Trigger the page viewed event and update the module completion status.

Trigger the page viewed event and update the module completion status.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWikiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWikiApi apiInstance = new ModWikiApi(defaultClient);
    ModWikiViewPageRequest modWikiViewPageRequest = new ModWikiViewPageRequest(); // ModWikiViewPageRequest | 
    try {
      ModWikiViewPage200Response result = apiInstance.modWikiViewPage(modWikiViewPageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWikiApi#modWikiViewPage");
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
| **modWikiViewPageRequest** | [**ModWikiViewPageRequest**](ModWikiViewPageRequest.md)|  | |

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

<a id="modWikiViewWiki"></a>
# **modWikiViewWiki**
> ModWikiViewWiki200Response modWikiViewWiki(modWikiGetSubwikisRequest)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModWikiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModWikiApi apiInstance = new ModWikiApi(defaultClient);
    ModWikiGetSubwikisRequest modWikiGetSubwikisRequest = new ModWikiGetSubwikisRequest(); // ModWikiGetSubwikisRequest | 
    try {
      ModWikiViewWiki200Response result = apiInstance.modWikiViewWiki(modWikiGetSubwikisRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModWikiApi#modWikiViewWiki");
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
| **modWikiGetSubwikisRequest** | [**ModWikiGetSubwikisRequest**](ModWikiGetSubwikisRequest.md)|  | |

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

