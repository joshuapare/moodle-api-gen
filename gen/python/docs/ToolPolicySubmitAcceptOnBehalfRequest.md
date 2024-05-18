# ToolPolicySubmitAcceptOnBehalfRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jsonformdata** | **str** | The data from the create group form, encoded as a json array | 

## Example

```python
from openapi_client.models.tool_policy_submit_accept_on_behalf_request import ToolPolicySubmitAcceptOnBehalfRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolPolicySubmitAcceptOnBehalfRequest from a JSON string
tool_policy_submit_accept_on_behalf_request_instance = ToolPolicySubmitAcceptOnBehalfRequest.from_json(json)
# print the JSON string representation of the object
print(ToolPolicySubmitAcceptOnBehalfRequest.to_json())

# convert the object into a dict
tool_policy_submit_accept_on_behalf_request_dict = tool_policy_submit_accept_on_behalf_request_instance.to_dict()
# create an instance of ToolPolicySubmitAcceptOnBehalfRequest from a dict
tool_policy_submit_accept_on_behalf_request_from_dict = ToolPolicySubmitAcceptOnBehalfRequest.from_dict(tool_policy_submit_accept_on_behalf_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


