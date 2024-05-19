# ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptnumber** | **int** | Attempt number. | [optional] [default to null]
**feedbackplugins** | [**List[ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner]**](ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner.md) |  | [optional] 
**grade** | [**ModAssignGetSubmissionStatus200ResponseFeedbackGrade**](ModAssignGetSubmissionStatus200ResponseFeedbackGrade.md) |  | [optional] 
**submission** | [**ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission**](ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_assign_get_submission_status200_response_previousattempts_inner import ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner from a JSON string
mod_assign_get_submission_status200_response_previousattempts_inner_instance = ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner.to_json())

# convert the object into a dict
mod_assign_get_submission_status200_response_previousattempts_inner_dict = mod_assign_get_submission_status200_response_previousattempts_inner_instance.to_dict()
# create an instance of ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner from a dict
mod_assign_get_submission_status200_response_previousattempts_inner_from_dict = ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner.from_dict(mod_assign_get_submission_status200_response_previousattempts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


