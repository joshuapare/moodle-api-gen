# ModAssignGetSubmissionStatus200ResponseLastattempt

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blindmarking** | **bool** | Whether blind marking is enabled. | [default to null]
**canedit** | **bool** | Whether the user can edit the current submission. | [default to null]
**caneditowner** | **bool** | Whether the owner of the submission can edit it. | [default to null]
**cansubmit** | **bool** | Whether the user can submit. | [default to null]
**extensionduedate** | **i32** | Extension due date. | [default to null]
**graded** | **bool** | Whether the submission is graded. | [default to null]
**gradingstatus** | **String** | Grading status. | [default to null]
**locked** | **bool** | Whether new submissions are locked. | [default to null]
**submission** | Option<[**models::ModAssignGetSubmissionStatus200ResponseLastattemptSubmission**](mod_assign_get_submission_status_200_response_lastattempt_submission.md)> |  | [optional]
**submissiongroup** | Option<**i32**> | The submission group id (for group submissions only). | [optional][default to null]
**submissiongroupmemberswhoneedtosubmit** | Option<[**Vec<serde_json::Value>**](serde_json::Value.md)> |  | [optional]
**submissionsenabled** | **bool** | Whether submissions are enabled or not. | 
**teamsubmission** | Option<[**models::ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission**](mod_assign_get_submission_status_200_response_lastattempt_teamsubmission.md)> |  | [optional]
**timelimit** | Option<**i32**> | Time limit for submission. | [optional][default to null]
**usergroups** | [**Vec<serde_json::Value>**](serde_json::Value.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


