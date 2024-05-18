# CoreUserSetUserPreferencesRequestPreferencesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the preference | [optional] 
**userid** | **int** | Id of the user to set the preference (default to current user) | [optional] [default to 0]
**value** | **str** | The value of the preference | [optional] 

## Example

```python
from openapi_client.models.core_user_set_user_preferences_request_preferences_inner import CoreUserSetUserPreferencesRequestPreferencesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserSetUserPreferencesRequestPreferencesInner from a JSON string
core_user_set_user_preferences_request_preferences_inner_instance = CoreUserSetUserPreferencesRequestPreferencesInner.from_json(json)
# print the JSON string representation of the object
print(CoreUserSetUserPreferencesRequestPreferencesInner.to_json())

# convert the object into a dict
core_user_set_user_preferences_request_preferences_inner_dict = core_user_set_user_preferences_request_preferences_inner_instance.to_dict()
# create an instance of CoreUserSetUserPreferencesRequestPreferencesInner from a dict
core_user_set_user_preferences_request_preferences_inner_from_dict = CoreUserSetUserPreferencesRequestPreferencesInner.from_dict(core_user_set_user_preferences_request_preferences_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


