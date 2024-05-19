# \ModSurveyAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModSurveyGetQuestions**](ModSurveyAPI.md#ModSurveyGetQuestions) | **Post** /mod_survey_get_questions | Get the complete list of questions for the survey, including subquestions.
[**ModSurveyGetSurveysByCourses**](ModSurveyAPI.md#ModSurveyGetSurveysByCourses) | **Post** /mod_survey_get_surveys_by_courses | Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.
[**ModSurveySubmitAnswers**](ModSurveyAPI.md#ModSurveySubmitAnswers) | **Post** /mod_survey_submit_answers | Submit the answers for a given survey.
[**ModSurveyViewSurvey**](ModSurveyAPI.md#ModSurveyViewSurvey) | **Post** /mod_survey_view_survey | Trigger the course module viewed event and update the module completion status.



## ModSurveyGetQuestions

> ModSurveyGetQuestions200Response ModSurveyGetQuestions(ctx).ModSurveyGetQuestionsRequest(modSurveyGetQuestionsRequest).Execute()

Get the complete list of questions for the survey, including subquestions.



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
	modSurveyGetQuestionsRequest := *openapiclient.NewModSurveyGetQuestionsRequest(int32(123)) // ModSurveyGetQuestionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModSurveyAPI.ModSurveyGetQuestions(context.Background()).ModSurveyGetQuestionsRequest(modSurveyGetQuestionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModSurveyAPI.ModSurveyGetQuestions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModSurveyGetQuestions`: ModSurveyGetQuestions200Response
	fmt.Fprintf(os.Stdout, "Response from `ModSurveyAPI.ModSurveyGetQuestions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModSurveyGetQuestionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modSurveyGetQuestionsRequest** | [**ModSurveyGetQuestionsRequest**](ModSurveyGetQuestionsRequest.md) |  | 

### Return type

[**ModSurveyGetQuestions200Response**](ModSurveyGetQuestions200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModSurveyGetSurveysByCourses

> ModSurveyGetSurveysByCourses200Response ModSurveyGetSurveysByCourses(ctx).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()

Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.



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
	resp, r, err := apiClient.ModSurveyAPI.ModSurveyGetSurveysByCourses(context.Background()).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModSurveyAPI.ModSurveyGetSurveysByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModSurveyGetSurveysByCourses`: ModSurveyGetSurveysByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModSurveyAPI.ModSurveyGetSurveysByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModSurveyGetSurveysByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | 

### Return type

[**ModSurveyGetSurveysByCourses200Response**](ModSurveyGetSurveysByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModSurveySubmitAnswers

> CoreCalendarDeleteSubscription200Response ModSurveySubmitAnswers(ctx).ModSurveySubmitAnswersRequest(modSurveySubmitAnswersRequest).Execute()

Submit the answers for a given survey.



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
	modSurveySubmitAnswersRequest := *openapiclient.NewModSurveySubmitAnswersRequest([]openapiclient.ModSurveySubmitAnswersRequestAnswersInner{*openapiclient.NewModSurveySubmitAnswersRequestAnswersInner()}, int32(123)) // ModSurveySubmitAnswersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModSurveyAPI.ModSurveySubmitAnswers(context.Background()).ModSurveySubmitAnswersRequest(modSurveySubmitAnswersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModSurveyAPI.ModSurveySubmitAnswers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModSurveySubmitAnswers`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModSurveyAPI.ModSurveySubmitAnswers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModSurveySubmitAnswersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modSurveySubmitAnswersRequest** | [**ModSurveySubmitAnswersRequest**](ModSurveySubmitAnswersRequest.md) |  | 

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


## ModSurveyViewSurvey

> CoreCalendarDeleteSubscription200Response ModSurveyViewSurvey(ctx).ModSurveyViewSurveyRequest(modSurveyViewSurveyRequest).Execute()

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
	modSurveyViewSurveyRequest := *openapiclient.NewModSurveyViewSurveyRequest(int32(123)) // ModSurveyViewSurveyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModSurveyAPI.ModSurveyViewSurvey(context.Background()).ModSurveyViewSurveyRequest(modSurveyViewSurveyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModSurveyAPI.ModSurveyViewSurvey``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModSurveyViewSurvey`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModSurveyAPI.ModSurveyViewSurvey`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModSurveyViewSurveyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modSurveyViewSurveyRequest** | [**ModSurveyViewSurveyRequest**](ModSurveyViewSurveyRequest.md) |  | 

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

