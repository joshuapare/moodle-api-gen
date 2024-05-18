# ModLessonGetAttemptsOverview200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**ModLessonGetAttemptsOverview200ResponseData**](ModLessonGetAttemptsOverview200ResponseData.md) |  | [optional] 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_attempts_overview200_response import ModLessonGetAttemptsOverview200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetAttemptsOverview200Response from a JSON string
mod_lesson_get_attempts_overview200_response_instance = ModLessonGetAttemptsOverview200Response.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetAttemptsOverview200Response.to_json())

# convert the object into a dict
mod_lesson_get_attempts_overview200_response_dict = mod_lesson_get_attempts_overview200_response_instance.to_dict()
# create an instance of ModLessonGetAttemptsOverview200Response from a dict
mod_lesson_get_attempts_overview200_response_from_dict = ModLessonGetAttemptsOverview200Response.from_dict(mod_lesson_get_attempts_overview200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

