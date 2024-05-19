# CoreMessageGetConversationCountsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userid** | **int** | id of the user, 0 for current user | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_message_get_conversation_counts_request import CoreMessageGetConversationCountsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversationCountsRequest from a JSON string
core_message_get_conversation_counts_request_instance = CoreMessageGetConversationCountsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversationCountsRequest.to_json())

# convert the object into a dict
core_message_get_conversation_counts_request_dict = core_message_get_conversation_counts_request_instance.to_dict()
# create an instance of CoreMessageGetConversationCountsRequest from a dict
core_message_get_conversation_counts_request_from_dict = CoreMessageGetConversationCountsRequest.from_dict(core_message_get_conversation_counts_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


