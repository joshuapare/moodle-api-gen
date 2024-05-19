# CoreNotesGetNotes200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notes** | [**List[CoreNotesGetNotes200ResponseNotesInner]**](CoreNotesGetNotes200ResponseNotesInner.md) |  | 
**warnings** | [**List[CoreNotesGetNotes200ResponseWarningsInner]**](CoreNotesGetNotes200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_notes_get_notes200_response import CoreNotesGetNotes200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreNotesGetNotes200Response from a JSON string
core_notes_get_notes200_response_instance = CoreNotesGetNotes200Response.from_json(json)
# print the JSON string representation of the object
print(CoreNotesGetNotes200Response.to_json())

# convert the object into a dict
core_notes_get_notes200_response_dict = core_notes_get_notes200_response_instance.to_dict()
# create an instance of CoreNotesGetNotes200Response from a dict
core_notes_get_notes200_response_from_dict = CoreNotesGetNotes200Response.from_dict(core_notes_get_notes200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


