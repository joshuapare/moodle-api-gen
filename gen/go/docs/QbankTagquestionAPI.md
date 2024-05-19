# \QbankTagquestionAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**QbankTagquestionSubmitTagsForm**](QbankTagquestionAPI.md#QbankTagquestionSubmitTagsForm) | **Post** /qbank_tagquestion_submit_tags_form | Update the question tags.



## QbankTagquestionSubmitTagsForm

> CoreQuestionSubmitTagsForm200Response QbankTagquestionSubmitTagsForm(ctx).QbankTagquestionSubmitTagsFormRequest(qbankTagquestionSubmitTagsFormRequest).Execute()

Update the question tags.



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
	qbankTagquestionSubmitTagsFormRequest := *openapiclient.NewQbankTagquestionSubmitTagsFormRequest(int32(123), "Formdata_example", int32(123)) // QbankTagquestionSubmitTagsFormRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QbankTagquestionAPI.QbankTagquestionSubmitTagsForm(context.Background()).QbankTagquestionSubmitTagsFormRequest(qbankTagquestionSubmitTagsFormRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QbankTagquestionAPI.QbankTagquestionSubmitTagsForm``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QbankTagquestionSubmitTagsForm`: CoreQuestionSubmitTagsForm200Response
	fmt.Fprintf(os.Stdout, "Response from `QbankTagquestionAPI.QbankTagquestionSubmitTagsForm`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiQbankTagquestionSubmitTagsFormRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qbankTagquestionSubmitTagsFormRequest** | [**QbankTagquestionSubmitTagsFormRequest**](QbankTagquestionSubmitTagsFormRequest.md) |  | 

### Return type

[**CoreQuestionSubmitTagsForm200Response**](CoreQuestionSubmitTagsForm200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

