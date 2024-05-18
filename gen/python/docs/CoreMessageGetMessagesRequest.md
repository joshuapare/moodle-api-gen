# CoreMessageGetMessagesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limitfrom** | **int** | limit from | [optional] [default to 0]
**limitnum** | **int** | limit number | [optional] [default to 0]
**newestfirst** | **bool** | true for ordering by newest first, false for oldest first | [optional] [default to True]
**read** | **int** | 1 for getting read messages, 0 for unread, 2 for both | [optional] [default to 1]
**type** | **str** | type of message to return, expected values are: notifications, conversations and both | [optional] [default to 'both']
**useridfrom** | **int** | the user id who send the message, 0 for any user. -10 or -20 for no-reply or support user | [optional] [default to 0]
**useridto** | **int** | the user id who received the message, 0 for any user | [default to null]

## Example

```python
from openapi_client.models.core_message_get_messages_request import CoreMessageGetMessagesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetMessagesRequest from a JSON string
core_message_get_messages_request_instance = CoreMessageGetMessagesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetMessagesRequest.to_json())

# convert the object into a dict
core_message_get_messages_request_dict = core_message_get_messages_request_instance.to_dict()
# create an instance of CoreMessageGetMessagesRequest from a dict
core_message_get_messages_request_from_dict = CoreMessageGetMessagesRequest.from_dict(core_message_get_messages_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


