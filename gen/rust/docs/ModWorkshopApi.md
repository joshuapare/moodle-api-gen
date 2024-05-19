# \ModWorkshopApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_workshop_add_submission**](ModWorkshopApi.md#mod_workshop_add_submission) | **POST** /mod_workshop_add_submission | Add a new submission to a given workshop.
[**mod_workshop_delete_submission**](ModWorkshopApi.md#mod_workshop_delete_submission) | **POST** /mod_workshop_delete_submission | Deletes the given submission.
[**mod_workshop_evaluate_assessment**](ModWorkshopApi.md#mod_workshop_evaluate_assessment) | **POST** /mod_workshop_evaluate_assessment | Evaluates an assessment (used by teachers for provide feedback to the reviewer).
[**mod_workshop_evaluate_submission**](ModWorkshopApi.md#mod_workshop_evaluate_submission) | **POST** /mod_workshop_evaluate_submission | Evaluates a submission (used by teachers for provide feedback or override the submission grade).
[**mod_workshop_get_assessment**](ModWorkshopApi.md#mod_workshop_get_assessment) | **POST** /mod_workshop_get_assessment | Retrieves the given assessment.
[**mod_workshop_get_assessment_form_definition**](ModWorkshopApi.md#mod_workshop_get_assessment_form_definition) | **POST** /mod_workshop_get_assessment_form_definition | Retrieves the assessment form definition.
[**mod_workshop_get_grades**](ModWorkshopApi.md#mod_workshop_get_grades) | **POST** /mod_workshop_get_grades | Returns the assessment and submission grade for the given user.
[**mod_workshop_get_grades_report**](ModWorkshopApi.md#mod_workshop_get_grades_report) | **POST** /mod_workshop_get_grades_report | Retrieves the assessment grades report.
[**mod_workshop_get_reviewer_assessments**](ModWorkshopApi.md#mod_workshop_get_reviewer_assessments) | **POST** /mod_workshop_get_reviewer_assessments | Retrieves all the assessments reviewed by the given user.
[**mod_workshop_get_submission**](ModWorkshopApi.md#mod_workshop_get_submission) | **POST** /mod_workshop_get_submission | Retrieves the given submission.
[**mod_workshop_get_submission_assessments**](ModWorkshopApi.md#mod_workshop_get_submission_assessments) | **POST** /mod_workshop_get_submission_assessments | Retrieves all the assessments of the given submission.
[**mod_workshop_get_submissions**](ModWorkshopApi.md#mod_workshop_get_submissions) | **POST** /mod_workshop_get_submissions | Retrieves all the workshop submissions or the one done by the given user (except example submissions).
[**mod_workshop_get_user_plan**](ModWorkshopApi.md#mod_workshop_get_user_plan) | **POST** /mod_workshop_get_user_plan | Return the planner information for the given user.
[**mod_workshop_get_workshop_access_information**](ModWorkshopApi.md#mod_workshop_get_workshop_access_information) | **POST** /mod_workshop_get_workshop_access_information | Return access information for a given workshop.
[**mod_workshop_get_workshops_by_courses**](ModWorkshopApi.md#mod_workshop_get_workshops_by_courses) | **POST** /mod_workshop_get_workshops_by_courses | Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.
[**mod_workshop_update_assessment**](ModWorkshopApi.md#mod_workshop_update_assessment) | **POST** /mod_workshop_update_assessment | Add information to an allocated assessment.
[**mod_workshop_update_submission**](ModWorkshopApi.md#mod_workshop_update_submission) | **POST** /mod_workshop_update_submission | Update the given submission.
[**mod_workshop_view_submission**](ModWorkshopApi.md#mod_workshop_view_submission) | **POST** /mod_workshop_view_submission | Trigger the submission viewed event.
[**mod_workshop_view_workshop**](ModWorkshopApi.md#mod_workshop_view_workshop) | **POST** /mod_workshop_view_workshop | Trigger the course module viewed event and update the module completion status.



## mod_workshop_add_submission

> models::ModWorkshopAddSubmission200Response mod_workshop_add_submission(mod_workshop_add_submission_request)
Add a new submission to a given workshop.

Add a new submission to a given workshop.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_workshop_add_submission_request** | [**ModWorkshopAddSubmissionRequest**](ModWorkshopAddSubmissionRequest.md) |  | [required] |

### Return type

[**models::ModWorkshopAddSubmission200Response**](mod_workshop_add_submission_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_workshop_delete_submission

> models::ModWorkshopDeleteSubmission200Response mod_workshop_delete_submission(mod_workshop_delete_submission_request)
Deletes the given submission.

Deletes the given submission.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_workshop_delete_submission_request** | [**ModWorkshopDeleteSubmissionRequest**](ModWorkshopDeleteSubmissionRequest.md) |  | [required] |

### Return type

[**models::ModWorkshopDeleteSubmission200Response**](mod_workshop_delete_submission_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_workshop_evaluate_assessment

> models::ModWorkshopEvaluateAssessment200Response mod_workshop_evaluate_assessment(mod_workshop_evaluate_assessment_request)
Evaluates an assessment (used by teachers for provide feedback to the reviewer).

Evaluates an assessment (used by teachers for provide feedback to the reviewer).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_workshop_evaluate_assessment_request** | [**ModWorkshopEvaluateAssessmentRequest**](ModWorkshopEvaluateAssessmentRequest.md) |  | [required] |

### Return type

[**models::ModWorkshopEvaluateAssessment200Response**](mod_workshop_evaluate_assessment_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_workshop_evaluate_submission

> models::ModWorkshopEvaluateSubmission200Response mod_workshop_evaluate_submission(mod_workshop_evaluate_submission_request)
Evaluates a submission (used by teachers for provide feedback or override the submission grade).

Evaluates a submission (used by teachers for provide feedback or override the submission grade).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_workshop_evaluate_submission_request** | [**ModWorkshopEvaluateSubmissionRequest**](ModWorkshopEvaluateSubmissionRequest.md) |  | [required] |

### Return type

[**models::ModWorkshopEvaluateSubmission200Response**](mod_workshop_evaluate_submission_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_workshop_get_assessment

> models::ModWorkshopGetAssessment200Response mod_workshop_get_assessment(mod_workshop_get_assessment_request)
Retrieves the given assessment.

Retrieves the given assessment.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_workshop_get_assessment_request** | [**ModWorkshopGetAssessmentRequest**](ModWorkshopGetAssessmentRequest.md) |  | [required] |

### Return type

[**models::ModWorkshopGetAssessment200Response**](mod_workshop_get_assessment_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_workshop_get_assessment_form_definition

> models::ModWorkshopGetAssessmentFormDefinition200Response mod_workshop_get_assessment_form_definition(mod_workshop_get_assessment_form_definition_request)
Retrieves the assessment form definition.

Retrieves the assessment form definition.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_workshop_get_assessment_form_definition_request** | [**ModWorkshopGetAssessmentFormDefinitionRequest**](ModWorkshopGetAssessmentFormDefinitionRequest.md) |  | [required] |

### Return type

[**models::ModWorkshopGetAssessmentFormDefinition200Response**](mod_workshop_get_assessment_form_definition_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_workshop_get_grades

> models::ModWorkshopGetGrades200Response mod_workshop_get_grades(mod_workshop_get_grades_request)
Returns the assessment and submission grade for the given user.

Returns the assessment and submission grade for the given user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_workshop_get_grades_request** | [**ModWorkshopGetGradesRequest**](ModWorkshopGetGradesRequest.md) |  | [required] |

### Return type

[**models::ModWorkshopGetGrades200Response**](mod_workshop_get_grades_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_workshop_get_grades_report

> models::ModWorkshopGetGradesReport200Response mod_workshop_get_grades_report(mod_workshop_get_grades_report_request)
Retrieves the assessment grades report.

Retrieves the assessment grades report.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_workshop_get_grades_report_request** | [**ModWorkshopGetGradesReportRequest**](ModWorkshopGetGradesReportRequest.md) |  | [required] |

### Return type

[**models::ModWorkshopGetGradesReport200Response**](mod_workshop_get_grades_report_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_workshop_get_reviewer_assessments

> models::ModWorkshopGetReviewerAssessments200Response mod_workshop_get_reviewer_assessments(mod_workshop_get_reviewer_assessments_request)
Retrieves all the assessments reviewed by the given user.

Retrieves all the assessments reviewed by the given user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_workshop_get_reviewer_assessments_request** | [**ModWorkshopGetReviewerAssessmentsRequest**](ModWorkshopGetReviewerAssessmentsRequest.md) |  | [required] |

### Return type

[**models::ModWorkshopGetReviewerAssessments200Response**](mod_workshop_get_reviewer_assessments_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_workshop_get_submission

> models::ModWorkshopGetSubmission200Response mod_workshop_get_submission(mod_workshop_get_submission_request)
Retrieves the given submission.

Retrieves the given submission.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_workshop_get_submission_request** | [**ModWorkshopGetSubmissionRequest**](ModWorkshopGetSubmissionRequest.md) |  | [required] |

### Return type

[**models::ModWorkshopGetSubmission200Response**](mod_workshop_get_submission_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_workshop_get_submission_assessments

> models::ModWorkshopGetReviewerAssessments200Response mod_workshop_get_submission_assessments(mod_workshop_get_submission_request)
Retrieves all the assessments of the given submission.

Retrieves all the assessments of the given submission.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_workshop_get_submission_request** | [**ModWorkshopGetSubmissionRequest**](ModWorkshopGetSubmissionRequest.md) |  | [required] |

### Return type

[**models::ModWorkshopGetReviewerAssessments200Response**](mod_workshop_get_reviewer_assessments_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_workshop_get_submissions

> models::ModWorkshopGetSubmissions200Response mod_workshop_get_submissions(mod_workshop_get_submissions_request)
Retrieves all the workshop submissions or the one done by the given user (except example submissions).

Retrieves all the workshop submissions or the one done by the given user (except example submissions).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_workshop_get_submissions_request** | [**ModWorkshopGetSubmissionsRequest**](ModWorkshopGetSubmissionsRequest.md) |  | [required] |

### Return type

[**models::ModWorkshopGetSubmissions200Response**](mod_workshop_get_submissions_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_workshop_get_user_plan

> models::ModWorkshopGetUserPlan200Response mod_workshop_get_user_plan(mod_workshop_get_user_plan_request)
Return the planner information for the given user.

Return the planner information for the given user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_workshop_get_user_plan_request** | [**ModWorkshopGetUserPlanRequest**](ModWorkshopGetUserPlanRequest.md) |  | [required] |

### Return type

[**models::ModWorkshopGetUserPlan200Response**](mod_workshop_get_user_plan_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_workshop_get_workshop_access_information

> models::ModWorkshopGetWorkshopAccessInformation200Response mod_workshop_get_workshop_access_information(mod_workshop_get_workshop_access_information_request)
Return access information for a given workshop.

Return access information for a given workshop.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_workshop_get_workshop_access_information_request** | [**ModWorkshopGetWorkshopAccessInformationRequest**](ModWorkshopGetWorkshopAccessInformationRequest.md) |  | [required] |

### Return type

[**models::ModWorkshopGetWorkshopAccessInformation200Response**](mod_workshop_get_workshop_access_information_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_workshop_get_workshops_by_courses

> models::ModWorkshopGetWorkshopsByCourses200Response mod_workshop_get_workshops_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)
Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.

Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModWorkshopGetWorkshopsByCourses200Response**](mod_workshop_get_workshops_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_workshop_update_assessment

> models::ModWorkshopUpdateAssessment200Response mod_workshop_update_assessment(mod_workshop_update_assessment_request)
Add information to an allocated assessment.

Add information to an allocated assessment.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_workshop_update_assessment_request** | [**ModWorkshopUpdateAssessmentRequest**](ModWorkshopUpdateAssessmentRequest.md) |  | [required] |

### Return type

[**models::ModWorkshopUpdateAssessment200Response**](mod_workshop_update_assessment_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_workshop_update_submission

> models::ModWorkshopUpdateSubmission200Response mod_workshop_update_submission(mod_workshop_update_submission_request)
Update the given submission.

Update the given submission.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_workshop_update_submission_request** | [**ModWorkshopUpdateSubmissionRequest**](ModWorkshopUpdateSubmissionRequest.md) |  | [required] |

### Return type

[**models::ModWorkshopUpdateSubmission200Response**](mod_workshop_update_submission_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_workshop_view_submission

> models::CoreCalendarDeleteSubscription200Response mod_workshop_view_submission(mod_workshop_get_submission_request)
Trigger the submission viewed event.

Trigger the submission viewed event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_workshop_get_submission_request** | [**ModWorkshopGetSubmissionRequest**](ModWorkshopGetSubmissionRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_workshop_view_workshop

> models::CoreCalendarDeleteSubscription200Response mod_workshop_view_workshop(mod_workshop_view_workshop_request)
Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_workshop_view_workshop_request** | [**ModWorkshopViewWorkshopRequest**](ModWorkshopViewWorkshopRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

