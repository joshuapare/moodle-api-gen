# ModLtiGetToolTypesAndProxies200ResponseTypesInner

Tool

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capabilitygroups** | **List[object]** |  | [optional] 
**clientid** | **str** | Client ID | [optional] 
**courseid** | **int** | Tool type course | [optional] [default to 0]
**deploymentid** | **int** | Deployment ID | [optional] 
**description** | **str** | Tool type description | [optional] 
**hascapabilitygroups** | **bool** | Indicate if capabilitygroups is populated | [optional] 
**id** | **int** | Tool type id | [optional] 
**instancecount** | **int** | The number of times this tool is being used | [optional] 
**instanceids** | **List[object]** |  | [optional] 
**name** | **str** | Tool type name | [optional] 
**platformid** | **str** | Platform ID | [optional] 
**state** | [**ModLtiGetToolTypesAndProxies200ResponseTypesInnerState**](ModLtiGetToolTypesAndProxies200ResponseTypesInnerState.md) |  | [optional] 
**urls** | [**ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls**](ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_lti_get_tool_types_and_proxies200_response_types_inner import ModLtiGetToolTypesAndProxies200ResponseTypesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiGetToolTypesAndProxies200ResponseTypesInner from a JSON string
mod_lti_get_tool_types_and_proxies200_response_types_inner_instance = ModLtiGetToolTypesAndProxies200ResponseTypesInner.from_json(json)
# print the JSON string representation of the object
print(ModLtiGetToolTypesAndProxies200ResponseTypesInner.to_json())

# convert the object into a dict
mod_lti_get_tool_types_and_proxies200_response_types_inner_dict = mod_lti_get_tool_types_and_proxies200_response_types_inner_instance.to_dict()
# create an instance of ModLtiGetToolTypesAndProxies200ResponseTypesInner from a dict
mod_lti_get_tool_types_and_proxies200_response_types_inner_from_dict = ModLtiGetToolTypesAndProxies200ResponseTypesInner.from_dict(mod_lti_get_tool_types_and_proxies200_response_types_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


