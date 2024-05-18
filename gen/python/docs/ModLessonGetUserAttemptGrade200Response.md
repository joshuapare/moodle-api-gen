# ModLessonGetUserAttemptGrade200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grade** | [**ModLessonGetUserAttemptGrade200ResponseGrade**](ModLessonGetUserAttemptGrade200ResponseGrade.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_user_attempt_grade200_response import ModLessonGetUserAttemptGrade200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetUserAttemptGrade200Response from a JSON string
mod_lesson_get_user_attempt_grade200_response_instance = ModLessonGetUserAttemptGrade200Response.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetUserAttemptGrade200Response.to_json())

# convert the object into a dict
mod_lesson_get_user_attempt_grade200_response_dict = mod_lesson_get_user_attempt_grade200_response_instance.to_dict()
# create an instance of ModLessonGetUserAttemptGrade200Response from a dict
mod_lesson_get_user_attempt_grade200_response_from_dict = ModLessonGetUserAttemptGrade200Response.from_dict(mod_lesson_get_user_attempt_grade200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


