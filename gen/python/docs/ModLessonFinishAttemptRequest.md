# ModLessonFinishAttemptRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lessonid** | **int** | Lesson instance id. | [default to null]
**outoftime** | **bool** | If the user run out of time. | [optional] [default to False]
**password** | **str** | Optional password (the lesson may be protected). | [optional] [default to '']
**review** | **bool** | If we want to review just after finishing (1 hour margin). | [optional] [default to False]

## Example

```python
from openapi_client.models.mod_lesson_finish_attempt_request import ModLessonFinishAttemptRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonFinishAttemptRequest from a JSON string
mod_lesson_finish_attempt_request_instance = ModLessonFinishAttemptRequest.from_json(json)
# print the JSON string representation of the object
print(ModLessonFinishAttemptRequest.to_json())

# convert the object into a dict
mod_lesson_finish_attempt_request_dict = mod_lesson_finish_attempt_request_instance.to_dict()
# create an instance of ModLessonFinishAttemptRequest from a dict
mod_lesson_finish_attempt_request_from_dict = ModLessonFinishAttemptRequest.from_dict(mod_lesson_finish_attempt_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


