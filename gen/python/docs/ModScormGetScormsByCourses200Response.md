# ModScormGetScormsByCourses200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**options** | [**List[ModScormGetScormsByCourses200ResponseOptionsInner]**](ModScormGetScormsByCourses200ResponseOptionsInner.md) |  | [optional] 
**scorms** | [**List[ModScormGetScormsByCourses200ResponseScormsInner]**](ModScormGetScormsByCourses200ResponseScormsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_scorm_get_scorms_by_courses200_response import ModScormGetScormsByCourses200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModScormGetScormsByCourses200Response from a JSON string
mod_scorm_get_scorms_by_courses200_response_instance = ModScormGetScormsByCourses200Response.from_json(json)
# print the JSON string representation of the object
print(ModScormGetScormsByCourses200Response.to_json())

# convert the object into a dict
mod_scorm_get_scorms_by_courses200_response_dict = mod_scorm_get_scorms_by_courses200_response_instance.to_dict()
# create an instance of ModScormGetScormsByCourses200Response from a dict
mod_scorm_get_scorms_by_courses200_response_from_dict = ModScormGetScormsByCourses200Response.from_dict(mod_scorm_get_scorms_by_courses200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


