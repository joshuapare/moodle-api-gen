# CoreMessageMuteConversationsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversationids** | **List[object]** |  | 
**userid** | **int** | The id of the user who is blocking | 

## Example

```python
from openapi_client.models.core_message_mute_conversations_request import CoreMessageMuteConversationsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageMuteConversationsRequest from a JSON string
core_message_mute_conversations_request_instance = CoreMessageMuteConversationsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageMuteConversationsRequest.to_json())

# convert the object into a dict
core_message_mute_conversations_request_dict = core_message_mute_conversations_request_instance.to_dict()
# create an instance of CoreMessageMuteConversationsRequest from a dict
core_message_mute_conversations_request_from_dict = CoreMessageMuteConversationsRequest.from_dict(core_message_mute_conversations_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


