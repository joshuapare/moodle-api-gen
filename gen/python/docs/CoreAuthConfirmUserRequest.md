# CoreAuthConfirmUserRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**secret** | **str** | Confirmation secret | [default to 'null']
**username** | **str** | User name | [default to 'null']

## Example

```python
from openapi_client.models.core_auth_confirm_user_request import CoreAuthConfirmUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreAuthConfirmUserRequest from a JSON string
core_auth_confirm_user_request_instance = CoreAuthConfirmUserRequest.from_json(json)
# print the JSON string representation of the object
print(CoreAuthConfirmUserRequest.to_json())

# convert the object into a dict
core_auth_confirm_user_request_dict = core_auth_confirm_user_request_instance.to_dict()
# create an instance of CoreAuthConfirmUserRequest from a dict
core_auth_confirm_user_request_from_dict = CoreAuthConfirmUserRequest.from_dict(core_auth_confirm_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


