# \ModLessonAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModLessonFinishAttempt**](ModLessonAPI.md#ModLessonFinishAttempt) | **Post** /mod_lesson_finish_attempt | Finishes the current attempt.
[**ModLessonGetAttemptsOverview**](ModLessonAPI.md#ModLessonGetAttemptsOverview) | **Post** /mod_lesson_get_attempts_overview | Get a list of all the attempts made by users in a lesson.
[**ModLessonGetContentPagesViewed**](ModLessonAPI.md#ModLessonGetContentPagesViewed) | **Post** /mod_lesson_get_content_pages_viewed | Return the list of content pages viewed by a user during a lesson attempt.
[**ModLessonGetLesson**](ModLessonAPI.md#ModLessonGetLesson) | **Post** /mod_lesson_get_lesson | Return information of a given lesson.
[**ModLessonGetLessonAccessInformation**](ModLessonAPI.md#ModLessonGetLessonAccessInformation) | **Post** /mod_lesson_get_lesson_access_information | Return access information for a given lesson.
[**ModLessonGetLessonsByCourses**](ModLessonAPI.md#ModLessonGetLessonsByCourses) | **Post** /mod_lesson_get_lessons_by_courses | Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.
[**ModLessonGetPageData**](ModLessonAPI.md#ModLessonGetPageData) | **Post** /mod_lesson_get_page_data | Return information of a given page, including its contents.
[**ModLessonGetPages**](ModLessonAPI.md#ModLessonGetPages) | **Post** /mod_lesson_get_pages | Return the list of pages in a lesson (based on the user permissions).
[**ModLessonGetPagesPossibleJumps**](ModLessonAPI.md#ModLessonGetPagesPossibleJumps) | **Post** /mod_lesson_get_pages_possible_jumps | Return all the possible jumps for the pages in a given lesson.
[**ModLessonGetQuestionsAttempts**](ModLessonAPI.md#ModLessonGetQuestionsAttempts) | **Post** /mod_lesson_get_questions_attempts | Return the list of questions attempts in a given lesson.
[**ModLessonGetUserAttempt**](ModLessonAPI.md#ModLessonGetUserAttempt) | **Post** /mod_lesson_get_user_attempt | Return information about the given user attempt (including answers).
[**ModLessonGetUserAttemptGrade**](ModLessonAPI.md#ModLessonGetUserAttemptGrade) | **Post** /mod_lesson_get_user_attempt_grade | Return grade information in the attempt for a given user.
[**ModLessonGetUserGrade**](ModLessonAPI.md#ModLessonGetUserGrade) | **Post** /mod_lesson_get_user_grade | Return the final grade in the lesson for the given user.
[**ModLessonGetUserTimers**](ModLessonAPI.md#ModLessonGetUserTimers) | **Post** /mod_lesson_get_user_timers | Return the timers in the current lesson for the given user.
[**ModLessonLaunchAttempt**](ModLessonAPI.md#ModLessonLaunchAttempt) | **Post** /mod_lesson_launch_attempt | Starts a new attempt or continues an existing one.
[**ModLessonProcessPage**](ModLessonAPI.md#ModLessonProcessPage) | **Post** /mod_lesson_process_page | Processes page responses.
[**ModLessonViewLesson**](ModLessonAPI.md#ModLessonViewLesson) | **Post** /mod_lesson_view_lesson | Trigger the course module viewed event and update the module completion status.



## ModLessonFinishAttempt

> ModLessonFinishAttempt200Response ModLessonFinishAttempt(ctx).ModLessonFinishAttemptRequest(modLessonFinishAttemptRequest).Execute()

Finishes the current attempt.



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
	modLessonFinishAttemptRequest := *openapiclient.NewModLessonFinishAttemptRequest(int32(123)) // ModLessonFinishAttemptRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLessonAPI.ModLessonFinishAttempt(context.Background()).ModLessonFinishAttemptRequest(modLessonFinishAttemptRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLessonAPI.ModLessonFinishAttempt``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLessonFinishAttempt`: ModLessonFinishAttempt200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLessonAPI.ModLessonFinishAttempt`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLessonFinishAttemptRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLessonFinishAttemptRequest** | [**ModLessonFinishAttemptRequest**](ModLessonFinishAttemptRequest.md) |  | 

### Return type

[**ModLessonFinishAttempt200Response**](ModLessonFinishAttempt200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLessonGetAttemptsOverview

> ModLessonGetAttemptsOverview200Response ModLessonGetAttemptsOverview(ctx).ModLessonGetAttemptsOverviewRequest(modLessonGetAttemptsOverviewRequest).Execute()

Get a list of all the attempts made by users in a lesson.



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
	modLessonGetAttemptsOverviewRequest := *openapiclient.NewModLessonGetAttemptsOverviewRequest(int32(123)) // ModLessonGetAttemptsOverviewRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLessonAPI.ModLessonGetAttemptsOverview(context.Background()).ModLessonGetAttemptsOverviewRequest(modLessonGetAttemptsOverviewRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLessonAPI.ModLessonGetAttemptsOverview``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLessonGetAttemptsOverview`: ModLessonGetAttemptsOverview200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLessonAPI.ModLessonGetAttemptsOverview`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLessonGetAttemptsOverviewRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLessonGetAttemptsOverviewRequest** | [**ModLessonGetAttemptsOverviewRequest**](ModLessonGetAttemptsOverviewRequest.md) |  | 

### Return type

[**ModLessonGetAttemptsOverview200Response**](ModLessonGetAttemptsOverview200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLessonGetContentPagesViewed

> ModLessonGetContentPagesViewed200Response ModLessonGetContentPagesViewed(ctx).ModLessonGetContentPagesViewedRequest(modLessonGetContentPagesViewedRequest).Execute()

Return the list of content pages viewed by a user during a lesson attempt.



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
	modLessonGetContentPagesViewedRequest := *openapiclient.NewModLessonGetContentPagesViewedRequest(int32(123), int32(123)) // ModLessonGetContentPagesViewedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLessonAPI.ModLessonGetContentPagesViewed(context.Background()).ModLessonGetContentPagesViewedRequest(modLessonGetContentPagesViewedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLessonAPI.ModLessonGetContentPagesViewed``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLessonGetContentPagesViewed`: ModLessonGetContentPagesViewed200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLessonAPI.ModLessonGetContentPagesViewed`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLessonGetContentPagesViewedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLessonGetContentPagesViewedRequest** | [**ModLessonGetContentPagesViewedRequest**](ModLessonGetContentPagesViewedRequest.md) |  | 

### Return type

[**ModLessonGetContentPagesViewed200Response**](ModLessonGetContentPagesViewed200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLessonGetLesson

> ModLessonGetLesson200Response ModLessonGetLesson(ctx).ModLessonGetLessonRequest(modLessonGetLessonRequest).Execute()

Return information of a given lesson.



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
	modLessonGetLessonRequest := *openapiclient.NewModLessonGetLessonRequest(int32(123)) // ModLessonGetLessonRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLessonAPI.ModLessonGetLesson(context.Background()).ModLessonGetLessonRequest(modLessonGetLessonRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLessonAPI.ModLessonGetLesson``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLessonGetLesson`: ModLessonGetLesson200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLessonAPI.ModLessonGetLesson`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLessonGetLessonRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLessonGetLessonRequest** | [**ModLessonGetLessonRequest**](ModLessonGetLessonRequest.md) |  | 

### Return type

[**ModLessonGetLesson200Response**](ModLessonGetLesson200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLessonGetLessonAccessInformation

> ModLessonGetLessonAccessInformation200Response ModLessonGetLessonAccessInformation(ctx).ModLessonGetLessonAccessInformationRequest(modLessonGetLessonAccessInformationRequest).Execute()

Return access information for a given lesson.



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
	modLessonGetLessonAccessInformationRequest := *openapiclient.NewModLessonGetLessonAccessInformationRequest(int32(123)) // ModLessonGetLessonAccessInformationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLessonAPI.ModLessonGetLessonAccessInformation(context.Background()).ModLessonGetLessonAccessInformationRequest(modLessonGetLessonAccessInformationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLessonAPI.ModLessonGetLessonAccessInformation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLessonGetLessonAccessInformation`: ModLessonGetLessonAccessInformation200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLessonAPI.ModLessonGetLessonAccessInformation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLessonGetLessonAccessInformationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLessonGetLessonAccessInformationRequest** | [**ModLessonGetLessonAccessInformationRequest**](ModLessonGetLessonAccessInformationRequest.md) |  | 

### Return type

[**ModLessonGetLessonAccessInformation200Response**](ModLessonGetLessonAccessInformation200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLessonGetLessonsByCourses

> ModLessonGetLessonsByCourses200Response ModLessonGetLessonsByCourses(ctx).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()

Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.



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
	resp, r, err := apiClient.ModLessonAPI.ModLessonGetLessonsByCourses(context.Background()).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLessonAPI.ModLessonGetLessonsByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLessonGetLessonsByCourses`: ModLessonGetLessonsByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLessonAPI.ModLessonGetLessonsByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLessonGetLessonsByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | 

### Return type

[**ModLessonGetLessonsByCourses200Response**](ModLessonGetLessonsByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLessonGetPageData

> ModLessonGetPageData200Response ModLessonGetPageData(ctx).ModLessonGetPageDataRequest(modLessonGetPageDataRequest).Execute()

Return information of a given page, including its contents.



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
	modLessonGetPageDataRequest := *openapiclient.NewModLessonGetPageDataRequest(int32(123), int32(123)) // ModLessonGetPageDataRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLessonAPI.ModLessonGetPageData(context.Background()).ModLessonGetPageDataRequest(modLessonGetPageDataRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLessonAPI.ModLessonGetPageData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLessonGetPageData`: ModLessonGetPageData200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLessonAPI.ModLessonGetPageData`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLessonGetPageDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLessonGetPageDataRequest** | [**ModLessonGetPageDataRequest**](ModLessonGetPageDataRequest.md) |  | 

### Return type

[**ModLessonGetPageData200Response**](ModLessonGetPageData200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLessonGetPages

> ModLessonGetPages200Response ModLessonGetPages(ctx).ModLessonGetPagesRequest(modLessonGetPagesRequest).Execute()

Return the list of pages in a lesson (based on the user permissions).



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
	modLessonGetPagesRequest := *openapiclient.NewModLessonGetPagesRequest(int32(123)) // ModLessonGetPagesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLessonAPI.ModLessonGetPages(context.Background()).ModLessonGetPagesRequest(modLessonGetPagesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLessonAPI.ModLessonGetPages``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLessonGetPages`: ModLessonGetPages200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLessonAPI.ModLessonGetPages`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLessonGetPagesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLessonGetPagesRequest** | [**ModLessonGetPagesRequest**](ModLessonGetPagesRequest.md) |  | 

### Return type

[**ModLessonGetPages200Response**](ModLessonGetPages200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLessonGetPagesPossibleJumps

> ModLessonGetPagesPossibleJumps200Response ModLessonGetPagesPossibleJumps(ctx).ModLessonGetLessonAccessInformationRequest(modLessonGetLessonAccessInformationRequest).Execute()

Return all the possible jumps for the pages in a given lesson.



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
	modLessonGetLessonAccessInformationRequest := *openapiclient.NewModLessonGetLessonAccessInformationRequest(int32(123)) // ModLessonGetLessonAccessInformationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLessonAPI.ModLessonGetPagesPossibleJumps(context.Background()).ModLessonGetLessonAccessInformationRequest(modLessonGetLessonAccessInformationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLessonAPI.ModLessonGetPagesPossibleJumps``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLessonGetPagesPossibleJumps`: ModLessonGetPagesPossibleJumps200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLessonAPI.ModLessonGetPagesPossibleJumps`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLessonGetPagesPossibleJumpsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLessonGetLessonAccessInformationRequest** | [**ModLessonGetLessonAccessInformationRequest**](ModLessonGetLessonAccessInformationRequest.md) |  | 

### Return type

[**ModLessonGetPagesPossibleJumps200Response**](ModLessonGetPagesPossibleJumps200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLessonGetQuestionsAttempts

> ModLessonGetQuestionsAttempts200Response ModLessonGetQuestionsAttempts(ctx).ModLessonGetQuestionsAttemptsRequest(modLessonGetQuestionsAttemptsRequest).Execute()

Return the list of questions attempts in a given lesson.



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
	modLessonGetQuestionsAttemptsRequest := *openapiclient.NewModLessonGetQuestionsAttemptsRequest(int32(123), int32(123)) // ModLessonGetQuestionsAttemptsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLessonAPI.ModLessonGetQuestionsAttempts(context.Background()).ModLessonGetQuestionsAttemptsRequest(modLessonGetQuestionsAttemptsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLessonAPI.ModLessonGetQuestionsAttempts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLessonGetQuestionsAttempts`: ModLessonGetQuestionsAttempts200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLessonAPI.ModLessonGetQuestionsAttempts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLessonGetQuestionsAttemptsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLessonGetQuestionsAttemptsRequest** | [**ModLessonGetQuestionsAttemptsRequest**](ModLessonGetQuestionsAttemptsRequest.md) |  | 

### Return type

[**ModLessonGetQuestionsAttempts200Response**](ModLessonGetQuestionsAttempts200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLessonGetUserAttempt

> ModLessonGetUserAttempt200Response ModLessonGetUserAttempt(ctx).ModLessonGetUserAttemptRequest(modLessonGetUserAttemptRequest).Execute()

Return information about the given user attempt (including answers).



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
	modLessonGetUserAttemptRequest := *openapiclient.NewModLessonGetUserAttemptRequest(int32(123), int32(123), int32(123)) // ModLessonGetUserAttemptRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLessonAPI.ModLessonGetUserAttempt(context.Background()).ModLessonGetUserAttemptRequest(modLessonGetUserAttemptRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLessonAPI.ModLessonGetUserAttempt``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLessonGetUserAttempt`: ModLessonGetUserAttempt200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLessonAPI.ModLessonGetUserAttempt`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLessonGetUserAttemptRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLessonGetUserAttemptRequest** | [**ModLessonGetUserAttemptRequest**](ModLessonGetUserAttemptRequest.md) |  | 

### Return type

[**ModLessonGetUserAttempt200Response**](ModLessonGetUserAttempt200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLessonGetUserAttemptGrade

> ModLessonGetUserAttemptGrade200Response ModLessonGetUserAttemptGrade(ctx).ModLessonGetUserAttemptGradeRequest(modLessonGetUserAttemptGradeRequest).Execute()

Return grade information in the attempt for a given user.



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
	modLessonGetUserAttemptGradeRequest := *openapiclient.NewModLessonGetUserAttemptGradeRequest(int32(123), int32(123)) // ModLessonGetUserAttemptGradeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLessonAPI.ModLessonGetUserAttemptGrade(context.Background()).ModLessonGetUserAttemptGradeRequest(modLessonGetUserAttemptGradeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLessonAPI.ModLessonGetUserAttemptGrade``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLessonGetUserAttemptGrade`: ModLessonGetUserAttemptGrade200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLessonAPI.ModLessonGetUserAttemptGrade`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLessonGetUserAttemptGradeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLessonGetUserAttemptGradeRequest** | [**ModLessonGetUserAttemptGradeRequest**](ModLessonGetUserAttemptGradeRequest.md) |  | 

### Return type

[**ModLessonGetUserAttemptGrade200Response**](ModLessonGetUserAttemptGrade200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLessonGetUserGrade

> ModLessonGetUserGrade200Response ModLessonGetUserGrade(ctx).ModLessonGetUserGradeRequest(modLessonGetUserGradeRequest).Execute()

Return the final grade in the lesson for the given user.



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
	modLessonGetUserGradeRequest := *openapiclient.NewModLessonGetUserGradeRequest(int32(123)) // ModLessonGetUserGradeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLessonAPI.ModLessonGetUserGrade(context.Background()).ModLessonGetUserGradeRequest(modLessonGetUserGradeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLessonAPI.ModLessonGetUserGrade``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLessonGetUserGrade`: ModLessonGetUserGrade200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLessonAPI.ModLessonGetUserGrade`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLessonGetUserGradeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLessonGetUserGradeRequest** | [**ModLessonGetUserGradeRequest**](ModLessonGetUserGradeRequest.md) |  | 

### Return type

[**ModLessonGetUserGrade200Response**](ModLessonGetUserGrade200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLessonGetUserTimers

> ModLessonGetUserTimers200Response ModLessonGetUserTimers(ctx).ModLessonGetUserGradeRequest(modLessonGetUserGradeRequest).Execute()

Return the timers in the current lesson for the given user.



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
	modLessonGetUserGradeRequest := *openapiclient.NewModLessonGetUserGradeRequest(int32(123)) // ModLessonGetUserGradeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLessonAPI.ModLessonGetUserTimers(context.Background()).ModLessonGetUserGradeRequest(modLessonGetUserGradeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLessonAPI.ModLessonGetUserTimers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLessonGetUserTimers`: ModLessonGetUserTimers200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLessonAPI.ModLessonGetUserTimers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLessonGetUserTimersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLessonGetUserGradeRequest** | [**ModLessonGetUserGradeRequest**](ModLessonGetUserGradeRequest.md) |  | 

### Return type

[**ModLessonGetUserTimers200Response**](ModLessonGetUserTimers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLessonLaunchAttempt

> ModLessonLaunchAttempt200Response ModLessonLaunchAttempt(ctx).ModLessonLaunchAttemptRequest(modLessonLaunchAttemptRequest).Execute()

Starts a new attempt or continues an existing one.



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
	modLessonLaunchAttemptRequest := *openapiclient.NewModLessonLaunchAttemptRequest(int32(123)) // ModLessonLaunchAttemptRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLessonAPI.ModLessonLaunchAttempt(context.Background()).ModLessonLaunchAttemptRequest(modLessonLaunchAttemptRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLessonAPI.ModLessonLaunchAttempt``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLessonLaunchAttempt`: ModLessonLaunchAttempt200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLessonAPI.ModLessonLaunchAttempt`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLessonLaunchAttemptRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLessonLaunchAttemptRequest** | [**ModLessonLaunchAttemptRequest**](ModLessonLaunchAttemptRequest.md) |  | 

### Return type

[**ModLessonLaunchAttempt200Response**](ModLessonLaunchAttempt200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLessonProcessPage

> ModLessonProcessPage200Response ModLessonProcessPage(ctx).ModLessonProcessPageRequest(modLessonProcessPageRequest).Execute()

Processes page responses.



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
	modLessonProcessPageRequest := *openapiclient.NewModLessonProcessPageRequest([]openapiclient.ModLessonProcessPageRequestDataInner{*openapiclient.NewModLessonProcessPageRequestDataInner()}, int32(123), int32(123)) // ModLessonProcessPageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLessonAPI.ModLessonProcessPage(context.Background()).ModLessonProcessPageRequest(modLessonProcessPageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLessonAPI.ModLessonProcessPage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLessonProcessPage`: ModLessonProcessPage200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLessonAPI.ModLessonProcessPage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLessonProcessPageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLessonProcessPageRequest** | [**ModLessonProcessPageRequest**](ModLessonProcessPageRequest.md) |  | 

### Return type

[**ModLessonProcessPage200Response**](ModLessonProcessPage200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLessonViewLesson

> CoreCalendarDeleteSubscription200Response ModLessonViewLesson(ctx).ModLessonGetLessonRequest(modLessonGetLessonRequest).Execute()

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
	modLessonGetLessonRequest := *openapiclient.NewModLessonGetLessonRequest(int32(123)) // ModLessonGetLessonRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLessonAPI.ModLessonViewLesson(context.Background()).ModLessonGetLessonRequest(modLessonGetLessonRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLessonAPI.ModLessonViewLesson``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLessonViewLesson`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLessonAPI.ModLessonViewLesson`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLessonViewLessonRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLessonGetLessonRequest** | [**ModLessonGetLessonRequest**](ModLessonGetLessonRequest.md) |  | 

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

