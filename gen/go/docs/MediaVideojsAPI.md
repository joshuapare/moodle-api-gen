# \MediaVideojsAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MediaVideojsGetLanguage**](MediaVideojsAPI.md#MediaVideojsGetLanguage) | **Post** /media_videojs_get_language | get language.



## MediaVideojsGetLanguage

> map[string]interface{} MediaVideojsGetLanguage(ctx).MediaVideojsGetLanguageRequest(mediaVideojsGetLanguageRequest).Execute()

get language.



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
	mediaVideojsGetLanguageRequest := *openapiclient.NewMediaVideojsGetLanguageRequest("Lang_example") // MediaVideojsGetLanguageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MediaVideojsAPI.MediaVideojsGetLanguage(context.Background()).MediaVideojsGetLanguageRequest(mediaVideojsGetLanguageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MediaVideojsAPI.MediaVideojsGetLanguage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MediaVideojsGetLanguage`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MediaVideojsAPI.MediaVideojsGetLanguage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMediaVideojsGetLanguageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaVideojsGetLanguageRequest** | [**MediaVideojsGetLanguageRequest**](MediaVideojsGetLanguageRequest.md) |  | 

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

