# \GradingformGuideAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GradingformGuideGraderGradingpanelFetch**](GradingformGuideAPI.md#GradingformGuideGraderGradingpanelFetch) | **Post** /gradingform_guide_grader_gradingpanel_fetch | Fetch the data required to display the grader grading panel, creating the grade item if required
[**GradingformGuideGraderGradingpanelStore**](GradingformGuideAPI.md#GradingformGuideGraderGradingpanelStore) | **Post** /gradingform_guide_grader_gradingpanel_store | Store the grading data for a user from the grader grading panel.



## GradingformGuideGraderGradingpanelFetch

> GradingformGuideGraderGradingpanelFetch200Response GradingformGuideGraderGradingpanelFetch(ctx).CoreGradesGraderGradingpanelScaleFetchRequest(coreGradesGraderGradingpanelScaleFetchRequest).Execute()

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
	resp, r, err := apiClient.GradingformGuideAPI.GradingformGuideGraderGradingpanelFetch(context.Background()).CoreGradesGraderGradingpanelScaleFetchRequest(coreGradesGraderGradingpanelScaleFetchRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GradingformGuideAPI.GradingformGuideGraderGradingpanelFetch``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GradingformGuideGraderGradingpanelFetch`: GradingformGuideGraderGradingpanelFetch200Response
	fmt.Fprintf(os.Stdout, "Response from `GradingformGuideAPI.GradingformGuideGraderGradingpanelFetch`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGradingformGuideGraderGradingpanelFetchRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradesGraderGradingpanelScaleFetchRequest** | [**CoreGradesGraderGradingpanelScaleFetchRequest**](CoreGradesGraderGradingpanelScaleFetchRequest.md) |  | 

### Return type

[**GradingformGuideGraderGradingpanelFetch200Response**](GradingformGuideGraderGradingpanelFetch200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GradingformGuideGraderGradingpanelStore

> GradingformGuideGraderGradingpanelStore200Response GradingformGuideGraderGradingpanelStore(ctx).CoreGradesGraderGradingpanelScaleStoreRequest(coreGradesGraderGradingpanelScaleStoreRequest).Execute()

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
	resp, r, err := apiClient.GradingformGuideAPI.GradingformGuideGraderGradingpanelStore(context.Background()).CoreGradesGraderGradingpanelScaleStoreRequest(coreGradesGraderGradingpanelScaleStoreRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GradingformGuideAPI.GradingformGuideGraderGradingpanelStore``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GradingformGuideGraderGradingpanelStore`: GradingformGuideGraderGradingpanelStore200Response
	fmt.Fprintf(os.Stdout, "Response from `GradingformGuideAPI.GradingformGuideGraderGradingpanelStore`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGradingformGuideGraderGradingpanelStoreRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradesGraderGradingpanelScaleStoreRequest** | [**CoreGradesGraderGradingpanelScaleStoreRequest**](CoreGradesGraderGradingpanelScaleStoreRequest.md) |  | 

### Return type

[**GradingformGuideGraderGradingpanelStore200Response**](GradingformGuideGraderGradingpanelStore200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

