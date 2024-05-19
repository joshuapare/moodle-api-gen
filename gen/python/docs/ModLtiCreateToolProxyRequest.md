# ModLtiCreateToolProxyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capabilityoffered** | **List[object]** |  | [optional] 
**name** | **str** | Tool proxy name | [optional] [default to '']
**regurl** | **str** | Tool proxy registration URL | [default to 'null']
**serviceoffered** | **List[object]** |  | [optional] 

## Example

```python
from openapi_client.models.mod_lti_create_tool_proxy_request import ModLtiCreateToolProxyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiCreateToolProxyRequest from a JSON string
mod_lti_create_tool_proxy_request_instance = ModLtiCreateToolProxyRequest.from_json(json)
# print the JSON string representation of the object
print(ModLtiCreateToolProxyRequest.to_json())

# convert the object into a dict
mod_lti_create_tool_proxy_request_dict = mod_lti_create_tool_proxy_request_instance.to_dict()
# create an instance of ModLtiCreateToolProxyRequest from a dict
mod_lti_create_tool_proxy_request_from_dict = ModLtiCreateToolProxyRequest.from_dict(mod_lti_create_tool_proxy_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


