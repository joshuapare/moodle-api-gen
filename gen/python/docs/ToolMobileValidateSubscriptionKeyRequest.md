# ToolMobileValidateSubscriptionKeyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** | Site subscription temporary key. | [default to 'null']

## Example

```python
from openapi_client.models.tool_mobile_validate_subscription_key_request import ToolMobileValidateSubscriptionKeyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMobileValidateSubscriptionKeyRequest from a JSON string
tool_mobile_validate_subscription_key_request_instance = ToolMobileValidateSubscriptionKeyRequest.from_json(json)
# print the JSON string representation of the object
print(ToolMobileValidateSubscriptionKeyRequest.to_json())

# convert the object into a dict
tool_mobile_validate_subscription_key_request_dict = tool_mobile_validate_subscription_key_request_instance.to_dict()
# create an instance of ToolMobileValidateSubscriptionKeyRequest from a dict
tool_mobile_validate_subscription_key_request_from_dict = ToolMobileValidateSubscriptionKeyRequest.from_dict(tool_mobile_validate_subscription_key_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


