# CoreAuthConfirmUser200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**success** | **bool** | True if the user was confirmed, false if he was already confirmed | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_auth_confirm_user200_response import CoreAuthConfirmUser200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreAuthConfirmUser200Response from a JSON string
core_auth_confirm_user200_response_instance = CoreAuthConfirmUser200Response.from_json(json)
# print the JSON string representation of the object
print(CoreAuthConfirmUser200Response.to_json())

# convert the object into a dict
core_auth_confirm_user200_response_dict = core_auth_confirm_user200_response_instance.to_dict()
# create an instance of CoreAuthConfirmUser200Response from a dict
core_auth_confirm_user200_response_from_dict = CoreAuthConfirmUser200Response.from_dict(core_auth_confirm_user200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


