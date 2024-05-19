# ModLessonGetUserAttempt200ResponseUserstats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completed** | **int** | Time completed. | [default to null]
**grade** | **float** | Attempt final grade. | [default to null]
**gradeinfo** | [**ModLessonGetUserAttempt200ResponseUserstatsGradeinfo**](ModLessonGetUserAttempt200ResponseUserstatsGradeinfo.md) |  | [optional] 
**timetotake** | **int** | Time taken. | [default to null]

## Example

```python
from openapi_client.models.mod_lesson_get_user_attempt200_response_userstats import ModLessonGetUserAttempt200ResponseUserstats

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetUserAttempt200ResponseUserstats from a JSON string
mod_lesson_get_user_attempt200_response_userstats_instance = ModLessonGetUserAttempt200ResponseUserstats.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetUserAttempt200ResponseUserstats.to_json())

# convert the object into a dict
mod_lesson_get_user_attempt200_response_userstats_dict = mod_lesson_get_user_attempt200_response_userstats_instance.to_dict()
# create an instance of ModLessonGetUserAttempt200ResponseUserstats from a dict
mod_lesson_get_user_attempt200_response_userstats_from_dict = ModLessonGetUserAttempt200ResponseUserstats.from_dict(mod_lesson_get_user_attempt200_response_userstats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


