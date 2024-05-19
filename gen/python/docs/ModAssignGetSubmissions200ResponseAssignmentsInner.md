# ModAssignGetSubmissions200ResponseAssignmentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignmentid** | **int** | assignment id | [optional] 
**submissions** | [**List[ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner]**](ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_assign_get_submissions200_response_assignments_inner import ModAssignGetSubmissions200ResponseAssignmentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetSubmissions200ResponseAssignmentsInner from a JSON string
mod_assign_get_submissions200_response_assignments_inner_instance = ModAssignGetSubmissions200ResponseAssignmentsInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetSubmissions200ResponseAssignmentsInner.to_json())

# convert the object into a dict
mod_assign_get_submissions200_response_assignments_inner_dict = mod_assign_get_submissions200_response_assignments_inner_instance.to_dict()
# create an instance of ModAssignGetSubmissions200ResponseAssignmentsInner from a dict
mod_assign_get_submissions200_response_assignments_inner_from_dict = ModAssignGetSubmissions200ResponseAssignmentsInner.from_dict(mod_assign_get_submissions200_response_assignments_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


