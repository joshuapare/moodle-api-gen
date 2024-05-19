# \ModAssignApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_assign_copy_previous_attempt**](ModAssignApi.md#mod_assign_copy_previous_attempt) | **POST** /mod_assign_copy_previous_attempt | Copy a students previous attempt to a new attempt.
[**mod_assign_get_assignments**](ModAssignApi.md#mod_assign_get_assignments) | **POST** /mod_assign_get_assignments | Returns the courses and assignments for the users capability
[**mod_assign_get_grades**](ModAssignApi.md#mod_assign_get_grades) | **POST** /mod_assign_get_grades | Returns grades from the assignment
[**mod_assign_get_participant**](ModAssignApi.md#mod_assign_get_participant) | **POST** /mod_assign_get_participant | Get a participant for an assignment, with some summary info about their submissions.
[**mod_assign_get_submission_status**](ModAssignApi.md#mod_assign_get_submission_status) | **POST** /mod_assign_get_submission_status | Returns information about an assignment submission status for a given user.
[**mod_assign_get_submissions**](ModAssignApi.md#mod_assign_get_submissions) | **POST** /mod_assign_get_submissions | Returns the submissions for assignments
[**mod_assign_get_user_flags**](ModAssignApi.md#mod_assign_get_user_flags) | **POST** /mod_assign_get_user_flags | Returns the user flags for assignments
[**mod_assign_get_user_mappings**](ModAssignApi.md#mod_assign_get_user_mappings) | **POST** /mod_assign_get_user_mappings | Returns the blind marking mappings for assignments
[**mod_assign_list_participants**](ModAssignApi.md#mod_assign_list_participants) | **POST** /mod_assign_list_participants | List the participants for a single assignment, with some summary info about their submissions.
[**mod_assign_lock_submissions**](ModAssignApi.md#mod_assign_lock_submissions) | **POST** /mod_assign_lock_submissions | Prevent students from making changes to a list of submissions
[**mod_assign_reveal_identities**](ModAssignApi.md#mod_assign_reveal_identities) | **POST** /mod_assign_reveal_identities | Reveal the identities for a blind marking assignment
[**mod_assign_revert_submissions_to_draft**](ModAssignApi.md#mod_assign_revert_submissions_to_draft) | **POST** /mod_assign_revert_submissions_to_draft | Reverts the list of submissions to draft status
[**mod_assign_save_grade**](ModAssignApi.md#mod_assign_save_grade) | **POST** /mod_assign_save_grade | Save a grade update for a single student.
[**mod_assign_save_grades**](ModAssignApi.md#mod_assign_save_grades) | **POST** /mod_assign_save_grades | Save multiple grade updates for an assignment.
[**mod_assign_save_submission**](ModAssignApi.md#mod_assign_save_submission) | **POST** /mod_assign_save_submission | Update the current students submission
[**mod_assign_save_user_extensions**](ModAssignApi.md#mod_assign_save_user_extensions) | **POST** /mod_assign_save_user_extensions | Save a list of assignment extensions
[**mod_assign_set_user_flags**](ModAssignApi.md#mod_assign_set_user_flags) | **POST** /mod_assign_set_user_flags | Creates or updates user flags
[**mod_assign_start_submission**](ModAssignApi.md#mod_assign_start_submission) | **POST** /mod_assign_start_submission | Start a submission for user if assignment has a time limit.
[**mod_assign_submit_for_grading**](ModAssignApi.md#mod_assign_submit_for_grading) | **POST** /mod_assign_submit_for_grading | Submit the current students assignment for grading
[**mod_assign_submit_grading_form**](ModAssignApi.md#mod_assign_submit_grading_form) | **POST** /mod_assign_submit_grading_form | Submit the grading form data via ajax
[**mod_assign_unlock_submissions**](ModAssignApi.md#mod_assign_unlock_submissions) | **POST** /mod_assign_unlock_submissions | Allow students to make changes to a list of submissions
[**mod_assign_view_assign**](ModAssignApi.md#mod_assign_view_assign) | **POST** /mod_assign_view_assign | Update the module completion status.
[**mod_assign_view_grading_table**](ModAssignApi.md#mod_assign_view_grading_table) | **POST** /mod_assign_view_grading_table | Trigger the grading_table_viewed event.
[**mod_assign_view_submission_status**](ModAssignApi.md#mod_assign_view_submission_status) | **POST** /mod_assign_view_submission_status | Trigger the submission status viewed event.



## mod_assign_copy_previous_attempt

> serde_json::Value mod_assign_copy_previous_attempt(mod_assign_copy_previous_attempt_request)
Copy a students previous attempt to a new attempt.

Copy a students previous attempt to a new attempt.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_copy_previous_attempt_request** | [**ModAssignCopyPreviousAttemptRequest**](ModAssignCopyPreviousAttemptRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_get_assignments

> models::ModAssignGetAssignments200Response mod_assign_get_assignments(mod_assign_get_assignments_request)
Returns the courses and assignments for the users capability

Returns the courses and assignments for the users capability

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_get_assignments_request** | [**ModAssignGetAssignmentsRequest**](ModAssignGetAssignmentsRequest.md) |  | [required] |

### Return type

[**models::ModAssignGetAssignments200Response**](mod_assign_get_assignments_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_get_grades

> models::ModAssignGetGrades200Response mod_assign_get_grades(mod_assign_get_grades_request)
Returns grades from the assignment

Returns grades from the assignment

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_get_grades_request** | [**ModAssignGetGradesRequest**](ModAssignGetGradesRequest.md) |  | [required] |

### Return type

[**models::ModAssignGetGrades200Response**](mod_assign_get_grades_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_get_participant

> models::ModAssignGetParticipant200Response mod_assign_get_participant(mod_assign_get_participant_request)
Get a participant for an assignment, with some summary info about their submissions.

Get a participant for an assignment, with some summary info about their submissions.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_get_participant_request** | [**ModAssignGetParticipantRequest**](ModAssignGetParticipantRequest.md) |  | [required] |

### Return type

[**models::ModAssignGetParticipant200Response**](mod_assign_get_participant_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_get_submission_status

> models::ModAssignGetSubmissionStatus200Response mod_assign_get_submission_status(mod_assign_get_submission_status_request)
Returns information about an assignment submission status for a given user.

Returns information about an assignment submission status for a given user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_get_submission_status_request** | [**ModAssignGetSubmissionStatusRequest**](ModAssignGetSubmissionStatusRequest.md) |  | [required] |

### Return type

[**models::ModAssignGetSubmissionStatus200Response**](mod_assign_get_submission_status_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_get_submissions

> models::ModAssignGetSubmissions200Response mod_assign_get_submissions(mod_assign_get_submissions_request)
Returns the submissions for assignments

Returns the submissions for assignments

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_get_submissions_request** | [**ModAssignGetSubmissionsRequest**](ModAssignGetSubmissionsRequest.md) |  | [required] |

### Return type

[**models::ModAssignGetSubmissions200Response**](mod_assign_get_submissions_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_get_user_flags

> models::ModAssignGetUserFlags200Response mod_assign_get_user_flags(mod_assign_get_user_flags_request)
Returns the user flags for assignments

Returns the user flags for assignments

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_get_user_flags_request** | [**ModAssignGetUserFlagsRequest**](ModAssignGetUserFlagsRequest.md) |  | [required] |

### Return type

[**models::ModAssignGetUserFlags200Response**](mod_assign_get_user_flags_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_get_user_mappings

> models::ModAssignGetUserMappings200Response mod_assign_get_user_mappings(mod_assign_get_user_flags_request)
Returns the blind marking mappings for assignments

Returns the blind marking mappings for assignments

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_get_user_flags_request** | [**ModAssignGetUserFlagsRequest**](ModAssignGetUserFlagsRequest.md) |  | [required] |

### Return type

[**models::ModAssignGetUserMappings200Response**](mod_assign_get_user_mappings_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_list_participants

> serde_json::Value mod_assign_list_participants(mod_assign_list_participants_request)
List the participants for a single assignment, with some summary info about their submissions.

List the participants for a single assignment, with some summary info about their submissions.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_list_participants_request** | [**ModAssignListParticipantsRequest**](ModAssignListParticipantsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_lock_submissions

> serde_json::Value mod_assign_lock_submissions(mod_assign_lock_submissions_request)
Prevent students from making changes to a list of submissions

Prevent students from making changes to a list of submissions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_lock_submissions_request** | [**ModAssignLockSubmissionsRequest**](ModAssignLockSubmissionsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_reveal_identities

> serde_json::Value mod_assign_reveal_identities(mod_assign_reveal_identities_request)
Reveal the identities for a blind marking assignment

Reveal the identities for a blind marking assignment

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_reveal_identities_request** | [**ModAssignRevealIdentitiesRequest**](ModAssignRevealIdentitiesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_revert_submissions_to_draft

> serde_json::Value mod_assign_revert_submissions_to_draft(mod_assign_revert_submissions_to_draft_request)
Reverts the list of submissions to draft status

Reverts the list of submissions to draft status

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_revert_submissions_to_draft_request** | [**ModAssignRevertSubmissionsToDraftRequest**](ModAssignRevertSubmissionsToDraftRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_save_grade

> serde_json::Value mod_assign_save_grade(mod_assign_save_grade_request)
Save a grade update for a single student.

Save a grade update for a single student.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_save_grade_request** | [**ModAssignSaveGradeRequest**](ModAssignSaveGradeRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_save_grades

> serde_json::Value mod_assign_save_grades(mod_assign_save_grades_request)
Save multiple grade updates for an assignment.

Save multiple grade updates for an assignment.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_save_grades_request** | [**ModAssignSaveGradesRequest**](ModAssignSaveGradesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_save_submission

> serde_json::Value mod_assign_save_submission(mod_assign_save_submission_request)
Update the current students submission

Update the current students submission

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_save_submission_request** | [**ModAssignSaveSubmissionRequest**](ModAssignSaveSubmissionRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_save_user_extensions

> serde_json::Value mod_assign_save_user_extensions(mod_assign_save_user_extensions_request)
Save a list of assignment extensions

Save a list of assignment extensions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_save_user_extensions_request** | [**ModAssignSaveUserExtensionsRequest**](ModAssignSaveUserExtensionsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_set_user_flags

> serde_json::Value mod_assign_set_user_flags(mod_assign_set_user_flags_request)
Creates or updates user flags

Creates or updates user flags

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_set_user_flags_request** | [**ModAssignSetUserFlagsRequest**](ModAssignSetUserFlagsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_start_submission

> models::ModAssignStartSubmission200Response mod_assign_start_submission(mod_assign_start_submission_request)
Start a submission for user if assignment has a time limit.

Start a submission for user if assignment has a time limit.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_start_submission_request** | [**ModAssignStartSubmissionRequest**](ModAssignStartSubmissionRequest.md) |  | [required] |

### Return type

[**models::ModAssignStartSubmission200Response**](mod_assign_start_submission_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_submit_for_grading

> serde_json::Value mod_assign_submit_for_grading(mod_assign_submit_for_grading_request)
Submit the current students assignment for grading

Submit the current students assignment for grading

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_submit_for_grading_request** | [**ModAssignSubmitForGradingRequest**](ModAssignSubmitForGradingRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_submit_grading_form

> serde_json::Value mod_assign_submit_grading_form(mod_assign_submit_grading_form_request)
Submit the grading form data via ajax

Submit the grading form data via ajax

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_submit_grading_form_request** | [**ModAssignSubmitGradingFormRequest**](ModAssignSubmitGradingFormRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_unlock_submissions

> serde_json::Value mod_assign_unlock_submissions(mod_assign_revert_submissions_to_draft_request)
Allow students to make changes to a list of submissions

Allow students to make changes to a list of submissions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_revert_submissions_to_draft_request** | [**ModAssignRevertSubmissionsToDraftRequest**](ModAssignRevertSubmissionsToDraftRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_view_assign

> models::CoreCalendarDeleteSubscription200Response mod_assign_view_assign(mod_assign_view_assign_request)
Update the module completion status.

Update the module completion status.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_view_assign_request** | [**ModAssignViewAssignRequest**](ModAssignViewAssignRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_view_grading_table

> models::CoreCalendarDeleteSubscription200Response mod_assign_view_grading_table(mod_assign_view_assign_request)
Trigger the grading_table_viewed event.

Trigger the grading_table_viewed event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_view_assign_request** | [**ModAssignViewAssignRequest**](ModAssignViewAssignRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_assign_view_submission_status

> models::CoreCalendarDeleteSubscription200Response mod_assign_view_submission_status(mod_assign_view_assign_request)
Trigger the submission status viewed event.

Trigger the submission status viewed event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_assign_view_assign_request** | [**ModAssignViewAssignRequest**](ModAssignViewAssignRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

