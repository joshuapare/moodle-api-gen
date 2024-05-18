# CoreCourseCheckUpdates200ResponseInstancesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextlevel** | **str** | The context level | [optional] 
**id** | **int** | Instance id | [optional] [default to null]
**updates** | [**List[CoreCourseCheckUpdates200ResponseInstancesInnerUpdatesInner]**](CoreCourseCheckUpdates200ResponseInstancesInnerUpdatesInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_course_check_updates200_response_instances_inner import CoreCourseCheckUpdates200ResponseInstancesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseCheckUpdates200ResponseInstancesInner from a JSON string
core_course_check_updates200_response_instances_inner_instance = CoreCourseCheckUpdates200ResponseInstancesInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseCheckUpdates200ResponseInstancesInner.to_json())

# convert the object into a dict
core_course_check_updates200_response_instances_inner_dict = core_course_check_updates200_response_instances_inner_instance.to_dict()
# create an instance of CoreCourseCheckUpdates200ResponseInstancesInner from a dict
core_course_check_updates200_response_instances_inner_from_dict = CoreCourseCheckUpdates200ResponseInstancesInner.from_dict(core_course_check_updates200_response_instances_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


