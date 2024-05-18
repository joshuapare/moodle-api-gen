# ToolMobileCallExternalFunctionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List[ToolMobileCallExternalFunctionsRequestRequestsInner]**](ToolMobileCallExternalFunctionsRequestRequestsInner.md) |  | 

## Example

```python
from openapi_client.models.tool_mobile_call_external_functions_request import ToolMobileCallExternalFunctionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMobileCallExternalFunctionsRequest from a JSON string
tool_mobile_call_external_functions_request_instance = ToolMobileCallExternalFunctionsRequest.from_json(json)
# print the JSON string representation of the object
print(ToolMobileCallExternalFunctionsRequest.to_json())

# convert the object into a dict
tool_mobile_call_external_functions_request_dict = tool_mobile_call_external_functions_request_instance.to_dict()
# create an instance of ToolMobileCallExternalFunctionsRequest from a dict
tool_mobile_call_external_functions_request_from_dict = ToolMobileCallExternalFunctionsRequest.from_dict(tool_mobile_call_external_functions_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


