# ModAssignSaveUserExtensionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignmentid** | **int** | The assignment id to operate on | 
**dates** | **List[object]** |  | 
**userids** | **List[object]** |  | 

## Example

```python
from openapi_client.models.mod_assign_save_user_extensions_request import ModAssignSaveUserExtensionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignSaveUserExtensionsRequest from a JSON string
mod_assign_save_user_extensions_request_instance = ModAssignSaveUserExtensionsRequest.from_json(json)
# print the JSON string representation of the object
print(ModAssignSaveUserExtensionsRequest.to_json())

# convert the object into a dict
mod_assign_save_user_extensions_request_dict = mod_assign_save_user_extensions_request_instance.to_dict()
# create an instance of ModAssignSaveUserExtensionsRequest from a dict
mod_assign_save_user_extensions_request_from_dict = ModAssignSaveUserExtensionsRequest.from_dict(mod_assign_save_user_extensions_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


