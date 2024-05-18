# \TinyEquationAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TinyEquationFilter**](TinyEquationAPI.md#TinyEquationFilter) | **Post** /tiny_equation_filter | Filter the equation



## TinyEquationFilter

> TinyEquationFilter200Response TinyEquationFilter(ctx).TinyEquationFilterRequest(tinyEquationFilterRequest).Execute()

Filter the equation



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
	tinyEquationFilterRequest := *openapiclient.NewTinyEquationFilterRequest("Content_example", int32(123)) // TinyEquationFilterRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TinyEquationAPI.TinyEquationFilter(context.Background()).TinyEquationFilterRequest(tinyEquationFilterRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TinyEquationAPI.TinyEquationFilter``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TinyEquationFilter`: TinyEquationFilter200Response
	fmt.Fprintf(os.Stdout, "Response from `TinyEquationAPI.TinyEquationFilter`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTinyEquationFilterRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tinyEquationFilterRequest** | [**TinyEquationFilterRequest**](TinyEquationFilterRequest.md) |  | 

### Return type

[**TinyEquationFilter200Response**](TinyEquationFilter200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

