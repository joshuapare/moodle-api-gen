# \ModBigbluebuttonbnAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModBigbluebuttonbnCanJoin**](ModBigbluebuttonbnAPI.md#ModBigbluebuttonbnCanJoin) | **Post** /mod_bigbluebuttonbn_can_join | Returns information if the current user can join or not.
[**ModBigbluebuttonbnCompletionValidate**](ModBigbluebuttonbnAPI.md#ModBigbluebuttonbnCompletionValidate) | **Post** /mod_bigbluebuttonbn_completion_validate | Validate completion
[**ModBigbluebuttonbnEndMeeting**](ModBigbluebuttonbnAPI.md#ModBigbluebuttonbnEndMeeting) | **Post** /mod_bigbluebuttonbn_end_meeting | End a meeting
[**ModBigbluebuttonbnGetBigbluebuttonbnsByCourses**](ModBigbluebuttonbnAPI.md#ModBigbluebuttonbnGetBigbluebuttonbnsByCourses) | **Post** /mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses | Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.
[**ModBigbluebuttonbnGetJoinUrl**](ModBigbluebuttonbnAPI.md#ModBigbluebuttonbnGetJoinUrl) | **Post** /mod_bigbluebuttonbn_get_join_url | Get the join URL for the meeting and create if it does not exist.
[**ModBigbluebuttonbnGetRecordings**](ModBigbluebuttonbnAPI.md#ModBigbluebuttonbnGetRecordings) | **Post** /mod_bigbluebuttonbn_get_recordings | Returns a list of recordings ready to be processed by a datatable.
[**ModBigbluebuttonbnGetRecordingsToImport**](ModBigbluebuttonbnAPI.md#ModBigbluebuttonbnGetRecordingsToImport) | **Post** /mod_bigbluebuttonbn_get_recordings_to_import | Returns a list of recordings ready to import to be processed by a datatable.
[**ModBigbluebuttonbnMeetingInfo**](ModBigbluebuttonbnAPI.md#ModBigbluebuttonbnMeetingInfo) | **Post** /mod_bigbluebuttonbn_meeting_info | Get displayable information on the meeting
[**ModBigbluebuttonbnUpdateRecording**](ModBigbluebuttonbnAPI.md#ModBigbluebuttonbnUpdateRecording) | **Post** /mod_bigbluebuttonbn_update_recording | Update a single recording
[**ModBigbluebuttonbnViewBigbluebuttonbn**](ModBigbluebuttonbnAPI.md#ModBigbluebuttonbnViewBigbluebuttonbn) | **Post** /mod_bigbluebuttonbn_view_bigbluebuttonbn | Trigger the course module viewed event and update the module completion status.



## ModBigbluebuttonbnCanJoin

> ModBigbluebuttonbnCanJoin200Response ModBigbluebuttonbnCanJoin(ctx).ModBigbluebuttonbnCanJoinRequest(modBigbluebuttonbnCanJoinRequest).Execute()

Returns information if the current user can join or not.



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
	modBigbluebuttonbnCanJoinRequest := *openapiclient.NewModBigbluebuttonbnCanJoinRequest(int32(123)) // ModBigbluebuttonbnCanJoinRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModBigbluebuttonbnAPI.ModBigbluebuttonbnCanJoin(context.Background()).ModBigbluebuttonbnCanJoinRequest(modBigbluebuttonbnCanJoinRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModBigbluebuttonbnAPI.ModBigbluebuttonbnCanJoin``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModBigbluebuttonbnCanJoin`: ModBigbluebuttonbnCanJoin200Response
	fmt.Fprintf(os.Stdout, "Response from `ModBigbluebuttonbnAPI.ModBigbluebuttonbnCanJoin`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModBigbluebuttonbnCanJoinRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modBigbluebuttonbnCanJoinRequest** | [**ModBigbluebuttonbnCanJoinRequest**](ModBigbluebuttonbnCanJoinRequest.md) |  | 

### Return type

[**ModBigbluebuttonbnCanJoin200Response**](ModBigbluebuttonbnCanJoin200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModBigbluebuttonbnCompletionValidate

> CoreCohortAddCohortMembers200Response ModBigbluebuttonbnCompletionValidate(ctx).ModBigbluebuttonbnCompletionValidateRequest(modBigbluebuttonbnCompletionValidateRequest).Execute()

Validate completion



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
	modBigbluebuttonbnCompletionValidateRequest := *openapiclient.NewModBigbluebuttonbnCompletionValidateRequest(int32(123)) // ModBigbluebuttonbnCompletionValidateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModBigbluebuttonbnAPI.ModBigbluebuttonbnCompletionValidate(context.Background()).ModBigbluebuttonbnCompletionValidateRequest(modBigbluebuttonbnCompletionValidateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModBigbluebuttonbnAPI.ModBigbluebuttonbnCompletionValidate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModBigbluebuttonbnCompletionValidate`: CoreCohortAddCohortMembers200Response
	fmt.Fprintf(os.Stdout, "Response from `ModBigbluebuttonbnAPI.ModBigbluebuttonbnCompletionValidate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModBigbluebuttonbnCompletionValidateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modBigbluebuttonbnCompletionValidateRequest** | [**ModBigbluebuttonbnCompletionValidateRequest**](ModBigbluebuttonbnCompletionValidateRequest.md) |  | 

### Return type

[**CoreCohortAddCohortMembers200Response**](CoreCohortAddCohortMembers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModBigbluebuttonbnEndMeeting

> CoreCohortAddCohortMembers200Response ModBigbluebuttonbnEndMeeting(ctx).ModBigbluebuttonbnEndMeetingRequest(modBigbluebuttonbnEndMeetingRequest).Execute()

End a meeting



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
	modBigbluebuttonbnEndMeetingRequest := *openapiclient.NewModBigbluebuttonbnEndMeetingRequest(int32(123)) // ModBigbluebuttonbnEndMeetingRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModBigbluebuttonbnAPI.ModBigbluebuttonbnEndMeeting(context.Background()).ModBigbluebuttonbnEndMeetingRequest(modBigbluebuttonbnEndMeetingRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModBigbluebuttonbnAPI.ModBigbluebuttonbnEndMeeting``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModBigbluebuttonbnEndMeeting`: CoreCohortAddCohortMembers200Response
	fmt.Fprintf(os.Stdout, "Response from `ModBigbluebuttonbnAPI.ModBigbluebuttonbnEndMeeting`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModBigbluebuttonbnEndMeetingRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modBigbluebuttonbnEndMeetingRequest** | [**ModBigbluebuttonbnEndMeetingRequest**](ModBigbluebuttonbnEndMeetingRequest.md) |  | 

### Return type

[**CoreCohortAddCohortMembers200Response**](CoreCohortAddCohortMembers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModBigbluebuttonbnGetBigbluebuttonbnsByCourses

> ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response ModBigbluebuttonbnGetBigbluebuttonbnsByCourses(ctx).ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest).Execute()

Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.



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
	resp, r, err := apiClient.ModBigbluebuttonbnAPI.ModBigbluebuttonbnGetBigbluebuttonbnsByCourses(context.Background()).ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModBigbluebuttonbnAPI.ModBigbluebuttonbnGetBigbluebuttonbnsByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModBigbluebuttonbnGetBigbluebuttonbnsByCourses`: ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModBigbluebuttonbnAPI.ModBigbluebuttonbnGetBigbluebuttonbnsByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  | 

### Return type

[**ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response**](ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModBigbluebuttonbnGetJoinUrl

> ModBigbluebuttonbnGetJoinUrl200Response ModBigbluebuttonbnGetJoinUrl(ctx).ModBigbluebuttonbnCanJoinRequest(modBigbluebuttonbnCanJoinRequest).Execute()

Get the join URL for the meeting and create if it does not exist.



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
	modBigbluebuttonbnCanJoinRequest := *openapiclient.NewModBigbluebuttonbnCanJoinRequest(int32(123)) // ModBigbluebuttonbnCanJoinRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModBigbluebuttonbnAPI.ModBigbluebuttonbnGetJoinUrl(context.Background()).ModBigbluebuttonbnCanJoinRequest(modBigbluebuttonbnCanJoinRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModBigbluebuttonbnAPI.ModBigbluebuttonbnGetJoinUrl``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModBigbluebuttonbnGetJoinUrl`: ModBigbluebuttonbnGetJoinUrl200Response
	fmt.Fprintf(os.Stdout, "Response from `ModBigbluebuttonbnAPI.ModBigbluebuttonbnGetJoinUrl`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModBigbluebuttonbnGetJoinUrlRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modBigbluebuttonbnCanJoinRequest** | [**ModBigbluebuttonbnCanJoinRequest**](ModBigbluebuttonbnCanJoinRequest.md) |  | 

### Return type

[**ModBigbluebuttonbnGetJoinUrl200Response**](ModBigbluebuttonbnGetJoinUrl200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModBigbluebuttonbnGetRecordings

> ModBigbluebuttonbnGetRecordings200Response ModBigbluebuttonbnGetRecordings(ctx).ModBigbluebuttonbnGetRecordingsRequest(modBigbluebuttonbnGetRecordingsRequest).Execute()

Returns a list of recordings ready to be processed by a datatable.



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
	modBigbluebuttonbnGetRecordingsRequest := *openapiclient.NewModBigbluebuttonbnGetRecordingsRequest(int32(123)) // ModBigbluebuttonbnGetRecordingsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModBigbluebuttonbnAPI.ModBigbluebuttonbnGetRecordings(context.Background()).ModBigbluebuttonbnGetRecordingsRequest(modBigbluebuttonbnGetRecordingsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModBigbluebuttonbnAPI.ModBigbluebuttonbnGetRecordings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModBigbluebuttonbnGetRecordings`: ModBigbluebuttonbnGetRecordings200Response
	fmt.Fprintf(os.Stdout, "Response from `ModBigbluebuttonbnAPI.ModBigbluebuttonbnGetRecordings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModBigbluebuttonbnGetRecordingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modBigbluebuttonbnGetRecordingsRequest** | [**ModBigbluebuttonbnGetRecordingsRequest**](ModBigbluebuttonbnGetRecordingsRequest.md) |  | 

### Return type

[**ModBigbluebuttonbnGetRecordings200Response**](ModBigbluebuttonbnGetRecordings200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModBigbluebuttonbnGetRecordingsToImport

> ModBigbluebuttonbnGetRecordingsToImport200Response ModBigbluebuttonbnGetRecordingsToImport(ctx).ModBigbluebuttonbnGetRecordingsToImportRequest(modBigbluebuttonbnGetRecordingsToImportRequest).Execute()

Returns a list of recordings ready to import to be processed by a datatable.



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
	modBigbluebuttonbnGetRecordingsToImportRequest := *openapiclient.NewModBigbluebuttonbnGetRecordingsToImportRequest(int32(123)) // ModBigbluebuttonbnGetRecordingsToImportRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModBigbluebuttonbnAPI.ModBigbluebuttonbnGetRecordingsToImport(context.Background()).ModBigbluebuttonbnGetRecordingsToImportRequest(modBigbluebuttonbnGetRecordingsToImportRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModBigbluebuttonbnAPI.ModBigbluebuttonbnGetRecordingsToImport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModBigbluebuttonbnGetRecordingsToImport`: ModBigbluebuttonbnGetRecordingsToImport200Response
	fmt.Fprintf(os.Stdout, "Response from `ModBigbluebuttonbnAPI.ModBigbluebuttonbnGetRecordingsToImport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModBigbluebuttonbnGetRecordingsToImportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modBigbluebuttonbnGetRecordingsToImportRequest** | [**ModBigbluebuttonbnGetRecordingsToImportRequest**](ModBigbluebuttonbnGetRecordingsToImportRequest.md) |  | 

### Return type

[**ModBigbluebuttonbnGetRecordingsToImport200Response**](ModBigbluebuttonbnGetRecordingsToImport200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModBigbluebuttonbnMeetingInfo

> ModBigbluebuttonbnMeetingInfo200Response ModBigbluebuttonbnMeetingInfo(ctx).ModBigbluebuttonbnMeetingInfoRequest(modBigbluebuttonbnMeetingInfoRequest).Execute()

Get displayable information on the meeting



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
	modBigbluebuttonbnMeetingInfoRequest := *openapiclient.NewModBigbluebuttonbnMeetingInfoRequest(int32(123)) // ModBigbluebuttonbnMeetingInfoRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModBigbluebuttonbnAPI.ModBigbluebuttonbnMeetingInfo(context.Background()).ModBigbluebuttonbnMeetingInfoRequest(modBigbluebuttonbnMeetingInfoRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModBigbluebuttonbnAPI.ModBigbluebuttonbnMeetingInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModBigbluebuttonbnMeetingInfo`: ModBigbluebuttonbnMeetingInfo200Response
	fmt.Fprintf(os.Stdout, "Response from `ModBigbluebuttonbnAPI.ModBigbluebuttonbnMeetingInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModBigbluebuttonbnMeetingInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modBigbluebuttonbnMeetingInfoRequest** | [**ModBigbluebuttonbnMeetingInfoRequest**](ModBigbluebuttonbnMeetingInfoRequest.md) |  | 

### Return type

[**ModBigbluebuttonbnMeetingInfo200Response**](ModBigbluebuttonbnMeetingInfo200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModBigbluebuttonbnUpdateRecording

> map[string]interface{} ModBigbluebuttonbnUpdateRecording(ctx).ModBigbluebuttonbnUpdateRecordingRequest(modBigbluebuttonbnUpdateRecordingRequest).Execute()

Update a single recording



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
	modBigbluebuttonbnUpdateRecordingRequest := *openapiclient.NewModBigbluebuttonbnUpdateRecordingRequest("Action_example", "Additionaloptions_example", int32(123), int32(123)) // ModBigbluebuttonbnUpdateRecordingRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModBigbluebuttonbnAPI.ModBigbluebuttonbnUpdateRecording(context.Background()).ModBigbluebuttonbnUpdateRecordingRequest(modBigbluebuttonbnUpdateRecordingRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModBigbluebuttonbnAPI.ModBigbluebuttonbnUpdateRecording``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModBigbluebuttonbnUpdateRecording`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModBigbluebuttonbnAPI.ModBigbluebuttonbnUpdateRecording`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModBigbluebuttonbnUpdateRecordingRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modBigbluebuttonbnUpdateRecordingRequest** | [**ModBigbluebuttonbnUpdateRecordingRequest**](ModBigbluebuttonbnUpdateRecordingRequest.md) |  | 

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


## ModBigbluebuttonbnViewBigbluebuttonbn

> CoreCalendarDeleteSubscription200Response ModBigbluebuttonbnViewBigbluebuttonbn(ctx).ModBigbluebuttonbnViewBigbluebuttonbnRequest(modBigbluebuttonbnViewBigbluebuttonbnRequest).Execute()

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
	modBigbluebuttonbnViewBigbluebuttonbnRequest := *openapiclient.NewModBigbluebuttonbnViewBigbluebuttonbnRequest(int32(123)) // ModBigbluebuttonbnViewBigbluebuttonbnRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModBigbluebuttonbnAPI.ModBigbluebuttonbnViewBigbluebuttonbn(context.Background()).ModBigbluebuttonbnViewBigbluebuttonbnRequest(modBigbluebuttonbnViewBigbluebuttonbnRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModBigbluebuttonbnAPI.ModBigbluebuttonbnViewBigbluebuttonbn``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModBigbluebuttonbnViewBigbluebuttonbn`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModBigbluebuttonbnAPI.ModBigbluebuttonbnViewBigbluebuttonbn`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModBigbluebuttonbnViewBigbluebuttonbnRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modBigbluebuttonbnViewBigbluebuttonbnRequest** | [**ModBigbluebuttonbnViewBigbluebuttonbnRequest**](ModBigbluebuttonbnViewBigbluebuttonbnRequest.md) |  | 

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

