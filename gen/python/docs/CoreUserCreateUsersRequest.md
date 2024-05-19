# CoreUserCreateUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**users** | [**List[CoreUserCreateUsersRequestUsersInner]**](CoreUserCreateUsersRequestUsersInner.md) |  | 

## Example

```python
from openapi_client.models.core_user_create_users_request import CoreUserCreateUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserCreateUsersRequest from a JSON string
core_user_create_users_request_instance = CoreUserCreateUsersRequest.from_json(json)
# print the JSON string representation of the object
print(CoreUserCreateUsersRequest.to_json())

# convert the object into a dict
core_user_create_users_request_dict = core_user_create_users_request_instance.to_dict()
# create an instance of CoreUserCreateUsersRequest from a dict
core_user_create_users_request_from_dict = CoreUserCreateUsersRequest.from_dict(core_user_create_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


