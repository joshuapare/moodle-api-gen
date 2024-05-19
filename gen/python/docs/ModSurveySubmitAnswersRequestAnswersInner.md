# ModSurveySubmitAnswersRequestAnswersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** | Answer key | [optional] [default to 'null']
**value** | **str** | Answer value | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_survey_submit_answers_request_answers_inner import ModSurveySubmitAnswersRequestAnswersInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModSurveySubmitAnswersRequestAnswersInner from a JSON string
mod_survey_submit_answers_request_answers_inner_instance = ModSurveySubmitAnswersRequestAnswersInner.from_json(json)
# print the JSON string representation of the object
print(ModSurveySubmitAnswersRequestAnswersInner.to_json())

# convert the object into a dict
mod_survey_submit_answers_request_answers_inner_dict = mod_survey_submit_answers_request_answers_inner_instance.to_dict()
# create an instance of ModSurveySubmitAnswersRequestAnswersInner from a dict
mod_survey_submit_answers_request_answers_inner_from_dict = ModSurveySubmitAnswersRequestAnswersInner.from_dict(mod_survey_submit_answers_request_answers_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


