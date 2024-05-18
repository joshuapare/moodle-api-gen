# ModLtiGetToolTypesAndProxies200ResponseTypesInnerState


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configured** | **bool** | Is the state configured | 
**pending** | **bool** | Is the state pending | 
**rejected** | **bool** | Is the state rejected | 
**text** | **str** | Tool type state name string | 
**unknown** | **bool** | Is the state unknown | 

## Example

```python
from openapi_client.models.mod_lti_get_tool_types_and_proxies200_response_types_inner_state import ModLtiGetToolTypesAndProxies200ResponseTypesInnerState

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiGetToolTypesAndProxies200ResponseTypesInnerState from a JSON string
mod_lti_get_tool_types_and_proxies200_response_types_inner_state_instance = ModLtiGetToolTypesAndProxies200ResponseTypesInnerState.from_json(json)
# print the JSON string representation of the object
print(ModLtiGetToolTypesAndProxies200ResponseTypesInnerState.to_json())

# convert the object into a dict
mod_lti_get_tool_types_and_proxies200_response_types_inner_state_dict = mod_lti_get_tool_types_and_proxies200_response_types_inner_state_instance.to_dict()
# create an instance of ModLtiGetToolTypesAndProxies200ResponseTypesInnerState from a dict
mod_lti_get_tool_types_and_proxies200_response_types_inner_state_from_dict = ModLtiGetToolTypesAndProxies200ResponseTypesInnerState.from_dict(mod_lti_get_tool_types_and_proxies200_response_types_inner_state_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


