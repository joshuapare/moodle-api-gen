# ModLtiCreateToolProxy200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capabilityoffered** | **str** | Tool proxy capabilities offered | [default to 'null']
**guid** | **str** | Tool proxy globally unique identifier | [default to 'null']
**id** | **int** | Tool proxy id | [default to null]
**name** | **str** | Tool proxy name | [default to 'null']
**regurl** | **str** | Tool proxy registration URL | 
**secret** | **str** | Tool proxy shared secret | [default to 'null']
**serviceoffered** | **str** | Tool proxy services offered | [default to 'null']
**state** | **int** | Tool proxy state | [default to null]
**timecreated** | **int** | Tool proxy time created | [default to null]
**timemodified** | **int** | Tool proxy modified | [default to null]
**toolproxy** | **str** | Tool proxy | [default to 'null']
**vendorcode** | **str** | Tool proxy consumer code | [default to 'null']

## Example

```python
from openapi_client.models.mod_lti_create_tool_proxy200_response import ModLtiCreateToolProxy200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiCreateToolProxy200Response from a JSON string
mod_lti_create_tool_proxy200_response_instance = ModLtiCreateToolProxy200Response.from_json(json)
# print the JSON string representation of the object
print(ModLtiCreateToolProxy200Response.to_json())

# convert the object into a dict
mod_lti_create_tool_proxy200_response_dict = mod_lti_create_tool_proxy200_response_instance.to_dict()
# create an instance of ModLtiCreateToolProxy200Response from a dict
mod_lti_create_tool_proxy200_response_from_dict = ModLtiCreateToolProxy200Response.from_dict(mod_lti_create_tool_proxy200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


