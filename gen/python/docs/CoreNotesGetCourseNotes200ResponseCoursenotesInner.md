# CoreNotesGetCourseNotes200ResponseCoursenotesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | the content text formated | [optional] [default to 'null']
**courseid** | **int** | id of the course | [optional] 
**created** | **int** | time created (timestamp) | [optional] [default to null]
**format** | **int** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**id** | **int** | id of this note | [optional] [default to null]
**lastmodified** | **int** | time of last modification (timestamp) | [optional] [default to null]
**publishstate** | **str** | state of the note (i.e. draft, public, site)  | [optional] [default to 'null']
**userid** | **int** | user id | [optional] 
**usermodified** | **int** | user id of the creator of this note | [optional] [default to null]

## Example

```python
from openapi_client.models.core_notes_get_course_notes200_response_coursenotes_inner import CoreNotesGetCourseNotes200ResponseCoursenotesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreNotesGetCourseNotes200ResponseCoursenotesInner from a JSON string
core_notes_get_course_notes200_response_coursenotes_inner_instance = CoreNotesGetCourseNotes200ResponseCoursenotesInner.from_json(json)
# print the JSON string representation of the object
print(CoreNotesGetCourseNotes200ResponseCoursenotesInner.to_json())

# convert the object into a dict
core_notes_get_course_notes200_response_coursenotes_inner_dict = core_notes_get_course_notes200_response_coursenotes_inner_instance.to_dict()
# create an instance of CoreNotesGetCourseNotes200ResponseCoursenotesInner from a dict
core_notes_get_course_notes200_response_coursenotes_inner_from_dict = CoreNotesGetCourseNotes200ResponseCoursenotesInner.from_dict(core_notes_get_course_notes200_response_coursenotes_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


