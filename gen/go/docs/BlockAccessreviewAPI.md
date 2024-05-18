# \BlockAccessreviewAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BlockAccessreviewGetModuleData**](BlockAccessreviewAPI.md#BlockAccessreviewGetModuleData) | **Post** /block_accessreview_get_module_data | Gets error data for course modules.
[**BlockAccessreviewGetSectionData**](BlockAccessreviewAPI.md#BlockAccessreviewGetSectionData) | **Post** /block_accessreview_get_section_data | Gets error data for course sections.



## BlockAccessreviewGetModuleData

> map[string]interface{} BlockAccessreviewGetModuleData(ctx).BlockAccessreviewGetModuleDataRequest(blockAccessreviewGetModuleDataRequest).Execute()

Gets error data for course modules.



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
	blockAccessreviewGetModuleDataRequest := *openapiclient.NewBlockAccessreviewGetModuleDataRequest(int32(123)) // BlockAccessreviewGetModuleDataRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockAccessreviewAPI.BlockAccessreviewGetModuleData(context.Background()).BlockAccessreviewGetModuleDataRequest(blockAccessreviewGetModuleDataRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockAccessreviewAPI.BlockAccessreviewGetModuleData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockAccessreviewGetModuleData`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockAccessreviewAPI.BlockAccessreviewGetModuleData`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockAccessreviewGetModuleDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockAccessreviewGetModuleDataRequest** | [**BlockAccessreviewGetModuleDataRequest**](BlockAccessreviewGetModuleDataRequest.md) |  | 

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


## BlockAccessreviewGetSectionData

> map[string]interface{} BlockAccessreviewGetSectionData(ctx).BlockAccessreviewGetSectionDataRequest(blockAccessreviewGetSectionDataRequest).Execute()

Gets error data for course sections.



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
	blockAccessreviewGetSectionDataRequest := *openapiclient.NewBlockAccessreviewGetSectionDataRequest(int32(123)) // BlockAccessreviewGetSectionDataRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockAccessreviewAPI.BlockAccessreviewGetSectionData(context.Background()).BlockAccessreviewGetSectionDataRequest(blockAccessreviewGetSectionDataRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockAccessreviewAPI.BlockAccessreviewGetSectionData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockAccessreviewGetSectionData`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockAccessreviewAPI.BlockAccessreviewGetSectionData`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockAccessreviewGetSectionDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockAccessreviewGetSectionDataRequest** | [**BlockAccessreviewGetSectionDataRequest**](BlockAccessreviewGetSectionDataRequest.md) |  | 

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

