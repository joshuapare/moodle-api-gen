# \GradereportGraderAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GradereportGraderGetUsersInReport**](GradereportGraderAPI.md#GradereportGraderGetUsersInReport) | **Post** /gradereport_grader_get_users_in_report | Returns the dataset of users within the report



## GradereportGraderGetUsersInReport

> CoreGradesGetGradableUsers200Response GradereportGraderGetUsersInReport(ctx).CoreCompletionMarkCourseSelfCompletedRequest(coreCompletionMarkCourseSelfCompletedRequest).Execute()

Returns the dataset of users within the report



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
	coreCompletionMarkCourseSelfCompletedRequest := *openapiclient.NewCoreCompletionMarkCourseSelfCompletedRequest(int32(123)) // CoreCompletionMarkCourseSelfCompletedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GradereportGraderAPI.GradereportGraderGetUsersInReport(context.Background()).CoreCompletionMarkCourseSelfCompletedRequest(coreCompletionMarkCourseSelfCompletedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GradereportGraderAPI.GradereportGraderGetUsersInReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GradereportGraderGetUsersInReport`: CoreGradesGetGradableUsers200Response
	fmt.Fprintf(os.Stdout, "Response from `GradereportGraderAPI.GradereportGraderGetUsersInReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGradereportGraderGetUsersInReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompletionMarkCourseSelfCompletedRequest** | [**CoreCompletionMarkCourseSelfCompletedRequest**](CoreCompletionMarkCourseSelfCompletedRequest.md) |  | 

### Return type

[**CoreGradesGetGradableUsers200Response**](CoreGradesGetGradableUsers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

