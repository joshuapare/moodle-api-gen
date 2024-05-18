# \ModSurveyApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_survey_get_questions**](ModSurveyApi.md#mod_survey_get_questions) | **POST** /mod_survey_get_questions | Get the complete list of questions for the survey, including subquestions.
[**mod_survey_get_surveys_by_courses**](ModSurveyApi.md#mod_survey_get_surveys_by_courses) | **POST** /mod_survey_get_surveys_by_courses | Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.
[**mod_survey_submit_answers**](ModSurveyApi.md#mod_survey_submit_answers) | **POST** /mod_survey_submit_answers | Submit the answers for a given survey.
[**mod_survey_view_survey**](ModSurveyApi.md#mod_survey_view_survey) | **POST** /mod_survey_view_survey | Trigger the course module viewed event and update the module completion status.



## mod_survey_get_questions

> models::ModSurveyGetQuestions200Response mod_survey_get_questions(mod_survey_get_questions_request)
Get the complete list of questions for the survey, including subquestions.

Get the complete list of questions for the survey, including subquestions.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_survey_get_questions_request** | [**ModSurveyGetQuestionsRequest**](ModSurveyGetQuestionsRequest.md) |  | [required] |

### Return type

[**models::ModSurveyGetQuestions200Response**](mod_survey_get_questions_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_survey_get_surveys_by_courses

> models::ModSurveyGetSurveysByCourses200Response mod_survey_get_surveys_by_courses(mod_chat_get_chats_by_courses_request)
Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.

Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModSurveyGetSurveysByCourses200Response**](mod_survey_get_surveys_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_survey_submit_answers

> models::CoreCalendarDeleteSubscription200Response mod_survey_submit_answers(mod_survey_submit_answers_request)
Submit the answers for a given survey.

Submit the answers for a given survey.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_survey_submit_answers_request** | [**ModSurveySubmitAnswersRequest**](ModSurveySubmitAnswersRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_survey_view_survey

> models::CoreCalendarDeleteSubscription200Response mod_survey_view_survey(mod_survey_view_survey_request)
Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_survey_view_survey_request** | [**ModSurveyViewSurveyRequest**](ModSurveyViewSurveyRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

