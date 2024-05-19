# ModQuizGetAttemptData200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempt** | [**ModQuizGetAttemptData200ResponseAttempt**](ModQuizGetAttemptData200ResponseAttempt.md) |  | 
**messages** | **List[object]** |  | 
**nextpage** | **int** | next page number | [default to null]
**questions** | [**List[ModQuizGetAttemptData200ResponseQuestionsInner]**](ModQuizGetAttemptData200ResponseQuestionsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_quiz_get_attempt_data200_response import ModQuizGetAttemptData200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetAttemptData200Response from a JSON string
mod_quiz_get_attempt_data200_response_instance = ModQuizGetAttemptData200Response.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetAttemptData200Response.to_json())

# convert the object into a dict
mod_quiz_get_attempt_data200_response_dict = mod_quiz_get_attempt_data200_response_instance.to_dict()
# create an instance of ModQuizGetAttemptData200Response from a dict
mod_quiz_get_attempt_data200_response_from_dict = ModQuizGetAttemptData200Response.from_dict(mod_quiz_get_attempt_data200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


