# ModAssignGetUserFlags200ResponseAssignmentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignmentid** | **int** | assignment id | [optional] 
**userflags** | [**List[ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner]**](ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_assign_get_user_flags200_response_assignments_inner import ModAssignGetUserFlags200ResponseAssignmentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetUserFlags200ResponseAssignmentsInner from a JSON string
mod_assign_get_user_flags200_response_assignments_inner_instance = ModAssignGetUserFlags200ResponseAssignmentsInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetUserFlags200ResponseAssignmentsInner.to_json())

# convert the object into a dict
mod_assign_get_user_flags200_response_assignments_inner_dict = mod_assign_get_user_flags200_response_assignments_inner_instance.to_dict()
# create an instance of ModAssignGetUserFlags200ResponseAssignmentsInner from a dict
mod_assign_get_user_flags200_response_assignments_inner_from_dict = ModAssignGetUserFlags200ResponseAssignmentsInner.from_dict(mod_assign_get_user_flags200_response_assignments_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


