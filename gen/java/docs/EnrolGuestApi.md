# EnrolGuestApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**enrolGuestGetInstanceInfo**](EnrolGuestApi.md#enrolGuestGetInstanceInfo) | **POST** /enrol_guest_get_instance_info | Return guest enrolment instance information. |
| [**enrolGuestValidatePassword**](EnrolGuestApi.md#enrolGuestValidatePassword) | **POST** /enrol_guest_validate_password | Perform password validation. |


<a id="enrolGuestGetInstanceInfo"></a>
# **enrolGuestGetInstanceInfo**
> EnrolGuestGetInstanceInfo200Response enrolGuestGetInstanceInfo(enrolGuestGetInstanceInfoRequest)

Return guest enrolment instance information.

Return guest enrolment instance information.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.EnrolGuestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    EnrolGuestApi apiInstance = new EnrolGuestApi(defaultClient);
    EnrolGuestGetInstanceInfoRequest enrolGuestGetInstanceInfoRequest = new EnrolGuestGetInstanceInfoRequest(); // EnrolGuestGetInstanceInfoRequest | 
    try {
      EnrolGuestGetInstanceInfo200Response result = apiInstance.enrolGuestGetInstanceInfo(enrolGuestGetInstanceInfoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrolGuestApi#enrolGuestGetInstanceInfo");
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
| **enrolGuestGetInstanceInfoRequest** | [**EnrolGuestGetInstanceInfoRequest**](EnrolGuestGetInstanceInfoRequest.md)|  | |

### Return type

[**EnrolGuestGetInstanceInfo200Response**](EnrolGuestGetInstanceInfo200Response.md)

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

<a id="enrolGuestValidatePassword"></a>
# **enrolGuestValidatePassword**
> EnrolGuestValidatePassword200Response enrolGuestValidatePassword(enrolGuestValidatePasswordRequest)

Perform password validation.

Perform password validation.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.EnrolGuestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    EnrolGuestApi apiInstance = new EnrolGuestApi(defaultClient);
    EnrolGuestValidatePasswordRequest enrolGuestValidatePasswordRequest = new EnrolGuestValidatePasswordRequest(); // EnrolGuestValidatePasswordRequest | 
    try {
      EnrolGuestValidatePassword200Response result = apiInstance.enrolGuestValidatePassword(enrolGuestValidatePasswordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrolGuestApi#enrolGuestValidatePassword");
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
| **enrolGuestValidatePasswordRequest** | [**EnrolGuestValidatePasswordRequest**](EnrolGuestValidatePasswordRequest.md)|  | |

### Return type

[**EnrolGuestValidatePassword200Response**](EnrolGuestValidatePassword200Response.md)

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

