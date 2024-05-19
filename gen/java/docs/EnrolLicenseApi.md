# EnrolLicenseApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**enrolLicenseEnrolUser**](EnrolLicenseApi.md#enrolLicenseEnrolUser) | **POST** /enrol_license_enrol_user | License enrol the current user in the given course. |
| [**enrolLicenseGetInstanceInfo**](EnrolLicenseApi.md#enrolLicenseGetInstanceInfo) | **POST** /enrol_license_get_instance_info | License enrolment instance information. |


<a id="enrolLicenseEnrolUser"></a>
# **enrolLicenseEnrolUser**
> EnrolLicenseEnrolUser200Response enrolLicenseEnrolUser(enrolLicenseEnrolUserRequest)

License enrol the current user in the given course.

License enrol the current user in the given course.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.EnrolLicenseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    EnrolLicenseApi apiInstance = new EnrolLicenseApi(defaultClient);
    EnrolLicenseEnrolUserRequest enrolLicenseEnrolUserRequest = new EnrolLicenseEnrolUserRequest(); // EnrolLicenseEnrolUserRequest | 
    try {
      EnrolLicenseEnrolUser200Response result = apiInstance.enrolLicenseEnrolUser(enrolLicenseEnrolUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrolLicenseApi#enrolLicenseEnrolUser");
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
| **enrolLicenseEnrolUserRequest** | [**EnrolLicenseEnrolUserRequest**](EnrolLicenseEnrolUserRequest.md)|  | |

### Return type

[**EnrolLicenseEnrolUser200Response**](EnrolLicenseEnrolUser200Response.md)

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

<a id="enrolLicenseGetInstanceInfo"></a>
# **enrolLicenseGetInstanceInfo**
> EnrolLicenseGetInstanceInfo200Response enrolLicenseGetInstanceInfo(enrolLicenseGetInstanceInfoRequest)

License enrolment instance information.

License enrolment instance information.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.EnrolLicenseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    EnrolLicenseApi apiInstance = new EnrolLicenseApi(defaultClient);
    EnrolLicenseGetInstanceInfoRequest enrolLicenseGetInstanceInfoRequest = new EnrolLicenseGetInstanceInfoRequest(); // EnrolLicenseGetInstanceInfoRequest | 
    try {
      EnrolLicenseGetInstanceInfo200Response result = apiInstance.enrolLicenseGetInstanceInfo(enrolLicenseGetInstanceInfoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrolLicenseApi#enrolLicenseGetInstanceInfo");
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
| **enrolLicenseGetInstanceInfoRequest** | [**EnrolLicenseGetInstanceInfoRequest**](EnrolLicenseGetInstanceInfoRequest.md)|  | |

### Return type

[**EnrolLicenseGetInstanceInfo200Response**](EnrolLicenseGetInstanceInfo200Response.md)

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

