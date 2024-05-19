# \ModFeedbackApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_feedback_get_analysis**](ModFeedbackApi.md#mod_feedback_get_analysis) | **POST** /mod_feedback_get_analysis | Retrieves the feedback analysis.
[**mod_feedback_get_current_completed_tmp**](ModFeedbackApi.md#mod_feedback_get_current_completed_tmp) | **POST** /mod_feedback_get_current_completed_tmp | Returns the temporary completion record for the current user.
[**mod_feedback_get_feedback_access_information**](ModFeedbackApi.md#mod_feedback_get_feedback_access_information) | **POST** /mod_feedback_get_feedback_access_information | Return access information for a given feedback.
[**mod_feedback_get_feedbacks_by_courses**](ModFeedbackApi.md#mod_feedback_get_feedbacks_by_courses) | **POST** /mod_feedback_get_feedbacks_by_courses | Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.
[**mod_feedback_get_finished_responses**](ModFeedbackApi.md#mod_feedback_get_finished_responses) | **POST** /mod_feedback_get_finished_responses | Retrieves responses from the last finished attempt.
[**mod_feedback_get_items**](ModFeedbackApi.md#mod_feedback_get_items) | **POST** /mod_feedback_get_items | Returns the items (questions) in the given feedback.
[**mod_feedback_get_last_completed**](ModFeedbackApi.md#mod_feedback_get_last_completed) | **POST** /mod_feedback_get_last_completed | Retrieves the last completion record for the current user.
[**mod_feedback_get_non_respondents**](ModFeedbackApi.md#mod_feedback_get_non_respondents) | **POST** /mod_feedback_get_non_respondents | Retrieves a list of students who didn't submit the feedback.
[**mod_feedback_get_page_items**](ModFeedbackApi.md#mod_feedback_get_page_items) | **POST** /mod_feedback_get_page_items | Get a single feedback page items.
[**mod_feedback_get_responses_analysis**](ModFeedbackApi.md#mod_feedback_get_responses_analysis) | **POST** /mod_feedback_get_responses_analysis | Return the feedback user responses analysis.
[**mod_feedback_get_unfinished_responses**](ModFeedbackApi.md#mod_feedback_get_unfinished_responses) | **POST** /mod_feedback_get_unfinished_responses | Retrieves responses from the current unfinished attempt.
[**mod_feedback_launch_feedback**](ModFeedbackApi.md#mod_feedback_launch_feedback) | **POST** /mod_feedback_launch_feedback | Starts or continues a feedback submission.
[**mod_feedback_process_page**](ModFeedbackApi.md#mod_feedback_process_page) | **POST** /mod_feedback_process_page | Process a jump between pages.
[**mod_feedback_view_feedback**](ModFeedbackApi.md#mod_feedback_view_feedback) | **POST** /mod_feedback_view_feedback | Trigger the course module viewed event and update the module completion status.



## mod_feedback_get_analysis

> models::ModFeedbackGetAnalysis200Response mod_feedback_get_analysis(mod_feedback_get_analysis_request)
Retrieves the feedback analysis.

Retrieves the feedback analysis.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_feedback_get_analysis_request** | [**ModFeedbackGetAnalysisRequest**](ModFeedbackGetAnalysisRequest.md) |  | [required] |

### Return type

[**models::ModFeedbackGetAnalysis200Response**](mod_feedback_get_analysis_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_feedback_get_current_completed_tmp

> models::ModFeedbackGetCurrentCompletedTmp200Response mod_feedback_get_current_completed_tmp(mod_feedback_get_current_completed_tmp_request)
Returns the temporary completion record for the current user.

Returns the temporary completion record for the current user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_feedback_get_current_completed_tmp_request** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md) |  | [required] |

### Return type

[**models::ModFeedbackGetCurrentCompletedTmp200Response**](mod_feedback_get_current_completed_tmp_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_feedback_get_feedback_access_information

> models::ModFeedbackGetFeedbackAccessInformation200Response mod_feedback_get_feedback_access_information(mod_feedback_get_feedback_access_information_request)
Return access information for a given feedback.

Return access information for a given feedback.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_feedback_get_feedback_access_information_request** | [**ModFeedbackGetFeedbackAccessInformationRequest**](ModFeedbackGetFeedbackAccessInformationRequest.md) |  | [required] |

### Return type

[**models::ModFeedbackGetFeedbackAccessInformation200Response**](mod_feedback_get_feedback_access_information_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_feedback_get_feedbacks_by_courses

> models::ModFeedbackGetFeedbacksByCourses200Response mod_feedback_get_feedbacks_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)
Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.

Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModFeedbackGetFeedbacksByCourses200Response**](mod_feedback_get_feedbacks_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_feedback_get_finished_responses

> models::ModFeedbackGetFinishedResponses200Response mod_feedback_get_finished_responses(mod_feedback_get_finished_responses_request)
Retrieves responses from the last finished attempt.

Retrieves responses from the last finished attempt.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_feedback_get_finished_responses_request** | [**ModFeedbackGetFinishedResponsesRequest**](ModFeedbackGetFinishedResponsesRequest.md) |  | [required] |

### Return type

[**models::ModFeedbackGetFinishedResponses200Response**](mod_feedback_get_finished_responses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_feedback_get_items

> models::ModFeedbackGetItems200Response mod_feedback_get_items(mod_feedback_get_current_completed_tmp_request)
Returns the items (questions) in the given feedback.

Returns the items (questions) in the given feedback.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_feedback_get_current_completed_tmp_request** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md) |  | [required] |

### Return type

[**models::ModFeedbackGetItems200Response**](mod_feedback_get_items_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_feedback_get_last_completed

> models::ModFeedbackGetLastCompleted200Response mod_feedback_get_last_completed(mod_feedback_get_current_completed_tmp_request)
Retrieves the last completion record for the current user.

Retrieves the last completion record for the current user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_feedback_get_current_completed_tmp_request** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md) |  | [required] |

### Return type

[**models::ModFeedbackGetLastCompleted200Response**](mod_feedback_get_last_completed_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_feedback_get_non_respondents

> models::ModFeedbackGetNonRespondents200Response mod_feedback_get_non_respondents(mod_feedback_get_non_respondents_request)
Retrieves a list of students who didn't submit the feedback.

Retrieves a list of students who didn't submit the feedback.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_feedback_get_non_respondents_request** | [**ModFeedbackGetNonRespondentsRequest**](ModFeedbackGetNonRespondentsRequest.md) |  | [required] |

### Return type

[**models::ModFeedbackGetNonRespondents200Response**](mod_feedback_get_non_respondents_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_feedback_get_page_items

> models::ModFeedbackGetPageItems200Response mod_feedback_get_page_items(mod_feedback_get_page_items_request)
Get a single feedback page items.

Get a single feedback page items.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_feedback_get_page_items_request** | [**ModFeedbackGetPageItemsRequest**](ModFeedbackGetPageItemsRequest.md) |  | [required] |

### Return type

[**models::ModFeedbackGetPageItems200Response**](mod_feedback_get_page_items_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_feedback_get_responses_analysis

> models::ModFeedbackGetResponsesAnalysis200Response mod_feedback_get_responses_analysis(mod_feedback_get_responses_analysis_request)
Return the feedback user responses analysis.

Return the feedback user responses analysis.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_feedback_get_responses_analysis_request** | [**ModFeedbackGetResponsesAnalysisRequest**](ModFeedbackGetResponsesAnalysisRequest.md) |  | [required] |

### Return type

[**models::ModFeedbackGetResponsesAnalysis200Response**](mod_feedback_get_responses_analysis_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_feedback_get_unfinished_responses

> models::ModFeedbackGetUnfinishedResponses200Response mod_feedback_get_unfinished_responses(mod_feedback_get_finished_responses_request)
Retrieves responses from the current unfinished attempt.

Retrieves responses from the current unfinished attempt.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_feedback_get_finished_responses_request** | [**ModFeedbackGetFinishedResponsesRequest**](ModFeedbackGetFinishedResponsesRequest.md) |  | [required] |

### Return type

[**models::ModFeedbackGetUnfinishedResponses200Response**](mod_feedback_get_unfinished_responses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_feedback_launch_feedback

> models::ModFeedbackLaunchFeedback200Response mod_feedback_launch_feedback(mod_feedback_get_current_completed_tmp_request)
Starts or continues a feedback submission.

Starts or continues a feedback submission.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_feedback_get_current_completed_tmp_request** | [**ModFeedbackGetCurrentCompletedTmpRequest**](ModFeedbackGetCurrentCompletedTmpRequest.md) |  | [required] |

### Return type

[**models::ModFeedbackLaunchFeedback200Response**](mod_feedback_launch_feedback_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_feedback_process_page

> models::ModFeedbackProcessPage200Response mod_feedback_process_page(mod_feedback_process_page_request)
Process a jump between pages.

Process a jump between pages.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_feedback_process_page_request** | [**ModFeedbackProcessPageRequest**](ModFeedbackProcessPageRequest.md) |  | [required] |

### Return type

[**models::ModFeedbackProcessPage200Response**](mod_feedback_process_page_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_feedback_view_feedback

> models::CoreCalendarDeleteSubscription200Response mod_feedback_view_feedback(mod_feedback_view_feedback_request)
Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_feedback_view_feedback_request** | [**ModFeedbackViewFeedbackRequest**](ModFeedbackViewFeedbackRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

