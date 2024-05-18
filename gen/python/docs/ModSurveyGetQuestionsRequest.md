# ModSurveyGetQuestionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**surveyid** | **int** | survey instance id | [default to null]

## Example

```python
from openapi_client.models.mod_survey_get_questions_request import ModSurveyGetQuestionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModSurveyGetQuestionsRequest from a JSON string
mod_survey_get_questions_request_instance = ModSurveyGetQuestionsRequest.from_json(json)
# print the JSON string representation of the object
print(ModSurveyGetQuestionsRequest.to_json())

# convert the object into a dict
mod_survey_get_questions_request_dict = mod_survey_get_questions_request_instance.to_dict()
# create an instance of ModSurveyGetQuestionsRequest from a dict
mod_survey_get_questions_request_from_dict = ModSurveyGetQuestionsRequest.from_dict(mod_survey_get_questions_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


