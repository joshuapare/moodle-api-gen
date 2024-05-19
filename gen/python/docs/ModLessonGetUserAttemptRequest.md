# ModLessonGetUserAttemptRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lessonattempt** | **int** | The attempt number. | [default to null]
**lessonid** | **int** | Lesson instance id. | 
**userid** | **int** | The user id. 0 for current user. | [default to null]

## Example

```python
from openapi_client.models.mod_lesson_get_user_attempt_request import ModLessonGetUserAttemptRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetUserAttemptRequest from a JSON string
mod_lesson_get_user_attempt_request_instance = ModLessonGetUserAttemptRequest.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetUserAttemptRequest.to_json())

# convert the object into a dict
mod_lesson_get_user_attempt_request_dict = mod_lesson_get_user_attempt_request_instance.to_dict()
# create an instance of ModLessonGetUserAttemptRequest from a dict
mod_lesson_get_user_attempt_request_from_dict = ModLessonGetUserAttemptRequest.from_dict(mod_lesson_get_user_attempt_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


