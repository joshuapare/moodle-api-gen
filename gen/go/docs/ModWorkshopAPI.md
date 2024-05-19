# \ModWorkshopAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModWorkshopAddSubmission**](ModWorkshopAPI.md#ModWorkshopAddSubmission) | **Post** /mod_workshop_add_submission | Add a new submission to a given workshop.
[**ModWorkshopDeleteSubmission**](ModWorkshopAPI.md#ModWorkshopDeleteSubmission) | **Post** /mod_workshop_delete_submission | Deletes the given submission.
[**ModWorkshopEvaluateAssessment**](ModWorkshopAPI.md#ModWorkshopEvaluateAssessment) | **Post** /mod_workshop_evaluate_assessment | Evaluates an assessment (used by teachers for provide feedback to the reviewer).
[**ModWorkshopEvaluateSubmission**](ModWorkshopAPI.md#ModWorkshopEvaluateSubmission) | **Post** /mod_workshop_evaluate_submission | Evaluates a submission (used by teachers for provide feedback or override the submission grade).
[**ModWorkshopGetAssessment**](ModWorkshopAPI.md#ModWorkshopGetAssessment) | **Post** /mod_workshop_get_assessment | Retrieves the given assessment.
[**ModWorkshopGetAssessmentFormDefinition**](ModWorkshopAPI.md#ModWorkshopGetAssessmentFormDefinition) | **Post** /mod_workshop_get_assessment_form_definition | Retrieves the assessment form definition.
[**ModWorkshopGetGrades**](ModWorkshopAPI.md#ModWorkshopGetGrades) | **Post** /mod_workshop_get_grades | Returns the assessment and submission grade for the given user.
[**ModWorkshopGetGradesReport**](ModWorkshopAPI.md#ModWorkshopGetGradesReport) | **Post** /mod_workshop_get_grades_report | Retrieves the assessment grades report.
[**ModWorkshopGetReviewerAssessments**](ModWorkshopAPI.md#ModWorkshopGetReviewerAssessments) | **Post** /mod_workshop_get_reviewer_assessments | Retrieves all the assessments reviewed by the given user.
[**ModWorkshopGetSubmission**](ModWorkshopAPI.md#ModWorkshopGetSubmission) | **Post** /mod_workshop_get_submission | Retrieves the given submission.
[**ModWorkshopGetSubmissionAssessments**](ModWorkshopAPI.md#ModWorkshopGetSubmissionAssessments) | **Post** /mod_workshop_get_submission_assessments | Retrieves all the assessments of the given submission.
[**ModWorkshopGetSubmissions**](ModWorkshopAPI.md#ModWorkshopGetSubmissions) | **Post** /mod_workshop_get_submissions | Retrieves all the workshop submissions or the one done by the given user (except example submissions).
[**ModWorkshopGetUserPlan**](ModWorkshopAPI.md#ModWorkshopGetUserPlan) | **Post** /mod_workshop_get_user_plan | Return the planner information for the given user.
[**ModWorkshopGetWorkshopAccessInformation**](ModWorkshopAPI.md#ModWorkshopGetWorkshopAccessInformation) | **Post** /mod_workshop_get_workshop_access_information | Return access information for a given workshop.
[**ModWorkshopGetWorkshopsByCourses**](ModWorkshopAPI.md#ModWorkshopGetWorkshopsByCourses) | **Post** /mod_workshop_get_workshops_by_courses | Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.
[**ModWorkshopUpdateAssessment**](ModWorkshopAPI.md#ModWorkshopUpdateAssessment) | **Post** /mod_workshop_update_assessment | Add information to an allocated assessment.
[**ModWorkshopUpdateSubmission**](ModWorkshopAPI.md#ModWorkshopUpdateSubmission) | **Post** /mod_workshop_update_submission | Update the given submission.
[**ModWorkshopViewSubmission**](ModWorkshopAPI.md#ModWorkshopViewSubmission) | **Post** /mod_workshop_view_submission | Trigger the submission viewed event.
[**ModWorkshopViewWorkshop**](ModWorkshopAPI.md#ModWorkshopViewWorkshop) | **Post** /mod_workshop_view_workshop | Trigger the course module viewed event and update the module completion status.



## ModWorkshopAddSubmission

> ModWorkshopAddSubmission200Response ModWorkshopAddSubmission(ctx).ModWorkshopAddSubmissionRequest(modWorkshopAddSubmissionRequest).Execute()

Add a new submission to a given workshop.



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
	modWorkshopAddSubmissionRequest := *openapiclient.NewModWorkshopAddSubmissionRequest("Title_example", int32(123)) // ModWorkshopAddSubmissionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopAddSubmission(context.Background()).ModWorkshopAddSubmissionRequest(modWorkshopAddSubmissionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopAddSubmission``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopAddSubmission`: ModWorkshopAddSubmission200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopAddSubmission`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopAddSubmissionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWorkshopAddSubmissionRequest** | [**ModWorkshopAddSubmissionRequest**](ModWorkshopAddSubmissionRequest.md) |  | 

### Return type

[**ModWorkshopAddSubmission200Response**](ModWorkshopAddSubmission200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWorkshopDeleteSubmission

> ModWorkshopDeleteSubmission200Response ModWorkshopDeleteSubmission(ctx).ModWorkshopDeleteSubmissionRequest(modWorkshopDeleteSubmissionRequest).Execute()

Deletes the given submission.



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
	modWorkshopDeleteSubmissionRequest := *openapiclient.NewModWorkshopDeleteSubmissionRequest(int32(123)) // ModWorkshopDeleteSubmissionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopDeleteSubmission(context.Background()).ModWorkshopDeleteSubmissionRequest(modWorkshopDeleteSubmissionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopDeleteSubmission``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopDeleteSubmission`: ModWorkshopDeleteSubmission200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopDeleteSubmission`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopDeleteSubmissionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWorkshopDeleteSubmissionRequest** | [**ModWorkshopDeleteSubmissionRequest**](ModWorkshopDeleteSubmissionRequest.md) |  | 

### Return type

[**ModWorkshopDeleteSubmission200Response**](ModWorkshopDeleteSubmission200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWorkshopEvaluateAssessment

> ModWorkshopEvaluateAssessment200Response ModWorkshopEvaluateAssessment(ctx).ModWorkshopEvaluateAssessmentRequest(modWorkshopEvaluateAssessmentRequest).Execute()

Evaluates an assessment (used by teachers for provide feedback to the reviewer).



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
	modWorkshopEvaluateAssessmentRequest := *openapiclient.NewModWorkshopEvaluateAssessmentRequest(int32(123)) // ModWorkshopEvaluateAssessmentRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopEvaluateAssessment(context.Background()).ModWorkshopEvaluateAssessmentRequest(modWorkshopEvaluateAssessmentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopEvaluateAssessment``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopEvaluateAssessment`: ModWorkshopEvaluateAssessment200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopEvaluateAssessment`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopEvaluateAssessmentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWorkshopEvaluateAssessmentRequest** | [**ModWorkshopEvaluateAssessmentRequest**](ModWorkshopEvaluateAssessmentRequest.md) |  | 

### Return type

[**ModWorkshopEvaluateAssessment200Response**](ModWorkshopEvaluateAssessment200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWorkshopEvaluateSubmission

> ModWorkshopEvaluateSubmission200Response ModWorkshopEvaluateSubmission(ctx).ModWorkshopEvaluateSubmissionRequest(modWorkshopEvaluateSubmissionRequest).Execute()

Evaluates a submission (used by teachers for provide feedback or override the submission grade).



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
	modWorkshopEvaluateSubmissionRequest := *openapiclient.NewModWorkshopEvaluateSubmissionRequest(int32(123)) // ModWorkshopEvaluateSubmissionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopEvaluateSubmission(context.Background()).ModWorkshopEvaluateSubmissionRequest(modWorkshopEvaluateSubmissionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopEvaluateSubmission``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopEvaluateSubmission`: ModWorkshopEvaluateSubmission200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopEvaluateSubmission`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopEvaluateSubmissionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWorkshopEvaluateSubmissionRequest** | [**ModWorkshopEvaluateSubmissionRequest**](ModWorkshopEvaluateSubmissionRequest.md) |  | 

### Return type

[**ModWorkshopEvaluateSubmission200Response**](ModWorkshopEvaluateSubmission200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWorkshopGetAssessment

> ModWorkshopGetAssessment200Response ModWorkshopGetAssessment(ctx).ModWorkshopGetAssessmentRequest(modWorkshopGetAssessmentRequest).Execute()

Retrieves the given assessment.



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
	modWorkshopGetAssessmentRequest := *openapiclient.NewModWorkshopGetAssessmentRequest(int32(123)) // ModWorkshopGetAssessmentRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopGetAssessment(context.Background()).ModWorkshopGetAssessmentRequest(modWorkshopGetAssessmentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopGetAssessment``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopGetAssessment`: ModWorkshopGetAssessment200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopGetAssessment`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopGetAssessmentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWorkshopGetAssessmentRequest** | [**ModWorkshopGetAssessmentRequest**](ModWorkshopGetAssessmentRequest.md) |  | 

### Return type

[**ModWorkshopGetAssessment200Response**](ModWorkshopGetAssessment200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWorkshopGetAssessmentFormDefinition

> ModWorkshopGetAssessmentFormDefinition200Response ModWorkshopGetAssessmentFormDefinition(ctx).ModWorkshopGetAssessmentFormDefinitionRequest(modWorkshopGetAssessmentFormDefinitionRequest).Execute()

Retrieves the assessment form definition.



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
	modWorkshopGetAssessmentFormDefinitionRequest := *openapiclient.NewModWorkshopGetAssessmentFormDefinitionRequest(int32(123)) // ModWorkshopGetAssessmentFormDefinitionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopGetAssessmentFormDefinition(context.Background()).ModWorkshopGetAssessmentFormDefinitionRequest(modWorkshopGetAssessmentFormDefinitionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopGetAssessmentFormDefinition``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopGetAssessmentFormDefinition`: ModWorkshopGetAssessmentFormDefinition200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopGetAssessmentFormDefinition`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopGetAssessmentFormDefinitionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWorkshopGetAssessmentFormDefinitionRequest** | [**ModWorkshopGetAssessmentFormDefinitionRequest**](ModWorkshopGetAssessmentFormDefinitionRequest.md) |  | 

### Return type

[**ModWorkshopGetAssessmentFormDefinition200Response**](ModWorkshopGetAssessmentFormDefinition200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWorkshopGetGrades

> ModWorkshopGetGrades200Response ModWorkshopGetGrades(ctx).ModWorkshopGetGradesRequest(modWorkshopGetGradesRequest).Execute()

Returns the assessment and submission grade for the given user.



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
	modWorkshopGetGradesRequest := *openapiclient.NewModWorkshopGetGradesRequest(int32(123)) // ModWorkshopGetGradesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopGetGrades(context.Background()).ModWorkshopGetGradesRequest(modWorkshopGetGradesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopGetGrades``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopGetGrades`: ModWorkshopGetGrades200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopGetGrades`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopGetGradesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWorkshopGetGradesRequest** | [**ModWorkshopGetGradesRequest**](ModWorkshopGetGradesRequest.md) |  | 

### Return type

[**ModWorkshopGetGrades200Response**](ModWorkshopGetGrades200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWorkshopGetGradesReport

> ModWorkshopGetGradesReport200Response ModWorkshopGetGradesReport(ctx).ModWorkshopGetGradesReportRequest(modWorkshopGetGradesReportRequest).Execute()

Retrieves the assessment grades report.



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
	modWorkshopGetGradesReportRequest := *openapiclient.NewModWorkshopGetGradesReportRequest(int32(123)) // ModWorkshopGetGradesReportRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopGetGradesReport(context.Background()).ModWorkshopGetGradesReportRequest(modWorkshopGetGradesReportRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopGetGradesReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopGetGradesReport`: ModWorkshopGetGradesReport200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopGetGradesReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopGetGradesReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWorkshopGetGradesReportRequest** | [**ModWorkshopGetGradesReportRequest**](ModWorkshopGetGradesReportRequest.md) |  | 

### Return type

[**ModWorkshopGetGradesReport200Response**](ModWorkshopGetGradesReport200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWorkshopGetReviewerAssessments

> ModWorkshopGetReviewerAssessments200Response ModWorkshopGetReviewerAssessments(ctx).ModWorkshopGetReviewerAssessmentsRequest(modWorkshopGetReviewerAssessmentsRequest).Execute()

Retrieves all the assessments reviewed by the given user.



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
	modWorkshopGetReviewerAssessmentsRequest := *openapiclient.NewModWorkshopGetReviewerAssessmentsRequest(int32(123)) // ModWorkshopGetReviewerAssessmentsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopGetReviewerAssessments(context.Background()).ModWorkshopGetReviewerAssessmentsRequest(modWorkshopGetReviewerAssessmentsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopGetReviewerAssessments``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopGetReviewerAssessments`: ModWorkshopGetReviewerAssessments200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopGetReviewerAssessments`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopGetReviewerAssessmentsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWorkshopGetReviewerAssessmentsRequest** | [**ModWorkshopGetReviewerAssessmentsRequest**](ModWorkshopGetReviewerAssessmentsRequest.md) |  | 

### Return type

[**ModWorkshopGetReviewerAssessments200Response**](ModWorkshopGetReviewerAssessments200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWorkshopGetSubmission

> ModWorkshopGetSubmission200Response ModWorkshopGetSubmission(ctx).ModWorkshopGetSubmissionRequest(modWorkshopGetSubmissionRequest).Execute()

Retrieves the given submission.



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
	modWorkshopGetSubmissionRequest := *openapiclient.NewModWorkshopGetSubmissionRequest(int32(123)) // ModWorkshopGetSubmissionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopGetSubmission(context.Background()).ModWorkshopGetSubmissionRequest(modWorkshopGetSubmissionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopGetSubmission``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopGetSubmission`: ModWorkshopGetSubmission200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopGetSubmission`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopGetSubmissionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWorkshopGetSubmissionRequest** | [**ModWorkshopGetSubmissionRequest**](ModWorkshopGetSubmissionRequest.md) |  | 

### Return type

[**ModWorkshopGetSubmission200Response**](ModWorkshopGetSubmission200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWorkshopGetSubmissionAssessments

> ModWorkshopGetReviewerAssessments200Response ModWorkshopGetSubmissionAssessments(ctx).ModWorkshopGetSubmissionRequest(modWorkshopGetSubmissionRequest).Execute()

Retrieves all the assessments of the given submission.



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
	modWorkshopGetSubmissionRequest := *openapiclient.NewModWorkshopGetSubmissionRequest(int32(123)) // ModWorkshopGetSubmissionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopGetSubmissionAssessments(context.Background()).ModWorkshopGetSubmissionRequest(modWorkshopGetSubmissionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopGetSubmissionAssessments``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopGetSubmissionAssessments`: ModWorkshopGetReviewerAssessments200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopGetSubmissionAssessments`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopGetSubmissionAssessmentsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWorkshopGetSubmissionRequest** | [**ModWorkshopGetSubmissionRequest**](ModWorkshopGetSubmissionRequest.md) |  | 

### Return type

[**ModWorkshopGetReviewerAssessments200Response**](ModWorkshopGetReviewerAssessments200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWorkshopGetSubmissions

> ModWorkshopGetSubmissions200Response ModWorkshopGetSubmissions(ctx).ModWorkshopGetSubmissionsRequest(modWorkshopGetSubmissionsRequest).Execute()

Retrieves all the workshop submissions or the one done by the given user (except example submissions).



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
	modWorkshopGetSubmissionsRequest := *openapiclient.NewModWorkshopGetSubmissionsRequest(int32(123)) // ModWorkshopGetSubmissionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopGetSubmissions(context.Background()).ModWorkshopGetSubmissionsRequest(modWorkshopGetSubmissionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopGetSubmissions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopGetSubmissions`: ModWorkshopGetSubmissions200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopGetSubmissions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopGetSubmissionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWorkshopGetSubmissionsRequest** | [**ModWorkshopGetSubmissionsRequest**](ModWorkshopGetSubmissionsRequest.md) |  | 

### Return type

[**ModWorkshopGetSubmissions200Response**](ModWorkshopGetSubmissions200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWorkshopGetUserPlan

> ModWorkshopGetUserPlan200Response ModWorkshopGetUserPlan(ctx).ModWorkshopGetUserPlanRequest(modWorkshopGetUserPlanRequest).Execute()

Return the planner information for the given user.



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
	modWorkshopGetUserPlanRequest := *openapiclient.NewModWorkshopGetUserPlanRequest(int32(123)) // ModWorkshopGetUserPlanRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopGetUserPlan(context.Background()).ModWorkshopGetUserPlanRequest(modWorkshopGetUserPlanRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopGetUserPlan``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopGetUserPlan`: ModWorkshopGetUserPlan200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopGetUserPlan`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopGetUserPlanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWorkshopGetUserPlanRequest** | [**ModWorkshopGetUserPlanRequest**](ModWorkshopGetUserPlanRequest.md) |  | 

### Return type

[**ModWorkshopGetUserPlan200Response**](ModWorkshopGetUserPlan200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWorkshopGetWorkshopAccessInformation

> ModWorkshopGetWorkshopAccessInformation200Response ModWorkshopGetWorkshopAccessInformation(ctx).ModWorkshopGetWorkshopAccessInformationRequest(modWorkshopGetWorkshopAccessInformationRequest).Execute()

Return access information for a given workshop.



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
	modWorkshopGetWorkshopAccessInformationRequest := *openapiclient.NewModWorkshopGetWorkshopAccessInformationRequest(int32(123)) // ModWorkshopGetWorkshopAccessInformationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopGetWorkshopAccessInformation(context.Background()).ModWorkshopGetWorkshopAccessInformationRequest(modWorkshopGetWorkshopAccessInformationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopGetWorkshopAccessInformation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopGetWorkshopAccessInformation`: ModWorkshopGetWorkshopAccessInformation200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopGetWorkshopAccessInformation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopGetWorkshopAccessInformationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWorkshopGetWorkshopAccessInformationRequest** | [**ModWorkshopGetWorkshopAccessInformationRequest**](ModWorkshopGetWorkshopAccessInformationRequest.md) |  | 

### Return type

[**ModWorkshopGetWorkshopAccessInformation200Response**](ModWorkshopGetWorkshopAccessInformation200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWorkshopGetWorkshopsByCourses

> ModWorkshopGetWorkshopsByCourses200Response ModWorkshopGetWorkshopsByCourses(ctx).ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest).Execute()

Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.



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
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopGetWorkshopsByCourses(context.Background()).ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopGetWorkshopsByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopGetWorkshopsByCourses`: ModWorkshopGetWorkshopsByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopGetWorkshopsByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopGetWorkshopsByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  | 

### Return type

[**ModWorkshopGetWorkshopsByCourses200Response**](ModWorkshopGetWorkshopsByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWorkshopUpdateAssessment

> ModWorkshopUpdateAssessment200Response ModWorkshopUpdateAssessment(ctx).ModWorkshopUpdateAssessmentRequest(modWorkshopUpdateAssessmentRequest).Execute()

Add information to an allocated assessment.



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
	modWorkshopUpdateAssessmentRequest := *openapiclient.NewModWorkshopUpdateAssessmentRequest(int32(123), []openapiclient.ModWorkshopUpdateAssessmentRequestDataInner{*openapiclient.NewModWorkshopUpdateAssessmentRequestDataInner()}) // ModWorkshopUpdateAssessmentRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopUpdateAssessment(context.Background()).ModWorkshopUpdateAssessmentRequest(modWorkshopUpdateAssessmentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopUpdateAssessment``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopUpdateAssessment`: ModWorkshopUpdateAssessment200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopUpdateAssessment`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopUpdateAssessmentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWorkshopUpdateAssessmentRequest** | [**ModWorkshopUpdateAssessmentRequest**](ModWorkshopUpdateAssessmentRequest.md) |  | 

### Return type

[**ModWorkshopUpdateAssessment200Response**](ModWorkshopUpdateAssessment200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWorkshopUpdateSubmission

> ModWorkshopUpdateSubmission200Response ModWorkshopUpdateSubmission(ctx).ModWorkshopUpdateSubmissionRequest(modWorkshopUpdateSubmissionRequest).Execute()

Update the given submission.



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
	modWorkshopUpdateSubmissionRequest := *openapiclient.NewModWorkshopUpdateSubmissionRequest(int32(123), "Title_example") // ModWorkshopUpdateSubmissionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopUpdateSubmission(context.Background()).ModWorkshopUpdateSubmissionRequest(modWorkshopUpdateSubmissionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopUpdateSubmission``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopUpdateSubmission`: ModWorkshopUpdateSubmission200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopUpdateSubmission`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopUpdateSubmissionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWorkshopUpdateSubmissionRequest** | [**ModWorkshopUpdateSubmissionRequest**](ModWorkshopUpdateSubmissionRequest.md) |  | 

### Return type

[**ModWorkshopUpdateSubmission200Response**](ModWorkshopUpdateSubmission200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWorkshopViewSubmission

> CoreCalendarDeleteSubscription200Response ModWorkshopViewSubmission(ctx).ModWorkshopGetSubmissionRequest(modWorkshopGetSubmissionRequest).Execute()

Trigger the submission viewed event.



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
	modWorkshopGetSubmissionRequest := *openapiclient.NewModWorkshopGetSubmissionRequest(int32(123)) // ModWorkshopGetSubmissionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopViewSubmission(context.Background()).ModWorkshopGetSubmissionRequest(modWorkshopGetSubmissionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopViewSubmission``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopViewSubmission`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopViewSubmission`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopViewSubmissionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWorkshopGetSubmissionRequest** | [**ModWorkshopGetSubmissionRequest**](ModWorkshopGetSubmissionRequest.md) |  | 

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


## ModWorkshopViewWorkshop

> CoreCalendarDeleteSubscription200Response ModWorkshopViewWorkshop(ctx).ModWorkshopViewWorkshopRequest(modWorkshopViewWorkshopRequest).Execute()

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
	modWorkshopViewWorkshopRequest := *openapiclient.NewModWorkshopViewWorkshopRequest(int32(123)) // ModWorkshopViewWorkshopRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWorkshopAPI.ModWorkshopViewWorkshop(context.Background()).ModWorkshopViewWorkshopRequest(modWorkshopViewWorkshopRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWorkshopAPI.ModWorkshopViewWorkshop``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWorkshopViewWorkshop`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWorkshopAPI.ModWorkshopViewWorkshop`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWorkshopViewWorkshopRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWorkshopViewWorkshopRequest** | [**ModWorkshopViewWorkshopRequest**](ModWorkshopViewWorkshopRequest.md) |  | 

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

