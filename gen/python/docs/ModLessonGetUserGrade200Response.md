# ModLessonGetUserGrade200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**formattedgrade** | **str** | The lesson final grade formatted | [default to 'null']
**grade** | **float** | The lesson final raw grade | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_user_grade200_response import ModLessonGetUserGrade200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetUserGrade200Response from a JSON string
mod_lesson_get_user_grade200_response_instance = ModLessonGetUserGrade200Response.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetUserGrade200Response.to_json())

# convert the object into a dict
mod_lesson_get_user_grade200_response_dict = mod_lesson_get_user_grade200_response_instance.to_dict()
# create an instance of ModLessonGetUserGrade200Response from a dict
mod_lesson_get_user_grade200_response_from_dict = ModLessonGetUserGrade200Response.from_dict(mod_lesson_get_user_grade200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


