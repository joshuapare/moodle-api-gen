# ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignment** | **int** | assignment id | [optional] 
**attemptnumber** | **int** | attempt number | 
**gradingstatus** | **str** | Grading status. | [optional] 
**groupid** | **int** | group id | 
**id** | **int** | submission id | 
**latest** | **int** | latest attempt | [optional] 
**plugins** | [**List[ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner]**](ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner.md) |  | [optional] 
**status** | **str** | submission status | 
**timecreated** | **int** | submission creation time | 
**timemodified** | **int** | submission last modified time | 
**timestarted** | **int** | submission start time | [optional] 
**userid** | **int** | student id | 

## Example

```python
from openapi_client.models.mod_assign_get_submission_status200_response_lastattempt_teamsubmission import ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission from a JSON string
mod_assign_get_submission_status200_response_lastattempt_teamsubmission_instance = ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.to_json())

# convert the object into a dict
mod_assign_get_submission_status200_response_lastattempt_teamsubmission_dict = mod_assign_get_submission_status200_response_lastattempt_teamsubmission_instance.to_dict()
# create an instance of ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission from a dict
mod_assign_get_submission_status200_response_lastattempt_teamsubmission_from_dict = ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.from_dict(mod_assign_get_submission_status200_response_lastattempt_teamsubmission_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


