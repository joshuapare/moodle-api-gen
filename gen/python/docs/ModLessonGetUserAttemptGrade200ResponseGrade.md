# ModLessonGetUserAttemptGrade200ResponseGrade


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempts** | **int** | Number of question attempts | 
**earned** | **float** | Points earned by student | 
**grade** | **float** | Calculated percentage grade | 
**manualpoints** | **float** | Point value for manually graded questions | 
**nmanual** | **int** | Number of manually graded questions | 
**nquestions** | **int** | Number of questions answered | 
**total** | **float** | Max points possible | 

## Example

```python
from openapi_client.models.mod_lesson_get_user_attempt_grade200_response_grade import ModLessonGetUserAttemptGrade200ResponseGrade

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetUserAttemptGrade200ResponseGrade from a JSON string
mod_lesson_get_user_attempt_grade200_response_grade_instance = ModLessonGetUserAttemptGrade200ResponseGrade.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetUserAttemptGrade200ResponseGrade.to_json())

# convert the object into a dict
mod_lesson_get_user_attempt_grade200_response_grade_dict = mod_lesson_get_user_attempt_grade200_response_grade_instance.to_dict()
# create an instance of ModLessonGetUserAttemptGrade200ResponseGrade from a dict
mod_lesson_get_user_attempt_grade200_response_grade_from_dict = ModLessonGetUserAttemptGrade200ResponseGrade.from_dict(mod_lesson_get_user_attempt_grade200_response_grade_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


