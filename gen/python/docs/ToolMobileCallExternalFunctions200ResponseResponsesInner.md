# ToolMobileCallExternalFunctions200ResponseResponsesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **str** | JSON-encoded response data | [optional] [default to 'null']
**error** | **bool** | Whether an exception was thrown. | [optional] [default to False]
**exception** | **str** | JSON-encoed exception info | [optional] [default to 'null']

## Example

```python
from openapi_client.models.tool_mobile_call_external_functions200_response_responses_inner import ToolMobileCallExternalFunctions200ResponseResponsesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMobileCallExternalFunctions200ResponseResponsesInner from a JSON string
tool_mobile_call_external_functions200_response_responses_inner_instance = ToolMobileCallExternalFunctions200ResponseResponsesInner.from_json(json)
# print the JSON string representation of the object
print(ToolMobileCallExternalFunctions200ResponseResponsesInner.to_json())

# convert the object into a dict
tool_mobile_call_external_functions200_response_responses_inner_dict = tool_mobile_call_external_functions200_response_responses_inner_instance.to_dict()
# create an instance of ToolMobileCallExternalFunctions200ResponseResponsesInner from a dict
tool_mobile_call_external_functions200_response_responses_inner_from_dict = ToolMobileCallExternalFunctions200ResponseResponsesInner.from_dict(tool_mobile_call_external_functions200_response_responses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


