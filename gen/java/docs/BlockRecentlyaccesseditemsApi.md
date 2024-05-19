# BlockRecentlyaccesseditemsApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**blockRecentlyaccesseditemsGetRecentItems**](BlockRecentlyaccesseditemsApi.md#blockRecentlyaccesseditemsGetRecentItems) | **POST** /block_recentlyaccesseditems_get_recent_items | List of items a user has accessed most recently. |


<a id="blockRecentlyaccesseditemsGetRecentItems"></a>
# **blockRecentlyaccesseditemsGetRecentItems**
> Object blockRecentlyaccesseditemsGetRecentItems(blockRecentlyaccesseditemsGetRecentItemsRequest)

List of items a user has accessed most recently.

List of items a user has accessed most recently.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockRecentlyaccesseditemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockRecentlyaccesseditemsApi apiInstance = new BlockRecentlyaccesseditemsApi(defaultClient);
    BlockRecentlyaccesseditemsGetRecentItemsRequest blockRecentlyaccesseditemsGetRecentItemsRequest = new BlockRecentlyaccesseditemsGetRecentItemsRequest(); // BlockRecentlyaccesseditemsGetRecentItemsRequest | 
    try {
      Object result = apiInstance.blockRecentlyaccesseditemsGetRecentItems(blockRecentlyaccesseditemsGetRecentItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockRecentlyaccesseditemsApi#blockRecentlyaccesseditemsGetRecentItems");
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
| **blockRecentlyaccesseditemsGetRecentItemsRequest** | [**BlockRecentlyaccesseditemsGetRecentItemsRequest**](BlockRecentlyaccesseditemsGetRecentItemsRequest.md)|  | |

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
| **200** | The most recently accessed activities/resources by the logged user |  -  |
| **400** | Invalid parameter value detected |  -  |

