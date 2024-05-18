# CoreCourseCheckUpdatesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course id to check | [default to null]
**filter** | **List[object]** |  | [optional] 
**tocheck** | [**List[CoreCourseCheckUpdatesRequestTocheckInner]**](CoreCourseCheckUpdatesRequestTocheckInner.md) |  | 

## Example

```python
from openapi_client.models.core_course_check_updates_request import CoreCourseCheckUpdatesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseCheckUpdatesRequest from a JSON string
core_course_check_updates_request_instance = CoreCourseCheckUpdatesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseCheckUpdatesRequest.to_json())

# convert the object into a dict
core_course_check_updates_request_dict = core_course_check_updates_request_instance.to_dict()
# create an instance of CoreCourseCheckUpdatesRequest from a dict
core_course_check_updates_request_from_dict = CoreCourseCheckUpdatesRequest.from_dict(core_course_check_updates_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


