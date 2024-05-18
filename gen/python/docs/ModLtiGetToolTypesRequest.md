# ModLtiGetToolTypesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**toolproxyid** | **int** | Tool proxy id | [optional] [default to 0]

## Example

```python
from openapi_client.models.mod_lti_get_tool_types_request import ModLtiGetToolTypesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiGetToolTypesRequest from a JSON string
mod_lti_get_tool_types_request_instance = ModLtiGetToolTypesRequest.from_json(json)
# print the JSON string representation of the object
print(ModLtiGetToolTypesRequest.to_json())

# convert the object into a dict
mod_lti_get_tool_types_request_dict = mod_lti_get_tool_types_request_instance.to_dict()
# create an instance of ModLtiGetToolTypesRequest from a dict
mod_lti_get_tool_types_request_from_dict = ModLtiGetToolTypesRequest.from_dict(mod_lti_get_tool_types_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


