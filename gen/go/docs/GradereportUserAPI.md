# \GradereportUserAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GradereportUserGetAccessInformation**](GradereportUserAPI.md#GradereportUserGetAccessInformation) | **Post** /gradereport_user_get_access_information | Returns user access information for the user grade report.
[**GradereportUserGetGradeItems**](GradereportUserAPI.md#GradereportUserGetGradeItems) | **Post** /gradereport_user_get_grade_items | Returns the complete list of grade items for users in a course
[**GradereportUserGetGradesTable**](GradereportUserAPI.md#GradereportUserGetGradesTable) | **Post** /gradereport_user_get_grades_table | Get the user/s report grades table for a course
[**GradereportUserViewGradeReport**](GradereportUserAPI.md#GradereportUserViewGradeReport) | **Post** /gradereport_user_view_grade_report | Trigger the report view event



## GradereportUserGetAccessInformation

> GradereportUserGetAccessInformation200Response GradereportUserGetAccessInformation(ctx).GradereportUserGetAccessInformationRequest(gradereportUserGetAccessInformationRequest).Execute()

Returns user access information for the user grade report.



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
	gradereportUserGetAccessInformationRequest := *openapiclient.NewGradereportUserGetAccessInformationRequest(int32(123)) // GradereportUserGetAccessInformationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GradereportUserAPI.GradereportUserGetAccessInformation(context.Background()).GradereportUserGetAccessInformationRequest(gradereportUserGetAccessInformationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GradereportUserAPI.GradereportUserGetAccessInformation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GradereportUserGetAccessInformation`: GradereportUserGetAccessInformation200Response
	fmt.Fprintf(os.Stdout, "Response from `GradereportUserAPI.GradereportUserGetAccessInformation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGradereportUserGetAccessInformationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gradereportUserGetAccessInformationRequest** | [**GradereportUserGetAccessInformationRequest**](GradereportUserGetAccessInformationRequest.md) |  | 

### Return type

[**GradereportUserGetAccessInformation200Response**](GradereportUserGetAccessInformation200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GradereportUserGetGradeItems

> GradereportUserGetGradeItems200Response GradereportUserGetGradeItems(ctx).GradereportUserGetGradeItemsRequest(gradereportUserGetGradeItemsRequest).Execute()

Returns the complete list of grade items for users in a course



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
	gradereportUserGetGradeItemsRequest := *openapiclient.NewGradereportUserGetGradeItemsRequest(int32(123)) // GradereportUserGetGradeItemsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GradereportUserAPI.GradereportUserGetGradeItems(context.Background()).GradereportUserGetGradeItemsRequest(gradereportUserGetGradeItemsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GradereportUserAPI.GradereportUserGetGradeItems``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GradereportUserGetGradeItems`: GradereportUserGetGradeItems200Response
	fmt.Fprintf(os.Stdout, "Response from `GradereportUserAPI.GradereportUserGetGradeItems`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGradereportUserGetGradeItemsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gradereportUserGetGradeItemsRequest** | [**GradereportUserGetGradeItemsRequest**](GradereportUserGetGradeItemsRequest.md) |  | 

### Return type

[**GradereportUserGetGradeItems200Response**](GradereportUserGetGradeItems200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GradereportUserGetGradesTable

> GradereportUserGetGradesTable200Response GradereportUserGetGradesTable(ctx).GradereportUserGetGradeItemsRequest(gradereportUserGetGradeItemsRequest).Execute()

Get the user/s report grades table for a course



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
	gradereportUserGetGradeItemsRequest := *openapiclient.NewGradereportUserGetGradeItemsRequest(int32(123)) // GradereportUserGetGradeItemsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GradereportUserAPI.GradereportUserGetGradesTable(context.Background()).GradereportUserGetGradeItemsRequest(gradereportUserGetGradeItemsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GradereportUserAPI.GradereportUserGetGradesTable``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GradereportUserGetGradesTable`: GradereportUserGetGradesTable200Response
	fmt.Fprintf(os.Stdout, "Response from `GradereportUserAPI.GradereportUserGetGradesTable`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGradereportUserGetGradesTableRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gradereportUserGetGradeItemsRequest** | [**GradereportUserGetGradeItemsRequest**](GradereportUserGetGradeItemsRequest.md) |  | 

### Return type

[**GradereportUserGetGradesTable200Response**](GradereportUserGetGradesTable200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GradereportUserViewGradeReport

> CoreCalendarDeleteSubscription200Response GradereportUserViewGradeReport(ctx).GradereportOverviewViewGradeReportRequest(gradereportOverviewViewGradeReportRequest).Execute()

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
	resp, r, err := apiClient.GradereportUserAPI.GradereportUserViewGradeReport(context.Background()).GradereportOverviewViewGradeReportRequest(gradereportOverviewViewGradeReportRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GradereportUserAPI.GradereportUserViewGradeReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GradereportUserViewGradeReport`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `GradereportUserAPI.GradereportUserViewGradeReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGradereportUserViewGradeReportRequest struct via the builder pattern


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

