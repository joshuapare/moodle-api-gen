# CoreCompletionUpdateActivityCompletionStatusManuallyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cmid** | **int** | course module id | 
**completed** | **bool** | activity completed or not | [default to False]

## Example

```python
from openapi_client.models.core_completion_update_activity_completion_status_manually_request import CoreCompletionUpdateActivityCompletionStatusManuallyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompletionUpdateActivityCompletionStatusManuallyRequest from a JSON string
core_completion_update_activity_completion_status_manually_request_instance = CoreCompletionUpdateActivityCompletionStatusManuallyRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompletionUpdateActivityCompletionStatusManuallyRequest.to_json())

# convert the object into a dict
core_completion_update_activity_completion_status_manually_request_dict = core_completion_update_activity_completion_status_manually_request_instance.to_dict()
# create an instance of CoreCompletionUpdateActivityCompletionStatusManuallyRequest from a dict
core_completion_update_activity_completion_status_manually_request_from_dict = CoreCompletionUpdateActivityCompletionStatusManuallyRequest.from_dict(core_completion_update_activity_completion_status_manually_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


