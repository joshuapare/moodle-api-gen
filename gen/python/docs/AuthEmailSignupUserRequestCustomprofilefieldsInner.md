# AuthEmailSignupUserRequestCustomprofilefieldsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the custom field | [optional] [default to 'null']
**type** | **str** | The type of the custom field | [optional] [default to 'null']
**value** | **str** | Custom field value, can be an encoded json if required | [optional] [default to 'null']

## Example

```python
from openapi_client.models.auth_email_signup_user_request_customprofilefields_inner import AuthEmailSignupUserRequestCustomprofilefieldsInner

# TODO update the JSON string below
json = "{}"
# create an instance of AuthEmailSignupUserRequestCustomprofilefieldsInner from a JSON string
auth_email_signup_user_request_customprofilefields_inner_instance = AuthEmailSignupUserRequestCustomprofilefieldsInner.from_json(json)
# print the JSON string representation of the object
print(AuthEmailSignupUserRequestCustomprofilefieldsInner.to_json())

# convert the object into a dict
auth_email_signup_user_request_customprofilefields_inner_dict = auth_email_signup_user_request_customprofilefields_inner_instance.to_dict()
# create an instance of AuthEmailSignupUserRequestCustomprofilefieldsInner from a dict
auth_email_signup_user_request_customprofilefields_inner_from_dict = AuthEmailSignupUserRequestCustomprofilefieldsInner.from_dict(auth_email_signup_user_request_customprofilefields_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


