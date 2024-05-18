# ModLessonGetPages200ResponsePagesInner

The lesson pages

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answerids** | **List[object]** |  | [optional] 
**filescount** | **int** | The total number of files attached to the page | [optional] [default to null]
**filessizetotal** | **int** | The total size of the files | [optional] [default to null]
**jumps** | **List[object]** |  | [optional] 
**page** | [**ModLessonGetPages200ResponsePagesInnerPage**](ModLessonGetPages200ResponsePagesInnerPage.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_pages200_response_pages_inner import ModLessonGetPages200ResponsePagesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetPages200ResponsePagesInner from a JSON string
mod_lesson_get_pages200_response_pages_inner_instance = ModLessonGetPages200ResponsePagesInner.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetPages200ResponsePagesInner.to_json())

# convert the object into a dict
mod_lesson_get_pages200_response_pages_inner_dict = mod_lesson_get_pages200_response_pages_inner_instance.to_dict()
# create an instance of ModLessonGetPages200ResponsePagesInner from a dict
mod_lesson_get_pages200_response_pages_inner_from_dict = ModLessonGetPages200ResponsePagesInner.from_dict(mod_lesson_get_pages200_response_pages_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


