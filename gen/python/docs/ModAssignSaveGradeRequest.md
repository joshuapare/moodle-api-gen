# ModAssignSaveGradeRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addattempt** | **bool** | Allow another attempt if the attempt reopen method is manual | [default to False]
**advancedgradingdata** | [**ModAssignSaveGradeRequestAdvancedgradingdata**](ModAssignSaveGradeRequestAdvancedgradingdata.md) |  | [optional] 
**applytoall** | **bool** | If true, this grade will be applied to all members of the group (for group assignments). | [default to False]
**assignmentid** | **int** | The assignment id to operate on | 
**attemptnumber** | **int** | The attempt number (-1 means latest attempt) | [default to null]
**grade** | **float** | The new grade for this user. Ignored if advanced grading used | [default to null]
**plugindata** | [**ModAssignSaveGradeRequestPlugindata**](ModAssignSaveGradeRequestPlugindata.md) |  | [optional] 
**userid** | **int** | The student id to operate on | [default to null]
**workflowstate** | **str** | The next marking workflow state | [default to 'null']

## Example

```python
from openapi_client.models.mod_assign_save_grade_request import ModAssignSaveGradeRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignSaveGradeRequest from a JSON string
mod_assign_save_grade_request_instance = ModAssignSaveGradeRequest.from_json(json)
# print the JSON string representation of the object
print(ModAssignSaveGradeRequest.to_json())

# convert the object into a dict
mod_assign_save_grade_request_dict = mod_assign_save_grade_request_instance.to_dict()
# create an instance of ModAssignSaveGradeRequest from a dict
mod_assign_save_grade_request_from_dict = ModAssignSaveGradeRequest.from_dict(mod_assign_save_grade_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


