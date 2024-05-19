# \BlockRecentlyaccesseditemsAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BlockRecentlyaccesseditemsGetRecentItems**](BlockRecentlyaccesseditemsAPI.md#BlockRecentlyaccesseditemsGetRecentItems) | **Post** /block_recentlyaccesseditems_get_recent_items | List of items a user has accessed most recently.



## BlockRecentlyaccesseditemsGetRecentItems

> map[string]interface{} BlockRecentlyaccesseditemsGetRecentItems(ctx).BlockRecentlyaccesseditemsGetRecentItemsRequest(blockRecentlyaccesseditemsGetRecentItemsRequest).Execute()

List of items a user has accessed most recently.



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
	blockRecentlyaccesseditemsGetRecentItemsRequest := *openapiclient.NewBlockRecentlyaccesseditemsGetRecentItemsRequest() // BlockRecentlyaccesseditemsGetRecentItemsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockRecentlyaccesseditemsAPI.BlockRecentlyaccesseditemsGetRecentItems(context.Background()).BlockRecentlyaccesseditemsGetRecentItemsRequest(blockRecentlyaccesseditemsGetRecentItemsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockRecentlyaccesseditemsAPI.BlockRecentlyaccesseditemsGetRecentItems``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockRecentlyaccesseditemsGetRecentItems`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockRecentlyaccesseditemsAPI.BlockRecentlyaccesseditemsGetRecentItems`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockRecentlyaccesseditemsGetRecentItemsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockRecentlyaccesseditemsGetRecentItemsRequest** | [**BlockRecentlyaccesseditemsGetRecentItemsRequest**](BlockRecentlyaccesseditemsGetRecentItemsRequest.md) |  | 

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

