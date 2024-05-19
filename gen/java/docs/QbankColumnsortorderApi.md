# QbankColumnsortorderApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**qbankColumnsortorderSetColumnSize**](QbankColumnsortorderApi.md#qbankColumnsortorderSetColumnSize) | **POST** /qbank_columnsortorder_set_column_size | Column size |
| [**qbankColumnsortorderSetColumnbankOrder**](QbankColumnsortorderApi.md#qbankColumnsortorderSetColumnbankOrder) | **POST** /qbank_columnsortorder_set_columnbank_order | Sets question columns order in database |
| [**qbankColumnsortorderSetHiddenColumns**](QbankColumnsortorderApi.md#qbankColumnsortorderSetHiddenColumns) | **POST** /qbank_columnsortorder_set_hidden_columns | Hidden Columns |


<a id="qbankColumnsortorderSetColumnSize"></a>
# **qbankColumnsortorderSetColumnSize**
> Object qbankColumnsortorderSetColumnSize(qbankColumnsortorderSetColumnSizeRequest)

Column size

Column size

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.QbankColumnsortorderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    QbankColumnsortorderApi apiInstance = new QbankColumnsortorderApi(defaultClient);
    QbankColumnsortorderSetColumnSizeRequest qbankColumnsortorderSetColumnSizeRequest = new QbankColumnsortorderSetColumnSizeRequest(); // QbankColumnsortorderSetColumnSizeRequest | 
    try {
      Object result = apiInstance.qbankColumnsortorderSetColumnSize(qbankColumnsortorderSetColumnSizeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QbankColumnsortorderApi#qbankColumnsortorderSetColumnSize");
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
| **qbankColumnsortorderSetColumnSizeRequest** | [**QbankColumnsortorderSetColumnSizeRequest**](QbankColumnsortorderSetColumnSizeRequest.md)|  | |

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

<a id="qbankColumnsortorderSetColumnbankOrder"></a>
# **qbankColumnsortorderSetColumnbankOrder**
> Object qbankColumnsortorderSetColumnbankOrder(qbankColumnsortorderSetColumnbankOrderRequest)

Sets question columns order in database

Sets question columns order in database

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.QbankColumnsortorderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    QbankColumnsortorderApi apiInstance = new QbankColumnsortorderApi(defaultClient);
    QbankColumnsortorderSetColumnbankOrderRequest qbankColumnsortorderSetColumnbankOrderRequest = new QbankColumnsortorderSetColumnbankOrderRequest(); // QbankColumnsortorderSetColumnbankOrderRequest | 
    try {
      Object result = apiInstance.qbankColumnsortorderSetColumnbankOrder(qbankColumnsortorderSetColumnbankOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QbankColumnsortorderApi#qbankColumnsortorderSetColumnbankOrder");
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
| **qbankColumnsortorderSetColumnbankOrderRequest** | [**QbankColumnsortorderSetColumnbankOrderRequest**](QbankColumnsortorderSetColumnbankOrderRequest.md)|  | |

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

<a id="qbankColumnsortorderSetHiddenColumns"></a>
# **qbankColumnsortorderSetHiddenColumns**
> Object qbankColumnsortorderSetHiddenColumns(qbankColumnsortorderSetHiddenColumnsRequest)

Hidden Columns

Hidden Columns

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.QbankColumnsortorderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    QbankColumnsortorderApi apiInstance = new QbankColumnsortorderApi(defaultClient);
    QbankColumnsortorderSetHiddenColumnsRequest qbankColumnsortorderSetHiddenColumnsRequest = new QbankColumnsortorderSetHiddenColumnsRequest(); // QbankColumnsortorderSetHiddenColumnsRequest | 
    try {
      Object result = apiInstance.qbankColumnsortorderSetHiddenColumns(qbankColumnsortorderSetHiddenColumnsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QbankColumnsortorderApi#qbankColumnsortorderSetHiddenColumns");
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
| **qbankColumnsortorderSetHiddenColumnsRequest** | [**QbankColumnsortorderSetHiddenColumnsRequest**](QbankColumnsortorderSetHiddenColumnsRequest.md)|  | |

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

