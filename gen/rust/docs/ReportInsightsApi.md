# \ReportInsightsApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**report_insights_action_executed**](ReportInsightsApi.md#report_insights_action_executed) | **POST** /report_insights_action_executed | Stores an action executed over a group of predictions.
[**report_insights_set_fixed_prediction**](ReportInsightsApi.md#report_insights_set_fixed_prediction) | **POST** /report_insights_set_fixed_prediction | Flags a prediction as fixed.
[**report_insights_set_notuseful_prediction**](ReportInsightsApi.md#report_insights_set_notuseful_prediction) | **POST** /report_insights_set_notuseful_prediction | Flags the prediction as not useful.



## report_insights_action_executed

> models::CoreCohortAddCohortMembers200Response report_insights_action_executed(report_insights_action_executed_request)
Stores an action executed over a group of predictions.

Stores an action executed over a group of predictions.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**report_insights_action_executed_request** | [**ReportInsightsActionExecutedRequest**](ReportInsightsActionExecutedRequest.md) |  | [required] |

### Return type

[**models::CoreCohortAddCohortMembers200Response**](core_cohort_add_cohort_members_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## report_insights_set_fixed_prediction

> models::ReportInsightsSetFixedPrediction200Response report_insights_set_fixed_prediction(report_insights_set_fixed_prediction_request)
Flags a prediction as fixed.

Flags a prediction as fixed.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**report_insights_set_fixed_prediction_request** | [**ReportInsightsSetFixedPredictionRequest**](ReportInsightsSetFixedPredictionRequest.md) |  | [required] |

### Return type

[**models::ReportInsightsSetFixedPrediction200Response**](report_insights_set_fixed_prediction_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## report_insights_set_notuseful_prediction

> models::ReportInsightsSetNotusefulPrediction200Response report_insights_set_notuseful_prediction(report_insights_set_notuseful_prediction_request)
Flags the prediction as not useful.

Flags the prediction as not useful.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**report_insights_set_notuseful_prediction_request** | [**ReportInsightsSetNotusefulPredictionRequest**](ReportInsightsSetNotusefulPredictionRequest.md) |  | [required] |

### Return type

[**models::ReportInsightsSetNotusefulPrediction200Response**](report_insights_set_notuseful_prediction_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

