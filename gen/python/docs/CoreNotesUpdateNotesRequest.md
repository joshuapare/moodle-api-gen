# CoreNotesUpdateNotesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notes** | [**List[CoreNotesUpdateNotesRequestNotesInner]**](CoreNotesUpdateNotesRequestNotesInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_notes_update_notes_request import CoreNotesUpdateNotesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreNotesUpdateNotesRequest from a JSON string
core_notes_update_notes_request_instance = CoreNotesUpdateNotesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreNotesUpdateNotesRequest.to_json())

# convert the object into a dict
core_notes_update_notes_request_dict = core_notes_update_notes_request_instance.to_dict()
# create an instance of CoreNotesUpdateNotesRequest from a dict
core_notes_update_notes_request_from_dict = CoreNotesUpdateNotesRequest.from_dict(core_notes_update_notes_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


