# CoreUserGetUserPreferences200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**preferences** | [**List[CoreUserGetUserPreferences200ResponsePreferencesInner]**](CoreUserGetUserPreferences200ResponsePreferencesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_user_get_user_preferences200_response import CoreUserGetUserPreferences200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserGetUserPreferences200Response from a JSON string
core_user_get_user_preferences200_response_instance = CoreUserGetUserPreferences200Response.from_json(json)
# print the JSON string representation of the object
print(CoreUserGetUserPreferences200Response.to_json())

# convert the object into a dict
core_user_get_user_preferences200_response_dict = core_user_get_user_preferences200_response_instance.to_dict()
# create an instance of CoreUserGetUserPreferences200Response from a dict
core_user_get_user_preferences200_response_from_dict = CoreUserGetUserPreferences200Response.from_dict(core_user_get_user_preferences200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


