# CoreNotesGetCourseNotes200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canmanagecoursenotes** | Option<**bool**> | Whether the user can manage notes at the given course. | [optional][default to null]
**canmanagesystemnotes** | Option<**bool**> | Whether the user can manage notes at system level. | [optional][default to null]
**coursenotes** | Option<[**Vec<models::CoreNotesGetCourseNotes200ResponseCoursenotesInner>**](core_notes_get_course_notes_200_response_coursenotes_inner.md)> |  | [optional]
**personalnotes** | Option<[**Vec<models::CoreNotesGetCourseNotes200ResponsePersonalnotesInner>**](core_notes_get_course_notes_200_response_personalnotes_inner.md)> |  | [optional]
**sitenotes** | Option<[**Vec<models::CoreNotesGetCourseNotes200ResponsePersonalnotesInner>**](core_notes_get_course_notes_200_response_personalnotes_inner.md)> |  | [optional]
**warnings** | Option<[**Vec<models::AuthEmailSignupUser200ResponseWarningsInner>**](auth_email_signup_user_200_response_warnings_inner.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


