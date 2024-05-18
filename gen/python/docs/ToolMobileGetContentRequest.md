# ToolMobileGetContentRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**args** | [**List[ToolMobileGetContentRequestArgsInner]**](ToolMobileGetContentRequestArgsInner.md) |  | [optional] 
**component** | **str** | Component where the class is e.g. mod_assign. | [default to 'null']
**method** | **str** | Method to execute in class \\$component\\output\\mobile. | [default to 'null']

## Example

```python
from openapi_client.models.tool_mobile_get_content_request import ToolMobileGetContentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMobileGetContentRequest from a JSON string
tool_mobile_get_content_request_instance = ToolMobileGetContentRequest.from_json(json)
# print the JSON string representation of the object
print(ToolMobileGetContentRequest.to_json())

# convert the object into a dict
tool_mobile_get_content_request_dict = tool_mobile_get_content_request_instance.to_dict()
# create an instance of ToolMobileGetContentRequest from a dict
tool_mobile_get_content_request_from_dict = ToolMobileGetContentRequest.from_dict(tool_mobile_get_content_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


