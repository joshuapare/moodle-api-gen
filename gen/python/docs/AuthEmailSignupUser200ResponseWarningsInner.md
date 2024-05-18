# AuthEmailSignupUser200ResponseWarningsInner

warning

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **str** | item | [optional] 
**itemid** | **int** | item id | [optional] 
**message** | **str** | untranslated english message to explain the warning | [optional] 
**warningcode** | **str** | the warning code can be used by the client app to implement specific behaviour | [optional] 

## Example

```python
from openapi_client.models.auth_email_signup_user200_response_warnings_inner import AuthEmailSignupUser200ResponseWarningsInner

# TODO update the JSON string below
json = "{}"
# create an instance of AuthEmailSignupUser200ResponseWarningsInner from a JSON string
auth_email_signup_user200_response_warnings_inner_instance = AuthEmailSignupUser200ResponseWarningsInner.from_json(json)
# print the JSON string representation of the object
print(AuthEmailSignupUser200ResponseWarningsInner.to_json())

# convert the object into a dict
auth_email_signup_user200_response_warnings_inner_dict = auth_email_signup_user200_response_warnings_inner_instance.to_dict()
# create an instance of AuthEmailSignupUser200ResponseWarningsInner from a dict
auth_email_signup_user200_response_warnings_inner_from_dict = AuthEmailSignupUser200ResponseWarningsInner.from_dict(auth_email_signup_user200_response_warnings_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


