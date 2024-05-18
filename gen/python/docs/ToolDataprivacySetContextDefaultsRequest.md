# ToolDataprivacySetContextDefaultsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activity** | **str** | The plugin name of the activity | [optional] 
**category** | **int** | The default category for the given context level | [default to null]
**contextlevel** | **int** | The context level | [default to null]
**override** | **bool** | Whether to override existing instances with the defaults | [optional] [default to False]
**purpose** | **int** | The default purpose for the given context level | [default to null]

## Example

```python
from openapi_client.models.tool_dataprivacy_set_context_defaults_request import ToolDataprivacySetContextDefaultsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolDataprivacySetContextDefaultsRequest from a JSON string
tool_dataprivacy_set_context_defaults_request_instance = ToolDataprivacySetContextDefaultsRequest.from_json(json)
# print the JSON string representation of the object
print(ToolDataprivacySetContextDefaultsRequest.to_json())

# convert the object into a dict
tool_dataprivacy_set_context_defaults_request_dict = tool_dataprivacy_set_context_defaults_request_instance.to_dict()
# create an instance of ToolDataprivacySetContextDefaultsRequest from a dict
tool_dataprivacy_set_context_defaults_request_from_dict = ToolDataprivacySetContextDefaultsRequest.from_dict(tool_dataprivacy_set_context_defaults_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


