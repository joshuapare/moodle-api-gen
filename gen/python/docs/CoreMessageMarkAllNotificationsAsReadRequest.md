# CoreMessageMarkAllNotificationsAsReadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timecreatedto** | **int** | mark messages created before this time as read, 0 for all messages | [optional] [default to 0]
**useridfrom** | **int** | the user id who send the message, 0 for any user. -10 or -20 for no-reply or support user | [optional] [default to 0]
**useridto** | **int** | the user id who received the message, 0 for any user | 

## Example

```python
from openapi_client.models.core_message_mark_all_notifications_as_read_request import CoreMessageMarkAllNotificationsAsReadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageMarkAllNotificationsAsReadRequest from a JSON string
core_message_mark_all_notifications_as_read_request_instance = CoreMessageMarkAllNotificationsAsReadRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageMarkAllNotificationsAsReadRequest.to_json())

# convert the object into a dict
core_message_mark_all_notifications_as_read_request_dict = core_message_mark_all_notifications_as_read_request_instance.to_dict()
# create an instance of CoreMessageMarkAllNotificationsAsReadRequest from a dict
core_message_mark_all_notifications_as_read_request_from_dict = CoreMessageMarkAllNotificationsAsReadRequest.from_dict(core_message_mark_all_notifications_as_read_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


