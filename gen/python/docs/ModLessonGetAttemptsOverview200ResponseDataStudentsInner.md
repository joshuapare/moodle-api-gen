# ModLessonGetAttemptsOverview200ResponseDataStudentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempts** | [**List[ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner]**](ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner.md) |  | [optional] 
**bestgrade** | **float** | Best grade. | [optional] [default to null]
**fullname** | **str** | User full name. | [optional] [default to 'null']
**id** | **int** | User id. | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_attempts_overview200_response_data_students_inner import ModLessonGetAttemptsOverview200ResponseDataStudentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetAttemptsOverview200ResponseDataStudentsInner from a JSON string
mod_lesson_get_attempts_overview200_response_data_students_inner_instance = ModLessonGetAttemptsOverview200ResponseDataStudentsInner.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetAttemptsOverview200ResponseDataStudentsInner.to_json())

# convert the object into a dict
mod_lesson_get_attempts_overview200_response_data_students_inner_dict = mod_lesson_get_attempts_overview200_response_data_students_inner_instance.to_dict()
# create an instance of ModLessonGetAttemptsOverview200ResponseDataStudentsInner from a dict
mod_lesson_get_attempts_overview200_response_data_students_inner_from_dict = ModLessonGetAttemptsOverview200ResponseDataStudentsInner.from_dict(mod_lesson_get_attempts_overview200_response_data_students_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


