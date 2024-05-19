# CoreMessageGetSelfConversationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messagelimit** | **int** | Limit for number of messages | [optional] [default to 100]
**messageoffset** | **int** | Offset for messages list | [optional] [default to 0]
**newestmessagesfirst** | **bool** | Order messages by newest first | [optional] [default to True]
**userid** | **int** | The id of the user who we are viewing self-conversations for | [default to null]

## Example

```python
from openapi_client.models.core_message_get_self_conversation_request import CoreMessageGetSelfConversationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetSelfConversationRequest from a JSON string
core_message_get_self_conversation_request_instance = CoreMessageGetSelfConversationRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetSelfConversationRequest.to_json())

# convert the object into a dict
core_message_get_self_conversation_request_dict = core_message_get_self_conversation_request_instance.to_dict()
# create an instance of CoreMessageGetSelfConversationRequest from a dict
core_message_get_self_conversation_request_from_dict = CoreMessageGetSelfConversationRequest.from_dict(core_message_get_self_conversation_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


