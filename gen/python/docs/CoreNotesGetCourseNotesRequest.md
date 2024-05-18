# CoreNotesGetCourseNotesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | course id, 0 for SITE | [default to null]
**userid** | **int** | user id | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_notes_get_course_notes_request import CoreNotesGetCourseNotesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreNotesGetCourseNotesRequest from a JSON string
core_notes_get_course_notes_request_instance = CoreNotesGetCourseNotesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreNotesGetCourseNotesRequest.to_json())

# convert the object into a dict
core_notes_get_course_notes_request_dict = core_notes_get_course_notes_request_instance.to_dict()
# create an instance of CoreNotesGetCourseNotesRequest from a dict
core_notes_get_course_notes_request_from_dict = CoreNotesGetCourseNotesRequest.from_dict(core_notes_get_course_notes_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


