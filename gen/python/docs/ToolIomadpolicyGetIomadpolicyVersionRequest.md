# ToolIomadpolicyGetIomadpolicyVersionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**behalfid** | **int** | The id of user on whose behalf the user is viewing the iomadpolicy | [optional] [default to 0]
**versionid** | **int** | The iomadpolicy version ID | [default to null]

## Example

```python
from openapi_client.models.tool_iomadpolicy_get_iomadpolicy_version_request import ToolIomadpolicyGetIomadpolicyVersionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolIomadpolicyGetIomadpolicyVersionRequest from a JSON string
tool_iomadpolicy_get_iomadpolicy_version_request_instance = ToolIomadpolicyGetIomadpolicyVersionRequest.from_json(json)
# print the JSON string representation of the object
print(ToolIomadpolicyGetIomadpolicyVersionRequest.to_json())

# convert the object into a dict
tool_iomadpolicy_get_iomadpolicy_version_request_dict = tool_iomadpolicy_get_iomadpolicy_version_request_instance.to_dict()
# create an instance of ToolIomadpolicyGetIomadpolicyVersionRequest from a dict
tool_iomadpolicy_get_iomadpolicy_version_request_from_dict = ToolIomadpolicyGetIomadpolicyVersionRequest.from_dict(tool_iomadpolicy_get_iomadpolicy_version_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


