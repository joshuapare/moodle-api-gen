# ModLtiGetToolProxiesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orphanedonly** | **bool** | Orphaned tool types only | [optional] [default to False]

## Example

```python
from openapi_client.models.mod_lti_get_tool_proxies_request import ModLtiGetToolProxiesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiGetToolProxiesRequest from a JSON string
mod_lti_get_tool_proxies_request_instance = ModLtiGetToolProxiesRequest.from_json(json)
# print the JSON string representation of the object
print(ModLtiGetToolProxiesRequest.to_json())

# convert the object into a dict
mod_lti_get_tool_proxies_request_dict = mod_lti_get_tool_proxies_request_instance.to_dict()
# create an instance of ModLtiGetToolProxiesRequest from a dict
mod_lti_get_tool_proxies_request_from_dict = ModLtiGetToolProxiesRequest.from_dict(mod_lti_get_tool_proxies_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

