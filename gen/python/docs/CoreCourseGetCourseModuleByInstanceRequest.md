# CoreCourseGetCourseModuleByInstanceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instance** | **int** | The module instance id | [default to null]
**module** | **str** | The module name | [default to 'null']

## Example

```python
from openapi_client.models.core_course_get_course_module_by_instance_request import CoreCourseGetCourseModuleByInstanceRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetCourseModuleByInstanceRequest from a JSON string
core_course_get_course_module_by_instance_request_instance = CoreCourseGetCourseModuleByInstanceRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetCourseModuleByInstanceRequest.to_json())

# convert the object into a dict
core_course_get_course_module_by_instance_request_dict = core_course_get_course_module_by_instance_request_instance.to_dict()
# create an instance of CoreCourseGetCourseModuleByInstanceRequest from a dict
core_course_get_course_module_by_instance_request_from_dict = CoreCourseGetCourseModuleByInstanceRequest.from_dict(core_course_get_course_module_by_instance_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


