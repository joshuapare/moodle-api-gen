# ModLessonGetQuestionsAttempts200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempts** | [**List[ModLessonGetQuestionsAttempts200ResponseAttemptsInner]**](ModLessonGetQuestionsAttempts200ResponseAttemptsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_questions_attempts200_response import ModLessonGetQuestionsAttempts200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetQuestionsAttempts200Response from a JSON string
mod_lesson_get_questions_attempts200_response_instance = ModLessonGetQuestionsAttempts200Response.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetQuestionsAttempts200Response.to_json())

# convert the object into a dict
mod_lesson_get_questions_attempts200_response_dict = mod_lesson_get_questions_attempts200_response_instance.to_dict()
# create an instance of ModLessonGetQuestionsAttempts200Response from a dict
mod_lesson_get_questions_attempts200_response_from_dict = ModLessonGetQuestionsAttempts200Response.from_dict(mod_lesson_get_questions_attempts200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


