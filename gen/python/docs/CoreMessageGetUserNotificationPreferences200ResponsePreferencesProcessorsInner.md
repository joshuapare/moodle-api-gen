# CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | Context id | [optional] 
**displayname** | **str** | Display name | [optional] 
**hassettings** | **bool** | Whether has settings | [optional] 
**name** | **str** | Processor name | [optional] 
**userconfigured** | **int** | Whether is configured by the user | [optional] 

## Example

```python
from openapi_client.models.core_message_get_user_notification_preferences200_response_preferences_processors_inner import CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner from a JSON string
core_message_get_user_notification_preferences200_response_preferences_processors_inner_instance = CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner.to_json())

# convert the object into a dict
core_message_get_user_notification_preferences200_response_preferences_processors_inner_dict = core_message_get_user_notification_preferences200_response_preferences_processors_inner_instance.to_dict()
# create an instance of CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner from a dict
core_message_get_user_notification_preferences200_response_preferences_processors_inner_from_dict = CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner.from_dict(core_message_get_user_notification_preferences200_response_preferences_processors_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


