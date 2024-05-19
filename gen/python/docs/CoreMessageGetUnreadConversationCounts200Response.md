# CoreMessageGetUnreadConversationCounts200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**favourites** | **int** | Total number of unread favourite conversations | [default to null]
**types** | [**CoreMessageGetUnreadConversationCounts200ResponseTypes**](CoreMessageGetUnreadConversationCounts200ResponseTypes.md) |  | 

## Example

```python
from openapi_client.models.core_message_get_unread_conversation_counts200_response import CoreMessageGetUnreadConversationCounts200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetUnreadConversationCounts200Response from a JSON string
core_message_get_unread_conversation_counts200_response_instance = CoreMessageGetUnreadConversationCounts200Response.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetUnreadConversationCounts200Response.to_json())

# convert the object into a dict
core_message_get_unread_conversation_counts200_response_dict = core_message_get_unread_conversation_counts200_response_instance.to_dict()
# create an instance of CoreMessageGetUnreadConversationCounts200Response from a dict
core_message_get_unread_conversation_counts200_response_from_dict = CoreMessageGetUnreadConversationCounts200Response.from_dict(core_message_get_unread_conversation_counts200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


