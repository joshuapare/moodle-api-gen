# QuizaccessSebApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**quizaccessSebValidateQuizKeys**](QuizaccessSebApi.md#quizaccessSebValidateQuizKeys) | **POST** /quizaccess_seb_validate_quiz_keys | Validate a Safe Exam Browser config key or a browser exam key. |


<a id="quizaccessSebValidateQuizKeys"></a>
# **quizaccessSebValidateQuizKeys**
> QuizaccessSebValidateQuizKeys200Response quizaccessSebValidateQuizKeys(quizaccessSebValidateQuizKeysRequest)

Validate a Safe Exam Browser config key or a browser exam key.

Validate a Safe Exam Browser config key or a browser exam key.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.QuizaccessSebApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/rest/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    QuizaccessSebApi apiInstance = new QuizaccessSebApi(defaultClient);
    QuizaccessSebValidateQuizKeysRequest quizaccessSebValidateQuizKeysRequest = new QuizaccessSebValidateQuizKeysRequest(); // QuizaccessSebValidateQuizKeysRequest | 
    try {
      QuizaccessSebValidateQuizKeys200Response result = apiInstance.quizaccessSebValidateQuizKeys(quizaccessSebValidateQuizKeysRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuizaccessSebApi#quizaccessSebValidateQuizKeys");
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
| **quizaccessSebValidateQuizKeysRequest** | [**QuizaccessSebValidateQuizKeysRequest**](QuizaccessSebValidateQuizKeysRequest.md)|  | |

### Return type

[**QuizaccessSebValidateQuizKeys200Response**](QuizaccessSebValidateQuizKeys200Response.md)

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

