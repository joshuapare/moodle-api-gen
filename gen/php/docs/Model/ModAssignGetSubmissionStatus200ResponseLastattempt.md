# # ModAssignGetSubmissionStatus200ResponseLastattempt

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blindmarking** | **bool** | Whether blind marking is enabled. | [default to null]
**canedit** | **bool** | Whether the user can edit the current submission. | [default to null]
**caneditowner** | **bool** | Whether the owner of the submission can edit it. | [default to null]
**cansubmit** | **bool** | Whether the user can submit. | [default to null]
**extensionduedate** | **int** | Extension due date. | [default to null]
**graded** | **bool** | Whether the submission is graded. | [default to null]
**gradingstatus** | **string** | Grading status. | [default to 'null']
**locked** | **bool** | Whether new submissions are locked. | [default to null]
**submission** | [**\OpenAPI\Client\Model\ModAssignGetSubmissionStatus200ResponseLastattemptSubmission**](ModAssignGetSubmissionStatus200ResponseLastattemptSubmission.md) |  | [optional]
**submissiongroup** | **int** | The submission group id (for group submissions only). | [optional] [default to null]
**submissiongroupmemberswhoneedtosubmit** | **object[]** |  | [optional]
**submissionsenabled** | **bool** | Whether submissions are enabled or not. |
**teamsubmission** | [**\OpenAPI\Client\Model\ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission**](ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.md) |  | [optional]
**timelimit** | **int** | Time limit for submission. | [optional] [default to null]
**usergroups** | **object[]** |  |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
