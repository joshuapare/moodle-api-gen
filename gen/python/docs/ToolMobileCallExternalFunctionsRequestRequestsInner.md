# ToolMobileCallExternalFunctionsRequestRequestsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arguments** | **str** | JSON-encoded object with named arguments | [optional] [default to '{}']
**function** | **str** | Function name | [optional] [default to 'null']
**settingfileurl** | **bool** | Rewrite plugin file URLs | [optional] [default to True]
**settingfilter** | **bool** | Filter text | [optional] [default to False]
**settinglang** | **str** | Session language | [optional] [default to '']
**settingraw** | **bool** | Return raw text | [optional] [default to False]

## Example

```python
from openapi_client.models.tool_mobile_call_external_functions_request_requests_inner import ToolMobileCallExternalFunctionsRequestRequestsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMobileCallExternalFunctionsRequestRequestsInner from a JSON string
tool_mobile_call_external_functions_request_requests_inner_instance = ToolMobileCallExternalFunctionsRequestRequestsInner.from_json(json)
# print the JSON string representation of the object
print(ToolMobileCallExternalFunctionsRequestRequestsInner.to_json())

# convert the object into a dict
tool_mobile_call_external_functions_request_requests_inner_dict = tool_mobile_call_external_functions_request_requests_inner_instance.to_dict()
# create an instance of ToolMobileCallExternalFunctionsRequestRequestsInner from a dict
tool_mobile_call_external_functions_request_requests_inner_from_dict = ToolMobileCallExternalFunctionsRequestRequestsInner.from_dict(tool_mobile_call_external_functions_request_requests_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


