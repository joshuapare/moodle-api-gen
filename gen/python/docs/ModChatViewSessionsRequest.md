# ModChatViewSessionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cmid** | **int** | Course module id | 
**end** | **int** | Session end time | [optional] [default to 0]
**start** | **int** | Session start time | [optional] [default to 0]

## Example

```python
from openapi_client.models.mod_chat_view_sessions_request import ModChatViewSessionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModChatViewSessionsRequest from a JSON string
mod_chat_view_sessions_request_instance = ModChatViewSessionsRequest.from_json(json)
# print the JSON string representation of the object
print(ModChatViewSessionsRequest.to_json())

# convert the object into a dict
mod_chat_view_sessions_request_dict = mod_chat_view_sessions_request_instance.to_dict()
# create an instance of ModChatViewSessionsRequest from a dict
mod_chat_view_sessions_request_from_dict = ModChatViewSessionsRequest.from_dict(mod_chat_view_sessions_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


