

# ModAssignGetSubmissionStatus200ResponseLastattempt


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blindmarking** | **Boolean** | Whether blind marking is enabled. |  |
|**canedit** | **Boolean** | Whether the user can edit the current submission. |  |
|**caneditowner** | **Boolean** | Whether the owner of the submission can edit it. |  |
|**cansubmit** | **Boolean** | Whether the user can submit. |  |
|**extensionduedate** | **Integer** | Extension due date. |  |
|**graded** | **Boolean** | Whether the submission is graded. |  |
|**gradingstatus** | **String** | Grading status. |  |
|**locked** | **Boolean** | Whether new submissions are locked. |  |
|**submission** | [**ModAssignGetSubmissionStatus200ResponseLastattemptSubmission**](ModAssignGetSubmissionStatus200ResponseLastattemptSubmission.md) |  |  [optional] |
|**submissiongroup** | **Integer** | The submission group id (for group submissions only). |  [optional] |
|**submissiongroupmemberswhoneedtosubmit** | **List&lt;Object&gt;** |  |  [optional] |
|**submissionsenabled** | **Boolean** | Whether submissions are enabled or not. |  |
|**teamsubmission** | [**ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission**](ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.md) |  |  [optional] |
|**timelimit** | **Integer** | Time limit for submission. |  [optional] |
|**usergroups** | **List&lt;Object&gt;** |  |  |



