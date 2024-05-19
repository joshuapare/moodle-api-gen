# MessagePopupGetPopupNotifications200ResponseNotificationsInner

message

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | The component that generated the notification | [optional] 
**contexturl** | **str** | Context URL | [optional] 
**contexturlname** | **str** | Context URL link name | [optional] 
**customdata** | **str** | Custom data to be passed to the message processor.                                 The data here is serialised using json_encode(). | [optional] 
**deleted** | **bool** | notification deletion status | [optional] [default to False]
**eventtype** | **str** | The type of notification | [optional] 
**fullmessage** | **str** | The message | [optional] 
**fullmessageformat** | **int** | fullmessage format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**fullmessagehtml** | **str** | The message in html | [optional] 
**iconurl** | **str** | URL for notification icon | [optional] [default to 'null']
**id** | **int** | Notification id (this is not guaranteed to be unique                                 within this result set) | [optional] [default to null]
**read** | **bool** | notification read status | [optional] [default to False]
**shortenedsubject** | **str** | The notification subject shortened                                 with ellipsis | [optional] [default to 'null']
**smallmessage** | **str** | The shorten message | [optional] 
**subject** | **str** | The notification subject | [optional] [default to 'null']
**text** | **str** | The message text formated | [optional] 
**timecreated** | **int** | Time created | [optional] 
**timecreatedpretty** | **str** | Time created in a pretty format | [optional] [default to 'null']
**timeread** | **int** | Time read | [optional] 
**useridfrom** | **int** | User from id | [optional] 
**useridto** | **int** | User to id | [optional] 

## Example

```python
from openapi_client.models.message_popup_get_popup_notifications200_response_notifications_inner import MessagePopupGetPopupNotifications200ResponseNotificationsInner

# TODO update the JSON string below
json = "{}"
# create an instance of MessagePopupGetPopupNotifications200ResponseNotificationsInner from a JSON string
message_popup_get_popup_notifications200_response_notifications_inner_instance = MessagePopupGetPopupNotifications200ResponseNotificationsInner.from_json(json)
# print the JSON string representation of the object
print(MessagePopupGetPopupNotifications200ResponseNotificationsInner.to_json())

# convert the object into a dict
message_popup_get_popup_notifications200_response_notifications_inner_dict = message_popup_get_popup_notifications200_response_notifications_inner_instance.to_dict()
# create an instance of MessagePopupGetPopupNotifications200ResponseNotificationsInner from a dict
message_popup_get_popup_notifications200_response_notifications_inner_from_dict = MessagePopupGetPopupNotifications200ResponseNotificationsInner.from_dict(message_popup_get_popup_notifications200_response_notifications_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


