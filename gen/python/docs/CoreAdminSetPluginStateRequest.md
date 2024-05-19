# CoreAdminSetPluginStateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**plugin** | **str** | The name of the plugin | 
**state** | **int** | The target state | 

## Example

```python
from openapi_client.models.core_admin_set_plugin_state_request import CoreAdminSetPluginStateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreAdminSetPluginStateRequest from a JSON string
core_admin_set_plugin_state_request_instance = CoreAdminSetPluginStateRequest.from_json(json)
# print the JSON string representation of the object
print(CoreAdminSetPluginStateRequest.to_json())

# convert the object into a dict
core_admin_set_plugin_state_request_dict = core_admin_set_plugin_state_request_instance.to_dict()
# create an instance of CoreAdminSetPluginStateRequest from a dict
core_admin_set_plugin_state_request_from_dict = CoreAdminSetPluginStateRequest.from_dict(core_admin_set_plugin_state_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


