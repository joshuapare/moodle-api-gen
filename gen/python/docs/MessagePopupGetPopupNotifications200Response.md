# MessagePopupGetPopupNotifications200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notifications** | [**List[MessagePopupGetPopupNotifications200ResponseNotificationsInner]**](MessagePopupGetPopupNotifications200ResponseNotificationsInner.md) |  | 
**unreadcount** | **int** | the number of unread message for the given user | [default to null]

## Example

```python
from openapi_client.models.message_popup_get_popup_notifications200_response import MessagePopupGetPopupNotifications200Response

# TODO update the JSON string below
json = "{}"
# create an instance of MessagePopupGetPopupNotifications200Response from a JSON string
message_popup_get_popup_notifications200_response_instance = MessagePopupGetPopupNotifications200Response.from_json(json)
# print the JSON string representation of the object
print(MessagePopupGetPopupNotifications200Response.to_json())

# convert the object into a dict
message_popup_get_popup_notifications200_response_dict = message_popup_get_popup_notifications200_response_instance.to_dict()
# create an instance of MessagePopupGetPopupNotifications200Response from a dict
message_popup_get_popup_notifications200_response_from_dict = MessagePopupGetPopupNotifications200Response.from_dict(message_popup_get_popup_notifications200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


