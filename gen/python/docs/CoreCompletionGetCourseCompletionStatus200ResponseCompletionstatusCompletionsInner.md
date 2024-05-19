# CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner

Completions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complete** | **bool** | Completion status (true/false) | [optional] [default to False]
**details** | [**CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails**](CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails.md) |  | [optional] 
**status** | **str** | Completion status (Yes/No) a % or number | [optional] [default to 'null']
**timecompleted** | **int** | Timestamp for criteria completetion | [optional] [default to null]
**title** | **str** | Completion criteria Title | [optional] [default to 'null']
**type** | **int** | Completion criteria type | [optional] [default to null]

## Example

```python
from openapi_client.models.core_completion_get_course_completion_status200_response_completionstatus_completions_inner import CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner from a JSON string
core_completion_get_course_completion_status200_response_completionstatus_completions_inner_instance = CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner.from_json(json)
# print the JSON string representation of the object
print(CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner.to_json())

# convert the object into a dict
core_completion_get_course_completion_status200_response_completionstatus_completions_inner_dict = core_completion_get_course_completion_status200_response_completionstatus_completions_inner_instance.to_dict()
# create an instance of CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner from a dict
core_completion_get_course_completion_status200_response_completionstatus_completions_inner_from_dict = CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner.from_dict(core_completion_get_course_completion_status200_response_completionstatus_completions_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


