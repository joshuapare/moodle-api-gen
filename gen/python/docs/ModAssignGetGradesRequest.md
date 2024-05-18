# ModAssignGetGradesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignmentids** | **List[object]** |  | 
**since** | **int** | timestamp, only return records where timemodified &gt;&#x3D; since | [optional] [default to 0]

## Example

```python
from openapi_client.models.mod_assign_get_grades_request import ModAssignGetGradesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetGradesRequest from a JSON string
mod_assign_get_grades_request_instance = ModAssignGetGradesRequest.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetGradesRequest.to_json())

# convert the object into a dict
mod_assign_get_grades_request_dict = mod_assign_get_grades_request_instance.to_dict()
# create an instance of ModAssignGetGradesRequest from a dict
mod_assign_get_grades_request_from_dict = ModAssignGetGradesRequest.from_dict(mod_assign_get_grades_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


