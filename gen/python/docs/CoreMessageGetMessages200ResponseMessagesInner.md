# CoreMessageGetMessages200ResponseMessagesInner

message

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | The component that generated the notification | [optional] [default to 'null']
**contexturl** | **str** | Context URL | [optional] [default to 'null']
**contexturlname** | **str** | Context URL link name | [optional] [default to 'null']
**customdata** | **str** | Custom data to be passed to the message processor.                                 The data here is serialised using json_encode(). | [optional] [default to 'null']
**eventtype** | **str** | The type of notification | [optional] [default to 'null']
**fullmessage** | **str** | The message | [optional] [default to 'null']
**fullmessageformat** | **int** | fullmessage format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**fullmessagehtml** | **str** | The message in html | [optional] [default to 'null']
**iconurl** | **str** | URL for icon, only for notifications. | [optional] [default to 'null']
**id** | **int** | Message id | [optional] 
**notification** | **int** | Is a notification? | [optional] [default to null]
**smallmessage** | **str** | The shorten message | [optional] [default to 'null']
**subject** | **str** | The message subject | [optional] [default to 'null']
**text** | **str** | The message text formated | [optional] [default to 'null']
**timecreated** | **int** | Time created | [optional] 
**timeread** | **int** | Time read | [optional] [default to null]
**userfromfullname** | **str** | User from full name | [optional] [default to 'null']
**useridfrom** | **int** | User from id | [optional] 
**useridto** | **int** | User to id | [optional] 
**usertofullname** | **str** | User to full name | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_message_get_messages200_response_messages_inner import CoreMessageGetMessages200ResponseMessagesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetMessages200ResponseMessagesInner from a JSON string
core_message_get_messages200_response_messages_inner_instance = CoreMessageGetMessages200ResponseMessagesInner.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetMessages200ResponseMessagesInner.to_json())

# convert the object into a dict
core_message_get_messages200_response_messages_inner_dict = core_message_get_messages200_response_messages_inner_instance.to_dict()
# create an instance of CoreMessageGetMessages200ResponseMessagesInner from a dict
core_message_get_messages200_response_messages_inner_from_dict = CoreMessageGetMessages200ResponseMessagesInner.from_dict(core_message_get_messages200_response_messages_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


