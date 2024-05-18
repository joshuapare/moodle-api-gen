# ModLtiGetToolTypesAndProxiesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit** | **int** | How many tool types displayed per page | [optional] [default to 60]
**offset** | **int** | Current offset of tool elements | [optional] [default to 0]
**orphanedonly** | **bool** | Orphaned tool types only | [optional] [default to False]
**toolproxyid** | **int** | Tool proxy id | [optional] [default to 0]

## Example

```python
from openapi_client.models.mod_lti_get_tool_types_and_proxies_request import ModLtiGetToolTypesAndProxiesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiGetToolTypesAndProxiesRequest from a JSON string
mod_lti_get_tool_types_and_proxies_request_instance = ModLtiGetToolTypesAndProxiesRequest.from_json(json)
# print the JSON string representation of the object
print(ModLtiGetToolTypesAndProxiesRequest.to_json())

# convert the object into a dict
mod_lti_get_tool_types_and_proxies_request_dict = mod_lti_get_tool_types_and_proxies_request_instance.to_dict()
# create an instance of ModLtiGetToolTypesAndProxiesRequest from a dict
mod_lti_get_tool_types_and_proxies_request_from_dict = ModLtiGetToolTypesAndProxiesRequest.from_dict(mod_lti_get_tool_types_and_proxies_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


