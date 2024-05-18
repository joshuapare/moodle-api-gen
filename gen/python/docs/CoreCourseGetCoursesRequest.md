# CoreCourseGetCoursesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**options** | [**CoreCourseGetCoursesRequestOptions**](CoreCourseGetCoursesRequestOptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_course_get_courses_request import CoreCourseGetCoursesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetCoursesRequest from a JSON string
core_course_get_courses_request_instance = CoreCourseGetCoursesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetCoursesRequest.to_json())

# convert the object into a dict
core_course_get_courses_request_dict = core_course_get_courses_request_instance.to_dict()
# create an instance of CoreCourseGetCoursesRequest from a dict
core_course_get_courses_request_from_dict = CoreCourseGetCoursesRequest.from_dict(core_course_get_courses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


