# CoreMessageGetUserMessagePreferences200ResponsePreferences


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**components** | [**List[CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner]**](CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner.md) |  | 
**disableall** | **int** | Whether all the preferences are disabled | [default to null]
**processors** | [**List[CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner]**](CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner.md) |  | 
**userid** | **int** | User id | 

## Example

```python
from openapi_client.models.core_message_get_user_message_preferences200_response_preferences import CoreMessageGetUserMessagePreferences200ResponsePreferences

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetUserMessagePreferences200ResponsePreferences from a JSON string
core_message_get_user_message_preferences200_response_preferences_instance = CoreMessageGetUserMessagePreferences200ResponsePreferences.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetUserMessagePreferences200ResponsePreferences.to_json())

# convert the object into a dict
core_message_get_user_message_preferences200_response_preferences_dict = core_message_get_user_message_preferences200_response_preferences_instance.to_dict()
# create an instance of CoreMessageGetUserMessagePreferences200ResponsePreferences from a dict
core_message_get_user_message_preferences200_response_preferences_from_dict = CoreMessageGetUserMessagePreferences200ResponsePreferences.from_dict(core_message_get_user_message_preferences200_response_preferences_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


