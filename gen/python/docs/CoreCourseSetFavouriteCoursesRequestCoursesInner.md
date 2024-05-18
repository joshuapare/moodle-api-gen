# CoreCourseSetFavouriteCoursesRequestCoursesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**favourite** | **bool** | favourite status | [optional] [default to False]
**id** | **int** | course ID | [optional] [default to null]

## Example

```python
from openapi_client.models.core_course_set_favourite_courses_request_courses_inner import CoreCourseSetFavouriteCoursesRequestCoursesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseSetFavouriteCoursesRequestCoursesInner from a JSON string
core_course_set_favourite_courses_request_courses_inner_instance = CoreCourseSetFavouriteCoursesRequestCoursesInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseSetFavouriteCoursesRequestCoursesInner.to_json())

# convert the object into a dict
core_course_set_favourite_courses_request_courses_inner_dict = core_course_set_favourite_courses_request_courses_inner_instance.to_dict()
# create an instance of CoreCourseSetFavouriteCoursesRequestCoursesInner from a dict
core_course_set_favourite_courses_request_courses_inner_from_dict = CoreCourseSetFavouriteCoursesRequestCoursesInner.from_dict(core_course_set_favourite_courses_request_courses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


