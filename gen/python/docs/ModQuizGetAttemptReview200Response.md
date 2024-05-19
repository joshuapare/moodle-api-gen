# ModQuizGetAttemptReview200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionaldata** | [**List[ModQuizGetAttemptReview200ResponseAdditionaldataInner]**](ModQuizGetAttemptReview200ResponseAdditionaldataInner.md) |  | 
**attempt** | [**ModQuizGetAttemptReview200ResponseAttempt**](ModQuizGetAttemptReview200ResponseAttempt.md) |  | 
**grade** | **str** | grade for the quiz (or empty or \&quot;notyetgraded\&quot;) | [default to 'null']
**questions** | [**List[ModQuizGetAttemptReview200ResponseQuestionsInner]**](ModQuizGetAttemptReview200ResponseQuestionsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_quiz_get_attempt_review200_response import ModQuizGetAttemptReview200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetAttemptReview200Response from a JSON string
mod_quiz_get_attempt_review200_response_instance = ModQuizGetAttemptReview200Response.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetAttemptReview200Response.to_json())

# convert the object into a dict
mod_quiz_get_attempt_review200_response_dict = mod_quiz_get_attempt_review200_response_instance.to_dict()
# create an instance of ModQuizGetAttemptReview200Response from a dict
mod_quiz_get_attempt_review200_response_from_dict = ModQuizGetAttemptReview200Response.from_dict(mod_quiz_get_attempt_review200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


