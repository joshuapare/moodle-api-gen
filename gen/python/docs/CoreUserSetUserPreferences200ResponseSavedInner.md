# CoreUserSetUserPreferences200ResponseSavedInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the preference | [optional] 
**userid** | **int** | The user the preference was set for | [optional] [default to null]

## Example

```python
from openapi_client.models.core_user_set_user_preferences200_response_saved_inner import CoreUserSetUserPreferences200ResponseSavedInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserSetUserPreferences200ResponseSavedInner from a JSON string
core_user_set_user_preferences200_response_saved_inner_instance = CoreUserSetUserPreferences200ResponseSavedInner.from_json(json)
# print the JSON string representation of the object
print(CoreUserSetUserPreferences200ResponseSavedInner.to_json())

# convert the object into a dict
core_user_set_user_preferences200_response_saved_inner_dict = core_user_set_user_preferences200_response_saved_inner_instance.to_dict()
# create an instance of CoreUserSetUserPreferences200ResponseSavedInner from a dict
core_user_set_user_preferences200_response_saved_inner_from_dict = CoreUserSetUserPreferences200ResponseSavedInner.from_dict(core_user_set_user_preferences200_response_saved_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


