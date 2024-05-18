# ModLessonGetLessonAccessInformation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptscount** | **i32** | The number of attempts done by the user. | [default to null]
**cangrade** | **bool** | Whether the user can grade the lesson or not. | [default to null]
**canmanage** | **bool** | Whether the user can manage the lesson or not. | [default to null]
**canviewreports** | **bool** | Whether the user can view the lesson reports or not. | [default to null]
**firstpageid** | **i32** | The lesson first page id. | [default to null]
**lastpageseen** | **i32** | The last page seen id. | [default to null]
**leftduringtimedsession** | **bool** | Whether the user left during a timed session. | [default to null]
**preventaccessreasons** | [**Vec<models::ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner>**](mod_lesson_get_lesson_access_information_200_response_preventaccessreasons_inner.md) |  | 
**reviewmode** | **bool** | Whether the lesson is in review mode for the current user. | [default to null]
**warnings** | Option<[**Vec<models::AuthEmailSignupUser200ResponseWarningsInner>**](auth_email_signup_user_200_response_warnings_inner.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


