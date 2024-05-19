# CoreAuthResendConfirmationEmail200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | True if the confirmation email was sent, false otherwise. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_auth_resend_confirmation_email200_response import CoreAuthResendConfirmationEmail200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreAuthResendConfirmationEmail200Response from a JSON string
core_auth_resend_confirmation_email200_response_instance = CoreAuthResendConfirmationEmail200Response.from_json(json)
# print the JSON string representation of the object
print(CoreAuthResendConfirmationEmail200Response.to_json())

# convert the object into a dict
core_auth_resend_confirmation_email200_response_dict = core_auth_resend_confirmation_email200_response_instance.to_dict()
# create an instance of CoreAuthResendConfirmationEmail200Response from a dict
core_auth_resend_confirmation_email200_response_from_dict = CoreAuthResendConfirmationEmail200Response.from_dict(core_auth_resend_confirmation_email200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


