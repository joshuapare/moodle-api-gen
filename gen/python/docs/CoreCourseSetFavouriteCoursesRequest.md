# CoreCourseSetFavouriteCoursesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courses** | [**List[CoreCourseSetFavouriteCoursesRequestCoursesInner]**](CoreCourseSetFavouriteCoursesRequestCoursesInner.md) |  | 

## Example

```python
from openapi_client.models.core_course_set_favourite_courses_request import CoreCourseSetFavouriteCoursesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseSetFavouriteCoursesRequest from a JSON string
core_course_set_favourite_courses_request_instance = CoreCourseSetFavouriteCoursesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseSetFavouriteCoursesRequest.to_json())

# convert the object into a dict
core_course_set_favourite_courses_request_dict = core_course_set_favourite_courses_request_instance.to_dict()
# create an instance of CoreCourseSetFavouriteCoursesRequest from a dict
core_course_set_favourite_courses_request_from_dict = CoreCourseSetFavouriteCoursesRequest.from_dict(core_course_set_favourite_courses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


