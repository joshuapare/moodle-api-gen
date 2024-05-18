# CoreUserGetUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**criteria** | [**List[CoreUserGetUsersRequestCriteriaInner]**](CoreUserGetUsersRequestCriteriaInner.md) |  | 

## Example

```python
from openapi_client.models.core_user_get_users_request import CoreUserGetUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserGetUsersRequest from a JSON string
core_user_get_users_request_instance = CoreUserGetUsersRequest.from_json(json)
# print the JSON string representation of the object
print(CoreUserGetUsersRequest.to_json())

# convert the object into a dict
core_user_get_users_request_dict = core_user_get_users_request_instance.to_dict()
# create an instance of CoreUserGetUsersRequest from a dict
core_user_get_users_request_from_dict = CoreUserGetUsersRequest.from_dict(core_user_get_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


