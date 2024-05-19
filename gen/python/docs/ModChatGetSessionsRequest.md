# ModChatGetSessionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chatid** | **int** | Chat instance id. | 
**groupid** | **int** | Get messages from users in this group.                                                 0 means that the function will determine the user group | [optional] [default to 0]
**showall** | **bool** | Whether to show completed sessions or not. | [optional] [default to False]

## Example

```python
from openapi_client.models.mod_chat_get_sessions_request import ModChatGetSessionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModChatGetSessionsRequest from a JSON string
mod_chat_get_sessions_request_instance = ModChatGetSessionsRequest.from_json(json)
# print the JSON string representation of the object
print(ModChatGetSessionsRequest.to_json())

# convert the object into a dict
mod_chat_get_sessions_request_dict = mod_chat_get_sessions_request_instance.to_dict()
# create an instance of ModChatGetSessionsRequest from a dict
mod_chat_get_sessions_request_from_dict = ModChatGetSessionsRequest.from_dict(mod_chat_get_sessions_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


