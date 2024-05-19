# ModAssignGetSubmissionStatus200ResponseLastattempt


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blindmarking** | **bool** | Whether blind marking is enabled. | [default to False]
**canedit** | **bool** | Whether the user can edit the current submission. | [default to False]
**caneditowner** | **bool** | Whether the owner of the submission can edit it. | [default to False]
**cansubmit** | **bool** | Whether the user can submit. | [default to False]
**extensionduedate** | **int** | Extension due date. | [default to null]
**graded** | **bool** | Whether the submission is graded. | [default to False]
**gradingstatus** | **str** | Grading status. | [default to 'null']
**locked** | **bool** | Whether new submissions are locked. | [default to False]
**submission** | [**ModAssignGetSubmissionStatus200ResponseLastattemptSubmission**](ModAssignGetSubmissionStatus200ResponseLastattemptSubmission.md) |  | [optional] 
**submissiongroup** | **int** | The submission group id (for group submissions only). | [optional] [default to null]
**submissiongroupmemberswhoneedtosubmit** | **List[object]** |  | [optional] 
**submissionsenabled** | **bool** | Whether submissions are enabled or not. | 
**teamsubmission** | [**ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission**](ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.md) |  | [optional] 
**timelimit** | **int** | Time limit for submission. | [optional] [default to null]
**usergroups** | **List[object]** |  | 

## Example

```python
from openapi_client.models.mod_assign_get_submission_status200_response_lastattempt import ModAssignGetSubmissionStatus200ResponseLastattempt

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetSubmissionStatus200ResponseLastattempt from a JSON string
mod_assign_get_submission_status200_response_lastattempt_instance = ModAssignGetSubmissionStatus200ResponseLastattempt.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetSubmissionStatus200ResponseLastattempt.to_json())

# convert the object into a dict
mod_assign_get_submission_status200_response_lastattempt_dict = mod_assign_get_submission_status200_response_lastattempt_instance.to_dict()
# create an instance of ModAssignGetSubmissionStatus200ResponseLastattempt from a dict
mod_assign_get_submission_status200_response_lastattempt_from_dict = ModAssignGetSubmissionStatus200ResponseLastattempt.from_dict(mod_assign_get_submission_status200_response_lastattempt_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


