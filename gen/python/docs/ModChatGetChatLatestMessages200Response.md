# ModChatGetChatLatestMessages200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chatnewlasttime** | **int** | new last time | [default to null]
**messages** | [**List[ModChatGetChatLatestMessages200ResponseMessagesInner]**](ModChatGetChatLatestMessages200ResponseMessagesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_chat_get_chat_latest_messages200_response import ModChatGetChatLatestMessages200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModChatGetChatLatestMessages200Response from a JSON string
mod_chat_get_chat_latest_messages200_response_instance = ModChatGetChatLatestMessages200Response.from_json(json)
# print the JSON string representation of the object
print(ModChatGetChatLatestMessages200Response.to_json())

# convert the object into a dict
mod_chat_get_chat_latest_messages200_response_dict = mod_chat_get_chat_latest_messages200_response_instance.to_dict()
# create an instance of ModChatGetChatLatestMessages200Response from a dict
mod_chat_get_chat_latest_messages200_response_from_dict = ModChatGetChatLatestMessages200Response.from_dict(mod_chat_get_chat_latest_messages200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


