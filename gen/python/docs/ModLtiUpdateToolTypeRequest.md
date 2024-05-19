# ModLtiUpdateToolTypeRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Tool type description | [optional] 
**id** | **int** | Tool type id | 
**name** | **str** | Tool type name | [optional] 
**state** | **int** | Tool type state | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_lti_update_tool_type_request import ModLtiUpdateToolTypeRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiUpdateToolTypeRequest from a JSON string
mod_lti_update_tool_type_request_instance = ModLtiUpdateToolTypeRequest.from_json(json)
# print the JSON string representation of the object
print(ModLtiUpdateToolTypeRequest.to_json())

# convert the object into a dict
mod_lti_update_tool_type_request_dict = mod_lti_update_tool_type_request_instance.to_dict()
# create an instance of ModLtiUpdateToolTypeRequest from a dict
mod_lti_update_tool_type_request_from_dict = ModLtiUpdateToolTypeRequest.from_dict(mod_lti_update_tool_type_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


