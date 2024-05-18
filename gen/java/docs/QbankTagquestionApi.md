# QbankTagquestionApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**qbankTagquestionSubmitTagsForm**](QbankTagquestionApi.md#qbankTagquestionSubmitTagsForm) | **POST** /qbank_tagquestion_submit_tags_form | Update the question tags. |


<a id="qbankTagquestionSubmitTagsForm"></a>
# **qbankTagquestionSubmitTagsForm**
> CoreQuestionSubmitTagsForm200Response qbankTagquestionSubmitTagsForm(qbankTagquestionSubmitTagsFormRequest)

Update the question tags.

Update the question tags.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.QbankTagquestionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    QbankTagquestionApi apiInstance = new QbankTagquestionApi(defaultClient);
    QbankTagquestionSubmitTagsFormRequest qbankTagquestionSubmitTagsFormRequest = new QbankTagquestionSubmitTagsFormRequest(); // QbankTagquestionSubmitTagsFormRequest | 
    try {
      CoreQuestionSubmitTagsForm200Response result = apiInstance.qbankTagquestionSubmitTagsForm(qbankTagquestionSubmitTagsFormRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QbankTagquestionApi#qbankTagquestionSubmitTagsForm");
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
| **qbankTagquestionSubmitTagsFormRequest** | [**QbankTagquestionSubmitTagsFormRequest**](QbankTagquestionSubmitTagsFormRequest.md)|  | |

### Return type

[**CoreQuestionSubmitTagsForm200Response**](CoreQuestionSubmitTagsForm200Response.md)

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

