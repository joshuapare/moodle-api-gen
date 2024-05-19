# MessagePopupGetPopupNotificationsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit** | **int** | the number of results to return | [optional] [default to 0]
**newestfirst** | **bool** | true for ordering by newest first, false for oldest first | [optional] [default to True]
**offset** | **int** | offset the result set by a given amount | [optional] [default to 0]
**useridto** | **int** | the user id who received the message, 0 for current user | [default to null]

## Example

```python
from openapi_client.models.message_popup_get_popup_notifications_request import MessagePopupGetPopupNotificationsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of MessagePopupGetPopupNotificationsRequest from a JSON string
message_popup_get_popup_notifications_request_instance = MessagePopupGetPopupNotificationsRequest.from_json(json)
# print the JSON string representation of the object
print(MessagePopupGetPopupNotificationsRequest.to_json())

# convert the object into a dict
message_popup_get_popup_notifications_request_dict = message_popup_get_popup_notifications_request_instance.to_dict()
# create an instance of MessagePopupGetPopupNotificationsRequest from a dict
message_popup_get_popup_notifications_request_from_dict = MessagePopupGetPopupNotificationsRequest.from_dict(message_popup_get_popup_notifications_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


