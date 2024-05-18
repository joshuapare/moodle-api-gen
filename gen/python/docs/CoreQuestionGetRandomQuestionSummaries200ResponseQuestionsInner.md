# CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **int** | category | [optional] [default to null]
**icon** | [**CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon**](CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon.md) |  | [optional] 
**id** | **int** | id | [optional] 
**name** | **str** | name | [optional] 
**parent** | **int** | parent | [optional] 
**qtype** | **str** | qtype | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_question_get_random_question_summaries200_response_questions_inner import CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner from a JSON string
core_question_get_random_question_summaries200_response_questions_inner_instance = CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner.from_json(json)
# print the JSON string representation of the object
print(CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner.to_json())

# convert the object into a dict
core_question_get_random_question_summaries200_response_questions_inner_dict = core_question_get_random_question_summaries200_response_questions_inner_instance.to_dict()
# create an instance of CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner from a dict
core_question_get_random_question_summaries200_response_questions_inner_from_dict = CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner.from_dict(core_question_get_random_question_summaries200_response_questions_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


