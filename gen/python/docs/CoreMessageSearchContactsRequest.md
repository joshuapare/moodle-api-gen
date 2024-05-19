# CoreMessageSearchContactsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**onlymycourses** | **bool** | Limit search to the user&#39;s courses | [optional] [default to False]
**searchtext** | **str** | String the user&#39;s fullname has to match to be found | [default to 'null']

## Example

```python
from openapi_client.models.core_message_search_contacts_request import CoreMessageSearchContactsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageSearchContactsRequest from a JSON string
core_message_search_contacts_request_instance = CoreMessageSearchContactsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageSearchContactsRequest.to_json())

# convert the object into a dict
core_message_search_contacts_request_dict = core_message_search_contacts_request_instance.to_dict()
# create an instance of CoreMessageSearchContactsRequest from a dict
core_message_search_contacts_request_from_dict = CoreMessageSearchContactsRequest.from_dict(core_message_search_contacts_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


