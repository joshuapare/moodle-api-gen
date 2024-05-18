# ToolMobileValidateSubscriptionKey200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**validated** | **bool** | Whether the key is validated or not. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.tool_mobile_validate_subscription_key200_response import ToolMobileValidateSubscriptionKey200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMobileValidateSubscriptionKey200Response from a JSON string
tool_mobile_validate_subscription_key200_response_instance = ToolMobileValidateSubscriptionKey200Response.from_json(json)
# print the JSON string representation of the object
print(ToolMobileValidateSubscriptionKey200Response.to_json())

# convert the object into a dict
tool_mobile_validate_subscription_key200_response_dict = tool_mobile_validate_subscription_key200_response_instance.to_dict()
# create an instance of ToolMobileValidateSubscriptionKey200Response from a dict
tool_mobile_validate_subscription_key200_response_from_dict = ToolMobileValidateSubscriptionKey200Response.from_dict(tool_mobile_validate_subscription_key200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

