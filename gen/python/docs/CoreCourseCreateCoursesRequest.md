# CoreCourseCreateCoursesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courses** | [**List[CoreCourseCreateCoursesRequestCoursesInner]**](CoreCourseCreateCoursesRequestCoursesInner.md) |  | 

## Example

```python
from openapi_client.models.core_course_create_courses_request import CoreCourseCreateCoursesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseCreateCoursesRequest from a JSON string
core_course_create_courses_request_instance = CoreCourseCreateCoursesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseCreateCoursesRequest.to_json())

# convert the object into a dict
core_course_create_courses_request_dict = core_course_create_courses_request_instance.to_dict()
# create an instance of CoreCourseCreateCoursesRequest from a dict
core_course_create_courses_request_from_dict = CoreCourseCreateCoursesRequest.from_dict(core_course_create_courses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


