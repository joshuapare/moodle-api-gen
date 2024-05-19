# CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | **str** | Filter plugin name | [optional] [default to 'null']
**inheritedstate** | **int** | 1 or 0 to use when localstate is set to inherit | [optional] [default to null]
**localstate** | **int** | Filter state: 1 for on, -1 for off, 0 if inherit | [optional] [default to null]

## Example

```python
from openapi_client.models.core_course_get_courses_by_field200_response_courses_inner_filters_inner import CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner from a JSON string
core_course_get_courses_by_field200_response_courses_inner_filters_inner_instance = CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner.to_json())

# convert the object into a dict
core_course_get_courses_by_field200_response_courses_inner_filters_inner_dict = core_course_get_courses_by_field200_response_courses_inner_filters_inner_instance.to_dict()
# create an instance of CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner from a dict
core_course_get_courses_by_field200_response_courses_inner_filters_inner_from_dict = CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner.from_dict(core_course_get_courses_by_field200_response_courses_inner_filters_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


