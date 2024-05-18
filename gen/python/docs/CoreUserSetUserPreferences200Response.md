# CoreUserSetUserPreferences200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**saved** | [**List[CoreUserSetUserPreferences200ResponseSavedInner]**](CoreUserSetUserPreferences200ResponseSavedInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_user_set_user_preferences200_response import CoreUserSetUserPreferences200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserSetUserPreferences200Response from a JSON string
core_user_set_user_preferences200_response_instance = CoreUserSetUserPreferences200Response.from_json(json)
# print the JSON string representation of the object
print(CoreUserSetUserPreferences200Response.to_json())

# convert the object into a dict
core_user_set_user_preferences200_response_dict = core_user_set_user_preferences200_response_instance.to_dict()
# create an instance of CoreUserSetUserPreferences200Response from a dict
core_user_set_user_preferences200_response_from_dict = CoreUserSetUserPreferences200Response.from_dict(core_user_set_user_preferences200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


