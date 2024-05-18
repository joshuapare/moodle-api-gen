# ModAssignSetUserFlagsRequestUserflagsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocatedmarker** | **int** | allocated marker | [optional] 
**extensionduedate** | **int** | extension due date | [optional] 
**locked** | **int** | locked | [optional] 
**mailed** | **int** | mailed | [optional] 
**userid** | **int** | student id | [optional] 
**workflowstate** | **str** | marking workflow state | [optional] 

## Example

```python
from openapi_client.models.mod_assign_set_user_flags_request_userflags_inner import ModAssignSetUserFlagsRequestUserflagsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignSetUserFlagsRequestUserflagsInner from a JSON string
mod_assign_set_user_flags_request_userflags_inner_instance = ModAssignSetUserFlagsRequestUserflagsInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignSetUserFlagsRequestUserflagsInner.to_json())

# convert the object into a dict
mod_assign_set_user_flags_request_userflags_inner_dict = mod_assign_set_user_flags_request_userflags_inner_instance.to_dict()
# create an instance of ModAssignSetUserFlagsRequestUserflagsInner from a dict
mod_assign_set_user_flags_request_userflags_inner_from_dict = ModAssignSetUserFlagsRequestUserflagsInner.from_dict(mod_assign_set_user_flags_request_userflags_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


