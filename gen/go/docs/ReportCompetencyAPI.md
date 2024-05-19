# \ReportCompetencyAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ReportCompetencyDataForReport**](ReportCompetencyAPI.md#ReportCompetencyDataForReport) | **Post** /report_competency_data_for_report | Load the data for the competency report in a course.



## ReportCompetencyDataForReport

> ReportCompetencyDataForReport200Response ReportCompetencyDataForReport(ctx).ReportCompetencyDataForReportRequest(reportCompetencyDataForReportRequest).Execute()

Load the data for the competency report in a course.



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
	reportCompetencyDataForReportRequest := *openapiclient.NewReportCompetencyDataForReportRequest(int32(123), int32(123), int32(123)) // ReportCompetencyDataForReportRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportCompetencyAPI.ReportCompetencyDataForReport(context.Background()).ReportCompetencyDataForReportRequest(reportCompetencyDataForReportRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportCompetencyAPI.ReportCompetencyDataForReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportCompetencyDataForReport`: ReportCompetencyDataForReport200Response
	fmt.Fprintf(os.Stdout, "Response from `ReportCompetencyAPI.ReportCompetencyDataForReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportCompetencyDataForReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportCompetencyDataForReportRequest** | [**ReportCompetencyDataForReportRequest**](ReportCompetencyDataForReportRequest.md) |  | 

### Return type

[**ReportCompetencyDataForReport200Response**](ReportCompetencyDataForReport200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

