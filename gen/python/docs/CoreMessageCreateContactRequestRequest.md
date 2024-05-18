# CoreMessageCreateContactRequestRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requesteduserid** | **int** | The id of the user being requested | 
**userid** | **int** | The id of the user making the request | 

## Example

```python
from openapi_client.models.core_message_create_contact_request_request import CoreMessageCreateContactRequestRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageCreateContactRequestRequest from a JSON string
core_message_create_contact_request_request_instance = CoreMessageCreateContactRequestRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageCreateContactRequestRequest.to_json())

# convert the object into a dict
core_message_create_contact_request_request_dict = core_message_create_contact_request_request_instance.to_dict()
# create an instance of CoreMessageCreateContactRequestRequest from a dict
core_message_create_contact_request_request_from_dict = CoreMessageCreateContactRequestRequest.from_dict(core_message_create_contact_request_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


