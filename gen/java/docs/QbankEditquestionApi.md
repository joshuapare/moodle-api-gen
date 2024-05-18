# QbankEditquestionApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**qbankEditquestionSetStatus**](QbankEditquestionApi.md#qbankEditquestionSetStatus) | **POST** /qbank_editquestion_set_status | Update the question status. |


<a id="qbankEditquestionSetStatus"></a>
# **qbankEditquestionSetStatus**
> QbankEditquestionSetStatus200Response qbankEditquestionSetStatus(qbankEditquestionSetStatusRequest)

Update the question status.

Update the question status.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.QbankEditquestionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    QbankEditquestionApi apiInstance = new QbankEditquestionApi(defaultClient);
    QbankEditquestionSetStatusRequest qbankEditquestionSetStatusRequest = new QbankEditquestionSetStatusRequest(); // QbankEditquestionSetStatusRequest | 
    try {
      QbankEditquestionSetStatus200Response result = apiInstance.qbankEditquestionSetStatus(qbankEditquestionSetStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QbankEditquestionApi#qbankEditquestionSetStatus");
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
| **qbankEditquestionSetStatusRequest** | [**QbankEditquestionSetStatusRequest**](QbankEditquestionSetStatusRequest.md)|  | |

### Return type

[**QbankEditquestionSetStatus200Response**](QbankEditquestionSetStatus200Response.md)

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

