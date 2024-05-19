# CoreCompletionOverrideActivityCompletionStatus200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cmid** | **int** | The course module id | 
**overrideby** | **int** | The user id who has overriden the status, or null | 
**state** | **int** | The current completion state. | [default to null]
**timecompleted** | **int** | time of completion | [default to null]
**tracking** | **int** | type of tracking:                                                                     0 means none, 1 manual, 2 automatic | [default to null]
**userid** | **int** | The user id to which the completion info belongs | [default to null]

## Example

```python
from openapi_client.models.core_completion_override_activity_completion_status200_response import CoreCompletionOverrideActivityCompletionStatus200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompletionOverrideActivityCompletionStatus200Response from a JSON string
core_completion_override_activity_completion_status200_response_instance = CoreCompletionOverrideActivityCompletionStatus200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCompletionOverrideActivityCompletionStatus200Response.to_json())

# convert the object into a dict
core_completion_override_activity_completion_status200_response_dict = core_completion_override_activity_completion_status200_response_instance.to_dict()
# create an instance of CoreCompletionOverrideActivityCompletionStatus200Response from a dict
core_completion_override_activity_completion_status200_response_from_dict = CoreCompletionOverrideActivityCompletionStatus200Response.from_dict(core_completion_override_activity_completion_status200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


