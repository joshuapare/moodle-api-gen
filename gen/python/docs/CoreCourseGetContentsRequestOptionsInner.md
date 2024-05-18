# CoreCourseGetContentsRequestOptionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The expected keys (value format) are:                                                 excludemodules (bool) Do not return modules, return only the sections structure                                                 excludecontents (bool) Do not return module contents (i.e: files inside a resource)                                                 includestealthmodules (bool) Return stealth modules for students in a special                                                     section (with id -1)                                                 sectionid (int) Return only this section                                                 sectionnumber (int) Return only this section with number (order)                                                 cmid (int) Return only this module information (among the whole sections structure)                                                 modname (string) Return only modules with this name \&quot;label, forum, etc...\&quot;                                                 modid (int) Return only the module with this id (to be used with modname | [optional] [default to 'null']
**value** | **str** | the value of the option,                                                                     this param is personaly validated in the external function. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_course_get_contents_request_options_inner import CoreCourseGetContentsRequestOptionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetContentsRequestOptionsInner from a JSON string
core_course_get_contents_request_options_inner_instance = CoreCourseGetContentsRequestOptionsInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetContentsRequestOptionsInner.to_json())

# convert the object into a dict
core_course_get_contents_request_options_inner_dict = core_course_get_contents_request_options_inner_instance.to_dict()
# create an instance of CoreCourseGetContentsRequestOptionsInner from a dict
core_course_get_contents_request_options_inner_from_dict = CoreCourseGetContentsRequestOptionsInner.from_dict(core_course_get_contents_request_options_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


