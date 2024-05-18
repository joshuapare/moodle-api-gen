# AuthEmailGetSignupSettings200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **str** | Default country | [optional] [default to 'null']
**defaultcity** | **str** | Default city | [optional] [default to 'null']
**namefields** | **List[object]** |  | 
**passwordpolicy** | **str** | Password policy | [optional] [default to 'null']
**profilefields** | [**List[AuthEmailGetSignupSettings200ResponseProfilefieldsInner]**](AuthEmailGetSignupSettings200ResponseProfilefieldsInner.md) |  | [optional] 
**recaptchachallengehash** | **str** | Recaptcha challenge hash | [optional] [default to 'null']
**recaptchachallengeimage** | **str** | Recaptcha challenge noscript image | [optional] [default to 'null']
**recaptchachallengejs** | **str** | Recaptcha challenge js url | [optional] [default to 'null']
**recaptchapublickey** | **str** | Recaptcha public key | [optional] [default to 'null']
**sitepolicy** | **str** | Site policy | [optional] [default to 'null']
**sitepolicyhandler** | **str** | Site policy handler | [optional] [default to 'null']
**warnings** | [**List[AuthEmailGetSignupSettings200ResponseWarningsInner]**](AuthEmailGetSignupSettings200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.auth_email_get_signup_settings200_response import AuthEmailGetSignupSettings200Response

# TODO update the JSON string below
json = "{}"
# create an instance of AuthEmailGetSignupSettings200Response from a JSON string
auth_email_get_signup_settings200_response_instance = AuthEmailGetSignupSettings200Response.from_json(json)
# print the JSON string representation of the object
print(AuthEmailGetSignupSettings200Response.to_json())

# convert the object into a dict
auth_email_get_signup_settings200_response_dict = auth_email_get_signup_settings200_response_instance.to_dict()
# create an instance of AuthEmailGetSignupSettings200Response from a dict
auth_email_get_signup_settings200_response_from_dict = AuthEmailGetSignupSettings200Response.from_dict(auth_email_get_signup_settings200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


