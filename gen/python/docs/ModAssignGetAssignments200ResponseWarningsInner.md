# ModAssignGetAssignments200ResponseWarningsInner

warning

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **str** | item can be &#39;course&#39; (errorcode 1 or 2) or &#39;module&#39; (errorcode 1) | [optional] [default to 'null']
**itemid** | **int** | When item is a course then itemid is a course id. When the item is a module then itemid is a module id | [optional] [default to null]
**message** | **str** | untranslated english message to explain the warning | [optional] 
**warningcode** | **str** | errorcode can be 1 (no access rights) or 2 (not enrolled or no permissions) | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_assign_get_assignments200_response_warnings_inner import ModAssignGetAssignments200ResponseWarningsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetAssignments200ResponseWarningsInner from a JSON string
mod_assign_get_assignments200_response_warnings_inner_instance = ModAssignGetAssignments200ResponseWarningsInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetAssignments200ResponseWarningsInner.to_json())

# convert the object into a dict
mod_assign_get_assignments200_response_warnings_inner_dict = mod_assign_get_assignments200_response_warnings_inner_instance.to_dict()
# create an instance of ModAssignGetAssignments200ResponseWarningsInner from a dict
mod_assign_get_assignments200_response_warnings_inner_from_dict = ModAssignGetAssignments200ResponseWarningsInner.from_dict(mod_assign_get_assignments200_response_warnings_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


