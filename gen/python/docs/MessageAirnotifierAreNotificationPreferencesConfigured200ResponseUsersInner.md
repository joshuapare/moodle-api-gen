# MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configured** | **int** | 1 if the user preferences have been configured and 0 if not | [optional] [default to null]
**userid** | **int** | userid id | [optional] [default to null]

## Example

```python
from openapi_client.models.message_airnotifier_are_notification_preferences_configured200_response_users_inner import MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner

# TODO update the JSON string below
json = "{}"
# create an instance of MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner from a JSON string
message_airnotifier_are_notification_preferences_configured200_response_users_inner_instance = MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner.from_json(json)
# print the JSON string representation of the object
print(MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner.to_json())

# convert the object into a dict
message_airnotifier_are_notification_preferences_configured200_response_users_inner_dict = message_airnotifier_are_notification_preferences_configured200_response_users_inner_instance.to_dict()
# create an instance of MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner from a dict
message_airnotifier_are_notification_preferences_configured200_response_users_inner_from_dict = MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner.from_dict(message_airnotifier_are_notification_preferences_configured200_response_users_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


