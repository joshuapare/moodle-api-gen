# \QbankViewquestiontextAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**QbankViewquestiontextSetQuestionTextFormat**](QbankViewquestiontextAPI.md#QbankViewquestiontextSetQuestionTextFormat) | **Post** /qbank_viewquestiontext_set_question_text_format | Sets the preference for displaying and formatting the question text



## QbankViewquestiontextSetQuestionTextFormat

> map[string]interface{} QbankViewquestiontextSetQuestionTextFormat(ctx).QbankViewquestiontextSetQuestionTextFormatRequest(qbankViewquestiontextSetQuestionTextFormatRequest).Execute()

Sets the preference for displaying and formatting the question text



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	qbankViewquestiontextSetQuestionTextFormatRequest := *openapiclient.NewQbankViewquestiontextSetQuestionTextFormatRequest(int32(123)) // QbankViewquestiontextSetQuestionTextFormatRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QbankViewquestiontextAPI.QbankViewquestiontextSetQuestionTextFormat(context.Background()).QbankViewquestiontextSetQuestionTextFormatRequest(qbankViewquestiontextSetQuestionTextFormatRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QbankViewquestiontextAPI.QbankViewquestiontextSetQuestionTextFormat``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QbankViewquestiontextSetQuestionTextFormat`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `QbankViewquestiontextAPI.QbankViewquestiontextSetQuestionTextFormat`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiQbankViewquestiontextSetQuestionTextFormatRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qbankViewquestiontextSetQuestionTextFormatRequest** | [**QbankViewquestiontextSetQuestionTextFormatRequest**](QbankViewquestiontextSetQuestionTextFormatRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

