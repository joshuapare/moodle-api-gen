# CoreUserUpdateUserPreferencesRequestPreferencesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The name of the preference | [optional] 
**value** | **str** | The value of the preference, do not set this field if you                                 want to remove (unset) the current value. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_user_update_user_preferences_request_preferences_inner import CoreUserUpdateUserPreferencesRequestPreferencesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserUpdateUserPreferencesRequestPreferencesInner from a JSON string
core_user_update_user_preferences_request_preferences_inner_instance = CoreUserUpdateUserPreferencesRequestPreferencesInner.from_json(json)
# print the JSON string representation of the object
print(CoreUserUpdateUserPreferencesRequestPreferencesInner.to_json())

# convert the object into a dict
core_user_update_user_preferences_request_preferences_inner_dict = core_user_update_user_preferences_request_preferences_inner_instance.to_dict()
# create an instance of CoreUserUpdateUserPreferencesRequestPreferencesInner from a dict
core_user_update_user_preferences_request_preferences_inner_from_dict = CoreUserUpdateUserPreferencesRequestPreferencesInner.from_dict(core_user_update_user_preferences_request_preferences_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


