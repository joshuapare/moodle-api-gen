# ModQuizGetUserBestGrade200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grade** | **float** | The grade (only if the user has a grade). | [optional] [default to null]
**gradetopass** | **float** | The grade to pass the quiz (only if set). | [optional] [default to null]
**hasgrade** | **bool** | Whether the user has a grade on the given quiz. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_quiz_get_user_best_grade200_response import ModQuizGetUserBestGrade200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetUserBestGrade200Response from a JSON string
mod_quiz_get_user_best_grade200_response_instance = ModQuizGetUserBestGrade200Response.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetUserBestGrade200Response.to_json())

# convert the object into a dict
mod_quiz_get_user_best_grade200_response_dict = mod_quiz_get_user_best_grade200_response_instance.to_dict()
# create an instance of ModQuizGetUserBestGrade200Response from a dict
mod_quiz_get_user_best_grade200_response_from_dict = ModQuizGetUserBestGrade200Response.from_dict(mod_quiz_get_user_best_grade200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


