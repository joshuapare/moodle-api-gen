# CoreCourseCheckUpdatesRequestTocheckInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextlevel** | **str** | The context level for the file location.                                                                                 Only module supported right now. | [optional] [default to 'null']
**id** | **int** | Context instance id | [optional] [default to null]
**since** | **int** | Check updates since this time stamp | [optional] [default to null]

## Example

```python
from openapi_client.models.core_course_check_updates_request_tocheck_inner import CoreCourseCheckUpdatesRequestTocheckInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseCheckUpdatesRequestTocheckInner from a JSON string
core_course_check_updates_request_tocheck_inner_instance = CoreCourseCheckUpdatesRequestTocheckInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseCheckUpdatesRequestTocheckInner.to_json())

# convert the object into a dict
core_course_check_updates_request_tocheck_inner_dict = core_course_check_updates_request_tocheck_inner_instance.to_dict()
# create an instance of CoreCourseCheckUpdatesRequestTocheckInner from a dict
core_course_check_updates_request_tocheck_inner_from_dict = CoreCourseCheckUpdatesRequestTocheckInner.from_dict(core_course_check_updates_request_tocheck_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


