# BlockAccessreviewApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**blockAccessreviewGetModuleData**](BlockAccessreviewApi.md#blockAccessreviewGetModuleData) | **POST** /block_accessreview_get_module_data | Gets error data for course modules. |
| [**blockAccessreviewGetSectionData**](BlockAccessreviewApi.md#blockAccessreviewGetSectionData) | **POST** /block_accessreview_get_section_data | Gets error data for course sections. |


<a id="blockAccessreviewGetModuleData"></a>
# **blockAccessreviewGetModuleData**
> Object blockAccessreviewGetModuleData(blockAccessreviewGetModuleDataRequest)

Gets error data for course modules.

Gets error data for course modules.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockAccessreviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockAccessreviewApi apiInstance = new BlockAccessreviewApi(defaultClient);
    BlockAccessreviewGetModuleDataRequest blockAccessreviewGetModuleDataRequest = new BlockAccessreviewGetModuleDataRequest(); // BlockAccessreviewGetModuleDataRequest | 
    try {
      Object result = apiInstance.blockAccessreviewGetModuleData(blockAccessreviewGetModuleDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockAccessreviewApi#blockAccessreviewGetModuleData");
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
| **blockAccessreviewGetModuleDataRequest** | [**BlockAccessreviewGetModuleDataRequest**](BlockAccessreviewGetModuleDataRequest.md)|  | |

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

<a id="blockAccessreviewGetSectionData"></a>
# **blockAccessreviewGetSectionData**
> Object blockAccessreviewGetSectionData(blockAccessreviewGetSectionDataRequest)

Gets error data for course sections.

Gets error data for course sections.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockAccessreviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockAccessreviewApi apiInstance = new BlockAccessreviewApi(defaultClient);
    BlockAccessreviewGetSectionDataRequest blockAccessreviewGetSectionDataRequest = new BlockAccessreviewGetSectionDataRequest(); // BlockAccessreviewGetSectionDataRequest | 
    try {
      Object result = apiInstance.blockAccessreviewGetSectionData(blockAccessreviewGetSectionDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockAccessreviewApi#blockAccessreviewGetSectionData");
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
| **blockAccessreviewGetSectionDataRequest** | [**BlockAccessreviewGetSectionDataRequest**](BlockAccessreviewGetSectionDataRequest.md)|  | |

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

