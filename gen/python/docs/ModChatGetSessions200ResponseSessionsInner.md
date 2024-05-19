# ModChatGetSessions200ResponseSessionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iscomplete** | **bool** | Whether the session is completed or not. | [optional] [default to False]
**sessionend** | **int** | Session end time. | [optional] [default to null]
**sessionstart** | **int** | Session start time. | [optional] [default to null]
**sessionusers** | [**List[ModChatGetSessions200ResponseSessionsInnerSessionusersInner]**](ModChatGetSessions200ResponseSessionsInnerSessionusersInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_chat_get_sessions200_response_sessions_inner import ModChatGetSessions200ResponseSessionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModChatGetSessions200ResponseSessionsInner from a JSON string
mod_chat_get_sessions200_response_sessions_inner_instance = ModChatGetSessions200ResponseSessionsInner.from_json(json)
# print the JSON string representation of the object
print(ModChatGetSessions200ResponseSessionsInner.to_json())

# convert the object into a dict
mod_chat_get_sessions200_response_sessions_inner_dict = mod_chat_get_sessions200_response_sessions_inner_instance.to_dict()
# create an instance of ModChatGetSessions200ResponseSessionsInner from a dict
mod_chat_get_sessions200_response_sessions_inner_from_dict = ModChatGetSessions200ResponseSessionsInner.from_dict(mod_chat_get_sessions200_response_sessions_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


