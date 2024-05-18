# CoreCourseGetUpdatesSince200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instances** | [**List[CoreCourseGetUpdatesSince200ResponseInstancesInner]**](CoreCourseGetUpdatesSince200ResponseInstancesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_course_get_updates_since200_response import CoreCourseGetUpdatesSince200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetUpdatesSince200Response from a JSON string
core_course_get_updates_since200_response_instance = CoreCourseGetUpdatesSince200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetUpdatesSince200Response.to_json())

# convert the object into a dict
core_course_get_updates_since200_response_dict = core_course_get_updates_since200_response_instance.to_dict()
# create an instance of CoreCourseGetUpdatesSince200Response from a dict
core_course_get_updates_since200_response_from_dict = CoreCourseGetUpdatesSince200Response.from_dict(core_course_get_updates_since200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


