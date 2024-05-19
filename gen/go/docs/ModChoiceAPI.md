# \ModChoiceAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModChoiceDeleteChoiceResponses**](ModChoiceAPI.md#ModChoiceDeleteChoiceResponses) | **Post** /mod_choice_delete_choice_responses | Delete the given submitted responses in a choice
[**ModChoiceGetChoiceOptions**](ModChoiceAPI.md#ModChoiceGetChoiceOptions) | **Post** /mod_choice_get_choice_options | Retrieve options for a specific choice.
[**ModChoiceGetChoiceResults**](ModChoiceAPI.md#ModChoiceGetChoiceResults) | **Post** /mod_choice_get_choice_results | Retrieve users results for a given choice.
[**ModChoiceGetChoicesByCourses**](ModChoiceAPI.md#ModChoiceGetChoicesByCourses) | **Post** /mod_choice_get_choices_by_courses | Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.
[**ModChoiceSubmitChoiceResponse**](ModChoiceAPI.md#ModChoiceSubmitChoiceResponse) | **Post** /mod_choice_submit_choice_response | Submit responses to a specific choice item.
[**ModChoiceViewChoice**](ModChoiceAPI.md#ModChoiceViewChoice) | **Post** /mod_choice_view_choice | Trigger the course module viewed event and update the module completion status.



## ModChoiceDeleteChoiceResponses

> ModChoiceDeleteChoiceResponses200Response ModChoiceDeleteChoiceResponses(ctx).ModChoiceDeleteChoiceResponsesRequest(modChoiceDeleteChoiceResponsesRequest).Execute()

Delete the given submitted responses in a choice



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
	modChoiceDeleteChoiceResponsesRequest := *openapiclient.NewModChoiceDeleteChoiceResponsesRequest(int32(123)) // ModChoiceDeleteChoiceResponsesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModChoiceAPI.ModChoiceDeleteChoiceResponses(context.Background()).ModChoiceDeleteChoiceResponsesRequest(modChoiceDeleteChoiceResponsesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModChoiceAPI.ModChoiceDeleteChoiceResponses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModChoiceDeleteChoiceResponses`: ModChoiceDeleteChoiceResponses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModChoiceAPI.ModChoiceDeleteChoiceResponses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModChoiceDeleteChoiceResponsesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChoiceDeleteChoiceResponsesRequest** | [**ModChoiceDeleteChoiceResponsesRequest**](ModChoiceDeleteChoiceResponsesRequest.md) |  | 

### Return type

[**ModChoiceDeleteChoiceResponses200Response**](ModChoiceDeleteChoiceResponses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModChoiceGetChoiceOptions

> ModChoiceGetChoiceOptions200Response ModChoiceGetChoiceOptions(ctx).ModChoiceGetChoiceOptionsRequest(modChoiceGetChoiceOptionsRequest).Execute()

Retrieve options for a specific choice.



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
	modChoiceGetChoiceOptionsRequest := *openapiclient.NewModChoiceGetChoiceOptionsRequest(int32(123)) // ModChoiceGetChoiceOptionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModChoiceAPI.ModChoiceGetChoiceOptions(context.Background()).ModChoiceGetChoiceOptionsRequest(modChoiceGetChoiceOptionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModChoiceAPI.ModChoiceGetChoiceOptions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModChoiceGetChoiceOptions`: ModChoiceGetChoiceOptions200Response
	fmt.Fprintf(os.Stdout, "Response from `ModChoiceAPI.ModChoiceGetChoiceOptions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModChoiceGetChoiceOptionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChoiceGetChoiceOptionsRequest** | [**ModChoiceGetChoiceOptionsRequest**](ModChoiceGetChoiceOptionsRequest.md) |  | 

### Return type

[**ModChoiceGetChoiceOptions200Response**](ModChoiceGetChoiceOptions200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModChoiceGetChoiceResults

> ModChoiceGetChoiceResults200Response ModChoiceGetChoiceResults(ctx).ModChoiceGetChoiceOptionsRequest(modChoiceGetChoiceOptionsRequest).Execute()

Retrieve users results for a given choice.



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
	modChoiceGetChoiceOptionsRequest := *openapiclient.NewModChoiceGetChoiceOptionsRequest(int32(123)) // ModChoiceGetChoiceOptionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModChoiceAPI.ModChoiceGetChoiceResults(context.Background()).ModChoiceGetChoiceOptionsRequest(modChoiceGetChoiceOptionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModChoiceAPI.ModChoiceGetChoiceResults``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModChoiceGetChoiceResults`: ModChoiceGetChoiceResults200Response
	fmt.Fprintf(os.Stdout, "Response from `ModChoiceAPI.ModChoiceGetChoiceResults`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModChoiceGetChoiceResultsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChoiceGetChoiceOptionsRequest** | [**ModChoiceGetChoiceOptionsRequest**](ModChoiceGetChoiceOptionsRequest.md) |  | 

### Return type

[**ModChoiceGetChoiceResults200Response**](ModChoiceGetChoiceResults200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModChoiceGetChoicesByCourses

> ModChoiceGetChoicesByCourses200Response ModChoiceGetChoicesByCourses(ctx).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()

Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.



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
	modChatGetChatsByCoursesRequest := *openapiclient.NewModChatGetChatsByCoursesRequest() // ModChatGetChatsByCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModChoiceAPI.ModChoiceGetChoicesByCourses(context.Background()).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModChoiceAPI.ModChoiceGetChoicesByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModChoiceGetChoicesByCourses`: ModChoiceGetChoicesByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModChoiceAPI.ModChoiceGetChoicesByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModChoiceGetChoicesByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | 

### Return type

[**ModChoiceGetChoicesByCourses200Response**](ModChoiceGetChoicesByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModChoiceSubmitChoiceResponse

> ModChoiceSubmitChoiceResponse200Response ModChoiceSubmitChoiceResponse(ctx).ModChoiceSubmitChoiceResponseRequest(modChoiceSubmitChoiceResponseRequest).Execute()

Submit responses to a specific choice item.



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
	modChoiceSubmitChoiceResponseRequest := *openapiclient.NewModChoiceSubmitChoiceResponseRequest(int32(123), []map[string]interface{}{map[string]interface{}(123)}) // ModChoiceSubmitChoiceResponseRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModChoiceAPI.ModChoiceSubmitChoiceResponse(context.Background()).ModChoiceSubmitChoiceResponseRequest(modChoiceSubmitChoiceResponseRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModChoiceAPI.ModChoiceSubmitChoiceResponse``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModChoiceSubmitChoiceResponse`: ModChoiceSubmitChoiceResponse200Response
	fmt.Fprintf(os.Stdout, "Response from `ModChoiceAPI.ModChoiceSubmitChoiceResponse`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModChoiceSubmitChoiceResponseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChoiceSubmitChoiceResponseRequest** | [**ModChoiceSubmitChoiceResponseRequest**](ModChoiceSubmitChoiceResponseRequest.md) |  | 

### Return type

[**ModChoiceSubmitChoiceResponse200Response**](ModChoiceSubmitChoiceResponse200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModChoiceViewChoice

> CoreCalendarDeleteSubscription200Response ModChoiceViewChoice(ctx).ModChoiceGetChoiceOptionsRequest(modChoiceGetChoiceOptionsRequest).Execute()

Trigger the course module viewed event and update the module completion status.



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
	modChoiceGetChoiceOptionsRequest := *openapiclient.NewModChoiceGetChoiceOptionsRequest(int32(123)) // ModChoiceGetChoiceOptionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModChoiceAPI.ModChoiceViewChoice(context.Background()).ModChoiceGetChoiceOptionsRequest(modChoiceGetChoiceOptionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModChoiceAPI.ModChoiceViewChoice``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModChoiceViewChoice`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModChoiceAPI.ModChoiceViewChoice`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModChoiceViewChoiceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChoiceGetChoiceOptionsRequest** | [**ModChoiceGetChoiceOptionsRequest**](ModChoiceGetChoiceOptionsRequest.md) |  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

