# ModQuizGetAttemptReview200ResponseQuestionsInner

The question data. Some fields may not be returned depending on the quiz display settings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockedbyprevious** | **bool** | whether the question is blocked by the previous question | [optional] 
**flagged** | **bool** | whether the question is flagged or not | [optional] 
**hasautosavedstep** | **bool** | whether this question attempt has autosaved data | [optional] 
**html** | **str** | the question rendered | [optional] 
**lastactiontime** | **int** | the timestamp of the most recent step in this question attempt | [optional] 
**mark** | **str** | the mark awarded.                     It will be returned only if the user is allowed to see it. | [optional] 
**maxmark** | **float** | the maximum mark possible for this question attempt.                     It will be returned only if the user is allowed to see it. | [optional] 
**number** | **int** | DO NOT USE. Use questionnumber. Only retained for backwards compatibility. | [optional] 
**page** | **int** | page of the quiz this question appears on | [optional] 
**questionnumber** | **str** | The question number to display for this question, e.g. \&quot;7\&quot;, \&quot;i\&quot; or \&quot;Custom-B)\&quot;. | [optional] 
**responsefileareas** | [**List[ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner]**](ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner.md) |  | [optional] 
**sequencecheck** | **int** | the number of real steps in this attempt | [optional] 
**settings** | **str** | Question settings (JSON encoded). | [optional] 
**slot** | **int** | slot number | [optional] 
**state** | **str** | the state where the question is in.                     It will not be returned if the user cannot see it due to the quiz display correctness settings. | [optional] 
**status** | **str** | current formatted state of the question | [optional] 
**type** | **str** | question type, i.e: multichoice | [optional] 

## Example

```python
from openapi_client.models.mod_quiz_get_attempt_review200_response_questions_inner import ModQuizGetAttemptReview200ResponseQuestionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetAttemptReview200ResponseQuestionsInner from a JSON string
mod_quiz_get_attempt_review200_response_questions_inner_instance = ModQuizGetAttemptReview200ResponseQuestionsInner.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetAttemptReview200ResponseQuestionsInner.to_json())

# convert the object into a dict
mod_quiz_get_attempt_review200_response_questions_inner_dict = mod_quiz_get_attempt_review200_response_questions_inner_instance.to_dict()
# create an instance of ModQuizGetAttemptReview200ResponseQuestionsInner from a dict
mod_quiz_get_attempt_review200_response_questions_inner_from_dict = ModQuizGetAttemptReview200ResponseQuestionsInner.from_dict(mod_quiz_get_attempt_review200_response_questions_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


