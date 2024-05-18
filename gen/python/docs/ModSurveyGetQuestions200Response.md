# ModSurveyGetQuestions200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**questions** | [**List[ModSurveyGetQuestions200ResponseQuestionsInner]**](ModSurveyGetQuestions200ResponseQuestionsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_survey_get_questions200_response import ModSurveyGetQuestions200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModSurveyGetQuestions200Response from a JSON string
mod_survey_get_questions200_response_instance = ModSurveyGetQuestions200Response.from_json(json)
# print the JSON string representation of the object
print(ModSurveyGetQuestions200Response.to_json())

# convert the object into a dict
mod_survey_get_questions200_response_dict = mod_survey_get_questions200_response_instance.to_dict()
# create an instance of ModSurveyGetQuestions200Response from a dict
mod_survey_get_questions200_response_from_dict = ModSurveyGetQuestions200Response.from_dict(mod_survey_get_questions200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


