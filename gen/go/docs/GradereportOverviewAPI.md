# \GradereportOverviewAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GradereportOverviewGetCourseGrades**](GradereportOverviewAPI.md#GradereportOverviewGetCourseGrades) | **Post** /gradereport_overview_get_course_grades | Get the given user courses final grades
[**GradereportOverviewViewGradeReport**](GradereportOverviewAPI.md#GradereportOverviewViewGradeReport) | **Post** /gradereport_overview_view_grade_report | Trigger the report view event



## GradereportOverviewGetCourseGrades

> GradereportOverviewGetCourseGrades200Response GradereportOverviewGetCourseGrades(ctx).GradereportOverviewGetCourseGradesRequest(gradereportOverviewGetCourseGradesRequest).Execute()

Get the given user courses final grades



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
	gradereportOverviewGetCourseGradesRequest := *openapiclient.NewGradereportOverviewGetCourseGradesRequest() // GradereportOverviewGetCourseGradesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GradereportOverviewAPI.GradereportOverviewGetCourseGrades(context.Background()).GradereportOverviewGetCourseGradesRequest(gradereportOverviewGetCourseGradesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GradereportOverviewAPI.GradereportOverviewGetCourseGrades``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GradereportOverviewGetCourseGrades`: GradereportOverviewGetCourseGrades200Response
	fmt.Fprintf(os.Stdout, "Response from `GradereportOverviewAPI.GradereportOverviewGetCourseGrades`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGradereportOverviewGetCourseGradesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gradereportOverviewGetCourseGradesRequest** | [**GradereportOverviewGetCourseGradesRequest**](GradereportOverviewGetCourseGradesRequest.md) |  | 

### Return type

[**GradereportOverviewGetCourseGrades200Response**](GradereportOverviewGetCourseGrades200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GradereportOverviewViewGradeReport

> CoreCalendarDeleteSubscription200Response GradereportOverviewViewGradeReport(ctx).GradereportOverviewViewGradeReportRequest(gradereportOverviewViewGradeReportRequest).Execute()

Trigger the report view event



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
	gradereportOverviewViewGradeReportRequest := *openapiclient.NewGradereportOverviewViewGradeReportRequest(int32(123)) // GradereportOverviewViewGradeReportRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GradereportOverviewAPI.GradereportOverviewViewGradeReport(context.Background()).GradereportOverviewViewGradeReportRequest(gradereportOverviewViewGradeReportRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GradereportOverviewAPI.GradereportOverviewViewGradeReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GradereportOverviewViewGradeReport`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `GradereportOverviewAPI.GradereportOverviewViewGradeReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGradereportOverviewViewGradeReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gradereportOverviewViewGradeReportRequest** | [**GradereportOverviewViewGradeReportRequest**](GradereportOverviewViewGradeReportRequest.md) |  | 

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

