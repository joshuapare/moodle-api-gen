# CoreMessageSendInstantMessagesRequestMessagesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientmsgid** | **str** | your own client id for the message. If this id is provided, the fail message id will be returned to you | [optional] [default to 'null']
**text** | **str** | the text of the message | [optional] [default to 'null']
**textformat** | **int** | text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**touserid** | **int** | id of the user to send the private message | [optional] [default to null]

## Example

```python
from openapi_client.models.core_message_send_instant_messages_request_messages_inner import CoreMessageSendInstantMessagesRequestMessagesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageSendInstantMessagesRequestMessagesInner from a JSON string
core_message_send_instant_messages_request_messages_inner_instance = CoreMessageSendInstantMessagesRequestMessagesInner.from_json(json)
# print the JSON string representation of the object
print(CoreMessageSendInstantMessagesRequestMessagesInner.to_json())

# convert the object into a dict
core_message_send_instant_messages_request_messages_inner_dict = core_message_send_instant_messages_request_messages_inner_instance.to_dict()
# create an instance of CoreMessageSendInstantMessagesRequestMessagesInner from a dict
core_message_send_instant_messages_request_messages_inner_from_dict = CoreMessageSendInstantMessagesRequestMessagesInner.from_dict(core_message_send_instant_messages_request_messages_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


