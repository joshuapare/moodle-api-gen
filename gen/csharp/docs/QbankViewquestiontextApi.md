# MoodleClient.Api.QbankViewquestiontextApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**QbankViewquestiontextSetQuestionTextFormat**](QbankViewquestiontextApi.md#qbankviewquestiontextsetquestiontextformat) | **POST** /qbank_viewquestiontext_set_question_text_format | Sets the preference for displaying and formatting the question text |

<a id="qbankviewquestiontextsetquestiontextformat"></a>
# **QbankViewquestiontextSetQuestionTextFormat**
> Object QbankViewquestiontextSetQuestionTextFormat (QbankViewquestiontextSetQuestionTextFormatRequest qbankViewquestiontextSetQuestionTextFormatRequest)

Sets the preference for displaying and formatting the question text

Sets the preference for displaying and formatting the question text

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class QbankViewquestiontextSetQuestionTextFormatExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new QbankViewquestiontextApi(config);
            var qbankViewquestiontextSetQuestionTextFormatRequest = new QbankViewquestiontextSetQuestionTextFormatRequest(); // QbankViewquestiontextSetQuestionTextFormatRequest | 

            try
            {
                // Sets the preference for displaying and formatting the question text
                Object result = apiInstance.QbankViewquestiontextSetQuestionTextFormat(qbankViewquestiontextSetQuestionTextFormatRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling QbankViewquestiontextApi.QbankViewquestiontextSetQuestionTextFormat: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the QbankViewquestiontextSetQuestionTextFormatWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Sets the preference for displaying and formatting the question text
    ApiResponse<Object> response = apiInstance.QbankViewquestiontextSetQuestionTextFormatWithHttpInfo(qbankViewquestiontextSetQuestionTextFormatRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling QbankViewquestiontextApi.QbankViewquestiontextSetQuestionTextFormatWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **qbankViewquestiontextSetQuestionTextFormatRequest** | [**QbankViewquestiontextSetQuestionTextFormatRequest**](QbankViewquestiontextSetQuestionTextFormatRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

