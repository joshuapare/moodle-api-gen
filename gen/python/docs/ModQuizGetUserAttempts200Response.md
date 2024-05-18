# ModQuizGetUserAttempts200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempts** | [**List[ModQuizGetUserAttempts200ResponseAttemptsInner]**](ModQuizGetUserAttempts200ResponseAttemptsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_quiz_get_user_attempts200_response import ModQuizGetUserAttempts200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetUserAttempts200Response from a JSON string
mod_quiz_get_user_attempts200_response_instance = ModQuizGetUserAttempts200Response.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetUserAttempts200Response.to_json())

# convert the object into a dict
mod_quiz_get_user_attempts200_response_dict = mod_quiz_get_user_attempts200_response_instance.to_dict()
# create an instance of ModQuizGetUserAttempts200Response from a dict
mod_quiz_get_user_attempts200_response_from_dict = ModQuizGetUserAttempts200Response.from_dict(mod_quiz_get_user_attempts200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


