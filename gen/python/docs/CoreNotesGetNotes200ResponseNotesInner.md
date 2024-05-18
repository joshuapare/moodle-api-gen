# CoreNotesGetNotes200ResponseNotesInner

note

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | course id of the note | [optional] [default to null]
**format** | **int** | text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**noteid** | **int** | id of the note | [optional] [default to null]
**publishstate** | **str** | &#39;personal&#39;, &#39;course&#39; or &#39;site&#39; | [optional] 
**text** | **str** | the text of the message - text or HTML | [optional] 
**userid** | **int** | id of the user the note is about | [optional] 

## Example

```python
from openapi_client.models.core_notes_get_notes200_response_notes_inner import CoreNotesGetNotes200ResponseNotesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreNotesGetNotes200ResponseNotesInner from a JSON string
core_notes_get_notes200_response_notes_inner_instance = CoreNotesGetNotes200ResponseNotesInner.from_json(json)
# print the JSON string representation of the object
print(CoreNotesGetNotes200ResponseNotesInner.to_json())

# convert the object into a dict
core_notes_get_notes200_response_notes_inner_dict = core_notes_get_notes200_response_notes_inner_instance.to_dict()
# create an instance of CoreNotesGetNotes200ResponseNotesInner from a dict
core_notes_get_notes200_response_notes_inner_from_dict = CoreNotesGetNotes200ResponseNotesInner.from_dict(core_notes_get_notes200_response_notes_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


