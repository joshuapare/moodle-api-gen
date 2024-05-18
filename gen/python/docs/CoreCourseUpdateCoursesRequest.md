# CoreCourseUpdateCoursesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courses** | [**List[CoreCourseUpdateCoursesRequestCoursesInner]**](CoreCourseUpdateCoursesRequestCoursesInner.md) |  | 

## Example

```python
from openapi_client.models.core_course_update_courses_request import CoreCourseUpdateCoursesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseUpdateCoursesRequest from a JSON string
core_course_update_courses_request_instance = CoreCourseUpdateCoursesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseUpdateCoursesRequest.to_json())

# convert the object into a dict
core_course_update_courses_request_dict = core_course_update_courses_request_instance.to_dict()
# create an instance of CoreCourseUpdateCoursesRequest from a dict
core_course_update_courses_request_from_dict = CoreCourseUpdateCoursesRequest.from_dict(core_course_update_courses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


