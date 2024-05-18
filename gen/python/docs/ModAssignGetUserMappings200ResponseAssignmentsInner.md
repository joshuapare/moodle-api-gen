# ModAssignGetUserMappings200ResponseAssignmentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignmentid** | **int** | assignment id | [optional] 
**mappings** | [**List[ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner]**](ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_assign_get_user_mappings200_response_assignments_inner import ModAssignGetUserMappings200ResponseAssignmentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetUserMappings200ResponseAssignmentsInner from a JSON string
mod_assign_get_user_mappings200_response_assignments_inner_instance = ModAssignGetUserMappings200ResponseAssignmentsInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetUserMappings200ResponseAssignmentsInner.to_json())

# convert the object into a dict
mod_assign_get_user_mappings200_response_assignments_inner_dict = mod_assign_get_user_mappings200_response_assignments_inner_instance.to_dict()
# create an instance of ModAssignGetUserMappings200ResponseAssignmentsInner from a dict
mod_assign_get_user_mappings200_response_assignments_inner_from_dict = ModAssignGetUserMappings200ResponseAssignmentsInner.from_dict(mod_assign_get_user_mappings200_response_assignments_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


