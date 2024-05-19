# \GradingformRubricAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GradingformRubricGraderGradingpanelFetch**](GradingformRubricAPI.md#GradingformRubricGraderGradingpanelFetch) | **Post** /gradingform_rubric_grader_gradingpanel_fetch | Fetch the data required to display the grader grading panel, creating the grade item if required
[**GradingformRubricGraderGradingpanelStore**](GradingformRubricAPI.md#GradingformRubricGraderGradingpanelStore) | **Post** /gradingform_rubric_grader_gradingpanel_store | Store the grading data for a user from the grader grading panel.



## GradingformRubricGraderGradingpanelFetch

> GradingformRubricGraderGradingpanelFetch200Response GradingformRubricGraderGradingpanelFetch(ctx).CoreGradesGraderGradingpanelScaleFetchRequest(coreGradesGraderGradingpanelScaleFetchRequest).Execute()

Fetch the data required to display the grader grading panel, creating the grade item if required



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
	coreGradesGraderGradingpanelScaleFetchRequest := *openapiclient.NewCoreGradesGraderGradingpanelScaleFetchRequest("Component_example", int32(123), int32(123), "Itemname_example") // CoreGradesGraderGradingpanelScaleFetchRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GradingformRubricAPI.GradingformRubricGraderGradingpanelFetch(context.Background()).CoreGradesGraderGradingpanelScaleFetchRequest(coreGradesGraderGradingpanelScaleFetchRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GradingformRubricAPI.GradingformRubricGraderGradingpanelFetch``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GradingformRubricGraderGradingpanelFetch`: GradingformRubricGraderGradingpanelFetch200Response
	fmt.Fprintf(os.Stdout, "Response from `GradingformRubricAPI.GradingformRubricGraderGradingpanelFetch`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGradingformRubricGraderGradingpanelFetchRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradesGraderGradingpanelScaleFetchRequest** | [**CoreGradesGraderGradingpanelScaleFetchRequest**](CoreGradesGraderGradingpanelScaleFetchRequest.md) |  | 

### Return type

[**GradingformRubricGraderGradingpanelFetch200Response**](GradingformRubricGraderGradingpanelFetch200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GradingformRubricGraderGradingpanelStore

> GradingformRubricGraderGradingpanelStore200Response GradingformRubricGraderGradingpanelStore(ctx).CoreGradesGraderGradingpanelScaleStoreRequest(coreGradesGraderGradingpanelScaleStoreRequest).Execute()

Store the grading data for a user from the grader grading panel.



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
	coreGradesGraderGradingpanelScaleStoreRequest := *openapiclient.NewCoreGradesGraderGradingpanelScaleStoreRequest("Component_example", int32(123), "Formdata_example", int32(123), "Itemname_example") // CoreGradesGraderGradingpanelScaleStoreRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GradingformRubricAPI.GradingformRubricGraderGradingpanelStore(context.Background()).CoreGradesGraderGradingpanelScaleStoreRequest(coreGradesGraderGradingpanelScaleStoreRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GradingformRubricAPI.GradingformRubricGraderGradingpanelStore``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GradingformRubricGraderGradingpanelStore`: GradingformRubricGraderGradingpanelStore200Response
	fmt.Fprintf(os.Stdout, "Response from `GradingformRubricAPI.GradingformRubricGraderGradingpanelStore`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGradingformRubricGraderGradingpanelStoreRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradesGraderGradingpanelScaleStoreRequest** | [**CoreGradesGraderGradingpanelScaleStoreRequest**](CoreGradesGraderGradingpanelScaleStoreRequest.md) |  | 

### Return type

[**GradingformRubricGraderGradingpanelStore200Response**](GradingformRubricGraderGradingpanelStore200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

