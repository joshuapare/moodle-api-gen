# \TinyPremiumAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TinyPremiumGetApiKey**](TinyPremiumAPI.md#TinyPremiumGetApiKey) | **Post** /tiny_premium_get_api_key | Get the Tiny Premium API key from Moodle



## TinyPremiumGetApiKey

> TinyPremiumGetApiKey200Response TinyPremiumGetApiKey(ctx).TinyPremiumGetApiKeyRequest(tinyPremiumGetApiKeyRequest).Execute()

Get the Tiny Premium API key from Moodle



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
	tinyPremiumGetApiKeyRequest := *openapiclient.NewTinyPremiumGetApiKeyRequest(int32(123)) // TinyPremiumGetApiKeyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TinyPremiumAPI.TinyPremiumGetApiKey(context.Background()).TinyPremiumGetApiKeyRequest(tinyPremiumGetApiKeyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TinyPremiumAPI.TinyPremiumGetApiKey``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TinyPremiumGetApiKey`: TinyPremiumGetApiKey200Response
	fmt.Fprintf(os.Stdout, "Response from `TinyPremiumAPI.TinyPremiumGetApiKey`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTinyPremiumGetApiKeyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tinyPremiumGetApiKeyRequest** | [**TinyPremiumGetApiKeyRequest**](TinyPremiumGetApiKeyRequest.md) |  | 

### Return type

[**TinyPremiumGetApiKey200Response**](TinyPremiumGetApiKey200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

