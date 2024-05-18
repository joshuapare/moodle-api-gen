# EnrolMetaApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**enrolMetaAddInstances**](EnrolMetaApi.md#enrolMetaAddInstances) | **POST** /enrol_meta_add_instances | Add meta enrolment instances |
| [**enrolMetaDeleteInstances**](EnrolMetaApi.md#enrolMetaDeleteInstances) | **POST** /enrol_meta_delete_instances | Delete meta enrolment instances |


<a id="enrolMetaAddInstances"></a>
# **enrolMetaAddInstances**
> Object enrolMetaAddInstances(enrolMetaAddInstancesRequest)

Add meta enrolment instances

Add meta enrolment instances

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.EnrolMetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    EnrolMetaApi apiInstance = new EnrolMetaApi(defaultClient);
    EnrolMetaAddInstancesRequest enrolMetaAddInstancesRequest = new EnrolMetaAddInstancesRequest(); // EnrolMetaAddInstancesRequest | 
    try {
      Object result = apiInstance.enrolMetaAddInstances(enrolMetaAddInstancesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrolMetaApi#enrolMetaAddInstances");
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
| **enrolMetaAddInstancesRequest** | [**EnrolMetaAddInstancesRequest**](EnrolMetaAddInstancesRequest.md)|  | |

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
| **200** | List of course meta enrolment instances that were created. |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="enrolMetaDeleteInstances"></a>
# **enrolMetaDeleteInstances**
> Object enrolMetaDeleteInstances(enrolMetaDeleteInstancesRequest)

Delete meta enrolment instances

Delete meta enrolment instances

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.EnrolMetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    EnrolMetaApi apiInstance = new EnrolMetaApi(defaultClient);
    EnrolMetaDeleteInstancesRequest enrolMetaDeleteInstancesRequest = new EnrolMetaDeleteInstancesRequest(); // EnrolMetaDeleteInstancesRequest | 
    try {
      Object result = apiInstance.enrolMetaDeleteInstances(enrolMetaDeleteInstancesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrolMetaApi#enrolMetaDeleteInstances");
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
| **enrolMetaDeleteInstancesRequest** | [**EnrolMetaDeleteInstancesRequest**](EnrolMetaDeleteInstancesRequest.md)|  | |

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
| **200** | List of course meta enrolment instances that were deleted. |  -  |
| **400** | Invalid parameter value detected |  -  |

