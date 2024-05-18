# ToolMobileGetConfig200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settings** | [**List[ToolMobileGetConfig200ResponseSettingsInner]**](ToolMobileGetConfig200ResponseSettingsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.tool_mobile_get_config200_response import ToolMobileGetConfig200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMobileGetConfig200Response from a JSON string
tool_mobile_get_config200_response_instance = ToolMobileGetConfig200Response.from_json(json)
# print the JSON string representation of the object
print(ToolMobileGetConfig200Response.to_json())

# convert the object into a dict
tool_mobile_get_config200_response_dict = tool_mobile_get_config200_response_instance.to_dict()
# create an instance of ToolMobileGetConfig200Response from a dict
tool_mobile_get_config200_response_from_dict = ToolMobileGetConfig200Response.from_dict(tool_mobile_get_config200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


