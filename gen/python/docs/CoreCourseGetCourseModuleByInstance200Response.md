# CoreCourseGetCourseModuleByInstance200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cm** | [**CoreCourseGetCourseModuleByInstance200ResponseCm**](CoreCourseGetCourseModuleByInstance200ResponseCm.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_course_get_course_module_by_instance200_response import CoreCourseGetCourseModuleByInstance200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetCourseModuleByInstance200Response from a JSON string
core_course_get_course_module_by_instance200_response_instance = CoreCourseGetCourseModuleByInstance200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetCourseModuleByInstance200Response.to_json())

# convert the object into a dict
core_course_get_course_module_by_instance200_response_dict = core_course_get_course_module_by_instance200_response_instance.to_dict()
# create an instance of CoreCourseGetCourseModuleByInstance200Response from a dict
core_course_get_course_module_by_instance200_response_from_dict = CoreCourseGetCourseModuleByInstance200Response.from_dict(core_course_get_course_module_by_instance200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

