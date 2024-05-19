# \ToolUsertoursAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ToolUsertoursCompleteTour**](ToolUsertoursAPI.md#ToolUsertoursCompleteTour) | **Post** /tool_usertours_complete_tour | Mark the specified tour as completed for the current user
[**ToolUsertoursFetchAndStartTour**](ToolUsertoursAPI.md#ToolUsertoursFetchAndStartTour) | **Post** /tool_usertours_fetch_and_start_tour | Fetch the specified tour
[**ToolUsertoursResetTour**](ToolUsertoursAPI.md#ToolUsertoursResetTour) | **Post** /tool_usertours_reset_tour | Remove the specified tour
[**ToolUsertoursStepShown**](ToolUsertoursAPI.md#ToolUsertoursStepShown) | **Post** /tool_usertours_step_shown | Mark the specified step as completed for the current user



## ToolUsertoursCompleteTour

> map[string]interface{} ToolUsertoursCompleteTour(ctx).ToolUsertoursCompleteTourRequest(toolUsertoursCompleteTourRequest).Execute()

Mark the specified tour as completed for the current user



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
	toolUsertoursCompleteTourRequest := *openapiclient.NewToolUsertoursCompleteTourRequest(int32(123), "Pageurl_example", int32(123), int32(123), int32(123)) // ToolUsertoursCompleteTourRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolUsertoursAPI.ToolUsertoursCompleteTour(context.Background()).ToolUsertoursCompleteTourRequest(toolUsertoursCompleteTourRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolUsertoursAPI.ToolUsertoursCompleteTour``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolUsertoursCompleteTour`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ToolUsertoursAPI.ToolUsertoursCompleteTour`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolUsertoursCompleteTourRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolUsertoursCompleteTourRequest** | [**ToolUsertoursCompleteTourRequest**](ToolUsertoursCompleteTourRequest.md) |  | 

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


## ToolUsertoursFetchAndStartTour

> ToolUsertoursFetchAndStartTour200Response ToolUsertoursFetchAndStartTour(ctx).ToolUsertoursFetchAndStartTourRequest(toolUsertoursFetchAndStartTourRequest).Execute()

Fetch the specified tour



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
	toolUsertoursFetchAndStartTourRequest := *openapiclient.NewToolUsertoursFetchAndStartTourRequest(int32(123), "Pageurl_example", int32(123)) // ToolUsertoursFetchAndStartTourRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolUsertoursAPI.ToolUsertoursFetchAndStartTour(context.Background()).ToolUsertoursFetchAndStartTourRequest(toolUsertoursFetchAndStartTourRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolUsertoursAPI.ToolUsertoursFetchAndStartTour``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolUsertoursFetchAndStartTour`: ToolUsertoursFetchAndStartTour200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolUsertoursAPI.ToolUsertoursFetchAndStartTour`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolUsertoursFetchAndStartTourRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolUsertoursFetchAndStartTourRequest** | [**ToolUsertoursFetchAndStartTourRequest**](ToolUsertoursFetchAndStartTourRequest.md) |  | 

### Return type

[**ToolUsertoursFetchAndStartTour200Response**](ToolUsertoursFetchAndStartTour200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolUsertoursResetTour

> ToolUsertoursResetTour200Response ToolUsertoursResetTour(ctx).ToolUsertoursResetTourRequest(toolUsertoursResetTourRequest).Execute()

Remove the specified tour



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
	toolUsertoursResetTourRequest := *openapiclient.NewToolUsertoursResetTourRequest(int32(123), "Pageurl_example", int32(123)) // ToolUsertoursResetTourRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolUsertoursAPI.ToolUsertoursResetTour(context.Background()).ToolUsertoursResetTourRequest(toolUsertoursResetTourRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolUsertoursAPI.ToolUsertoursResetTour``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolUsertoursResetTour`: ToolUsertoursResetTour200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolUsertoursAPI.ToolUsertoursResetTour`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolUsertoursResetTourRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolUsertoursResetTourRequest** | [**ToolUsertoursResetTourRequest**](ToolUsertoursResetTourRequest.md) |  | 

### Return type

[**ToolUsertoursResetTour200Response**](ToolUsertoursResetTour200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolUsertoursStepShown

> map[string]interface{} ToolUsertoursStepShown(ctx).ToolUsertoursStepShownRequest(toolUsertoursStepShownRequest).Execute()

Mark the specified step as completed for the current user



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
	toolUsertoursStepShownRequest := *openapiclient.NewToolUsertoursStepShownRequest(int32(123), "Pageurl_example", int32(123), int32(123), int32(123)) // ToolUsertoursStepShownRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolUsertoursAPI.ToolUsertoursStepShown(context.Background()).ToolUsertoursStepShownRequest(toolUsertoursStepShownRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolUsertoursAPI.ToolUsertoursStepShown``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolUsertoursStepShown`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ToolUsertoursAPI.ToolUsertoursStepShown`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolUsertoursStepShownRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolUsertoursStepShownRequest** | [**ToolUsertoursStepShownRequest**](ToolUsertoursStepShownRequest.md) |  | 

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

