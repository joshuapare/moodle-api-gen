# \ModQuizApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_quiz_add_random_questions**](ModQuizApi.md#mod_quiz_add_random_questions) | **POST** /mod_quiz_add_random_questions | Add a number of random questions to a quiz.
[**mod_quiz_get_attempt_access_information**](ModQuizApi.md#mod_quiz_get_attempt_access_information) | **POST** /mod_quiz_get_attempt_access_information | Return access information for a given attempt in a quiz.
[**mod_quiz_get_attempt_data**](ModQuizApi.md#mod_quiz_get_attempt_data) | **POST** /mod_quiz_get_attempt_data | Returns information for the given attempt page for a quiz attempt in progress.
[**mod_quiz_get_attempt_review**](ModQuizApi.md#mod_quiz_get_attempt_review) | **POST** /mod_quiz_get_attempt_review | Returns review information for the given finished attempt, can be used by users or teachers.
[**mod_quiz_get_attempt_summary**](ModQuizApi.md#mod_quiz_get_attempt_summary) | **POST** /mod_quiz_get_attempt_summary | Returns a summary of a quiz attempt before it is submitted.
[**mod_quiz_get_combined_review_options**](ModQuizApi.md#mod_quiz_get_combined_review_options) | **POST** /mod_quiz_get_combined_review_options | Combines the review options from a number of different quiz attempts.
[**mod_quiz_get_quiz_access_information**](ModQuizApi.md#mod_quiz_get_quiz_access_information) | **POST** /mod_quiz_get_quiz_access_information | Return access information for a given quiz.
[**mod_quiz_get_quiz_feedback_for_grade**](ModQuizApi.md#mod_quiz_get_quiz_feedback_for_grade) | **POST** /mod_quiz_get_quiz_feedback_for_grade | Get the feedback text that should be show to a student who got the given grade in the given quiz.
[**mod_quiz_get_quiz_required_qtypes**](ModQuizApi.md#mod_quiz_get_quiz_required_qtypes) | **POST** /mod_quiz_get_quiz_required_qtypes | Return the potential question types that would be required for a given quiz.
[**mod_quiz_get_quizzes_by_courses**](ModQuizApi.md#mod_quiz_get_quizzes_by_courses) | **POST** /mod_quiz_get_quizzes_by_courses | Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.
[**mod_quiz_get_reopen_attempt_confirmation**](ModQuizApi.md#mod_quiz_get_reopen_attempt_confirmation) | **POST** /mod_quiz_get_reopen_attempt_confirmation | Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.
[**mod_quiz_get_user_attempts**](ModQuizApi.md#mod_quiz_get_user_attempts) | **POST** /mod_quiz_get_user_attempts | Return a list of attempts for the given quiz and user.
[**mod_quiz_get_user_best_grade**](ModQuizApi.md#mod_quiz_get_user_best_grade) | **POST** /mod_quiz_get_user_best_grade | Get the best current grade for the given user on a quiz.
[**mod_quiz_process_attempt**](ModQuizApi.md#mod_quiz_process_attempt) | **POST** /mod_quiz_process_attempt | Process responses during an attempt at a quiz and also deals with attempts finishing.
[**mod_quiz_reopen_attempt**](ModQuizApi.md#mod_quiz_reopen_attempt) | **POST** /mod_quiz_reopen_attempt | Re-open an attempt that is currently in the never submitted state.
[**mod_quiz_save_attempt**](ModQuizApi.md#mod_quiz_save_attempt) | **POST** /mod_quiz_save_attempt | Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.
[**mod_quiz_set_question_version**](ModQuizApi.md#mod_quiz_set_question_version) | **POST** /mod_quiz_set_question_version | Set the version of question that would be required for a given quiz.
[**mod_quiz_start_attempt**](ModQuizApi.md#mod_quiz_start_attempt) | **POST** /mod_quiz_start_attempt | Starts a new attempt at a quiz.
[**mod_quiz_update_filter_condition**](ModQuizApi.md#mod_quiz_update_filter_condition) | **POST** /mod_quiz_update_filter_condition | Update filter condition for a random question slot.
[**mod_quiz_view_attempt**](ModQuizApi.md#mod_quiz_view_attempt) | **POST** /mod_quiz_view_attempt | Trigger the attempt viewed event.
[**mod_quiz_view_attempt_review**](ModQuizApi.md#mod_quiz_view_attempt_review) | **POST** /mod_quiz_view_attempt_review | Trigger the attempt reviewed event.
[**mod_quiz_view_attempt_summary**](ModQuizApi.md#mod_quiz_view_attempt_summary) | **POST** /mod_quiz_view_attempt_summary | Trigger the attempt summary viewed event.
[**mod_quiz_view_quiz**](ModQuizApi.md#mod_quiz_view_quiz) | **POST** /mod_quiz_view_quiz | Trigger the course module viewed event and update the module completion status.



## mod_quiz_add_random_questions

> models::ModQuizAddRandomQuestions200Response mod_quiz_add_random_questions(mod_quiz_add_random_questions_request)
Add a number of random questions to a quiz.

Add a number of random questions to a quiz.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_add_random_questions_request** | [**ModQuizAddRandomQuestionsRequest**](ModQuizAddRandomQuestionsRequest.md) |  | [required] |

### Return type

[**models::ModQuizAddRandomQuestions200Response**](mod_quiz_add_random_questions_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_get_attempt_access_information

> models::ModQuizGetAttemptAccessInformation200Response mod_quiz_get_attempt_access_information(mod_quiz_get_attempt_access_information_request)
Return access information for a given attempt in a quiz.

Return access information for a given attempt in a quiz.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_get_attempt_access_information_request** | [**ModQuizGetAttemptAccessInformationRequest**](ModQuizGetAttemptAccessInformationRequest.md) |  | [required] |

### Return type

[**models::ModQuizGetAttemptAccessInformation200Response**](mod_quiz_get_attempt_access_information_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_get_attempt_data

> models::ModQuizGetAttemptData200Response mod_quiz_get_attempt_data(mod_quiz_get_attempt_data_request)
Returns information for the given attempt page for a quiz attempt in progress.

Returns information for the given attempt page for a quiz attempt in progress.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_get_attempt_data_request** | [**ModQuizGetAttemptDataRequest**](ModQuizGetAttemptDataRequest.md) |  | [required] |

### Return type

[**models::ModQuizGetAttemptData200Response**](mod_quiz_get_attempt_data_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_get_attempt_review

> models::ModQuizGetAttemptReview200Response mod_quiz_get_attempt_review(mod_quiz_get_attempt_review_request)
Returns review information for the given finished attempt, can be used by users or teachers.

Returns review information for the given finished attempt, can be used by users or teachers.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_get_attempt_review_request** | [**ModQuizGetAttemptReviewRequest**](ModQuizGetAttemptReviewRequest.md) |  | [required] |

### Return type

[**models::ModQuizGetAttemptReview200Response**](mod_quiz_get_attempt_review_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_get_attempt_summary

> models::ModQuizGetAttemptSummary200Response mod_quiz_get_attempt_summary(mod_quiz_get_attempt_summary_request)
Returns a summary of a quiz attempt before it is submitted.

Returns a summary of a quiz attempt before it is submitted.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_get_attempt_summary_request** | [**ModQuizGetAttemptSummaryRequest**](ModQuizGetAttemptSummaryRequest.md) |  | [required] |

### Return type

[**models::ModQuizGetAttemptSummary200Response**](mod_quiz_get_attempt_summary_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_get_combined_review_options

> models::ModQuizGetCombinedReviewOptions200Response mod_quiz_get_combined_review_options(mod_quiz_get_combined_review_options_request)
Combines the review options from a number of different quiz attempts.

Combines the review options from a number of different quiz attempts.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_get_combined_review_options_request** | [**ModQuizGetCombinedReviewOptionsRequest**](ModQuizGetCombinedReviewOptionsRequest.md) |  | [required] |

### Return type

[**models::ModQuizGetCombinedReviewOptions200Response**](mod_quiz_get_combined_review_options_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_get_quiz_access_information

> models::ModQuizGetQuizAccessInformation200Response mod_quiz_get_quiz_access_information(mod_quiz_get_quiz_access_information_request)
Return access information for a given quiz.

Return access information for a given quiz.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_get_quiz_access_information_request** | [**ModQuizGetQuizAccessInformationRequest**](ModQuizGetQuizAccessInformationRequest.md) |  | [required] |

### Return type

[**models::ModQuizGetQuizAccessInformation200Response**](mod_quiz_get_quiz_access_information_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_get_quiz_feedback_for_grade

> models::ModQuizGetQuizFeedbackForGrade200Response mod_quiz_get_quiz_feedback_for_grade(mod_quiz_get_quiz_feedback_for_grade_request)
Get the feedback text that should be show to a student who got the given grade in the given quiz.

Get the feedback text that should be show to a student who got the given grade in the given quiz.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_get_quiz_feedback_for_grade_request** | [**ModQuizGetQuizFeedbackForGradeRequest**](ModQuizGetQuizFeedbackForGradeRequest.md) |  | [required] |

### Return type

[**models::ModQuizGetQuizFeedbackForGrade200Response**](mod_quiz_get_quiz_feedback_for_grade_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_get_quiz_required_qtypes

> models::ModQuizGetQuizRequiredQtypes200Response mod_quiz_get_quiz_required_qtypes(mod_quiz_get_quiz_access_information_request)
Return the potential question types that would be required for a given quiz.

Return the potential question types that would be required for a given quiz.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_get_quiz_access_information_request** | [**ModQuizGetQuizAccessInformationRequest**](ModQuizGetQuizAccessInformationRequest.md) |  | [required] |

### Return type

[**models::ModQuizGetQuizRequiredQtypes200Response**](mod_quiz_get_quiz_required_qtypes_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_get_quizzes_by_courses

> models::ModQuizGetQuizzesByCourses200Response mod_quiz_get_quizzes_by_courses(mod_chat_get_chats_by_courses_request)
Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.

Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModQuizGetQuizzesByCourses200Response**](mod_quiz_get_quizzes_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_get_reopen_attempt_confirmation

> serde_json::Value mod_quiz_get_reopen_attempt_confirmation(mod_quiz_get_reopen_attempt_confirmation_request)
Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.

Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_get_reopen_attempt_confirmation_request** | [**ModQuizGetReopenAttemptConfirmationRequest**](ModQuizGetReopenAttemptConfirmationRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_get_user_attempts

> models::ModQuizGetUserAttempts200Response mod_quiz_get_user_attempts(mod_quiz_get_user_attempts_request)
Return a list of attempts for the given quiz and user.

Return a list of attempts for the given quiz and user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_get_user_attempts_request** | [**ModQuizGetUserAttemptsRequest**](ModQuizGetUserAttemptsRequest.md) |  | [required] |

### Return type

[**models::ModQuizGetUserAttempts200Response**](mod_quiz_get_user_attempts_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_get_user_best_grade

> models::ModQuizGetUserBestGrade200Response mod_quiz_get_user_best_grade(mod_quiz_get_user_best_grade_request)
Get the best current grade for the given user on a quiz.

Get the best current grade for the given user on a quiz.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_get_user_best_grade_request** | [**ModQuizGetUserBestGradeRequest**](ModQuizGetUserBestGradeRequest.md) |  | [required] |

### Return type

[**models::ModQuizGetUserBestGrade200Response**](mod_quiz_get_user_best_grade_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_process_attempt

> models::ModQuizProcessAttempt200Response mod_quiz_process_attempt(mod_quiz_process_attempt_request)
Process responses during an attempt at a quiz and also deals with attempts finishing.

Process responses during an attempt at a quiz and also deals with attempts finishing.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_process_attempt_request** | [**ModQuizProcessAttemptRequest**](ModQuizProcessAttemptRequest.md) |  | [required] |

### Return type

[**models::ModQuizProcessAttempt200Response**](mod_quiz_process_attempt_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_reopen_attempt

> serde_json::Value mod_quiz_reopen_attempt(mod_quiz_reopen_attempt_request)
Re-open an attempt that is currently in the never submitted state.

Re-open an attempt that is currently in the never submitted state.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_reopen_attempt_request** | [**ModQuizReopenAttemptRequest**](ModQuizReopenAttemptRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_save_attempt

> models::CoreCalendarDeleteSubscription200Response mod_quiz_save_attempt(mod_quiz_save_attempt_request)
Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.

Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_save_attempt_request** | [**ModQuizSaveAttemptRequest**](ModQuizSaveAttemptRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_set_question_version

> models::ModQuizSetQuestionVersion200Response mod_quiz_set_question_version(mod_quiz_set_question_version_request)
Set the version of question that would be required for a given quiz.

Set the version of question that would be required for a given quiz.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_set_question_version_request** | [**ModQuizSetQuestionVersionRequest**](ModQuizSetQuestionVersionRequest.md) |  | [required] |

### Return type

[**models::ModQuizSetQuestionVersion200Response**](mod_quiz_set_question_version_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_start_attempt

> models::ModQuizStartAttempt200Response mod_quiz_start_attempt(mod_quiz_start_attempt_request)
Starts a new attempt at a quiz.

Starts a new attempt at a quiz.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_start_attempt_request** | [**ModQuizStartAttemptRequest**](ModQuizStartAttemptRequest.md) |  | [required] |

### Return type

[**models::ModQuizStartAttempt200Response**](mod_quiz_start_attempt_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_update_filter_condition

> models::ModQuizAddRandomQuestions200Response mod_quiz_update_filter_condition(mod_quiz_update_filter_condition_request)
Update filter condition for a random question slot.

Update filter condition for a random question slot.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_update_filter_condition_request** | [**ModQuizUpdateFilterConditionRequest**](ModQuizUpdateFilterConditionRequest.md) |  | [required] |

### Return type

[**models::ModQuizAddRandomQuestions200Response**](mod_quiz_add_random_questions_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_view_attempt

> models::CoreCalendarDeleteSubscription200Response mod_quiz_view_attempt(mod_quiz_view_attempt_request)
Trigger the attempt viewed event.

Trigger the attempt viewed event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_view_attempt_request** | [**ModQuizViewAttemptRequest**](ModQuizViewAttemptRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_view_attempt_review

> models::CoreCalendarDeleteSubscription200Response mod_quiz_view_attempt_review(mod_quiz_view_attempt_review_request)
Trigger the attempt reviewed event.

Trigger the attempt reviewed event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_view_attempt_review_request** | [**ModQuizViewAttemptReviewRequest**](ModQuizViewAttemptReviewRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_view_attempt_summary

> models::CoreCalendarDeleteSubscription200Response mod_quiz_view_attempt_summary(mod_quiz_get_attempt_summary_request)
Trigger the attempt summary viewed event.

Trigger the attempt summary viewed event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_get_attempt_summary_request** | [**ModQuizGetAttemptSummaryRequest**](ModQuizGetAttemptSummaryRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_quiz_view_quiz

> models::CoreCalendarDeleteSubscription200Response mod_quiz_view_quiz(mod_quiz_get_quiz_access_information_request)
Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_quiz_get_quiz_access_information_request** | [**ModQuizGetQuizAccessInformationRequest**](ModQuizGetQuizAccessInformationRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

