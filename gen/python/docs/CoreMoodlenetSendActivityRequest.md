# CoreMoodlenetSendActivityRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cmid** | **int** | Course module ID | [default to null]
**issuerid** | **int** | OAuth 2 issuer ID | 
**shareformat** | **int** | Share format | [default to null]

## Example

```python
from openapi_client.models.core_moodlenet_send_activity_request import CoreMoodlenetSendActivityRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMoodlenetSendActivityRequest from a JSON string
core_moodlenet_send_activity_request_instance = CoreMoodlenetSendActivityRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMoodlenetSendActivityRequest.to_json())

# convert the object into a dict
core_moodlenet_send_activity_request_dict = core_moodlenet_send_activity_request_instance.to_dict()
# create an instance of CoreMoodlenetSendActivityRequest from a dict
core_moodlenet_send_activity_request_from_dict = CoreMoodlenetSendActivityRequest.from_dict(core_moodlenet_send_activity_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


