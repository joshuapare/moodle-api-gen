# ModQuizGetQuizFeedbackForGradeRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grade** | **float** | the grade to check | [default to null]
**quizid** | **int** | quiz instance id | 

## Example

```python
from openapi_client.models.mod_quiz_get_quiz_feedback_for_grade_request import ModQuizGetQuizFeedbackForGradeRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetQuizFeedbackForGradeRequest from a JSON string
mod_quiz_get_quiz_feedback_for_grade_request_instance = ModQuizGetQuizFeedbackForGradeRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetQuizFeedbackForGradeRequest.to_json())

# convert the object into a dict
mod_quiz_get_quiz_feedback_for_grade_request_dict = mod_quiz_get_quiz_feedback_for_grade_request_instance.to_dict()
# create an instance of ModQuizGetQuizFeedbackForGradeRequest from a dict
mod_quiz_get_quiz_feedback_for_grade_request_from_dict = ModQuizGetQuizFeedbackForGradeRequest.from_dict(mod_quiz_get_quiz_feedback_for_grade_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


