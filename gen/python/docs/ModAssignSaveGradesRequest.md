# ModAssignSaveGradesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applytoall** | **bool** | If true, this grade will be applied to all members of the group (for group assignments). | 
**assignmentid** | **int** | The assignment id to operate on | 
**grades** | [**List[ModAssignSaveGradesRequestGradesInner]**](ModAssignSaveGradesRequestGradesInner.md) |  | 

## Example

```python
from openapi_client.models.mod_assign_save_grades_request import ModAssignSaveGradesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignSaveGradesRequest from a JSON string
mod_assign_save_grades_request_instance = ModAssignSaveGradesRequest.from_json(json)
# print the JSON string representation of the object
print(ModAssignSaveGradesRequest.to_json())

# convert the object into a dict
mod_assign_save_grades_request_dict = mod_assign_save_grades_request_instance.to_dict()
# create an instance of ModAssignSaveGradesRequest from a dict
mod_assign_save_grades_request_from_dict = ModAssignSaveGradesRequest.from_dict(mod_assign_save_grades_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


