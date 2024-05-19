# CoreMessageSendInstantMessagesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**List[CoreMessageSendInstantMessagesRequestMessagesInner]**](CoreMessageSendInstantMessagesRequestMessagesInner.md) |  | 

## Example

```python
from openapi_client.models.core_message_send_instant_messages_request import CoreMessageSendInstantMessagesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageSendInstantMessagesRequest from a JSON string
core_message_send_instant_messages_request_instance = CoreMessageSendInstantMessagesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageSendInstantMessagesRequest.to_json())

# convert the object into a dict
core_message_send_instant_messages_request_dict = core_message_send_instant_messages_request_instance.to_dict()
# create an instance of CoreMessageSendInstantMessagesRequest from a dict
core_message_send_instant_messages_request_from_dict = CoreMessageSendInstantMessagesRequest.from_dict(core_message_send_instant_messages_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


