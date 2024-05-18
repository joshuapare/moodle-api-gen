# CoreMessageMarkNotificationReadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notificationid** | **int** | id of the notification | [default to null]
**timeread** | **int** | timestamp for when the notification should be marked read | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_message_mark_notification_read_request import CoreMessageMarkNotificationReadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageMarkNotificationReadRequest from a JSON string
core_message_mark_notification_read_request_instance = CoreMessageMarkNotificationReadRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageMarkNotificationReadRequest.to_json())

# convert the object into a dict
core_message_mark_notification_read_request_dict = core_message_mark_notification_read_request_instance.to_dict()
# create an instance of CoreMessageMarkNotificationReadRequest from a dict
core_message_mark_notification_read_request_from_dict = CoreMessageMarkNotificationReadRequest.from_dict(core_message_mark_notification_read_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


