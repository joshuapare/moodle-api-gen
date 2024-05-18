# CoreUserViewUserProfileRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | id of the course, default site course | [optional] [default to 0]
**userid** | **int** | id of the user, 0 for current user | 

## Example

```python
from openapi_client.models.core_user_view_user_profile_request import CoreUserViewUserProfileRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserViewUserProfileRequest from a JSON string
core_user_view_user_profile_request_instance = CoreUserViewUserProfileRequest.from_json(json)
# print the JSON string representation of the object
print(CoreUserViewUserProfileRequest.to_json())

# convert the object into a dict
core_user_view_user_profile_request_dict = core_user_view_user_profile_request_instance.to_dict()
# create an instance of CoreUserViewUserProfileRequest from a dict
core_user_view_user_profile_request_from_dict = CoreUserViewUserProfileRequest.from_dict(core_user_view_user_profile_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


