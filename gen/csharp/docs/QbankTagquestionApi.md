# Org.OpenAPITools.Api.QbankTagquestionApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**QbankTagquestionSubmitTagsForm**](QbankTagquestionApi.md#qbanktagquestionsubmittagsform) | **POST** /qbank_tagquestion_submit_tags_form | Update the question tags. |

<a id="qbanktagquestionsubmittagsform"></a>
# **QbankTagquestionSubmitTagsForm**
> CoreQuestionSubmitTagsForm200Response QbankTagquestionSubmitTagsForm (QbankTagquestionSubmitTagsFormRequest qbankTagquestionSubmitTagsFormRequest)

Update the question tags.

Update the question tags.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class QbankTagquestionSubmitTagsFormExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new QbankTagquestionApi(config);
            var qbankTagquestionSubmitTagsFormRequest = new QbankTagquestionSubmitTagsFormRequest(); // QbankTagquestionSubmitTagsFormRequest | 

            try
            {
                // Update the question tags.
                CoreQuestionSubmitTagsForm200Response result = apiInstance.QbankTagquestionSubmitTagsForm(qbankTagquestionSubmitTagsFormRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling QbankTagquestionApi.QbankTagquestionSubmitTagsForm: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the QbankTagquestionSubmitTagsFormWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update the question tags.
    ApiResponse<CoreQuestionSubmitTagsForm200Response> response = apiInstance.QbankTagquestionSubmitTagsFormWithHttpInfo(qbankTagquestionSubmitTagsFormRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling QbankTagquestionApi.QbankTagquestionSubmitTagsFormWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **qbankTagquestionSubmitTagsFormRequest** | [**QbankTagquestionSubmitTagsFormRequest**](QbankTagquestionSubmitTagsFormRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

