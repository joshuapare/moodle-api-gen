# CoreUserGetUserPreferencesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | preference name, empty for all | [optional] [default to '']
**userid** | **int** | id of the user, default to current user | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_user_get_user_preferences_request import CoreUserGetUserPreferencesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserGetUserPreferencesRequest from a JSON string
core_user_get_user_preferences_request_instance = CoreUserGetUserPreferencesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreUserGetUserPreferencesRequest.to_json())

# convert the object into a dict
core_user_get_user_preferences_request_dict = core_user_get_user_preferences_request_instance.to_dict()
# create an instance of CoreUserGetUserPreferencesRequest from a dict
core_user_get_user_preferences_request_from_dict = CoreUserGetUserPreferencesRequest.from_dict(core_user_get_user_preferences_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


