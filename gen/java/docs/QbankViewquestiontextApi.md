# QbankViewquestiontextApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**qbankViewquestiontextSetQuestionTextFormat**](QbankViewquestiontextApi.md#qbankViewquestiontextSetQuestionTextFormat) | **POST** /qbank_viewquestiontext_set_question_text_format | Sets the preference for displaying and formatting the question text |


<a id="qbankViewquestiontextSetQuestionTextFormat"></a>
# **qbankViewquestiontextSetQuestionTextFormat**
> Object qbankViewquestiontextSetQuestionTextFormat(qbankViewquestiontextSetQuestionTextFormatRequest)

Sets the preference for displaying and formatting the question text

Sets the preference for displaying and formatting the question text

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.QbankViewquestiontextApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    QbankViewquestiontextApi apiInstance = new QbankViewquestiontextApi(defaultClient);
    QbankViewquestiontextSetQuestionTextFormatRequest qbankViewquestiontextSetQuestionTextFormatRequest = new QbankViewquestiontextSetQuestionTextFormatRequest(); // QbankViewquestiontextSetQuestionTextFormatRequest | 
    try {
      Object result = apiInstance.qbankViewquestiontextSetQuestionTextFormat(qbankViewquestiontextSetQuestionTextFormatRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QbankViewquestiontextApi#qbankViewquestiontextSetQuestionTextFormat");
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
| **qbankViewquestiontextSetQuestionTextFormatRequest** | [**QbankViewquestiontextSetQuestionTextFormatRequest**](QbankViewquestiontextSetQuestionTextFormatRequest.md)|  | |

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

