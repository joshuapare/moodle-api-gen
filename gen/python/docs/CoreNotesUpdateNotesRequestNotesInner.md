# CoreNotesUpdateNotesRequestNotesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | **int** | text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**id** | **int** | id of the note | [optional] 
**publishstate** | **str** | &#39;personal&#39;, &#39;course&#39; or &#39;site&#39; | [optional] 
**text** | **str** | the text of the message - text or HTML | [optional] 

## Example

```python
from openapi_client.models.core_notes_update_notes_request_notes_inner import CoreNotesUpdateNotesRequestNotesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreNotesUpdateNotesRequestNotesInner from a JSON string
core_notes_update_notes_request_notes_inner_instance = CoreNotesUpdateNotesRequestNotesInner.from_json(json)
# print the JSON string representation of the object
print(CoreNotesUpdateNotesRequestNotesInner.to_json())

# convert the object into a dict
core_notes_update_notes_request_notes_inner_dict = core_notes_update_notes_request_notes_inner_instance.to_dict()
# create an instance of CoreNotesUpdateNotesRequestNotesInner from a dict
core_notes_update_notes_request_notes_inner_from_dict = CoreNotesUpdateNotesRequestNotesInner.from_dict(core_notes_update_notes_request_notes_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


