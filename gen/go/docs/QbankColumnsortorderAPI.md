# \QbankColumnsortorderAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**QbankColumnsortorderSetColumnSize**](QbankColumnsortorderAPI.md#QbankColumnsortorderSetColumnSize) | **Post** /qbank_columnsortorder_set_column_size | Column size
[**QbankColumnsortorderSetColumnbankOrder**](QbankColumnsortorderAPI.md#QbankColumnsortorderSetColumnbankOrder) | **Post** /qbank_columnsortorder_set_columnbank_order | Sets question columns order in database
[**QbankColumnsortorderSetHiddenColumns**](QbankColumnsortorderAPI.md#QbankColumnsortorderSetHiddenColumns) | **Post** /qbank_columnsortorder_set_hidden_columns | Hidden Columns



## QbankColumnsortorderSetColumnSize

> map[string]interface{} QbankColumnsortorderSetColumnSize(ctx).QbankColumnsortorderSetColumnSizeRequest(qbankColumnsortorderSetColumnSizeRequest).Execute()

Column size



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
	qbankColumnsortorderSetColumnSizeRequest := *openapiclient.NewQbankColumnsortorderSetColumnSizeRequest() // QbankColumnsortorderSetColumnSizeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QbankColumnsortorderAPI.QbankColumnsortorderSetColumnSize(context.Background()).QbankColumnsortorderSetColumnSizeRequest(qbankColumnsortorderSetColumnSizeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QbankColumnsortorderAPI.QbankColumnsortorderSetColumnSize``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QbankColumnsortorderSetColumnSize`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `QbankColumnsortorderAPI.QbankColumnsortorderSetColumnSize`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiQbankColumnsortorderSetColumnSizeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qbankColumnsortorderSetColumnSizeRequest** | [**QbankColumnsortorderSetColumnSizeRequest**](QbankColumnsortorderSetColumnSizeRequest.md) |  | 

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


## QbankColumnsortorderSetColumnbankOrder

> map[string]interface{} QbankColumnsortorderSetColumnbankOrder(ctx).QbankColumnsortorderSetColumnbankOrderRequest(qbankColumnsortorderSetColumnbankOrderRequest).Execute()

Sets question columns order in database



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
	qbankColumnsortorderSetColumnbankOrderRequest := *openapiclient.NewQbankColumnsortorderSetColumnbankOrderRequest() // QbankColumnsortorderSetColumnbankOrderRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QbankColumnsortorderAPI.QbankColumnsortorderSetColumnbankOrder(context.Background()).QbankColumnsortorderSetColumnbankOrderRequest(qbankColumnsortorderSetColumnbankOrderRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QbankColumnsortorderAPI.QbankColumnsortorderSetColumnbankOrder``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QbankColumnsortorderSetColumnbankOrder`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `QbankColumnsortorderAPI.QbankColumnsortorderSetColumnbankOrder`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiQbankColumnsortorderSetColumnbankOrderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qbankColumnsortorderSetColumnbankOrderRequest** | [**QbankColumnsortorderSetColumnbankOrderRequest**](QbankColumnsortorderSetColumnbankOrderRequest.md) |  | 

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


## QbankColumnsortorderSetHiddenColumns

> map[string]interface{} QbankColumnsortorderSetHiddenColumns(ctx).QbankColumnsortorderSetHiddenColumnsRequest(qbankColumnsortorderSetHiddenColumnsRequest).Execute()

Hidden Columns



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
	qbankColumnsortorderSetHiddenColumnsRequest := *openapiclient.NewQbankColumnsortorderSetHiddenColumnsRequest() // QbankColumnsortorderSetHiddenColumnsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QbankColumnsortorderAPI.QbankColumnsortorderSetHiddenColumns(context.Background()).QbankColumnsortorderSetHiddenColumnsRequest(qbankColumnsortorderSetHiddenColumnsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QbankColumnsortorderAPI.QbankColumnsortorderSetHiddenColumns``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QbankColumnsortorderSetHiddenColumns`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `QbankColumnsortorderAPI.QbankColumnsortorderSetHiddenColumns`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiQbankColumnsortorderSetHiddenColumnsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qbankColumnsortorderSetHiddenColumnsRequest** | [**QbankColumnsortorderSetHiddenColumnsRequest**](QbankColumnsortorderSetHiddenColumnsRequest.md) |  | 

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

