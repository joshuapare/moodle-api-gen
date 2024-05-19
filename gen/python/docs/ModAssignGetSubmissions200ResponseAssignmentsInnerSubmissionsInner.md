# ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner

submission info

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignment** | **int** | assignment id | [optional] 
**attemptnumber** | **int** | attempt number | [optional] 
**gradingstatus** | **str** | Grading status. | [optional] 
**groupid** | **int** | group id | [optional] 
**id** | **int** | submission id | [optional] 
**latest** | **int** | latest attempt | [optional] 
**plugins** | [**List[ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner]**](ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner.md) |  | [optional] 
**status** | **str** | submission status | [optional] 
**timecreated** | **int** | submission creation time | [optional] 
**timemodified** | **int** | submission last modified time | [optional] 
**timestarted** | **int** | submission start time | [optional] 
**userid** | **int** | student id | [optional] 

## Example

```python
from openapi_client.models.mod_assign_get_submissions200_response_assignments_inner_submissions_inner import ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner from a JSON string
mod_assign_get_submissions200_response_assignments_inner_submissions_inner_instance = ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner.to_json())

# convert the object into a dict
mod_assign_get_submissions200_response_assignments_inner_submissions_inner_dict = mod_assign_get_submissions200_response_assignments_inner_submissions_inner_instance.to_dict()
# create an instance of ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner from a dict
mod_assign_get_submissions200_response_assignments_inner_submissions_inner_from_dict = ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner.from_dict(mod_assign_get_submissions200_response_assignments_inner_submissions_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


