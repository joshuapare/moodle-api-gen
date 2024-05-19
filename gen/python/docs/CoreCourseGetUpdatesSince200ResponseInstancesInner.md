# CoreCourseGetUpdatesSince200ResponseInstancesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextlevel** | **str** | The context level | [optional] 
**id** | **int** | Instance id | [optional] 
**updates** | [**List[CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner]**](CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_course_get_updates_since200_response_instances_inner import CoreCourseGetUpdatesSince200ResponseInstancesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetUpdatesSince200ResponseInstancesInner from a JSON string
core_course_get_updates_since200_response_instances_inner_instance = CoreCourseGetUpdatesSince200ResponseInstancesInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetUpdatesSince200ResponseInstancesInner.to_json())

# convert the object into a dict
core_course_get_updates_since200_response_instances_inner_dict = core_course_get_updates_since200_response_instances_inner_instance.to_dict()
# create an instance of CoreCourseGetUpdatesSince200ResponseInstancesInner from a dict
core_course_get_updates_since200_response_instances_inner_from_dict = CoreCourseGetUpdatesSince200ResponseInstancesInner.from_dict(core_course_get_updates_since200_response_instances_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


