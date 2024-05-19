# # ModAssignGetParticipant200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowsubmissionsfromdate** | **int** | allowsubmissionsfromdate for the user | [default to null]
**blindmarking** | **bool** | is blind marking enabled for this assignment | [default to null]
**cutoffdate** | **int** | cutoffdate for the user | [default to null]
**duedate** | **int** | duedate for the user | [default to null]
**duedatestr** | **string** | duedate for the user | [default to 'null']
**fullname** | **string** | The fullname of the user |
**grantedextension** | **bool** | have they been granted an extension | [default to null]
**groupid** | **int** | for group assignments this is the group id | [optional] [default to null]
**groupname** | **string** | for group assignments this is the group name | [optional] [default to 'null']
**id** | **int** | ID of the user |
**requiregrading** | **bool** | is their submission waiting for grading | [default to null]
**submissionstatus** | **string** | The submission status (new, draft, reopened or submitted).                 Empty when not submitted. | [optional] [default to 'null']
**submitted** | **bool** | have they submitted their assignment | [default to null]
**user** | [**\OpenAPI\Client\Model\ModAssignGetParticipant200ResponseUser**](ModAssignGetParticipant200ResponseUser.md) |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
