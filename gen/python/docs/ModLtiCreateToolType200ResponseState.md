# ModLtiCreateToolType200ResponseState


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configured** | **bool** | Is the state configured | [default to False]
**pending** | **bool** | Is the state pending | [default to False]
**rejected** | **bool** | Is the state rejected | [default to False]
**text** | **str** | Tool type state name string | [default to 'null']
**unknown** | **bool** | Is the state unknown | [default to False]

## Example

```python
from openapi_client.models.mod_lti_create_tool_type200_response_state import ModLtiCreateToolType200ResponseState

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiCreateToolType200ResponseState from a JSON string
mod_lti_create_tool_type200_response_state_instance = ModLtiCreateToolType200ResponseState.from_json(json)
# print the JSON string representation of the object
print(ModLtiCreateToolType200ResponseState.to_json())

# convert the object into a dict
mod_lti_create_tool_type200_response_state_dict = mod_lti_create_tool_type200_response_state_instance.to_dict()
# create an instance of ModLtiCreateToolType200ResponseState from a dict
mod_lti_create_tool_type200_response_state_from_dict = ModLtiCreateToolType200ResponseState.from_dict(mod_lti_create_tool_type200_response_state_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


