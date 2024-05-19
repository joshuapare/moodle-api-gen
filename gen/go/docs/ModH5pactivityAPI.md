# \ModH5pactivityAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModH5pactivityGetAttempts**](ModH5pactivityAPI.md#ModH5pactivityGetAttempts) | **Post** /mod_h5pactivity_get_attempts | Return the information needed to list a user attempts.
[**ModH5pactivityGetH5pactivitiesByCourses**](ModH5pactivityAPI.md#ModH5pactivityGetH5pactivitiesByCourses) | **Post** /mod_h5pactivity_get_h5pactivities_by_courses | Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.
[**ModH5pactivityGetH5pactivityAccessInformation**](ModH5pactivityAPI.md#ModH5pactivityGetH5pactivityAccessInformation) | **Post** /mod_h5pactivity_get_h5pactivity_access_information | Return access information for a given h5p activity.
[**ModH5pactivityGetResults**](ModH5pactivityAPI.md#ModH5pactivityGetResults) | **Post** /mod_h5pactivity_get_results | Return the information needed to list a user attempt results.
[**ModH5pactivityGetUserAttempts**](ModH5pactivityAPI.md#ModH5pactivityGetUserAttempts) | **Post** /mod_h5pactivity_get_user_attempts | Return the information needed to list all enrolled user attempts.
[**ModH5pactivityLogReportViewed**](ModH5pactivityAPI.md#ModH5pactivityLogReportViewed) | **Post** /mod_h5pactivity_log_report_viewed | Log that the h5pactivity was viewed.
[**ModH5pactivityViewH5pactivity**](ModH5pactivityAPI.md#ModH5pactivityViewH5pactivity) | **Post** /mod_h5pactivity_view_h5pactivity | Trigger the course module viewed event and update the module completion status.



## ModH5pactivityGetAttempts

> ModH5pactivityGetAttempts200Response ModH5pactivityGetAttempts(ctx).ModH5pactivityGetAttemptsRequest(modH5pactivityGetAttemptsRequest).Execute()

Return the information needed to list a user attempts.



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
	modH5pactivityGetAttemptsRequest := *openapiclient.NewModH5pactivityGetAttemptsRequest(int32(123)) // ModH5pactivityGetAttemptsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModH5pactivityAPI.ModH5pactivityGetAttempts(context.Background()).ModH5pactivityGetAttemptsRequest(modH5pactivityGetAttemptsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModH5pactivityAPI.ModH5pactivityGetAttempts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModH5pactivityGetAttempts`: ModH5pactivityGetAttempts200Response
	fmt.Fprintf(os.Stdout, "Response from `ModH5pactivityAPI.ModH5pactivityGetAttempts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModH5pactivityGetAttemptsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modH5pactivityGetAttemptsRequest** | [**ModH5pactivityGetAttemptsRequest**](ModH5pactivityGetAttemptsRequest.md) |  | 

### Return type

[**ModH5pactivityGetAttempts200Response**](ModH5pactivityGetAttempts200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModH5pactivityGetH5pactivitiesByCourses

> ModH5pactivityGetH5pactivitiesByCourses200Response ModH5pactivityGetH5pactivitiesByCourses(ctx).ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest).Execute()

Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.



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
	resp, r, err := apiClient.ModH5pactivityAPI.ModH5pactivityGetH5pactivitiesByCourses(context.Background()).ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModH5pactivityAPI.ModH5pactivityGetH5pactivitiesByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModH5pactivityGetH5pactivitiesByCourses`: ModH5pactivityGetH5pactivitiesByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModH5pactivityAPI.ModH5pactivityGetH5pactivitiesByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModH5pactivityGetH5pactivitiesByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  | 

### Return type

[**ModH5pactivityGetH5pactivitiesByCourses200Response**](ModH5pactivityGetH5pactivitiesByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModH5pactivityGetH5pactivityAccessInformation

> ModH5pactivityGetH5pactivityAccessInformation200Response ModH5pactivityGetH5pactivityAccessInformation(ctx).ModH5pactivityGetH5pactivityAccessInformationRequest(modH5pactivityGetH5pactivityAccessInformationRequest).Execute()

Return access information for a given h5p activity.



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
	modH5pactivityGetH5pactivityAccessInformationRequest := *openapiclient.NewModH5pactivityGetH5pactivityAccessInformationRequest(int32(123)) // ModH5pactivityGetH5pactivityAccessInformationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModH5pactivityAPI.ModH5pactivityGetH5pactivityAccessInformation(context.Background()).ModH5pactivityGetH5pactivityAccessInformationRequest(modH5pactivityGetH5pactivityAccessInformationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModH5pactivityAPI.ModH5pactivityGetH5pactivityAccessInformation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModH5pactivityGetH5pactivityAccessInformation`: ModH5pactivityGetH5pactivityAccessInformation200Response
	fmt.Fprintf(os.Stdout, "Response from `ModH5pactivityAPI.ModH5pactivityGetH5pactivityAccessInformation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModH5pactivityGetH5pactivityAccessInformationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modH5pactivityGetH5pactivityAccessInformationRequest** | [**ModH5pactivityGetH5pactivityAccessInformationRequest**](ModH5pactivityGetH5pactivityAccessInformationRequest.md) |  | 

### Return type

[**ModH5pactivityGetH5pactivityAccessInformation200Response**](ModH5pactivityGetH5pactivityAccessInformation200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModH5pactivityGetResults

> ModH5pactivityGetResults200Response ModH5pactivityGetResults(ctx).ModH5pactivityGetResultsRequest(modH5pactivityGetResultsRequest).Execute()

Return the information needed to list a user attempt results.



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
	modH5pactivityGetResultsRequest := *openapiclient.NewModH5pactivityGetResultsRequest(int32(123)) // ModH5pactivityGetResultsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModH5pactivityAPI.ModH5pactivityGetResults(context.Background()).ModH5pactivityGetResultsRequest(modH5pactivityGetResultsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModH5pactivityAPI.ModH5pactivityGetResults``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModH5pactivityGetResults`: ModH5pactivityGetResults200Response
	fmt.Fprintf(os.Stdout, "Response from `ModH5pactivityAPI.ModH5pactivityGetResults`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModH5pactivityGetResultsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modH5pactivityGetResultsRequest** | [**ModH5pactivityGetResultsRequest**](ModH5pactivityGetResultsRequest.md) |  | 

### Return type

[**ModH5pactivityGetResults200Response**](ModH5pactivityGetResults200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModH5pactivityGetUserAttempts

> ModH5pactivityGetUserAttempts200Response ModH5pactivityGetUserAttempts(ctx).ModH5pactivityGetUserAttemptsRequest(modH5pactivityGetUserAttemptsRequest).Execute()

Return the information needed to list all enrolled user attempts.



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
	modH5pactivityGetUserAttemptsRequest := *openapiclient.NewModH5pactivityGetUserAttemptsRequest(int32(123)) // ModH5pactivityGetUserAttemptsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModH5pactivityAPI.ModH5pactivityGetUserAttempts(context.Background()).ModH5pactivityGetUserAttemptsRequest(modH5pactivityGetUserAttemptsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModH5pactivityAPI.ModH5pactivityGetUserAttempts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModH5pactivityGetUserAttempts`: ModH5pactivityGetUserAttempts200Response
	fmt.Fprintf(os.Stdout, "Response from `ModH5pactivityAPI.ModH5pactivityGetUserAttempts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModH5pactivityGetUserAttemptsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modH5pactivityGetUserAttemptsRequest** | [**ModH5pactivityGetUserAttemptsRequest**](ModH5pactivityGetUserAttemptsRequest.md) |  | 

### Return type

[**ModH5pactivityGetUserAttempts200Response**](ModH5pactivityGetUserAttempts200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModH5pactivityLogReportViewed

> CoreCalendarDeleteSubscription200Response ModH5pactivityLogReportViewed(ctx).ModH5pactivityLogReportViewedRequest(modH5pactivityLogReportViewedRequest).Execute()

Log that the h5pactivity was viewed.



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
	modH5pactivityLogReportViewedRequest := *openapiclient.NewModH5pactivityLogReportViewedRequest(int32(123)) // ModH5pactivityLogReportViewedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModH5pactivityAPI.ModH5pactivityLogReportViewed(context.Background()).ModH5pactivityLogReportViewedRequest(modH5pactivityLogReportViewedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModH5pactivityAPI.ModH5pactivityLogReportViewed``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModH5pactivityLogReportViewed`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModH5pactivityAPI.ModH5pactivityLogReportViewed`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModH5pactivityLogReportViewedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modH5pactivityLogReportViewedRequest** | [**ModH5pactivityLogReportViewedRequest**](ModH5pactivityLogReportViewedRequest.md) |  | 

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


## ModH5pactivityViewH5pactivity

> CoreCalendarDeleteSubscription200Response ModH5pactivityViewH5pactivity(ctx).ModH5pactivityViewH5pactivityRequest(modH5pactivityViewH5pactivityRequest).Execute()

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
	modH5pactivityViewH5pactivityRequest := *openapiclient.NewModH5pactivityViewH5pactivityRequest(int32(123)) // ModH5pactivityViewH5pactivityRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModH5pactivityAPI.ModH5pactivityViewH5pactivity(context.Background()).ModH5pactivityViewH5pactivityRequest(modH5pactivityViewH5pactivityRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModH5pactivityAPI.ModH5pactivityViewH5pactivity``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModH5pactivityViewH5pactivity`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModH5pactivityAPI.ModH5pactivityViewH5pactivity`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModH5pactivityViewH5pactivityRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modH5pactivityViewH5pactivityRequest** | [**ModH5pactivityViewH5pactivityRequest**](ModH5pactivityViewH5pactivityRequest.md) |  | 

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

