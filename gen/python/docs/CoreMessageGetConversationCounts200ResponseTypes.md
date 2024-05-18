# CoreMessageGetConversationCounts200ResponseTypes


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_1** | **int** | Total number of individual conversations | [default to null]
**var_2** | **int** | Total number of group conversations | [default to null]
**var_3** | **int** | Total number of self conversations | [default to null]

## Example

```python
from openapi_client.models.core_message_get_conversation_counts200_response_types import CoreMessageGetConversationCounts200ResponseTypes

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversationCounts200ResponseTypes from a JSON string
core_message_get_conversation_counts200_response_types_instance = CoreMessageGetConversationCounts200ResponseTypes.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversationCounts200ResponseTypes.to_json())

# convert the object into a dict
core_message_get_conversation_counts200_response_types_dict = core_message_get_conversation_counts200_response_types_instance.to_dict()
# create an instance of CoreMessageGetConversationCounts200ResponseTypes from a dict
core_message_get_conversation_counts200_response_types_from_dict = CoreMessageGetConversationCounts200ResponseTypes.from_dict(core_message_get_conversation_counts200_response_types_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


