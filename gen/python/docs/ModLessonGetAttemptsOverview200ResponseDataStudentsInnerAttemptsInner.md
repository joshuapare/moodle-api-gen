# ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end** | **int** | Attempt time ended. | [optional] [default to null]
**grade** | **float** | Attempt grade. | [optional] [default to null]
**timeend** | **int** | Attempt last time continued. | [optional] [default to null]
**timestart** | **int** | Attempt time started. | [optional] [default to null]
**var_try** | **int** | Attempt number. | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_attempts_overview200_response_data_students_inner_attempts_inner import ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner from a JSON string
mod_lesson_get_attempts_overview200_response_data_students_inner_attempts_inner_instance = ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner.to_json())

# convert the object into a dict
mod_lesson_get_attempts_overview200_response_data_students_inner_attempts_inner_dict = mod_lesson_get_attempts_overview200_response_data_students_inner_attempts_inner_instance.to_dict()
# create an instance of ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner from a dict
mod_lesson_get_attempts_overview200_response_data_students_inner_attempts_inner_from_dict = ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner.from_dict(mod_lesson_get_attempts_overview200_response_data_students_inner_attempts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


