# \ModFeedbackAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModFeedbackGetAnalysis**](ModFeedbackAPI.md#ModFeedbackGetAnalysis) | **Post** /mod_feedback_get_analysis | Retrieves the feedback analysis.
[**ModFeedbackGetCurrentCompletedTmp**](ModFeedbackAPI.md#ModFeedbackGetCurrentCompletedTmp) | **Post** /mod_feedback_get_current_completed_tmp | Returns the temporary completion record for the current user.
[**ModFeedbackGetFeedbackAccessInformation**](ModFeedbackAPI.md#ModFeedbackGetFeedbackAccessInformation) | **Post** /mod_feedback_get_feedback_access_information | Return access information for a given feedback.
[**ModFeedbackGetFeedbacksByCourses**](ModFeedbackAPI.md#ModFeedbackGetFeedbacksByCourses) | **Post** /mod_feedback_get_feedbacks_by_courses | Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.
[**ModFeedbackGetFinishedResponses**](ModFeedbackAPI.md#ModFeedbackGetFinishedResponses) | **Post** /mod_feedback_get_finished_responses | Retrieves responses from the last finished attempt.
[**ModFeedbackGetItems**](ModFeedbackAPI.md#ModFeedbackGetItems) | **Post** /mod_feedback_get_items | Returns the items (questions) in the given feedback.
[**ModFeedbackGetLastCompleted**](ModFeedbackAPI.md#ModFeedbackGetLastCompleted) | **Post** /mod_feedback_get_last_completed | Retrieves the last completion record for the current user.
[**ModFeedbackGetNonRespondents**](ModFeedbackAPI.md#ModFeedbackGetNonRespondents) | **Post** /mod_feedback_get_non_respondents | Retrieves a list of students who didn&#39;t submit the feedback.
[**ModFeedbackGetPageItems**](ModFeedbackAPI.md#ModFeedbackGetPageItems) | **Post** /mod_feedback_get_page_items | Get a single feedback page items.
[**ModFeedbackGetResponsesAnalysis**](ModFeedbackAPI.md#ModFeedbackGetResponsesAnalysis) | **Post** /mod_feedback_get_responses_analysis | Return the feedback user responses analysis.
[**ModFeedbackGetUnfinishedResponses**](ModFeedbackAPI.md#ModFeedbackGetUnfinishedResponses) | **Post** /mod_feedback_get_unfinished_responses | Retrieves responses from the current unfinished attempt.
[**ModFeedbackLaunchFeedback**](ModFeedbackAPI.md#ModFeedbackLaunchFeedback) | **Post** /mod_feedback_launch_feedback | Starts or continues a feedback submission.
[**ModFeedbackProcessPage**](ModFeedbackAPI.md#ModFeedbackProcessPage) | **Post** /mod_feedback_process_page | Process a jump between pages.
[**ModFeedbackViewFeedback**](ModFeedbackAPI.md#ModFeedbackViewFeedback) | **Post** /mod_feedback_view_feedback | Trigger the course module viewed event and update the module completion status.



## ModFeedbackGetAnalysis

> ModFeedbackGetAnalysis200Response ModFeedbackGetAnalysis(ctx).ModFeedbackGetAnalysisRequest(modFeedbackGetAnalysisRequest).Execute()

Retrieves the feedback analysis.



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
	modFeedbackGetAnalysisRequest := *openapiclient.NewModFeedbackGetAnalysisRequest(int32(123)) // ModFeedbackGetAnalysisRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModFeedbackAPI.ModFeedbackGetAnalysis(context.Background()).ModFeedbackGetAnalysisRequest(modFeedbackGetAnalysisRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModFeedbackAPI.ModFeedbackGetAnalysis``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModFeedbackGetAnalysis`: ModFeedbackGetAnalysis200Response
	fmt.Fprintf(os.Stdout, "Response from `ModFeedbackAPI.ModFeedbackGetAnalysis`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModFeedbackGetAnalysisRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modFeedbackGetAnalysisRequest** | [**ModFeedbackGetAnalysisRequest**](ModFeedbackGetAnalysisRequest.md) |  | 

### Return type

[**ModFeedbackGetAnalysis200Response**](ModFeedbackGetAnalysis200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModFeedbackGetCurrentCompletedTmp

> ModFeedbackGetCurrentCompletedTmp200Response ModFeedbackGetCurrentCompletedTmp(ctx).ModFeedbackGetCurrentCompletedTmpRequest(modFeedbackGetCurrentCompletedTmpRequest).Execute()

Returns the temporary completion record for the current user.



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
	modFeedbackGetCurrentCompletedTmpRequest := *openapiclient.NewModFeedbackGetCurrentCompletedTmpRequest(int32(123)) // ModFeedbackGetCurrentCompletedTmpRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModFeedbackAPI.ModFeedbackGetCurrentCompletedTmp(context.Background()).ModFeedbackGetCurrentCompletedTmpRequest(modFeedbackGetCurrentCompletedTmpRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModFeedbackAPI.ModFeedbackGetCurrentCompletedTmp``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModFeedbackGetCurrentCompletedTmp`: ModFeedbackGetCurrentCompletedTmp200Response
	fmt.Fprintf(os.Stdout, "Response from `ModFeedbackAPI.ModFeedbackGetCurrentCompletedTmp`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModFeedbackGetCurrentCompletedTmpRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modFeedbackGetCurrentCompletedTmpRequest** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md) |  | 

### Return type

[**ModFeedbackGetCurrentCompletedTmp200Response**](ModFeedbackGetCurrentCompletedTmp200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModFeedbackGetFeedbackAccessInformation

> ModFeedbackGetFeedbackAccessInformation200Response ModFeedbackGetFeedbackAccessInformation(ctx).ModFeedbackGetFeedbackAccessInformationRequest(modFeedbackGetFeedbackAccessInformationRequest).Execute()

Return access information for a given feedback.



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
	modFeedbackGetFeedbackAccessInformationRequest := *openapiclient.NewModFeedbackGetFeedbackAccessInformationRequest(int32(123)) // ModFeedbackGetFeedbackAccessInformationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModFeedbackAPI.ModFeedbackGetFeedbackAccessInformation(context.Background()).ModFeedbackGetFeedbackAccessInformationRequest(modFeedbackGetFeedbackAccessInformationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModFeedbackAPI.ModFeedbackGetFeedbackAccessInformation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModFeedbackGetFeedbackAccessInformation`: ModFeedbackGetFeedbackAccessInformation200Response
	fmt.Fprintf(os.Stdout, "Response from `ModFeedbackAPI.ModFeedbackGetFeedbackAccessInformation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModFeedbackGetFeedbackAccessInformationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modFeedbackGetFeedbackAccessInformationRequest** | [**ModFeedbackGetFeedbackAccessInformationRequest**](ModFeedbackGetFeedbackAccessInformationRequest.md) |  | 

### Return type

[**ModFeedbackGetFeedbackAccessInformation200Response**](ModFeedbackGetFeedbackAccessInformation200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModFeedbackGetFeedbacksByCourses

> ModFeedbackGetFeedbacksByCourses200Response ModFeedbackGetFeedbacksByCourses(ctx).ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest).Execute()

Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.



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
	modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest := *openapiclient.NewModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest() // ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModFeedbackAPI.ModFeedbackGetFeedbacksByCourses(context.Background()).ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModFeedbackAPI.ModFeedbackGetFeedbacksByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModFeedbackGetFeedbacksByCourses`: ModFeedbackGetFeedbacksByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModFeedbackAPI.ModFeedbackGetFeedbacksByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModFeedbackGetFeedbacksByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  | 

### Return type

[**ModFeedbackGetFeedbacksByCourses200Response**](ModFeedbackGetFeedbacksByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModFeedbackGetFinishedResponses

> ModFeedbackGetFinishedResponses200Response ModFeedbackGetFinishedResponses(ctx).ModFeedbackGetFinishedResponsesRequest(modFeedbackGetFinishedResponsesRequest).Execute()

Retrieves responses from the last finished attempt.



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
	modFeedbackGetFinishedResponsesRequest := *openapiclient.NewModFeedbackGetFinishedResponsesRequest(int32(123)) // ModFeedbackGetFinishedResponsesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModFeedbackAPI.ModFeedbackGetFinishedResponses(context.Background()).ModFeedbackGetFinishedResponsesRequest(modFeedbackGetFinishedResponsesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModFeedbackAPI.ModFeedbackGetFinishedResponses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModFeedbackGetFinishedResponses`: ModFeedbackGetFinishedResponses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModFeedbackAPI.ModFeedbackGetFinishedResponses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModFeedbackGetFinishedResponsesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modFeedbackGetFinishedResponsesRequest** | [**ModFeedbackGetFinishedResponsesRequest**](ModFeedbackGetFinishedResponsesRequest.md) |  | 

### Return type

[**ModFeedbackGetFinishedResponses200Response**](ModFeedbackGetFinishedResponses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModFeedbackGetItems

> ModFeedbackGetItems200Response ModFeedbackGetItems(ctx).ModFeedbackGetCurrentCompletedTmpRequest(modFeedbackGetCurrentCompletedTmpRequest).Execute()

Returns the items (questions) in the given feedback.



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
	modFeedbackGetCurrentCompletedTmpRequest := *openapiclient.NewModFeedbackGetCurrentCompletedTmpRequest(int32(123)) // ModFeedbackGetCurrentCompletedTmpRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModFeedbackAPI.ModFeedbackGetItems(context.Background()).ModFeedbackGetCurrentCompletedTmpRequest(modFeedbackGetCurrentCompletedTmpRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModFeedbackAPI.ModFeedbackGetItems``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModFeedbackGetItems`: ModFeedbackGetItems200Response
	fmt.Fprintf(os.Stdout, "Response from `ModFeedbackAPI.ModFeedbackGetItems`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModFeedbackGetItemsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modFeedbackGetCurrentCompletedTmpRequest** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md) |  | 

### Return type

[**ModFeedbackGetItems200Response**](ModFeedbackGetItems200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModFeedbackGetLastCompleted

> ModFeedbackGetLastCompleted200Response ModFeedbackGetLastCompleted(ctx).ModFeedbackGetCurrentCompletedTmpRequest(modFeedbackGetCurrentCompletedTmpRequest).Execute()

Retrieves the last completion record for the current user.



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
	modFeedbackGetCurrentCompletedTmpRequest := *openapiclient.NewModFeedbackGetCurrentCompletedTmpRequest(int32(123)) // ModFeedbackGetCurrentCompletedTmpRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModFeedbackAPI.ModFeedbackGetLastCompleted(context.Background()).ModFeedbackGetCurrentCompletedTmpRequest(modFeedbackGetCurrentCompletedTmpRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModFeedbackAPI.ModFeedbackGetLastCompleted``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModFeedbackGetLastCompleted`: ModFeedbackGetLastCompleted200Response
	fmt.Fprintf(os.Stdout, "Response from `ModFeedbackAPI.ModFeedbackGetLastCompleted`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModFeedbackGetLastCompletedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modFeedbackGetCurrentCompletedTmpRequest** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md) |  | 

### Return type

[**ModFeedbackGetLastCompleted200Response**](ModFeedbackGetLastCompleted200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModFeedbackGetNonRespondents

> ModFeedbackGetNonRespondents200Response ModFeedbackGetNonRespondents(ctx).ModFeedbackGetNonRespondentsRequest(modFeedbackGetNonRespondentsRequest).Execute()

Retrieves a list of students who didn't submit the feedback.



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
	modFeedbackGetNonRespondentsRequest := *openapiclient.NewModFeedbackGetNonRespondentsRequest(int32(123)) // ModFeedbackGetNonRespondentsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModFeedbackAPI.ModFeedbackGetNonRespondents(context.Background()).ModFeedbackGetNonRespondentsRequest(modFeedbackGetNonRespondentsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModFeedbackAPI.ModFeedbackGetNonRespondents``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModFeedbackGetNonRespondents`: ModFeedbackGetNonRespondents200Response
	fmt.Fprintf(os.Stdout, "Response from `ModFeedbackAPI.ModFeedbackGetNonRespondents`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModFeedbackGetNonRespondentsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modFeedbackGetNonRespondentsRequest** | [**ModFeedbackGetNonRespondentsRequest**](ModFeedbackGetNonRespondentsRequest.md) |  | 

### Return type

[**ModFeedbackGetNonRespondents200Response**](ModFeedbackGetNonRespondents200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModFeedbackGetPageItems

> ModFeedbackGetPageItems200Response ModFeedbackGetPageItems(ctx).ModFeedbackGetPageItemsRequest(modFeedbackGetPageItemsRequest).Execute()

Get a single feedback page items.



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
	modFeedbackGetPageItemsRequest := *openapiclient.NewModFeedbackGetPageItemsRequest(int32(123), int32(123)) // ModFeedbackGetPageItemsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModFeedbackAPI.ModFeedbackGetPageItems(context.Background()).ModFeedbackGetPageItemsRequest(modFeedbackGetPageItemsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModFeedbackAPI.ModFeedbackGetPageItems``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModFeedbackGetPageItems`: ModFeedbackGetPageItems200Response
	fmt.Fprintf(os.Stdout, "Response from `ModFeedbackAPI.ModFeedbackGetPageItems`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModFeedbackGetPageItemsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modFeedbackGetPageItemsRequest** | [**ModFeedbackGetPageItemsRequest**](ModFeedbackGetPageItemsRequest.md) |  | 

### Return type

[**ModFeedbackGetPageItems200Response**](ModFeedbackGetPageItems200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModFeedbackGetResponsesAnalysis

> ModFeedbackGetResponsesAnalysis200Response ModFeedbackGetResponsesAnalysis(ctx).ModFeedbackGetResponsesAnalysisRequest(modFeedbackGetResponsesAnalysisRequest).Execute()

Return the feedback user responses analysis.



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
	modFeedbackGetResponsesAnalysisRequest := *openapiclient.NewModFeedbackGetResponsesAnalysisRequest(int32(123)) // ModFeedbackGetResponsesAnalysisRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModFeedbackAPI.ModFeedbackGetResponsesAnalysis(context.Background()).ModFeedbackGetResponsesAnalysisRequest(modFeedbackGetResponsesAnalysisRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModFeedbackAPI.ModFeedbackGetResponsesAnalysis``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModFeedbackGetResponsesAnalysis`: ModFeedbackGetResponsesAnalysis200Response
	fmt.Fprintf(os.Stdout, "Response from `ModFeedbackAPI.ModFeedbackGetResponsesAnalysis`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModFeedbackGetResponsesAnalysisRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modFeedbackGetResponsesAnalysisRequest** | [**ModFeedbackGetResponsesAnalysisRequest**](ModFeedbackGetResponsesAnalysisRequest.md) |  | 

### Return type

[**ModFeedbackGetResponsesAnalysis200Response**](ModFeedbackGetResponsesAnalysis200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModFeedbackGetUnfinishedResponses

> ModFeedbackGetUnfinishedResponses200Response ModFeedbackGetUnfinishedResponses(ctx).ModFeedbackGetFinishedResponsesRequest(modFeedbackGetFinishedResponsesRequest).Execute()

Retrieves responses from the current unfinished attempt.



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
	modFeedbackGetFinishedResponsesRequest := *openapiclient.NewModFeedbackGetFinishedResponsesRequest(int32(123)) // ModFeedbackGetFinishedResponsesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModFeedbackAPI.ModFeedbackGetUnfinishedResponses(context.Background()).ModFeedbackGetFinishedResponsesRequest(modFeedbackGetFinishedResponsesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModFeedbackAPI.ModFeedbackGetUnfinishedResponses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModFeedbackGetUnfinishedResponses`: ModFeedbackGetUnfinishedResponses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModFeedbackAPI.ModFeedbackGetUnfinishedResponses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModFeedbackGetUnfinishedResponsesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modFeedbackGetFinishedResponsesRequest** | [**ModFeedbackGetFinishedResponsesRequest**](ModFeedbackGetFinishedResponsesRequest.md) |  | 

### Return type

[**ModFeedbackGetUnfinishedResponses200Response**](ModFeedbackGetUnfinishedResponses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModFeedbackLaunchFeedback

> ModFeedbackLaunchFeedback200Response ModFeedbackLaunchFeedback(ctx).ModFeedbackGetCurrentCompletedTmpRequest(modFeedbackGetCurrentCompletedTmpRequest).Execute()

Starts or continues a feedback submission.



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
	modFeedbackGetCurrentCompletedTmpRequest := *openapiclient.NewModFeedbackGetCurrentCompletedTmpRequest(int32(123)) // ModFeedbackGetCurrentCompletedTmpRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModFeedbackAPI.ModFeedbackLaunchFeedback(context.Background()).ModFeedbackGetCurrentCompletedTmpRequest(modFeedbackGetCurrentCompletedTmpRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModFeedbackAPI.ModFeedbackLaunchFeedback``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModFeedbackLaunchFeedback`: ModFeedbackLaunchFeedback200Response
	fmt.Fprintf(os.Stdout, "Response from `ModFeedbackAPI.ModFeedbackLaunchFeedback`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModFeedbackLaunchFeedbackRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modFeedbackGetCurrentCompletedTmpRequest** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md) |  | 

### Return type

[**ModFeedbackLaunchFeedback200Response**](ModFeedbackLaunchFeedback200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModFeedbackProcessPage

> ModFeedbackProcessPage200Response ModFeedbackProcessPage(ctx).ModFeedbackProcessPageRequest(modFeedbackProcessPageRequest).Execute()

Process a jump between pages.



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
	modFeedbackProcessPageRequest := *openapiclient.NewModFeedbackProcessPageRequest(int32(123), int32(123)) // ModFeedbackProcessPageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModFeedbackAPI.ModFeedbackProcessPage(context.Background()).ModFeedbackProcessPageRequest(modFeedbackProcessPageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModFeedbackAPI.ModFeedbackProcessPage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModFeedbackProcessPage`: ModFeedbackProcessPage200Response
	fmt.Fprintf(os.Stdout, "Response from `ModFeedbackAPI.ModFeedbackProcessPage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModFeedbackProcessPageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modFeedbackProcessPageRequest** | [**ModFeedbackProcessPageRequest**](ModFeedbackProcessPageRequest.md) |  | 

### Return type

[**ModFeedbackProcessPage200Response**](ModFeedbackProcessPage200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModFeedbackViewFeedback

> CoreCalendarDeleteSubscription200Response ModFeedbackViewFeedback(ctx).ModFeedbackViewFeedbackRequest(modFeedbackViewFeedbackRequest).Execute()

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
	modFeedbackViewFeedbackRequest := *openapiclient.NewModFeedbackViewFeedbackRequest(int32(123)) // ModFeedbackViewFeedbackRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModFeedbackAPI.ModFeedbackViewFeedback(context.Background()).ModFeedbackViewFeedbackRequest(modFeedbackViewFeedbackRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModFeedbackAPI.ModFeedbackViewFeedback``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModFeedbackViewFeedback`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModFeedbackAPI.ModFeedbackViewFeedback`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModFeedbackViewFeedbackRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modFeedbackViewFeedbackRequest** | [**ModFeedbackViewFeedbackRequest**](ModFeedbackViewFeedbackRequest.md) |  | 

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

