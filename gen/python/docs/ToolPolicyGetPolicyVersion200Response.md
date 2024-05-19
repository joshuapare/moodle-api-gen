# ToolPolicyGetPolicyVersion200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | [**ToolPolicyGetPolicyVersion200ResponseResult**](ToolPolicyGetPolicyVersion200ResponseResult.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.tool_policy_get_policy_version200_response import ToolPolicyGetPolicyVersion200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolPolicyGetPolicyVersion200Response from a JSON string
tool_policy_get_policy_version200_response_instance = ToolPolicyGetPolicyVersion200Response.from_json(json)
# print the JSON string representation of the object
print(ToolPolicyGetPolicyVersion200Response.to_json())

# convert the object into a dict
tool_policy_get_policy_version200_response_dict = tool_policy_get_policy_version200_response_instance.to_dict()
# create an instance of ToolPolicyGetPolicyVersion200Response from a dict
tool_policy_get_policy_version200_response_from_dict = ToolPolicyGetPolicyVersion200Response.from_dict(tool_policy_get_policy_version200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


