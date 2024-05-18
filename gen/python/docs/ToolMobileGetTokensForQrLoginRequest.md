# ToolMobileGetTokensForQrLoginRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**qrloginkey** | **str** | The user key for validating the request. | [default to 'null']
**userid** | **int** | The user the key belongs to. | [default to null]

## Example

```python
from openapi_client.models.tool_mobile_get_tokens_for_qr_login_request import ToolMobileGetTokensForQrLoginRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMobileGetTokensForQrLoginRequest from a JSON string
tool_mobile_get_tokens_for_qr_login_request_instance = ToolMobileGetTokensForQrLoginRequest.from_json(json)
# print the JSON string representation of the object
print(ToolMobileGetTokensForQrLoginRequest.to_json())

# convert the object into a dict
tool_mobile_get_tokens_for_qr_login_request_dict = tool_mobile_get_tokens_for_qr_login_request_instance.to_dict()
# create an instance of ToolMobileGetTokensForQrLoginRequest from a dict
tool_mobile_get_tokens_for_qr_login_request_from_dict = ToolMobileGetTokensForQrLoginRequest.from_dict(tool_mobile_get_tokens_for_qr_login_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


