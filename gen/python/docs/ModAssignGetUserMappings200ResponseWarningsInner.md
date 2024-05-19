# ModAssignGetUserMappings200ResponseWarningsInner

warning

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **str** | item is always &#39;assignment&#39; | [optional] 
**itemid** | **int** | when errorcode is 3 then itemid is an assignment id. When errorcode is 1, itemid is a course module id | [optional] 
**message** | **str** | untranslated english message to explain the warning | [optional] 
**warningcode** | **str** | errorcode can be 3 (no user mappings found) or 1 (no permission to get user mappings) | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_assign_get_user_mappings200_response_warnings_inner import ModAssignGetUserMappings200ResponseWarningsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetUserMappings200ResponseWarningsInner from a JSON string
mod_assign_get_user_mappings200_response_warnings_inner_instance = ModAssignGetUserMappings200ResponseWarningsInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetUserMappings200ResponseWarningsInner.to_json())

# convert the object into a dict
mod_assign_get_user_mappings200_response_warnings_inner_dict = mod_assign_get_user_mappings200_response_warnings_inner_instance.to_dict()
# create an instance of ModAssignGetUserMappings200ResponseWarningsInner from a dict
mod_assign_get_user_mappings200_response_warnings_inner_from_dict = ModAssignGetUserMappings200ResponseWarningsInner.from_dict(mod_assign_get_user_mappings200_response_warnings_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


