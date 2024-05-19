# ModLtiApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modLtiCreateToolProxy**](ModLtiApi.md#modLtiCreateToolProxy) | **POST** /mod_lti_create_tool_proxy | Create a tool proxy |
| [**modLtiCreateToolType**](ModLtiApi.md#modLtiCreateToolType) | **POST** /mod_lti_create_tool_type | Create a tool type |
| [**modLtiDeleteCourseToolType**](ModLtiApi.md#modLtiDeleteCourseToolType) | **POST** /mod_lti_delete_course_tool_type | Delete a course tool type |
| [**modLtiDeleteToolProxy**](ModLtiApi.md#modLtiDeleteToolProxy) | **POST** /mod_lti_delete_tool_proxy | Delete a tool proxy |
| [**modLtiDeleteToolType**](ModLtiApi.md#modLtiDeleteToolType) | **POST** /mod_lti_delete_tool_type | Delete a tool type |
| [**modLtiGetLtisByCourses**](ModLtiApi.md#modLtiGetLtisByCourses) | **POST** /mod_lti_get_ltis_by_courses | Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned. |
| [**modLtiGetToolLaunchData**](ModLtiApi.md#modLtiGetToolLaunchData) | **POST** /mod_lti_get_tool_launch_data | Return the launch data for a given external tool. |
| [**modLtiGetToolProxies**](ModLtiApi.md#modLtiGetToolProxies) | **POST** /mod_lti_get_tool_proxies | Get a list of the tool proxies |
| [**modLtiGetToolProxyRegistrationRequest**](ModLtiApi.md#modLtiGetToolProxyRegistrationRequest) | **POST** /mod_lti_get_tool_proxy_registration_request | Get a registration request for a tool proxy |
| [**modLtiGetToolTypes**](ModLtiApi.md#modLtiGetToolTypes) | **POST** /mod_lti_get_tool_types | Get a list of the tool types |
| [**modLtiGetToolTypesAndProxies**](ModLtiApi.md#modLtiGetToolTypesAndProxies) | **POST** /mod_lti_get_tool_types_and_proxies | Get a list of the tool types and tool proxies |
| [**modLtiGetToolTypesAndProxiesCount**](ModLtiApi.md#modLtiGetToolTypesAndProxiesCount) | **POST** /mod_lti_get_tool_types_and_proxies_count | Get total number of the tool types and tool proxies |
| [**modLtiIsCartridge**](ModLtiApi.md#modLtiIsCartridge) | **POST** /mod_lti_is_cartridge | Determine if the given url is for a cartridge |
| [**modLtiToggleShowinactivitychooser**](ModLtiApi.md#modLtiToggleShowinactivitychooser) | **POST** /mod_lti_toggle_showinactivitychooser | Toggle showinactivitychooser for a tool type in a course |
| [**modLtiUpdateToolType**](ModLtiApi.md#modLtiUpdateToolType) | **POST** /mod_lti_update_tool_type | Update a tool type |
| [**modLtiViewLti**](ModLtiApi.md#modLtiViewLti) | **POST** /mod_lti_view_lti | Trigger the course module viewed event and update the module completion status. |


<a id="modLtiCreateToolProxy"></a>
# **modLtiCreateToolProxy**
> ModLtiCreateToolProxy200Response modLtiCreateToolProxy(modLtiCreateToolProxyRequest)

Create a tool proxy

Create a tool proxy

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLtiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLtiApi apiInstance = new ModLtiApi(defaultClient);
    ModLtiCreateToolProxyRequest modLtiCreateToolProxyRequest = new ModLtiCreateToolProxyRequest(); // ModLtiCreateToolProxyRequest | 
    try {
      ModLtiCreateToolProxy200Response result = apiInstance.modLtiCreateToolProxy(modLtiCreateToolProxyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLtiApi#modLtiCreateToolProxy");
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
| **modLtiCreateToolProxyRequest** | [**ModLtiCreateToolProxyRequest**](ModLtiCreateToolProxyRequest.md)|  | |

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

<a id="modLtiCreateToolType"></a>
# **modLtiCreateToolType**
> ModLtiCreateToolType200Response modLtiCreateToolType(modLtiCreateToolTypeRequest)

Create a tool type

Create a tool type

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLtiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLtiApi apiInstance = new ModLtiApi(defaultClient);
    ModLtiCreateToolTypeRequest modLtiCreateToolTypeRequest = new ModLtiCreateToolTypeRequest(); // ModLtiCreateToolTypeRequest | 
    try {
      ModLtiCreateToolType200Response result = apiInstance.modLtiCreateToolType(modLtiCreateToolTypeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLtiApi#modLtiCreateToolType");
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
| **modLtiCreateToolTypeRequest** | [**ModLtiCreateToolTypeRequest**](ModLtiCreateToolTypeRequest.md)|  | |

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

<a id="modLtiDeleteCourseToolType"></a>
# **modLtiDeleteCourseToolType**
> Object modLtiDeleteCourseToolType(modLtiDeleteCourseToolTypeRequest)

Delete a course tool type

Delete a course tool type

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLtiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLtiApi apiInstance = new ModLtiApi(defaultClient);
    ModLtiDeleteCourseToolTypeRequest modLtiDeleteCourseToolTypeRequest = new ModLtiDeleteCourseToolTypeRequest(); // ModLtiDeleteCourseToolTypeRequest | 
    try {
      Object result = apiInstance.modLtiDeleteCourseToolType(modLtiDeleteCourseToolTypeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLtiApi#modLtiDeleteCourseToolType");
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
| **modLtiDeleteCourseToolTypeRequest** | [**ModLtiDeleteCourseToolTypeRequest**](ModLtiDeleteCourseToolTypeRequest.md)|  | |

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

<a id="modLtiDeleteToolProxy"></a>
# **modLtiDeleteToolProxy**
> ModLtiDeleteToolProxy200Response modLtiDeleteToolProxy(modLtiDeleteToolProxyRequest)

Delete a tool proxy

Delete a tool proxy

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLtiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLtiApi apiInstance = new ModLtiApi(defaultClient);
    ModLtiDeleteToolProxyRequest modLtiDeleteToolProxyRequest = new ModLtiDeleteToolProxyRequest(); // ModLtiDeleteToolProxyRequest | 
    try {
      ModLtiDeleteToolProxy200Response result = apiInstance.modLtiDeleteToolProxy(modLtiDeleteToolProxyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLtiApi#modLtiDeleteToolProxy");
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
| **modLtiDeleteToolProxyRequest** | [**ModLtiDeleteToolProxyRequest**](ModLtiDeleteToolProxyRequest.md)|  | |

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

<a id="modLtiDeleteToolType"></a>
# **modLtiDeleteToolType**
> ModLtiDeleteToolTypeRequest modLtiDeleteToolType(modLtiDeleteToolTypeRequest)

Delete a tool type

Delete a tool type

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLtiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLtiApi apiInstance = new ModLtiApi(defaultClient);
    ModLtiDeleteToolTypeRequest modLtiDeleteToolTypeRequest = new ModLtiDeleteToolTypeRequest(); // ModLtiDeleteToolTypeRequest | 
    try {
      ModLtiDeleteToolTypeRequest result = apiInstance.modLtiDeleteToolType(modLtiDeleteToolTypeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLtiApi#modLtiDeleteToolType");
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
| **modLtiDeleteToolTypeRequest** | [**ModLtiDeleteToolTypeRequest**](ModLtiDeleteToolTypeRequest.md)|  | |

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

<a id="modLtiGetLtisByCourses"></a>
# **modLtiGetLtisByCourses**
> ModLtiGetLtisByCourses200Response modLtiGetLtisByCourses(modChatGetChatsByCoursesRequest)

Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.

Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLtiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLtiApi apiInstance = new ModLtiApi(defaultClient);
    ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 
    try {
      ModLtiGetLtisByCourses200Response result = apiInstance.modLtiGetLtisByCourses(modChatGetChatsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLtiApi#modLtiGetLtisByCourses");
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

<a id="modLtiGetToolLaunchData"></a>
# **modLtiGetToolLaunchData**
> ModLtiGetToolLaunchData200Response modLtiGetToolLaunchData(modLtiGetToolLaunchDataRequest)

Return the launch data for a given external tool.

Return the launch data for a given external tool.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLtiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLtiApi apiInstance = new ModLtiApi(defaultClient);
    ModLtiGetToolLaunchDataRequest modLtiGetToolLaunchDataRequest = new ModLtiGetToolLaunchDataRequest(); // ModLtiGetToolLaunchDataRequest | 
    try {
      ModLtiGetToolLaunchData200Response result = apiInstance.modLtiGetToolLaunchData(modLtiGetToolLaunchDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLtiApi#modLtiGetToolLaunchData");
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
| **modLtiGetToolLaunchDataRequest** | [**ModLtiGetToolLaunchDataRequest**](ModLtiGetToolLaunchDataRequest.md)|  | |

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

<a id="modLtiGetToolProxies"></a>
# **modLtiGetToolProxies**
> Object modLtiGetToolProxies(modLtiGetToolProxiesRequest)

Get a list of the tool proxies

Get a list of the tool proxies

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLtiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLtiApi apiInstance = new ModLtiApi(defaultClient);
    ModLtiGetToolProxiesRequest modLtiGetToolProxiesRequest = new ModLtiGetToolProxiesRequest(); // ModLtiGetToolProxiesRequest | 
    try {
      Object result = apiInstance.modLtiGetToolProxies(modLtiGetToolProxiesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLtiApi#modLtiGetToolProxies");
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
| **modLtiGetToolProxiesRequest** | [**ModLtiGetToolProxiesRequest**](ModLtiGetToolProxiesRequest.md)|  | |

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

<a id="modLtiGetToolProxyRegistrationRequest"></a>
# **modLtiGetToolProxyRegistrationRequest**
> ModLtiGetToolProxyRegistrationRequest200Response modLtiGetToolProxyRegistrationRequest(modLtiDeleteToolProxyRequest)

Get a registration request for a tool proxy

Get a registration request for a tool proxy

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLtiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLtiApi apiInstance = new ModLtiApi(defaultClient);
    ModLtiDeleteToolProxyRequest modLtiDeleteToolProxyRequest = new ModLtiDeleteToolProxyRequest(); // ModLtiDeleteToolProxyRequest | 
    try {
      ModLtiGetToolProxyRegistrationRequest200Response result = apiInstance.modLtiGetToolProxyRegistrationRequest(modLtiDeleteToolProxyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLtiApi#modLtiGetToolProxyRegistrationRequest");
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
| **modLtiDeleteToolProxyRequest** | [**ModLtiDeleteToolProxyRequest**](ModLtiDeleteToolProxyRequest.md)|  | |

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

<a id="modLtiGetToolTypes"></a>
# **modLtiGetToolTypes**
> Object modLtiGetToolTypes(modLtiGetToolTypesRequest)

Get a list of the tool types

Get a list of the tool types

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLtiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLtiApi apiInstance = new ModLtiApi(defaultClient);
    ModLtiGetToolTypesRequest modLtiGetToolTypesRequest = new ModLtiGetToolTypesRequest(); // ModLtiGetToolTypesRequest | 
    try {
      Object result = apiInstance.modLtiGetToolTypes(modLtiGetToolTypesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLtiApi#modLtiGetToolTypes");
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
| **modLtiGetToolTypesRequest** | [**ModLtiGetToolTypesRequest**](ModLtiGetToolTypesRequest.md)|  | |

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

<a id="modLtiGetToolTypesAndProxies"></a>
# **modLtiGetToolTypesAndProxies**
> ModLtiGetToolTypesAndProxies200Response modLtiGetToolTypesAndProxies(modLtiGetToolTypesAndProxiesRequest)

Get a list of the tool types and tool proxies

Get a list of the tool types and tool proxies

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLtiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLtiApi apiInstance = new ModLtiApi(defaultClient);
    ModLtiGetToolTypesAndProxiesRequest modLtiGetToolTypesAndProxiesRequest = new ModLtiGetToolTypesAndProxiesRequest(); // ModLtiGetToolTypesAndProxiesRequest | 
    try {
      ModLtiGetToolTypesAndProxies200Response result = apiInstance.modLtiGetToolTypesAndProxies(modLtiGetToolTypesAndProxiesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLtiApi#modLtiGetToolTypesAndProxies");
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
| **modLtiGetToolTypesAndProxiesRequest** | [**ModLtiGetToolTypesAndProxiesRequest**](ModLtiGetToolTypesAndProxiesRequest.md)|  | |

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

<a id="modLtiGetToolTypesAndProxiesCount"></a>
# **modLtiGetToolTypesAndProxiesCount**
> ModLtiGetToolTypesAndProxiesCount200Response modLtiGetToolTypesAndProxiesCount(modLtiGetToolTypesAndProxiesCountRequest)

Get total number of the tool types and tool proxies

Get total number of the tool types and tool proxies

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLtiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLtiApi apiInstance = new ModLtiApi(defaultClient);
    ModLtiGetToolTypesAndProxiesCountRequest modLtiGetToolTypesAndProxiesCountRequest = new ModLtiGetToolTypesAndProxiesCountRequest(); // ModLtiGetToolTypesAndProxiesCountRequest | 
    try {
      ModLtiGetToolTypesAndProxiesCount200Response result = apiInstance.modLtiGetToolTypesAndProxiesCount(modLtiGetToolTypesAndProxiesCountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLtiApi#modLtiGetToolTypesAndProxiesCount");
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
| **modLtiGetToolTypesAndProxiesCountRequest** | [**ModLtiGetToolTypesAndProxiesCountRequest**](ModLtiGetToolTypesAndProxiesCountRequest.md)|  | |

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

<a id="modLtiIsCartridge"></a>
# **modLtiIsCartridge**
> ModLtiIsCartridge200Response modLtiIsCartridge(modLtiIsCartridgeRequest)

Determine if the given url is for a cartridge

Determine if the given url is for a cartridge

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLtiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLtiApi apiInstance = new ModLtiApi(defaultClient);
    ModLtiIsCartridgeRequest modLtiIsCartridgeRequest = new ModLtiIsCartridgeRequest(); // ModLtiIsCartridgeRequest | 
    try {
      ModLtiIsCartridge200Response result = apiInstance.modLtiIsCartridge(modLtiIsCartridgeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLtiApi#modLtiIsCartridge");
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
| **modLtiIsCartridgeRequest** | [**ModLtiIsCartridgeRequest**](ModLtiIsCartridgeRequest.md)|  | |

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

<a id="modLtiToggleShowinactivitychooser"></a>
# **modLtiToggleShowinactivitychooser**
> Object modLtiToggleShowinactivitychooser(modLtiToggleShowinactivitychooserRequest)

Toggle showinactivitychooser for a tool type in a course

Toggle showinactivitychooser for a tool type in a course

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLtiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLtiApi apiInstance = new ModLtiApi(defaultClient);
    ModLtiToggleShowinactivitychooserRequest modLtiToggleShowinactivitychooserRequest = new ModLtiToggleShowinactivitychooserRequest(); // ModLtiToggleShowinactivitychooserRequest | 
    try {
      Object result = apiInstance.modLtiToggleShowinactivitychooser(modLtiToggleShowinactivitychooserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLtiApi#modLtiToggleShowinactivitychooser");
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
| **modLtiToggleShowinactivitychooserRequest** | [**ModLtiToggleShowinactivitychooserRequest**](ModLtiToggleShowinactivitychooserRequest.md)|  | |

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

<a id="modLtiUpdateToolType"></a>
# **modLtiUpdateToolType**
> ModLtiUpdateToolType200Response modLtiUpdateToolType(modLtiUpdateToolTypeRequest)

Update a tool type

Update a tool type

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModLtiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLtiApi apiInstance = new ModLtiApi(defaultClient);
    ModLtiUpdateToolTypeRequest modLtiUpdateToolTypeRequest = new ModLtiUpdateToolTypeRequest(); // ModLtiUpdateToolTypeRequest | 
    try {
      ModLtiUpdateToolType200Response result = apiInstance.modLtiUpdateToolType(modLtiUpdateToolTypeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLtiApi#modLtiUpdateToolType");
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
| **modLtiUpdateToolTypeRequest** | [**ModLtiUpdateToolTypeRequest**](ModLtiUpdateToolTypeRequest.md)|  | |

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

<a id="modLtiViewLti"></a>
# **modLtiViewLti**
> CoreCalendarDeleteSubscription200Response modLtiViewLti(modLtiViewLtiRequest)

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
import com.joshuapare.moodleclient.ModLtiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModLtiApi apiInstance = new ModLtiApi(defaultClient);
    ModLtiViewLtiRequest modLtiViewLtiRequest = new ModLtiViewLtiRequest(); // ModLtiViewLtiRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modLtiViewLti(modLtiViewLtiRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModLtiApi#modLtiViewLti");
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
| **modLtiViewLtiRequest** | [**ModLtiViewLtiRequest**](ModLtiViewLtiRequest.md)|  | |

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

