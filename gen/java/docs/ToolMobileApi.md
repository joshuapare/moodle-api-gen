# ToolMobileApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**toolMobileCallExternalFunctions**](ToolMobileApi.md#toolMobileCallExternalFunctions) | **POST** /tool_mobile_call_external_functions | Call multiple external functions and return all responses. |
| [**toolMobileGetAutologinKey**](ToolMobileApi.md#toolMobileGetAutologinKey) | **POST** /tool_mobile_get_autologin_key | Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app. |
| [**toolMobileGetConfig**](ToolMobileApi.md#toolMobileGetConfig) | **POST** /tool_mobile_get_config | Returns a list of the site configurations, filtering by section. |
| [**toolMobileGetContent**](ToolMobileApi.md#toolMobileGetContent) | **POST** /tool_mobile_get_content | Returns a piece of content to be displayed in the Mobile app. |
| [**toolMobileGetPluginsSupportingMobile**](ToolMobileApi.md#toolMobileGetPluginsSupportingMobile) | **POST** /tool_mobile_get_plugins_supporting_mobile | Returns a list of Moodle plugins supporting the mobile app. |
| [**toolMobileGetPublicConfig**](ToolMobileApi.md#toolMobileGetPublicConfig) | **POST** /tool_mobile_get_public_config | Returns a list of the site public settings, those not requiring authentication. |
| [**toolMobileGetTokensForQrLogin**](ToolMobileApi.md#toolMobileGetTokensForQrLogin) | **POST** /tool_mobile_get_tokens_for_qr_login | Returns a WebService token (and private token) for QR login. |
| [**toolMobileValidateSubscriptionKey**](ToolMobileApi.md#toolMobileValidateSubscriptionKey) | **POST** /tool_mobile_validate_subscription_key | Check if the given site subscription key is valid. |


<a id="toolMobileCallExternalFunctions"></a>
# **toolMobileCallExternalFunctions**
> ToolMobileCallExternalFunctions200Response toolMobileCallExternalFunctions(toolMobileCallExternalFunctionsRequest)

Call multiple external functions and return all responses.

Call multiple external functions and return all responses.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolMobileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolMobileApi apiInstance = new ToolMobileApi(defaultClient);
    ToolMobileCallExternalFunctionsRequest toolMobileCallExternalFunctionsRequest = new ToolMobileCallExternalFunctionsRequest(); // ToolMobileCallExternalFunctionsRequest | 
    try {
      ToolMobileCallExternalFunctions200Response result = apiInstance.toolMobileCallExternalFunctions(toolMobileCallExternalFunctionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolMobileApi#toolMobileCallExternalFunctions");
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
| **toolMobileCallExternalFunctionsRequest** | [**ToolMobileCallExternalFunctionsRequest**](ToolMobileCallExternalFunctionsRequest.md)|  | |

### Return type

[**ToolMobileCallExternalFunctions200Response**](ToolMobileCallExternalFunctions200Response.md)

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

<a id="toolMobileGetAutologinKey"></a>
# **toolMobileGetAutologinKey**
> ToolMobileGetAutologinKey200Response toolMobileGetAutologinKey(toolMobileGetAutologinKeyRequest)

Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.

Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolMobileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolMobileApi apiInstance = new ToolMobileApi(defaultClient);
    ToolMobileGetAutologinKeyRequest toolMobileGetAutologinKeyRequest = new ToolMobileGetAutologinKeyRequest(); // ToolMobileGetAutologinKeyRequest | 
    try {
      ToolMobileGetAutologinKey200Response result = apiInstance.toolMobileGetAutologinKey(toolMobileGetAutologinKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolMobileApi#toolMobileGetAutologinKey");
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
| **toolMobileGetAutologinKeyRequest** | [**ToolMobileGetAutologinKeyRequest**](ToolMobileGetAutologinKeyRequest.md)|  | |

### Return type

[**ToolMobileGetAutologinKey200Response**](ToolMobileGetAutologinKey200Response.md)

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

<a id="toolMobileGetConfig"></a>
# **toolMobileGetConfig**
> ToolMobileGetConfig200Response toolMobileGetConfig(toolMobileGetConfigRequest)

Returns a list of the site configurations, filtering by section.

Returns a list of the site configurations, filtering by section.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolMobileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolMobileApi apiInstance = new ToolMobileApi(defaultClient);
    ToolMobileGetConfigRequest toolMobileGetConfigRequest = new ToolMobileGetConfigRequest(); // ToolMobileGetConfigRequest | 
    try {
      ToolMobileGetConfig200Response result = apiInstance.toolMobileGetConfig(toolMobileGetConfigRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolMobileApi#toolMobileGetConfig");
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
| **toolMobileGetConfigRequest** | [**ToolMobileGetConfigRequest**](ToolMobileGetConfigRequest.md)|  | |

### Return type

[**ToolMobileGetConfig200Response**](ToolMobileGetConfig200Response.md)

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

<a id="toolMobileGetContent"></a>
# **toolMobileGetContent**
> ToolMobileGetContent200Response toolMobileGetContent(toolMobileGetContentRequest)

Returns a piece of content to be displayed in the Mobile app.

Returns a piece of content to be displayed in the Mobile app.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolMobileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolMobileApi apiInstance = new ToolMobileApi(defaultClient);
    ToolMobileGetContentRequest toolMobileGetContentRequest = new ToolMobileGetContentRequest(); // ToolMobileGetContentRequest | 
    try {
      ToolMobileGetContent200Response result = apiInstance.toolMobileGetContent(toolMobileGetContentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolMobileApi#toolMobileGetContent");
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
| **toolMobileGetContentRequest** | [**ToolMobileGetContentRequest**](ToolMobileGetContentRequest.md)|  | |

### Return type

[**ToolMobileGetContent200Response**](ToolMobileGetContent200Response.md)

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

<a id="toolMobileGetPluginsSupportingMobile"></a>
# **toolMobileGetPluginsSupportingMobile**
> ToolMobileGetPluginsSupportingMobile200Response toolMobileGetPluginsSupportingMobile()

Returns a list of Moodle plugins supporting the mobile app.

Returns a list of Moodle plugins supporting the mobile app.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolMobileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolMobileApi apiInstance = new ToolMobileApi(defaultClient);
    try {
      ToolMobileGetPluginsSupportingMobile200Response result = apiInstance.toolMobileGetPluginsSupportingMobile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolMobileApi#toolMobileGetPluginsSupportingMobile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ToolMobileGetPluginsSupportingMobile200Response**](ToolMobileGetPluginsSupportingMobile200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="toolMobileGetPublicConfig"></a>
# **toolMobileGetPublicConfig**
> ToolMobileGetPublicConfig200Response toolMobileGetPublicConfig()

Returns a list of the site public settings, those not requiring authentication.

Returns a list of the site public settings, those not requiring authentication.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolMobileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolMobileApi apiInstance = new ToolMobileApi(defaultClient);
    try {
      ToolMobileGetPublicConfig200Response result = apiInstance.toolMobileGetPublicConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolMobileApi#toolMobileGetPublicConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ToolMobileGetPublicConfig200Response**](ToolMobileGetPublicConfig200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="toolMobileGetTokensForQrLogin"></a>
# **toolMobileGetTokensForQrLogin**
> ToolMobileGetTokensForQrLogin200Response toolMobileGetTokensForQrLogin(toolMobileGetTokensForQrLoginRequest)

Returns a WebService token (and private token) for QR login.

Returns a WebService token (and private token) for QR login.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolMobileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolMobileApi apiInstance = new ToolMobileApi(defaultClient);
    ToolMobileGetTokensForQrLoginRequest toolMobileGetTokensForQrLoginRequest = new ToolMobileGetTokensForQrLoginRequest(); // ToolMobileGetTokensForQrLoginRequest | 
    try {
      ToolMobileGetTokensForQrLogin200Response result = apiInstance.toolMobileGetTokensForQrLogin(toolMobileGetTokensForQrLoginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolMobileApi#toolMobileGetTokensForQrLogin");
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
| **toolMobileGetTokensForQrLoginRequest** | [**ToolMobileGetTokensForQrLoginRequest**](ToolMobileGetTokensForQrLoginRequest.md)|  | |

### Return type

[**ToolMobileGetTokensForQrLogin200Response**](ToolMobileGetTokensForQrLogin200Response.md)

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

<a id="toolMobileValidateSubscriptionKey"></a>
# **toolMobileValidateSubscriptionKey**
> ToolMobileValidateSubscriptionKey200Response toolMobileValidateSubscriptionKey(toolMobileValidateSubscriptionKeyRequest)

Check if the given site subscription key is valid.

Check if the given site subscription key is valid.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolMobileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolMobileApi apiInstance = new ToolMobileApi(defaultClient);
    ToolMobileValidateSubscriptionKeyRequest toolMobileValidateSubscriptionKeyRequest = new ToolMobileValidateSubscriptionKeyRequest(); // ToolMobileValidateSubscriptionKeyRequest | 
    try {
      ToolMobileValidateSubscriptionKey200Response result = apiInstance.toolMobileValidateSubscriptionKey(toolMobileValidateSubscriptionKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolMobileApi#toolMobileValidateSubscriptionKey");
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
| **toolMobileValidateSubscriptionKeyRequest** | [**ToolMobileValidateSubscriptionKeyRequest**](ToolMobileValidateSubscriptionKeyRequest.md)|  | |

### Return type

[**ToolMobileValidateSubscriptionKey200Response**](ToolMobileValidateSubscriptionKey200Response.md)

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

