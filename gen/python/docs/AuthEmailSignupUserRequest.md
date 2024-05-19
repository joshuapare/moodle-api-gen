# AuthEmailSignupUserRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **str** | Home city of the user | [optional] [default to '']
**country** | **str** | Home country code | [optional] [default to '']
**customprofilefields** | [**List[AuthEmailSignupUserRequestCustomprofilefieldsInner]**](AuthEmailSignupUserRequestCustomprofilefieldsInner.md) |  | [optional] 
**email** | **str** | A valid and unique email address | [default to 'null']
**firstname** | **str** | The first name(s) of the user | [default to 'null']
**lastname** | **str** | The family name of the user | [default to 'null']
**password** | **str** | Plain text password | [default to 'null']
**recaptchachallengehash** | **str** | Recaptcha challenge hash | [optional] [default to '']
**recaptcharesponse** | **str** | Recaptcha response | [optional] [default to '']
**redirect** | **str** | Redirect the user to this site url after confirmation. | [optional] [default to '']
**username** | **str** | Username | [default to 'null']

## Example

```python
from openapi_client.models.auth_email_signup_user_request import AuthEmailSignupUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AuthEmailSignupUserRequest from a JSON string
auth_email_signup_user_request_instance = AuthEmailSignupUserRequest.from_json(json)
# print the JSON string representation of the object
print(AuthEmailSignupUserRequest.to_json())

# convert the object into a dict
auth_email_signup_user_request_dict = auth_email_signup_user_request_instance.to_dict()
# create an instance of AuthEmailSignupUserRequest from a dict
auth_email_signup_user_request_from_dict = AuthEmailSignupUserRequest.from_dict(auth_email_signup_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


