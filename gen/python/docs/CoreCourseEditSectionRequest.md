# CoreCourseEditSectionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** | action: hide, show, stealth, setmarker, removemarker | [default to 'null']
**id** | **int** | course section id | [default to null]
**sectionreturn** | **int** | section to return to | [optional] 

## Example

```python
from openapi_client.models.core_course_edit_section_request import CoreCourseEditSectionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseEditSectionRequest from a JSON string
core_course_edit_section_request_instance = CoreCourseEditSectionRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseEditSectionRequest.to_json())

# convert the object into a dict
core_course_edit_section_request_dict = core_course_edit_section_request_instance.to_dict()
# create an instance of CoreCourseEditSectionRequest from a dict
core_course_edit_section_request_from_dict = CoreCourseEditSectionRequest.from_dict(core_course_edit_section_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


