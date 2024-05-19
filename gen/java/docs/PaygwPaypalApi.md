# PaygwPaypalApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**paygwPaypalCreateTransactionComplete**](PaygwPaypalApi.md#paygwPaypalCreateTransactionComplete) | **POST** /paygw_paypal_create_transaction_complete | Takes care of what needs to be done when a PayPal transaction comes back as complete. |
| [**paygwPaypalGetConfigForJs**](PaygwPaypalApi.md#paygwPaypalGetConfigForJs) | **POST** /paygw_paypal_get_config_for_js | Returns the configuration settings to be used in js |


<a id="paygwPaypalCreateTransactionComplete"></a>
# **paygwPaypalCreateTransactionComplete**
> PaygwPaypalCreateTransactionComplete200Response paygwPaypalCreateTransactionComplete(paygwPaypalCreateTransactionCompleteRequest)

Takes care of what needs to be done when a PayPal transaction comes back as complete.

Takes care of what needs to be done when a PayPal transaction comes back as complete.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.PaygwPaypalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    PaygwPaypalApi apiInstance = new PaygwPaypalApi(defaultClient);
    PaygwPaypalCreateTransactionCompleteRequest paygwPaypalCreateTransactionCompleteRequest = new PaygwPaypalCreateTransactionCompleteRequest(); // PaygwPaypalCreateTransactionCompleteRequest | 
    try {
      PaygwPaypalCreateTransactionComplete200Response result = apiInstance.paygwPaypalCreateTransactionComplete(paygwPaypalCreateTransactionCompleteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaygwPaypalApi#paygwPaypalCreateTransactionComplete");
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
| **paygwPaypalCreateTransactionCompleteRequest** | [**PaygwPaypalCreateTransactionCompleteRequest**](PaygwPaypalCreateTransactionCompleteRequest.md)|  | |

### Return type

[**PaygwPaypalCreateTransactionComplete200Response**](PaygwPaypalCreateTransactionComplete200Response.md)

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

<a id="paygwPaypalGetConfigForJs"></a>
# **paygwPaypalGetConfigForJs**
> PaygwPaypalGetConfigForJs200Response paygwPaypalGetConfigForJs(paygwPaypalGetConfigForJsRequest)

Returns the configuration settings to be used in js

Returns the configuration settings to be used in js

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.PaygwPaypalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    PaygwPaypalApi apiInstance = new PaygwPaypalApi(defaultClient);
    PaygwPaypalGetConfigForJsRequest paygwPaypalGetConfigForJsRequest = new PaygwPaypalGetConfigForJsRequest(); // PaygwPaypalGetConfigForJsRequest | 
    try {
      PaygwPaypalGetConfigForJs200Response result = apiInstance.paygwPaypalGetConfigForJs(paygwPaypalGetConfigForJsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaygwPaypalApi#paygwPaypalGetConfigForJs");
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
| **paygwPaypalGetConfigForJsRequest** | [**PaygwPaypalGetConfigForJsRequest**](PaygwPaypalGetConfigForJsRequest.md)|  | |

### Return type

[**PaygwPaypalGetConfigForJs200Response**](PaygwPaypalGetConfigForJs200Response.md)

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

