# ModAssignGetParticipant200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowsubmissionsfromdate** | **i32** | allowsubmissionsfromdate for the user | [default to null]
**blindmarking** | **bool** | is blind marking enabled for this assignment | [default to null]
**cutoffdate** | **i32** | cutoffdate for the user | [default to null]
**duedate** | **i32** | duedate for the user | [default to null]
**duedatestr** | **String** | duedate for the user | [default to null]
**fullname** | **String** | The fullname of the user | 
**grantedextension** | **bool** | have they been granted an extension | [default to null]
**groupid** | Option<**i32**> | for group assignments this is the group id | [optional][default to null]
**groupname** | Option<**String**> | for group assignments this is the group name | [optional][default to null]
**id** | **i32** | ID of the user | 
**requiregrading** | **bool** | is their submission waiting for grading | [default to null]
**submissionstatus** | Option<**String**> | The submission status (new, draft, reopened or submitted).                 Empty when not submitted. | [optional][default to null]
**submitted** | **bool** | have they submitted their assignment | [default to null]
**user** | Option<[**models::ModAssignGetParticipant200ResponseUser**](mod_assign_get_participant_200_response_user.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


