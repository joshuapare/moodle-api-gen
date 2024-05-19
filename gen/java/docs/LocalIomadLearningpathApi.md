# LocalIomadLearningpathApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**localIomadLearningpathActivate**](LocalIomadLearningpathApi.md#localIomadLearningpathActivate) | **POST** /local_iomad_learningpath_activate | Activates / deactivates learning path |
| [**localIomadLearningpathAddcourses**](LocalIomadLearningpathApi.md#localIomadLearningpathAddcourses) | **POST** /local_iomad_learningpath_addcourses | Add courses to learning path |
| [**localIomadLearningpathAddusers**](LocalIomadLearningpathApi.md#localIomadLearningpathAddusers) | **POST** /local_iomad_learningpath_addusers | Add users to learning path |
| [**localIomadLearningpathCopypath**](LocalIomadLearningpathApi.md#localIomadLearningpathCopypath) | **POST** /local_iomad_learningpath_copypath | Copy a learning path |
| [**localIomadLearningpathDeletepath**](LocalIomadLearningpathApi.md#localIomadLearningpathDeletepath) | **POST** /local_iomad_learningpath_deletepath | Completely delete a learning path |
| [**localIomadLearningpathGetcourses**](LocalIomadLearningpathApi.md#localIomadLearningpathGetcourses) | **POST** /local_iomad_learningpath_getcourses | Read list of courses for given learning |
| [**localIomadLearningpathGetprospectivecourses**](LocalIomadLearningpathApi.md#localIomadLearningpathGetprospectivecourses) | **POST** /local_iomad_learningpath_getprospectivecourses | Read set of filtered courses for given company |
| [**localIomadLearningpathGetprospectiveusers**](LocalIomadLearningpathApi.md#localIomadLearningpathGetprospectiveusers) | **POST** /local_iomad_learningpath_getprospectiveusers | Get set of filtered users for given company |
| [**localIomadLearningpathGetusers**](LocalIomadLearningpathApi.md#localIomadLearningpathGetusers) | **POST** /local_iomad_learningpath_getusers | Get users assigned to path |
| [**localIomadLearningpathOrdercourses**](LocalIomadLearningpathApi.md#localIomadLearningpathOrdercourses) | **POST** /local_iomad_learningpath_ordercourses | Set sequence of courses in learning path |
| [**localIomadLearningpathRemovecourses**](LocalIomadLearningpathApi.md#localIomadLearningpathRemovecourses) | **POST** /local_iomad_learningpath_removecourses | Remove courses from learning path |
| [**localIomadLearningpathRemoveusers**](LocalIomadLearningpathApi.md#localIomadLearningpathRemoveusers) | **POST** /local_iomad_learningpath_removeusers | Remove users from learning path |


<a id="localIomadLearningpathActivate"></a>
# **localIomadLearningpathActivate**
> Object localIomadLearningpathActivate(localIomadLearningpathActivateRequest)

Activates / deactivates learning path

Activates / deactivates learning path

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.LocalIomadLearningpathApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    LocalIomadLearningpathApi apiInstance = new LocalIomadLearningpathApi(defaultClient);
    LocalIomadLearningpathActivateRequest localIomadLearningpathActivateRequest = new LocalIomadLearningpathActivateRequest(); // LocalIomadLearningpathActivateRequest | 
    try {
      Object result = apiInstance.localIomadLearningpathActivate(localIomadLearningpathActivateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalIomadLearningpathApi#localIomadLearningpathActivate");
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
| **localIomadLearningpathActivateRequest** | [**LocalIomadLearningpathActivateRequest**](LocalIomadLearningpathActivateRequest.md)|  | |

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

<a id="localIomadLearningpathAddcourses"></a>
# **localIomadLearningpathAddcourses**
> Object localIomadLearningpathAddcourses(localIomadLearningpathAddcoursesRequest)

Add courses to learning path

Add courses to learning path

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.LocalIomadLearningpathApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    LocalIomadLearningpathApi apiInstance = new LocalIomadLearningpathApi(defaultClient);
    LocalIomadLearningpathAddcoursesRequest localIomadLearningpathAddcoursesRequest = new LocalIomadLearningpathAddcoursesRequest(); // LocalIomadLearningpathAddcoursesRequest | 
    try {
      Object result = apiInstance.localIomadLearningpathAddcourses(localIomadLearningpathAddcoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalIomadLearningpathApi#localIomadLearningpathAddcourses");
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
| **localIomadLearningpathAddcoursesRequest** | [**LocalIomadLearningpathAddcoursesRequest**](LocalIomadLearningpathAddcoursesRequest.md)|  | |

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

<a id="localIomadLearningpathAddusers"></a>
# **localIomadLearningpathAddusers**
> Object localIomadLearningpathAddusers(localIomadLearningpathAddusersRequest)

Add users to learning path

Add users to learning path

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.LocalIomadLearningpathApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    LocalIomadLearningpathApi apiInstance = new LocalIomadLearningpathApi(defaultClient);
    LocalIomadLearningpathAddusersRequest localIomadLearningpathAddusersRequest = new LocalIomadLearningpathAddusersRequest(); // LocalIomadLearningpathAddusersRequest | 
    try {
      Object result = apiInstance.localIomadLearningpathAddusers(localIomadLearningpathAddusersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalIomadLearningpathApi#localIomadLearningpathAddusers");
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
| **localIomadLearningpathAddusersRequest** | [**LocalIomadLearningpathAddusersRequest**](LocalIomadLearningpathAddusersRequest.md)|  | |

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

<a id="localIomadLearningpathCopypath"></a>
# **localIomadLearningpathCopypath**
> Object localIomadLearningpathCopypath(localIomadLearningpathCopypathRequest)

Copy a learning path

Copy a learning path

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.LocalIomadLearningpathApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    LocalIomadLearningpathApi apiInstance = new LocalIomadLearningpathApi(defaultClient);
    LocalIomadLearningpathCopypathRequest localIomadLearningpathCopypathRequest = new LocalIomadLearningpathCopypathRequest(); // LocalIomadLearningpathCopypathRequest | 
    try {
      Object result = apiInstance.localIomadLearningpathCopypath(localIomadLearningpathCopypathRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalIomadLearningpathApi#localIomadLearningpathCopypath");
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
| **localIomadLearningpathCopypathRequest** | [**LocalIomadLearningpathCopypathRequest**](LocalIomadLearningpathCopypathRequest.md)|  | |

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

<a id="localIomadLearningpathDeletepath"></a>
# **localIomadLearningpathDeletepath**
> Object localIomadLearningpathDeletepath(localIomadLearningpathCopypathRequest)

Completely delete a learning path

Completely delete a learning path

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.LocalIomadLearningpathApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    LocalIomadLearningpathApi apiInstance = new LocalIomadLearningpathApi(defaultClient);
    LocalIomadLearningpathCopypathRequest localIomadLearningpathCopypathRequest = new LocalIomadLearningpathCopypathRequest(); // LocalIomadLearningpathCopypathRequest | 
    try {
      Object result = apiInstance.localIomadLearningpathDeletepath(localIomadLearningpathCopypathRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalIomadLearningpathApi#localIomadLearningpathDeletepath");
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
| **localIomadLearningpathCopypathRequest** | [**LocalIomadLearningpathCopypathRequest**](LocalIomadLearningpathCopypathRequest.md)|  | |

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

<a id="localIomadLearningpathGetcourses"></a>
# **localIomadLearningpathGetcourses**
> Object localIomadLearningpathGetcourses(localIomadLearningpathGetcoursesRequest)

Read list of courses for given learning

Read list of courses for given learning

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.LocalIomadLearningpathApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    LocalIomadLearningpathApi apiInstance = new LocalIomadLearningpathApi(defaultClient);
    LocalIomadLearningpathGetcoursesRequest localIomadLearningpathGetcoursesRequest = new LocalIomadLearningpathGetcoursesRequest(); // LocalIomadLearningpathGetcoursesRequest | 
    try {
      Object result = apiInstance.localIomadLearningpathGetcourses(localIomadLearningpathGetcoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalIomadLearningpathApi#localIomadLearningpathGetcourses");
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
| **localIomadLearningpathGetcoursesRequest** | [**LocalIomadLearningpathGetcoursesRequest**](LocalIomadLearningpathGetcoursesRequest.md)|  | |

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

<a id="localIomadLearningpathGetprospectivecourses"></a>
# **localIomadLearningpathGetprospectivecourses**
> Object localIomadLearningpathGetprospectivecourses(localIomadLearningpathGetprospectivecoursesRequest)

Read set of filtered courses for given company

Read set of filtered courses for given company

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.LocalIomadLearningpathApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    LocalIomadLearningpathApi apiInstance = new LocalIomadLearningpathApi(defaultClient);
    LocalIomadLearningpathGetprospectivecoursesRequest localIomadLearningpathGetprospectivecoursesRequest = new LocalIomadLearningpathGetprospectivecoursesRequest(); // LocalIomadLearningpathGetprospectivecoursesRequest | 
    try {
      Object result = apiInstance.localIomadLearningpathGetprospectivecourses(localIomadLearningpathGetprospectivecoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalIomadLearningpathApi#localIomadLearningpathGetprospectivecourses");
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
| **localIomadLearningpathGetprospectivecoursesRequest** | [**LocalIomadLearningpathGetprospectivecoursesRequest**](LocalIomadLearningpathGetprospectivecoursesRequest.md)|  | |

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

<a id="localIomadLearningpathGetprospectiveusers"></a>
# **localIomadLearningpathGetprospectiveusers**
> Object localIomadLearningpathGetprospectiveusers(localIomadLearningpathGetprospectiveusersRequest)

Get set of filtered users for given company

Get set of filtered users for given company

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.LocalIomadLearningpathApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    LocalIomadLearningpathApi apiInstance = new LocalIomadLearningpathApi(defaultClient);
    LocalIomadLearningpathGetprospectiveusersRequest localIomadLearningpathGetprospectiveusersRequest = new LocalIomadLearningpathGetprospectiveusersRequest(); // LocalIomadLearningpathGetprospectiveusersRequest | 
    try {
      Object result = apiInstance.localIomadLearningpathGetprospectiveusers(localIomadLearningpathGetprospectiveusersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalIomadLearningpathApi#localIomadLearningpathGetprospectiveusers");
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
| **localIomadLearningpathGetprospectiveusersRequest** | [**LocalIomadLearningpathGetprospectiveusersRequest**](LocalIomadLearningpathGetprospectiveusersRequest.md)|  | |

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

<a id="localIomadLearningpathGetusers"></a>
# **localIomadLearningpathGetusers**
> Object localIomadLearningpathGetusers(localIomadLearningpathGetusersRequest)

Get users assigned to path

Get users assigned to path

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.LocalIomadLearningpathApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    LocalIomadLearningpathApi apiInstance = new LocalIomadLearningpathApi(defaultClient);
    LocalIomadLearningpathGetusersRequest localIomadLearningpathGetusersRequest = new LocalIomadLearningpathGetusersRequest(); // LocalIomadLearningpathGetusersRequest | 
    try {
      Object result = apiInstance.localIomadLearningpathGetusers(localIomadLearningpathGetusersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalIomadLearningpathApi#localIomadLearningpathGetusers");
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
| **localIomadLearningpathGetusersRequest** | [**LocalIomadLearningpathGetusersRequest**](LocalIomadLearningpathGetusersRequest.md)|  | |

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

<a id="localIomadLearningpathOrdercourses"></a>
# **localIomadLearningpathOrdercourses**
> Object localIomadLearningpathOrdercourses(localIomadLearningpathOrdercoursesRequest)

Set sequence of courses in learning path

Set sequence of courses in learning path

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.LocalIomadLearningpathApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    LocalIomadLearningpathApi apiInstance = new LocalIomadLearningpathApi(defaultClient);
    LocalIomadLearningpathOrdercoursesRequest localIomadLearningpathOrdercoursesRequest = new LocalIomadLearningpathOrdercoursesRequest(); // LocalIomadLearningpathOrdercoursesRequest | 
    try {
      Object result = apiInstance.localIomadLearningpathOrdercourses(localIomadLearningpathOrdercoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalIomadLearningpathApi#localIomadLearningpathOrdercourses");
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
| **localIomadLearningpathOrdercoursesRequest** | [**LocalIomadLearningpathOrdercoursesRequest**](LocalIomadLearningpathOrdercoursesRequest.md)|  | |

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

<a id="localIomadLearningpathRemovecourses"></a>
# **localIomadLearningpathRemovecourses**
> Object localIomadLearningpathRemovecourses(localIomadLearningpathRemovecoursesRequest)

Remove courses from learning path

Remove courses from learning path

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.LocalIomadLearningpathApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    LocalIomadLearningpathApi apiInstance = new LocalIomadLearningpathApi(defaultClient);
    LocalIomadLearningpathRemovecoursesRequest localIomadLearningpathRemovecoursesRequest = new LocalIomadLearningpathRemovecoursesRequest(); // LocalIomadLearningpathRemovecoursesRequest | 
    try {
      Object result = apiInstance.localIomadLearningpathRemovecourses(localIomadLearningpathRemovecoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalIomadLearningpathApi#localIomadLearningpathRemovecourses");
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
| **localIomadLearningpathRemovecoursesRequest** | [**LocalIomadLearningpathRemovecoursesRequest**](LocalIomadLearningpathRemovecoursesRequest.md)|  | |

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

<a id="localIomadLearningpathRemoveusers"></a>
# **localIomadLearningpathRemoveusers**
> Object localIomadLearningpathRemoveusers(localIomadLearningpathRemoveusersRequest)

Remove users from learning path

Remove users from learning path

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.LocalIomadLearningpathApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    LocalIomadLearningpathApi apiInstance = new LocalIomadLearningpathApi(defaultClient);
    LocalIomadLearningpathRemoveusersRequest localIomadLearningpathRemoveusersRequest = new LocalIomadLearningpathRemoveusersRequest(); // LocalIomadLearningpathRemoveusersRequest | 
    try {
      Object result = apiInstance.localIomadLearningpathRemoveusers(localIomadLearningpathRemoveusersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalIomadLearningpathApi#localIomadLearningpathRemoveusers");
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
| **localIomadLearningpathRemoveusersRequest** | [**LocalIomadLearningpathRemoveusersRequest**](LocalIomadLearningpathRemoveusersRequest.md)|  | |

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

