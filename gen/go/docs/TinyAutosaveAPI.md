# \TinyAutosaveAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TinyAutosaveResetSession**](TinyAutosaveAPI.md#TinyAutosaveResetSession) | **Post** /tiny_autosave_reset_session | Reset an autosave session
[**TinyAutosaveResumeSession**](TinyAutosaveAPI.md#TinyAutosaveResumeSession) | **Post** /tiny_autosave_resume_session | Resume an autosave session
[**TinyAutosaveUpdateSession**](TinyAutosaveAPI.md#TinyAutosaveUpdateSession) | **Post** /tiny_autosave_update_session | Update an autosave session



## TinyAutosaveResetSession

> map[string]interface{} TinyAutosaveResetSession(ctx).TinyAutosaveResetSessionRequest(tinyAutosaveResetSessionRequest).Execute()

Reset an autosave session



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
	tinyAutosaveResetSessionRequest := *openapiclient.NewTinyAutosaveResetSessionRequest(int32(123), "Elementid_example", "Pagehash_example", "Pageinstance_example") // TinyAutosaveResetSessionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TinyAutosaveAPI.TinyAutosaveResetSession(context.Background()).TinyAutosaveResetSessionRequest(tinyAutosaveResetSessionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TinyAutosaveAPI.TinyAutosaveResetSession``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TinyAutosaveResetSession`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `TinyAutosaveAPI.TinyAutosaveResetSession`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTinyAutosaveResetSessionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tinyAutosaveResetSessionRequest** | [**TinyAutosaveResetSessionRequest**](TinyAutosaveResetSessionRequest.md) |  | 

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


## TinyAutosaveResumeSession

> TinyAutosaveResumeSession200Response TinyAutosaveResumeSession(ctx).TinyAutosaveResumeSessionRequest(tinyAutosaveResumeSessionRequest).Execute()

Resume an autosave session



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
	tinyAutosaveResumeSessionRequest := *openapiclient.NewTinyAutosaveResumeSessionRequest(int32(123), int32(123), "Elementid_example", "Pagehash_example", "Pageinstance_example") // TinyAutosaveResumeSessionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TinyAutosaveAPI.TinyAutosaveResumeSession(context.Background()).TinyAutosaveResumeSessionRequest(tinyAutosaveResumeSessionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TinyAutosaveAPI.TinyAutosaveResumeSession``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TinyAutosaveResumeSession`: TinyAutosaveResumeSession200Response
	fmt.Fprintf(os.Stdout, "Response from `TinyAutosaveAPI.TinyAutosaveResumeSession`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTinyAutosaveResumeSessionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tinyAutosaveResumeSessionRequest** | [**TinyAutosaveResumeSessionRequest**](TinyAutosaveResumeSessionRequest.md) |  | 

### Return type

[**TinyAutosaveResumeSession200Response**](TinyAutosaveResumeSession200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TinyAutosaveUpdateSession

> map[string]interface{} TinyAutosaveUpdateSession(ctx).TinyAutosaveUpdateSessionRequest(tinyAutosaveUpdateSessionRequest).Execute()

Update an autosave session



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
	tinyAutosaveUpdateSessionRequest := *openapiclient.NewTinyAutosaveUpdateSessionRequest(int32(123), "Drafttext_example", "Elementid_example", "Pagehash_example", "Pageinstance_example") // TinyAutosaveUpdateSessionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TinyAutosaveAPI.TinyAutosaveUpdateSession(context.Background()).TinyAutosaveUpdateSessionRequest(tinyAutosaveUpdateSessionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TinyAutosaveAPI.TinyAutosaveUpdateSession``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TinyAutosaveUpdateSession`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `TinyAutosaveAPI.TinyAutosaveUpdateSession`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTinyAutosaveUpdateSessionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tinyAutosaveUpdateSessionRequest** | [**TinyAutosaveUpdateSessionRequest**](TinyAutosaveUpdateSessionRequest.md) |  | 

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

