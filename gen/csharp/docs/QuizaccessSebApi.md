# MoodleClient.Api.QuizaccessSebApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**QuizaccessSebValidateQuizKeys**](QuizaccessSebApi.md#quizaccesssebvalidatequizkeys) | **POST** /quizaccess_seb_validate_quiz_keys | Validate a Safe Exam Browser config key or a browser exam key. |

<a id="quizaccesssebvalidatequizkeys"></a>
# **QuizaccessSebValidateQuizKeys**
> QuizaccessSebValidateQuizKeys200Response QuizaccessSebValidateQuizKeys (QuizaccessSebValidateQuizKeysRequest quizaccessSebValidateQuizKeysRequest)

Validate a Safe Exam Browser config key or a browser exam key.

Validate a Safe Exam Browser config key or a browser exam key.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class QuizaccessSebValidateQuizKeysExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new QuizaccessSebApi(config);
            var quizaccessSebValidateQuizKeysRequest = new QuizaccessSebValidateQuizKeysRequest(); // QuizaccessSebValidateQuizKeysRequest | 

            try
            {
                // Validate a Safe Exam Browser config key or a browser exam key.
                QuizaccessSebValidateQuizKeys200Response result = apiInstance.QuizaccessSebValidateQuizKeys(quizaccessSebValidateQuizKeysRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling QuizaccessSebApi.QuizaccessSebValidateQuizKeys: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the QuizaccessSebValidateQuizKeysWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Validate a Safe Exam Browser config key or a browser exam key.
    ApiResponse<QuizaccessSebValidateQuizKeys200Response> response = apiInstance.QuizaccessSebValidateQuizKeysWithHttpInfo(quizaccessSebValidateQuizKeysRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling QuizaccessSebApi.QuizaccessSebValidateQuizKeysWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **quizaccessSebValidateQuizKeysRequest** | [**QuizaccessSebValidateQuizKeysRequest**](QuizaccessSebValidateQuizKeysRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

