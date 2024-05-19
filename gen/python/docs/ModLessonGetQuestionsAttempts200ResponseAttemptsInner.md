# ModLessonGetQuestionsAttempts200ResponseAttemptsInner

The question page attempts

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answerid** | **int** | The attempt answerid | [optional] [default to null]
**correct** | **int** | If it was the correct answer | [optional] [default to null]
**id** | **int** | The attempt id | [optional] 
**lessonid** | **int** | The attempt lessonid | [optional] [default to null]
**pageid** | **int** | The attempt pageid | [optional] [default to null]
**retry** | **int** | The lesson attempt number | [optional] [default to null]
**timeseen** | **int** | The time the question was seen | [optional] [default to null]
**useranswer** | **str** | The complete user answer | [optional] [default to 'null']
**userid** | **int** | The user who did the attempt | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_lesson_get_questions_attempts200_response_attempts_inner import ModLessonGetQuestionsAttempts200ResponseAttemptsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetQuestionsAttempts200ResponseAttemptsInner from a JSON string
mod_lesson_get_questions_attempts200_response_attempts_inner_instance = ModLessonGetQuestionsAttempts200ResponseAttemptsInner.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetQuestionsAttempts200ResponseAttemptsInner.to_json())

# convert the object into a dict
mod_lesson_get_questions_attempts200_response_attempts_inner_dict = mod_lesson_get_questions_attempts200_response_attempts_inner_instance.to_dict()
# create an instance of ModLessonGetQuestionsAttempts200ResponseAttemptsInner from a dict
mod_lesson_get_questions_attempts200_response_attempts_inner_from_dict = ModLessonGetQuestionsAttempts200ResponseAttemptsInner.from_dict(mod_lesson_get_questions_attempts200_response_attempts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


