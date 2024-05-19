# CoreAdminSetPluginOrderRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**direction** | **int** | The direction to move | [default to null]
**plugin** | **str** | The name of the plugin | 

## Example

```python
from openapi_client.models.core_admin_set_plugin_order_request import CoreAdminSetPluginOrderRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreAdminSetPluginOrderRequest from a JSON string
core_admin_set_plugin_order_request_instance = CoreAdminSetPluginOrderRequest.from_json(json)
# print the JSON string representation of the object
print(CoreAdminSetPluginOrderRequest.to_json())

# convert the object into a dict
core_admin_set_plugin_order_request_dict = core_admin_set_plugin_order_request_instance.to_dict()
# create an instance of CoreAdminSetPluginOrderRequest from a dict
core_admin_set_plugin_order_request_from_dict = CoreAdminSetPluginOrderRequest.from_dict(core_admin_set_plugin_order_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


