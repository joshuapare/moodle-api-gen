# ModLessonGetUserAttemptGradeRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lessonattempt** | **int** | lesson attempt number | 
**lessonid** | **int** | lesson instance id | 
**userid** | **int** | the user id (empty for current user) | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_user_attempt_grade_request import ModLessonGetUserAttemptGradeRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetUserAttemptGradeRequest from a JSON string
mod_lesson_get_user_attempt_grade_request_instance = ModLessonGetUserAttemptGradeRequest.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetUserAttemptGradeRequest.to_json())

# convert the object into a dict
mod_lesson_get_user_attempt_grade_request_dict = mod_lesson_get_user_attempt_grade_request_instance.to_dict()
# create an instance of ModLessonGetUserAttemptGradeRequest from a dict
mod_lesson_get_user_attempt_grade_request_from_dict = ModLessonGetUserAttemptGradeRequest.from_dict(mod_lesson_get_user_attempt_grade_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


