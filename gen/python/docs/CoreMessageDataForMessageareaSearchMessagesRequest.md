# CoreMessageDataForMessageareaSearchMessagesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limitfrom** | **int** | Limit from | [optional] [default to 0]
**limitnum** | **int** | Limit number | [optional] [default to 0]
**search** | **str** | The string being searched | [default to 'null']
**userid** | **int** | The id of the user who is performing the search | [default to null]

## Example

```python
from openapi_client.models.core_message_data_for_messagearea_search_messages_request import CoreMessageDataForMessageareaSearchMessagesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageDataForMessageareaSearchMessagesRequest from a JSON string
core_message_data_for_messagearea_search_messages_request_instance = CoreMessageDataForMessageareaSearchMessagesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageDataForMessageareaSearchMessagesRequest.to_json())

# convert the object into a dict
core_message_data_for_messagearea_search_messages_request_dict = core_message_data_for_messagearea_search_messages_request_instance.to_dict()
# create an instance of CoreMessageDataForMessageareaSearchMessagesRequest from a dict
core_message_data_for_messagearea_search_messages_request_from_dict = CoreMessageDataForMessageareaSearchMessagesRequest.from_dict(core_message_data_for_messagearea_search_messages_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


