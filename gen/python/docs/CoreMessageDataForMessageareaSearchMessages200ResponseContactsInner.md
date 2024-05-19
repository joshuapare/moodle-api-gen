# CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversationid** | **int** | The id of the conversation | [optional] [default to null]
**fullname** | **str** | The user&#39;s name | [optional] [default to 'null']
**isblocked** | **bool** | If the user has been blocked | [optional] [default to False]
**ismessaging** | **bool** | If we are messaging the user | [optional] [default to False]
**isonline** | **bool** | The user&#39;s online status | [optional] [default to False]
**isread** | **bool** | If the user has read the message | [optional] [default to False]
**lastmessage** | **str** | The user&#39;s last message | [optional] [default to 'null']
**lastmessagedate** | **int** | Timestamp for last message | [optional] [default to null]
**messageid** | **int** | The unique search message id | [optional] [default to null]
**profileimageurl** | **str** | User picture URL | [optional] [default to 'null']
**profileimageurlsmall** | **str** | Small user picture URL | [optional] [default to 'null']
**sentfromcurrentuser** | **bool** | Was the last message sent from the current user? | [optional] [default to False]
**showonlinestatus** | **bool** | Show the user&#39;s online status? | [optional] [default to False]
**unreadcount** | **int** | The number of unread messages in this conversation | [optional] [default to null]
**userid** | **int** | The user&#39;s id | [optional] [default to null]

## Example

```python
from openapi_client.models.core_message_data_for_messagearea_search_messages200_response_contacts_inner import CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner from a JSON string
core_message_data_for_messagearea_search_messages200_response_contacts_inner_instance = CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner.from_json(json)
# print the JSON string representation of the object
print(CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner.to_json())

# convert the object into a dict
core_message_data_for_messagearea_search_messages200_response_contacts_inner_dict = core_message_data_for_messagearea_search_messages200_response_contacts_inner_instance.to_dict()
# create an instance of CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner from a dict
core_message_data_for_messagearea_search_messages200_response_contacts_inner_from_dict = CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner.from_dict(core_message_data_for_messagearea_search_messages200_response_contacts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


