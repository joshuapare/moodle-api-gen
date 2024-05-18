# ModLessonGetContentPagesViewedRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lessonattempt** | **int** | lesson attempt number | [default to null]
**lessonid** | **int** | lesson instance id | 
**userid** | **int** | the user id (empty for current user) | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_lesson_get_content_pages_viewed_request import ModLessonGetContentPagesViewedRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetContentPagesViewedRequest from a JSON string
mod_lesson_get_content_pages_viewed_request_instance = ModLessonGetContentPagesViewedRequest.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetContentPagesViewedRequest.to_json())

# convert the object into a dict
mod_lesson_get_content_pages_viewed_request_dict = mod_lesson_get_content_pages_viewed_request_instance.to_dict()
# create an instance of ModLessonGetContentPagesViewedRequest from a dict
mod_lesson_get_content_pages_viewed_request_from_dict = ModLessonGetContentPagesViewedRequest.from_dict(mod_lesson_get_content_pages_viewed_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


