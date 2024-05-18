# ModLessonGetContentPagesViewed200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pages** | [**List[ModLessonGetContentPagesViewed200ResponsePagesInner]**](ModLessonGetContentPagesViewed200ResponsePagesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_content_pages_viewed200_response import ModLessonGetContentPagesViewed200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetContentPagesViewed200Response from a JSON string
mod_lesson_get_content_pages_viewed200_response_instance = ModLessonGetContentPagesViewed200Response.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetContentPagesViewed200Response.to_json())

# convert the object into a dict
mod_lesson_get_content_pages_viewed200_response_dict = mod_lesson_get_content_pages_viewed200_response_instance.to_dict()
# create an instance of ModLessonGetContentPagesViewed200Response from a dict
mod_lesson_get_content_pages_viewed200_response_from_dict = ModLessonGetContentPagesViewed200Response.from_dict(mod_lesson_get_content_pages_viewed200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


