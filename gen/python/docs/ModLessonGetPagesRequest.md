# ModLessonGetPagesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lessonid** | **int** | lesson instance id | 
**password** | **str** | optional password (the lesson may be protected) | [optional] [default to '']

## Example

```python
from openapi_client.models.mod_lesson_get_pages_request import ModLessonGetPagesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetPagesRequest from a JSON string
mod_lesson_get_pages_request_instance = ModLessonGetPagesRequest.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetPagesRequest.to_json())

# convert the object into a dict
mod_lesson_get_pages_request_dict = mod_lesson_get_pages_request_instance.to_dict()
# create an instance of ModLessonGetPagesRequest from a dict
mod_lesson_get_pages_request_from_dict = ModLessonGetPagesRequest.from_dict(mod_lesson_get_pages_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


