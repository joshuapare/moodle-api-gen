# ToolMobileGetAutologinKey200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autologinurl** | **str** | Auto-login URL. | [default to 'null']
**key** | **str** | Auto-login key for a single usage with time expiration. | [default to 'null']
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.tool_mobile_get_autologin_key200_response import ToolMobileGetAutologinKey200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMobileGetAutologinKey200Response from a JSON string
tool_mobile_get_autologin_key200_response_instance = ToolMobileGetAutologinKey200Response.from_json(json)
# print the JSON string representation of the object
print(ToolMobileGetAutologinKey200Response.to_json())

# convert the object into a dict
tool_mobile_get_autologin_key200_response_dict = tool_mobile_get_autologin_key200_response_instance.to_dict()
# create an instance of ToolMobileGetAutologinKey200Response from a dict
tool_mobile_get_autologin_key200_response_from_dict = ToolMobileGetAutologinKey200Response.from_dict(tool_mobile_get_autologin_key200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


