# CoreMessageGetConversationsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**favourites** | **bool** | Whether to restrict the results to contain NO favourite                 conversations (false), ONLY favourite conversation (true), or ignore any restriction altogether (null) | [optional] [default to False]
**limitfrom** | **int** | The offset to start at | [optional] [default to 0]
**limitnum** | **int** | Limit number of conversations to this | [optional] [default to 0]
**mergeself** | **bool** | Whether to include self-conversations (true) or ONLY private                     conversations (false) when private conversations are requested. | [optional] [default to False]
**type** | **int** | Filter by type | [optional] [default to null]
**userid** | **int** | The id of the user who we are viewing conversations for | 

## Example

```python
from openapi_client.models.core_message_get_conversations_request import CoreMessageGetConversationsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversationsRequest from a JSON string
core_message_get_conversations_request_instance = CoreMessageGetConversationsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversationsRequest.to_json())

# convert the object into a dict
core_message_get_conversations_request_dict = core_message_get_conversations_request_instance.to_dict()
# create an instance of CoreMessageGetConversationsRequest from a dict
core_message_get_conversations_request_from_dict = CoreMessageGetConversationsRequest.from_dict(core_message_get_conversations_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


