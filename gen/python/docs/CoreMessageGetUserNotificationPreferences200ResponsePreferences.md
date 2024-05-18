# CoreMessageGetUserNotificationPreferences200ResponsePreferences


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**components** | [**List[CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner]**](CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner.md) |  | 
**disableall** | **int** | Whether all the preferences are disabled | 
**processors** | [**List[CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner]**](CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner.md) |  | 
**userid** | **int** | User id | 

## Example

```python
from openapi_client.models.core_message_get_user_notification_preferences200_response_preferences import CoreMessageGetUserNotificationPreferences200ResponsePreferences

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetUserNotificationPreferences200ResponsePreferences from a JSON string
core_message_get_user_notification_preferences200_response_preferences_instance = CoreMessageGetUserNotificationPreferences200ResponsePreferences.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetUserNotificationPreferences200ResponsePreferences.to_json())

# convert the object into a dict
core_message_get_user_notification_preferences200_response_preferences_dict = core_message_get_user_notification_preferences200_response_preferences_instance.to_dict()
# create an instance of CoreMessageGetUserNotificationPreferences200ResponsePreferences from a dict
core_message_get_user_notification_preferences200_response_preferences_from_dict = CoreMessageGetUserNotificationPreferences200ResponsePreferences.from_dict(core_message_get_user_notification_preferences200_response_preferences_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


