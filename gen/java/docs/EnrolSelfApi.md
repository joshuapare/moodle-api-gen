# EnrolSelfApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**enrolSelfEnrolUser**](EnrolSelfApi.md#enrolSelfEnrolUser) | **POST** /enrol_self_enrol_user | Self enrol the current user in the given course. |
| [**enrolSelfGetInstanceInfo**](EnrolSelfApi.md#enrolSelfGetInstanceInfo) | **POST** /enrol_self_get_instance_info | self enrolment instance information. |


<a id="enrolSelfEnrolUser"></a>
# **enrolSelfEnrolUser**
> EnrolSelfEnrolUser200Response enrolSelfEnrolUser(enrolSelfEnrolUserRequest)

Self enrol the current user in the given course.

Self enrol the current user in the given course.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.EnrolSelfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    EnrolSelfApi apiInstance = new EnrolSelfApi(defaultClient);
    EnrolSelfEnrolUserRequest enrolSelfEnrolUserRequest = new EnrolSelfEnrolUserRequest(); // EnrolSelfEnrolUserRequest | 
    try {
      EnrolSelfEnrolUser200Response result = apiInstance.enrolSelfEnrolUser(enrolSelfEnrolUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrolSelfApi#enrolSelfEnrolUser");
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
| **enrolSelfEnrolUserRequest** | [**EnrolSelfEnrolUserRequest**](EnrolSelfEnrolUserRequest.md)|  | |

### Return type

[**EnrolSelfEnrolUser200Response**](EnrolSelfEnrolUser200Response.md)

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

<a id="enrolSelfGetInstanceInfo"></a>
# **enrolSelfGetInstanceInfo**
> EnrolSelfGetInstanceInfo200Response enrolSelfGetInstanceInfo(enrolSelfGetInstanceInfoRequest)

self enrolment instance information.

self enrolment instance information.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.EnrolSelfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    EnrolSelfApi apiInstance = new EnrolSelfApi(defaultClient);
    EnrolSelfGetInstanceInfoRequest enrolSelfGetInstanceInfoRequest = new EnrolSelfGetInstanceInfoRequest(); // EnrolSelfGetInstanceInfoRequest | 
    try {
      EnrolSelfGetInstanceInfo200Response result = apiInstance.enrolSelfGetInstanceInfo(enrolSelfGetInstanceInfoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrolSelfApi#enrolSelfGetInstanceInfo");
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
| **enrolSelfGetInstanceInfoRequest** | [**EnrolSelfGetInstanceInfoRequest**](EnrolSelfGetInstanceInfoRequest.md)|  | |

### Return type

[**EnrolSelfGetInstanceInfo200Response**](EnrolSelfGetInstanceInfo200Response.md)

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

