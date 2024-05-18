# CoreUserUpdateUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**users** | [**List[CoreUserUpdateUsersRequestUsersInner]**](CoreUserUpdateUsersRequestUsersInner.md) |  | 

## Example

```python
from openapi_client.models.core_user_update_users_request import CoreUserUpdateUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserUpdateUsersRequest from a JSON string
core_user_update_users_request_instance = CoreUserUpdateUsersRequest.from_json(json)
# print the JSON string representation of the object
print(CoreUserUpdateUsersRequest.to_json())

# convert the object into a dict
core_user_update_users_request_dict = core_user_update_users_request_instance.to_dict()
# create an instance of CoreUserUpdateUsersRequest from a dict
core_user_update_users_request_from_dict = CoreUserUpdateUsersRequest.from_dict(core_user_update_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


