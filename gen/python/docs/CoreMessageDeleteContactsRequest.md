# CoreMessageDeleteContactsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userid** | **int** | The id of the user we are deleting the contacts for, 0 for the                     current user | [optional] [default to 0]
**userids** | **List[object]** |  | 

## Example

```python
from openapi_client.models.core_message_delete_contacts_request import CoreMessageDeleteContactsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageDeleteContactsRequest from a JSON string
core_message_delete_contacts_request_instance = CoreMessageDeleteContactsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageDeleteContactsRequest.to_json())

# convert the object into a dict
core_message_delete_contacts_request_dict = core_message_delete_contacts_request_instance.to_dict()
# create an instance of CoreMessageDeleteContactsRequest from a dict
core_message_delete_contacts_request_from_dict = CoreMessageDeleteContactsRequest.from_dict(core_message_delete_contacts_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


