# ModLtiGetToolTypesAndProxies200ResponseProxiesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capabilityoffered** | **str** | Tool proxy capabilities offered | [optional] 
**guid** | **str** | Tool proxy globally unique identifier | [optional] 
**id** | **int** | Tool proxy id | [optional] 
**name** | **str** | Tool proxy name | [optional] 
**regurl** | **str** | Tool proxy registration URL | [optional] 
**secret** | **str** | Tool proxy shared secret | [optional] 
**serviceoffered** | **str** | Tool proxy services offered | [optional] 
**state** | **int** | Tool proxy state | [optional] 
**timecreated** | **int** | Tool proxy time created | [optional] 
**timemodified** | **int** | Tool proxy modified | [optional] 
**toolproxy** | **str** | Tool proxy | [optional] 
**vendorcode** | **str** | Tool proxy consumer code | [optional] 

## Example

```python
from openapi_client.models.mod_lti_get_tool_types_and_proxies200_response_proxies_inner import ModLtiGetToolTypesAndProxies200ResponseProxiesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiGetToolTypesAndProxies200ResponseProxiesInner from a JSON string
mod_lti_get_tool_types_and_proxies200_response_proxies_inner_instance = ModLtiGetToolTypesAndProxies200ResponseProxiesInner.from_json(json)
# print the JSON string representation of the object
print(ModLtiGetToolTypesAndProxies200ResponseProxiesInner.to_json())

# convert the object into a dict
mod_lti_get_tool_types_and_proxies200_response_proxies_inner_dict = mod_lti_get_tool_types_and_proxies200_response_proxies_inner_instance.to_dict()
# create an instance of ModLtiGetToolTypesAndProxies200ResponseProxiesInner from a dict
mod_lti_get_tool_types_and_proxies200_response_proxies_inner_from_dict = ModLtiGetToolTypesAndProxies200ResponseProxiesInner.from_dict(mod_lti_get_tool_types_and_proxies200_response_proxies_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


