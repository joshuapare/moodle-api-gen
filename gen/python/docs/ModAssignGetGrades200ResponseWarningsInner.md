# ModAssignGetGrades200ResponseWarningsInner

warning

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **str** | item is always &#39;assignment&#39; | [optional] [default to 'null']
**itemid** | **int** | when errorcode is 3 then itemid is an assignment id. When errorcode is 1, itemid is a course module id | [optional] [default to null]
**message** | **str** | untranslated english message to explain the warning | [optional] 
**warningcode** | **str** | errorcode can be 3 (no grades found) or 1 (no permission to get grades) | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_assign_get_grades200_response_warnings_inner import ModAssignGetGrades200ResponseWarningsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetGrades200ResponseWarningsInner from a JSON string
mod_assign_get_grades200_response_warnings_inner_instance = ModAssignGetGrades200ResponseWarningsInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetGrades200ResponseWarningsInner.to_json())

# convert the object into a dict
mod_assign_get_grades200_response_warnings_inner_dict = mod_assign_get_grades200_response_warnings_inner_instance.to_dict()
# create an instance of ModAssignGetGrades200ResponseWarningsInner from a dict
mod_assign_get_grades200_response_warnings_inner_from_dict = ModAssignGetGrades200ResponseWarningsInner.from_dict(mod_assign_get_grades200_response_warnings_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


