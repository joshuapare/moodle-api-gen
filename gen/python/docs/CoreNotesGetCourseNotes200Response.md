# CoreNotesGetCourseNotes200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canmanagecoursenotes** | **bool** | Whether the user can manage notes at the given course. | [optional] [default to False]
**canmanagesystemnotes** | **bool** | Whether the user can manage notes at system level. | [optional] [default to False]
**coursenotes** | [**List[CoreNotesGetCourseNotes200ResponseCoursenotesInner]**](CoreNotesGetCourseNotes200ResponseCoursenotesInner.md) |  | [optional] 
**personalnotes** | [**List[CoreNotesGetCourseNotes200ResponsePersonalnotesInner]**](CoreNotesGetCourseNotes200ResponsePersonalnotesInner.md) |  | [optional] 
**sitenotes** | [**List[CoreNotesGetCourseNotes200ResponsePersonalnotesInner]**](CoreNotesGetCourseNotes200ResponsePersonalnotesInner.md) |  | [optional] 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_notes_get_course_notes200_response import CoreNotesGetCourseNotes200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreNotesGetCourseNotes200Response from a JSON string
core_notes_get_course_notes200_response_instance = CoreNotesGetCourseNotes200Response.from_json(json)
# print the JSON string representation of the object
print(CoreNotesGetCourseNotes200Response.to_json())

# convert the object into a dict
core_notes_get_course_notes200_response_dict = core_notes_get_course_notes200_response_instance.to_dict()
# create an instance of CoreNotesGetCourseNotes200Response from a dict
core_notes_get_course_notes200_response_from_dict = CoreNotesGetCourseNotes200Response.from_dict(core_notes_get_course_notes200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


