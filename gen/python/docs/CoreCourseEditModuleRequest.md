# CoreCourseEditModuleRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** | action: hide, show, stealth, duplicate, delete, moveleft, moveright, group... | [default to 'null']
**id** | **int** | course module id | 
**sectionreturn** | **int** | section to return to | [optional] [default to null]

## Example

```python
from openapi_client.models.core_course_edit_module_request import CoreCourseEditModuleRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseEditModuleRequest from a JSON string
core_course_edit_module_request_instance = CoreCourseEditModuleRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseEditModuleRequest.to_json())

# convert the object into a dict
core_course_edit_module_request_dict = core_course_edit_module_request_instance.to_dict()
# create an instance of CoreCourseEditModuleRequest from a dict
core_course_edit_module_request_from_dict = CoreCourseEditModuleRequest.from_dict(core_course_edit_module_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


