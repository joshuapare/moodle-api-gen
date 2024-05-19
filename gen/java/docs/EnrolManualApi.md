# EnrolManualApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**enrolManualEnrolUsers**](EnrolManualApi.md#enrolManualEnrolUsers) | **POST** /enrol_manual_enrol_users | Manual enrol users |
| [**enrolManualUnenrolUsers**](EnrolManualApi.md#enrolManualUnenrolUsers) | **POST** /enrol_manual_unenrol_users | Manual unenrol users |


<a id="enrolManualEnrolUsers"></a>
# **enrolManualEnrolUsers**
> Object enrolManualEnrolUsers(enrolManualEnrolUsersRequest)

Manual enrol users

Manual enrol users

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.EnrolManualApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    EnrolManualApi apiInstance = new EnrolManualApi(defaultClient);
    EnrolManualEnrolUsersRequest enrolManualEnrolUsersRequest = new EnrolManualEnrolUsersRequest(); // EnrolManualEnrolUsersRequest | 
    try {
      Object result = apiInstance.enrolManualEnrolUsers(enrolManualEnrolUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrolManualApi#enrolManualEnrolUsers");
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
| **enrolManualEnrolUsersRequest** | [**EnrolManualEnrolUsersRequest**](EnrolManualEnrolUsersRequest.md)|  | |

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

<a id="enrolManualUnenrolUsers"></a>
# **enrolManualUnenrolUsers**
> Object enrolManualUnenrolUsers(enrolManualUnenrolUsersRequest)

Manual unenrol users

Manual unenrol users

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.EnrolManualApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    EnrolManualApi apiInstance = new EnrolManualApi(defaultClient);
    EnrolManualUnenrolUsersRequest enrolManualUnenrolUsersRequest = new EnrolManualUnenrolUsersRequest(); // EnrolManualUnenrolUsersRequest | 
    try {
      Object result = apiInstance.enrolManualUnenrolUsers(enrolManualUnenrolUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrolManualApi#enrolManualUnenrolUsers");
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
| **enrolManualUnenrolUsersRequest** | [**EnrolManualUnenrolUsersRequest**](EnrolManualUnenrolUsersRequest.md)|  | |

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

