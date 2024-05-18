# CoreCourseGetUpdatesSinceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course id to check | 
**filter** | **List[object]** |  | [optional] 
**since** | **int** | Check updates since this time stamp | 

## Example

```python
from openapi_client.models.core_course_get_updates_since_request import CoreCourseGetUpdatesSinceRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetUpdatesSinceRequest from a JSON string
core_course_get_updates_since_request_instance = CoreCourseGetUpdatesSinceRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetUpdatesSinceRequest.to_json())

# convert the object into a dict
core_course_get_updates_since_request_dict = core_course_get_updates_since_request_instance.to_dict()
# create an instance of CoreCourseGetUpdatesSinceRequest from a dict
core_course_get_updates_since_request_from_dict = CoreCourseGetUpdatesSinceRequest.from_dict(core_course_get_updates_since_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


