# ModLessonGetUserGradeRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lessonid** | **int** | lesson instance id | 
**userid** | **int** | the user id (empty for current user) | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_user_grade_request import ModLessonGetUserGradeRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetUserGradeRequest from a JSON string
mod_lesson_get_user_grade_request_instance = ModLessonGetUserGradeRequest.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetUserGradeRequest.to_json())

# convert the object into a dict
mod_lesson_get_user_grade_request_dict = mod_lesson_get_user_grade_request_instance.to_dict()
# create an instance of ModLessonGetUserGradeRequest from a dict
mod_lesson_get_user_grade_request_from_dict = ModLessonGetUserGradeRequest.from_dict(mod_lesson_get_user_grade_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


