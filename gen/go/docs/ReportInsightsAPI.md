# \ReportInsightsAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ReportInsightsActionExecuted**](ReportInsightsAPI.md#ReportInsightsActionExecuted) | **Post** /report_insights_action_executed | Stores an action executed over a group of predictions.
[**ReportInsightsSetFixedPrediction**](ReportInsightsAPI.md#ReportInsightsSetFixedPrediction) | **Post** /report_insights_set_fixed_prediction | Flags a prediction as fixed.
[**ReportInsightsSetNotusefulPrediction**](ReportInsightsAPI.md#ReportInsightsSetNotusefulPrediction) | **Post** /report_insights_set_notuseful_prediction | Flags the prediction as not useful.



## ReportInsightsActionExecuted

> CoreCohortAddCohortMembers200Response ReportInsightsActionExecuted(ctx).ReportInsightsActionExecutedRequest(reportInsightsActionExecutedRequest).Execute()

Stores an action executed over a group of predictions.



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
	reportInsightsActionExecutedRequest := *openapiclient.NewReportInsightsActionExecutedRequest("Actionname_example", []map[string]interface{}{map[string]interface{}(123)}) // ReportInsightsActionExecutedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportInsightsAPI.ReportInsightsActionExecuted(context.Background()).ReportInsightsActionExecutedRequest(reportInsightsActionExecutedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportInsightsAPI.ReportInsightsActionExecuted``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportInsightsActionExecuted`: CoreCohortAddCohortMembers200Response
	fmt.Fprintf(os.Stdout, "Response from `ReportInsightsAPI.ReportInsightsActionExecuted`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportInsightsActionExecutedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportInsightsActionExecutedRequest** | [**ReportInsightsActionExecutedRequest**](ReportInsightsActionExecutedRequest.md) |  | 

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


## ReportInsightsSetFixedPrediction

> ReportInsightsSetFixedPrediction200Response ReportInsightsSetFixedPrediction(ctx).ReportInsightsSetFixedPredictionRequest(reportInsightsSetFixedPredictionRequest).Execute()

Flags a prediction as fixed.



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
	reportInsightsSetFixedPredictionRequest := *openapiclient.NewReportInsightsSetFixedPredictionRequest(int32(123)) // ReportInsightsSetFixedPredictionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportInsightsAPI.ReportInsightsSetFixedPrediction(context.Background()).ReportInsightsSetFixedPredictionRequest(reportInsightsSetFixedPredictionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportInsightsAPI.ReportInsightsSetFixedPrediction``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportInsightsSetFixedPrediction`: ReportInsightsSetFixedPrediction200Response
	fmt.Fprintf(os.Stdout, "Response from `ReportInsightsAPI.ReportInsightsSetFixedPrediction`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportInsightsSetFixedPredictionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportInsightsSetFixedPredictionRequest** | [**ReportInsightsSetFixedPredictionRequest**](ReportInsightsSetFixedPredictionRequest.md) |  | 

### Return type

[**ReportInsightsSetFixedPrediction200Response**](ReportInsightsSetFixedPrediction200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportInsightsSetNotusefulPrediction

> ReportInsightsSetNotusefulPrediction200Response ReportInsightsSetNotusefulPrediction(ctx).ReportInsightsSetNotusefulPredictionRequest(reportInsightsSetNotusefulPredictionRequest).Execute()

Flags the prediction as not useful.



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
	reportInsightsSetNotusefulPredictionRequest := *openapiclient.NewReportInsightsSetNotusefulPredictionRequest(int32(123)) // ReportInsightsSetNotusefulPredictionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportInsightsAPI.ReportInsightsSetNotusefulPrediction(context.Background()).ReportInsightsSetNotusefulPredictionRequest(reportInsightsSetNotusefulPredictionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportInsightsAPI.ReportInsightsSetNotusefulPrediction``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportInsightsSetNotusefulPrediction`: ReportInsightsSetNotusefulPrediction200Response
	fmt.Fprintf(os.Stdout, "Response from `ReportInsightsAPI.ReportInsightsSetNotusefulPrediction`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportInsightsSetNotusefulPredictionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportInsightsSetNotusefulPredictionRequest** | [**ReportInsightsSetNotusefulPredictionRequest**](ReportInsightsSetNotusefulPredictionRequest.md) |  | 

### Return type

[**ReportInsightsSetNotusefulPrediction200Response**](ReportInsightsSetNotusefulPrediction200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

