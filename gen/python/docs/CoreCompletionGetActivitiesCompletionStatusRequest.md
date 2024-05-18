# CoreCompletionGetActivitiesCompletionStatusRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course ID | 
**userid** | **int** | User ID | 

## Example

```python
from openapi_client.models.core_completion_get_activities_completion_status_request import CoreCompletionGetActivitiesCompletionStatusRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompletionGetActivitiesCompletionStatusRequest from a JSON string
core_completion_get_activities_completion_status_request_instance = CoreCompletionGetActivitiesCompletionStatusRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompletionGetActivitiesCompletionStatusRequest.to_json())

# convert the object into a dict
core_completion_get_activities_completion_status_request_dict = core_completion_get_activities_completion_status_request_instance.to_dict()
# create an instance of CoreCompletionGetActivitiesCompletionStatusRequest from a dict
core_completion_get_activities_completion_status_request_from_dict = CoreCompletionGetActivitiesCompletionStatusRequest.from_dict(core_completion_get_activities_completion_status_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


