# ModLessonGetQuestionsAttemptsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempt** | **int** | lesson attempt number | 
**correct** | **bool** | only fetch correct attempts | [optional] [default to False]
**lessonid** | **int** | lesson instance id | 
**pageid** | **int** | only fetch attempts at the given page | [optional] [default to null]
**userid** | **int** | only fetch attempts of the given user | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_lesson_get_questions_attempts_request import ModLessonGetQuestionsAttemptsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetQuestionsAttemptsRequest from a JSON string
mod_lesson_get_questions_attempts_request_instance = ModLessonGetQuestionsAttemptsRequest.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetQuestionsAttemptsRequest.to_json())

# convert the object into a dict
mod_lesson_get_questions_attempts_request_dict = mod_lesson_get_questions_attempts_request_instance.to_dict()
# create an instance of ModLessonGetQuestionsAttemptsRequest from a dict
mod_lesson_get_questions_attempts_request_from_dict = ModLessonGetQuestionsAttemptsRequest.from_dict(mod_lesson_get_questions_attempts_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


