# ToolMobileGetConfigRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**section** | **str** | Settings section name. | [optional] [default to '']

## Example

```python
from openapi_client.models.tool_mobile_get_config_request import ToolMobileGetConfigRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMobileGetConfigRequest from a JSON string
tool_mobile_get_config_request_instance = ToolMobileGetConfigRequest.from_json(json)
# print the JSON string representation of the object
print(ToolMobileGetConfigRequest.to_json())

# convert the object into a dict
tool_mobile_get_config_request_dict = tool_mobile_get_config_request_instance.to_dict()
# create an instance of ToolMobileGetConfigRequest from a dict
tool_mobile_get_config_request_from_dict = ToolMobileGetConfigRequest.from_dict(tool_mobile_get_config_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


