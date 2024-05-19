# ModLessonLaunchAttemptRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lessonid** | **int** | lesson instance id | 
**pageid** | **int** | page id to continue from (only when continuing an attempt) | [optional] [default to 0]
**password** | **str** | optional password (the lesson may be protected) | [optional] [default to '']
**review** | **bool** | if we want to review just after finishing | [optional] [default to False]

## Example

```python
from openapi_client.models.mod_lesson_launch_attempt_request import ModLessonLaunchAttemptRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonLaunchAttemptRequest from a JSON string
mod_lesson_launch_attempt_request_instance = ModLessonLaunchAttemptRequest.from_json(json)
# print the JSON string representation of the object
print(ModLessonLaunchAttemptRequest.to_json())

# convert the object into a dict
mod_lesson_launch_attempt_request_dict = mod_lesson_launch_attempt_request_instance.to_dict()
# create an instance of ModLessonLaunchAttemptRequest from a dict
mod_lesson_launch_attempt_request_from_dict = ModLessonLaunchAttemptRequest.from_dict(mod_lesson_launch_attempt_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


