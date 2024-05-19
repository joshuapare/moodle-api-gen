# \ModAssignAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModAssignCopyPreviousAttempt**](ModAssignAPI.md#ModAssignCopyPreviousAttempt) | **Post** /mod_assign_copy_previous_attempt | Copy a students previous attempt to a new attempt.
[**ModAssignGetAssignments**](ModAssignAPI.md#ModAssignGetAssignments) | **Post** /mod_assign_get_assignments | Returns the courses and assignments for the users capability
[**ModAssignGetGrades**](ModAssignAPI.md#ModAssignGetGrades) | **Post** /mod_assign_get_grades | Returns grades from the assignment
[**ModAssignGetParticipant**](ModAssignAPI.md#ModAssignGetParticipant) | **Post** /mod_assign_get_participant | Get a participant for an assignment, with some summary info about their submissions.
[**ModAssignGetSubmissionStatus**](ModAssignAPI.md#ModAssignGetSubmissionStatus) | **Post** /mod_assign_get_submission_status | Returns information about an assignment submission status for a given user.
[**ModAssignGetSubmissions**](ModAssignAPI.md#ModAssignGetSubmissions) | **Post** /mod_assign_get_submissions | Returns the submissions for assignments
[**ModAssignGetUserFlags**](ModAssignAPI.md#ModAssignGetUserFlags) | **Post** /mod_assign_get_user_flags | Returns the user flags for assignments
[**ModAssignGetUserMappings**](ModAssignAPI.md#ModAssignGetUserMappings) | **Post** /mod_assign_get_user_mappings | Returns the blind marking mappings for assignments
[**ModAssignListParticipants**](ModAssignAPI.md#ModAssignListParticipants) | **Post** /mod_assign_list_participants | List the participants for a single assignment, with some summary info about their submissions.
[**ModAssignLockSubmissions**](ModAssignAPI.md#ModAssignLockSubmissions) | **Post** /mod_assign_lock_submissions | Prevent students from making changes to a list of submissions
[**ModAssignRevealIdentities**](ModAssignAPI.md#ModAssignRevealIdentities) | **Post** /mod_assign_reveal_identities | Reveal the identities for a blind marking assignment
[**ModAssignRevertSubmissionsToDraft**](ModAssignAPI.md#ModAssignRevertSubmissionsToDraft) | **Post** /mod_assign_revert_submissions_to_draft | Reverts the list of submissions to draft status
[**ModAssignSaveGrade**](ModAssignAPI.md#ModAssignSaveGrade) | **Post** /mod_assign_save_grade | Save a grade update for a single student.
[**ModAssignSaveGrades**](ModAssignAPI.md#ModAssignSaveGrades) | **Post** /mod_assign_save_grades | Save multiple grade updates for an assignment.
[**ModAssignSaveSubmission**](ModAssignAPI.md#ModAssignSaveSubmission) | **Post** /mod_assign_save_submission | Update the current students submission
[**ModAssignSaveUserExtensions**](ModAssignAPI.md#ModAssignSaveUserExtensions) | **Post** /mod_assign_save_user_extensions | Save a list of assignment extensions
[**ModAssignSetUserFlags**](ModAssignAPI.md#ModAssignSetUserFlags) | **Post** /mod_assign_set_user_flags | Creates or updates user flags
[**ModAssignStartSubmission**](ModAssignAPI.md#ModAssignStartSubmission) | **Post** /mod_assign_start_submission | Start a submission for user if assignment has a time limit.
[**ModAssignSubmitForGrading**](ModAssignAPI.md#ModAssignSubmitForGrading) | **Post** /mod_assign_submit_for_grading | Submit the current students assignment for grading
[**ModAssignSubmitGradingForm**](ModAssignAPI.md#ModAssignSubmitGradingForm) | **Post** /mod_assign_submit_grading_form | Submit the grading form data via ajax
[**ModAssignUnlockSubmissions**](ModAssignAPI.md#ModAssignUnlockSubmissions) | **Post** /mod_assign_unlock_submissions | Allow students to make changes to a list of submissions
[**ModAssignViewAssign**](ModAssignAPI.md#ModAssignViewAssign) | **Post** /mod_assign_view_assign | Update the module completion status.
[**ModAssignViewGradingTable**](ModAssignAPI.md#ModAssignViewGradingTable) | **Post** /mod_assign_view_grading_table | Trigger the grading_table_viewed event.
[**ModAssignViewSubmissionStatus**](ModAssignAPI.md#ModAssignViewSubmissionStatus) | **Post** /mod_assign_view_submission_status | Trigger the submission status viewed event.



## ModAssignCopyPreviousAttempt

> map[string]interface{} ModAssignCopyPreviousAttempt(ctx).ModAssignCopyPreviousAttemptRequest(modAssignCopyPreviousAttemptRequest).Execute()

Copy a students previous attempt to a new attempt.



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
	modAssignCopyPreviousAttemptRequest := *openapiclient.NewModAssignCopyPreviousAttemptRequest(int32(123)) // ModAssignCopyPreviousAttemptRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignCopyPreviousAttempt(context.Background()).ModAssignCopyPreviousAttemptRequest(modAssignCopyPreviousAttemptRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignCopyPreviousAttempt``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignCopyPreviousAttempt`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignCopyPreviousAttempt`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignCopyPreviousAttemptRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignCopyPreviousAttemptRequest** | [**ModAssignCopyPreviousAttemptRequest**](ModAssignCopyPreviousAttemptRequest.md) |  | 

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


## ModAssignGetAssignments

> ModAssignGetAssignments200Response ModAssignGetAssignments(ctx).ModAssignGetAssignmentsRequest(modAssignGetAssignmentsRequest).Execute()

Returns the courses and assignments for the users capability



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
	modAssignGetAssignmentsRequest := *openapiclient.NewModAssignGetAssignmentsRequest() // ModAssignGetAssignmentsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignGetAssignments(context.Background()).ModAssignGetAssignmentsRequest(modAssignGetAssignmentsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignGetAssignments``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignGetAssignments`: ModAssignGetAssignments200Response
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignGetAssignments`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignGetAssignmentsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignGetAssignmentsRequest** | [**ModAssignGetAssignmentsRequest**](ModAssignGetAssignmentsRequest.md) |  | 

### Return type

[**ModAssignGetAssignments200Response**](ModAssignGetAssignments200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModAssignGetGrades

> ModAssignGetGrades200Response ModAssignGetGrades(ctx).ModAssignGetGradesRequest(modAssignGetGradesRequest).Execute()

Returns grades from the assignment



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
	modAssignGetGradesRequest := *openapiclient.NewModAssignGetGradesRequest([]map[string]interface{}{map[string]interface{}(123)}) // ModAssignGetGradesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignGetGrades(context.Background()).ModAssignGetGradesRequest(modAssignGetGradesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignGetGrades``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignGetGrades`: ModAssignGetGrades200Response
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignGetGrades`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignGetGradesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignGetGradesRequest** | [**ModAssignGetGradesRequest**](ModAssignGetGradesRequest.md) |  | 

### Return type

[**ModAssignGetGrades200Response**](ModAssignGetGrades200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModAssignGetParticipant

> ModAssignGetParticipant200Response ModAssignGetParticipant(ctx).ModAssignGetParticipantRequest(modAssignGetParticipantRequest).Execute()

Get a participant for an assignment, with some summary info about their submissions.



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
	modAssignGetParticipantRequest := *openapiclient.NewModAssignGetParticipantRequest(int32(123), int32(123)) // ModAssignGetParticipantRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignGetParticipant(context.Background()).ModAssignGetParticipantRequest(modAssignGetParticipantRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignGetParticipant``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignGetParticipant`: ModAssignGetParticipant200Response
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignGetParticipant`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignGetParticipantRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignGetParticipantRequest** | [**ModAssignGetParticipantRequest**](ModAssignGetParticipantRequest.md) |  | 

### Return type

[**ModAssignGetParticipant200Response**](ModAssignGetParticipant200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModAssignGetSubmissionStatus

> ModAssignGetSubmissionStatus200Response ModAssignGetSubmissionStatus(ctx).ModAssignGetSubmissionStatusRequest(modAssignGetSubmissionStatusRequest).Execute()

Returns information about an assignment submission status for a given user.



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
	modAssignGetSubmissionStatusRequest := *openapiclient.NewModAssignGetSubmissionStatusRequest(int32(123)) // ModAssignGetSubmissionStatusRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignGetSubmissionStatus(context.Background()).ModAssignGetSubmissionStatusRequest(modAssignGetSubmissionStatusRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignGetSubmissionStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignGetSubmissionStatus`: ModAssignGetSubmissionStatus200Response
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignGetSubmissionStatus`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignGetSubmissionStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignGetSubmissionStatusRequest** | [**ModAssignGetSubmissionStatusRequest**](ModAssignGetSubmissionStatusRequest.md) |  | 

### Return type

[**ModAssignGetSubmissionStatus200Response**](ModAssignGetSubmissionStatus200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModAssignGetSubmissions

> ModAssignGetSubmissions200Response ModAssignGetSubmissions(ctx).ModAssignGetSubmissionsRequest(modAssignGetSubmissionsRequest).Execute()

Returns the submissions for assignments



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
	modAssignGetSubmissionsRequest := *openapiclient.NewModAssignGetSubmissionsRequest([]map[string]interface{}{map[string]interface{}(123)}) // ModAssignGetSubmissionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignGetSubmissions(context.Background()).ModAssignGetSubmissionsRequest(modAssignGetSubmissionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignGetSubmissions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignGetSubmissions`: ModAssignGetSubmissions200Response
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignGetSubmissions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignGetSubmissionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignGetSubmissionsRequest** | [**ModAssignGetSubmissionsRequest**](ModAssignGetSubmissionsRequest.md) |  | 

### Return type

[**ModAssignGetSubmissions200Response**](ModAssignGetSubmissions200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModAssignGetUserFlags

> ModAssignGetUserFlags200Response ModAssignGetUserFlags(ctx).ModAssignGetUserFlagsRequest(modAssignGetUserFlagsRequest).Execute()

Returns the user flags for assignments



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
	modAssignGetUserFlagsRequest := *openapiclient.NewModAssignGetUserFlagsRequest([]map[string]interface{}{map[string]interface{}(123)}) // ModAssignGetUserFlagsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignGetUserFlags(context.Background()).ModAssignGetUserFlagsRequest(modAssignGetUserFlagsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignGetUserFlags``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignGetUserFlags`: ModAssignGetUserFlags200Response
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignGetUserFlags`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignGetUserFlagsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignGetUserFlagsRequest** | [**ModAssignGetUserFlagsRequest**](ModAssignGetUserFlagsRequest.md) |  | 

### Return type

[**ModAssignGetUserFlags200Response**](ModAssignGetUserFlags200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModAssignGetUserMappings

> ModAssignGetUserMappings200Response ModAssignGetUserMappings(ctx).ModAssignGetUserFlagsRequest(modAssignGetUserFlagsRequest).Execute()

Returns the blind marking mappings for assignments



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
	modAssignGetUserFlagsRequest := *openapiclient.NewModAssignGetUserFlagsRequest([]map[string]interface{}{map[string]interface{}(123)}) // ModAssignGetUserFlagsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignGetUserMappings(context.Background()).ModAssignGetUserFlagsRequest(modAssignGetUserFlagsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignGetUserMappings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignGetUserMappings`: ModAssignGetUserMappings200Response
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignGetUserMappings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignGetUserMappingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignGetUserFlagsRequest** | [**ModAssignGetUserFlagsRequest**](ModAssignGetUserFlagsRequest.md) |  | 

### Return type

[**ModAssignGetUserMappings200Response**](ModAssignGetUserMappings200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModAssignListParticipants

> map[string]interface{} ModAssignListParticipants(ctx).ModAssignListParticipantsRequest(modAssignListParticipantsRequest).Execute()

List the participants for a single assignment, with some summary info about their submissions.



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
	modAssignListParticipantsRequest := *openapiclient.NewModAssignListParticipantsRequest(int32(123), "Filter_example", int32(123)) // ModAssignListParticipantsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignListParticipants(context.Background()).ModAssignListParticipantsRequest(modAssignListParticipantsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignListParticipants``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignListParticipants`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignListParticipants`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignListParticipantsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignListParticipantsRequest** | [**ModAssignListParticipantsRequest**](ModAssignListParticipantsRequest.md) |  | 

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


## ModAssignLockSubmissions

> map[string]interface{} ModAssignLockSubmissions(ctx).ModAssignLockSubmissionsRequest(modAssignLockSubmissionsRequest).Execute()

Prevent students from making changes to a list of submissions



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
	modAssignLockSubmissionsRequest := *openapiclient.NewModAssignLockSubmissionsRequest(int32(123), []map[string]interface{}{map[string]interface{}(123)}) // ModAssignLockSubmissionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignLockSubmissions(context.Background()).ModAssignLockSubmissionsRequest(modAssignLockSubmissionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignLockSubmissions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignLockSubmissions`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignLockSubmissions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignLockSubmissionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignLockSubmissionsRequest** | [**ModAssignLockSubmissionsRequest**](ModAssignLockSubmissionsRequest.md) |  | 

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


## ModAssignRevealIdentities

> map[string]interface{} ModAssignRevealIdentities(ctx).ModAssignRevealIdentitiesRequest(modAssignRevealIdentitiesRequest).Execute()

Reveal the identities for a blind marking assignment



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
	modAssignRevealIdentitiesRequest := *openapiclient.NewModAssignRevealIdentitiesRequest(int32(123)) // ModAssignRevealIdentitiesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignRevealIdentities(context.Background()).ModAssignRevealIdentitiesRequest(modAssignRevealIdentitiesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignRevealIdentities``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignRevealIdentities`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignRevealIdentities`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignRevealIdentitiesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignRevealIdentitiesRequest** | [**ModAssignRevealIdentitiesRequest**](ModAssignRevealIdentitiesRequest.md) |  | 

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


## ModAssignRevertSubmissionsToDraft

> map[string]interface{} ModAssignRevertSubmissionsToDraft(ctx).ModAssignRevertSubmissionsToDraftRequest(modAssignRevertSubmissionsToDraftRequest).Execute()

Reverts the list of submissions to draft status



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
	modAssignRevertSubmissionsToDraftRequest := *openapiclient.NewModAssignRevertSubmissionsToDraftRequest(int32(123), []map[string]interface{}{map[string]interface{}(123)}) // ModAssignRevertSubmissionsToDraftRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignRevertSubmissionsToDraft(context.Background()).ModAssignRevertSubmissionsToDraftRequest(modAssignRevertSubmissionsToDraftRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignRevertSubmissionsToDraft``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignRevertSubmissionsToDraft`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignRevertSubmissionsToDraft`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignRevertSubmissionsToDraftRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignRevertSubmissionsToDraftRequest** | [**ModAssignRevertSubmissionsToDraftRequest**](ModAssignRevertSubmissionsToDraftRequest.md) |  | 

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


## ModAssignSaveGrade

> map[string]interface{} ModAssignSaveGrade(ctx).ModAssignSaveGradeRequest(modAssignSaveGradeRequest).Execute()

Save a grade update for a single student.



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
	modAssignSaveGradeRequest := *openapiclient.NewModAssignSaveGradeRequest(false, false, int32(123), int32(123), float32(123), int32(123), "Workflowstate_example") // ModAssignSaveGradeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignSaveGrade(context.Background()).ModAssignSaveGradeRequest(modAssignSaveGradeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignSaveGrade``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignSaveGrade`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignSaveGrade`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignSaveGradeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignSaveGradeRequest** | [**ModAssignSaveGradeRequest**](ModAssignSaveGradeRequest.md) |  | 

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


## ModAssignSaveGrades

> map[string]interface{} ModAssignSaveGrades(ctx).ModAssignSaveGradesRequest(modAssignSaveGradesRequest).Execute()

Save multiple grade updates for an assignment.



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
	modAssignSaveGradesRequest := *openapiclient.NewModAssignSaveGradesRequest(false, int32(123), []openapiclient.ModAssignSaveGradesRequestGradesInner{*openapiclient.NewModAssignSaveGradesRequestGradesInner()}) // ModAssignSaveGradesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignSaveGrades(context.Background()).ModAssignSaveGradesRequest(modAssignSaveGradesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignSaveGrades``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignSaveGrades`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignSaveGrades`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignSaveGradesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignSaveGradesRequest** | [**ModAssignSaveGradesRequest**](ModAssignSaveGradesRequest.md) |  | 

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


## ModAssignSaveSubmission

> map[string]interface{} ModAssignSaveSubmission(ctx).ModAssignSaveSubmissionRequest(modAssignSaveSubmissionRequest).Execute()

Update the current students submission



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
	modAssignSaveSubmissionRequest := *openapiclient.NewModAssignSaveSubmissionRequest(int32(123), *openapiclient.NewModAssignSaveSubmissionRequestPlugindata()) // ModAssignSaveSubmissionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignSaveSubmission(context.Background()).ModAssignSaveSubmissionRequest(modAssignSaveSubmissionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignSaveSubmission``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignSaveSubmission`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignSaveSubmission`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignSaveSubmissionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignSaveSubmissionRequest** | [**ModAssignSaveSubmissionRequest**](ModAssignSaveSubmissionRequest.md) |  | 

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


## ModAssignSaveUserExtensions

> map[string]interface{} ModAssignSaveUserExtensions(ctx).ModAssignSaveUserExtensionsRequest(modAssignSaveUserExtensionsRequest).Execute()

Save a list of assignment extensions



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
	modAssignSaveUserExtensionsRequest := *openapiclient.NewModAssignSaveUserExtensionsRequest(int32(123), []map[string]interface{}{map[string]interface{}(123)}, []map[string]interface{}{map[string]interface{}(123)}) // ModAssignSaveUserExtensionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignSaveUserExtensions(context.Background()).ModAssignSaveUserExtensionsRequest(modAssignSaveUserExtensionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignSaveUserExtensions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignSaveUserExtensions`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignSaveUserExtensions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignSaveUserExtensionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignSaveUserExtensionsRequest** | [**ModAssignSaveUserExtensionsRequest**](ModAssignSaveUserExtensionsRequest.md) |  | 

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


## ModAssignSetUserFlags

> map[string]interface{} ModAssignSetUserFlags(ctx).ModAssignSetUserFlagsRequest(modAssignSetUserFlagsRequest).Execute()

Creates or updates user flags



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
	modAssignSetUserFlagsRequest := *openapiclient.NewModAssignSetUserFlagsRequest(int32(123), []openapiclient.ModAssignSetUserFlagsRequestUserflagsInner{*openapiclient.NewModAssignSetUserFlagsRequestUserflagsInner()}) // ModAssignSetUserFlagsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignSetUserFlags(context.Background()).ModAssignSetUserFlagsRequest(modAssignSetUserFlagsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignSetUserFlags``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignSetUserFlags`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignSetUserFlags`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignSetUserFlagsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignSetUserFlagsRequest** | [**ModAssignSetUserFlagsRequest**](ModAssignSetUserFlagsRequest.md) |  | 

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


## ModAssignStartSubmission

> ModAssignStartSubmission200Response ModAssignStartSubmission(ctx).ModAssignStartSubmissionRequest(modAssignStartSubmissionRequest).Execute()

Start a submission for user if assignment has a time limit.



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
	modAssignStartSubmissionRequest := *openapiclient.NewModAssignStartSubmissionRequest(int32(123)) // ModAssignStartSubmissionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignStartSubmission(context.Background()).ModAssignStartSubmissionRequest(modAssignStartSubmissionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignStartSubmission``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignStartSubmission`: ModAssignStartSubmission200Response
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignStartSubmission`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignStartSubmissionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignStartSubmissionRequest** | [**ModAssignStartSubmissionRequest**](ModAssignStartSubmissionRequest.md) |  | 

### Return type

[**ModAssignStartSubmission200Response**](ModAssignStartSubmission200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModAssignSubmitForGrading

> map[string]interface{} ModAssignSubmitForGrading(ctx).ModAssignSubmitForGradingRequest(modAssignSubmitForGradingRequest).Execute()

Submit the current students assignment for grading



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
	modAssignSubmitForGradingRequest := *openapiclient.NewModAssignSubmitForGradingRequest(false, int32(123)) // ModAssignSubmitForGradingRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignSubmitForGrading(context.Background()).ModAssignSubmitForGradingRequest(modAssignSubmitForGradingRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignSubmitForGrading``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignSubmitForGrading`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignSubmitForGrading`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignSubmitForGradingRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignSubmitForGradingRequest** | [**ModAssignSubmitForGradingRequest**](ModAssignSubmitForGradingRequest.md) |  | 

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


## ModAssignSubmitGradingForm

> map[string]interface{} ModAssignSubmitGradingForm(ctx).ModAssignSubmitGradingFormRequest(modAssignSubmitGradingFormRequest).Execute()

Submit the grading form data via ajax



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
	modAssignSubmitGradingFormRequest := *openapiclient.NewModAssignSubmitGradingFormRequest(int32(123), "Jsonformdata_example", int32(123)) // ModAssignSubmitGradingFormRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignSubmitGradingForm(context.Background()).ModAssignSubmitGradingFormRequest(modAssignSubmitGradingFormRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignSubmitGradingForm``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignSubmitGradingForm`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignSubmitGradingForm`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignSubmitGradingFormRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignSubmitGradingFormRequest** | [**ModAssignSubmitGradingFormRequest**](ModAssignSubmitGradingFormRequest.md) |  | 

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


## ModAssignUnlockSubmissions

> map[string]interface{} ModAssignUnlockSubmissions(ctx).ModAssignRevertSubmissionsToDraftRequest(modAssignRevertSubmissionsToDraftRequest).Execute()

Allow students to make changes to a list of submissions



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
	modAssignRevertSubmissionsToDraftRequest := *openapiclient.NewModAssignRevertSubmissionsToDraftRequest(int32(123), []map[string]interface{}{map[string]interface{}(123)}) // ModAssignRevertSubmissionsToDraftRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignUnlockSubmissions(context.Background()).ModAssignRevertSubmissionsToDraftRequest(modAssignRevertSubmissionsToDraftRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignUnlockSubmissions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignUnlockSubmissions`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignUnlockSubmissions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignUnlockSubmissionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignRevertSubmissionsToDraftRequest** | [**ModAssignRevertSubmissionsToDraftRequest**](ModAssignRevertSubmissionsToDraftRequest.md) |  | 

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


## ModAssignViewAssign

> CoreCalendarDeleteSubscription200Response ModAssignViewAssign(ctx).ModAssignViewAssignRequest(modAssignViewAssignRequest).Execute()

Update the module completion status.



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
	modAssignViewAssignRequest := *openapiclient.NewModAssignViewAssignRequest(int32(123)) // ModAssignViewAssignRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignViewAssign(context.Background()).ModAssignViewAssignRequest(modAssignViewAssignRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignViewAssign``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignViewAssign`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignViewAssign`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignViewAssignRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignViewAssignRequest** | [**ModAssignViewAssignRequest**](ModAssignViewAssignRequest.md) |  | 

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


## ModAssignViewGradingTable

> CoreCalendarDeleteSubscription200Response ModAssignViewGradingTable(ctx).ModAssignViewAssignRequest(modAssignViewAssignRequest).Execute()

Trigger the grading_table_viewed event.



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
	modAssignViewAssignRequest := *openapiclient.NewModAssignViewAssignRequest(int32(123)) // ModAssignViewAssignRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignViewGradingTable(context.Background()).ModAssignViewAssignRequest(modAssignViewAssignRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignViewGradingTable``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignViewGradingTable`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignViewGradingTable`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignViewGradingTableRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignViewAssignRequest** | [**ModAssignViewAssignRequest**](ModAssignViewAssignRequest.md) |  | 

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


## ModAssignViewSubmissionStatus

> CoreCalendarDeleteSubscription200Response ModAssignViewSubmissionStatus(ctx).ModAssignViewAssignRequest(modAssignViewAssignRequest).Execute()

Trigger the submission status viewed event.



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
	modAssignViewAssignRequest := *openapiclient.NewModAssignViewAssignRequest(int32(123)) // ModAssignViewAssignRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModAssignAPI.ModAssignViewSubmissionStatus(context.Background()).ModAssignViewAssignRequest(modAssignViewAssignRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModAssignAPI.ModAssignViewSubmissionStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModAssignViewSubmissionStatus`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModAssignAPI.ModAssignViewSubmissionStatus`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModAssignViewSubmissionStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modAssignViewAssignRequest** | [**ModAssignViewAssignRequest**](ModAssignViewAssignRequest.md) |  | 

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

