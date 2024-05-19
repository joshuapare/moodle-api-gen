# \QbankEditquestionAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**QbankEditquestionSetStatus**](QbankEditquestionAPI.md#QbankEditquestionSetStatus) | **Post** /qbank_editquestion_set_status | Update the question status.



## QbankEditquestionSetStatus

> QbankEditquestionSetStatus200Response QbankEditquestionSetStatus(ctx).QbankEditquestionSetStatusRequest(qbankEditquestionSetStatusRequest).Execute()

Update the question status.



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
	qbankEditquestionSetStatusRequest := *openapiclient.NewQbankEditquestionSetStatusRequest(int32(123), "Status_example") // QbankEditquestionSetStatusRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QbankEditquestionAPI.QbankEditquestionSetStatus(context.Background()).QbankEditquestionSetStatusRequest(qbankEditquestionSetStatusRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QbankEditquestionAPI.QbankEditquestionSetStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QbankEditquestionSetStatus`: QbankEditquestionSetStatus200Response
	fmt.Fprintf(os.Stdout, "Response from `QbankEditquestionAPI.QbankEditquestionSetStatus`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiQbankEditquestionSetStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qbankEditquestionSetStatusRequest** | [**QbankEditquestionSetStatusRequest**](QbankEditquestionSetStatusRequest.md) |  | 

### Return type

[**QbankEditquestionSetStatus200Response**](QbankEditquestionSetStatus200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

