# MoodleClient.Model.ModAssignGetParticipant200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Allowsubmissionsfromdate** | **int** | allowsubmissionsfromdate for the user | [default to null]
**Blindmarking** | **bool** | is blind marking enabled for this assignment | [default to null]
**Cutoffdate** | **int** | cutoffdate for the user | [default to null]
**Duedate** | **int** | duedate for the user | [default to null]
**Duedatestr** | **string** | duedate for the user | [default to "null"]
**Fullname** | **string** | The fullname of the user | 
**Grantedextension** | **bool** | have they been granted an extension | [default to null]
**Groupid** | **int** | for group assignments this is the group id | [optional] [default to null]
**Groupname** | **string** | for group assignments this is the group name | [optional] [default to "null"]
**Id** | **int** | ID of the user | 
**Requiregrading** | **bool** | is their submission waiting for grading | [default to null]
**Submissionstatus** | **string** | The submission status (new, draft, reopened or submitted).                 Empty when not submitted. | [optional] [default to "null"]
**Submitted** | **bool** | have they submitted their assignment | [default to null]
**User** | [**ModAssignGetParticipant200ResponseUser**](ModAssignGetParticipant200ResponseUser.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

