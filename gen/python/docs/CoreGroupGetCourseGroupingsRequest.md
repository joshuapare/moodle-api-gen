# CoreGroupGetCourseGroupingsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | id of course | 

## Example

```python
from openapi_client.models.core_group_get_course_groupings_request import CoreGroupGetCourseGroupingsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupGetCourseGroupingsRequest from a JSON string
core_group_get_course_groupings_request_instance = CoreGroupGetCourseGroupingsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGroupGetCourseGroupingsRequest.to_json())

# convert the object into a dict
core_group_get_course_groupings_request_dict = core_group_get_course_groupings_request_instance.to_dict()
# create an instance of CoreGroupGetCourseGroupingsRequest from a dict
core_group_get_course_groupings_request_from_dict = CoreGroupGetCourseGroupingsRequest.from_dict(core_group_get_course_groupings_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


