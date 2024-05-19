# ToolTemplatelibraryApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**toolTemplatelibraryListTemplates**](ToolTemplatelibraryApi.md#toolTemplatelibraryListTemplates) | **POST** /tool_templatelibrary_list_templates | List/search templates by component. |
| [**toolTemplatelibraryLoadCanonicalTemplate**](ToolTemplatelibraryApi.md#toolTemplatelibraryLoadCanonicalTemplate) | **POST** /tool_templatelibrary_load_canonical_template | Load a canonical template by name (not the theme overidden one). |


<a id="toolTemplatelibraryListTemplates"></a>
# **toolTemplatelibraryListTemplates**
> Object toolTemplatelibraryListTemplates(toolTemplatelibraryListTemplatesRequest)

List/search templates by component.

List/search templates by component.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolTemplatelibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolTemplatelibraryApi apiInstance = new ToolTemplatelibraryApi(defaultClient);
    ToolTemplatelibraryListTemplatesRequest toolTemplatelibraryListTemplatesRequest = new ToolTemplatelibraryListTemplatesRequest(); // ToolTemplatelibraryListTemplatesRequest | 
    try {
      Object result = apiInstance.toolTemplatelibraryListTemplates(toolTemplatelibraryListTemplatesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolTemplatelibraryApi#toolTemplatelibraryListTemplates");
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
| **toolTemplatelibraryListTemplatesRequest** | [**ToolTemplatelibraryListTemplatesRequest**](ToolTemplatelibraryListTemplatesRequest.md)|  | |

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

<a id="toolTemplatelibraryLoadCanonicalTemplate"></a>
# **toolTemplatelibraryLoadCanonicalTemplate**
> Object toolTemplatelibraryLoadCanonicalTemplate(toolTemplatelibraryLoadCanonicalTemplateRequest)

Load a canonical template by name (not the theme overidden one).

Load a canonical template by name (not the theme overidden one).

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolTemplatelibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolTemplatelibraryApi apiInstance = new ToolTemplatelibraryApi(defaultClient);
    ToolTemplatelibraryLoadCanonicalTemplateRequest toolTemplatelibraryLoadCanonicalTemplateRequest = new ToolTemplatelibraryLoadCanonicalTemplateRequest(); // ToolTemplatelibraryLoadCanonicalTemplateRequest | 
    try {
      Object result = apiInstance.toolTemplatelibraryLoadCanonicalTemplate(toolTemplatelibraryLoadCanonicalTemplateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolTemplatelibraryApi#toolTemplatelibraryLoadCanonicalTemplate");
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
| **toolTemplatelibraryLoadCanonicalTemplateRequest** | [**ToolTemplatelibraryLoadCanonicalTemplateRequest**](ToolTemplatelibraryLoadCanonicalTemplateRequest.md)|  | |

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
| **200** | template |  -  |
| **400** | Invalid parameter value detected |  -  |

