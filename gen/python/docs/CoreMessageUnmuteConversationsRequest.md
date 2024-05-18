# CoreMessageUnmuteConversationsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversationids** | **List[object]** |  | 
**userid** | **int** | The id of the user who is unblocking | 

## Example

```python
from openapi_client.models.core_message_unmute_conversations_request import CoreMessageUnmuteConversationsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageUnmuteConversationsRequest from a JSON string
core_message_unmute_conversations_request_instance = CoreMessageUnmuteConversationsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageUnmuteConversationsRequest.to_json())

# convert the object into a dict
core_message_unmute_conversations_request_dict = core_message_unmute_conversations_request_instance.to_dict()
# create an instance of CoreMessageUnmuteConversationsRequest from a dict
core_message_unmute_conversations_request_from_dict = CoreMessageUnmuteConversationsRequest.from_dict(core_message_unmute_conversations_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


