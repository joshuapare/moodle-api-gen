# CoreMessageConfirmContactRequestRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requesteduserid** | **int** | The id of the user being requested | [default to null]
**userid** | **int** | The id of the user making the request | [default to null]

## Example

```python
from openapi_client.models.core_message_confirm_contact_request_request import CoreMessageConfirmContactRequestRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageConfirmContactRequestRequest from a JSON string
core_message_confirm_contact_request_request_instance = CoreMessageConfirmContactRequestRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageConfirmContactRequestRequest.to_json())

# convert the object into a dict
core_message_confirm_contact_request_request_dict = core_message_confirm_contact_request_request_instance.to_dict()
# create an instance of CoreMessageConfirmContactRequestRequest from a dict
core_message_confirm_contact_request_request_from_dict = CoreMessageConfirmContactRequestRequest.from_dict(core_message_confirm_contact_request_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


