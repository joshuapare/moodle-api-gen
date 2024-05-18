# CoreMessageGetConversationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversationid** | **int** | The id of the conversation to fetch | [default to null]
**includecontactrequests** | **bool** | Include contact requests in the members | [default to False]
**includeprivacyinfo** | **bool** | Include privacy info in the members | [default to False]
**memberlimit** | **int** | Limit for number of members | [optional] [default to 0]
**memberoffset** | **int** | Offset for member list | [optional] [default to 0]
**messagelimit** | **int** | Limit for number of messages | [optional] [default to 100]
**messageoffset** | **int** | Offset for messages list | [optional] [default to 0]
**newestmessagesfirst** | **bool** | Order messages by newest first | [optional] [default to True]
**userid** | **int** | The id of the user who we are viewing conversations for | [default to null]

## Example

```python
from openapi_client.models.core_message_get_conversation_request import CoreMessageGetConversationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversationRequest from a JSON string
core_message_get_conversation_request_instance = CoreMessageGetConversationRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversationRequest.to_json())

# convert the object into a dict
core_message_get_conversation_request_dict = core_message_get_conversation_request_instance.to_dict()
# create an instance of CoreMessageGetConversationRequest from a dict
core_message_get_conversation_request_from_dict = CoreMessageGetConversationRequest.from_dict(core_message_get_conversation_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


