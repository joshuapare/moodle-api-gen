# CoreCourseGetUserNavigationOptions200ResponseCoursesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Course id | [optional] 
**options** | [**List[CoreCourseGetUserNavigationOptions200ResponseCoursesInnerOptionsInner]**](CoreCourseGetUserNavigationOptions200ResponseCoursesInnerOptionsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_course_get_user_navigation_options200_response_courses_inner import CoreCourseGetUserNavigationOptions200ResponseCoursesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetUserNavigationOptions200ResponseCoursesInner from a JSON string
core_course_get_user_navigation_options200_response_courses_inner_instance = CoreCourseGetUserNavigationOptions200ResponseCoursesInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetUserNavigationOptions200ResponseCoursesInner.to_json())

# convert the object into a dict
core_course_get_user_navigation_options200_response_courses_inner_dict = core_course_get_user_navigation_options200_response_courses_inner_instance.to_dict()
# create an instance of CoreCourseGetUserNavigationOptions200ResponseCoursesInner from a dict
core_course_get_user_navigation_options200_response_courses_inner_from_dict = CoreCourseGetUserNavigationOptions200ResponseCoursesInner.from_dict(core_course_get_user_navigation_options200_response_courses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


