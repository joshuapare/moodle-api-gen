# ModAssignSetUserFlagsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignmentid** | **int** | assignment id | 
**userflags** | [**List[ModAssignSetUserFlagsRequestUserflagsInner]**](ModAssignSetUserFlagsRequestUserflagsInner.md) |  | 

## Example

```python
from openapi_client.models.mod_assign_set_user_flags_request import ModAssignSetUserFlagsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignSetUserFlagsRequest from a JSON string
mod_assign_set_user_flags_request_instance = ModAssignSetUserFlagsRequest.from_json(json)
# print the JSON string representation of the object
print(ModAssignSetUserFlagsRequest.to_json())

# convert the object into a dict
mod_assign_set_user_flags_request_dict = mod_assign_set_user_flags_request_instance.to_dict()
# create an instance of ModAssignSetUserFlagsRequest from a dict
mod_assign_set_user_flags_request_from_dict = ModAssignSetUserFlagsRequest.from_dict(mod_assign_set_user_flags_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


