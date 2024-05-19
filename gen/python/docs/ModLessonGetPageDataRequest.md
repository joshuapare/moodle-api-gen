# ModLessonGetPageDataRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lessonid** | **int** | lesson instance id | 
**pageid** | **int** | the page id | [default to null]
**password** | **str** | optional password (the lesson may be protected) | [optional] [default to '']
**returncontents** | **bool** | if we must return the complete page contents once rendered | [optional] [default to False]
**review** | **bool** | if we want to review just after finishing (1 hour margin) | [optional] [default to False]

## Example

```python
from openapi_client.models.mod_lesson_get_page_data_request import ModLessonGetPageDataRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetPageDataRequest from a JSON string
mod_lesson_get_page_data_request_instance = ModLessonGetPageDataRequest.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetPageDataRequest.to_json())

# convert the object into a dict
mod_lesson_get_page_data_request_dict = mod_lesson_get_page_data_request_instance.to_dict()
# create an instance of ModLessonGetPageDataRequest from a dict
mod_lesson_get_page_data_request_from_dict = ModLessonGetPageDataRequest.from_dict(mod_lesson_get_page_data_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


