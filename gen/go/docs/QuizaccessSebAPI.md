# \QuizaccessSebAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**QuizaccessSebValidateQuizKeys**](QuizaccessSebAPI.md#QuizaccessSebValidateQuizKeys) | **Post** /quizaccess_seb_validate_quiz_keys | Validate a Safe Exam Browser config key or a browser exam key.



## QuizaccessSebValidateQuizKeys

> QuizaccessSebValidateQuizKeys200Response QuizaccessSebValidateQuizKeys(ctx).QuizaccessSebValidateQuizKeysRequest(quizaccessSebValidateQuizKeysRequest).Execute()

Validate a Safe Exam Browser config key or a browser exam key.



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
	quizaccessSebValidateQuizKeysRequest := *openapiclient.NewQuizaccessSebValidateQuizKeysRequest(int32(123), "Url_example") // QuizaccessSebValidateQuizKeysRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QuizaccessSebAPI.QuizaccessSebValidateQuizKeys(context.Background()).QuizaccessSebValidateQuizKeysRequest(quizaccessSebValidateQuizKeysRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QuizaccessSebAPI.QuizaccessSebValidateQuizKeys``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QuizaccessSebValidateQuizKeys`: QuizaccessSebValidateQuizKeys200Response
	fmt.Fprintf(os.Stdout, "Response from `QuizaccessSebAPI.QuizaccessSebValidateQuizKeys`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiQuizaccessSebValidateQuizKeysRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quizaccessSebValidateQuizKeysRequest** | [**QuizaccessSebValidateQuizKeysRequest**](QuizaccessSebValidateQuizKeysRequest.md) |  | 

### Return type

[**QuizaccessSebValidateQuizKeys200Response**](QuizaccessSebValidateQuizKeys200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

