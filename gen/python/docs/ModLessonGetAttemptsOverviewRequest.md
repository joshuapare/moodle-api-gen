# ModLessonGetAttemptsOverviewRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupid** | **int** | group id, 0 means that the function will determine the user group | [optional] [default to 0]
**lessonid** | **int** | lesson instance id | [default to null]

## Example

```python
from openapi_client.models.mod_lesson_get_attempts_overview_request import ModLessonGetAttemptsOverviewRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetAttemptsOverviewRequest from a JSON string
mod_lesson_get_attempts_overview_request_instance = ModLessonGetAttemptsOverviewRequest.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetAttemptsOverviewRequest.to_json())

# convert the object into a dict
mod_lesson_get_attempts_overview_request_dict = mod_lesson_get_attempts_overview_request_instance.to_dict()
# create an instance of ModLessonGetAttemptsOverviewRequest from a dict
mod_lesson_get_attempts_overview_request_from_dict = ModLessonGetAttemptsOverviewRequest.from_dict(mod_lesson_get_attempts_overview_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


