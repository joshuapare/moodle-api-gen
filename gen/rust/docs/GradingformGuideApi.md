# \GradingformGuideApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gradingform_guide_grader_gradingpanel_fetch**](GradingformGuideApi.md#gradingform_guide_grader_gradingpanel_fetch) | **POST** /gradingform_guide_grader_gradingpanel_fetch | Fetch the data required to display the grader grading panel, creating the grade item if required
[**gradingform_guide_grader_gradingpanel_store**](GradingformGuideApi.md#gradingform_guide_grader_gradingpanel_store) | **POST** /gradingform_guide_grader_gradingpanel_store | Store the grading data for a user from the grader grading panel.



## gradingform_guide_grader_gradingpanel_fetch

> models::GradingformGuideGraderGradingpanelFetch200Response gradingform_guide_grader_gradingpanel_fetch(core_grades_grader_gradingpanel_scale_fetch_request)
Fetch the data required to display the grader grading panel, creating the grade item if required

Fetch the data required to display the grader grading panel, creating the grade item if required

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_grades_grader_gradingpanel_scale_fetch_request** | [**CoreGradesGraderGradingpanelScaleFetchRequest**](CoreGradesGraderGradingpanelScaleFetchRequest.md) |  | [required] |

### Return type

[**models::GradingformGuideGraderGradingpanelFetch200Response**](gradingform_guide_grader_gradingpanel_fetch_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## gradingform_guide_grader_gradingpanel_store

> models::GradingformGuideGraderGradingpanelStore200Response gradingform_guide_grader_gradingpanel_store(core_grades_grader_gradingpanel_scale_store_request)
Store the grading data for a user from the grader grading panel.

Store the grading data for a user from the grader grading panel.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_grades_grader_gradingpanel_scale_store_request** | [**CoreGradesGraderGradingpanelScaleStoreRequest**](CoreGradesGraderGradingpanelScaleStoreRequest.md) |  | [required] |

### Return type

[**models::GradingformGuideGraderGradingpanelStore200Response**](gradingform_guide_grader_gradingpanel_store_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
