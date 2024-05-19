# ModLessonGetUserTimers200ResponseTimersInner

The timers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completed** | **int** | If the lesson for this timer was completed | [optional] [default to null]
**id** | **int** | The attempt id | [optional] 
**lessonid** | **int** | The lesson id | [optional] [default to null]
**lessontime** | **int** | Last access time to the lesson during the timer session | [optional] [default to null]
**starttime** | **int** | First access time for a new timer session | [optional] [default to null]
**timemodifiedoffline** | **int** | Last modified time via webservices. | [optional] [default to null]
**userid** | **int** | The user id | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_user_timers200_response_timers_inner import ModLessonGetUserTimers200ResponseTimersInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetUserTimers200ResponseTimersInner from a JSON string
mod_lesson_get_user_timers200_response_timers_inner_instance = ModLessonGetUserTimers200ResponseTimersInner.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetUserTimers200ResponseTimersInner.to_json())

# convert the object into a dict
mod_lesson_get_user_timers200_response_timers_inner_dict = mod_lesson_get_user_timers200_response_timers_inner_instance.to_dict()
# create an instance of ModLessonGetUserTimers200ResponseTimersInner from a dict
mod_lesson_get_user_timers200_response_timers_inner_from_dict = ModLessonGetUserTimers200ResponseTimersInner.from_dict(mod_lesson_get_user_timers200_response_timers_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


