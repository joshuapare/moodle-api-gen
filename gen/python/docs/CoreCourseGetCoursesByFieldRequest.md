# CoreCourseGetCoursesByFieldRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_field** | **str** | The field to search can be left empty for all courses or:                     id: course id                     ids: comma separated course ids                     shortname: course short name                     idnumber: course id number                     category: category id the course belongs to                  | [optional] [default to '']
**value** | **str** | The value to match | [optional] [default to '']

## Example

```python
from openapi_client.models.core_course_get_courses_by_field_request import CoreCourseGetCoursesByFieldRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetCoursesByFieldRequest from a JSON string
core_course_get_courses_by_field_request_instance = CoreCourseGetCoursesByFieldRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetCoursesByFieldRequest.to_json())

# convert the object into a dict
core_course_get_courses_by_field_request_dict = core_course_get_courses_by_field_request_instance.to_dict()
# create an instance of CoreCourseGetCoursesByFieldRequest from a dict
core_course_get_courses_by_field_request_from_dict = CoreCourseGetCoursesByFieldRequest.from_dict(core_course_get_courses_by_field_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


