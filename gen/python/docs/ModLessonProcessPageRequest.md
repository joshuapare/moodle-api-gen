# ModLessonProcessPageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[ModLessonProcessPageRequestDataInner]**](ModLessonProcessPageRequestDataInner.md) |  | 
**lessonid** | **int** | lesson instance id | 
**pageid** | **int** | the page id | 
**password** | **str** | optional password (the lesson may be protected) | [optional] [default to '']
**review** | **bool** | if we want to review just after finishing (1 hour margin) | [optional] [default to False]

## Example

```python
from openapi_client.models.mod_lesson_process_page_request import ModLessonProcessPageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonProcessPageRequest from a JSON string
mod_lesson_process_page_request_instance = ModLessonProcessPageRequest.from_json(json)
# print the JSON string representation of the object
print(ModLessonProcessPageRequest.to_json())

# convert the object into a dict
mod_lesson_process_page_request_dict = mod_lesson_process_page_request_instance.to_dict()
# create an instance of ModLessonProcessPageRequest from a dict
mod_lesson_process_page_request_from_dict = ModLessonProcessPageRequest.from_dict(mod_lesson_process_page_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


