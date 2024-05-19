# ModLtiCreateToolTypeRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cartridgeurl** | **str** | URL to cardridge to load tool information | [optional] [default to '']
**key** | **str** | Consumer key | [optional] [default to '']
**secret** | **str** | Shared secret | [optional] [default to '']

## Example

```python
from openapi_client.models.mod_lti_create_tool_type_request import ModLtiCreateToolTypeRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiCreateToolTypeRequest from a JSON string
mod_lti_create_tool_type_request_instance = ModLtiCreateToolTypeRequest.from_json(json)
# print the JSON string representation of the object
print(ModLtiCreateToolTypeRequest.to_json())

# convert the object into a dict
mod_lti_create_tool_type_request_dict = mod_lti_create_tool_type_request_instance.to_dict()
# create an instance of ModLtiCreateToolTypeRequest from a dict
mod_lti_create_tool_type_request_from_dict = ModLtiCreateToolTypeRequest.from_dict(mod_lti_create_tool_type_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


