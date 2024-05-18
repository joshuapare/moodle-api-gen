# CoreCourseGetModuleRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | course module id | 
**sectionreturn** | **int** | section to return to | [optional] 

## Example

```python
from openapi_client.models.core_course_get_module_request import CoreCourseGetModuleRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetModuleRequest from a JSON string
core_course_get_module_request_instance = CoreCourseGetModuleRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetModuleRequest.to_json())

# convert the object into a dict
core_course_get_module_request_dict = core_course_get_module_request_instance.to_dict()
# create an instance of CoreCourseGetModuleRequest from a dict
core_course_get_module_request_from_dict = CoreCourseGetModuleRequest.from_dict(core_course_get_module_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


