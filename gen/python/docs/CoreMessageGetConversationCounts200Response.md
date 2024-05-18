# CoreMessageGetConversationCounts200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**favourites** | **int** | Total number of favourite conversations | [default to null]
**types** | [**CoreMessageGetConversationCounts200ResponseTypes**](CoreMessageGetConversationCounts200ResponseTypes.md) |  | 

## Example

```python
from openapi_client.models.core_message_get_conversation_counts200_response import CoreMessageGetConversationCounts200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversationCounts200Response from a JSON string
core_message_get_conversation_counts200_response_instance = CoreMessageGetConversationCounts200Response.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversationCounts200Response.to_json())

# convert the object into a dict
core_message_get_conversation_counts200_response_dict = core_message_get_conversation_counts200_response_instance.to_dict()
# create an instance of CoreMessageGetConversationCounts200Response from a dict
core_message_get_conversation_counts200_response_from_dict = CoreMessageGetConversationCounts200Response.from_dict(core_message_get_conversation_counts200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


