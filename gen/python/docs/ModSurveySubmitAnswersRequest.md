# ModSurveySubmitAnswersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answers** | [**List[ModSurveySubmitAnswersRequestAnswersInner]**](ModSurveySubmitAnswersRequestAnswersInner.md) |  | 
**surveyid** | **int** | Survey id | [default to null]

## Example

```python
from openapi_client.models.mod_survey_submit_answers_request import ModSurveySubmitAnswersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModSurveySubmitAnswersRequest from a JSON string
mod_survey_submit_answers_request_instance = ModSurveySubmitAnswersRequest.from_json(json)
# print the JSON string representation of the object
print(ModSurveySubmitAnswersRequest.to_json())

# convert the object into a dict
mod_survey_submit_answers_request_dict = mod_survey_submit_answers_request_instance.to_dict()
# create an instance of ModSurveySubmitAnswersRequest from a dict
mod_survey_submit_answers_request_from_dict = ModSurveySubmitAnswersRequest.from_dict(mod_survey_submit_answers_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


