# AuthEmailGetSignupSettings200ResponseWarningsInner

warning

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **str** | item | [optional] [default to 'null']
**itemid** | **int** | item id | [optional] [default to null]
**message** | **str** | untranslated english message to explain the warning | [optional] [default to 'null']
**warningcode** | **str** | the warning code can be used by the client app to implement specific behaviour | [optional] [default to 'null']

## Example

```python
from openapi_client.models.auth_email_get_signup_settings200_response_warnings_inner import AuthEmailGetSignupSettings200ResponseWarningsInner

# TODO update the JSON string below
json = "{}"
# create an instance of AuthEmailGetSignupSettings200ResponseWarningsInner from a JSON string
auth_email_get_signup_settings200_response_warnings_inner_instance = AuthEmailGetSignupSettings200ResponseWarningsInner.from_json(json)
# print the JSON string representation of the object
print(AuthEmailGetSignupSettings200ResponseWarningsInner.to_json())

# convert the object into a dict
auth_email_get_signup_settings200_response_warnings_inner_dict = auth_email_get_signup_settings200_response_warnings_inner_instance.to_dict()
# create an instance of AuthEmailGetSignupSettings200ResponseWarningsInner from a dict
auth_email_get_signup_settings200_response_warnings_inner_from_dict = AuthEmailGetSignupSettings200ResponseWarningsInner.from_dict(auth_email_get_signup_settings200_response_warnings_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


