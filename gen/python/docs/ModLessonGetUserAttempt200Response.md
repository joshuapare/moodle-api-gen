# ModLessonGetUserAttempt200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answerpages** | [**List[ModLessonGetUserAttempt200ResponseAnswerpagesInner]**](ModLessonGetUserAttempt200ResponseAnswerpagesInner.md) |  | 
**userstats** | [**ModLessonGetUserAttempt200ResponseUserstats**](ModLessonGetUserAttempt200ResponseUserstats.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_user_attempt200_response import ModLessonGetUserAttempt200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetUserAttempt200Response from a JSON string
mod_lesson_get_user_attempt200_response_instance = ModLessonGetUserAttempt200Response.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetUserAttempt200Response.to_json())

# convert the object into a dict
mod_lesson_get_user_attempt200_response_dict = mod_lesson_get_user_attempt200_response_instance.to_dict()
# create an instance of ModLessonGetUserAttempt200Response from a dict
mod_lesson_get_user_attempt200_response_from_dict = ModLessonGetUserAttempt200Response.from_dict(mod_lesson_get_user_attempt200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


