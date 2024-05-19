# CoreUserUpdateUserPreferencesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emailstop** | **int** | Enable or disable notifications for this user | [optional] [default to null]
**preferences** | [**List[CoreUserUpdateUserPreferencesRequestPreferencesInner]**](CoreUserUpdateUserPreferencesRequestPreferencesInner.md) |  | [optional] 
**userid** | **int** | id of the user, default to current user | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_user_update_user_preferences_request import CoreUserUpdateUserPreferencesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserUpdateUserPreferencesRequest from a JSON string
core_user_update_user_preferences_request_instance = CoreUserUpdateUserPreferencesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreUserUpdateUserPreferencesRequest.to_json())

# convert the object into a dict
core_user_update_user_preferences_request_dict = core_user_update_user_preferences_request_instance.to_dict()
# create an instance of CoreUserUpdateUserPreferencesRequest from a dict
core_user_update_user_preferences_request_from_dict = CoreUserUpdateUserPreferencesRequest.from_dict(core_user_update_user_preferences_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


