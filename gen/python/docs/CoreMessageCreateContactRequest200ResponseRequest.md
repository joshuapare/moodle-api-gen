# CoreMessageCreateContactRequest200ResponseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Message id | [default to null]
**requesteduserid** | **int** | User to id | [default to null]
**timecreated** | **int** | Time created | 
**userid** | **int** | User from id | [default to null]

## Example

```python
from openapi_client.models.core_message_create_contact_request200_response_request import CoreMessageCreateContactRequest200ResponseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageCreateContactRequest200ResponseRequest from a JSON string
core_message_create_contact_request200_response_request_instance = CoreMessageCreateContactRequest200ResponseRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageCreateContactRequest200ResponseRequest.to_json())

# convert the object into a dict
core_message_create_contact_request200_response_request_dict = core_message_create_contact_request200_response_request_instance.to_dict()
# create an instance of CoreMessageCreateContactRequest200ResponseRequest from a dict
core_message_create_contact_request200_response_request_from_dict = CoreMessageCreateContactRequest200ResponseRequest.from_dict(core_message_create_contact_request200_response_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


