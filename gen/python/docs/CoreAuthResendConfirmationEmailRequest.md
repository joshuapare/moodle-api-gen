# CoreAuthResendConfirmationEmailRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**password** | **str** | Plain text password. | [default to 'null']
**redirect** | **str** | Redirect the user to this site url after confirmation. | [optional] [default to '']
**username** | **str** | Username. | [default to 'null']

## Example

```python
from openapi_client.models.core_auth_resend_confirmation_email_request import CoreAuthResendConfirmationEmailRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreAuthResendConfirmationEmailRequest from a JSON string
core_auth_resend_confirmation_email_request_instance = CoreAuthResendConfirmationEmailRequest.from_json(json)
# print the JSON string representation of the object
print(CoreAuthResendConfirmationEmailRequest.to_json())

# convert the object into a dict
core_auth_resend_confirmation_email_request_dict = core_auth_resend_confirmation_email_request_instance.to_dict()
# create an instance of CoreAuthResendConfirmationEmailRequest from a dict
core_auth_resend_confirmation_email_request_from_dict = CoreAuthResendConfirmationEmailRequest.from_dict(core_auth_resend_confirmation_email_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


