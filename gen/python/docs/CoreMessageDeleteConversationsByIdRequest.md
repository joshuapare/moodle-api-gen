# CoreMessageDeleteConversationsByIdRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversationids** | **List[object]** |  | 
**userid** | **int** | The user id of who we want to delete the conversation for | [default to null]

## Example

```python
from openapi_client.models.core_message_delete_conversations_by_id_request import CoreMessageDeleteConversationsByIdRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageDeleteConversationsByIdRequest from a JSON string
core_message_delete_conversations_by_id_request_instance = CoreMessageDeleteConversationsByIdRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageDeleteConversationsByIdRequest.to_json())

# convert the object into a dict
core_message_delete_conversations_by_id_request_dict = core_message_delete_conversations_by_id_request_instance.to_dict()
# create an instance of CoreMessageDeleteConversationsByIdRequest from a dict
core_message_delete_conversations_by_id_request_from_dict = CoreMessageDeleteConversationsByIdRequest.from_dict(core_message_delete_conversations_by_id_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


