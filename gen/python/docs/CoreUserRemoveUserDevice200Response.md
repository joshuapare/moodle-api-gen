# CoreUserRemoveUserDevice200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**removed** | **bool** | True if removed, false if not removed because it doesn&#39;t exists | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_user_remove_user_device200_response import CoreUserRemoveUserDevice200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserRemoveUserDevice200Response from a JSON string
core_user_remove_user_device200_response_instance = CoreUserRemoveUserDevice200Response.from_json(json)
# print the JSON string representation of the object
print(CoreUserRemoveUserDevice200Response.to_json())

# convert the object into a dict
core_user_remove_user_device200_response_dict = core_user_remove_user_device200_response_instance.to_dict()
# create an instance of CoreUserRemoveUserDevice200Response from a dict
core_user_remove_user_device200_response_from_dict = CoreUserRemoveUserDevice200Response.from_dict(core_user_remove_user_device200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


