# ModLessonGetContentPagesViewed200ResponsePagesInner

The content pages viewed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flag** | **int** | 1 if the next page was calculated randomly. | [optional] [default to null]
**id** | **int** | The attempt id. | [optional] [default to null]
**lessonid** | **int** | The lesson id. | [optional] [default to null]
**nextpageid** | **int** | The next page chosen id. | [optional] [default to null]
**pageid** | **int** | The page id. | [optional] [default to null]
**retry** | **int** | The lesson attempt number. | [optional] [default to null]
**timeseen** | **int** | The time the page was seen. | [optional] [default to null]
**userid** | **int** | The user who viewed the page. | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_lesson_get_content_pages_viewed200_response_pages_inner import ModLessonGetContentPagesViewed200ResponsePagesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetContentPagesViewed200ResponsePagesInner from a JSON string
mod_lesson_get_content_pages_viewed200_response_pages_inner_instance = ModLessonGetContentPagesViewed200ResponsePagesInner.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetContentPagesViewed200ResponsePagesInner.to_json())

# convert the object into a dict
mod_lesson_get_content_pages_viewed200_response_pages_inner_dict = mod_lesson_get_content_pages_viewed200_response_pages_inner_instance.to_dict()
# create an instance of ModLessonGetContentPagesViewed200ResponsePagesInner from a dict
mod_lesson_get_content_pages_viewed200_response_pages_inner_from_dict = ModLessonGetContentPagesViewed200ResponsePagesInner.from_dict(mod_lesson_get_content_pages_viewed200_response_pages_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


