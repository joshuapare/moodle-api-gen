# \PaygwPaypalAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PaygwPaypalCreateTransactionComplete**](PaygwPaypalAPI.md#PaygwPaypalCreateTransactionComplete) | **Post** /paygw_paypal_create_transaction_complete | Takes care of what needs to be done when a PayPal transaction comes back as complete.
[**PaygwPaypalGetConfigForJs**](PaygwPaypalAPI.md#PaygwPaypalGetConfigForJs) | **Post** /paygw_paypal_get_config_for_js | Returns the configuration settings to be used in js



## PaygwPaypalCreateTransactionComplete

> PaygwPaypalCreateTransactionComplete200Response PaygwPaypalCreateTransactionComplete(ctx).PaygwPaypalCreateTransactionCompleteRequest(paygwPaypalCreateTransactionCompleteRequest).Execute()

Takes care of what needs to be done when a PayPal transaction comes back as complete.



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
	paygwPaypalCreateTransactionCompleteRequest := *openapiclient.NewPaygwPaypalCreateTransactionCompleteRequest("Component_example", int32(123), "Orderid_example", "Paymentarea_example") // PaygwPaypalCreateTransactionCompleteRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PaygwPaypalAPI.PaygwPaypalCreateTransactionComplete(context.Background()).PaygwPaypalCreateTransactionCompleteRequest(paygwPaypalCreateTransactionCompleteRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PaygwPaypalAPI.PaygwPaypalCreateTransactionComplete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PaygwPaypalCreateTransactionComplete`: PaygwPaypalCreateTransactionComplete200Response
	fmt.Fprintf(os.Stdout, "Response from `PaygwPaypalAPI.PaygwPaypalCreateTransactionComplete`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPaygwPaypalCreateTransactionCompleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paygwPaypalCreateTransactionCompleteRequest** | [**PaygwPaypalCreateTransactionCompleteRequest**](PaygwPaypalCreateTransactionCompleteRequest.md) |  | 

### Return type

[**PaygwPaypalCreateTransactionComplete200Response**](PaygwPaypalCreateTransactionComplete200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PaygwPaypalGetConfigForJs

> PaygwPaypalGetConfigForJs200Response PaygwPaypalGetConfigForJs(ctx).PaygwPaypalGetConfigForJsRequest(paygwPaypalGetConfigForJsRequest).Execute()

Returns the configuration settings to be used in js



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
	paygwPaypalGetConfigForJsRequest := *openapiclient.NewPaygwPaypalGetConfigForJsRequest("Component_example", int32(123), "Paymentarea_example") // PaygwPaypalGetConfigForJsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PaygwPaypalAPI.PaygwPaypalGetConfigForJs(context.Background()).PaygwPaypalGetConfigForJsRequest(paygwPaypalGetConfigForJsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PaygwPaypalAPI.PaygwPaypalGetConfigForJs``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PaygwPaypalGetConfigForJs`: PaygwPaypalGetConfigForJs200Response
	fmt.Fprintf(os.Stdout, "Response from `PaygwPaypalAPI.PaygwPaypalGetConfigForJs`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPaygwPaypalGetConfigForJsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paygwPaypalGetConfigForJsRequest** | [**PaygwPaypalGetConfigForJsRequest**](PaygwPaypalGetConfigForJsRequest.md) |  | 

### Return type

[**PaygwPaypalGetConfigForJs200Response**](PaygwPaypalGetConfigForJs200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

