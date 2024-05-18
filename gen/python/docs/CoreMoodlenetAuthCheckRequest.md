# CoreMoodlenetAuthCheckRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course ID | 
**issuerid** | **int** | OAuth 2 issuer ID | [default to null]

## Example

```python
from openapi_client.models.core_moodlenet_auth_check_request import CoreMoodlenetAuthCheckRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMoodlenetAuthCheckRequest from a JSON string
core_moodlenet_auth_check_request_instance = CoreMoodlenetAuthCheckRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMoodlenetAuthCheckRequest.to_json())

# convert the object into a dict
core_moodlenet_auth_check_request_dict = core_moodlenet_auth_check_request_instance.to_dict()
# create an instance of CoreMoodlenetAuthCheckRequest from a dict
core_moodlenet_auth_check_request_from_dict = CoreMoodlenetAuthCheckRequest.from_dict(core_moodlenet_auth_check_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


