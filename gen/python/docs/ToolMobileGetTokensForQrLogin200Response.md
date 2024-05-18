# ToolMobileGetTokensForQrLogin200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**privatetoken** | **str** | Private token used for auto-login processes. | [default to 'null']
**token** | **str** | A valid WebService token for the official mobile app service. | [default to 'null']
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.tool_mobile_get_tokens_for_qr_login200_response import ToolMobileGetTokensForQrLogin200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMobileGetTokensForQrLogin200Response from a JSON string
tool_mobile_get_tokens_for_qr_login200_response_instance = ToolMobileGetTokensForQrLogin200Response.from_json(json)
# print the JSON string representation of the object
print(ToolMobileGetTokensForQrLogin200Response.to_json())

# convert the object into a dict
tool_mobile_get_tokens_for_qr_login200_response_dict = tool_mobile_get_tokens_for_qr_login200_response_instance.to_dict()
# create an instance of ToolMobileGetTokensForQrLogin200Response from a dict
tool_mobile_get_tokens_for_qr_login200_response_from_dict = ToolMobileGetTokensForQrLogin200Response.from_dict(tool_mobile_get_tokens_for_qr_login200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


