# CoreCourseGetCoursesByField200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courses** | [**List[CoreCourseGetCoursesByField200ResponseCoursesInner]**](CoreCourseGetCoursesByField200ResponseCoursesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_course_get_courses_by_field200_response import CoreCourseGetCoursesByField200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetCoursesByField200Response from a JSON string
core_course_get_courses_by_field200_response_instance = CoreCourseGetCoursesByField200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetCoursesByField200Response.to_json())

# convert the object into a dict
core_course_get_courses_by_field200_response_dict = core_course_get_courses_by_field200_response_instance.to_dict()
# create an instance of CoreCourseGetCoursesByField200Response from a dict
core_course_get_courses_by_field200_response_from_dict = CoreCourseGetCoursesByField200Response.from_dict(core_course_get_courses_by_field200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


