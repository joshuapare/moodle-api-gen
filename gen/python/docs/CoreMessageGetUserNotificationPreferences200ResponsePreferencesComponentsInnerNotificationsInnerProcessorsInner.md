# CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayname** | **str** | Display name | [optional] 
**enabled** | **bool** | Is enabled? | [optional] 
**locked** | **bool** | Is locked by admin? | [optional] 
**lockedmessage** | **str** | Text to display if locked | [optional] 
**loggedin** | [**CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff**](CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff.md) |  | [optional] 
**loggedoff** | [**CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff**](CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff.md) |  | [optional] 
**name** | **str** | Processor name | [optional] 
**userconfigured** | **int** | Is configured? | [optional] 

## Example

```python
from openapi_client.models.core_message_get_user_notification_preferences200_response_preferences_components_inner_notifications_inner_processors_inner import CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner from a JSON string
core_message_get_user_notification_preferences200_response_preferences_components_inner_notifications_inner_processors_inner_instance = CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner.to_json())

# convert the object into a dict
core_message_get_user_notification_preferences200_response_preferences_components_inner_notifications_inner_processors_inner_dict = core_message_get_user_notification_preferences200_response_preferences_components_inner_notifications_inner_processors_inner_instance.to_dict()
# create an instance of CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner from a dict
core_message_get_user_notification_preferences200_response_preferences_components_inner_notifications_inner_processors_inner_from_dict = CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner.from_dict(core_message_get_user_notification_preferences200_response_preferences_components_inner_notifications_inner_processors_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


