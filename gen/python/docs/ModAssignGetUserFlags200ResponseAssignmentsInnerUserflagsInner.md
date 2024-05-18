# ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocatedmarker** | **int** | allocated marker | [optional] [default to null]
**extensionduedate** | **int** | extension due date | [optional] [default to null]
**id** | **int** | user flag id | [optional] [default to null]
**locked** | **int** | locked | [optional] [default to null]
**mailed** | **int** | mailed | [optional] [default to null]
**userid** | **int** | student id | [optional] 
**workflowstate** | **str** | marking workflow state | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_assign_get_user_flags200_response_assignments_inner_userflags_inner import ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner from a JSON string
mod_assign_get_user_flags200_response_assignments_inner_userflags_inner_instance = ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner.to_json())

# convert the object into a dict
mod_assign_get_user_flags200_response_assignments_inner_userflags_inner_dict = mod_assign_get_user_flags200_response_assignments_inner_userflags_inner_instance.to_dict()
# create an instance of ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner from a dict
mod_assign_get_user_flags200_response_assignments_inner_userflags_inner_from_dict = ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner.from_dict(mod_assign_get_user_flags200_response_assignments_inner_userflags_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


