# CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregation** | **int** | aggregation method 1 means all, 2 means any | [default to null]
**completed** | **bool** | true if the course is complete, false otherwise | [default to False]
**completions** | [**List[CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner]**](CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner.md) |  | 

## Example

```python
from openapi_client.models.core_completion_get_course_completion_status200_response_completionstatus import CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus from a JSON string
core_completion_get_course_completion_status200_response_completionstatus_instance = CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus.from_json(json)
# print the JSON string representation of the object
print(CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus.to_json())

# convert the object into a dict
core_completion_get_course_completion_status200_response_completionstatus_dict = core_completion_get_course_completion_status200_response_completionstatus_instance.to_dict()
# create an instance of CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus from a dict
core_completion_get_course_completion_status200_response_completionstatus_from_dict = CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus.from_dict(core_completion_get_course_completion_status200_response_completionstatus_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


