# ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addon** | **str** | The Mobile addon (package) name. | [optional] [default to 'null']
**component** | **str** | The plugin component name. | [optional] [default to 'null']
**dependencies** | **List[object]** |  | [optional] 
**filehash** | **str** | The addon package hash or empty if it doesn&#39;t exist. | [optional] [default to 'null']
**filesize** | **int** | The addon package size or empty if it doesn&#39;t exist. | [optional] [default to null]
**fileurl** | **str** | The addon package url for download                                                             or empty if it doesn&#39;t exist. | [optional] [default to 'null']
**handlers** | **str** | Handlers definition (JSON) | [optional] [default to 'null']
**lang** | **str** | Language strings used by the handlers (JSON) | [optional] [default to 'null']
**version** | **str** | The plugin version number. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.tool_mobile_get_plugins_supporting_mobile200_response_plugins_inner import ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner from a JSON string
tool_mobile_get_plugins_supporting_mobile200_response_plugins_inner_instance = ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner.from_json(json)
# print the JSON string representation of the object
print(ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner.to_json())

# convert the object into a dict
tool_mobile_get_plugins_supporting_mobile200_response_plugins_inner_dict = tool_mobile_get_plugins_supporting_mobile200_response_plugins_inner_instance.to_dict()
# create an instance of ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner from a dict
tool_mobile_get_plugins_supporting_mobile200_response_plugins_inner_from_dict = ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner.from_dict(tool_mobile_get_plugins_supporting_mobile200_response_plugins_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


