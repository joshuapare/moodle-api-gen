# ModAssignGetSubmissionStatus200ResponseLastattemptSubmission


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignment** | **int** | assignment id | [optional] 
**attemptnumber** | **int** | attempt number | 
**gradingstatus** | **str** | Grading status. | [optional] 
**groupid** | **int** | group id | 
**id** | **int** | submission id | [default to null]
**latest** | **int** | latest attempt | [optional] [default to null]
**plugins** | [**List[ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner]**](ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner.md) |  | [optional] 
**status** | **str** | submission status | [default to 'null']
**timecreated** | **int** | submission creation time | [default to null]
**timemodified** | **int** | submission last modified time | [default to null]
**timestarted** | **int** | submission start time | [optional] [default to null]
**userid** | **int** | student id | 

## Example

```python
from openapi_client.models.mod_assign_get_submission_status200_response_lastattempt_submission import ModAssignGetSubmissionStatus200ResponseLastattemptSubmission

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetSubmissionStatus200ResponseLastattemptSubmission from a JSON string
mod_assign_get_submission_status200_response_lastattempt_submission_instance = ModAssignGetSubmissionStatus200ResponseLastattemptSubmission.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetSubmissionStatus200ResponseLastattemptSubmission.to_json())

# convert the object into a dict
mod_assign_get_submission_status200_response_lastattempt_submission_dict = mod_assign_get_submission_status200_response_lastattempt_submission_instance.to_dict()
# create an instance of ModAssignGetSubmissionStatus200ResponseLastattemptSubmission from a dict
mod_assign_get_submission_status200_response_lastattempt_submission_from_dict = ModAssignGetSubmissionStatus200ResponseLastattemptSubmission.from_dict(mod_assign_get_submission_status200_response_lastattempt_submission_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


