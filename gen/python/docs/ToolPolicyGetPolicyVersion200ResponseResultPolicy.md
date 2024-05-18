# ToolPolicyGetPolicyVersion200ResponseResultPolicy


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | The policy version content | [optional] [default to 'null']
**name** | **str** | The policy version name | [optional] [default to 'null']
**versionid** | **int** | The policy version id | [optional] [default to null]

## Example

```python
from openapi_client.models.tool_policy_get_policy_version200_response_result_policy import ToolPolicyGetPolicyVersion200ResponseResultPolicy

# TODO update the JSON string below
json = "{}"
# create an instance of ToolPolicyGetPolicyVersion200ResponseResultPolicy from a JSON string
tool_policy_get_policy_version200_response_result_policy_instance = ToolPolicyGetPolicyVersion200ResponseResultPolicy.from_json(json)
# print the JSON string representation of the object
print(ToolPolicyGetPolicyVersion200ResponseResultPolicy.to_json())

# convert the object into a dict
tool_policy_get_policy_version200_response_result_policy_dict = tool_policy_get_policy_version200_response_result_policy_instance.to_dict()
# create an instance of ToolPolicyGetPolicyVersion200ResponseResultPolicy from a dict
tool_policy_get_policy_version200_response_result_policy_from_dict = ToolPolicyGetPolicyVersion200ResponseResultPolicy.from_dict(tool_policy_get_policy_version200_response_result_policy_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


