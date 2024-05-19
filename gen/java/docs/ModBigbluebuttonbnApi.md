# ModBigbluebuttonbnApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modBigbluebuttonbnCanJoin**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnCanJoin) | **POST** /mod_bigbluebuttonbn_can_join | Returns information if the current user can join or not. |
| [**modBigbluebuttonbnCompletionValidate**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnCompletionValidate) | **POST** /mod_bigbluebuttonbn_completion_validate | Validate completion |
| [**modBigbluebuttonbnEndMeeting**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnEndMeeting) | **POST** /mod_bigbluebuttonbn_end_meeting | End a meeting |
| [**modBigbluebuttonbnGetBigbluebuttonbnsByCourses**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnGetBigbluebuttonbnsByCourses) | **POST** /mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses | Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned. |
| [**modBigbluebuttonbnGetJoinUrl**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnGetJoinUrl) | **POST** /mod_bigbluebuttonbn_get_join_url | Get the join URL for the meeting and create if it does not exist. |
| [**modBigbluebuttonbnGetRecordings**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnGetRecordings) | **POST** /mod_bigbluebuttonbn_get_recordings | Returns a list of recordings ready to be processed by a datatable. |
| [**modBigbluebuttonbnGetRecordingsToImport**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnGetRecordingsToImport) | **POST** /mod_bigbluebuttonbn_get_recordings_to_import | Returns a list of recordings ready to import to be processed by a datatable. |
| [**modBigbluebuttonbnMeetingInfo**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnMeetingInfo) | **POST** /mod_bigbluebuttonbn_meeting_info | Get displayable information on the meeting |
| [**modBigbluebuttonbnUpdateRecording**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnUpdateRecording) | **POST** /mod_bigbluebuttonbn_update_recording | Update a single recording |
| [**modBigbluebuttonbnViewBigbluebuttonbn**](ModBigbluebuttonbnApi.md#modBigbluebuttonbnViewBigbluebuttonbn) | **POST** /mod_bigbluebuttonbn_view_bigbluebuttonbn | Trigger the course module viewed event and update the module completion status. |


<a id="modBigbluebuttonbnCanJoin"></a>
# **modBigbluebuttonbnCanJoin**
> ModBigbluebuttonbnCanJoin200Response modBigbluebuttonbnCanJoin(modBigbluebuttonbnCanJoinRequest)

Returns information if the current user can join or not.

Returns information if the current user can join or not.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModBigbluebuttonbnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModBigbluebuttonbnApi apiInstance = new ModBigbluebuttonbnApi(defaultClient);
    ModBigbluebuttonbnCanJoinRequest modBigbluebuttonbnCanJoinRequest = new ModBigbluebuttonbnCanJoinRequest(); // ModBigbluebuttonbnCanJoinRequest | 
    try {
      ModBigbluebuttonbnCanJoin200Response result = apiInstance.modBigbluebuttonbnCanJoin(modBigbluebuttonbnCanJoinRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModBigbluebuttonbnApi#modBigbluebuttonbnCanJoin");
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
| **modBigbluebuttonbnCanJoinRequest** | [**ModBigbluebuttonbnCanJoinRequest**](ModBigbluebuttonbnCanJoinRequest.md)|  | |

### Return type

[**ModBigbluebuttonbnCanJoin200Response**](ModBigbluebuttonbnCanJoin200Response.md)

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

<a id="modBigbluebuttonbnCompletionValidate"></a>
# **modBigbluebuttonbnCompletionValidate**
> CoreCohortAddCohortMembers200Response modBigbluebuttonbnCompletionValidate(modBigbluebuttonbnCompletionValidateRequest)

Validate completion

Validate completion

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModBigbluebuttonbnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModBigbluebuttonbnApi apiInstance = new ModBigbluebuttonbnApi(defaultClient);
    ModBigbluebuttonbnCompletionValidateRequest modBigbluebuttonbnCompletionValidateRequest = new ModBigbluebuttonbnCompletionValidateRequest(); // ModBigbluebuttonbnCompletionValidateRequest | 
    try {
      CoreCohortAddCohortMembers200Response result = apiInstance.modBigbluebuttonbnCompletionValidate(modBigbluebuttonbnCompletionValidateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModBigbluebuttonbnApi#modBigbluebuttonbnCompletionValidate");
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
| **modBigbluebuttonbnCompletionValidateRequest** | [**ModBigbluebuttonbnCompletionValidateRequest**](ModBigbluebuttonbnCompletionValidateRequest.md)|  | |

### Return type

[**CoreCohortAddCohortMembers200Response**](CoreCohortAddCohortMembers200Response.md)

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

<a id="modBigbluebuttonbnEndMeeting"></a>
# **modBigbluebuttonbnEndMeeting**
> CoreCohortAddCohortMembers200Response modBigbluebuttonbnEndMeeting(modBigbluebuttonbnEndMeetingRequest)

End a meeting

End a meeting

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModBigbluebuttonbnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModBigbluebuttonbnApi apiInstance = new ModBigbluebuttonbnApi(defaultClient);
    ModBigbluebuttonbnEndMeetingRequest modBigbluebuttonbnEndMeetingRequest = new ModBigbluebuttonbnEndMeetingRequest(); // ModBigbluebuttonbnEndMeetingRequest | 
    try {
      CoreCohortAddCohortMembers200Response result = apiInstance.modBigbluebuttonbnEndMeeting(modBigbluebuttonbnEndMeetingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModBigbluebuttonbnApi#modBigbluebuttonbnEndMeeting");
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
| **modBigbluebuttonbnEndMeetingRequest** | [**ModBigbluebuttonbnEndMeetingRequest**](ModBigbluebuttonbnEndMeetingRequest.md)|  | |

### Return type

[**CoreCohortAddCohortMembers200Response**](CoreCohortAddCohortMembers200Response.md)

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

<a id="modBigbluebuttonbnGetBigbluebuttonbnsByCourses"></a>
# **modBigbluebuttonbnGetBigbluebuttonbnsByCourses**
> ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response modBigbluebuttonbnGetBigbluebuttonbnsByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest)

Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.

Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModBigbluebuttonbnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModBigbluebuttonbnApi apiInstance = new ModBigbluebuttonbnApi(defaultClient);
    ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = new ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(); // ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 
    try {
      ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response result = apiInstance.modBigbluebuttonbnGetBigbluebuttonbnsByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModBigbluebuttonbnApi#modBigbluebuttonbnGetBigbluebuttonbnsByCourses");
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
| **modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md)|  | |

### Return type

[**ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response**](ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response.md)

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

<a id="modBigbluebuttonbnGetJoinUrl"></a>
# **modBigbluebuttonbnGetJoinUrl**
> ModBigbluebuttonbnGetJoinUrl200Response modBigbluebuttonbnGetJoinUrl(modBigbluebuttonbnCanJoinRequest)

Get the join URL for the meeting and create if it does not exist.

Get the join URL for the meeting and create if it does not exist.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModBigbluebuttonbnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModBigbluebuttonbnApi apiInstance = new ModBigbluebuttonbnApi(defaultClient);
    ModBigbluebuttonbnCanJoinRequest modBigbluebuttonbnCanJoinRequest = new ModBigbluebuttonbnCanJoinRequest(); // ModBigbluebuttonbnCanJoinRequest | 
    try {
      ModBigbluebuttonbnGetJoinUrl200Response result = apiInstance.modBigbluebuttonbnGetJoinUrl(modBigbluebuttonbnCanJoinRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModBigbluebuttonbnApi#modBigbluebuttonbnGetJoinUrl");
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
| **modBigbluebuttonbnCanJoinRequest** | [**ModBigbluebuttonbnCanJoinRequest**](ModBigbluebuttonbnCanJoinRequest.md)|  | |

### Return type

[**ModBigbluebuttonbnGetJoinUrl200Response**](ModBigbluebuttonbnGetJoinUrl200Response.md)

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

<a id="modBigbluebuttonbnGetRecordings"></a>
# **modBigbluebuttonbnGetRecordings**
> ModBigbluebuttonbnGetRecordings200Response modBigbluebuttonbnGetRecordings(modBigbluebuttonbnGetRecordingsRequest)

Returns a list of recordings ready to be processed by a datatable.

Returns a list of recordings ready to be processed by a datatable.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModBigbluebuttonbnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModBigbluebuttonbnApi apiInstance = new ModBigbluebuttonbnApi(defaultClient);
    ModBigbluebuttonbnGetRecordingsRequest modBigbluebuttonbnGetRecordingsRequest = new ModBigbluebuttonbnGetRecordingsRequest(); // ModBigbluebuttonbnGetRecordingsRequest | 
    try {
      ModBigbluebuttonbnGetRecordings200Response result = apiInstance.modBigbluebuttonbnGetRecordings(modBigbluebuttonbnGetRecordingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModBigbluebuttonbnApi#modBigbluebuttonbnGetRecordings");
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
| **modBigbluebuttonbnGetRecordingsRequest** | [**ModBigbluebuttonbnGetRecordingsRequest**](ModBigbluebuttonbnGetRecordingsRequest.md)|  | |

### Return type

[**ModBigbluebuttonbnGetRecordings200Response**](ModBigbluebuttonbnGetRecordings200Response.md)

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

<a id="modBigbluebuttonbnGetRecordingsToImport"></a>
# **modBigbluebuttonbnGetRecordingsToImport**
> ModBigbluebuttonbnGetRecordingsToImport200Response modBigbluebuttonbnGetRecordingsToImport(modBigbluebuttonbnGetRecordingsToImportRequest)

Returns a list of recordings ready to import to be processed by a datatable.

Returns a list of recordings ready to import to be processed by a datatable.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModBigbluebuttonbnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModBigbluebuttonbnApi apiInstance = new ModBigbluebuttonbnApi(defaultClient);
    ModBigbluebuttonbnGetRecordingsToImportRequest modBigbluebuttonbnGetRecordingsToImportRequest = new ModBigbluebuttonbnGetRecordingsToImportRequest(); // ModBigbluebuttonbnGetRecordingsToImportRequest | 
    try {
      ModBigbluebuttonbnGetRecordingsToImport200Response result = apiInstance.modBigbluebuttonbnGetRecordingsToImport(modBigbluebuttonbnGetRecordingsToImportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModBigbluebuttonbnApi#modBigbluebuttonbnGetRecordingsToImport");
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
| **modBigbluebuttonbnGetRecordingsToImportRequest** | [**ModBigbluebuttonbnGetRecordingsToImportRequest**](ModBigbluebuttonbnGetRecordingsToImportRequest.md)|  | |

### Return type

[**ModBigbluebuttonbnGetRecordingsToImport200Response**](ModBigbluebuttonbnGetRecordingsToImport200Response.md)

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

<a id="modBigbluebuttonbnMeetingInfo"></a>
# **modBigbluebuttonbnMeetingInfo**
> ModBigbluebuttonbnMeetingInfo200Response modBigbluebuttonbnMeetingInfo(modBigbluebuttonbnMeetingInfoRequest)

Get displayable information on the meeting

Get displayable information on the meeting

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModBigbluebuttonbnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModBigbluebuttonbnApi apiInstance = new ModBigbluebuttonbnApi(defaultClient);
    ModBigbluebuttonbnMeetingInfoRequest modBigbluebuttonbnMeetingInfoRequest = new ModBigbluebuttonbnMeetingInfoRequest(); // ModBigbluebuttonbnMeetingInfoRequest | 
    try {
      ModBigbluebuttonbnMeetingInfo200Response result = apiInstance.modBigbluebuttonbnMeetingInfo(modBigbluebuttonbnMeetingInfoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModBigbluebuttonbnApi#modBigbluebuttonbnMeetingInfo");
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
| **modBigbluebuttonbnMeetingInfoRequest** | [**ModBigbluebuttonbnMeetingInfoRequest**](ModBigbluebuttonbnMeetingInfoRequest.md)|  | |

### Return type

[**ModBigbluebuttonbnMeetingInfo200Response**](ModBigbluebuttonbnMeetingInfo200Response.md)

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

<a id="modBigbluebuttonbnUpdateRecording"></a>
# **modBigbluebuttonbnUpdateRecording**
> Object modBigbluebuttonbnUpdateRecording(modBigbluebuttonbnUpdateRecordingRequest)

Update a single recording

Update a single recording

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModBigbluebuttonbnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModBigbluebuttonbnApi apiInstance = new ModBigbluebuttonbnApi(defaultClient);
    ModBigbluebuttonbnUpdateRecordingRequest modBigbluebuttonbnUpdateRecordingRequest = new ModBigbluebuttonbnUpdateRecordingRequest(); // ModBigbluebuttonbnUpdateRecordingRequest | 
    try {
      Object result = apiInstance.modBigbluebuttonbnUpdateRecording(modBigbluebuttonbnUpdateRecordingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModBigbluebuttonbnApi#modBigbluebuttonbnUpdateRecording");
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
| **modBigbluebuttonbnUpdateRecordingRequest** | [**ModBigbluebuttonbnUpdateRecordingRequest**](ModBigbluebuttonbnUpdateRecordingRequest.md)|  | |

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

<a id="modBigbluebuttonbnViewBigbluebuttonbn"></a>
# **modBigbluebuttonbnViewBigbluebuttonbn**
> CoreCalendarDeleteSubscription200Response modBigbluebuttonbnViewBigbluebuttonbn(modBigbluebuttonbnViewBigbluebuttonbnRequest)

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
import com.joshuapare.moodleclient.ModBigbluebuttonbnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModBigbluebuttonbnApi apiInstance = new ModBigbluebuttonbnApi(defaultClient);
    ModBigbluebuttonbnViewBigbluebuttonbnRequest modBigbluebuttonbnViewBigbluebuttonbnRequest = new ModBigbluebuttonbnViewBigbluebuttonbnRequest(); // ModBigbluebuttonbnViewBigbluebuttonbnRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modBigbluebuttonbnViewBigbluebuttonbn(modBigbluebuttonbnViewBigbluebuttonbnRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModBigbluebuttonbnApi#modBigbluebuttonbnViewBigbluebuttonbn");
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
| **modBigbluebuttonbnViewBigbluebuttonbnRequest** | [**ModBigbluebuttonbnViewBigbluebuttonbnRequest**](ModBigbluebuttonbnViewBigbluebuttonbnRequest.md)|  | |

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

