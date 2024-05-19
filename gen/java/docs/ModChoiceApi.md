# ModChoiceApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modChoiceDeleteChoiceResponses**](ModChoiceApi.md#modChoiceDeleteChoiceResponses) | **POST** /mod_choice_delete_choice_responses | Delete the given submitted responses in a choice |
| [**modChoiceGetChoiceOptions**](ModChoiceApi.md#modChoiceGetChoiceOptions) | **POST** /mod_choice_get_choice_options | Retrieve options for a specific choice. |
| [**modChoiceGetChoiceResults**](ModChoiceApi.md#modChoiceGetChoiceResults) | **POST** /mod_choice_get_choice_results | Retrieve users results for a given choice. |
| [**modChoiceGetChoicesByCourses**](ModChoiceApi.md#modChoiceGetChoicesByCourses) | **POST** /mod_choice_get_choices_by_courses | Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned. |
| [**modChoiceSubmitChoiceResponse**](ModChoiceApi.md#modChoiceSubmitChoiceResponse) | **POST** /mod_choice_submit_choice_response | Submit responses to a specific choice item. |
| [**modChoiceViewChoice**](ModChoiceApi.md#modChoiceViewChoice) | **POST** /mod_choice_view_choice | Trigger the course module viewed event and update the module completion status. |


<a id="modChoiceDeleteChoiceResponses"></a>
# **modChoiceDeleteChoiceResponses**
> ModChoiceDeleteChoiceResponses200Response modChoiceDeleteChoiceResponses(modChoiceDeleteChoiceResponsesRequest)

Delete the given submitted responses in a choice

Delete the given submitted responses in a choice

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModChoiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModChoiceApi apiInstance = new ModChoiceApi(defaultClient);
    ModChoiceDeleteChoiceResponsesRequest modChoiceDeleteChoiceResponsesRequest = new ModChoiceDeleteChoiceResponsesRequest(); // ModChoiceDeleteChoiceResponsesRequest | 
    try {
      ModChoiceDeleteChoiceResponses200Response result = apiInstance.modChoiceDeleteChoiceResponses(modChoiceDeleteChoiceResponsesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModChoiceApi#modChoiceDeleteChoiceResponses");
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
| **modChoiceDeleteChoiceResponsesRequest** | [**ModChoiceDeleteChoiceResponsesRequest**](ModChoiceDeleteChoiceResponsesRequest.md)|  | |

### Return type

[**ModChoiceDeleteChoiceResponses200Response**](ModChoiceDeleteChoiceResponses200Response.md)

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

<a id="modChoiceGetChoiceOptions"></a>
# **modChoiceGetChoiceOptions**
> ModChoiceGetChoiceOptions200Response modChoiceGetChoiceOptions(modChoiceGetChoiceOptionsRequest)

Retrieve options for a specific choice.

Retrieve options for a specific choice.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModChoiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModChoiceApi apiInstance = new ModChoiceApi(defaultClient);
    ModChoiceGetChoiceOptionsRequest modChoiceGetChoiceOptionsRequest = new ModChoiceGetChoiceOptionsRequest(); // ModChoiceGetChoiceOptionsRequest | 
    try {
      ModChoiceGetChoiceOptions200Response result = apiInstance.modChoiceGetChoiceOptions(modChoiceGetChoiceOptionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModChoiceApi#modChoiceGetChoiceOptions");
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
| **modChoiceGetChoiceOptionsRequest** | [**ModChoiceGetChoiceOptionsRequest**](ModChoiceGetChoiceOptionsRequest.md)|  | |

### Return type

[**ModChoiceGetChoiceOptions200Response**](ModChoiceGetChoiceOptions200Response.md)

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

<a id="modChoiceGetChoiceResults"></a>
# **modChoiceGetChoiceResults**
> ModChoiceGetChoiceResults200Response modChoiceGetChoiceResults(modChoiceGetChoiceOptionsRequest)

Retrieve users results for a given choice.

Retrieve users results for a given choice.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModChoiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModChoiceApi apiInstance = new ModChoiceApi(defaultClient);
    ModChoiceGetChoiceOptionsRequest modChoiceGetChoiceOptionsRequest = new ModChoiceGetChoiceOptionsRequest(); // ModChoiceGetChoiceOptionsRequest | 
    try {
      ModChoiceGetChoiceResults200Response result = apiInstance.modChoiceGetChoiceResults(modChoiceGetChoiceOptionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModChoiceApi#modChoiceGetChoiceResults");
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
| **modChoiceGetChoiceOptionsRequest** | [**ModChoiceGetChoiceOptionsRequest**](ModChoiceGetChoiceOptionsRequest.md)|  | |

### Return type

[**ModChoiceGetChoiceResults200Response**](ModChoiceGetChoiceResults200Response.md)

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

<a id="modChoiceGetChoicesByCourses"></a>
# **modChoiceGetChoicesByCourses**
> ModChoiceGetChoicesByCourses200Response modChoiceGetChoicesByCourses(modChatGetChatsByCoursesRequest)

Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.

Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModChoiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModChoiceApi apiInstance = new ModChoiceApi(defaultClient);
    ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 
    try {
      ModChoiceGetChoicesByCourses200Response result = apiInstance.modChoiceGetChoicesByCourses(modChatGetChatsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModChoiceApi#modChoiceGetChoicesByCourses");
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

[**ModChoiceGetChoicesByCourses200Response**](ModChoiceGetChoicesByCourses200Response.md)

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

<a id="modChoiceSubmitChoiceResponse"></a>
# **modChoiceSubmitChoiceResponse**
> ModChoiceSubmitChoiceResponse200Response modChoiceSubmitChoiceResponse(modChoiceSubmitChoiceResponseRequest)

Submit responses to a specific choice item.

Submit responses to a specific choice item.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModChoiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModChoiceApi apiInstance = new ModChoiceApi(defaultClient);
    ModChoiceSubmitChoiceResponseRequest modChoiceSubmitChoiceResponseRequest = new ModChoiceSubmitChoiceResponseRequest(); // ModChoiceSubmitChoiceResponseRequest | 
    try {
      ModChoiceSubmitChoiceResponse200Response result = apiInstance.modChoiceSubmitChoiceResponse(modChoiceSubmitChoiceResponseRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModChoiceApi#modChoiceSubmitChoiceResponse");
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
| **modChoiceSubmitChoiceResponseRequest** | [**ModChoiceSubmitChoiceResponseRequest**](ModChoiceSubmitChoiceResponseRequest.md)|  | |

### Return type

[**ModChoiceSubmitChoiceResponse200Response**](ModChoiceSubmitChoiceResponse200Response.md)

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

<a id="modChoiceViewChoice"></a>
# **modChoiceViewChoice**
> CoreCalendarDeleteSubscription200Response modChoiceViewChoice(modChoiceGetChoiceOptionsRequest)

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
import com.joshuapare.moodleclient.ModChoiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModChoiceApi apiInstance = new ModChoiceApi(defaultClient);
    ModChoiceGetChoiceOptionsRequest modChoiceGetChoiceOptionsRequest = new ModChoiceGetChoiceOptionsRequest(); // ModChoiceGetChoiceOptionsRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modChoiceViewChoice(modChoiceGetChoiceOptionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModChoiceApi#modChoiceViewChoice");
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
| **modChoiceGetChoiceOptionsRequest** | [**ModChoiceGetChoiceOptionsRequest**](ModChoiceGetChoiceOptionsRequest.md)|  | |

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

