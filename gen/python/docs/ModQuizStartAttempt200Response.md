# ModQuizStartAttempt200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempt** | [**ModQuizGetAttemptReview200ResponseAttempt**](ModQuizGetAttemptReview200ResponseAttempt.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_quiz_start_attempt200_response import ModQuizStartAttempt200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizStartAttempt200Response from a JSON string
mod_quiz_start_attempt200_response_instance = ModQuizStartAttempt200Response.from_json(json)
# print the JSON string representation of the object
print(ModQuizStartAttempt200Response.to_json())

# convert the object into a dict
mod_quiz_start_attempt200_response_dict = mod_quiz_start_attempt200_response_instance.to_dict()
# create an instance of ModQuizStartAttempt200Response from a dict
mod_quiz_start_attempt200_response_from_dict = ModQuizStartAttempt200Response.from_dict(mod_quiz_start_attempt200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


