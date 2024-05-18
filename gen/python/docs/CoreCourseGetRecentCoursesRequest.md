# CoreCourseGetRecentCoursesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit** | **int** | result set limit | [optional] [default to 0]
**offset** | **int** | Result set offset | [optional] [default to 0]
**sort** | **str** | Sort string | [optional] 
**userid** | **int** | id of the user, default to current user | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_course_get_recent_courses_request import CoreCourseGetRecentCoursesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetRecentCoursesRequest from a JSON string
core_course_get_recent_courses_request_instance = CoreCourseGetRecentCoursesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetRecentCoursesRequest.to_json())

# convert the object into a dict
core_course_get_recent_courses_request_dict = core_course_get_recent_courses_request_instance.to_dict()
# create an instance of CoreCourseGetRecentCoursesRequest from a dict
core_course_get_recent_courses_request_from_dict = CoreCourseGetRecentCoursesRequest.from_dict(core_course_get_recent_courses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


