# AuthEmailSignupUser200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**success** | **bool** | True if the user was created false otherwise | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.auth_email_signup_user200_response import AuthEmailSignupUser200Response

# TODO update the JSON string below
json = "{}"
# create an instance of AuthEmailSignupUser200Response from a JSON string
auth_email_signup_user200_response_instance = AuthEmailSignupUser200Response.from_json(json)
# print the JSON string representation of the object
print(AuthEmailSignupUser200Response.to_json())

# convert the object into a dict
auth_email_signup_user200_response_dict = auth_email_signup_user200_response_instance.to_dict()
# create an instance of AuthEmailSignupUser200Response from a dict
auth_email_signup_user200_response_from_dict = AuthEmailSignupUser200Response.from_dict(auth_email_signup_user200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


