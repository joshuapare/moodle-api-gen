# CoreAuthRequestPasswordReset200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notice** | **str** | Important information for the user about the process. | [default to 'null']
**status** | **str** | The returned status of the process:                     dataerror: Error in the sent data (username or email). More information in warnings field.                     emailpasswordconfirmmaybesent: Email sent or not (depends on user found in database).                     emailpasswordconfirmnotsent: Failure, user not found.                     emailpasswordconfirmnoemail: Failure, email not found.                     emailalreadysent: Email already sent.                     emailpasswordconfirmsent: User pending confirmation.                     emailresetconfirmsent: Email sent.                  | [default to 'null']
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_auth_request_password_reset200_response import CoreAuthRequestPasswordReset200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreAuthRequestPasswordReset200Response from a JSON string
core_auth_request_password_reset200_response_instance = CoreAuthRequestPasswordReset200Response.from_json(json)
# print the JSON string representation of the object
print(CoreAuthRequestPasswordReset200Response.to_json())

# convert the object into a dict
core_auth_request_password_reset200_response_dict = core_auth_request_password_reset200_response_instance.to_dict()
# create an instance of CoreAuthRequestPasswordReset200Response from a dict
core_auth_request_password_reset200_response_from_dict = CoreAuthRequestPasswordReset200Response.from_dict(core_auth_request_password_reset200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


