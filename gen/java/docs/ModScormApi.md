# ModScormApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modScormGetScormAccessInformation**](ModScormApi.md#modScormGetScormAccessInformation) | **POST** /mod_scorm_get_scorm_access_information | Return capabilities information for a given scorm. |
| [**modScormGetScormAttemptCount**](ModScormApi.md#modScormGetScormAttemptCount) | **POST** /mod_scorm_get_scorm_attempt_count | Return the number of attempts done by a user in the given SCORM. |
| [**modScormGetScormScoTracks**](ModScormApi.md#modScormGetScormScoTracks) | **POST** /mod_scorm_get_scorm_sco_tracks | Retrieves SCO tracking data for the given user id and attempt number |
| [**modScormGetScormScoes**](ModScormApi.md#modScormGetScormScoes) | **POST** /mod_scorm_get_scorm_scoes | Returns a list containing all the scoes data related to the given scorm id |
| [**modScormGetScormUserData**](ModScormApi.md#modScormGetScormUserData) | **POST** /mod_scorm_get_scorm_user_data | Retrieves user tracking and SCO data and default SCORM values |
| [**modScormGetScormsByCourses**](ModScormApi.md#modScormGetScormsByCourses) | **POST** /mod_scorm_get_scorms_by_courses | Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned. |
| [**modScormInsertScormTracks**](ModScormApi.md#modScormInsertScormTracks) | **POST** /mod_scorm_insert_scorm_tracks | Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data. |
| [**modScormLaunchSco**](ModScormApi.md#modScormLaunchSco) | **POST** /mod_scorm_launch_sco | Trigger the SCO launched event. |
| [**modScormViewScorm**](ModScormApi.md#modScormViewScorm) | **POST** /mod_scorm_view_scorm | Trigger the course module viewed event. |


<a id="modScormGetScormAccessInformation"></a>
# **modScormGetScormAccessInformation**
> ModScormGetScormAccessInformation200Response modScormGetScormAccessInformation(modScormGetScormAccessInformationRequest)

Return capabilities information for a given scorm.

Return capabilities information for a given scorm.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModScormApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModScormApi apiInstance = new ModScormApi(defaultClient);
    ModScormGetScormAccessInformationRequest modScormGetScormAccessInformationRequest = new ModScormGetScormAccessInformationRequest(); // ModScormGetScormAccessInformationRequest | 
    try {
      ModScormGetScormAccessInformation200Response result = apiInstance.modScormGetScormAccessInformation(modScormGetScormAccessInformationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModScormApi#modScormGetScormAccessInformation");
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
| **modScormGetScormAccessInformationRequest** | [**ModScormGetScormAccessInformationRequest**](ModScormGetScormAccessInformationRequest.md)|  | |

### Return type

[**ModScormGetScormAccessInformation200Response**](ModScormGetScormAccessInformation200Response.md)

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

<a id="modScormGetScormAttemptCount"></a>
# **modScormGetScormAttemptCount**
> ModScormGetScormAttemptCount200Response modScormGetScormAttemptCount(modScormGetScormAttemptCountRequest)

Return the number of attempts done by a user in the given SCORM.

Return the number of attempts done by a user in the given SCORM.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModScormApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModScormApi apiInstance = new ModScormApi(defaultClient);
    ModScormGetScormAttemptCountRequest modScormGetScormAttemptCountRequest = new ModScormGetScormAttemptCountRequest(); // ModScormGetScormAttemptCountRequest | 
    try {
      ModScormGetScormAttemptCount200Response result = apiInstance.modScormGetScormAttemptCount(modScormGetScormAttemptCountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModScormApi#modScormGetScormAttemptCount");
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
| **modScormGetScormAttemptCountRequest** | [**ModScormGetScormAttemptCountRequest**](ModScormGetScormAttemptCountRequest.md)|  | |

### Return type

[**ModScormGetScormAttemptCount200Response**](ModScormGetScormAttemptCount200Response.md)

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

<a id="modScormGetScormScoTracks"></a>
# **modScormGetScormScoTracks**
> ModScormGetScormScoTracks200Response modScormGetScormScoTracks(modScormGetScormScoTracksRequest)

Retrieves SCO tracking data for the given user id and attempt number

Retrieves SCO tracking data for the given user id and attempt number

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModScormApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModScormApi apiInstance = new ModScormApi(defaultClient);
    ModScormGetScormScoTracksRequest modScormGetScormScoTracksRequest = new ModScormGetScormScoTracksRequest(); // ModScormGetScormScoTracksRequest | 
    try {
      ModScormGetScormScoTracks200Response result = apiInstance.modScormGetScormScoTracks(modScormGetScormScoTracksRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModScormApi#modScormGetScormScoTracks");
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
| **modScormGetScormScoTracksRequest** | [**ModScormGetScormScoTracksRequest**](ModScormGetScormScoTracksRequest.md)|  | |

### Return type

[**ModScormGetScormScoTracks200Response**](ModScormGetScormScoTracks200Response.md)

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

<a id="modScormGetScormScoes"></a>
# **modScormGetScormScoes**
> ModScormGetScormScoes200Response modScormGetScormScoes(modScormGetScormScoesRequest)

Returns a list containing all the scoes data related to the given scorm id

Returns a list containing all the scoes data related to the given scorm id

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModScormApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModScormApi apiInstance = new ModScormApi(defaultClient);
    ModScormGetScormScoesRequest modScormGetScormScoesRequest = new ModScormGetScormScoesRequest(); // ModScormGetScormScoesRequest | 
    try {
      ModScormGetScormScoes200Response result = apiInstance.modScormGetScormScoes(modScormGetScormScoesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModScormApi#modScormGetScormScoes");
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
| **modScormGetScormScoesRequest** | [**ModScormGetScormScoesRequest**](ModScormGetScormScoesRequest.md)|  | |

### Return type

[**ModScormGetScormScoes200Response**](ModScormGetScormScoes200Response.md)

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

<a id="modScormGetScormUserData"></a>
# **modScormGetScormUserData**
> ModScormGetScormUserData200Response modScormGetScormUserData(modScormGetScormUserDataRequest)

Retrieves user tracking and SCO data and default SCORM values

Retrieves user tracking and SCO data and default SCORM values

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModScormApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModScormApi apiInstance = new ModScormApi(defaultClient);
    ModScormGetScormUserDataRequest modScormGetScormUserDataRequest = new ModScormGetScormUserDataRequest(); // ModScormGetScormUserDataRequest | 
    try {
      ModScormGetScormUserData200Response result = apiInstance.modScormGetScormUserData(modScormGetScormUserDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModScormApi#modScormGetScormUserData");
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
| **modScormGetScormUserDataRequest** | [**ModScormGetScormUserDataRequest**](ModScormGetScormUserDataRequest.md)|  | |

### Return type

[**ModScormGetScormUserData200Response**](ModScormGetScormUserData200Response.md)

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

<a id="modScormGetScormsByCourses"></a>
# **modScormGetScormsByCourses**
> ModScormGetScormsByCourses200Response modScormGetScormsByCourses(modChatGetChatsByCoursesRequest)

Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.

Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModScormApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModScormApi apiInstance = new ModScormApi(defaultClient);
    ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest = new ModChatGetChatsByCoursesRequest(); // ModChatGetChatsByCoursesRequest | 
    try {
      ModScormGetScormsByCourses200Response result = apiInstance.modScormGetScormsByCourses(modChatGetChatsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModScormApi#modScormGetScormsByCourses");
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

[**ModScormGetScormsByCourses200Response**](ModScormGetScormsByCourses200Response.md)

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

<a id="modScormInsertScormTracks"></a>
# **modScormInsertScormTracks**
> ModScormInsertScormTracks200Response modScormInsertScormTracks(modScormInsertScormTracksRequest)

Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.

Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModScormApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModScormApi apiInstance = new ModScormApi(defaultClient);
    ModScormInsertScormTracksRequest modScormInsertScormTracksRequest = new ModScormInsertScormTracksRequest(); // ModScormInsertScormTracksRequest | 
    try {
      ModScormInsertScormTracks200Response result = apiInstance.modScormInsertScormTracks(modScormInsertScormTracksRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModScormApi#modScormInsertScormTracks");
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
| **modScormInsertScormTracksRequest** | [**ModScormInsertScormTracksRequest**](ModScormInsertScormTracksRequest.md)|  | |

### Return type

[**ModScormInsertScormTracks200Response**](ModScormInsertScormTracks200Response.md)

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

<a id="modScormLaunchSco"></a>
# **modScormLaunchSco**
> CoreCalendarDeleteSubscription200Response modScormLaunchSco(modScormLaunchScoRequest)

Trigger the SCO launched event.

Trigger the SCO launched event.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModScormApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModScormApi apiInstance = new ModScormApi(defaultClient);
    ModScormLaunchScoRequest modScormLaunchScoRequest = new ModScormLaunchScoRequest(); // ModScormLaunchScoRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modScormLaunchSco(modScormLaunchScoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModScormApi#modScormLaunchSco");
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
| **modScormLaunchScoRequest** | [**ModScormLaunchScoRequest**](ModScormLaunchScoRequest.md)|  | |

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

<a id="modScormViewScorm"></a>
# **modScormViewScorm**
> CoreCalendarDeleteSubscription200Response modScormViewScorm(modScormViewScormRequest)

Trigger the course module viewed event.

Trigger the course module viewed event.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModScormApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModScormApi apiInstance = new ModScormApi(defaultClient);
    ModScormViewScormRequest modScormViewScormRequest = new ModScormViewScormRequest(); // ModScormViewScormRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modScormViewScorm(modScormViewScormRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModScormApi#modScormViewScorm");
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
| **modScormViewScormRequest** | [**ModScormViewScormRequest**](ModScormViewScormRequest.md)|  | |

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

