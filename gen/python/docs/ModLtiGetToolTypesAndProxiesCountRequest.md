# ModLtiGetToolTypesAndProxiesCountRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orphanedonly** | **bool** | Orphaned tool types only | [optional] [default to False]
**toolproxyid** | **int** | Tool proxy id | [optional] [default to 0]

## Example

```python
from openapi_client.models.mod_lti_get_tool_types_and_proxies_count_request import ModLtiGetToolTypesAndProxiesCountRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiGetToolTypesAndProxiesCountRequest from a JSON string
mod_lti_get_tool_types_and_proxies_count_request_instance = ModLtiGetToolTypesAndProxiesCountRequest.from_json(json)
# print the JSON string representation of the object
print(ModLtiGetToolTypesAndProxiesCountRequest.to_json())

# convert the object into a dict
mod_lti_get_tool_types_and_proxies_count_request_dict = mod_lti_get_tool_types_and_proxies_count_request_instance.to_dict()
# create an instance of ModLtiGetToolTypesAndProxiesCountRequest from a dict
mod_lti_get_tool_types_and_proxies_count_request_from_dict = ModLtiGetToolTypesAndProxiesCountRequest.from_dict(mod_lti_get_tool_types_and_proxies_count_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


