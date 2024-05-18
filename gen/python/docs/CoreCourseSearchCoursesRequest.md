# CoreCourseSearchCoursesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**criterianame** | **str** | criteria name                                                         (search, modulelist (only admins), blocklist (only admins), tagid) | [default to 'null']
**criteriavalue** | **str** | criteria value | [default to 'null']
**limittoenrolled** | **bool** | limit to enrolled courses | [optional] [default to False]
**onlywithcompletion** | **bool** | limit to courses where completion is enabled | [optional] [default to False]
**page** | **int** | page number (0 based) | [optional] [default to 0]
**perpage** | **int** | items per page | [optional] [default to 0]
**requiredcapabilities** | **List[object]** |  | [optional] 

## Example

```python
from openapi_client.models.core_course_search_courses_request import CoreCourseSearchCoursesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseSearchCoursesRequest from a JSON string
core_course_search_courses_request_instance = CoreCourseSearchCoursesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseSearchCoursesRequest.to_json())

# convert the object into a dict
core_course_search_courses_request_dict = core_course_search_courses_request_instance.to_dict()
# create an instance of CoreCourseSearchCoursesRequest from a dict
core_course_search_courses_request_from_dict = CoreCourseSearchCoursesRequest.from_dict(core_course_search_courses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


