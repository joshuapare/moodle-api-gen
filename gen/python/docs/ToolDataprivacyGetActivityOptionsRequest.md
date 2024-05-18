# ToolDataprivacyGetActivityOptionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodefaults** | **bool** | Whether to fetch all activities or only those without defaults | [optional] [default to False]

## Example

```python
from openapi_client.models.tool_dataprivacy_get_activity_options_request import ToolDataprivacyGetActivityOptionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolDataprivacyGetActivityOptionsRequest from a JSON string
tool_dataprivacy_get_activity_options_request_instance = ToolDataprivacyGetActivityOptionsRequest.from_json(json)
# print the JSON string representation of the object
print(ToolDataprivacyGetActivityOptionsRequest.to_json())

# convert the object into a dict
tool_dataprivacy_get_activity_options_request_dict = tool_dataprivacy_get_activity_options_request_instance.to_dict()
# create an instance of ToolDataprivacyGetActivityOptionsRequest from a dict
tool_dataprivacy_get_activity_options_request_from_dict = ToolDataprivacyGetActivityOptionsRequest.from_dict(tool_dataprivacy_get_activity_options_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


