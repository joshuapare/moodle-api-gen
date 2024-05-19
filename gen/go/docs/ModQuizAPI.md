# \ModQuizAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModQuizAddRandomQuestions**](ModQuizAPI.md#ModQuizAddRandomQuestions) | **Post** /mod_quiz_add_random_questions | Add a number of random questions to a quiz.
[**ModQuizGetAttemptAccessInformation**](ModQuizAPI.md#ModQuizGetAttemptAccessInformation) | **Post** /mod_quiz_get_attempt_access_information | Return access information for a given attempt in a quiz.
[**ModQuizGetAttemptData**](ModQuizAPI.md#ModQuizGetAttemptData) | **Post** /mod_quiz_get_attempt_data | Returns information for the given attempt page for a quiz attempt in progress.
[**ModQuizGetAttemptReview**](ModQuizAPI.md#ModQuizGetAttemptReview) | **Post** /mod_quiz_get_attempt_review | Returns review information for the given finished attempt, can be used by users or teachers.
[**ModQuizGetAttemptSummary**](ModQuizAPI.md#ModQuizGetAttemptSummary) | **Post** /mod_quiz_get_attempt_summary | Returns a summary of a quiz attempt before it is submitted.
[**ModQuizGetCombinedReviewOptions**](ModQuizAPI.md#ModQuizGetCombinedReviewOptions) | **Post** /mod_quiz_get_combined_review_options | Combines the review options from a number of different quiz attempts.
[**ModQuizGetQuizAccessInformation**](ModQuizAPI.md#ModQuizGetQuizAccessInformation) | **Post** /mod_quiz_get_quiz_access_information | Return access information for a given quiz.
[**ModQuizGetQuizFeedbackForGrade**](ModQuizAPI.md#ModQuizGetQuizFeedbackForGrade) | **Post** /mod_quiz_get_quiz_feedback_for_grade | Get the feedback text that should be show to a student who got the given grade in the given quiz.
[**ModQuizGetQuizRequiredQtypes**](ModQuizAPI.md#ModQuizGetQuizRequiredQtypes) | **Post** /mod_quiz_get_quiz_required_qtypes | Return the potential question types that would be required for a given quiz.
[**ModQuizGetQuizzesByCourses**](ModQuizAPI.md#ModQuizGetQuizzesByCourses) | **Post** /mod_quiz_get_quizzes_by_courses | Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.
[**ModQuizGetReopenAttemptConfirmation**](ModQuizAPI.md#ModQuizGetReopenAttemptConfirmation) | **Post** /mod_quiz_get_reopen_attempt_confirmation | Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.
[**ModQuizGetUserAttempts**](ModQuizAPI.md#ModQuizGetUserAttempts) | **Post** /mod_quiz_get_user_attempts | Return a list of attempts for the given quiz and user.
[**ModQuizGetUserBestGrade**](ModQuizAPI.md#ModQuizGetUserBestGrade) | **Post** /mod_quiz_get_user_best_grade | Get the best current grade for the given user on a quiz.
[**ModQuizProcessAttempt**](ModQuizAPI.md#ModQuizProcessAttempt) | **Post** /mod_quiz_process_attempt | Process responses during an attempt at a quiz and also deals with attempts finishing.
[**ModQuizReopenAttempt**](ModQuizAPI.md#ModQuizReopenAttempt) | **Post** /mod_quiz_reopen_attempt | Re-open an attempt that is currently in the never submitted state.
[**ModQuizSaveAttempt**](ModQuizAPI.md#ModQuizSaveAttempt) | **Post** /mod_quiz_save_attempt | Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.
[**ModQuizSetQuestionVersion**](ModQuizAPI.md#ModQuizSetQuestionVersion) | **Post** /mod_quiz_set_question_version | Set the version of question that would be required for a given quiz.
[**ModQuizStartAttempt**](ModQuizAPI.md#ModQuizStartAttempt) | **Post** /mod_quiz_start_attempt | Starts a new attempt at a quiz.
[**ModQuizUpdateFilterCondition**](ModQuizAPI.md#ModQuizUpdateFilterCondition) | **Post** /mod_quiz_update_filter_condition | Update filter condition for a random question slot.
[**ModQuizViewAttempt**](ModQuizAPI.md#ModQuizViewAttempt) | **Post** /mod_quiz_view_attempt | Trigger the attempt viewed event.
[**ModQuizViewAttemptReview**](ModQuizAPI.md#ModQuizViewAttemptReview) | **Post** /mod_quiz_view_attempt_review | Trigger the attempt reviewed event.
[**ModQuizViewAttemptSummary**](ModQuizAPI.md#ModQuizViewAttemptSummary) | **Post** /mod_quiz_view_attempt_summary | Trigger the attempt summary viewed event.
[**ModQuizViewQuiz**](ModQuizAPI.md#ModQuizViewQuiz) | **Post** /mod_quiz_view_quiz | Trigger the course module viewed event and update the module completion status.



## ModQuizAddRandomQuestions

> ModQuizAddRandomQuestions200Response ModQuizAddRandomQuestions(ctx).ModQuizAddRandomQuestionsRequest(modQuizAddRandomQuestionsRequest).Execute()

Add a number of random questions to a quiz.



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
	modQuizAddRandomQuestionsRequest := *openapiclient.NewModQuizAddRandomQuestionsRequest(int32(123), int32(123), int32(123)) // ModQuizAddRandomQuestionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizAddRandomQuestions(context.Background()).ModQuizAddRandomQuestionsRequest(modQuizAddRandomQuestionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizAddRandomQuestions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizAddRandomQuestions`: ModQuizAddRandomQuestions200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizAddRandomQuestions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizAddRandomQuestionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizAddRandomQuestionsRequest** | [**ModQuizAddRandomQuestionsRequest**](ModQuizAddRandomQuestionsRequest.md) |  | 

### Return type

[**ModQuizAddRandomQuestions200Response**](ModQuizAddRandomQuestions200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModQuizGetAttemptAccessInformation

> ModQuizGetAttemptAccessInformation200Response ModQuizGetAttemptAccessInformation(ctx).ModQuizGetAttemptAccessInformationRequest(modQuizGetAttemptAccessInformationRequest).Execute()

Return access information for a given attempt in a quiz.



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
	modQuizGetAttemptAccessInformationRequest := *openapiclient.NewModQuizGetAttemptAccessInformationRequest(int32(123)) // ModQuizGetAttemptAccessInformationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizGetAttemptAccessInformation(context.Background()).ModQuizGetAttemptAccessInformationRequest(modQuizGetAttemptAccessInformationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizGetAttemptAccessInformation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizGetAttemptAccessInformation`: ModQuizGetAttemptAccessInformation200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizGetAttemptAccessInformation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizGetAttemptAccessInformationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizGetAttemptAccessInformationRequest** | [**ModQuizGetAttemptAccessInformationRequest**](ModQuizGetAttemptAccessInformationRequest.md) |  | 

### Return type

[**ModQuizGetAttemptAccessInformation200Response**](ModQuizGetAttemptAccessInformation200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModQuizGetAttemptData

> ModQuizGetAttemptData200Response ModQuizGetAttemptData(ctx).ModQuizGetAttemptDataRequest(modQuizGetAttemptDataRequest).Execute()

Returns information for the given attempt page for a quiz attempt in progress.



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
	modQuizGetAttemptDataRequest := *openapiclient.NewModQuizGetAttemptDataRequest(int32(123), int32(123)) // ModQuizGetAttemptDataRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizGetAttemptData(context.Background()).ModQuizGetAttemptDataRequest(modQuizGetAttemptDataRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizGetAttemptData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizGetAttemptData`: ModQuizGetAttemptData200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizGetAttemptData`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizGetAttemptDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizGetAttemptDataRequest** | [**ModQuizGetAttemptDataRequest**](ModQuizGetAttemptDataRequest.md) |  | 

### Return type

[**ModQuizGetAttemptData200Response**](ModQuizGetAttemptData200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModQuizGetAttemptReview

> ModQuizGetAttemptReview200Response ModQuizGetAttemptReview(ctx).ModQuizGetAttemptReviewRequest(modQuizGetAttemptReviewRequest).Execute()

Returns review information for the given finished attempt, can be used by users or teachers.



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
	modQuizGetAttemptReviewRequest := *openapiclient.NewModQuizGetAttemptReviewRequest(int32(123)) // ModQuizGetAttemptReviewRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizGetAttemptReview(context.Background()).ModQuizGetAttemptReviewRequest(modQuizGetAttemptReviewRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizGetAttemptReview``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizGetAttemptReview`: ModQuizGetAttemptReview200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizGetAttemptReview`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizGetAttemptReviewRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizGetAttemptReviewRequest** | [**ModQuizGetAttemptReviewRequest**](ModQuizGetAttemptReviewRequest.md) |  | 

### Return type

[**ModQuizGetAttemptReview200Response**](ModQuizGetAttemptReview200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModQuizGetAttemptSummary

> ModQuizGetAttemptSummary200Response ModQuizGetAttemptSummary(ctx).ModQuizGetAttemptSummaryRequest(modQuizGetAttemptSummaryRequest).Execute()

Returns a summary of a quiz attempt before it is submitted.



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
	modQuizGetAttemptSummaryRequest := *openapiclient.NewModQuizGetAttemptSummaryRequest(int32(123)) // ModQuizGetAttemptSummaryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizGetAttemptSummary(context.Background()).ModQuizGetAttemptSummaryRequest(modQuizGetAttemptSummaryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizGetAttemptSummary``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizGetAttemptSummary`: ModQuizGetAttemptSummary200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizGetAttemptSummary`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizGetAttemptSummaryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizGetAttemptSummaryRequest** | [**ModQuizGetAttemptSummaryRequest**](ModQuizGetAttemptSummaryRequest.md) |  | 

### Return type

[**ModQuizGetAttemptSummary200Response**](ModQuizGetAttemptSummary200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModQuizGetCombinedReviewOptions

> ModQuizGetCombinedReviewOptions200Response ModQuizGetCombinedReviewOptions(ctx).ModQuizGetCombinedReviewOptionsRequest(modQuizGetCombinedReviewOptionsRequest).Execute()

Combines the review options from a number of different quiz attempts.



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
	modQuizGetCombinedReviewOptionsRequest := *openapiclient.NewModQuizGetCombinedReviewOptionsRequest(int32(123)) // ModQuizGetCombinedReviewOptionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizGetCombinedReviewOptions(context.Background()).ModQuizGetCombinedReviewOptionsRequest(modQuizGetCombinedReviewOptionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizGetCombinedReviewOptions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizGetCombinedReviewOptions`: ModQuizGetCombinedReviewOptions200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizGetCombinedReviewOptions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizGetCombinedReviewOptionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizGetCombinedReviewOptionsRequest** | [**ModQuizGetCombinedReviewOptionsRequest**](ModQuizGetCombinedReviewOptionsRequest.md) |  | 

### Return type

[**ModQuizGetCombinedReviewOptions200Response**](ModQuizGetCombinedReviewOptions200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModQuizGetQuizAccessInformation

> ModQuizGetQuizAccessInformation200Response ModQuizGetQuizAccessInformation(ctx).ModQuizGetQuizAccessInformationRequest(modQuizGetQuizAccessInformationRequest).Execute()

Return access information for a given quiz.



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
	modQuizGetQuizAccessInformationRequest := *openapiclient.NewModQuizGetQuizAccessInformationRequest(int32(123)) // ModQuizGetQuizAccessInformationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizGetQuizAccessInformation(context.Background()).ModQuizGetQuizAccessInformationRequest(modQuizGetQuizAccessInformationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizGetQuizAccessInformation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizGetQuizAccessInformation`: ModQuizGetQuizAccessInformation200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizGetQuizAccessInformation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizGetQuizAccessInformationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizGetQuizAccessInformationRequest** | [**ModQuizGetQuizAccessInformationRequest**](ModQuizGetQuizAccessInformationRequest.md) |  | 

### Return type

[**ModQuizGetQuizAccessInformation200Response**](ModQuizGetQuizAccessInformation200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModQuizGetQuizFeedbackForGrade

> ModQuizGetQuizFeedbackForGrade200Response ModQuizGetQuizFeedbackForGrade(ctx).ModQuizGetQuizFeedbackForGradeRequest(modQuizGetQuizFeedbackForGradeRequest).Execute()

Get the feedback text that should be show to a student who got the given grade in the given quiz.



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
	modQuizGetQuizFeedbackForGradeRequest := *openapiclient.NewModQuizGetQuizFeedbackForGradeRequest(float32(123), int32(123)) // ModQuizGetQuizFeedbackForGradeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizGetQuizFeedbackForGrade(context.Background()).ModQuizGetQuizFeedbackForGradeRequest(modQuizGetQuizFeedbackForGradeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizGetQuizFeedbackForGrade``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizGetQuizFeedbackForGrade`: ModQuizGetQuizFeedbackForGrade200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizGetQuizFeedbackForGrade`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizGetQuizFeedbackForGradeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizGetQuizFeedbackForGradeRequest** | [**ModQuizGetQuizFeedbackForGradeRequest**](ModQuizGetQuizFeedbackForGradeRequest.md) |  | 

### Return type

[**ModQuizGetQuizFeedbackForGrade200Response**](ModQuizGetQuizFeedbackForGrade200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModQuizGetQuizRequiredQtypes

> ModQuizGetQuizRequiredQtypes200Response ModQuizGetQuizRequiredQtypes(ctx).ModQuizGetQuizAccessInformationRequest(modQuizGetQuizAccessInformationRequest).Execute()

Return the potential question types that would be required for a given quiz.



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
	modQuizGetQuizAccessInformationRequest := *openapiclient.NewModQuizGetQuizAccessInformationRequest(int32(123)) // ModQuizGetQuizAccessInformationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizGetQuizRequiredQtypes(context.Background()).ModQuizGetQuizAccessInformationRequest(modQuizGetQuizAccessInformationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizGetQuizRequiredQtypes``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizGetQuizRequiredQtypes`: ModQuizGetQuizRequiredQtypes200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizGetQuizRequiredQtypes`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizGetQuizRequiredQtypesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizGetQuizAccessInformationRequest** | [**ModQuizGetQuizAccessInformationRequest**](ModQuizGetQuizAccessInformationRequest.md) |  | 

### Return type

[**ModQuizGetQuizRequiredQtypes200Response**](ModQuizGetQuizRequiredQtypes200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModQuizGetQuizzesByCourses

> ModQuizGetQuizzesByCourses200Response ModQuizGetQuizzesByCourses(ctx).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()

Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.



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
	resp, r, err := apiClient.ModQuizAPI.ModQuizGetQuizzesByCourses(context.Background()).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizGetQuizzesByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizGetQuizzesByCourses`: ModQuizGetQuizzesByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizGetQuizzesByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizGetQuizzesByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | 

### Return type

[**ModQuizGetQuizzesByCourses200Response**](ModQuizGetQuizzesByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModQuizGetReopenAttemptConfirmation

> map[string]interface{} ModQuizGetReopenAttemptConfirmation(ctx).ModQuizGetReopenAttemptConfirmationRequest(modQuizGetReopenAttemptConfirmationRequest).Execute()

Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.



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
	modQuizGetReopenAttemptConfirmationRequest := *openapiclient.NewModQuizGetReopenAttemptConfirmationRequest(int32(123)) // ModQuizGetReopenAttemptConfirmationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizGetReopenAttemptConfirmation(context.Background()).ModQuizGetReopenAttemptConfirmationRequest(modQuizGetReopenAttemptConfirmationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizGetReopenAttemptConfirmation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizGetReopenAttemptConfirmation`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizGetReopenAttemptConfirmation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizGetReopenAttemptConfirmationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizGetReopenAttemptConfirmationRequest** | [**ModQuizGetReopenAttemptConfirmationRequest**](ModQuizGetReopenAttemptConfirmationRequest.md) |  | 

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


## ModQuizGetUserAttempts

> ModQuizGetUserAttempts200Response ModQuizGetUserAttempts(ctx).ModQuizGetUserAttemptsRequest(modQuizGetUserAttemptsRequest).Execute()

Return a list of attempts for the given quiz and user.



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
	modQuizGetUserAttemptsRequest := *openapiclient.NewModQuizGetUserAttemptsRequest(int32(123)) // ModQuizGetUserAttemptsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizGetUserAttempts(context.Background()).ModQuizGetUserAttemptsRequest(modQuizGetUserAttemptsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizGetUserAttempts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizGetUserAttempts`: ModQuizGetUserAttempts200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizGetUserAttempts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizGetUserAttemptsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizGetUserAttemptsRequest** | [**ModQuizGetUserAttemptsRequest**](ModQuizGetUserAttemptsRequest.md) |  | 

### Return type

[**ModQuizGetUserAttempts200Response**](ModQuizGetUserAttempts200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModQuizGetUserBestGrade

> ModQuizGetUserBestGrade200Response ModQuizGetUserBestGrade(ctx).ModQuizGetUserBestGradeRequest(modQuizGetUserBestGradeRequest).Execute()

Get the best current grade for the given user on a quiz.



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
	modQuizGetUserBestGradeRequest := *openapiclient.NewModQuizGetUserBestGradeRequest(int32(123)) // ModQuizGetUserBestGradeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizGetUserBestGrade(context.Background()).ModQuizGetUserBestGradeRequest(modQuizGetUserBestGradeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizGetUserBestGrade``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizGetUserBestGrade`: ModQuizGetUserBestGrade200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizGetUserBestGrade`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizGetUserBestGradeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizGetUserBestGradeRequest** | [**ModQuizGetUserBestGradeRequest**](ModQuizGetUserBestGradeRequest.md) |  | 

### Return type

[**ModQuizGetUserBestGrade200Response**](ModQuizGetUserBestGrade200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModQuizProcessAttempt

> ModQuizProcessAttempt200Response ModQuizProcessAttempt(ctx).ModQuizProcessAttemptRequest(modQuizProcessAttemptRequest).Execute()

Process responses during an attempt at a quiz and also deals with attempts finishing.



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
	modQuizProcessAttemptRequest := *openapiclient.NewModQuizProcessAttemptRequest(int32(123)) // ModQuizProcessAttemptRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizProcessAttempt(context.Background()).ModQuizProcessAttemptRequest(modQuizProcessAttemptRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizProcessAttempt``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizProcessAttempt`: ModQuizProcessAttempt200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizProcessAttempt`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizProcessAttemptRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizProcessAttemptRequest** | [**ModQuizProcessAttemptRequest**](ModQuizProcessAttemptRequest.md) |  | 

### Return type

[**ModQuizProcessAttempt200Response**](ModQuizProcessAttempt200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModQuizReopenAttempt

> map[string]interface{} ModQuizReopenAttempt(ctx).ModQuizReopenAttemptRequest(modQuizReopenAttemptRequest).Execute()

Re-open an attempt that is currently in the never submitted state.



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
	modQuizReopenAttemptRequest := *openapiclient.NewModQuizReopenAttemptRequest(int32(123)) // ModQuizReopenAttemptRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizReopenAttempt(context.Background()).ModQuizReopenAttemptRequest(modQuizReopenAttemptRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizReopenAttempt``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizReopenAttempt`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizReopenAttempt`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizReopenAttemptRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizReopenAttemptRequest** | [**ModQuizReopenAttemptRequest**](ModQuizReopenAttemptRequest.md) |  | 

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


## ModQuizSaveAttempt

> CoreCalendarDeleteSubscription200Response ModQuizSaveAttempt(ctx).ModQuizSaveAttemptRequest(modQuizSaveAttemptRequest).Execute()

Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.



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
	modQuizSaveAttemptRequest := *openapiclient.NewModQuizSaveAttemptRequest(int32(123), []openapiclient.ModQuizGetAttemptDataRequestPreflightdataInner{*openapiclient.NewModQuizGetAttemptDataRequestPreflightdataInner()}) // ModQuizSaveAttemptRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizSaveAttempt(context.Background()).ModQuizSaveAttemptRequest(modQuizSaveAttemptRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizSaveAttempt``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizSaveAttempt`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizSaveAttempt`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizSaveAttemptRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizSaveAttemptRequest** | [**ModQuizSaveAttemptRequest**](ModQuizSaveAttemptRequest.md) |  | 

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


## ModQuizSetQuestionVersion

> ModQuizSetQuestionVersion200Response ModQuizSetQuestionVersion(ctx).ModQuizSetQuestionVersionRequest(modQuizSetQuestionVersionRequest).Execute()

Set the version of question that would be required for a given quiz.



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
	modQuizSetQuestionVersionRequest := *openapiclient.NewModQuizSetQuestionVersionRequest(int32(123), int32(123)) // ModQuizSetQuestionVersionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizSetQuestionVersion(context.Background()).ModQuizSetQuestionVersionRequest(modQuizSetQuestionVersionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizSetQuestionVersion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizSetQuestionVersion`: ModQuizSetQuestionVersion200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizSetQuestionVersion`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizSetQuestionVersionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizSetQuestionVersionRequest** | [**ModQuizSetQuestionVersionRequest**](ModQuizSetQuestionVersionRequest.md) |  | 

### Return type

[**ModQuizSetQuestionVersion200Response**](ModQuizSetQuestionVersion200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModQuizStartAttempt

> ModQuizStartAttempt200Response ModQuizStartAttempt(ctx).ModQuizStartAttemptRequest(modQuizStartAttemptRequest).Execute()

Starts a new attempt at a quiz.



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
	modQuizStartAttemptRequest := *openapiclient.NewModQuizStartAttemptRequest(int32(123)) // ModQuizStartAttemptRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizStartAttempt(context.Background()).ModQuizStartAttemptRequest(modQuizStartAttemptRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizStartAttempt``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizStartAttempt`: ModQuizStartAttempt200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizStartAttempt`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizStartAttemptRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizStartAttemptRequest** | [**ModQuizStartAttemptRequest**](ModQuizStartAttemptRequest.md) |  | 

### Return type

[**ModQuizStartAttempt200Response**](ModQuizStartAttempt200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModQuizUpdateFilterCondition

> ModQuizAddRandomQuestions200Response ModQuizUpdateFilterCondition(ctx).ModQuizUpdateFilterConditionRequest(modQuizUpdateFilterConditionRequest).Execute()

Update filter condition for a random question slot.



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
	modQuizUpdateFilterConditionRequest := *openapiclient.NewModQuizUpdateFilterConditionRequest(int32(123), "Filtercondition_example", int32(123)) // ModQuizUpdateFilterConditionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizUpdateFilterCondition(context.Background()).ModQuizUpdateFilterConditionRequest(modQuizUpdateFilterConditionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizUpdateFilterCondition``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizUpdateFilterCondition`: ModQuizAddRandomQuestions200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizUpdateFilterCondition`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizUpdateFilterConditionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizUpdateFilterConditionRequest** | [**ModQuizUpdateFilterConditionRequest**](ModQuizUpdateFilterConditionRequest.md) |  | 

### Return type

[**ModQuizAddRandomQuestions200Response**](ModQuizAddRandomQuestions200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModQuizViewAttempt

> CoreCalendarDeleteSubscription200Response ModQuizViewAttempt(ctx).ModQuizViewAttemptRequest(modQuizViewAttemptRequest).Execute()

Trigger the attempt viewed event.



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
	modQuizViewAttemptRequest := *openapiclient.NewModQuizViewAttemptRequest(int32(123), int32(123)) // ModQuizViewAttemptRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizViewAttempt(context.Background()).ModQuizViewAttemptRequest(modQuizViewAttemptRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizViewAttempt``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizViewAttempt`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizViewAttempt`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizViewAttemptRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizViewAttemptRequest** | [**ModQuizViewAttemptRequest**](ModQuizViewAttemptRequest.md) |  | 

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


## ModQuizViewAttemptReview

> CoreCalendarDeleteSubscription200Response ModQuizViewAttemptReview(ctx).ModQuizViewAttemptReviewRequest(modQuizViewAttemptReviewRequest).Execute()

Trigger the attempt reviewed event.



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
	modQuizViewAttemptReviewRequest := *openapiclient.NewModQuizViewAttemptReviewRequest(int32(123)) // ModQuizViewAttemptReviewRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizViewAttemptReview(context.Background()).ModQuizViewAttemptReviewRequest(modQuizViewAttemptReviewRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizViewAttemptReview``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizViewAttemptReview`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizViewAttemptReview`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizViewAttemptReviewRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizViewAttemptReviewRequest** | [**ModQuizViewAttemptReviewRequest**](ModQuizViewAttemptReviewRequest.md) |  | 

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


## ModQuizViewAttemptSummary

> CoreCalendarDeleteSubscription200Response ModQuizViewAttemptSummary(ctx).ModQuizGetAttemptSummaryRequest(modQuizGetAttemptSummaryRequest).Execute()

Trigger the attempt summary viewed event.



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
	modQuizGetAttemptSummaryRequest := *openapiclient.NewModQuizGetAttemptSummaryRequest(int32(123)) // ModQuizGetAttemptSummaryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizViewAttemptSummary(context.Background()).ModQuizGetAttemptSummaryRequest(modQuizGetAttemptSummaryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizViewAttemptSummary``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizViewAttemptSummary`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizViewAttemptSummary`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizViewAttemptSummaryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizGetAttemptSummaryRequest** | [**ModQuizGetAttemptSummaryRequest**](ModQuizGetAttemptSummaryRequest.md) |  | 

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


## ModQuizViewQuiz

> CoreCalendarDeleteSubscription200Response ModQuizViewQuiz(ctx).ModQuizGetQuizAccessInformationRequest(modQuizGetQuizAccessInformationRequest).Execute()

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
	modQuizGetQuizAccessInformationRequest := *openapiclient.NewModQuizGetQuizAccessInformationRequest(int32(123)) // ModQuizGetQuizAccessInformationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModQuizAPI.ModQuizViewQuiz(context.Background()).ModQuizGetQuizAccessInformationRequest(modQuizGetQuizAccessInformationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModQuizAPI.ModQuizViewQuiz``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModQuizViewQuiz`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModQuizAPI.ModQuizViewQuiz`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModQuizViewQuizRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modQuizGetQuizAccessInformationRequest** | [**ModQuizGetQuizAccessInformationRequest**](ModQuizGetQuizAccessInformationRequest.md) |  | 

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

