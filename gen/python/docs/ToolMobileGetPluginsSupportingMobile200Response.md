# ToolMobileGetPluginsSupportingMobile200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**plugins** | [**List[ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner]**](ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.tool_mobile_get_plugins_supporting_mobile200_response import ToolMobileGetPluginsSupportingMobile200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMobileGetPluginsSupportingMobile200Response from a JSON string
tool_mobile_get_plugins_supporting_mobile200_response_instance = ToolMobileGetPluginsSupportingMobile200Response.from_json(json)
# print the JSON string representation of the object
print(ToolMobileGetPluginsSupportingMobile200Response.to_json())

# convert the object into a dict
tool_mobile_get_plugins_supporting_mobile200_response_dict = tool_mobile_get_plugins_supporting_mobile200_response_instance.to_dict()
# create an instance of ToolMobileGetPluginsSupportingMobile200Response from a dict
tool_mobile_get_plugins_supporting_mobile200_response_from_dict = ToolMobileGetPluginsSupportingMobile200Response.from_dict(tool_mobile_get_plugins_supporting_mobile200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


