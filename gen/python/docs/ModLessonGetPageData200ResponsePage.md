# ModLessonGetPageData200ResponsePage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contents** | **str** | The contents of this page | [optional] [default to 'null']
**contentsformat** | **int** | contents format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**display** | **int** | Used to record page specific display selections | [default to null]
**displayinmenublock** | **bool** | Toggles display in the left menu block | [default to False]
**id** | **int** | The id of this lesson page | [default to null]
**layout** | **int** | Used to record page specific layout selections | [default to null]
**lessonid** | **int** | The id of the lesson this page belongs to | [default to null]
**nextpageid** | **int** | The id of the next page in the page sequence | [default to null]
**prevpageid** | **int** | The id of the page before this one | [default to null]
**qoption** | **int** | Used to record page type specific options | [default to null]
**qtype** | **int** | Identifies the page type of this page | [default to null]
**timecreated** | **int** | Timestamp for when the page was created | [default to null]
**timemodified** | **int** | Timestamp for when the page was last modified | [default to null]
**title** | **str** | The title of this page | [optional] [default to 'null']
**type** | **int** | The type of the page [question | structure] | [default to null]
**typeid** | **int** | The unique identifier for the page type | [default to null]
**typestring** | **str** | The string that describes this page type | [default to 'null']

## Example

```python
from openapi_client.models.mod_lesson_get_page_data200_response_page import ModLessonGetPageData200ResponsePage

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetPageData200ResponsePage from a JSON string
mod_lesson_get_page_data200_response_page_instance = ModLessonGetPageData200ResponsePage.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetPageData200ResponsePage.to_json())

# convert the object into a dict
mod_lesson_get_page_data200_response_page_dict = mod_lesson_get_page_data200_response_page_instance.to_dict()
# create an instance of ModLessonGetPageData200ResponsePage from a dict
mod_lesson_get_page_data200_response_page_from_dict = ModLessonGetPageData200ResponsePage.from_dict(mod_lesson_get_page_data200_response_page_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


