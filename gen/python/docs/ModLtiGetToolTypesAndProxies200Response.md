# ModLtiGetToolTypesAndProxies200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit** | **int** | Limit of how many tool types to show | [optional] [default to null]
**offset** | **int** | Offset of tool types | [optional] [default to null]
**proxies** | [**List[ModLtiGetToolTypesAndProxies200ResponseProxiesInner]**](ModLtiGetToolTypesAndProxies200ResponseProxiesInner.md) |  | 
**types** | [**List[ModLtiGetToolTypesAndProxies200ResponseTypesInner]**](ModLtiGetToolTypesAndProxies200ResponseTypesInner.md) |  | 

## Example

```python
from openapi_client.models.mod_lti_get_tool_types_and_proxies200_response import ModLtiGetToolTypesAndProxies200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiGetToolTypesAndProxies200Response from a JSON string
mod_lti_get_tool_types_and_proxies200_response_instance = ModLtiGetToolTypesAndProxies200Response.from_json(json)
# print the JSON string representation of the object
print(ModLtiGetToolTypesAndProxies200Response.to_json())

# convert the object into a dict
mod_lti_get_tool_types_and_proxies200_response_dict = mod_lti_get_tool_types_and_proxies200_response_instance.to_dict()
# create an instance of ModLtiGetToolTypesAndProxies200Response from a dict
mod_lti_get_tool_types_and_proxies200_response_from_dict = ModLtiGetToolTypesAndProxies200Response.from_dict(mod_lti_get_tool_types_and_proxies200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


