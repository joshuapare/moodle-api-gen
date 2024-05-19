# CoreMessageGetContactRequestsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limitfrom** | **int** | Limit from | [optional] [default to 0]
**limitnum** | **int** | Limit number | [optional] [default to 0]
**userid** | **int** | The id of the user we want the requests for | [default to null]

## Example

```python
from openapi_client.models.core_message_get_contact_requests_request import CoreMessageGetContactRequestsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetContactRequestsRequest from a JSON string
core_message_get_contact_requests_request_instance = CoreMessageGetContactRequestsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetContactRequestsRequest.to_json())

# convert the object into a dict
core_message_get_contact_requests_request_dict = core_message_get_contact_requests_request_instance.to_dict()
# create an instance of CoreMessageGetContactRequestsRequest from a dict
core_message_get_contact_requests_request_from_dict = CoreMessageGetContactRequestsRequest.from_dict(core_message_get_contact_requests_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


