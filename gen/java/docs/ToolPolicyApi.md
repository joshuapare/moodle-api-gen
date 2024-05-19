# ToolPolicyApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**toolPolicyGetPolicyVersion**](ToolPolicyApi.md#toolPolicyGetPolicyVersion) | **POST** /tool_policy_get_policy_version | Fetch the details of a policy version |
| [**toolPolicySubmitAcceptOnBehalf**](ToolPolicyApi.md#toolPolicySubmitAcceptOnBehalf) | **POST** /tool_policy_submit_accept_on_behalf | Accept policies on behalf of other users |


<a id="toolPolicyGetPolicyVersion"></a>
# **toolPolicyGetPolicyVersion**
> ToolPolicyGetPolicyVersion200Response toolPolicyGetPolicyVersion(toolPolicyGetPolicyVersionRequest)

Fetch the details of a policy version

Fetch the details of a policy version

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolPolicyApi apiInstance = new ToolPolicyApi(defaultClient);
    ToolPolicyGetPolicyVersionRequest toolPolicyGetPolicyVersionRequest = new ToolPolicyGetPolicyVersionRequest(); // ToolPolicyGetPolicyVersionRequest | 
    try {
      ToolPolicyGetPolicyVersion200Response result = apiInstance.toolPolicyGetPolicyVersion(toolPolicyGetPolicyVersionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolPolicyApi#toolPolicyGetPolicyVersion");
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
| **toolPolicyGetPolicyVersionRequest** | [**ToolPolicyGetPolicyVersionRequest**](ToolPolicyGetPolicyVersionRequest.md)|  | |

### Return type

[**ToolPolicyGetPolicyVersion200Response**](ToolPolicyGetPolicyVersion200Response.md)

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

<a id="toolPolicySubmitAcceptOnBehalf"></a>
# **toolPolicySubmitAcceptOnBehalf**
> Object toolPolicySubmitAcceptOnBehalf(toolPolicySubmitAcceptOnBehalfRequest)

Accept policies on behalf of other users

Accept policies on behalf of other users

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolPolicyApi apiInstance = new ToolPolicyApi(defaultClient);
    ToolPolicySubmitAcceptOnBehalfRequest toolPolicySubmitAcceptOnBehalfRequest = new ToolPolicySubmitAcceptOnBehalfRequest(); // ToolPolicySubmitAcceptOnBehalfRequest | 
    try {
      Object result = apiInstance.toolPolicySubmitAcceptOnBehalf(toolPolicySubmitAcceptOnBehalfRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolPolicyApi#toolPolicySubmitAcceptOnBehalf");
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
| **toolPolicySubmitAcceptOnBehalfRequest** | [**ToolPolicySubmitAcceptOnBehalfRequest**](ToolPolicySubmitAcceptOnBehalfRequest.md)|  | |

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
| **200** | success |  -  |
| **400** | Invalid parameter value detected |  -  |

