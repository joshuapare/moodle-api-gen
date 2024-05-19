# CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayname** | **str** | Display name | [optional] [default to 'null']
**notifications** | [**List[CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner]**](CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_message_get_user_message_preferences200_response_preferences_components_inner import CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner from a JSON string
core_message_get_user_message_preferences200_response_preferences_components_inner_instance = CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner.to_json())

# convert the object into a dict
core_message_get_user_message_preferences200_response_preferences_components_inner_dict = core_message_get_user_message_preferences200_response_preferences_components_inner_instance.to_dict()
# create an instance of CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner from a dict
core_message_get_user_message_preferences200_response_preferences_components_inner_from_dict = CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner.from_dict(core_message_get_user_message_preferences200_response_preferences_components_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


