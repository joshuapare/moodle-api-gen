# CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayname** | **str** | Display name | [optional] 
**preferencekey** | **str** | Preference key | [optional] [default to 'null']
**processors** | [**List[CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner]**](CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_message_get_user_message_preferences200_response_preferences_components_inner_notifications_inner import CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner from a JSON string
core_message_get_user_message_preferences200_response_preferences_components_inner_notifications_inner_instance = CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner.to_json())

# convert the object into a dict
core_message_get_user_message_preferences200_response_preferences_components_inner_notifications_inner_dict = core_message_get_user_message_preferences200_response_preferences_components_inner_notifications_inner_instance.to_dict()
# create an instance of CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner from a dict
core_message_get_user_message_preferences200_response_preferences_components_inner_notifications_inner_from_dict = CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner.from_dict(core_message_get_user_message_preferences200_response_preferences_components_inner_notifications_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


