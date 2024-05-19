# CoreNotesCreateNotesRequestNotesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientnoteid** | **str** | your own client id for the note. If this id is provided, the fail message id will be returned to you | [optional] [default to 'null']
**courseid** | **int** | course id of the note (in Moodle a note can only be created into a course, even for site and personal notes) | [optional] [default to null]
**format** | **int** | text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**publishstate** | **str** | &#39;personal&#39;, &#39;course&#39; or &#39;site&#39; | [optional] [default to 'null']
**text** | **str** | the text of the message - text or HTML | [optional] [default to 'null']
**userid** | **int** | id of the user the note is about | [optional] [default to null]

## Example

```python
from openapi_client.models.core_notes_create_notes_request_notes_inner import CoreNotesCreateNotesRequestNotesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreNotesCreateNotesRequestNotesInner from a JSON string
core_notes_create_notes_request_notes_inner_instance = CoreNotesCreateNotesRequestNotesInner.from_json(json)
# print the JSON string representation of the object
print(CoreNotesCreateNotesRequestNotesInner.to_json())

# convert the object into a dict
core_notes_create_notes_request_notes_inner_dict = core_notes_create_notes_request_notes_inner_instance.to_dict()
# create an instance of CoreNotesCreateNotesRequestNotesInner from a dict
core_notes_create_notes_request_notes_inner_from_dict = CoreNotesCreateNotesRequestNotesInner.from_dict(core_notes_create_notes_request_notes_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


