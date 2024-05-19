# CoreMessageGetReceivedContactRequestsCountRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userid** | **int** | The id of the user we want to return the number of received contact requests for | [default to null]

## Example

```python
from openapi_client.models.core_message_get_received_contact_requests_count_request import CoreMessageGetReceivedContactRequestsCountRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetReceivedContactRequestsCountRequest from a JSON string
core_message_get_received_contact_requests_count_request_instance = CoreMessageGetReceivedContactRequestsCountRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetReceivedContactRequestsCountRequest.to_json())

# convert the object into a dict
core_message_get_received_contact_requests_count_request_dict = core_message_get_received_contact_requests_count_request_instance.to_dict()
# create an instance of CoreMessageGetReceivedContactRequestsCountRequest from a dict
core_message_get_received_contact_requests_count_request_from_dict = CoreMessageGetReceivedContactRequestsCountRequest.from_dict(core_message_get_received_contact_requests_count_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


