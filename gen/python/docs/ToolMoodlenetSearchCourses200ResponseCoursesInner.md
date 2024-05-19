# ToolMoodlenetSearchCourses200ResponseCoursesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coursecategory** | **str** | Category name | [optional] [default to 'null']
**courseimage** | **str** | course image | [optional] [default to 'null']
**fullname** | **str** | course full name | [optional] 
**hidden** | **int** | is the course visible | [optional] [default to null]
**id** | **int** | course id | [optional] 
**viewurl** | **str** | Next step of import | [optional] [default to 'null']

## Example

```python
from openapi_client.models.tool_moodlenet_search_courses200_response_courses_inner import ToolMoodlenetSearchCourses200ResponseCoursesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMoodlenetSearchCourses200ResponseCoursesInner from a JSON string
tool_moodlenet_search_courses200_response_courses_inner_instance = ToolMoodlenetSearchCourses200ResponseCoursesInner.from_json(json)
# print the JSON string representation of the object
print(ToolMoodlenetSearchCourses200ResponseCoursesInner.to_json())

# convert the object into a dict
tool_moodlenet_search_courses200_response_courses_inner_dict = tool_moodlenet_search_courses200_response_courses_inner_instance.to_dict()
# create an instance of ToolMoodlenetSearchCourses200ResponseCoursesInner from a dict
tool_moodlenet_search_courses200_response_courses_inner_from_dict = ToolMoodlenetSearchCourses200ResponseCoursesInner.from_dict(tool_moodlenet_search_courses200_response_courses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


