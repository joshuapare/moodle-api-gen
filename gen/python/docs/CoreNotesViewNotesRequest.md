# CoreNotesViewNotesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | course id, 0 for notes at system level | [default to null]
**userid** | **int** | user id, 0 means view all the user notes | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_notes_view_notes_request import CoreNotesViewNotesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreNotesViewNotesRequest from a JSON string
core_notes_view_notes_request_instance = CoreNotesViewNotesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreNotesViewNotesRequest.to_json())

# convert the object into a dict
core_notes_view_notes_request_dict = core_notes_view_notes_request_instance.to_dict()
# create an instance of CoreNotesViewNotesRequest from a dict
core_notes_view_notes_request_from_dict = CoreNotesViewNotesRequest.from_dict(core_notes_view_notes_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


