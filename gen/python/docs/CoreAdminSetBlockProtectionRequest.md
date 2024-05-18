# CoreAdminSetBlockProtectionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**plugin** | **str** | The name of the plugin | [default to 'null']
**state** | **int** | The target state | [default to null]

## Example

```python
from openapi_client.models.core_admin_set_block_protection_request import CoreAdminSetBlockProtectionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreAdminSetBlockProtectionRequest from a JSON string
core_admin_set_block_protection_request_instance = CoreAdminSetBlockProtectionRequest.from_json(json)
# print the JSON string representation of the object
print(CoreAdminSetBlockProtectionRequest.to_json())

# convert the object into a dict
core_admin_set_block_protection_request_dict = core_admin_set_block_protection_request_instance.to_dict()
# create an instance of CoreAdminSetBlockProtectionRequest from a dict
core_admin_set_block_protection_request_from_dict = CoreAdminSetBlockProtectionRequest.from_dict(core_admin_set_block_protection_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


