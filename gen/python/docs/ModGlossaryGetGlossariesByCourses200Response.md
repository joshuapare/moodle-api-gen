# ModGlossaryGetGlossariesByCourses200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**glossaries** | [**List[ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner]**](ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_glossary_get_glossaries_by_courses200_response import ModGlossaryGetGlossariesByCourses200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetGlossariesByCourses200Response from a JSON string
mod_glossary_get_glossaries_by_courses200_response_instance = ModGlossaryGetGlossariesByCourses200Response.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetGlossariesByCourses200Response.to_json())

# convert the object into a dict
mod_glossary_get_glossaries_by_courses200_response_dict = mod_glossary_get_glossaries_by_courses200_response_instance.to_dict()
# create an instance of ModGlossaryGetGlossariesByCourses200Response from a dict
mod_glossary_get_glossaries_by_courses200_response_from_dict = ModGlossaryGetGlossariesByCourses200Response.from_dict(mod_glossary_get_glossaries_by_courses200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


