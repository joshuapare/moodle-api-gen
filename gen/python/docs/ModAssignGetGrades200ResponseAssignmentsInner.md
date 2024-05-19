# ModAssignGetGrades200ResponseAssignmentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignmentid** | **int** | assignment id | [optional] 
**grades** | [**List[ModAssignGetGrades200ResponseAssignmentsInnerGradesInner]**](ModAssignGetGrades200ResponseAssignmentsInnerGradesInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_assign_get_grades200_response_assignments_inner import ModAssignGetGrades200ResponseAssignmentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetGrades200ResponseAssignmentsInner from a JSON string
mod_assign_get_grades200_response_assignments_inner_instance = ModAssignGetGrades200ResponseAssignmentsInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetGrades200ResponseAssignmentsInner.to_json())

# convert the object into a dict
mod_assign_get_grades200_response_assignments_inner_dict = mod_assign_get_grades200_response_assignments_inner_instance.to_dict()
# create an instance of ModAssignGetGrades200ResponseAssignmentsInner from a dict
mod_assign_get_grades200_response_assignments_inner_from_dict = ModAssignGetGrades200ResponseAssignmentsInner.from_dict(mod_assign_get_grades200_response_assignments_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


