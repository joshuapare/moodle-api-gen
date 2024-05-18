# ModAssignSaveGradesRequestGradesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addattempt** | **bool** | Allow another attempt if manual attempt reopen method | [optional] [default to False]
**advancedgradingdata** | [**ModAssignSaveGradeRequestAdvancedgradingdata**](ModAssignSaveGradeRequestAdvancedgradingdata.md) |  | [optional] 
**attemptnumber** | **int** | The attempt number (-1 means latest attempt) | [optional] 
**grade** | **float** | The new grade for this user. Ignored if advanced grading used | [optional] 
**plugindata** | [**ModAssignSaveGradesRequestGradesInnerPlugindata**](ModAssignSaveGradesRequestGradesInnerPlugindata.md) |  | [optional] 
**userid** | **int** | The student id to operate on | [optional] 
**workflowstate** | **str** | The next marking workflow state | [optional] 

## Example

```python
from openapi_client.models.mod_assign_save_grades_request_grades_inner import ModAssignSaveGradesRequestGradesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignSaveGradesRequestGradesInner from a JSON string
mod_assign_save_grades_request_grades_inner_instance = ModAssignSaveGradesRequestGradesInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignSaveGradesRequestGradesInner.to_json())

# convert the object into a dict
mod_assign_save_grades_request_grades_inner_dict = mod_assign_save_grades_request_grades_inner_instance.to_dict()
# create an instance of ModAssignSaveGradesRequestGradesInner from a dict
mod_assign_save_grades_request_grades_inner_from_dict = ModAssignSaveGradesRequestGradesInner.from_dict(mod_assign_save_grades_request_grades_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


