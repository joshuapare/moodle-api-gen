# ModLessonGetLessonRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lessonid** | **int** | lesson instance id | 
**password** | **str** | lesson password | [optional] [default to '']

## Example

```python
from openapi_client.models.mod_lesson_get_lesson_request import ModLessonGetLessonRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetLessonRequest from a JSON string
mod_lesson_get_lesson_request_instance = ModLessonGetLessonRequest.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetLessonRequest.to_json())

# convert the object into a dict
mod_lesson_get_lesson_request_dict = mod_lesson_get_lesson_request_instance.to_dict()
# create an instance of ModLessonGetLessonRequest from a dict
mod_lesson_get_lesson_request_from_dict = ModLessonGetLessonRequest.from_dict(mod_lesson_get_lesson_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


