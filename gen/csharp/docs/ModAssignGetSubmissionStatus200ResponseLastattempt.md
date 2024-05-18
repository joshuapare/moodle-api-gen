# Org.OpenAPITools.Model.ModAssignGetSubmissionStatus200ResponseLastattempt

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Blindmarking** | **bool** | Whether blind marking is enabled. | [default to null]
**Canedit** | **bool** | Whether the user can edit the current submission. | [default to null]
**Caneditowner** | **bool** | Whether the owner of the submission can edit it. | [default to null]
**Cansubmit** | **bool** | Whether the user can submit. | [default to null]
**Extensionduedate** | **int** | Extension due date. | [default to null]
**Graded** | **bool** | Whether the submission is graded. | [default to null]
**Gradingstatus** | **string** | Grading status. | [default to "null"]
**Locked** | **bool** | Whether new submissions are locked. | [default to null]
**Submission** | [**ModAssignGetSubmissionStatus200ResponseLastattemptSubmission**](ModAssignGetSubmissionStatus200ResponseLastattemptSubmission.md) |  | [optional] 
**Submissiongroup** | **int** | The submission group id (for group submissions only). | [optional] [default to null]
**Submissiongroupmemberswhoneedtosubmit** | **List&lt;Object&gt;** |  | [optional] 
**Submissionsenabled** | **bool** | Whether submissions are enabled or not. | 
**Teamsubmission** | [**ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission**](ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.md) |  | [optional] 
**Timelimit** | **int** | Time limit for submission. | [optional] [default to null]
**Usergroups** | **List&lt;Object&gt;** |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

