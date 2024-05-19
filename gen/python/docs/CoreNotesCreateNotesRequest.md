# CoreNotesCreateNotesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notes** | [**List[CoreNotesCreateNotesRequestNotesInner]**](CoreNotesCreateNotesRequestNotesInner.md) |  | 

## Example

```python
from openapi_client.models.core_notes_create_notes_request import CoreNotesCreateNotesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreNotesCreateNotesRequest from a JSON string
core_notes_create_notes_request_instance = CoreNotesCreateNotesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreNotesCreateNotesRequest.to_json())

# convert the object into a dict
core_notes_create_notes_request_dict = core_notes_create_notes_request_instance.to_dict()
# create an instance of CoreNotesCreateNotesRequest from a dict
core_notes_create_notes_request_from_dict = CoreNotesCreateNotesRequest.from_dict(core_notes_create_notes_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


