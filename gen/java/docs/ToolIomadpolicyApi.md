# ToolIomadpolicyApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**toolIomadpolicyGetIomadpolicyVersion**](ToolIomadpolicyApi.md#toolIomadpolicyGetIomadpolicyVersion) | **POST** /tool_iomadpolicy_get_iomadpolicy_version | Fetch the details of a iomadpolicy version |
| [**toolIomadpolicySubmitAcceptOnBehalf**](ToolIomadpolicyApi.md#toolIomadpolicySubmitAcceptOnBehalf) | **POST** /tool_iomadpolicy_submit_accept_on_behalf | Accept policies on behalf of other users |


<a id="toolIomadpolicyGetIomadpolicyVersion"></a>
# **toolIomadpolicyGetIomadpolicyVersion**
> ToolIomadpolicyGetIomadpolicyVersion200Response toolIomadpolicyGetIomadpolicyVersion(toolIomadpolicyGetIomadpolicyVersionRequest)

Fetch the details of a iomadpolicy version

Fetch the details of a iomadpolicy version

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolIomadpolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolIomadpolicyApi apiInstance = new ToolIomadpolicyApi(defaultClient);
    ToolIomadpolicyGetIomadpolicyVersionRequest toolIomadpolicyGetIomadpolicyVersionRequest = new ToolIomadpolicyGetIomadpolicyVersionRequest(); // ToolIomadpolicyGetIomadpolicyVersionRequest | 
    try {
      ToolIomadpolicyGetIomadpolicyVersion200Response result = apiInstance.toolIomadpolicyGetIomadpolicyVersion(toolIomadpolicyGetIomadpolicyVersionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolIomadpolicyApi#toolIomadpolicyGetIomadpolicyVersion");
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
| **toolIomadpolicyGetIomadpolicyVersionRequest** | [**ToolIomadpolicyGetIomadpolicyVersionRequest**](ToolIomadpolicyGetIomadpolicyVersionRequest.md)|  | |

### Return type

[**ToolIomadpolicyGetIomadpolicyVersion200Response**](ToolIomadpolicyGetIomadpolicyVersion200Response.md)

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

<a id="toolIomadpolicySubmitAcceptOnBehalf"></a>
# **toolIomadpolicySubmitAcceptOnBehalf**
> Object toolIomadpolicySubmitAcceptOnBehalf(toolIomadpolicySubmitAcceptOnBehalfRequest)

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
import com.joshuapare.moodleclient.ToolIomadpolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolIomadpolicyApi apiInstance = new ToolIomadpolicyApi(defaultClient);
    ToolIomadpolicySubmitAcceptOnBehalfRequest toolIomadpolicySubmitAcceptOnBehalfRequest = new ToolIomadpolicySubmitAcceptOnBehalfRequest(); // ToolIomadpolicySubmitAcceptOnBehalfRequest | 
    try {
      Object result = apiInstance.toolIomadpolicySubmitAcceptOnBehalf(toolIomadpolicySubmitAcceptOnBehalfRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolIomadpolicyApi#toolIomadpolicySubmitAcceptOnBehalf");
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
| **toolIomadpolicySubmitAcceptOnBehalfRequest** | [**ToolIomadpolicySubmitAcceptOnBehalfRequest**](ToolIomadpolicySubmitAcceptOnBehalfRequest.md)|  | |

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

