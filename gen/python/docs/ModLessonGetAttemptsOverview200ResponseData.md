# ModLessonGetAttemptsOverview200ResponseData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avescore** | **float** | Average score. | [default to null]
**avetime** | **int** | Average time (spent in taking the lesson). | [default to null]
**highscore** | **float** | High score. | [default to null]
**hightime** | **int** | High time. | [default to null]
**lessonscored** | **bool** | True if the lesson was scored. | [default to False]
**lowscore** | **float** | Low score. | [default to null]
**lowtime** | **int** | Low time. | [default to null]
**numofattempts** | **int** | Number of attempts. | [default to null]
**students** | [**List[ModLessonGetAttemptsOverview200ResponseDataStudentsInner]**](ModLessonGetAttemptsOverview200ResponseDataStudentsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_attempts_overview200_response_data import ModLessonGetAttemptsOverview200ResponseData

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetAttemptsOverview200ResponseData from a JSON string
mod_lesson_get_attempts_overview200_response_data_instance = ModLessonGetAttemptsOverview200ResponseData.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetAttemptsOverview200ResponseData.to_json())

# convert the object into a dict
mod_lesson_get_attempts_overview200_response_data_dict = mod_lesson_get_attempts_overview200_response_data_instance.to_dict()
# create an instance of ModLessonGetAttemptsOverview200ResponseData from a dict
mod_lesson_get_attempts_overview200_response_data_from_dict = ModLessonGetAttemptsOverview200ResponseData.from_dict(mod_lesson_get_attempts_overview200_response_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


