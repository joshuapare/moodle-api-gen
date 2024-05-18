# \GradereportSingleviewAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GradereportSingleviewGetGradeItemsForSearchWidget**](GradereportSingleviewAPI.md#GradereportSingleviewGetGradeItemsForSearchWidget) | **Post** /gradereport_singleview_get_grade_items_for_search_widget | Get the gradeitem/(s) for a course



## GradereportSingleviewGetGradeItemsForSearchWidget

> GradereportSingleviewGetGradeItemsForSearchWidget200Response GradereportSingleviewGetGradeItemsForSearchWidget(ctx).CoreGradesGetGroupsForSearchWidgetRequest(coreGradesGetGroupsForSearchWidgetRequest).Execute()

Get the gradeitem/(s) for a course



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
	coreGradesGetGroupsForSearchWidgetRequest := *openapiclient.NewCoreGradesGetGroupsForSearchWidgetRequest(int32(123)) // CoreGradesGetGroupsForSearchWidgetRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GradereportSingleviewAPI.GradereportSingleviewGetGradeItemsForSearchWidget(context.Background()).CoreGradesGetGroupsForSearchWidgetRequest(coreGradesGetGroupsForSearchWidgetRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GradereportSingleviewAPI.GradereportSingleviewGetGradeItemsForSearchWidget``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GradereportSingleviewGetGradeItemsForSearchWidget`: GradereportSingleviewGetGradeItemsForSearchWidget200Response
	fmt.Fprintf(os.Stdout, "Response from `GradereportSingleviewAPI.GradereportSingleviewGetGradeItemsForSearchWidget`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGradereportSingleviewGetGradeItemsForSearchWidgetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradesGetGroupsForSearchWidgetRequest** | [**CoreGradesGetGroupsForSearchWidgetRequest**](CoreGradesGetGroupsForSearchWidgetRequest.md) |  | 

### Return type

[**GradereportSingleviewGetGradeItemsForSearchWidget200Response**](GradereportSingleviewGetGradeItemsForSearchWidget200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

