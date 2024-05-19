# ModSurveyGetQuestions200ResponseQuestionsInner

Questions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Question id | [optional] [default to null]
**intro** | **str** | The question intro | [optional] [default to 'null']
**multi** | **str** | Subquestions ids | [optional] [default to 'null']
**options** | **str** | Question options | [optional] [default to 'null']
**parent** | **int** | Parent question (for subquestions) | [optional] [default to null]
**shorttext** | **str** | Question short text | [optional] [default to 'null']
**text** | **str** | Question text | [optional] [default to 'null']
**type** | **int** | Question type | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_survey_get_questions200_response_questions_inner import ModSurveyGetQuestions200ResponseQuestionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModSurveyGetQuestions200ResponseQuestionsInner from a JSON string
mod_survey_get_questions200_response_questions_inner_instance = ModSurveyGetQuestions200ResponseQuestionsInner.from_json(json)
# print the JSON string representation of the object
print(ModSurveyGetQuestions200ResponseQuestionsInner.to_json())

# convert the object into a dict
mod_survey_get_questions200_response_questions_inner_dict = mod_survey_get_questions200_response_questions_inner_instance.to_dict()
# create an instance of ModSurveyGetQuestions200ResponseQuestionsInner from a dict
mod_survey_get_questions200_response_questions_inner_from_dict = ModSurveyGetQuestions200ResponseQuestionsInner.from_dict(mod_survey_get_questions200_response_questions_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


