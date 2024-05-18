# ModLessonGetUserAttempt200ResponseUserstatsGradeinfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempts** | **int** | Number of question attempts | [default to null]
**earned** | **float** | Points earned by student | [default to null]
**grade** | **float** | Calculated percentage grade | [default to null]
**manualpoints** | **float** | Point value for manually graded questions | [default to null]
**nmanual** | **int** | Number of manually graded questions | [default to null]
**nquestions** | **int** | Number of questions answered | [default to null]
**total** | **float** | Max points possible | [default to null]

## Example

```python
from openapi_client.models.mod_lesson_get_user_attempt200_response_userstats_gradeinfo import ModLessonGetUserAttempt200ResponseUserstatsGradeinfo

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetUserAttempt200ResponseUserstatsGradeinfo from a JSON string
mod_lesson_get_user_attempt200_response_userstats_gradeinfo_instance = ModLessonGetUserAttempt200ResponseUserstatsGradeinfo.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetUserAttempt200ResponseUserstatsGradeinfo.to_json())

# convert the object into a dict
mod_lesson_get_user_attempt200_response_userstats_gradeinfo_dict = mod_lesson_get_user_attempt200_response_userstats_gradeinfo_instance.to_dict()
# create an instance of ModLessonGetUserAttempt200ResponseUserstatsGradeinfo from a dict
mod_lesson_get_user_attempt200_response_userstats_gradeinfo_from_dict = ModLessonGetUserAttempt200ResponseUserstatsGradeinfo.from_dict(mod_lesson_get_user_attempt200_response_userstats_gradeinfo_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


