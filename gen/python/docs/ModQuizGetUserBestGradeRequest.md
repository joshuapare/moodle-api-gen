# ModQuizGetUserBestGradeRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quizid** | **int** | quiz instance id | 
**userid** | **int** | user id | [optional] [default to 0]

## Example

```python
from openapi_client.models.mod_quiz_get_user_best_grade_request import ModQuizGetUserBestGradeRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetUserBestGradeRequest from a JSON string
mod_quiz_get_user_best_grade_request_instance = ModQuizGetUserBestGradeRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetUserBestGradeRequest.to_json())

# convert the object into a dict
mod_quiz_get_user_best_grade_request_dict = mod_quiz_get_user_best_grade_request_instance.to_dict()
# create an instance of ModQuizGetUserBestGradeRequest from a dict
mod_quiz_get_user_best_grade_request_from_dict = ModQuizGetUserBestGradeRequest.from_dict(mod_quiz_get_user_best_grade_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


