# CoreMessageGetUnreadNotificationCountRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**useridto** | **int** | user id who received the notification, 0 for any user | [default to null]

## Example

```python
from openapi_client.models.core_message_get_unread_notification_count_request import CoreMessageGetUnreadNotificationCountRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetUnreadNotificationCountRequest from a JSON string
core_message_get_unread_notification_count_request_instance = CoreMessageGetUnreadNotificationCountRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetUnreadNotificationCountRequest.to_json())

# convert the object into a dict
core_message_get_unread_notification_count_request_dict = core_message_get_unread_notification_count_request_instance.to_dict()
# create an instance of CoreMessageGetUnreadNotificationCountRequest from a dict
core_message_get_unread_notification_count_request_from_dict = CoreMessageGetUnreadNotificationCountRequest.from_dict(core_message_get_unread_notification_count_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


