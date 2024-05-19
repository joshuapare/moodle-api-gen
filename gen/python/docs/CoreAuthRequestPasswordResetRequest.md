# CoreAuthRequestPasswordResetRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** | User email | [optional] [default to '']
**username** | **str** | User name | [optional] [default to '']

## Example

```python
from openapi_client.models.core_auth_request_password_reset_request import CoreAuthRequestPasswordResetRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreAuthRequestPasswordResetRequest from a JSON string
core_auth_request_password_reset_request_instance = CoreAuthRequestPasswordResetRequest.from_json(json)
# print the JSON string representation of the object
print(CoreAuthRequestPasswordResetRequest.to_json())

# convert the object into a dict
core_auth_request_password_reset_request_dict = core_auth_request_password_reset_request_instance.to_dict()
# create an instance of CoreAuthRequestPasswordResetRequest from a dict
core_auth_request_password_reset_request_from_dict = CoreAuthRequestPasswordResetRequest.from_dict(core_auth_request_password_reset_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


