# CoreMessageGetUnreadConversationsCountRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**useridto** | **int** | the user id who received the message, 0 for any user | 

## Example

```python
from openapi_client.models.core_message_get_unread_conversations_count_request import CoreMessageGetUnreadConversationsCountRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetUnreadConversationsCountRequest from a JSON string
core_message_get_unread_conversations_count_request_instance = CoreMessageGetUnreadConversationsCountRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetUnreadConversationsCountRequest.to_json())

# convert the object into a dict
core_message_get_unread_conversations_count_request_dict = core_message_get_unread_conversations_count_request_instance.to_dict()
# create an instance of CoreMessageGetUnreadConversationsCountRequest from a dict
core_message_get_unread_conversations_count_request_from_dict = CoreMessageGetUnreadConversationsCountRequest.from_dict(core_message_get_unread_conversations_count_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


