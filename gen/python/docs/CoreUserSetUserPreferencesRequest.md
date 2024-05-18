# CoreUserSetUserPreferencesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**preferences** | [**List[CoreUserSetUserPreferencesRequestPreferencesInner]**](CoreUserSetUserPreferencesRequestPreferencesInner.md) |  | 

## Example

```python
from openapi_client.models.core_user_set_user_preferences_request import CoreUserSetUserPreferencesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserSetUserPreferencesRequest from a JSON string
core_user_set_user_preferences_request_instance = CoreUserSetUserPreferencesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreUserSetUserPreferencesRequest.to_json())

# convert the object into a dict
core_user_set_user_preferences_request_dict = core_user_set_user_preferences_request_instance.to_dict()
# create an instance of CoreUserSetUserPreferencesRequest from a dict
core_user_set_user_preferences_request_from_dict = CoreUserSetUserPreferencesRequest.from_dict(core_user_set_user_preferences_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


