# ToolIomadpolicyGetIomadpolicyVersion200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | [**ToolIomadpolicyGetIomadpolicyVersion200ResponseResult**](ToolIomadpolicyGetIomadpolicyVersion200ResponseResult.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.tool_iomadpolicy_get_iomadpolicy_version200_response import ToolIomadpolicyGetIomadpolicyVersion200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolIomadpolicyGetIomadpolicyVersion200Response from a JSON string
tool_iomadpolicy_get_iomadpolicy_version200_response_instance = ToolIomadpolicyGetIomadpolicyVersion200Response.from_json(json)
# print the JSON string representation of the object
print(ToolIomadpolicyGetIomadpolicyVersion200Response.to_json())

# convert the object into a dict
tool_iomadpolicy_get_iomadpolicy_version200_response_dict = tool_iomadpolicy_get_iomadpolicy_version200_response_instance.to_dict()
# create an instance of ToolIomadpolicyGetIomadpolicyVersion200Response from a dict
tool_iomadpolicy_get_iomadpolicy_version200_response_from_dict = ToolIomadpolicyGetIomadpolicyVersion200Response.from_dict(tool_iomadpolicy_get_iomadpolicy_version200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


