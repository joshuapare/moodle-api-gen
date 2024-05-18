# ToolMobileGetPublicConfig200ResponseIdentityprovidersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iconurl** | **str** | The icon URL for the provider. | [optional] [default to 'null']
**name** | **str** | The identity provider name. | [optional] [default to 'null']
**url** | **str** | The URL of the provider. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.tool_mobile_get_public_config200_response_identityproviders_inner import ToolMobileGetPublicConfig200ResponseIdentityprovidersInner

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMobileGetPublicConfig200ResponseIdentityprovidersInner from a JSON string
tool_mobile_get_public_config200_response_identityproviders_inner_instance = ToolMobileGetPublicConfig200ResponseIdentityprovidersInner.from_json(json)
# print the JSON string representation of the object
print(ToolMobileGetPublicConfig200ResponseIdentityprovidersInner.to_json())

# convert the object into a dict
tool_mobile_get_public_config200_response_identityproviders_inner_dict = tool_mobile_get_public_config200_response_identityproviders_inner_instance.to_dict()
# create an instance of ToolMobileGetPublicConfig200ResponseIdentityprovidersInner from a dict
tool_mobile_get_public_config200_response_identityproviders_inner_from_dict = ToolMobileGetPublicConfig200ResponseIdentityprovidersInner.from_dict(tool_mobile_get_public_config200_response_identityproviders_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


