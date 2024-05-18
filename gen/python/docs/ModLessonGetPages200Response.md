# ModLessonGetPages200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pages** | [**List[ModLessonGetPages200ResponsePagesInner]**](ModLessonGetPages200ResponsePagesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_pages200_response import ModLessonGetPages200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetPages200Response from a JSON string
mod_lesson_get_pages200_response_instance = ModLessonGetPages200Response.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetPages200Response.to_json())

# convert the object into a dict
mod_lesson_get_pages200_response_dict = mod_lesson_get_pages200_response_instance.to_dict()
# create an instance of ModLessonGetPages200Response from a dict
mod_lesson_get_pages200_response_from_dict = ModLessonGetPages200Response.from_dict(mod_lesson_get_pages200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

