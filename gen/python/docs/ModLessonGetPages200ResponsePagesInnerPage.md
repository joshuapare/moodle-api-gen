# ModLessonGetPages200ResponsePagesInnerPage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contents** | **str** | The contents of this page | [optional] 
**contentsformat** | **int** | contents format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**display** | **int** | Used to record page specific display selections | 
**displayinmenublock** | **bool** | Toggles display in the left menu block | 
**id** | **int** | The id of this lesson page | 
**layout** | **int** | Used to record page specific layout selections | 
**lessonid** | **int** | The id of the lesson this page belongs to | 
**nextpageid** | **int** | The id of the next page in the page sequence | 
**prevpageid** | **int** | The id of the page before this one | 
**qoption** | **int** | Used to record page type specific options | 
**qtype** | **int** | Identifies the page type of this page | 
**timecreated** | **int** | Timestamp for when the page was created | 
**timemodified** | **int** | Timestamp for when the page was last modified | 
**title** | **str** | The title of this page | [optional] 
**type** | **int** | The type of the page [question | structure] | 
**typeid** | **int** | The unique identifier for the page type | 
**typestring** | **str** | The string that describes this page type | 

## Example

```python
from openapi_client.models.mod_lesson_get_pages200_response_pages_inner_page import ModLessonGetPages200ResponsePagesInnerPage

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetPages200ResponsePagesInnerPage from a JSON string
mod_lesson_get_pages200_response_pages_inner_page_instance = ModLessonGetPages200ResponsePagesInnerPage.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetPages200ResponsePagesInnerPage.to_json())

# convert the object into a dict
mod_lesson_get_pages200_response_pages_inner_page_dict = mod_lesson_get_pages200_response_pages_inner_page_instance.to_dict()
# create an instance of ModLessonGetPages200ResponsePagesInnerPage from a dict
mod_lesson_get_pages200_response_pages_inner_page_from_dict = ModLessonGetPages200ResponsePagesInnerPage.from_dict(mod_lesson_get_pages200_response_pages_inner_page_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


