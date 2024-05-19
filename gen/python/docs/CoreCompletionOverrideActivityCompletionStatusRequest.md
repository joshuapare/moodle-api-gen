# CoreCompletionOverrideActivityCompletionStatusRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cmid** | **int** | course module id | [default to null]
**newstate** | **int** | the new activity completion state | [default to null]
**userid** | **int** | user id | 

## Example

```python
from openapi_client.models.core_completion_override_activity_completion_status_request import CoreCompletionOverrideActivityCompletionStatusRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompletionOverrideActivityCompletionStatusRequest from a JSON string
core_completion_override_activity_completion_status_request_instance = CoreCompletionOverrideActivityCompletionStatusRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompletionOverrideActivityCompletionStatusRequest.to_json())

# convert the object into a dict
core_completion_override_activity_completion_status_request_dict = core_completion_override_activity_completion_status_request_instance.to_dict()
# create an instance of CoreCompletionOverrideActivityCompletionStatusRequest from a dict
core_completion_override_activity_completion_status_request_from_dict = CoreCompletionOverrideActivityCompletionStatusRequest.from_dict(core_completion_override_activity_completion_status_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


