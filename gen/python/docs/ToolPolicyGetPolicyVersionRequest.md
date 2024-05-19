# ToolPolicyGetPolicyVersionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**behalfid** | **int** | The id of user on whose behalf the user is viewing the policy | [optional] [default to 0]
**versionid** | **int** | The policy version ID | [default to null]

## Example

```python
from openapi_client.models.tool_policy_get_policy_version_request import ToolPolicyGetPolicyVersionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolPolicyGetPolicyVersionRequest from a JSON string
tool_policy_get_policy_version_request_instance = ToolPolicyGetPolicyVersionRequest.from_json(json)
# print the JSON string representation of the object
print(ToolPolicyGetPolicyVersionRequest.to_json())

# convert the object into a dict
tool_policy_get_policy_version_request_dict = tool_policy_get_policy_version_request_instance.to_dict()
# create an instance of ToolPolicyGetPolicyVersionRequest from a dict
tool_policy_get_policy_version_request_from_dict = ToolPolicyGetPolicyVersionRequest.from_dict(tool_policy_get_policy_version_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


